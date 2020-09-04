/*
* Created by Intellij IDEA, 2020
* User : divyanshu9027
* Date : 04/09/20
* Time : 10:30 pm
*/




/*
* generate an email with the following syntax:firstname.lastname@department.company.com.
* determine the department (sales,development,accounting),if none leave blank.
* generate a random string for password.
* have set methods to change the password ,set the mailbox capacity and define an alternate email address.
* have get methods to display the name ,email, and mailbox capacity.
*/

package emailapp;

public class EmailApp {
    public static void main(String[] args) {

        Email emp1 = new Email("divyanshu","sharma");

        emp1.setAlternateEmail("ds@gmail.com");
        System.out.println(emp1.getAlternateEmail());

        System.out.println(emp1.showInfo());

    }
}
