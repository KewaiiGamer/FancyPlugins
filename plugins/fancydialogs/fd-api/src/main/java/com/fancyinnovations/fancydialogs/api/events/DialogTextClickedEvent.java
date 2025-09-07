package com.fancyinnovations.fancydialogs.api.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class DialogTextClickedEvent extends Event {

    private static final HandlerList handlerList = new HandlerList();

    private final Player player;
    private final String dialogId;
    private final String textId;
    private final String id;

    public DialogTextClickedEvent(@NotNull Player player, @NotNull String dialogId, @NotNull String textId, @NotNull String id) {
        super(!Bukkit.isPrimaryThread());
        this.player = player;
        this.dialogId = dialogId;
        this.textId = textId;
        this.id = id;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

    public Player getPlayer() {
        return player;
    }

    public String getDialogId() {
        return dialogId;
    }

    public String getTextId() {
        return textId;
    }
    public String getId() {
        return id;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
