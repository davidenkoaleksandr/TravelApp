import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Places::class], version = 1)

abstract class DbPlaces:RoomDatabase(){
    abstract fun getDao():Dao
    companion object{
        fun getDb(context: Context):DbPlaces
        {
            return Room.databaseBuilder(
                context.applicationContext,
                DbPlaces::class.java,
                "places.db"
            ).build()
        }
    }
}