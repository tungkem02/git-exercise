package utils;

import constant.Message;
// Lop tien ich chua cac ham kiem tra (validate) du lieu nguoi dung nhap
public class Validation {

    private Validation() {
    }

    // Kiem tra chuoi nhap co phai la so nguyen va nam trong khoang [min, max]
    public static int getInt(String input, int min, int max) throws Exception {
        try {
            int check = Integer.parseInt(input);
            //kiem tra so co nam trong khoang gia tri khong
            if (check >= min && check <= max) {
                return check;
            } else {
                //in ra thong bao loi
                throw new Exception(String.format(Message.INTERGER_NUMBER_RANGE_ERROR, min, max));
            }
        } catch (NumberFormatException e) {
            //in ra thong bao loi
            throw new Exception(Message.ERROR_INVALID_GENERAL);
        }
    }

    // Kiem tra chuoi nhap co khop voi mau REGEX cua he co so tuong ung khong
    public static String getString(String input, final String REGEX) throws Exception {
        // Dieu kien: chuoi hop le neu khop voi regex, nguoc lai bao loi
        if (input.matches(REGEX)) {
            return input;
        }
        throw new Exception(Message.ERROR_INVALID_GENERAL);
    }
}
