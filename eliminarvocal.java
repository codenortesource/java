package codenorte;

public class java_eliminavocales {

    private String p;

    public java_eliminavocales() {
    }

    public java_eliminavocales(String p) {
        this.setP(p);
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String tamanio() {
        int x = this.p.length();
        String res = "";
        int i;

        for (i = 0; i < p.length(); i++) {
            if (!String.valueOf(this.p.charAt(i)).equals("a")
                    && !String.valueOf(this.p.charAt(i)).equals("e")
                    && !String.valueOf(this.p.charAt(i)).equals("i")
                    && !String.valueOf(this.p.charAt(i)).equals("o")
                    && !String.valueOf(this.p.charAt(i)).equals("u")) {
                res = res + this.p.charAt(i);
            }
        }

        return " " + res;
    }

    public static void main(String[] arg) {
        String k = "como es la nota";
        String f = k.toLowerCase();

        java_eliminavocales x = new java_eliminavocales(f);
        System.out.println(x.tamanio());
    }
}

