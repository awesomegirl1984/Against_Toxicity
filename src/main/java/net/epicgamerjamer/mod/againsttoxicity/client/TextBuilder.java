package net.epicgamerjamer.mod.againsttoxicity.client;

public class TextBuilder {
    private final String name;
    private final String response;
    private final boolean priv;

    public TextBuilder(String n, int l, boolean p) {
        name = n;
        priv = p;
        if (l == 1) {
            response = new Lists().getAntiToxicList()[(int) (Math.random() * (new Lists().getAntiToxicList().length))];
        } else if (l == 2) {
            response = new Lists().getAntiSlurList()[(int) (Math.random() * (new Lists().getAntiSlurList().length))];
        } else {
            response = null;
        }
    }

    public String toString() {
        if (priv) {
            return("msg " + name + " " + name + response);
        }
        else {
            return (name + response);
        }
    }
}