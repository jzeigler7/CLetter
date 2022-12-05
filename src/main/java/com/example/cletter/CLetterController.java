package com.example.cletter;
import com.itextpdf.html2pdf.HtmlConverter;
import org.apache.commons.io.FileUtils;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;



/**
 *
 * Implements the backend functionality of the CLetter user interface, which allows for
 * generation of custom template-based cover letters using basic input data
 *
 * @author Jacob Zeigler
 * @version 1.0
 */

public class CLetterController {
    /**
     * The name of the company
     */
    @FXML TextField companyName;

    /**
     * The current date
     */
    @FXML TextField currentDate;

    /**
     * The company's area of focus
     */
    @FXML TextField companyFocus;

    /**
     * First characteristic buzzword mentioned in the company's job listing
     */
    @FXML ChoiceBox quality1;

    /**
     * Second characteristic buzzword mentioned in the company's job listing
     */
    @FXML ChoiceBox quality2;

    /**
     * Whether the job listing includes mention of small group collaboration
     */
    @FXML RadioButton smallGroup;

    /**
     * Generates an HTML file with aesthetically pleasing formatting that includes all
     * specified information on a cover letter template.
     */
    @FXML
    public void onGenerateButtonClick() throws IOException {
        String currentDateText = currentDate.getText();
        String companyNameText = companyName.getText();
        String companyFocusText = companyFocus.getText();
        String qualityOneText = (String) quality1.getValue();
        String qualityTwoText = (String) quality2.getValue();
        boolean isSmallGroup = smallGroup.isSelected();
        String elaborationOne;
        String elaborationTwo;
        switch (qualityOneText) {
            case "creative":
                elaborationOne = "My experience working on student-led video game development teams and designing " +
                        "promotional web material for university music events has given me the opportunity to " +
                        "substantially develop my creativity in software development.";
                break;
            case "flexible":
                elaborationOne = "I spent my spare time this fall semester building a video game plugin in Java, the " +
                        "functional requirements of which changed frequently over the course of development.  Many of " +
                        "its systems were overhauled multiple times due to the dynamic modification of the game rules " +
                        "it was intended to enforce.  The successful completion of this product strongly exemplifies " +
                        "my flexibility in software development.";
                break;
            case "curious":
                elaborationOne = "I spent my spare time this fall semester building a video game plugin in Java, using " +
                        "an API I was entirely unfamiliar with prior.  My intense eagerness to learn led me to seek out " +
                        "online tutorials and other information sources that allowed me to take effective command of " +
                        "the tools I had access to, in order to build robust software.";
                break;
            case "interested in cybersecurity":
                elaborationOne = "My interest in cybersecurity led me to participating in this fall’s capture-the-flag " +
                        "competition hosted by Georgia Tech’s cybersecurity club, GreyHat.  While I still have much to " +
                        "learn with regards to security, the event sparked an interest that I will invariably pursue " +
                        "inside and outside of the classroom.";
                break;
            case "highly motivated":
                elaborationOne = "I spend a great deal of time developing personal side projects; these range from " +
                        "organizing gaming competitions that run on custom plugin software I create to composing and " +
                        "producing original jazz albums.  The independent nature of these ventures embodies the driving " +
                        "sense of self-motivation that powers me daily.";
                break;
            case "communication skills":
                elaborationOne = "My time spent on the executive board of the Georgia Tech Musician’s Network has " +
                        "required me to communicate and collaborate extensively in person and via email with university " +
                        "faculty and student organization leadership to manage logistics for our events and " +
                        "activities.";
                break;
            case "skilled with data structures":
                elaborationOne = "I spent my spare time this fall semester building a video game plugin in Java that " +
                        "calculates and stores data for 80+ players using hash tables, heaps, and arrays.  My entry in this" +
                        " fall's HackGT hackathon also makes heavy and somewhat complex use of data structures; the basis for " +
                        "the application's pairing algorithm is based on a 2D arrangement of compatibility scores, implemented using " +
                        "a hash table using hash tables as keys.";
                break;
            case "open to learning new skills":
                elaborationOne = "This cover letter was automatically generated using a program I created that employs " +
                        "HTML processing mechanisms I was wholly unfamiliar with prior to starting the project.  I was " +
                        "able to seek out appropriate tutorials and information sources online to help me make use of " +
                        "the tools available to me.";
                break;
            case "driven to make a difference in the world":
                elaborationOne = "As my entry for this fall’s HackGT hackathon, my initial difficulties finding " +
                        "partners and my drive to create impactful and convenient software led me to develop a tool " +
                        "for matching hackathon participants with one another to form project groups.";
                break;
            case "creative problem solvers":
                elaborationOne = "During my time on the executive board of the Georgia Tech Musician’s Network, I have " +
                        "dedicated extensive amounts of time towards organizing the group’s internal functions.  I " +
                        "introduced an agenda system to formally designate executive tasks to their respective team " +
                        "members, and I assisted in formalizing a calendar to manage music practice room reservations";
                break;
            case "skilled in organization":
                elaborationOne = "My strength in creative problem solving is exemplified in my development of a " +
                        "matchmaking tool for hackathon participants for this fall’s HackGT hackathon. When my team " +
                        "was struggling to conceptualize how to match participants with each other, I devised a " +
                        "solution based on a two-dimensional grid of computed compatibility scores generated for each " +
                        "possible pair of students. This solution was successfully implemented in our submitted entry.";
                break;
            default:
                elaborationOne = "ERROR";
        }
        switch (qualityTwoText) {
            case "creative":
                elaborationTwo = "my experience working on student-led video game development teams and designing " +
                        "promotional web material for university music events has given me the opportunity to " +
                        "substantially develop my creativity in software development.";
                break;
            case "flexible":
                elaborationTwo = "I spent my spare time this fall semester building a video game plugin in Java, the " +
                        "functional requirements of which changed frequently over the course of development.  Many of " +
                        "its systems were overhauled multiple times due to the dynamic modification of the game rules " +
                        "it was intended to enforce.  The successful completion of this product strongly exemplifies " +
                        "my flexibility in software development.";
                break;
            case "curious":
                elaborationTwo = "I spent my spare time this fall semester building a video game plugin in Java, using " +
                        "an API I was entirely unfamiliar with prior.  My intense eagerness to learn led me to seek out " +
                        "online tutorials and other information sources that allowed me to take effective command of " +
                        "the tools I had access to, in order to build robust software.";
                break;
            case "interested in cybersecurity":
                elaborationTwo = "my interest in cybersecurity led me to participating in this fall’s capture-the-flag " +
                        "competition hosted by Georgia Tech’s cybersecurity club, GreyHat.  While I still have much to " +
                        "learn with regards to security, the event sparked an interest that I will invariably pursue " +
                        "inside and outside of the classroom.";
                break;
            case "highly motivated":
                elaborationTwo = "I spend a great deal of time developing personal side projects; these range from " +
                        "organizing gaming competitions that run on custom plugin software I create to composing and " +
                        "producing original jazz albums.  The independent nature of these ventures embodies the driving " +
                        "sense of self-motivation that powers me daily.";
                break;
            case "skilled communicators":
                elaborationTwo = "my time spent on the executive board of the Georgia Tech Musician’s Network has " +
                        "required me to communicate and collaborate extensively in person and via email with university " +
                        "faculty and student organization leadership to manage logistics for our events and " +
                        "activities.";
                break;
            case "skilled with data structures":
                elaborationTwo = "I spent my spare time this fall semester building a video game plugin in Java that " +
                        "calculates and stores data for 80+ players using hash tables, heaps, and arrays.  My entry in this" +
                        " fall's HackGT hackathon also makes heavy and somewhat complex use of data structures; the basis for " +
                        "the application's pairing algorithm is based on a 2D arrangement of compatibility scores, implemented using " +
                        "a hash table using hash tables as keys.";
                break;
            case "open to learning new skills":
                elaborationTwo = "this cover letter was automatically generated using a program I created that employs " +
                        "HTML and PDF processing mechanisms I was wholly unfamiliar with prior to starting the project.  I was " +
                        "able to seek out appropriate tutorials and information sources online to help me make use of " +
                        "the tools available to me.";
                break;
            case "driven to make a difference in the world":
                elaborationTwo = "as my entry for this fall’s HackGT hackathon, my initial difficulties finding " +
                        "partners and my drive to create impactful and convenient software for others led me to develop a tool " +
                        "for matching hackathon participants with one another to form project groups.";
                break;
            case "skilled in organization":
                elaborationTwo = "during my time on the executive board of the Georgia Tech Musician’s Network, I have " +
                        "dedicated extensive amounts of time towards organizing the group’s internal functions.  I " +
                        "introduced an agenda system to formally designate executive tasks to their respective team " +
                        "members, and I assisted in formalizing a calendar to manage music practice room reservations";
                break;
            case "creative problem solvers":
                elaborationTwo = "my strength in creative problem solving is exemplified in my development of a " +
                        "matchmaking tool for hackathon participants for this fall’s HackGT hackathon.  When my team " +
                        "was struggling to conceptualize how to match participants with each other, I devised a " +
                        "solution based on a two-dimensional grid of computed compatibility scores generated for each " +
                        "possible pair of students.  This solution was successfully implemented in our submitted entry.";
                break;
            default:
                elaborationTwo = "ERROR";
        }
        String par1text =

                "My strong interest in " + companyFocusText + " has led me to follow " + companyNameText + " for some time " +
                "and I was extremely excited to see the listing for your software internship on " +
                "LinkedIn.  I feel as if it would be an excellent opportunity for me to work with your team this " +
                "summer, and I believe that my technical capabilities and experience make me a highly qualified " +
                "candidate.";

        String par2text = "I know your company is interested in recruiting interns that are " + qualityOneText +
                " and " + qualityTwoText + ".  " + elaborationOne + "  Furthermore, " + elaborationTwo;
        if (isSmallGroup) {
            par2text += "  As you’ll note in my attached resume, I also have a great deal of experience " +
                    "communicating and working collaboratively in a small-group environment, something I " +
                    "recognize your team values deeply.";
        }
        String par3text = "In closing, I am highly enthusiastic to pursue this opportunity at " + companyNameText +
                " and feel as if my joining your team would incur substantial benefit for both me and the company. " +
                "I eagerly look forward to hearing your response and earnestly appreciate your consideration.";
        File htmlTemplateFile = new File("C:\\Users\\jacob\\OneDrive\\Documents\\CLetter\\CLetter\\src\\main\\resources\\template.html");
        String htmlString = FileUtils.readFileToString(htmlTemplateFile, (Charset) null);
        htmlString = htmlString.replace("$date", currentDateText);
        htmlString = htmlString.replace("$paragraph1", par1text);
        htmlString = htmlString.replace("$paragraph2", par2text);
        htmlString = htmlString.replace("$paragraph3", par3text);
        File htmlOutput = new File("C:\\Users\\jacob\\OneDrive\\Documents\\CLetter\\CLetter\\src\\main\\resources\\output.html");
        FileUtils.writeStringToFile(htmlOutput, htmlString, (Charset) null);
        File of = new File("JACOB_ZEIGLER_" + companyNameText.toUpperCase() + "_COVER_LETTER" + ".pdf");
        HtmlConverter.convertToPdf(htmlString, new FileOutputStream(of));
    }
}