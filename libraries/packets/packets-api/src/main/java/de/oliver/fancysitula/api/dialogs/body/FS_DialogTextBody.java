package de.oliver.fancysitula.api.dialogs.body;

import de.oliver.fancysitula.api.dialogs.actions.FS_DialogCustomAction;
import net.kyori.adventure.text.event.ClickEvent;

public class FS_DialogTextBody implements FS_DialogBody {

    private String text;
    private FS_DialogCustomAction clickEvent;
    private int width;

    public FS_DialogTextBody(String text, FS_DialogCustomAction clickEvent, int width) {
        this.text = text;
        this.clickEvent = clickEvent;
        this.width = width;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public FS_DialogCustomAction getClickEvent() {
        return clickEvent;
    }
    public void setClickEvent(FS_DialogCustomAction clickEvent) {
        this.clickEvent = clickEvent;
    }
}
