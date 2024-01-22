package ma.ouss.nypatternadapter;

import ma.ouss.nypatternadapter.adapter.*;
import ma.ouss.nypatternadapter.mycomputer.*;


public class Test {
    public static void main(String[] args) {
        UniteCentre uniteCentre = new UniteCentre();

        uniteCentre.setVga(new Ecran());
        uniteCentre.print("Test");

        uniteCentre.setVga(new VideoProjecteur());
        uniteCentre.print("Test");

        HdmiVgaAdapter hdmiVgaAdapter = new HdmiVgaAdapter();
        hdmiVgaAdapter.setHdmi(new TV());
        uniteCentre.setVga(hdmiVgaAdapter);
        uniteCentre.print("Test Test");

        HdmiVgaAdapterH hdmiVgaAdapterH = new HdmiVgaAdapterH();
        uniteCentre.setVga(hdmiVgaAdapterH);
        uniteCentre.print("Test Heritage");

        uniteCentre.setVga(new SuperVP());
        uniteCentre.print("Thanks you");

        HdmiVgaAdapter hdmiVgaAdapter1 = new HdmiVgaAdapter();
        hdmiVgaAdapter1.setHdmi(new SuperVP());
        uniteCentre.setVga(hdmiVgaAdapter1);
        uniteCentre.print("ok");
    }
}
