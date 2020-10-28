public class Person {
    
    public String firstname;
    public String lastname;

    public Person(String a, String b) {
        firstname = a;
        lastname = b;
    }

    public void doSomething(){
        System.out.println("I am watching netflix");
    }

    public String toString()
    {
        return this.firstname + " " + this.lastname;
    }
    public String getFirstName(){
        return this.firstname;
    }
     public String getLastName(){
        return this.lastname;
    }

    public void setFirstName(String str){
        if (str.trim().length()!=0){
            this.firstname = str;
        }
    }
    public void setLastName(String str){
        if (str.trim().length()!=0){
            this.lastname = str;

        }
    }



    
}













