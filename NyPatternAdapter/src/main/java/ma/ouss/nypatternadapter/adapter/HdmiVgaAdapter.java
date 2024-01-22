package ma.ouss.nypatternadapter.adapter;

import ma.ouss.nypatternadapter.mycomputer.Hdmi;
import ma.ouss.nypatternadapter.mycomputer.Vga;

public class HdmiVgaAdapter implements Vga {
    private Hdmi hdmi;
    @Override
    public void print(String mesg) {
        System.out.println("=========== Adapter =========");
        byte[] data = mesg.getBytes();
        hdmi.view(data);
    }
    public void setHdmi(Hdmi hdmi){
        this.hdmi = hdmi;
    }
}
