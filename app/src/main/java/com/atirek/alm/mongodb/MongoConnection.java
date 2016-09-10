package com.atirek.alm.mongodb;


import android.util.Log;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import org.bson.Document;

import java.util.ArrayList;


/**
 * Created by Alm on 9/9/2016.
 */
public class MongoConnection {

    public static String baseUrl = "mongodb://airtask:12345@54.255.168.165:27017/?authSource=admin";
    public static String dbName = "he_voice_app";

    public static MongoClientURI mongoClientURI;
    public static MongoClient mongoClient;

    public static MongoDatabase database;

    public static Gson gson = new Gson();

    public static ArrayList<Post> postList = new ArrayList<>();

    public static boolean connection(String dbName) {
        boolean check = false;
        try {
            mongoClientURI = new MongoClientURI(baseUrl);
            mongoClient = new MongoClient(mongoClientURI);
            database = mongoClient.getDatabase(dbName);
            System.out.println("Database " + database.getName());
            check = true;
        } catch (Exception e) {
            check = false;
        }
        return check;
    }

    public static ArrayList<Post> fetchData(String collectionName) {

        MongoCollection<Document> collection = database.getCollection(collectionName);

/*
        MongoCursor<Document> cursor = collection.find().iterator();
        try {
            while (cursor.hasNext()) {
                System.out.println(cursor.next().toJson());
            }
        } finally {
            cursor.close();
        }
*/

        int i = 0;
        for (Document doc : collection.find()) {
            try {
                i++;
                Post post = gson.fromJson(doc.toJson(), Post.class);
                postList.add(post);
                Log.d("Connection>>>", post.toString());
            } catch (Exception e) {
                Log.d("Connection>>>", "Error: " + doc.toJson() + " " + i);
            }
        }

        Log.d("Connection>>>", "Count: " + collection.count());

        return postList;

    }

    public static void fetchTables() {
        MongoIterable<String> tables = database.listCollectionNames();

        for (String table : tables) {
            Log.d("Connection>>>", "Table: " + table);
        }
    }

}
