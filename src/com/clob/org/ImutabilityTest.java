package com.clob.org;

import java.util.Date;

public final class ImutabilityTest {

    public ImutabilityTest(int id, String name,Date date) {
        super();
        this.id = id;
        this.name = name;
        this.date = new Date(date.getTime());
    }
    
    private final  int id;
    private final String name;
    private final Date date;
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public Date getDate() {
        return new Date(date.getTime());
    }

        
    public void displayData(){
        System.out.println(name);
    }
    
    
    public static void main(String[] args) {
        ImutabilityTest test = new ImutabilityTest(3765,"Venkat",new Date());
        System.out.println(test.getDate());
        test.getDate().setTime(15);
        System.out.println(test.getDate());
    }
    
}
