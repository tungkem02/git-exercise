package model;

import constant.Base;

// Model dai dien cho mot so kem theo he co so cua no
public class BaseNumber {

    private Base base;
    private String presentation;

    // Khoi tao so voi he co so va chuoi bieu dien tuong ung
    public BaseNumber(Base initialBase, String initialResentation) {
        this.base = initialBase;
        this.presentation = initialResentation;
    }

    public Base getBase() {
        return base;
    }

    public void setBase(Base base) {
        this.base = base;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

}
