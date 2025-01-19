package io.cucumber.skeleton;

public class Belly {
    int cookiesInBelly;

    public void eat (int cookies) {
        cookiesInBelly += cookies;
        System.out.println("There are " + cookies + " cookies in the belly");
    }

    public void empty(){
        cookiesInBelly = 0;
        System.out.println("Belly is empty");
    }

    public void gurgle (int hours){
        cookiesInBelly = 0;
        System.out.println("Belly is gurgle after " + hours + " hours");
    }

    public int getCookiesInBelly() {
        return cookiesInBelly;
    }

    public void setCookiesInBelly(int cookiesInBelly) {
        this.cookiesInBelly = cookiesInBelly;
    }

    public Belly() {
    }
}
