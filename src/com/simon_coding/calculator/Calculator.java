package com.simon_coding.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
	private View button_1, button_2, button_3, button_4, button_5, 
	button_6, button_7, button_8, button_9, button_0, 
	button_poi, button_enter, button_plus, button_sub, button_mult, button_div;
	
	private TextView calcDisplay;
	
	private int calcMethod = -1;
	private float number1, number2, result;
	private boolean resultDisplayed = false;
	
	private static final int DIVIDE = 0;
	private static final int MULTIPLY = 1;
	private static final int SUBTRACT = 2;
	private static final int ADD = 3;
	
		
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        findViews();
        setListerners();
    }

	private void findViews() {
		button_7 = findViewById(R.id.button_7);
		button_8 = findViewById(R.id.button_8);
		button_9 = findViewById(R.id.button_9);
		button_div = findViewById(R.id.button_div);
		
		button_4 = findViewById(R.id.button_4);
		button_5 = findViewById(R.id.button_5);
		button_6 = findViewById(R.id.button_6);
		button_mult = findViewById(R.id.button_mult);
		
		button_1 = findViewById(R.id.button_1);
		button_2 = findViewById(R.id.button_2);
		button_3 = findViewById(R.id.button_3);
		button_sub = findViewById(R.id.button_sub);
		
		button_0 = findViewById(R.id.button_0);
		button_poi = findViewById(R.id.button_poi);
		button_enter = findViewById(R.id.button_enter);
		button_plus = findViewById(R.id.button_plus);
		
		calcDisplay = (TextView)findViewById(R.id.calc_display);
		
		Log.d("Calc", "Views found!");
	}
	private void setListerners() {
		button_7.setOnClickListener(this);
		button_8.setOnClickListener(this);
		button_9.setOnClickListener(this);
		button_div.setOnClickListener(this);
		
		button_4.setOnClickListener(this);
		button_5.setOnClickListener(this);
		button_6.setOnClickListener(this);
		button_mult.setOnClickListener(this);
		
		button_1.setOnClickListener(this);
		button_2.setOnClickListener(this);
		button_3.setOnClickListener(this);
		button_sub.setOnClickListener(this);
		
		button_0.setOnClickListener(this);
		button_poi.setOnClickListener(this);
		button_enter.setOnClickListener(this);
		button_plus.setOnClickListener(this);

		Log.d("Calc", "Listeners set!");
	}

	@Override
	public void onClick(View v) {
		Log.d("Calc", "Click recognized");
		switch(v.getId()){
		case R.id.button_0:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("0");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("0");
			}
			break;
		case R.id.button_1:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("1");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("1");
			}
			break;
		case R.id.button_2:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("2");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("2");
			}
			break;
		case R.id.button_3:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("3");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("3");
			}
			break;
		case R.id.button_4:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("4");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("4");
			}
			break;
		case R.id.button_5:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("5");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("5");
			}
			break;
		case R.id.button_6:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("6");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("6");
			}
			break;
		case R.id.button_7:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("7");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("7");
			}
			break;
		case R.id.button_8:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("8");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("8");
			}
			break;
		case R.id.button_9:
			if ((calcDisplay.getText().toString().trim().matches("0")) || (resultDisplayed)){
				calcDisplay.setText("9");
				resultDisplayed = false;
			}
			else {
				calcDisplay.append("9");
			}
			break;
		case R.id.button_poi:
			if (!((calcDisplay.getText().toString().trim().contains(".")) || (calcDisplay.getText().toString().trim().matches("")) || (resultDisplayed))){	
				calcDisplay.append(".");
			}
			break;
		case R.id.button_div:
			if (calcMethod == -1){
				calcMethod = DIVIDE;
				number1 = Float.valueOf(calcDisplay.getText().toString().trim());
				calcDisplay.setText("");
			}
			break;
		case R.id.button_mult:
			if (calcMethod == -1){
				calcMethod = MULTIPLY;
				number1 = Float.valueOf(calcDisplay.getText().toString().trim());
				calcDisplay.setText("");
			}
			break;
		case R.id.button_sub:
			if (calcMethod == -1){
				calcMethod = SUBTRACT;
				number1 = Float.valueOf(calcDisplay.getText().toString().trim());
				calcDisplay.setText("");
			}
			break;
		case R.id.button_plus:
			if (calcMethod == -1){
				calcMethod = ADD;
				number1 = Float.valueOf(calcDisplay.getText().toString().trim());
				calcDisplay.setText("");
			}
			break;
		case R.id.button_enter:
			if (calcMethod != -1){
				number2 = Float.valueOf(calcDisplay.getText().toString().trim());
				switch(calcMethod){
				case DIVIDE:
					result = number1 / number2;break;
				case MULTIPLY:
					result = number1 * number2;break;
				case SUBTRACT:
					result = number1 - number2;break;
				case ADD:
					result = number1 + number2;break;
				}
				calcDisplay.setText(Float.toString(result));
				resultDisplayed = true;
				calcMethod = -1;
			}
			break;
				
		}
		
	}

}