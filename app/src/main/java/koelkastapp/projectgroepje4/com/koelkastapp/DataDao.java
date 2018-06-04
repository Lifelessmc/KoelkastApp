package koelkastapp.projectgroepje4.com.koelkastapp;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface DataDao {

    @Insert
    void insertDataActivity(DataActivity dataActivity);

    @Insert
    void insertDataActivityList(List<DataActivity> DataActivityList);


    @Query("SELECT COUNT(Pid) FROM product")
    int Rows();

    @Query("SELECT * FROM product")
    LiveData<List<DataActivity>> fetchAllData();

    @Query("DELETE FROM product")
    void deleteAll();
}
