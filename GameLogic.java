public class GameLogic {
    String Number_in_Computer="";
    public void Generate_Number(){
        while (true) { 
            double x= Math.random()*10000;
            int z=(int)x;
            String y=String.valueOf(z);
            if (y.length()==4) {
                String a=y.substring(0,1);
                String b=y.substring(1,2);
                String c=y.substring(2,3);
                String d=y.substring(3);
                if(((!a.equals(b)&&!a.equals(c)&&!a.equals(d))
                    &&!(b.equals(a)&&!b.equals(c)&&!b.equals(d))
                    &&(!c.equals(a)&&!c.equals(b)&&!c.equals(d))
                    &&(!d.equals(a)&&!d.equals(b)&&!d.equals(c)))){
                        Number_in_Computer=y;
                        break;
                }
            }
        }
    }
    public String operation(String Input) {
        String Result = "";
        if (Input.matches("\\d+")) {
            if (Input.length() == 4) {
                String a = Input.substring(0, 1);
                String b = Input.substring(1, 2);
                String c = Input.substring(2, 3);
                String d = Input.substring(3);      
                if (((!a.equals(b)&&!a.equals(c)&&!a.equals(d))
                &&!(b.equals(a)&&!b.equals(c)&&!b.equals(d))
                &&(!c.equals(a)&&!c.equals(b)&&!c.equals(d))
                &&(!d.equals(a)&&!d.equals(b)&&!d.equals(c)))) {       
                    if (!Input.equals(Number_in_Computer)) {
                        if (Input.substring(0, 1).equals(Number_in_Computer.substring(0, 1))) {
                            Result = "+1";
                        }
                        if (Input.substring(1, 2).equals(Number_in_Computer.substring(1, 2))) {
                            if (Result.equals("+1")) {
                                Result = "+2";
                            } 
                            else {
                                Result = "+1";
                            }
                        }
                        if (Input.substring(2, 3).equals(Number_in_Computer.substring(2, 3))) {
                            if (Result.equals("+1")) {
                                Result = "+2";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+3";
                            } 
                            else {
                                Result = "+1";
                            }
                        }
                        if (Input.substring(3).equals(Number_in_Computer.substring(3))) {
                            if (Result.equals("+1")) {
                                Result = "+2";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+3";
                            } 
                            else if (Result.equals("+3")) {
                                Result = "+4";
                            } 
                            else {
                                Result = "+1";
                            }
                        }
                        if (Number_in_Computer.contains(Input.substring(0, 1)) && !Input.substring(0, 1).equals(Number_in_Computer.substring(0, 1))) {
                            if (Result.equals("+1")) {
                                Result = "+1-1";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+2-1";
                            } 
                            else {
                                Result = "-1";
                            }
                        }
                        if (Number_in_Computer.contains(Input.substring(1, 2)) && !Input.substring(1, 2).equals(Number_in_Computer.substring(1, 2))) {
                            if (Result.equals("+1")) {
                                Result = "+1-1";
                            } 
                            else if (Result.equals("+1-1")) {
                                Result = "+1-2";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+2-1";
                            } 
                            else if (Result.equals("+2-1")) {
                                Result = "+2-2";
                            } 
                            else if (Result.equals("-1")) {
                                Result = "-2";
                            } 
                            else if (Result.equals("-2")) {
                                Result = "-3";
                            } 
                            else if (Result.equals("-3")) {
                                Result = "-4";
                            } 
                            else {
                                Result = "-1";
                            }
                        }
                        if (Number_in_Computer.contains(Input.substring(2, 3)) && !Input.substring(2, 3).equals(Number_in_Computer.substring(2, 3))) {
                            if (Result.equals("+1")) {
                                Result = "+1-1";
                            } 
                            else if (Result.equals("+1-1")) {
                                Result = "+1-2";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+2-1";
                            } 
                            else if (Result.equals("+2-1")) {
                                Result = "+2-2";
                            } 
                            else if (Result.equals("-1")) {
                                Result = "-2";
                            } 
                            else if (Result.equals("-2")) {
                                Result = "-3";
                            } 
                            else if (Result.equals("-3")) {
                                Result = "-4";
                            } 
                            else {
                                Result = "-1";
                            }
                        }
                        if (Number_in_Computer.contains(Input.substring(3)) && !Input.substring(3).equals(Number_in_Computer.substring(3))) {
                            if (Result.equals("+1")) {
                                Result = "+1-1";
                            } 
                            else if (Result.equals("+1-1")) {
                                Result = "+1-2";
                            } 
                            else if (Result.equals("+2")) {
                                Result = "+2-1";
                            } 
                            else if (Result.equals("+2-1")) {
                                Result = "+2-2";
                            } 
                            else if (Result.equals("-1")) {
                                Result = "-2";
                            } 
                            else if (Result.equals("-2")) {
                                Result = "-3";
                            } 
                            else if (Result.equals("-3")) {
                                Result = "-4";
                            } 
                            else {
                                Result = "-1";
                            }
                        }
                        if (Result.isEmpty()) {
                            Result = "0"; 
                        }
                        return Result;
                    } 
                    else {
                        return "Congratulations, You've Found The Password";
                    }
                } 
                else {
                    return "You Must Enter A Number With Non-Repeating Digits!!!";
                }
            } 
            else {
                return "You Must Enter A Number With 4 Digits!!!";
            }
        }
        return "You Must Enter Only Numbers!!!";
    }
}