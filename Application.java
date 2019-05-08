public class Application extends Content {
    private String OSRequire;

    public Application(String inputid, String inputname, double inputprice, String inputOS) {
        super(inputid, inputname, inputprice);
        OSRequire = inputOS;
    }

    public Application(String inputid, String inputname, String inputOS) {
        super(inputid, inputname, 0);
        OSRequire = inputOS;
    }

    public String getOSRequire() {
        return OSRequire;
    }
}