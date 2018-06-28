
import java.io.*;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Person> peoples = new ArrayList<>();
    public static void main(String[] args) {



Person per = new Person("Bruce",25,"CEO");
        Person pers = new Person("Sam",25,"Agent");

        ArrayList<Person> people = new ArrayList<>();

        people.add(per);
        people.add(pers);

        BufferedWriter bw = null;
        FileWriter fw = null;

        String filename = "Test.txt";

        try {
             fw = new FileWriter(filename);
             bw = new BufferedWriter(fw);
            for(Person p: people) {
                bw.write(p.toString());
                //print ","
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        try {

            if (bw != null)
                bw.close();

            if (fw != null)
                fw.close();

        } catch (IOException ex) {

            ex.printStackTrace();

        }

    }


        try {
            FileReader fr = new FileReader("Test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line ="";
            String [] content = null;


            while ((line = br.readLine()) != null) {
                content = line.split(",");






            }
            fr.close();

           for (int i = 0; i < content.length; i += 3){

               Person p = new Person(content[i],Integer.parseInt(content[i+1]),content[i+2]);
               peoples.add(p);


               // person list
               // create a person and add to collection








            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

for(Person p1: peoples){

    System.out.println(p1.toString());
}
        // read from the file
        // String.split(",")




}
}
