package com.jaycee88.viewanimationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadRotateAnimation();
            }
        });
    }

    // 淡入动画
    private void loadAlphaAnimation() {
        AlphaAnimation fadeInAnimation = (AlphaAnimation) AnimationUtils.loadAnimation(this, R.anim.fade_in);
        textView.startAnimation(fadeInAnimation);
    }

    // 缩放动画
    private void loadScaleAnimation() {
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.zoom_out));
    }

    // 平移动画
    private void loadTranslateAnimation() {
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move_left_to_right));
    }

    // 旋转动画
    private void loadRotateAnimation() {
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate_one));
    }

    // 组合动画
    private void loadSetAnimation() {
        textView.startAnimation(AnimationUtils.loadAnimation(this, R.anim.move_and_scale));
    }
}
