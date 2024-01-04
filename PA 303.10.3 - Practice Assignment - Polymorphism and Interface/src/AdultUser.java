public class AdultUser implements LibraryUser {
    int age;
    String bookType;

    @Override
    public void registerAccount(){
        if(this.age >= 12){
            System.out.println("You have successfully registered under an Adult Account");
        }else{
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }
    @Override
    public void requestBook(){
        if(this.bookType == "Fiction"){
            System.out.println("Book Issued successfully, please return the book within 7 days.");
        }else{
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
