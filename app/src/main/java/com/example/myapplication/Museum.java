package com.example.myapplication;

public abstract class Museum{
    private String name;
    private int image;
    private String URL; //
    private int adultTickets, seniorTickets, studentTickets;
    private double adultPrice, seniorPrice, studentPrice;
    static final double nycTax = 1.08875;

    /**
     * Default constructor for the Museum
     * @param name name of the museum
     * @param image image of the front of the museum
     * @param URL URL that leads to the museum's site
     */
    public Museum( String name, int image, String URL){
        this.name = name;
        this.image = image;
        this.URL = URL;
        this.adultTickets = 0;
        this.seniorTickets = 0;
        this.studentTickets = 0;
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
        return URL;
    }

    /**
     * Setter for the ticket amounts
     * @param adult number of adult tickets
     * @param senior number of senior tickets
     * @param student number of student tickets
     */
    public void setTickets( int adult, int senior, int student){
        this.adultTickets = adult;
        this.seniorTickets = senior;
        this.studentTickets = student;
    }

    /**
     * Method to calculate and return the ticket price
     * @return total price
     */
    public abstract double ticketPrice();

    /**
     * Method to calculate the tax
     * @return total tax
     */
    public abstract double salesTax();

    /**
     * Calculates the final total
     * @return final total
     */
    public abstract double totalPrice();

    /**
     * toString method for Museum
     * @return
     */
    @Override
    public String toString(){
        return name;
    }
}
