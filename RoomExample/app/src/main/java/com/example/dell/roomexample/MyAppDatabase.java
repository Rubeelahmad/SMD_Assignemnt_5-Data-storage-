package com.example.dell.roomexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Dell on 15-Oct-18.
 */
@Database(entities = {User.class },version=1)
public abstract class MyAppDatabase extends RoomDatabase {

    public abstract MyDao myDao();
}
