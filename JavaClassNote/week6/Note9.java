//ö����
enum Weekday{
    SUN, MON, TUE, WED, THU, FRI, SAT;
}

public class Note9{
    public static void main(String args[]){
        for(Weekday day : Weekday.values()){
            System.out.println(day.ordinal() + " " + day.name());
        }
    }
    Weekday fri = Weekday.MON;
    //����������뱨����
    // System.out.println("MON.name() = " + fri.name());
    // System.out.println("MON.ordinal() = " + fri.ordinal());
    // System.out.println(Weekday.valueOf("MON").name());
}