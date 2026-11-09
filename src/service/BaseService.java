package service;

import java.math.BigInteger;
import constant.Base;
import dto.BaseDTO;
import model.BaseNumber;
import repository.BaseRepository;

// Tang xu ly nghiep vu: khoi tao repo, luu so goc, thuc hien chuyen doi
public class BaseService {
    private BaseRepository baseRepository;

    // Nhan DTO tu Controller, tu tao BaseNumber va luu vao Repository
    public BaseService(BaseDTO dto) {
        this.baseRepository = new BaseRepository();
        baseRepository.save(new BaseNumber(dto.getBase(), dto.getPresentation()));
    }

    // Chuyen so goc sang thap phan (Base 10)
    public String convertToDec(Base targetBase) throws Exception {
        BaseNumber originalNumber = baseRepository.get();
        BigInteger decNum = BigInteger.ZERO;
        BigInteger baseValue = BigInteger.valueOf(originalNumber.getBase().getValue());
        BigInteger power = BigInteger.ONE;
        String numberStr = originalNumber.getPresentation();

        // Duyet tung chu so tu phai sang trai, tinh gia tri theo vi tri
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            char digit = numberStr.charAt(i);
            BigInteger digitValue = BigInteger.valueOf(Character.getNumericValue(digit));
            // Nhan chu so voi luy thua vi tri roi cong vao tong
            decNum = decNum.add(digitValue.multiply(power));
            // Tang luy thua cho vi tri tiep theo
            power = power.multiply(baseValue);
        }
        
        // Tra ve chuoi hien thi thay vi basename
        return decNum.toString();
    }

    // Chuyen so goc sang he dich bat ky (ngoai thap phan) 
    public String convertDecOut(Base targetBase) throws Exception {
        // Goi ham convertToDec tra ve chuoi truc tiep
        BigInteger decNum = new BigInteger(this.convertToDec(Base.DEC));
        StringBuilder reverseResult = new StringBuilder();
        BigInteger baseTarget = BigInteger.valueOf(targetBase.getValue());

        // Chia lay du lien tuc cho den khi gia tri bang 0
        while (decNum.compareTo(BigInteger.ZERO) != 0) {
            int remainNum = decNum.mod(baseTarget).intValue();
            decNum = decNum.divide(baseTarget);
            // Neu du >= 10 thi doi sang chu cai A-F (cho he 16)
            if (remainNum >= 10) {
                reverseResult.insert(0, (char) ('A' + (remainNum - 10)));
            } else {
                reverseResult.insert(0, remainNum);
            }
        }

        // Xu ly truong hop so dau vao la 0
        if (reverseResult.length() == 0) {
            reverseResult.append("0");
        }

        // Tra ve chuoi ket qua cuoi cung
        return reverseResult.toString();
    }
}