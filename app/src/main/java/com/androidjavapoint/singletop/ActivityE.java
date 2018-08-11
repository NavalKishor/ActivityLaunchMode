package com.androidjavapoint.singletop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ActivityE extends AppCompatActivity implements View.OnClickListener {

    private String TAG = this.getClass().getSimpleName();
    private StringBuilder mCalledLifeCycleMethods;
    private TextView mCalledLifeCycleMethodsText;
    private TextView mTextReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e);

        mCalledLifeCycleMethods = new StringBuilder();

        mCalledLifeCycleMethodsText = (TextView) findViewById(R.id.textLifeCycle);
        mTextReview = (TextView) findViewById(R.id.textReview);
       // mTextReview.setText(R.string.goToA);

        findViewById(R.id.buttonRelaunch).setOnClickListener(this);
        findViewById(R.id.buttonGoToC).setOnClickListener(this);
        findViewById(R.id.buttonGoToB).setOnClickListener(this);
        findViewById(R.id.buttonGoToA).setOnClickListener(this);

        updateLifeCycleMethod("Called OnCreate()");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        updateLifeCycleMethod("Called onNewIntent()");
        mTextReview.setText(getString(R.string.activity_d_updated_review));
    }

    @Override
    protected void onPause() {
        super.onPause();
        updateLifeCycleMethod("Called onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        updateLifeCycleMethod("Called onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        updateLifeCycleMethod("Called onDestroy()");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonRelaunch:
                startActivity(new Intent(this, ActivityD.class));
                break;
            case R.id.buttonGoToC:
                startActivity(new Intent(this, ActivityC.class));
                break;
            case R.id.buttonGoToB:
                startActivity(new Intent(this, ActivityB.class));
                break;

            case R.id.buttonGoToA:
                startActivity(new Intent(this, ActivityA.class));
                break;
        }
    }

    /**
     * Update the text view
     *
     * @param method activity life cycle method name
     */
    private void updateLifeCycleMethod(String method) {
        mCalledLifeCycleMethods.append(TAG).append(" : ").append(method).append("\n");
        mCalledLifeCycleMethodsText.setText(mCalledLifeCycleMethods.toString());
    }
}
