package com.fancyinnovations.fancydialogs.api.data;



import javax.annotation.Nullable;

public class DialogBodyData {
    private String text;
    private ItemStack item;
    private ClickEvent clickEvent;
    private @Nullable boolean showDecorations;
    private @Nullable boolean showTooltip;
    private @Nullable int width;
    private @Nullable int height;
    public DialogBodyData(String text, ItemStack item, ClickEvent clickEvent) {
        this.text = text;
        this.item = item;
        this.clickEvent = clickEvent;
    }
    public DialogBodyData(String text, ClickEvent clickEvent) {
        this.text = text;
        this.clickEvent = clickEvent;
    }
    public DialogBodyData(String text, ItemStack item, ClickEvent clickEvent, boolean showDecorations, boolean showTooltip, int width, int height) {
        this.text = text;
        this.clickEvent = clickEvent;
        this.showDecorations = showDecorations;
        this.showTooltip = showTooltip;
        this.width = width;
        this.height = height;
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
    public ItemStack getItem() {
        return item;
    }
    public static class ItemStack {
        private String material;
        private String amount;
        public ItemStack(String material, String amount) {
            this.material = material;
            this.amount = amount;
        }
        public String getMaterial() {
            return material;
        }
        public String getAmount() {
            return amount;
        }
    }

    public void setItem(ItemStack item) {
        this.item = item;
    }

    public boolean isShowDecorations() {
        return showDecorations;
    }

    public void setShowDecorations(boolean showDecorations) {
        this.showDecorations = showDecorations;
    }

    public boolean isShowTooltip() {
        return showTooltip;
    }

    public void setShowTooltip(boolean showTooltip) {
        this.showTooltip = showTooltip;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
