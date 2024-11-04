public class WeekdaysPrinter {
    public static void main(String[] args) {

        //Declare and Initialize an Array of Days

        String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        //The Jo7a way :)

//        for(int i=0;i <days.length;i++){
//
//          if(days[i] == "Sunday" || days[i] == "Monday" || days[i] == "Tuesday"|| days[i] == "Wednesday"|| days[i] == "Thursday"){
//              System.out.println(days[i]);
//          }
//
//        }


        for ( String day: days) {
            if(!(day.equals("Friday")|| day.equals("Saturday"))) {
                System.out.println(day);
            }
        }






    }
}
