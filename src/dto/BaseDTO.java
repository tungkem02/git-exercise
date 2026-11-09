
package dto;

import constant.Base;


// DTO chua du lieu dau vao: he co so, chuoi so va he dich muon chuyen toi
public class BaseDTO {

    private Base sourceBase;
    private String presentation;
    private Base targetBase;

    public Base getBase() {
        return sourceBase;
    }

    public void setBase(Base newBase) {
        this.sourceBase = newBase;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String newPresentation) {
        this.presentation = newPresentation;
    }

    public Base getTargetBase() {
        return targetBase;
    }

    public void setTargetBase(Base newTargetBase) {
        this.targetBase = newTargetBase;
    }

}
