
import java.util.HashMap;

class Notes {

    HashMap<Integer, Integer> notes = new HashMap<>();

    int note1 = 2000;
    int note2 = 500;
    int note3 = 200;
    int note4 = 100;

    public void AvailableNotes() {

        notes.put(note1, 0);
        notes.put(note2, 0);
        notes.put(note3, 0);
        notes.put(note4, 0);
    }

}

class ATMCash extends Notes {

    public void addCashInATM(ATM atm,int note_1_count, int note_2_count, int note_3_count, int note_4_count) {

        super.AvailableNotes();

        super.notes.put(super.note1, (super.notes.get(super.note1) + note_1_count));
        super.notes.put(super.note2, (super.notes.get(super.note2) + note_2_count));
        super.notes.put(super.note3, (super.notes.get(super.note3) + note_3_count));
        super.notes.put(super.note4, (super.notes.get(super.note4) + note_4_count));

        for (int note : super.notes.keySet()) {
           
            atm.totalAmount += note * super.notes.get(note);

            

        }
        
        //System.out.println("Amonuts = "+atm.totalAmount+"  = ="+super.notes.size());

    }

    public void withdrow(int amount,ATM atm) {
         
        System.out.println("amount in wihtdrow = "+atm.totalAmount+" -  ");
        if (atm.totalAmount < amount)
            System.out.println("insufficient balance ! ");

        if (amount < super.note4)
            System.out.println("Plzz enter minimum amount as " + super.note4);

        if (amount % 100 != 0)
            System.out.println("Plzz enter amount factor of  : " + super.note1 + ",  " + super.note2 + ",  "
                    + super.note3 + ",  " + super.note4);
             

        for (int note : super.notes.keySet()) {
            
            if (amount > note && super.notes.get(note) > 0) {
                
                int totalNotesNeeded = amount / note;
                atm.notesCount.put(note, totalNotesNeeded);

                atm.totalAmount -= totalNotesNeeded * note;
                amount -= totalNotesNeeded * note;
                super.notes.put(note, (super.notes.get(note)) - totalNotesNeeded);
            }

        }

      
    }
    
  

}


class ATM {

    int totalAmount;
    HashMap<Integer, Integer> notesCount = new HashMap<>();

    private int id;
    private String location;

    ATM(int id, String location) {

        this.id = id;
        this.location = location;

    }

    //Withdrow withdrow = new Withdrow();

    public void cashReceipt() {
        System.out.println(totalAmount);
        for (int note : notesCount.keySet()) {

            System.out.println("____" + note + "   X  " + notesCount.get(note) + "  =   "
                    + (note * notesCount.get(note)));

        }

        notesCount.clear();
    }

    public int AvailableCash() {
        return totalAmount;
    }

}

public class Admine {

    public static void main(String[] args) {

        ATM atm = new ATM(45679, "Agra");

        
        ATMCash atmCash = new ATMCash();
        atmCash.addCashInATM(atm,100, 200, 5000, 5000);

        atmCash.withdrow(41000, atm);

        //Withdrow withdrow = new Withdrow();
       // withdrow.withdrow(41000,atm);

        atm.cashReceipt();


        System.out.println("Available Cash : "+atm.AvailableCash());

    }

}
