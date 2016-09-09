package com.atirek.alm.mongodb;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.mongodb.DBObject;
import com.mongodb.client.MongoCollection;

import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    MongoCollection<Document> collection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        Log.d("Connection>>>", String.valueOf(MongoConnection.connection(MongoConnection.dbName)));
        //Log.d("Connection>>>", "Tables " + MongoConnection.fetchTables());
        collection = MongoConnection.fetchData("post");

        for (Document doc : collection.find()) {
            Log.d("Connection>>>", doc.toJson());
        }

        Log.d("Connection>>>", collection.count() + "");

    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
