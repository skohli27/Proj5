package com.example.myapplication;

import android.media.Image;

public class Moma extends Museum{

    private String name;
    private int image;
    private String url; //
    private int adultTickets, seniorTickets, studentTickets;
    private static final double ADULT_PRICE = 25;
    private static final double SENIOR_PRICE = 18;
    private static final double STUDENT_PRICE = 14;




    public Moma( String name, int image, String URL){
       super(name, image, URL);
    }

    public double getAdultPrice(){
        return ADULT_PRICE;
    }

    public double getSeniorPrice(){
        return SENIOR_PRICE;
    }

    public double getStudentPrice(){
        return STUDENT_PRICE;
    }

    /**
     * getter for the museum image
     * @return museum image
     */
    public int getImage(){
        return image;
    }

    /**
     * getter for URL
     * @return the URL
     */
    public String getURL() {
        return url;
    }

    /**
     * Setter for the ticket amounts
     * @param adult number of adult tickets
     * @param senior number of senior tickets
     * @param student number of student tickets
     */
    public void setNumTickets( int adult, int senior, int student){
        this.adultTickets = adult;
        this.seniorTickets = senior;
        this.studentTickets = student;
    }

    public String getName(){
        return name;
    }

    /**
     * Method to calculate the tax
     * @return total tax
     */
    public  double salesTax(){
        return ticketPrice() * nycTax;
    }

    /**
     * Calculates the final total
     * @return final total
     */
    public double totalPrice(){
        return ticketPrice() + salesTax();
    }


    /**
     * Method to calculate and return the ticket price
     * @return total price
     */
    public double ticketPrice(){
        return (this.adultTickets * this.ADULT_PRICE) +
                (this.studentTickets * this.STUDENT_PRICE) +
                (this.seniorTickets * this.SENIOR_PRICE);
    }

    @Override
    public String toString(){
       return super.toString();

    }

}
