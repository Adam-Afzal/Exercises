public class Person {

    String name;
    int age;
    String job;

    Person(String n, int a, String j){

        this.name = n;
        this.age = a;
        this.job = j;
    }



    public String getName(){

        return  this.name;
    }

    public int getAge(){

        return  this.getAge();
    }

    public String getJob(){

        return this.job;
    }

    public String toString(){

        return this.name + "," + this.age + "," + this.job + ",";

    }
}
