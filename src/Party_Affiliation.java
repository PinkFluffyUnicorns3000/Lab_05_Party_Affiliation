/*
class PartyAffiliation
    main()
        output “What is your party affiliation?”
        input String partyAfill
        if partyAfill == “Democrate” then
	        output “you get a democratic donkey.”
        else if partyAfill == “Republican” then
	        output “you get a republican elephant”
        else if partyAlfill == “Independant”
	        output “You get a independent man”
	    else
	        output "You are affiliated with a other party. "
        endIf

    return
endClass

 */


import java.util.Scanner;
public class Party_Affiliation {
    public static void main(String[] args) {
        String party = "";

        Scanner in = new Scanner(System.in);
        System.out.print("What is your party affiliation? D-Democrat,R-Republican,I-Independent ");
        party = in.nextLine();
        if (party.equals("d") || party.equals("D"))
        {
            System.out.println("You get the democratic donkey");
        }
        else if (party.equals("r") || party.equals("R"))
        {
            System.out.println("You get the Republican Elephant");
        }
        else if (party.equals("i") || party.equals("I"))
        {
            System.out.println("You get the Independent Man");
        }
        else // Has to be a other party
        {
            System.out.println("You are affiliated with a other party");
        }
    }
}