package com.fancyinnovations.fancydialogs.api.data;


public class DialogBodyData {
    private String text;
    private ClickEvent clickEvent;
    public DialogBodyData(String text, ClickEvent clickEvent) {
        this.text = text;
        this.clickEvent = clickEvent;
    }
    public String getText() {
        return text;
    }
    public ClickEvent getClickEvent() {
        return clickEvent;
    }
    public void setClickEvent(ClickEvent clickEvent) {
        this.clickEvent = clickEvent;
    }
    public void setText(String text) {
        this.text = text;
    }
}
