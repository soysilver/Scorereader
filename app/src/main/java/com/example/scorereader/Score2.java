package com.example.scorereader;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Score2 extends AppCompatActivity  {

    int i = 0;
    int position = 0;
    int sFlag = 0;

    String scorelist[]= new String[] {

            "4분의 1음표 5옥타브 레입니다.", "8분의 3음표 4옥타브 라입니다.", "8분의 1음표 4옥타브 시입니다.", "2분의 1음표 4옥타브 라입니다.", "4분의 1음표 4옥타브 미입니다.", "4분의 1음표 4옥타브 레입니다.",
            "8분의 3음표 4옥타브 파샾입니다.", "8분의 1음표 4옥타브 솔입니다.", "2분의 1음표 4옥타브 파샾입니다.", "4분의 1음표 4옥타브 도샾입니다.", "4분의 1음표 3옥타브 시입니다.", "8분의 3음표 4옥타브 레입니다.",
            "8분의 1음표 4옥타브 미입니다.", "2분의 1음표 4옥타브 레입니다.", "4분의 1음표 4옥타브 파샾입니다.", "4분의 1음표 4옥타브 솔입니다.", "8분의 1음표 4옥타브 솔입니다.", "8분의 1음표 4옥타브 파샾입니다.",
            "8분의 1음표 4옥타브 미입니다.", "8분의 1음표 4옥타브 레입니다.", "2분의 1음표 4옥타브 미입니다.", "8분의 1음표 4옥타브 레입니다.", "8분의 1음표 4옥타브 미입니다.", "4분의 1음표 4옥타브 파샾입니다.",
            "8분의 3음표 4옥타브 라입니다.", "8분의 1음표 4옥타브 시입니다.", "2분의 1음표 4옥타브 라입니다.", "4분의 1음표 4옥타브 미입니다.", "4분의 1음표 4옥타브 레입니다.", "8분의 3음표 4옥타브 파샾입니다.",
            "8분의 1음표 4옥타브 솔입니다.", "2분의 1음표 4옥타브 파샾입니다.", "4분의 1음표 5옥타브 도샾입니다.", "4분의 1음표 4옥타브 시입니다.", "8분의 1음표 4옥타브 시입니다.", "8분의 1음표 5옥타브 도샾입니다.",
            "4분의 1음표 5옥타브 레입니다.", "8분의 3음표 4옥타브 라입니다.", "8분의 1음표 4옥타브 레입니다.", "4분의 1음표 4옥타브 파샾입니다.", "4분의 1음표 4옥타브 솔입니다.", "8분의 1음표 4옥타브 솔입니다.",
            "8분의 1음표 4옥타브 파샾입니다.", "8분의 1음표 4옥타브 미입니다.", "8분의 1음표 4옥타브 도샾입니다.", "2분의 1음표 4옥타브 레입니다."


    };

    double posList[]=new double[]{
            0 ,  0.5 ,  1.25 ,  1.5 ,  2.5 ,  3.0 ,  3.5 ,  4.25 ,  4.5 ,  5.5 ,  6.0 ,  6.5 ,  7.25 ,  7.5 ,  8.5 ,  9.0 ,  9.5 ,  9.75 ,  10.0 ,  10.25 ,  10.5 ,  11.5 ,  11.75 ,
            12.0 ,  12.5 ,  13.25 ,  13.5 ,  14.5 ,  15.0 ,  15.5 ,  16.25 ,  16.5 ,  17.5 ,  18.0 ,  18.5 ,  18.75 ,  19.0 ,  19.5 ,  20.25 ,  20.5 ,  21.0 ,  21.5 ,  21.75 ,  22.0 ,
            22.25 ,  22.5 };



    MediaPlayer mediaPlayer;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.printscore);
//        View left = (View)findViewById(R.id.view1);
//        View right = (View)findViewById(R.id.view2);
        Button before= (Button)findViewById(R.id.button1);
        Button after = (Button)findViewById(R.id.button2);
        Button start= (Button)findViewById(R.id.button3);
        Button stop = (Button)findViewById(R.id.button4);
        TextView score = (TextView)findViewById(R.id.textView);

        mediaPlayer = MediaPlayer.create(this, R.raw.mscz1);

        PlaySound playSound = new PlaySound();





        int freqList[]=new int[scorelist.length];

        for (int j = 0; j<scorelist.length; j++){
            if (scorelist[j].contains("3옥타브 도")){
                freqList[j]=131;
            }
            else if(scorelist[j].contains("3옥타브 레")){
                freqList[j]=147;
            }
            else if(scorelist[j].contains("3옥타브 미")){
                freqList[j]=165;
            }
            else if(scorelist[j].contains("3옥타브 파")){
                freqList[j]=175;
            }
            else if(scorelist[j].contains("3옥타브 솔")){
                freqList[j]=196;
            }
            else if(scorelist[j].contains("3옥타브 라")){
                freqList[j]=440/2;
            }
            else if(scorelist[j].contains("3옥타브 시")){
                freqList[j]=494/2;
            }
            else if(scorelist[j].contains("4옥타브 도샾")){
                freqList[j]=278;
            }
            else if(scorelist[j].contains("4옥타브 도")){
                freqList[j]=262;
            }
            else if(scorelist[j].contains("4옥타브 레")){
                freqList[j]=294;
            }
            else if(scorelist[j].contains("4옥타브 미")){
                freqList[j]=330;
            }
            else if(scorelist[j].contains("4옥타브 파샾")){
                freqList[j]=370;
            }
            else if(scorelist[j].contains("4옥타브 파")){
                freqList[j]=349;
            }
            else if(scorelist[j].contains("4옥타브 솔")){
                freqList[j]=392;
            }
            else if(scorelist[j].contains("4옥타브 라")){
                freqList[j]=440;
            }
            else if(scorelist[j].contains("4옥타브 시")){
                freqList[j]=494;
            }
            else if(scorelist[j].contains("5옥타브 도샆")){
                freqList[j]=554;
            }
            else if(scorelist[j].contains("5옥타브 도")){
                freqList[j]=523;
            }
            else if(scorelist[j].contains("5옥타브 레")){
                freqList[j]=294*2;
            }
            else if(scorelist[j].contains("5옥타브 미")){
                freqList[j]=330*2;
            }
            else if(scorelist[j].contains("5옥타브 파")){
                freqList[j]=349*2;
            }
            else if(scorelist[j].contains("5옥타브 솔")){
                freqList[j]=392*2;
            }
            else if(scorelist[j].contains("5옥타브 라")){
                freqList[j]=440*2;
            }
            else if(scorelist[j].contains("5옥타브 시")){
                freqList[j]=494*2;
            }
            else{
                freqList[j]=440;
            }

        }

        score.setText(scorelist[i]);

        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(i > 0){
                    i--;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);
                }
                if(i > scorelist.length-1){
                    i = 0;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);
                }else if(i==0){
                    i = scorelist.length-1;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);

                }

            }
        });

        after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(scorelist.length-1 > i & i >= 0){
                    i++;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);
                }
                if(i >= scorelist.length-1){
                    i = 0;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);

                }else if(i<0){
                    i = scorelist.length-1;
                    score.setText(scorelist[i]);
                    playSound.setFreqOfTone(freqList[i]);
                }

            }
        });


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sFlag ==0){
                    mediaPlayer.seekTo((int) posList[i]*1000);
                    mediaPlayer.start();
                    score.setText(" ");
                    sFlag = 1;
                    start.setText("멈춤");
                }
                else{
                    position=mediaPlayer.getCurrentPosition();
                    sortTime(position);
                    mediaPlayer.pause();
                    score.setText(scorelist[i]);
                    sFlag = 0;
                    start.setText("재생");
                }
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                position=mediaPlayer.getCurrentPosition();
                sortTime(position);
                mediaPlayer.pause();
                score.setText(scorelist[i]);
                sFlag = 0;
            }
        });




//        left.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View v, MotionEvent event) {
//
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN: {
//                        left.sendAccessibilityEvent(AccessibilityEvent.TYPE_VIEW_FOCUSED);
//                        return false;
//                    }
//                    case MotionEvent.ACTION_UP: {
//                        if(i > 0){
//                            i--;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//                        }
//                        else if(i > scorelist.length-1){
//                            i = 0;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//                        }else if(i==0){
//                            i = scorelist.length-1;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//
//                        }
//
//                    }
//
//                    default:
//                        return false;
//                }
//
//
//            }
//
//        });
//
//
//        right.setOnTouchListener(new View.OnTouchListener() {
//            public boolean onTouch(View v, MotionEvent event) {
//
//                switch (event.getAction()) {
//                    case MotionEvent.ACTION_DOWN: {
//                        return false;
//                    }
//                    case MotionEvent.ACTION_UP: {
//                        if(scorelist.length-1 > i & i >= 0){
//                            i++;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//                        }
//                        else if(i > scorelist.length-1){
//                            i = 0;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//
//                        }else if(i<0){
//                            i = scorelist.length-1;
//                            count.setText(scorelist[i]);
//                            playSound.setFreqOfTone(freqList[i]);
//                        }
//
//                    }
//                    default:
//                        return false;
//                }
//
//            }
//
//        });
//
    }
    public void sortTime(int position){
        int k;
        for(k=0; k<posList.length; k++){
            if( (int) posList[k] == (int) position/1000 ){
                i = k;
            }
        }
    }


}