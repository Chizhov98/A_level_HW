package hw9;

public class Task1 {
    public static void main(String[] args) {


        String startPos = "a1";
        String lastPos = "B3";
        CheckTurn check = new CheckTurn( new Convert(),startPos, lastPos);


        System.out.println(check.checkTurn() ? "You can do this turn" : "You can`t do this turn");

        System.out.println(new CheckTurn().checkTurn(1,2,8,8) ? "You can do this turn" : "You can`t do this turn");
    }


}
