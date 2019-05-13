package com.tarkalabs.firebaseanalytics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private FirebaseAnalytics mFirebaseAnalytics;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    findViewById(R.id.button1).setOnClickListener(this);
    findViewById(R.id.button2).setOnClickListener(this);
    findViewById(R.id.button3).setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    Bundle bundle = new Bundle();

    switch (v.getId()) {
      case R.id.button1:
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "1");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button1");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "text");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        break;
      case R.id.button2:
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "2");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button2");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "text");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        break;
      case R.id.button3:
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, "3");
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, "Button3");
        bundle.putString(FirebaseAnalytics.Param.CONTENT_TYPE, "text");
        mFirebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT, bundle);
        break;
    }
  }
}
