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
        face.setMessage("Yum, thanks");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
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
    }
    public void stinkyChud(){
        face.setMessage("Wow, you're a stinky bum.");
        face.setImage("verysick");
        this.stinky = true;
    }

    public void shower(){
        face.setMessage("Showering... why are you watching?");
        face.setImage("enraged");
        this.stinky = false;
    }

    public void cereal(){
        face.setMessage("I'm feining for some Cinnamon Toast Crunch.");
        face.setImage("hungry");
    }

    public void raisinBran(){
        face.setMessage("Yum, Raisin Bran... is what I would say if I was 90 years old!");
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
        face.setMessage("Bro, read the question next time, ya dumb stupid.");
        face.setImage("sad");
    }

    public void phoneLinging(){
        face.setMessage("Ouu shi, Wolf calling my phone.");
        face.setImage("astonished");
    }

    public void wolfHi(){
        face.setMessage("Wolf: What's up my dude.");
        face.setImage("surprised");
    }

    public void wolfHateU(){
        face.setMessage("Wolf hates you... wrong move.");
        face.setImage("enraged");
    }
    

} // end Virtual Pet
