package com.atirek.alm.mongodb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mongodb.DBObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    MongoConnection connection = new MongoConnection();
    List<DBObject> dbObjectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Connection>>>", String.valueOf(connection.connection(MongoConnection.dbName)));

        dbObjectList = connection.fetchList("post");

        Log.d("Connection>>>",dbObjectList.toString());

    }
}
