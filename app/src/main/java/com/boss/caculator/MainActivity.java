package com.boss.caculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button btnPlus,btnMinus,btnMulti,btnDiv,btnAC;
    EditText InputNumOne;
    EditText InputNumTwo;
    TextView Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlus = (Button)findViewById(R.id.btn_plus);
        btnMinus = (Button)findViewById(R.id.btn_minus);
        btnMulti = (Button)findViewById(R.id.btn_multi);
        btnDiv = (Button)findViewById(R.id.btn_div);
        btnAC = (Button)findViewById(R.id.btn_ac);
        Result = (TextView)findViewById(R.id.result);
        InputNumOne = (EditText)findViewById(R.id.numOne);
        InputNumTwo = (EditText)findViewById(R.id.numTwo);
        btnPlus.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnAC.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.btn_plus:
                try{
                    float plus_numone = Float.parseFloat(InputNumOne.getText().toString());
                    float plus_numtwo = Float.parseFloat(InputNumTwo.getText().toString());
                    float plus_answer = plus_numone + plus_numtwo;
                    Result.setText(Float.toString(plus_answer));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_minus:
                try {
                    float minus_numone = Float.parseFloat(InputNumOne.getText().toString());
                    float minus_numtwo = Float.parseFloat(InputNumTwo.getText().toString());
                    float minus_answer = minus_numone - minus_numtwo;
                    Result.setText(Float.toString(minus_answer));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btn_multi:
                try{
                    float multi_numone = Float.parseFloat(InputNumOne.getText().toString());
                    float multi_numtwo = Float.parseFloat(InputNumTwo.getText().toString());
                    float multi_answer = multi_numone * multi_numtwo;
                    Result.setText(Float.toString(multi_answer));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_div:
                try{
                    float div_numone = Float.parseFloat(InputNumOne.getText().toString());
                    float div_numtwo = Float.parseFloat(InputNumTwo.getText().toString());
                    float div_answer = div_numone / div_numtwo;
                    Result.setText(Float.toString(div_answer));
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.btn_ac:
                InputNumOne.setText("");
                InputNumTwo.setText("");
                Result.setText("");
                break;


        }
    }
}
