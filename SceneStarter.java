/**
 * The SceneStarter class is the entry point for the app
 * It creates an instance of SceneFrame and sets up the GUI to start the game.
 * 
 * @author Alexi Roth Luis A. Canamo (245333)
 * @author Kenaz R. Celestino (241051)
 * @version March 5, 2025
 * 
 * I have not discussed the Java language code in my program 
 * with anyone other than my instructor or the teaching assistants 
 * assigned to this course.
 * 
 * I have not used Java language code obtained from another student, 
 * or any other unauthorized source, either modified or unmodified.
 * 
 * If any Java language code or documentation used in my program 
 * was obtained from another source, such as a textbook or website, 
 * that has been clearly noted with a proper citation in the comments 
 * of my program.
 **/
public class SceneStarter {
    public static void main(String[] args) {
        SceneFrame sf = new SceneFrame();
        sf.setUpGUI();
    }
}
