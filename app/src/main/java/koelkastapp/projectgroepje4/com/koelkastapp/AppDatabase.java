package koelkastapp.projectgroepje4.com.koelkastapp;


import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

@Database(entities = {DataActivity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public static final String DB_NAME = "Products";
    public static final String TABLE_NAME = "Product";

    public abstract DataDao dataDao();

    private static AppDatabase INSTANCE;

    static AppDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class,
                            "Products")
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback sRoomDatabaseCallback =
            new RoomDatabase.Callback() {
        @Override
        public void onOpen (@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
            new PopulateDbAsync(INSTANCE).execute();
        }
    };


    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final DataDao mDao;

        PopulateDbAsync(AppDatabase db) {
            mDao = db.dataDao();
        }

        @Override
        protected Void doInBackground(final Void... params) {
            mDao.deleteAll();

            DataActivity dataActivity = new DataActivity (1 , "Ijs", "Zuivel", "Vriezer", "14-09-2020");
            mDao.insertDataActivity(dataActivity);

            DataActivity dataActivity1 = new DataActivity(2 , "Koffie", "Drinken", "Kast", "24-06-2024");
            mDao.insertDataActivity(dataActivity1);


            return null;

        }

    }



}