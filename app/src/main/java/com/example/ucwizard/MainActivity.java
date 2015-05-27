package com.example.ucwizard;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.animator.AnimationFactory;
import com.example.animator.AnimatorValue;
import com.example.animator.AnimatorValueImplements;
import com.nineoldandroids.animation.Animator;


public class MainActivity extends Activity {

    private ImageView im_guide;
    private ImageView im_guide_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        startAnimation();
    }

    private void initViews(){
        im_guide= (ImageView) findViewById(R.id.im_guide);
        im_guide_text= (ImageView) findViewById(R.id.im_guide_text);
    }

    private void startAnimation(){
        AnimatorValue a3=new AnimatorValueImplements(im_guide,"ScaleX",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        AnimatorValue a4=new AnimatorValueImplements(im_guide,"ScaleY",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        a3.getAnimator().setDuration(5000);
        a4.getAnimator().setDuration(5000);
        AnimatorValue a5=new AnimatorValueImplements(im_guide_text,"ScaleX",1f,0.9f,0.8f,0.7f,0.6f,0.5f);
        AnimatorValue a6=new AnimatorValueImplements(im_guide_text,"ScaleY",1f,0.9f,0.8f,0.7f,0.6f,0.5f);
        AnimatorValue a7=new AnimatorValueImplements(im_guide_text,"Alpha",0f,0.2f,0.4f,0.5f,0.8f,1f);
        AnimatorValue a8=new AnimatorValueImplements(im_guide_text,"ScaleX",0.5f,0.6f,0.7f,0.8f,0.9f,1f);
        AnimatorValue a9=new AnimatorValueImplements(im_guide_text,"ScaleY",0.5f,0.6f,0.7f,0.8f,0.9f,1f);
        AnimatorValue a10=new AnimatorValueImplements(im_guide_text,"Alpha",1f,0.8f,0.6f,0.4f,0.2f,0f);
        a5.getAnimator().setStartDelay(2500);
        a5.getAnimator().setDuration(2500);
        a6.getAnimator().setDuration(2500);
        a7.getAnimator().setDuration(2500);
        a8.before(a7);
        a8.getAnimator().setDuration(2500);
        a9.getAnimator().setDuration(2500);
        a10.getAnimator().setDuration(2500);
        a10.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                    im_guide_text.setImageResource(R.drawable.uc_white);
                    im_guide.setImageResource(R.drawable.user_guide_pic_1);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        AnimatorValue a11=new AnimatorValueImplements(im_guide,"ScaleX",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        AnimatorValue a12=new AnimatorValueImplements(im_guide,"ScaleY",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        a11.before(a10);
        a11.getAnimator().setDuration(5000);
        a12.getAnimator().setDuration(5000);
        a12.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                im_guide.setImageResource(R.drawable.user_guide_pic_2);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        AnimatorValue a13=new AnimatorValueImplements(im_guide_text,"Alpha",0,0.2f,0.4f,0.6f,0.8f,1f,0f);
        a13.getAnimator().setStartDelay(4000);
        a13.getAnimator().setDuration(1200);

        AnimatorValue a14=new AnimatorValueImplements(im_guide,"ScaleX",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        AnimatorValue a15=new AnimatorValueImplements(im_guide,"ScaleY",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        a14.before(a13);
        a14.getAnimator().setDuration(5000);
        a15.getAnimator().setDuration(5000);
        a15.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                im_guide.setImageResource(R.drawable.user_guide_slogan2);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        AnimatorValue a16=new AnimatorValueImplements(im_guide,"ScaleX",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        AnimatorValue a17=new AnimatorValueImplements(im_guide,"ScaleY",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        AnimatorValue a18=new AnimatorValueImplements(im_guide,"Alpha",1f,0.9f,0.8f,0.7f,0.6f,0.5f);
        a16.before(a15);
        a16.getAnimator().setDuration(5000);
        a17.getAnimator().setDuration(5000);
        a18.getAnimator().setDuration(5000);
        a18.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                im_guide.setImageResource(R.drawable.user_guide_pic_3);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        AnimatorValue a19=new AnimatorValueImplements(im_guide_text,"Alpha",0,0.2f,0.4f,0.6f,0.8f,1f,0f);
        a19.getAnimator().setStartDelay(4000);
        a19.getAnimator().setDuration(1200);

        AnimatorValue a20=new AnimatorValueImplements(im_guide,"ScaleX",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        AnimatorValue a21=new AnimatorValueImplements(im_guide,"ScaleY",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        a20.before(a19);
        a20.getAnimator().setDuration(5000);
        a21.getAnimator().setDuration(5000);
        a21.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                im_guide.setImageResource(R.drawable.user_guide_pic_4);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });


        AnimatorValue a22=new AnimatorValueImplements(im_guide_text,"Alpha",0,0.2f,0.4f,0.6f,0.8f,1f,0f);
        a22.getAnimator().setStartDelay(4000);
        a22.getAnimator().setDuration(1200);

        AnimatorValue a23=new AnimatorValueImplements(im_guide,"ScaleX",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        AnimatorValue a24=new AnimatorValueImplements(im_guide,"ScaleY",1f,1.15f,1.2f,1.25f,1.3f,1.35f,1f);
        a23.before(a22);
        a23.getAnimator().setDuration(5000);
        a24.getAnimator().setDuration(5000);
        a24.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {

            }

            @Override
            public void onAnimationEnd(Animator animator) {
                im_guide.setImageResource(R.drawable.user_guide_pic_all_blur);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });

        AnimatorValue a25=new AnimatorValueImplements(im_guide_text,"Alpha",0,0.2f,0.4f,0.6f,0.8f,1f,0f);
        a25.getAnimator().setStartDelay(4000);
        a25.getAnimator().setDuration(1200);

        AnimatorValue a26=new AnimatorValueImplements(im_guide,"ScaleX",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        AnimatorValue a27=new AnimatorValueImplements(im_guide,"ScaleY",1.5f,1.4f,1.3f,1.2f,1.1f,1f);
        a26.before(a25);
        a26.getAnimator().setDuration(5000);
        a27.getAnimator().setDuration(5000);
        AnimatorValue a28=new AnimatorValueImplements(im_guide_text,"ScaleX",1f,0.9f,0.8f,0.7f,0.6f,0.5f);
        AnimatorValue a29=new AnimatorValueImplements(im_guide_text,"ScaleY",1f,0.9f,0.8f,0.7f,0.6f,0.5f);
        AnimatorValue a30=new AnimatorValueImplements(im_guide_text,"Alpha",0f,0.2f,0.4f,0.5f,0.8f,1f);
        a28.getAnimator().addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                  im_guide_text.setImageResource(R.drawable.user_guide_slogan3);
            }

            @Override
            public void onAnimationEnd(Animator animator) {

            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        });
        a28.getAnimator().setStartDelay(2500);
        a28.getAnimator().setDuration(2500);
        a29.getAnimator().setDuration(2500);
        a30.getAnimator().setDuration(2500);

        AnimationFactory.getInstance().createEngine().startTogetherByLink(
                null,a3,a4,a5,a6,a7,
                a8,a9,a10,a11,a12,a13,a14,
                a15,a16,a17,a18,a19,a20,
                a21,a22,a23,a24,a25,a26,a27,
                a28,a29,a30);
    }

}
