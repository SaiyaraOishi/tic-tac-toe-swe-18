import javafx.scene.control.Button;


public class Controller {
    public Button button1,button2,button3,button4,button5,button6,button7,button8,button9;
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
    int[] input={-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    public void click_1(){
    if(count%2==0) {
        button1.setText("X");
        input[1]=1;
    }
    else if (count%2==1){
        button1.setText("O");
        input[1]=0;
    }
    count++;
    randomAI();
    }
    public void click_2(){
        if(count%2==0) {
            button2.setText("X");
            input[2]=1;
        }
        else if (count%2==1){
            button2.setText("O");
            input[2]=0;
        }
        count++;
        randomAI();
    }
    public void click_3(){
        if(count%2==0) {
            button3.setText("X");
            input[3]=1;
        }
        else if (count%2==1){
            button3.setText("O");
            input[3]=0;
        }
        count++;
        randomAI();
    }
    public void click_4(){
        if(count%2==0) {
            button4.setText("X");
            input[4]=1;
        }
        else if (count%2==1){
            button4.setText("O");
            input[4]=0;
        }
        count++;
        randomAI();
    }
    public void click_5(){
        if(count%2==0) {
            button5.setText("X");
            input[5]=1;
        }
        else if (count%2==1){
            button5.setText("O");
            input[5]=0;
        }
        count++;
        randomAI();
    }
    public void click_6(){
        if(count%2==0) {
            button6.setText("X");
            input[6]=1;
        }
        else if (count%2==1){
            button6.setText("O");
            input[6]=0;
        }
        count++;
        randomAI();
    }
    public void click_7(){
        if(count%2==0) {
            button7.setText("X");
            input[7]=1;
        }
        else if (count%2==1){
            button7.setText("O");
            input[7]=0;
        }
        count++;
        randomAI();
    }
    public void click_8(){
        if(count%2==0) {
            button8.setText("X");
            input[8]=1;
        }
        else if (count%2==1){
            button8.setText("O");
            input[8]=0;
        }
        count++;
        randomAI();
    }
    public void click_9(){
        if(count%2==0) {
            button9.setText("X");
            input[9]=1;
        }
        else if (count%2==1){
            button9.setText("O");
            input[9]=0;
        }
        count++;
        randomAI();
    }

    public void randomAI(){
        while(count<9 && count%2==1){
            int r= (int)(Math.random()*9)+1;
            if(input[r]==-1){
                if(r==1){
                    click_1();
                    break;
                }
                if (r==2){
                   click_2();
                   break;
                }
                if(r==3){
                    click_3();
                    break;
                }
                if(r==4){
                    click_4();
                    break;
                }
                if(r==5){
                    click_5();
                    break;
                }
                if(r==6){
                    click_6();
                    break;
                }
                if(r==7){
                    click_7();
                    break;
                }
                if(r==8){
                    click_8();
                    break;
                }
                if(r==9){
                    click_9();
                    break;
                }
            }

        }
    }

}
