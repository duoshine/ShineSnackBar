package cn.chenad.shinesnackbar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button show = findViewById(R.id.snackbar1);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Snackbar snackbar = Snackbar.make(show, "你有女朋友吗", Snackbar.LENGTH_INDEFINITE);
                XSnackbar.addViewToSnackbar(snackbar, R.layout.snackbar_button);
                XSnackbar.SetAction1(snackbar, R.id.no, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(show, "....", Snackbar.LENGTH_LONG).show();
                    }
                });

                XSnackbar.SetAction2(snackbar, R.id.affirmNo, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(show, "....", Snackbar.LENGTH_LONG).show();
                    }
                });
                snackbar.show();
            }
        });
    }
}
