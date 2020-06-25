package by.iba.lesson_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button increment_Btn;
TextView tv_apchiCount;
int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        increment_Btn = findViewById(R.id.increment_btn);
        tv_apchiCount = findViewById(R.id.tv_count_apchi);
        increment_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
count++;
tv_apchiCount.setText(String.valueOf(count));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart", "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("OnStart", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("OnStart", "OnDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("OnStart", "OnRestart");
    }

    public void decrement(View view) {
        if (count > 0) {
            count--;
            tv_apchiCount.setText(String.valueOf(count));
        }else{
            tv_apchiCount.setText("Negodiya");
        }
    }
}