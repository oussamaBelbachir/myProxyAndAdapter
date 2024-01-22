package ma.ouss.nypatternadapter.adapter;

import ma.ouss.nypatternadapter.mycomputer.TV;
import ma.ouss.nypatternadapter.mycomputer.Vga;

public class HdmiVgaAdapterH extends TV implements Vga{
    @Override
    public void print(String mesg) {
        System.out.println("=========== Adapter =========");
        byte[] data = mesg.getBytes();
        super.view(data);
    }

}
