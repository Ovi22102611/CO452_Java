package Format_specifier;


public class Format_specifier {

    public static void main(String[] args) {
        boolean b=true;// note: here boolean is data type , b is a variable and true is the value
        String s="love you mohaarani"; //"" is used for string
        char c='a';// '' is used for character
        short s1= 32677;
        int i= 126587;
        float f= 10.2f;
        double d= 10.2;
       
       
       
       
        System.out.printf("boolean b=%b\n",b); //printf, %b is used to get the boolean value by using format specifier
        System.out.printf("string s=%s\n",s);// \n is used to create new line.In this case \n will be inside the double coutation sign
        System.out.printf("character c=%c\n",c); 
        System.out.printf("short s1=%d\n",s1);//%d is used for short and integer value
        System.out.printf("integer i=%d\n",i);//same as above
        System.out.printf("float f=%.2f\n",f);//%f is used for float and double value and here %.2f means there will be 2 gigit after the poin
        System.out.printf("double d=%.3f\n",d);// same as above; here .3f means there will be 3 digit after the point


    }

}
