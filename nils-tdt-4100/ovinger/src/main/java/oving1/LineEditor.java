package oving1;

public class LineEditor {
    private int posisjon;
    private String setning;

    public LineEditor(String setningInput) {
        setning = setningInput;
    }

    public static void main(String[] args) {
        LineEditor LE = new LineEditor("setning123");
        System.out.println(LE.getSetning());
        System.out.println(LE.getPosisjon());
        LE.right();
        LE.right();
        LE.insertString(" HELLO ");
        // System.out.println(LE.getSetning());
        LE.deleteLeft();
        System.out.println(LE.getSetning());
        System.out.println(LE.toString());
        LE.deleteRight();
        System.out.println(LE.getSetning());
        // System.out.println(LE.getPosisjon()+LE.getSetning());
    }

    public void right() {
        if (this.posisjon + 1 > this.setning.length()) {
            System.err.println("Not possible to move here");
        } else {
            this.posisjon++;
        }
    }

    public void left() {
        if (this.posisjon - 1 < 0) {
            System.err.println("Not possible to move here");
        } else {
            this.posisjon--;
        }
    }

    public void insertString(String s) {
        if (this.setning.length() == this.posisjon) {
            this.setning += s;
            this.posisjon = this.setning.length();
        } else {
            this.setning = this.setning.substring(0, posisjon) + s
                    + this.setning.substring(posisjon, this.setning.length());
            this.posisjon += s.length();
        }
    }

    public void deleteLeft() {
        if (this.posisjon == 0) {
            System.err.println("Kan ikke slette til venstre når posisjon er 0");
        } else {
            this.setning = this.setning.substring(0, this.posisjon - 1)
                    + this.setning.substring(this.posisjon, this.setning.length());
            this.posisjon--;
        }
    }

    public void deleteRight() {
        if (this.posisjon == this.setning.length()) {
            System.err.println("Kan ikke slette til høyre når vi er helt til høyre");
        } else {
            this.setning = this.setning.substring(0, this.posisjon)
                    + this.setning.substring(this.posisjon + 1, this.setning.length());
        }
    }

    public String toString() {
        return this.setning.substring(0, this.posisjon) + "|"
                + this.setning.substring(this.posisjon, this.setning.length());
    }

    // getters
    public String getSetning() {
        return setning;
    }

    public int getPosisjon() {
        return posisjon;
    }

    // setters
    public void setSetning(String nySetning) {
        this.setning = nySetning;
    }

    public void setPosisjon(int nyPosisjon) {
        this.posisjon = nyPosisjon;
    }

}
