package com.practice;

import java.io.*;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
class Student implements Serializable{
    private static final long serialVersionUID=1L;
    String name1;
    String age1;
    String id;
    String address;
    String cid;
    Student(String name,
             String age){
        this.name1=name;
        this.age1=age;

    }
}
class Student1 extends Student{
    private static final long serialVersionUID=2L;
       String pName;
       String mName;
    String kumar;
    Student1(String name, String age) {
        super(name, age);
        this.pName=name;
        this.mName=age;
    }
    private void writeObject(ObjectOutputStream oos) throws IOException {
        throw new NotSerializableException();
    }
}
public class TreeMapTest {
    public static void main(String[] args) {
        TreeTest treeTest=new TreeTest("xyz","20", 20);
        TreeTest treeTest1=new TreeTest("xyz","20",10);
        Comparator<TreeTest> myTreeTest=(o1,o2)-> o1.getId()<o2.getId()?1:-1;
        Map<TreeTest,String> map=new TreeMap<>(myTreeTest);
        map.put(treeTest,null);
        map.put(treeTest1,null);

        try{

            //Creating the object
           Student1 student=new Student1("Sandeep","20");
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream(new File("F:\\serialization\\f.txt"));
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(student);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
            System.out.println("=========================================================");
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("F:\\serialization\\f.txt"));
            Student1 s=(Student1)in.readObject();
            //printing the data of the serialized object
            System.out.println("Deserialized: "+s.name1);
            //closing the stream
            in.close();

        }catch(Exception e){System.out.println(e);}
    }

}

class TreeTest{
    String name;
    String age;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    TreeTest(String name,
             String age, int id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}