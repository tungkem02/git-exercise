
package view;

import dto.ResponseDTO;


public class BaseView {
    private ResponseDTO responseDTO;

    // Khoi tao san mot ResponseDTO rong de tranh NullPointerException
    public BaseView() {
        responseDTO = new ResponseDTO();
    }

    // phuong thuc de controller day du lieu vao view
    public void setResponseDTO(ResponseDTO newResponseDTO) {
        this.responseDTO = newResponseDTO;
    }
    
    

    // Hien thi thong bao (ket qua thanh cong hoac loi) ra man hinh
    public void displayMessages() {
        // Dieu kien: chi in ra khi responseDTO da duoc gan du lieu
        if (responseDTO != null) {
            System.out.println(responseDTO.getMess());
        }
    }
}
