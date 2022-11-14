public class Mobile implements Phone{
    String myNumber;
    boolean ring;
    boolean isOnCall;

    public Mobile(String myNumber) {
        this.myNumber = myNumber;
        ring =false;
        isOnCall=false;
    }

    @Override
    public boolean isRinging() {
        System.out.println("Phone is ringing");
        return true;
    }

    @Override
    public void answer() {
        System.out.println(myNumber + " Answering the call");
        isOnCall=true;
        ring=false;
    }

    @Override
    public void reject() {
        System.out.println("Call Declined!!");
        ring=false;
    }

    @Override
    public void makeCall(String pnumber) {

        if(isValid(pnumber)&&!isOnCall){
            System.out.println(pnumber +" is calling "+ myNumber);
            incomingCall(pnumber);
        }else System.out.println("invalid number");

    }

    @Override
    public void incomingCall(String pnumber) {
        ring=isRinging();
        System.out.println(pnumber + " is Calling");
        answer();
        reject();
    }

    @Override
    public boolean isValid(String pnumber) {
        return pnumber.length()==10;
    }
}
