
package dto;


public class ResponseDTO {

    private String header;
    private String body;
    private String message;

    // Getters and Setters
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMess() {
        return message;
    }

    public void setMess(String newMessage) {
        this.message = newMessage;
    }
}
