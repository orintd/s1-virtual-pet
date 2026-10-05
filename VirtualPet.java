/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    boolean stinky = false;
    boolean wolfHateU = false;
    boolean nastyAF = false;
    boolean grossTeeth = false;
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yo thanks bruh");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("Time to exercise!");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setMessage("Zzz...");
        face.setImage("asleep");
    }
    
    public void morning(){
        hunger += 5;
        face.setMessage("Bad morning.");
        face.setImage("normal");
    }

    public void hiWolf(){
        hunger += 10;
        face.setMessage("Yo, wassup Wolf.");
        face.setImage("happy");
    }
    public void brushTeeth(){
        face.setMessage("Mmm, minty fresh.");
        face.setImage("love");
        this.grossTeeth = false;
    }
    public void stinkyChud(){
        face.setMessage("Wow, you're stinky.");
        face.setImage("verysick");
        this.stinky = true;
        if (this.stinky && this.grossTeeth){
            this.nastyAF = true;
        }
    }

    public void shower(){
        face.setMessage("Showering...");
        face.setImage("normal");
        this.stinky = false;
    }

    public void cereal(){
        face.setMessage("I'm feining for some Cinnamon Toast Crunch.");
        face.setImage("hungry");
    }

    public void raisinBran(){
        face.setMessage("Raisin Bran... ewww");
        this.hunger = 1000;
        face.setImage("starving");
    }

    public void tjTrash(){
        face.setMessage("Trader Joe's cereal is kinda butt, so imma eat some of that Cinnamon Toast Crunch!");
    }

    public void cinnamonToastCrunch(){
        face.setMessage("YOO CINNAMON TOAST CRUNCH THE GOAT!!!");
        this.feed();
        face.setImage("love");
    }

    public void dumbStupid(){
        face.setMessage("Can you read the question next time?");
        face.setImage("sad");
    }

    public void phoneLinging(){
        face.setMessage("Ouu shi, Wolf calling my phone.");
        face.setImage("call");
    }

    public void wolfHi(){
        face.setMessage("Wolf: What's up.");
        face.setImage("surprised");
    }

    public void wolfHateU(){
        face.setMessage("Wolf hates you... wrong move.");
        face.setImage("enraged");
    }

    public void wolfParty(){
        face.setMessage("Wolf: I'm having a birthday party. Do you want to come?");
        face.setImage("call");
    }

    public void wolfSlimeYouOut(){
        face.setMessage("Wolf slimed you out. Womp womp.");
        face.setImage("skeleton");
    }
    
    public void grave(){
        face.setImage("pushingdaisies");
    }

    public void quit(){
        System.exit(0);
    }

    public void bet(){
        face.setMessage("Wolf: Bet, I'll come pick you up.  I'll be outside your house in 15.");
        face.setImage("ecstatic");
    }

    public void cih(){
        face.setMessage("Wolf pulls up out front in his Rallye Red 2026 Honda Civic Sport.");
        face.setImage("surprised");
    }

    public void chase(){
        face.setMessage("Oh crap, you messed up. Wolf hates you... maybe you're a bad friend or you're nasty AF. Either way, he's chasing you, so RUN FOR YOUR LIFE!");
        face.setImage("shocked");
    }
    
    public void tooSlow(){
        face.setMessage("Shouldn't have eaten Raisin Bran this morning... you were too slow to run away...");
        face.setImage("exercising");
    }

    public void escape(){
        face.setMessage("Thank goodness you ate Cinnamon Toast Crunch this morning... it was the only thing that gave you enough energy to escape from Wolf.");
        face.setImage("sad");
    }

    public void deodorant(){
        face.setMessage("Wolf: Dude you stink, put on some deodorant.");
        face.setImage("verysad");
    }

    public void welcome(){
        face.setMessage("Wolf: Yoo dude, thank you so much for coming to my birthday party! You're my bestest friend in the whole wide world.");
        face.setImage("ecstatic");
    }
    
    public void partySoTuff(){
        face.setMessage("You went to Wolf's birthday party and you had an epic time!");
        face.setMessage("love");
    }
} // end Virtual Pet
