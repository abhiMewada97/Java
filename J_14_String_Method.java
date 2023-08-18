public class J_14_String_Method {
    public static void main(String[] args){
        String name = "Abhishek";
        int value = name.length();
        System.out.println("The length is "+value);

        String lowerstring = name.toLowerCase();
        System.out.println("The lower case "+lowerstring);

        String upperstring = name.toUpperCase();
        System.out.println("The upper case "+upperstring);

        String nonTrimmedString ="      Abhishek    ";
        System.out.println("Non trimmed string "+nonTrimmedString);

        System.out.print("Trimmed string ");
        System.out.println(nonTrimmedString.trim());  //blow also correct
        String trimmedString = nonTrimmedString.trim();
        System.out.println("Trimmed string "+trimmedString);

        System.out.println("Sub string is "+ name.substring(1));  //begin from 1 index of string
        System.out.println("Sub string is "+ name.substring(1,5));  // print string from 1st index, before 5th index string, Not include 5th index

        System.out.println("Replace the string "+ name.replace("sh","kk"));
        System.out.println("Replace the string "+ name.replace('h','n'));

        System.out.println("Start with Abhi ? = "+name.startsWith("Abhi"));
        System.out.println("Start with abhi ? = "+name.startsWith("abhi") +" : Because of lower case and upper case");
        System.out.println("End with a ? = "+name.endsWith("a"));

        System.out.println("Charater at index 4 = "+name.charAt(4));

        String modifiedName = "Harryrryrry";
        String modifiedNameSec = "aicdifghijklmi";
        System.out.println("Index of rry is "+modifiedName.indexOf("rry")); //if not any index it will give -1
        System.out.println("Index of rry is "+modifiedName.indexOf("rry",4)+" : it start to find rry from 4th"); //it start to find rry from 4th
        System.out.println("Last index of rry "+modifiedName.lastIndexOf("rry"));
        System.out.println("Last index of rry "+modifiedNameSec.lastIndexOf("d",7)+" : it find from first 0 to 6 index");  //it find rry from 0 to 6, first 7 index
    }
}
