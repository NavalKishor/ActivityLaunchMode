package com.androidjavapoint.singletop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity implements View.OnClickListener {

    private String TAG = this.getClass().getSimpleName();
    private StringBuilder mCalledLifeCycleMethods;
    private TextView mCalledLifeCycleMethodsText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        mCalledLifeCycleMethods = new StringBuilder();

        mCalledLifeCycleMethodsText = (TextView) findViewById(R.id.textLifeCycle);

        findViewById(R.id.buttonGoToB).setOnClickListener(this);
        findViewById(R.id.buttonGoToC).setOnClickListener(this);
        findViewById(R.id.buttonGoToD).setOnClickListener(this);
        findViewById(R.id.buttonGoToE).setOnClickListener(this);



        updateLifeCycleMethod("Called OnCreate()");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        updateLifeCycleMethod("Called onNewIntent()");
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
            case R.id.buttonGoToB:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.buttonGoToC:
                startActivity(new Intent(this, ActivityC.class));
                break;
            case R.id.buttonGoToD:
                startActivity(new Intent(this, ActivityD.class));
                break;
            case R.id.buttonGoToE:
                startActivity(new Intent(this, ActivityE.class));
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
