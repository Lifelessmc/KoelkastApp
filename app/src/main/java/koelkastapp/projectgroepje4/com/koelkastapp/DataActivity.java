package koelkastapp.projectgroepje4.com.koelkastapp;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "product")
public class DataActivity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Pid")
    private int pid;

    @ColumnInfo(name = "Product")
    private String ProductName;

    @ColumnInfo(name = "Type")
    private String ProductType;

    @ColumnInfo(name = "BewaarPlek")
    private String BewaarPlek;

    @ColumnInfo(name = "HoudbaarheidsDatum")
    private String Date;

    public Integer getPid() {
        return this.pid;
    }

    public String getProductType() {
        return this.ProductType;
    }

    public String getBewaarPlek() {
        return this.BewaarPlek;
    }

    public String getDate() {
        return this.Date;
    }

    public String getProductName() {
        return this.ProductName;
    }

    public DataActivity(int pid, String ProductName, String ProductType, String BewaarPlek, String Date) {
        this.ProductName = ProductName;
        this.ProductType = ProductType;
        this.BewaarPlek = BewaarPlek;
        this.Date = Date;
        this.pid = pid;
    }


}
