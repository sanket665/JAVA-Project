import java.util.Scanner;
class Cab{
    int fare;
    int d;

    public Cab(){
        fare = 30;

    }

    public Cab(int amt){
        fare = amt;

    }

    void showFare(){
        System.out.println("Total Fare: Rs" + fare);

    }

}

class RideCab {
    public static void main(String[] args){
    int cd;
    Scanner sc = new Scanner(Syystem.in);

    System.out.print("Enter the cab distance from user:");
    cd = sc.nextlnt();
    if(cd>5){
        Cab ob = new Cab (30 + 10 * (cd - 5));
        System.out.print("Enter the distance travelled:");
        ob.d = sc.nextlnt();
        
        ob.fare = ob.fare + 10 * ob.d;

        ob.showFare();
    }
    else{
        Cab ob = new Cab();
        System.out.print("Enter the distance travelled:");
        ob.d = sc.nextlnt();

        ob.fare = ob.fare + 10 * ob.d;

        ob.showFare();

        Cab ob1 = new Cab(ob);
        ob1.showFare();

    } 

    }

}
