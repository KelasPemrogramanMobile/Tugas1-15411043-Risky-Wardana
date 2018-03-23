package com.example.me.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

//    private EditText edName;
//    private EditText edNpm;
//    private EditText edTtl;
//    private Button button;
//    private TextView txtNama;
//    private TextView txtNpm;
//    private TextView txtTTL;

    @BindView(R.id.edName) EditText edName;
    @BindView(R.id.edNpm) EditText edNpm;
    @BindView(R.id.edTtl) EditText edTtl;

    @BindView(R.id.txtNama) TextView txtNama;
    @BindView(R.id.txtNpm) TextView txtNpm;
    @BindView(R.id.txtTTL) TextView txtTTL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


//        edName = (EditText)findViewById(R.id.edName);
//        edNpm = (EditText)findViewById(R.id.edNpm);
//        edTtl = (EditText)findViewById(R.id.edTtl);
//        button = (Button)findViewById(R.id.button);
//        txtNama    = (TextView)findViewById(R.id.txtNama);
//        txtNpm    = (TextView)findViewById(R.id.txtNpm);
//        txtTTL    = (TextView)findViewById(R.id.txtTTL);


//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String npm = edNpm.getText().toString();
//                String nama = edName.getText().toString();
//                String tlahir = edTtl.getText().toString();
//                String x = nama+" \n"+" \n"+npm+"\n "+tlahir;
//
//                Toast.makeText(getApplicationContext(),
//                        x,Toast.LENGTH_LONG).show();
//
//                txtNpm.setText(npm);
//                txtNama.setText(nama);
//                txtTTL.setText(tlahir);
//            }
//
//
//        });

    }
     @OnClick(R.id.button)
            public void tampil(){
                String npm = edNpm.getText().toString();
                String nama = edName.getText().toString();
                String tlahir = edTtl.getText().toString();
                String x = nama+"\n"+npm+"\n"+tlahir;

                Toast.makeText(getApplicationContext(), x, Toast.LENGTH_LONG).show();

                txtNpm.setText(npm);
                txtNama.setText(nama);
                txtTTL.setText(tlahir);
     }
}