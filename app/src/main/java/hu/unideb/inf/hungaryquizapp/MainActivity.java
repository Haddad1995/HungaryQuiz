package hu.unideb.inf.hungaryquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Modelclass> listOfQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listOfQ=new ArrayList<>();
        listOfQ.add(new Modelclass("What is the national animal of Hungary?","Mangalica pig","Red deer","Hungarian Vizsla","Turul","Turul"));
        listOfQ.add(new Modelclass("How many world heritage sites are there in Hungary?","5","10","8","15","8"));
        listOfQ.add(new Modelclass("What is the capital of Hungary?","Miskolc","Budapest","Esztergom","Debrecen","Budapest"));
        listOfQ.add(new Modelclass("How many people are living in Hungary?","17.8 million","7.8 million","11.6 million","9.6 million","9.6 million"));
        listOfQ.add(new Modelclass("What is Tokaj famous for?","Sausage","Wine","Underground night clubs","A local tribe living in small wooden houses","Wine"));
        listOfQ.add(new Modelclass("Which is the highest mountain in Hungary?","Kékes","Csóványos","Nagy-Milic","Zengő","Kékes"));
        listOfQ.add(new Modelclass("Which is the largest lake in Hungary?","Balaton","Lake Neusiedl","Donau","Héviz","Balaton"));
        listOfQ.add(new Modelclass("What currency is used in Hungary?","Hungarian crowns","Euro","Forint","Pengő","Forint"));
        listOfQ.add(new Modelclass("Who was the last king of Hungary?","Béla IV","Attila the hun","Charles IV","Sigismund III","Charles IV"));
        listOfQ.add(new Modelclass("Where in Hungary is this massive basilica located?","Szeged","Budapest","Eger","Esztergom","Esztergom"));
        listOfQ.add(new Modelclass("Who is the current prime minister?","Viktor Orbán","Sándor Pintér","Gordon Bajnai","Péter Medgyessy","Viktor Orbán"));
        listOfQ.add(new Modelclass("What is Hungary called in Hungarian?","Hungaro","Magyar Republika","Magyarváros","Magyarország","Magyarország"));
        listOfQ.add(new Modelclass("How many countries does Hungary share a border with?","7","6","4","3","7"));
        listOfQ.add(new Modelclass("How do you say hello in Hungarian?","Szép","Cześć","Szia","Viszontlátásra","Szia"));
        listOfQ.add(new Modelclass("What is the name of the Hungarian national anthem?","Akkor szép az erdő","Magayarok","Sok születésnapokat","Himnusz","Himnusz"));
        listOfQ.add(new Modelclass("How large is Hungary?","93.030 km2","312.696 km2","112.696 km2","193.030 km2","93.030 km2"));
        listOfQ.add(new Modelclass("What year was the Kingdom of Hungary founded?","1000","1225","1900","1147","1000"));
        listOfQ.add(new Modelclass("When did Hungarians arrive in Europe?","9th century","15th century","11th century","4th century","9th century"));
        listOfQ.add(new Modelclass("Who are the Csikós?","Mounted horse-herdsman","Hungarian wizards","Hungarian paprika-producers","Hungarian soldiers on horse","Mounted horse-herdsman"));
        listOfQ.add(new Modelclass("When did Hungary join the European Union?","2007","2004","2003","1998","2004"));

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        },1500);
    }
}