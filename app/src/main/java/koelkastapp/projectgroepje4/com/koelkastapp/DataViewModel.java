package koelkastapp.projectgroepje4.com.koelkastapp;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class DataViewModel extends AndroidViewModel {

    private DataRepository mRepository;
    private LiveData<List<DataActivity>> mAllWords;

    public DataViewModel (Application application) {
        super(application);
        mRepository = new DataRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    LiveData<List<DataActivity>> getAllWords() { return mAllWords; }
    public void insertDataActivity(DataActivity dataActivity) {
        mRepository.insertDataActivity(dataActivity);
    }
}

