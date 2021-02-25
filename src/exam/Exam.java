/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;

/**
 *
 * @author mic_d
 */
public abstract class Exam {

    public String information = "";
    public String book = "";
    public String librarian = "";
    public int date = 0;
    public String mystr = "";
    
    /**
     * @param args the command line arguments
     */
    
    public String getInformation()
    {
        return information;
    }
    
    public String getBook()
    {
        return book;
    }
    
    public String getlibrarian()
    {
        return librarian;
    }
    
    public String returnBook()
    {
        if (date < 10)
        {
            this.book = book; 
        }
        else
            throw new IllegalArgumentException("due date has passed, return book");
        return null;
    }
    
    public int getdate()
    {
        return date;
    }
    
    public String mystr()
    {
        Scanner scanner = new Scanner (System.in);
        String mystr = scanner.nextLine();
        return mystr;
    }
    
    
    public static void main(String[] args){
        
    }
    
}
