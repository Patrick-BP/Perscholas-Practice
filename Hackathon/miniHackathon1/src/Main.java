import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the last name:");
        String lastName = sc.next();
        try{
            String companyDataLocation = "D:\\PERSCHOLAS\\practice\\Perscholas-Practice\\Hackathon\\miniHackathon1\\src\\files\\Company.csv";
            String salesRepDataLocation = "D:\\PERSCHOLAS\\practice\\Perscholas-Practice\\Hackathon\\miniHackathon1\\src\\files\\SalesReps.csv";

            File companyDataFile = new File(companyDataLocation);
            File salesRepDataFile = new File(salesRepDataLocation);

            Scanner companyDataInput = new Scanner(companyDataFile);
            Scanner salesRepDataInput = new Scanner(salesRepDataFile);

            ArrayList<Company> companyData = new ArrayList<Company>();
            ArrayList<SalesRep> salesRepData = new ArrayList<SalesRep>();

            while(companyDataInput.hasNext()){
                String line = companyDataInput.nextLine();
                String[] splitedLine = line.split(",");

                Company companyObj = new Company();

                companyObj.setIndex(splitedLine[0]);
                companyObj.setOrganizationId(splitedLine[1]);
                companyObj.setSalesRepId(splitedLine[2]);
                companyObj.setName(splitedLine[3]);
                companyObj.setWebsite(splitedLine[4]);
                companyObj.setCountry(splitedLine[5]);
                companyObj.setDescription(splitedLine[6]);
                companyObj.setFounded(splitedLine[7]);
                companyObj.setIndustry(splitedLine[8]);
                companyObj.setNumberOfEmployees(splitedLine[9]);

                companyData.add(companyObj);
            }
            while(salesRepDataInput.hasNext()){
                String line = salesRepDataInput.nextLine();
                String[] splitedLine = line.split(",");

                SalesRep salesRepObj = new SalesRep();

                salesRepObj.setUserId(splitedLine[0]);
                salesRepObj.setFirstName(splitedLine[1]);
                salesRepObj.setLastName(splitedLine[2]);
                salesRepObj.setEmail(splitedLine[3]);
                salesRepObj.setPhone(splitedLine[4]);
                salesRepObj.setDateOfBirth(splitedLine[5]);
                salesRepData.add(salesRepObj);
            }

            for (SalesRep s : salesRepData){

                if(lastName.equals(s.getLastName())){

                    System.out.println("Sales Person: " + s.getFirstName() +" "+ s.getLastName());

                    for (Company c : companyData){

                        if(s.getUserId().equals(c.getSalesRepId())){

                            System.out.println("Organization Id: " + c.getOrganizationId() );
                            System.out.println("Company Name: " + c.getName() );
                            System.out.println("Country: " + c.getCountry() );
                            System.out.println("Industry: "+ c.getIndustry() );
                            System.out.println("Number of employees: "+ c.getNumberOfEmployees());

                            System.out.println("==================================");
                        }
                    }

                }
            }




        }catch(FileNotFoundException e){
            System.out.println("File not Found!");
            e.printStackTrace();
        }






    }
}