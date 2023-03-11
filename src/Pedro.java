

import java.util.ArrayList;
import java.util.Scanner;

public class Pedro {


    public static int menureturnint(String op1, String op2) {
        int r;
        Scanner data = new Scanner(System.in);
        System.out.println("1.Opcion1");
        System.out.println("2.Opcion2");
        System.out.println("3.Opcion3");
        System.out.println("4.Opcion4");
        System.out.println("5.Opcion5");
        System.out.println("6.Opcion6");
        System.out.println("0.Exit");
        r = data.nextInt();


        return r;
    }





        public static int checkInt(){

            boolean error = false;
            int i = 0;

            do {
                try {
                    i = inputWhole();
                    error = true;
                } catch (Exception e) {
                    System.out.println("-- The input it's doesn't correct, try it again: --");
                }
            } while(!error);

            return i;
        }

        public static String checkString(){

            boolean error = false;
            String i = "";

            do {
                try {
                    i = inputString();
                    error = true;
                } catch (Exception e) {
                    System.out.println("-- The input it's doesn't correct, try it again: --");
                }
            } while(!error);

            return i;

        }
        public static char checkChar(){

            boolean error = false;
            char i = 0;

            do {
                try {
                    i = inputChar();
                    error = true;
                } catch (Exception e) {
                    System.out.println("-- The input it's doesn't correct, try it again: --");
                }
            } while(!error);

            return i;

        }
        public static Float checkFloat(){

            boolean error = false;
            float i = 0;

            do {
                try {
                    i = inputFloat();
                    error = true;
                } catch (Exception e) {
                    System.out.println("-- The input it's doesn't correct, try it again: --");
                }
            } while(!error);

            return i;

        }
        public static double checkDouble(){

            boolean error = false;
            double i = 0;

            do {
                try {
                    i = inputDouble();
                    error = true;
                } catch (Exception e) {
                    System.out.println("-- The input it's doesn't correct, try it again: --");
                }
            } while(!error);

            return i;
        }


        private static int inputWhole() {
            return new Scanner(System.in).nextInt();
        }

        private static String inputString() {
            return new Scanner(System.in).next();
        }

        private static char inputChar() {
            return new Scanner(System.in).next().charAt(0);
        }

        private static float inputFloat() {
            return new Scanner(System.in).nextFloat();
        }

        private static double inputDouble() {
            return new Scanner(System.in).nextDouble();
        }


/*
  private static void returnTickets(ArrayList<Flight> flightlist, ArrayList<User> userlist,ArrayList<Ticket>ticketlist) {
        Scanner data = new Scanner(System.in);
        double price;
        double returnn;
        double finalprice = 0;
        System.out.println("In which flight do you want to return tickets");
        int id = data.nextInt();
        System.out.println("How many do u want to return?");
        int numtickets = data.nextInt();
        //  if (numtickets >  )
        //mirar como hacer que no devuelva mas de las que compra xd

        for (int i = 0; i < flightlist.size(); i++) {
            Flight flight = flightlist.get(i);
            price = flight.getPriceTickets();
            returnn = flight.getReturnPercentage() / 100;

            flight.setPlacesAvailable(flight.getPlacesAvailable() + numtickets);
            double h = price * numtickets;
            finalprice = h * returnn;


        }
        System.out.println("Money returned " + finalprice);

    }

 */



public void buscarenarrayconwhile(){
/*
    while(i < userlist.size() && !found) {
        User u = userlist.get(i);
        if (u.getUser().equalsIgnoreCase(user)) {
            System.out.println("correcto titan");
            found = true;

        } else {
            System.out.println("No username found on the array.");
        }

        i++;
    }

 */
}












}
