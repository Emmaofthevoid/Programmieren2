package atCampus02.zam.ss2022.Vererbung.Instrumente;

public class Instrument {
    protected int lautstaerke;
    protected String name;

    public Instrument(int lautstaerke, String name) {
        this.lautstaerke = lautstaerke;
        this.name = name;

    }

    public int play() {
        System.out.println(name + "ist " + lautstaerke + " laut ");
        return lautstaerke;
    }

    public int getLautstaerke() {
        return lautstaerke;
    }

    public void setLautstaerke(int lautstaerke) {
        this.lautstaerke = lautstaerke;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
