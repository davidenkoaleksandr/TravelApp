import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class Places {
    @Entity(tableName = "Places")
    data class Places
        (
        @PrimaryKey(autoGenerate = true)
        var id:Int? = null,
        @ColumnInfo(name = "name")
        var name: String,
        @ColumnInfo(name = "info")
        var info: String,
        @ColumnInfo(name = "imageUrl")
        var imageUrl: String,
        )
}