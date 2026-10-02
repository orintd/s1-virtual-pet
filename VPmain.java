import javax.swing.*;

public class VPmain {
    VirtualPet vp = new VirtualPet();
    
    public VPmain(){
        vp.sleep();
        waitABeat(500);
        vp.morning();
        waitABeat(500);
        String a = this.askForInput("Do you want to brush your teeth?");
        a=a.toLowerCase();
        if(a.equals("yes")){
            vp.brushTeeth();
        }
        else{
            vp.stinkyChud();
        }
        waitABeat(500);
        if (vp.stinky == true){
            String b = this.askForInput("Since you're nasty and don't want to brush your teeth, will you at least shower?");
            b=b.toLowerCase();
            if(b.equals("yes")){
                vp.shower();
            }
            else{
                vp.stinkyChud();
            }
        }
        waitABeat(1000);
        vp.cereal();
        waitABeat(2000);
        String c = this.askForInput("Cinnamon Toast Crunch, Raisin Bran, or Trader Joe's?");
        c=c.toLowerCase();
        if (c.equals("raisin bran")){
            vp.raisinBran();
        }
        else if (c.equals("trader joe's")){
            vp.tjTrash();
        }
        else if (!c.equals("cinnamon toast crunch")){
            vp.dumbStupid();
        }
        if(c.equals("trader joe's") || c.equals("cinnamon toast crunch")){
            vp.cinnamonToastCrunch();
        }
        waitABeat(1000);
        vp.exercise();
        waitABeat(2000);
        vp.phoneLinging();
        waitABeat(2000);
        vp.wolfHi();
        waitABeat(1000);
        String d = this.askForInput("Are you going to say hi to your boy?");
        d=d.toLowerCase();
        if (d.equals("yes")){
            vp.hiWolf();
        }
        else{
            vp.wolfHateU();
        }
        waitABeat(1000);
        vp.wolfParty();
        waitABeat(3000);
        String e = this.askForInput("Do you want to go to the goat's birthday party?");
        e=e.toLowerCase();
        if (e.equals("yes")){
            vp.bet();
        }
        else{
            vp.wolfSlimeYouOut();
            waitABeat(2000);
            vp.grave();
            waitABeat(1000);
            vp.quit();
        }
        waitABeat(1000);
        vp.cih();
        waitABeat(2000);
    }

    public void waitABeat(int ms){
        try {
            Thread.sleep(ms); //milliseconds
        } catch(Exception e){
        
        }
    }

    public String askForInput(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Input Dialog",
                    JOptionPane.PLAIN_MESSAGE
        );
        return s;
    }

    

    public static void main(String[] args) {
        new VPmain();    
    }
}

