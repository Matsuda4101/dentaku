package rensyu.dentaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //一時頬間場所、記号ボタンが押された際にboxの中身をこの中に入れる
    float pt=0;
    //数字を入力する際に、一の位かそうではないかを判断する
    int flag=0;
    //数字を入力した直後に入れる入れ物
    float box=0;
    //＋ボタンが押された時
    int plus=0;
    //－ボタンが押された時
    int minus=0;
    //×ボタンが押された時
    int kakeru=0;
    //÷ボタンが押された時
    int waru=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.one);
        Button button2 = (Button) findViewById(R.id.two);
        Button button3 = (Button) findViewById(R.id.three);
        Button button4 = (Button) findViewById(R.id.four);
        Button button5 = (Button) findViewById(R.id.five);
        Button button6 = (Button) findViewById(R.id.six);
        Button button7 = (Button) findViewById(R.id.seven);
        Button button8 = (Button) findViewById(R.id.eight);
        Button button9 = (Button) findViewById(R.id.nine);
        Button button0 = (Button) findViewById(R.id.zero);
        Button plusbutton = (Button) findViewById(R.id.plus);
        Button minusbutton = (Button) findViewById(R.id.minus);
        Button kakerubutton = (Button) findViewById(R.id.kakeru);
        Button warubutton = (Button) findViewById(R.id.waru);
        Button clearbutton = (Button) findViewById(R.id.clear);
        Button resultbutton = (Button) findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            //１を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("1");
                    box=1;
                    flag=1;
                }else{
                    box=box*10+1;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            //２を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("2");
                    flag=1;
                    box=2;
                }else{
                    box=box*10+2;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            //３を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("3");
                    flag=1;
                    box=3;
                }else{
                    box=box*10+3;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            //４を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("4");
                    flag=1;
                    box=4;
                }else{
                    box=box*10+4;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            //５を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("5");
                    flag=1;
                    box=5;
                }else{
                    box=box*10+5;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            //６を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("6");
                    flag=1;
                    box=6;
                }else{
                    box=box*10+6;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            //７を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("7");
                    flag=1;
                    box=7;
                }else{
                    box=box*10+7;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            //８を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("8");
                    flag=1;
                    box=8;
                }else{
                    box=box*10+8;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            //９を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("9");
                    flag=1;
                    box=9;
                }else{
                    box=box*10+9;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            //０を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(flag==0) {
                    textView.setText("0");
                }else{
                    box=box*10;
                    textView.setText(String.valueOf(box));
                }
            }
        });

        plusbutton.setOnClickListener(new View.OnClickListener() {
            //＋を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(plus==1){
                    pt=box+pt;
                    flag=0;
                    box=pt;
                    textView.setText(String.valueOf(pt));
                    box=0;
                }else if(minus==1){
                    flag=0;
                    pt=pt-box;
                    textView.setText(String.valueOf(pt));
                    plus=1;
                    minus=0;
                    box=0;
                }else if(kakeru==1){
                    flag=0;
                    pt=pt*box;
                    textView.setText(String.valueOf(pt));
                    plus=1;
                    kakeru=0;
                    box=0;
                }else if(waru==1){
                    flag=0;
                    pt=pt/box;
                    textView.setText(String.valueOf(pt));
                    plus=1;
                    waru=0;
                    box=0;
                }else {
                    pt = box;
                    box=0;
                    plus = 1;
                    flag = 0;
                }
            }
        });


        minusbutton.setOnClickListener(new View.OnClickListener() {
            //ーを押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(minus==1){
                    pt=pt-box;
                    flag=0;
                    box=pt;
                    textView.setText(String.valueOf(pt));
                    box=0;
                }else if(plus==1){
                    flag=0;
                    pt=pt+box;
                    textView.setText(String.valueOf(pt));
                    box=0;
                    plus=0;
                    minus=1;
                }else if(kakeru==1){
                    flag=0;
                    pt=pt*box;
                    textView.setText(String.valueOf(pt));
                    box=0;
                    minus=1;
                    kakeru=0;
                }else if(waru==1){
                    flag=0;
                    pt=pt/box;
                    textView.setText(String.valueOf(pt));
                    box=0;
                    minus=1;
                    waru=0;
                }else {
                    pt = box;
                    box=0;
                    minus=1;
                    flag = 0;
                }
            }
        });

        kakerubutton.setOnClickListener(new View.OnClickListener() {
            //×を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(kakeru==1){
                    pt=pt*box;
                    flag=0;
                    box=pt;
                    textView.setText(String.valueOf(pt));
                    box=1;
                }else if(plus==1){
                    flag=0;
                    pt=pt+box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    kakeru=1;
                    plus=0;
                }else if(minus==1){
                    flag=0;
                    pt=pt-box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    kakeru=1;
                    minus=0;
                }else if(waru==1){
                    flag=0;
                    pt=pt/box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    kakeru=1;
                    waru=0;
                }else {
                    pt = box;
                    box=1;
                    kakeru=1;
                    flag = 0;
                }
            }
        });

        warubutton.setOnClickListener(new View.OnClickListener() {
            //÷を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if(waru==1){
                    pt=pt/box;
                    flag=0;
                    box=pt;
                    textView.setText(String.valueOf(pt));
                    box=1;
                }else if(plus==1){
                    flag=0;
                    pt=pt+box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    waru=1;
                    plus=0;
                }else if(minus==1){
                    flag=0;
                    pt=pt-box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    waru=1;
                    minus=0;
                }else if(kakeru==1){
                    flag=0;
                    pt=pt*box;
                    textView.setText(String.valueOf(pt));
                    box=1;
                    waru=1;
                    kakeru=0;
                }else {
                    pt = box;
                    box=1;
                    waru=1;
                    flag = 0;
                }
            }
        });

        clearbutton.setOnClickListener(new View.OnClickListener() {
            //Ｃを押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                textView.setText("0");
                flag=0;
                box=0;
                plus = 0;
                minus=0;
                kakeru=0;
                waru=0;
                pt=0;
            }
        });

        resultbutton.setOnClickListener(new View.OnClickListener() {
            //＝を押したときに呼ばれる関数
            TextView textView = findViewById(R.id.text);
            @Override
            public void onClick(View view) {
                if ((plus == 0)&&(minus==0)&&(kakeru==0)&&(waru==0)) {
                    textView.setText(String.valueOf(box));
                }else if(plus==1){
                    pt=pt+box;
                    textView.setText(String.valueOf(pt));
                    flag=0;
                    box=pt;
                    plus = 0;
                    minus=0;
                    kakeru=0;
                    waru=0;
                }else if(minus==1){
                    pt=pt-box;
                    textView.setText(String.valueOf(pt));
                    flag=0;
                    box=pt;
                    plus = 0;
                    minus=0;
                    kakeru=0;
                    waru=0;
                }else if(kakeru==1){
                    pt=pt*box;
                    textView.setText(String.valueOf(pt));
                    flag=0;
                    box=pt;
                    plus = 0;
                    minus=0;
                    kakeru=0;
                    waru=0;
                }else if(waru==1){
                    pt=pt/box;
                    textView.setText(String.valueOf(pt));
                    flag=0;
                    box=pt;
                    plus = 0;
                    minus=0;
                    kakeru=0;
                    waru=0;
                }
            }
        });
    }
}