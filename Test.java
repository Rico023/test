import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static String mapping(String n){  //数字到字母的对应
        String str=null;
        switch(n){
            case "0":
                str="";
                break;
            case "1":
                str="";
                break;
            case"2":
                str="abc";
                break;
            case"3":
                str="def";
                break;
            case"4":
                str="ghi";
                break;
            case"5":
                str="jkl";
                break;
            case"6":
                str="mno";
                break;
            case"7":
                str="pqrs";
                break;
            case"8":
                str="tuv";
                break;
            case"9":
                str="wxyz";
                break;
        }
        return str;
    }
    public void numToLetter(String number){
        List<String> ret= new ArrayList<>();
        List<String> ret2=new ArrayList<>();
        int i = number.length();
        if(i==1){
            String sub= mapping(number);
            for (int j=0; j<sub.length(); j++){
//                System.out.println(sub.charAt(j));
                ret.add(""+sub.charAt(j));
            }
            System.out.println(ret);
        }else {
            String number1=number.charAt(0)+"";
            String number2=number.charAt(1)+"";
            String sub1=mapping(number1);
            String sub2=mapping(number2);
            for (int j=0; j<sub1.length() ; j++){
                ret.add(""+sub1.charAt(j));
                for (int k=0; k<sub2.length();k++){
                    ret2.add(ret.get(j)+sub2.charAt(k));
                }
            }
            System.out.println(ret2);
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入0-99中的任意数字");

        Scanner scanner = new Scanner(System.in);
        String number=scanner.nextLine();

        if (number.length()==1||number.length()==2){
            Test test=new Test();
            test.numToLetter(number);
        } else {
            System.out.println("输入错误，请输入0-99中的任意数字");

        }
//        System.out.println(number.length());
//        System.out.println(number.charAt(1));
    }
}
