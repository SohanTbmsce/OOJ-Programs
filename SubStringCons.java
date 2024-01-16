class SubStringCons {

    public static void main(String args[]) {

    String s1=new String();

    String s2=new String("hello");
    System.out.println("s1="+s2);

     char chars[]={'a','b','c','d','e'};
     String s3=new String(chars,0,3);
     System.out.println("s3:"+s3);
      
    
    byte ascii[] = {65, 66, 67, 68, 69, 70 };
    
    String s4 = new String(ascii);
    
    System.out.println(s4);
    
    String s5 = new String(ascii, 2, 3);
    
    System.out.println(s5);


    String s6="hello";
    System.out.println("length of string s6:"+s6.length());
    String s7="java";
    String obj=new String(s6+s7);
    System.out.println("obj="+obj);

    System.out.println("name:sohan t sanjeev usn:2023bms02532");
    }
    
    }