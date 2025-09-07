package de.oliver.fancysitula.api.dialogs.body;


import org.intellij.lang.annotations.Subst;

public class FS_DialogClickEvent implements FS_DialogBody {

    private String action;
    private Payload payload;

    public FS_DialogClickEvent(String action, Payload payload) {

        this.action = action;
        this.payload = payload;
    }

    public String getAction() {
        return action;
    }
    public void setAction(String action) {
        this.action = action;
    }
    public Payload getPayload() {
        return payload;
    }
    public void setPayload(Payload payload) {
        this.payload = payload;
    }

    public static class Payload {
            private Key key;
            private NBT nbt;
            public Payload(Key key, NBT nbt) {
                this.key = key;
                this.nbt = nbt;
            }
            public Key getKey() {
                return key;
            }
            public void setKey(Key key) {
                this.key = key;
            }
            public NBT getNbt() {
                return nbt;
            }
            public void setNbt(NBT nbt) {
                this.nbt = nbt;
            }
            public static class Key {
                private String namespace;
                private String value;
                public Key(String namespace, String value) {
                    this.namespace = namespace;
                    this.value = value;
                }
                @Subst("")
                public String getNamespace() {
                    return namespace;
                }
                public void setNamespace(String namespace) {
                    this.namespace = namespace;
                }
                public String getValue() {
                    return value;
                }
                public void setValue(String value) {
                    this.value = value;
                }
            }
            public static class NBT {
                private String string;
                public NBT(String string) {
                    this.string = string;
                }
                public String getString() {
                    return string;
                }
                public void setString(String string) {
                    this.string = string;
                }
            }
    }
}
