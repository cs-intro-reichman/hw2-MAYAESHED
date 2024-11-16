public class TimeCalc {
    public static void main(String[] args) {
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = (totalMinutes / 60);
        int newHours = (totalHours % 24);
        int newMinutes = totalMinutes - (totalHours * 60);
        String formattedHours = ((newHours < 10) ? "0" : "") + newHours;
        String formattedMinutes = ((newMinutes < 10) ? "0" : "") + newMinutes;

       System.out.println(formattedHours + ":" + formattedMinutes);
        
    }
}
