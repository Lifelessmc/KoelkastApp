package koelkastapp.projectgroepje4.com.koelkastapp;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class DataRepository {

    private DataDao mDataDao;
    private LiveData<List<DataActivity>> mAllWords;

    DataRepository(Application application) {
        AppDatabase db = AppDatabase.getDatabase(application);
        mDataDao = db.dataDao();
        mAllWords = mDataDao.fetchAllData();
    }

    LiveData<List<DataActivity>> getAllWords() {
        return mAllWords;
    }
    public void insertDataActivity(DataActivity dataActivity) {
        new insertAsyncTask(mDataDao).execute(dataActivity);
    }

    private static class insertAsyncTask extends AsyncTask<DataActivity, Void, Void> {
        private DataDao mAsyncTaskDao;

        insertAsyncTask(DataDao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final DataActivity... params) {
            mAsyncTaskDao.insertDataActivity(params[0]);
            return null;
        }
    }

}
