package controller;

import constant.Base;
import constant.Message;
import dto.BaseDTO;
import dto.ResponseDTO;
import service.BaseService;
import view.BaseView;

public class Controller {

    private BaseService baseService;
    private BaseView baseView;
    private BaseDTO baseDto;

    // Khoi tao View de chuan bi hien thi ket qua ra man hinh
    public Controller() {
        this.baseView = new BaseView();
    }

    // Nhan DTO da duoc validate tu Main truyen vao
    public void setDto(BaseDTO dto) {
        this.baseDto = dto;
    }

    // Ham chinh: dieu phoi Service chuyen doi so va day ket qua/loi sang View
    public void convertNumber() {
        ResponseDTO response = new ResponseDTO();
        baseView.setResponseDTO(response);

        try {
            baseService = new BaseService(baseDto);
            String resultPresentation;

            // Dieu kien: neu he dich la thap phan thi dung ham chuyen doi rieng
            if (baseDto.getTargetBase() == Base.DEC) {
                resultPresentation = baseService.convertToDec(Base.DEC);
            } else {
                // Nguoc lai (he dich khac thap phan) dung ham chuyen doi chung
                resultPresentation = baseService.convertDecOut(baseDto.getTargetBase());
            }

            // Dat ket qua thanh cong vao response roi day sang View
            response.setMess(String.format(Message.CONVERT_SUCCESS, resultPresentation));
            baseView.displayMessages();

        } catch (Exception e) {
            // Bat loi trong qua trinh chuyen doi va day thong bao loi sang View
            response.setMess(e.getMessage());
            baseView.displayMessages();
        }
    }
}