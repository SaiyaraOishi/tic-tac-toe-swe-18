import javafx.scene.control.Button;


public class Controller {
    public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,startWithRandomAI,startWithDefensiveAI;
    public
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
    else b1.setText("O");
    count++;
    }
    public void click_2(){
        if(count%2==0)
            b2.setText("X");
        else b2.setText("O");
        count++;
    }
    public void click_3(){
        if(count%2==0)
            b3.setText("X");
        else b3.setText("O");
        count++;
    }
    public void click_4(){
        if(count%2==0)
            b4.setText("X");
        else b4.setText("O");
        count++;
    }
    public void click_5(){
        if(count%2==0)
            b5.setText("X");
        else b5.setText("O");
        count++;
    }
    public void click_6(){
        if(count%2==0)
            b6.setText("X");
        else b6.setText("O");
        count++;
    }
    public void click_7(){
        if(count%2==0)
            b8.setText("X");
        else b8.setText("O");
        count++;
    }
    public void click_8(){
        if(count%2==0)
            b8.setText("X");
        else b8.setText("O");
        count++;
    }
    public void click_9(){
        if(count%2==0)
            b9.setText("X");
        else b9.setText("O");
        count++;
    }

}
