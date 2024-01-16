class Parent{
  static{System.out.println("Static Parent Initialization");}
  
  int i=1234;
  {System.out.println("Parent's instance initializer running");
  print("executed from Parent's instance initializer");
  update(1);
  }
  
  Parent(){
    System.out.println("Parent's constructor running");
    print("executed from Parent's constructor");
    update(2);
  }
  
  void print(String note) {System.out.println("never executed");}
  void update(int newI) {System.out.println("never executed");}
}

class Context{
  public static void main(String[]args){
    Parent parent = new Child();
    System.out.println("in main: child's i="+((Child)parent).i);
    System.out.println("in main: parent's i=" +parent.i);
  }
}

class Child extends Parent{
  static{System.out.println("Static Child initialization");}
  
  int i=3;
  {System.out.println("Child's instance initializer; i=" + i);}
  
  Child(){super(); i=4; System.out.println("Child's constructor running. Setting i to 4");}
  
  void print(String note){System.out.println("print(): '"+note.toUpperCase()+"' ; i="+1);}
  void update(int newI){i=newI;System.out.println("update("+newI+"): After update i="+1);}
}