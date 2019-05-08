public class Magazine extends Publication {
    private int volume;

    //not free
    public Magazine(String inputid, String inputname, double inputprice, String inputpublisher, int inputnumpage, int inputvolume) {
        super(inputid, inputname, inputprice, inputpublisher, inputnumpage);
        volume = inputvolume;
    }

    //free
    public Magazine(String inputid, String inputname, String inputpublisher, int inputnumpage, int inputvolume) {
        super(inputid, inputname, 0, inputpublisher, inputnumpage);
        volume = inputvolume;
    }

    public int getVolume() {
        return volume;
    }

}