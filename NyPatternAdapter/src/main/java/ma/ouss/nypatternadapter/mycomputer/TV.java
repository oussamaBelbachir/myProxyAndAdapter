package ma.ouss.nypatternadapter.mycomputer;
public class TV implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("************ HDMI ************");
        String mesg = new String(data);
        System.out.println(mesg);
    }
}
