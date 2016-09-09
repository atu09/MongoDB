package com.atirek.alm.mongodb;

import android.util.Log;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import org.bson.Document;
import org.bson.conversions.Bson;


/**
 * Created by Alm on 9/9/2016.
 */
public class MongoConnection {

    public static String baseUrl = "mongodb://airtask:12345@54.255.168.165:27017/?authSource=admin";
    public static String dbName = "he_voice_app";

    public static MongoClientURI mongoClientURI;
    public static MongoClient mongoClient;

    public static MongoCollection<Document> collection;

    public static MongoDatabase database;

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

    public static MongoCollection<Document> fetchData(String collectionName) {

        //collection = database.getCollection(collectionName);

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

        return database.getCollection(collectionName);

    }

    public static String fetchTables() {
        return database.listCollectionNames().toString();
    }

}
