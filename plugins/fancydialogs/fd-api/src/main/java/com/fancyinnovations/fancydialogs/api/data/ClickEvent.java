package com.fancyinnovations.fancydialogs.api.data;

public class ClickEvent {
    private String action;
    private String id;
    public ClickEvent(String action, String id) {
        this.action = action;
        this.id = id;
    }
    public String getAction() {
        return action;
    }
    public String getId() {
        return id;
    }
}
