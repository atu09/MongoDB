package com.atirek.alm.mongodb;

import android.util.Log;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.WriteConcern;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alm on 9/9/2016.
 */
public class MongoConnection {

    public static String baseUrl = "mongodb://airtask:12345@54.255.168.165:27017/admin";
    public static String dbName = "he_voice_app";

    public static MongoClientURI mongoClientURI;
    public static MongoClient mongoClient;

    public static DBCollection dbCollection;
    public static List<DBObject> dbObjectList = new ArrayList<>();

    public static DB database;

    private static MongoConnection instance = null;

    public static MongoConnection getInstance() {
        if (instance == null) {
            instance = new MongoConnection();
        }
        return instance;
    }


    public boolean connection(String dbName) {
        boolean check = false;
        try {
            mongoClientURI = new MongoClientURI(baseUrl);
            mongoClient = new MongoClient(mongoClientURI);
            mongoClient.setWriteConcern(WriteConcern.SAFE);
            database = mongoClient.getDB(dbName);
            check = true;
        } catch (Exception e) {
            check = false;
        }
        return check;
    }

    public DBObject fetchData(String collectionName, String key, String value) {

        dbCollection = database.getCollection(collectionName);
        BasicDBObject query = new BasicDBObject();
        query.put(key, value);
        DBObject dbObject = dbCollection.findOne(query);
        return dbObject;

    }

    public List<DBObject> fetchList(String collectionName) {

        getInstance();
        dbCollection = database.getCollection(collectionName);
        dbObjectList = dbCollection.find().toArray();

        return dbObjectList;
    }

}
