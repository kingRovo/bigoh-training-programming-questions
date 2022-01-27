class Notes{
    final static int note_1 = 2000;
    final static int note_2 = 500;
    final static int note_3 = 200;
    final static int note_4 = 100;

}



public class ATM {
    
    double totalAmount =0.0;

   int totalNumberOf_note_1 = 0;
   int totalNumberOf_note_2 = 0;
   int totalNumberOf_note_3 = 0;
   int totalNumberOf_note_4 = 0;
    public void addCashInATM(int note_1,int note_2,int note_3,int note_4){

        totalNumberOf_note_1 = note_1;
        totalNumberOf_note_2 = note_2;
        totalNumberOf_note_3 = note_3;
        totalNumberOf_note_4 = note_4;

    }
    private double cashAmountInATM(){
        totalAmount = (double)(totalNumberOf_note_1*Notes.note_1)+(totalNumberOf_note_2*Notes.note_2)+
        (totalNumberOf_note_3*Notes.note_3)+(totalNumberOf_note_4*Notes.note_4);

        return totalAmount;
    }

    public void withdrow(double amount){

        if (amount==Notes.note_1&&totalNumberOf_note_1>0) {

            totalAmount -=amount;
            totalNumberOf_note_1--;
        }
        
    }


}
