package com.example.GreenDao.screen;

import android.app.Application;

import com.example.GreenDao.data.DaoMaster;
import com.example.GreenDao.data.DaoSession;

import org.greenrobot.greendao.database.Database;

public class AppGreenDao extends Application {
    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "macats-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;}

}
