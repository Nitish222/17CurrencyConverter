package nitish.example.com.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {
    Button Euro,Dollar,Pound,Yen,Dinar,Bitcoin,Swissfranc,Rand,CanadianDollar,AusDollar,Rubel,Thaibaht;
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Euro=findViewById(R.id.Euro);
        Dollar=findViewById(R.id.Dollar);
        Pound=findViewById(R.id.Pound);
        Yen=findViewById(R.id.Yen);
        Dinar=findViewById(R.id.Dinar);
        Bitcoin=findViewById(R.id.Bitcoin);
        Swissfranc=findViewById(R.id.Swissfranc);
        Rand=findViewById(R.id.Rand);
        CanadianDollar=findViewById(R.id.CanadianDollar);
        AusDollar=findViewById(R.id.AusDollar);
        Rubel=findViewById(R.id.Rubel);
        Thaibaht=findViewById(R.id.Thaibaht);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);

        Euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string

                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.013;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);not professional way :)

                }
            }
        });
        Dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.014;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.011;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*1.59;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.0043;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.0000037;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Swissfranc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.014;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.20;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        CanadianDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.019;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        AusDollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.020;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.94;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
        Thaibaht.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString(); //taking input from user and converting to string if user enter a symbol the app can crash so we use string
                if(TextUtils.isEmpty(z)){                 //textutil are used to pop up red error message
                    editText.setError("Empty User Input");
                }
                else {
                    double n,k;
                    n=Double.parseDouble(z);              // converting back to double from string
                    textView.setText(null);               //making text view empty
                    Formatter formatter = new Formatter();//used for format value some devices give priority , it is a java class
                    k = n*0.45;
                    DecimalFormat numberFormat = new DecimalFormat("#.00");// only two place after decimal
                    textView.setText(""+numberFormat.format(k));
                    //textView.setText(""+k);//not professional way :)

                }
            }
        });
    }
}
