import javafx.scene.control.Button;


public class Controller {
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,startWithRandomAI,startWithDefensiveAI;
    Button button[]= new Button[10];

    public void initialize(){
        button[1]=b1;
        button[2]=b2;
        button[3]=b3;
        button[4]=b4;
        button[5]=b5;
        button[6]=b6;
        button[7]=b7;
        button[8]=b8;
        button[9]=b9;
    }

    int count=0;

    public void click_1(){
    if(count%2==0)
        b1.setText("X");
    count++;
    }
    public void click_2(){
        if(count%2==0)
            b2.setText("X");
        count++;
    }
    public void click_3(){
        if(count%2==0)
            b3.setText("X");
        count++;
    }
    public void click_4(){
        if(count%2==0)
            b4.setText("X");
        count++;
    }
    public void click_5(){
        if(count%2==0)
            b5.setText("X");
        count++;
    }
    public void click_6(){
        if(count%2==0)
            b6.setText("X");
        count++;
    }
    public void click_7(){
        if(count%2==0)
            b8.setText("X");
        count++;
    }
    public void click_8(){
        if(count%2==0)
            b8.setText("X");
        count++;
    }
    public void click_9(){
        if(count%2==0)
            b9.setText("X");
        count++;
    }

}
