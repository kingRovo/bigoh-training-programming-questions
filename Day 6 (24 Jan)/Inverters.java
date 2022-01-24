class LuminousInverter {

    int current = 0;
    int operating_Voltage = 0;
    long prize;
    String InverterName;

    LuminousInverter() {
        
    }

    LuminousInverter(int current, int operating_Voltage, int prize, String InverterName) {

        this.current = current;
        this.operating_Voltage = operating_Voltage;
        this.prize = prize;
        this.InverterName = InverterName;

    }

    int getPowerRating() {

        return current * operating_Voltage;
    }

}

class Zelio extends LuminousInverter {

    int BatteryCapacity_Ah;
    String Invertertype;

    Zelio(int current, int volt, int prize, String InverterName, String invertertype, int batteryCapacity_Ah) {

        super(current, volt, prize, InverterName);
        this.Invertertype = invertertype;
        this.BatteryCapacity_Ah = batteryCapacity_Ah;

    }

    void getinfo() {

        System.out.println(" --- Inverters Details  --- ");

        System.out.println("Name  :  " + InverterName);
        System.out.println("Type   :  " + Invertertype);
        System.out.println("Prize : "+prize);

        System.out.println("Battery Capacity: "+BatteryCapacity_Ah);
        System.out.println("Voltage : "+operating_Voltage);


    }

}

class ICruze extends LuminousInverter {

    int BatteryCapacity_Ah;
    String Invertertype;

    ICruze(int current, int volt, int prize, String InverterName, String invertertype, int batteryCapacity_Ah) {

        super(current, volt, prize, InverterName);
        this.Invertertype = invertertype;
        this.BatteryCapacity_Ah = batteryCapacity_Ah;

    }

}

class SolarInverter extends LuminousInverter {

    String InverterType; // On Grid and off Grid

    SolarInverter(String InverterType, int current, int volt, int prize, String InverterName) {
        super(current, volt, prize, InverterName);
        this.InverterType = InverterType;

    }

}

class PCU extends SolarInverter {

    int batteryCapacity_Ah;

    PCU(int current, int volt, int prize, String InverterName, int batteryCapacity_Ah, String InverterType) {

        super(InverterType, current, volt, prize, InverterName);
        this.batteryCapacity_Ah = batteryCapacity_Ah;

    }

}

class GTI extends SolarInverter {

    int backupTime_hr;

    GTI(int current, int volt, int prize, String InverterName, int backupTime_hr, String InverterType) {

        super(InverterType, current, volt, prize, InverterName);
        this.backupTime_hr = backupTime_hr;

    }
}

public class Inverters {

    public static void main(String[] args) {

        Zelio zelio = new Zelio(17, 12, 19000, "Zelio -1100", "RC15000", 120);

        ICruze iCruze = new ICruze(21, 12, 17000, "iCruze ", "RC15000", 120);

        PCU pcu = new PCU(11, 10, 24000, "PCU", 110, "Grid off");

        GTI gti = new GTI(20, 11, 24000, "GTI", 9, "Grid on");


        System.out.println("Zelio Power Rating : "+zelio.getPowerRating());
        zelio.getinfo();
        System.out.print("\n\n");
        System.out.println("iCruze Power Rating : "+iCruze.getPowerRating());
        System.out.println("PCU Power Rating : "+pcu.getPowerRating());
        System.out.println("GTI Power Rating : "+gti.getPowerRating());
        

    }
}
