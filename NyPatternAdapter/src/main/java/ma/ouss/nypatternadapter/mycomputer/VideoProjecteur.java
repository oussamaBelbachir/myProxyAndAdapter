package ma.ouss.nypatternadapter.mycomputer;
public class VideoProjecteur implements Vga{
    @Override
    public void print(String mesg) {
        System.out.println("*****************VP***************");
        System.out.println(mesg);
    }
}
