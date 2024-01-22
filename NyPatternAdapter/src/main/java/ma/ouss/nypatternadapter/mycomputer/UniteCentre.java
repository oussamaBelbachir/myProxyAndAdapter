package ma.ouss.nypatternadapter.mycomputer;
public class UniteCentre implements Vga {
    private Vga vga;
    public void print(String mesg){
        System.out.println("***************UniteCentral****************");
        vga.print(mesg);
    }
    public void setVga(Vga vga){
        this.vga=vga;
    }
}
