package de.oliver.fancysitula.api.dialogs.body;

import org.jetbrains.annotations.Nullable;

public class FS_DialogItemBody implements FS_DialogBody {

    private ItemStack item;
    private @Nullable FS_DialogTextBody description;
    private boolean showDecorations;
    private boolean showTooltip;
    private int width;
    private int height;

    public FS_DialogItemBody(ItemStack item, @Nullable FS_DialogTextBody description, boolean showDecorations, boolean showTooltip, int width, int height) {
        this.item = item;
        this.description = description;
        this.showDecorations = showDecorations;
        this.showTooltip = showTooltip;
        this.width = width;
        this.height = height;
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

    public @Nullable FS_DialogTextBody getDescription() {
        return description;
    }

    public void setDescription(@Nullable FS_DialogTextBody description) {
        this.description = description;
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
