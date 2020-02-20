public class Library {
    private int noOfBooks;
    private int signUpTime; //(in Days)
    private int bookCapacityPerDay;
    private String[] bookIds;

    public Library(int noOfBooks, int signUpTime, int bookCapacityPerDay) {
        this.noOfBooks = noOfBooks;
        this.signUpTime = signUpTime;
        this.bookCapacityPerDay = bookCapacityPerDay;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    public int getSignUpTime() {
        return signUpTime;
    }

    public void setSignUpTime(int signUpTime) {
        this.signUpTime = signUpTime;
    }

    public int getBookCapacityPerDay() {
        return bookCapacityPerDay;
    }

    public void setBookCapacityPerDay(int bookCapacityPerDay) {
        this.bookCapacityPerDay = bookCapacityPerDay;
    }

    public String[] getBookIds() {
        return bookIds;
    }

    public void setBookIds(String[] bookIds) {
        this.bookIds = bookIds;
    }
}
