import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

interface Dao  {
    @Insert
    fun insertPlace(places: Places)

    @Query("SELECT * FROM places")
    fun getAllPlaces():List<Places>

    @Query("DELETE FROM places")
    fun deletePlaces()

    @Delete
    fun delete(places: Places)
}