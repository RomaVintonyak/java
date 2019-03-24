import java.util.Scanner;

public class calc {
    /*this my first program in java calc*/
    public static void main(String[] args){
        Scanner vidKorystuvacha = new Scanner(System.in);
        double chyslo1, chyslo2, rezultat = 0;
        String diya;
        System.out.println("Enter you firts numeric...");
        chyslo1 = Double.parseDouble(vidKorystuvacha.nextLine());

        System.out.println("Enter you second numeric...");
        chyslo2 = Double.parseDouble(vidKorystuvacha.nextLine());

        System.out.println("enter you action...");
        diya = vidKorystuvacha.nextLine();
        vidKorystuvacha.close();

       if (diya.equals("/") && chyslo2==0){
           System.out.println("you can not divide by zero");
       }
        else if (diya.equals("+")||diya.equals("додавання"))
        {rezultat = chyslo1+chyslo2;}
        else if (diya.equals("-")||diya.equals("віднімання"))
        {rezultat = chyslo1-chyslo2;}
        else if (diya.equals("*")||diya.equals("множення"))
        {rezultat = chyslo1*chyslo2;}
        else if (diya.equals("/")||diya.equals("ділення"))
        {rezultat = chyslo1/chyslo2;}
        else {rezultat=0;}
        System.out.print("You rezalt is : " + rezultat);
    }
}
