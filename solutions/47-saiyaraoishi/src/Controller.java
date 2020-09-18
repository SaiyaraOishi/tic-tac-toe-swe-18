import javafx.scene.control.Button;


public class Controller {
    public Button button1,button2,button3,button4,button5,button6,button7,button8,button9,startWithRandomAI,startWithDefensiveAI;
    public
    Button button[]= new Button[10];

    public void initialize(){
        button[1]=button1;
        button[2]=button2;
        button[3]=button3;
        button[4]=button4;
        button[5]=button5;
        button[6]=button6;
        button[7]=button7;
        button[8]=button8;
        button[9]=button9;
    }

    int count=0;

    public void click_1(){
    if(count%2==0)
        button1.setText("X");
    else button1.setText("O");
    count++;
    }
    public void click_2(){
        if(count%2==0)
            button2.setText("X");
        else button2.setText("O");
        count++;
    }
    public void click_3(){
        if(count%2==0)
            button3.setText("X");
        else button3.setText("O");
        count++;
    }
    public void click_4(){
        if(count%2==0)
            button4.setText("X");
        else button4.setText("O");
        count++;
    }
    public void click_5(){
        if(count%2==0)
            button5.setText("X");
        else button5.setText("O");
        count++;
    }
    public void click_6(){
        if(count%2==0)
            button6.setText("X");
        else button6.setText("O");
        count++;
    }
    public void click_7(){
        if(count%2==0)
            button7.setText("X");
        else button7.setText("O");
        count++;
    }
    public void click_8(){
        if(count%2==0)
            button8.setText("X");
        else button8.setText("O");
        count++;
    }
    public void click_9(){
        if(count%2==0)
            button9.setText("X");
        else button9.setText("O");
        count++;
    }

}
