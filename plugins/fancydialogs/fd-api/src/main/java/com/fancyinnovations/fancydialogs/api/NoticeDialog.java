package com.fancyinnovations.fancydialogs.api;

import com.fancyinnovations.fancydialogs.api.data.ClickEvent;
import com.fancyinnovations.fancydialogs.api.data.DialogBodyData;
import com.fancyinnovations.fancydialogs.api.data.DialogData;
import com.fancyinnovations.fancydialogs.api.data.inputs.DialogInputs;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.UUID;

public class NoticeDialog {

    private final String title;
    private final String text;
    private final ClickEvent clickEvent;

    private final DialogData dialogData;

    public NoticeDialog(String title, String text, ClickEvent clickEvent) {
        this.title = title;
        this.text = text;
        this.clickEvent = clickEvent;

        this.dialogData = new DialogData(
                "notice_dialog_" + UUID.randomUUID(),
                this.title,
                true,
                List.of(
                        new DialogBodyData(this.text, this.clickEvent)
                ),
                DialogInputs.EMPTY,
                List.of()
        );
    }

    public NoticeDialog(String text, ClickEvent clickEvent) {
        this("Notice", text, clickEvent);
    }

    public static void show(Player player, String text, ClickEvent clickEvent) {
        new NoticeDialog(text, clickEvent).show(player);
    }

    public void show(Player player) {
        FancyDialogs.get()
                .createDialog(dialogData)
                .open(player);
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
