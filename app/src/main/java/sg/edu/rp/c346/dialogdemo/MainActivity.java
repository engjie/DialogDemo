package sg.edu.rp.c346.dialogdemo;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Button btnDemo1;
    TextView tvDemo2;
    Button btnDemo2;
    Button btnDemo3;
    TextView tvDemo3;
    Button btnExercise;
    Button btnDemo4;
    TextView tvDemo4;
    Button btnDemo5;
    TextView tvDemo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDemo1 = findViewById(R.id.buttonDemo1);
        btnDemo2 = findViewById(R.id.buttonDemo2);
        tvDemo2 = findViewById(R.id.textViewDemo2);
        btnDemo3 = findViewById(R.id.buttonDemo3);
        tvDemo3 = findViewById(R.id.textViewDemo3);
        btnExercise = findViewById(R.id.buttonExercise);
        btnDemo4 = findViewById(R.id.buttonDemo4);
        tvDemo4 = findViewById(R.id.textViewDemo4);
        btnDemo5 = findViewById(R.id.buttonDemo5);
        tvDemo5 = findViewById(R.id.textViewDemo5);


        btnDemo2.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                //create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);


                myBuilder.setTitle("Demo 2 Buttons Dialog");

                //set the message to display
                myBuilder.setMessage("Select one of the Button below.");
                myBuilder.setCancelable(false);

                //set listener to be invoked when the positive button of the dialog is pressed
                myBuilder.setPositiveButton("Positive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvDemo2.setText("You have selected Positive.");
                    }
                });

                myBuilder.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        tvDemo2.setText("You have selected Negative.");
                    }
                });


                //configure the neutral button

                myBuilder.setNeutralButton("Cancel", null);

                AlertDialog myDialog = myBuilder.create();

                myDialog.show();


            }

        });


        btnDemo3.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //inflate the input.xml layout file
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input, null);

                //obtain the UI component in the input.xml layout
                //it need to be defined as "final", so that it can be used in  the onClick() method later

                final EditText etInput = viewDialog.findViewById(R.id.editTextInput);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setView(viewDialog); // set the view of the dialog
                myBuilder.setTitle("Demo 3-Text Input Dialog");
                myBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //extract the text enter by user
                        String message = etInput.getText().toString();

                        //set text to the TextView
                        tvDemo3.setText(message);
                    }
                });
                myBuilder.setNegativeButton("CANCEL",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();




            }

        });



        btnExercise.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //inflate the input.xml layout file
                LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View viewDialog = inflater.inflate(R.layout.input, null);

                //obtain the UI component in the input.xml layout
                //it need to be defined as "final", so that it can be used in  the onClick() method later

                final EditText etInput = viewDialog.findViewById(R.id.editTextInput);
                final EditText etInput2 = viewDialog.findViewById(R.id.editTextInput2);

                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);
                myBuilder.setView(viewDialog); // set the view of the dialog
                myBuilder.setTitle("Exercise 3");
                myBuilder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //extract the text enter by user
                        String message = etInput.getText().toString();
                        String message1 = etInput2.getText().toString();

                        //set text to the TextView
                        tvDemo3.setText(message + message1);
                    }
                });
                myBuilder.setNegativeButton("CANCEL",null);
                AlertDialog myDialog = myBuilder.create();
                myDialog.show();




            }

        });




        btnDemo4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //create the Listener to set the date

                DatePickerDialog.OnDateSetListener myDateListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                        tvDemo4.setText("Date:"+ dayOfMonth+"/"+(monthOfYear+1)+"/" + year);

                    }
                };

                //create the Datepicker Dialog
                DatePickerDialog myDateDialog = new DatePickerDialog(MainActivity.this, myDateListener,2018,6,30);
                myDateDialog.show();







            }

        });




        btnDemo5.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                //create the Listener to set the date

                TimePickerDialog.OnTimeSetListener myTimeListener = new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view , int hourOfDay, int minute) {
                        tvDemo5.setText("Time:"+hourOfDay+":"+minute);

                    }
                };

                //create the Datepicker Dialog
                TimePickerDialog myTimeDialog = new TimePickerDialog(MainActivity.this, myTimeListener,20,00,true);
                myTimeDialog.show();







            }

        });







        btnDemo1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                //create the dialog builder
                AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

                //set the dialog details

                //set the title displayed in dialog
               /*myBuilder.setTitle("Demo 1-Simple Dialog");

               //set the message to display
               myBuilder.setMessage("I can develop Android app");
               myBuilder.setCancelable(false);

               //set listener to be invoked when the positive button of the dialog is pressed
               myBuilder.setPositiveButton("Close",null);

               AlertDialog myDialog = myBuilder.create();
               */

                myBuilder.setTitle("Congratulation");

                //set the message to display
                myBuilder.setMessage("You have completed a simple Dialog Box");
                myBuilder.setCancelable(false);

                //set listener to be invoked when the positive button of the dialog is pressed
                myBuilder.setPositiveButton("DISMISS", null);

                AlertDialog myDialog = myBuilder.create();

                myDialog.show();


            }

        });
    }
}



