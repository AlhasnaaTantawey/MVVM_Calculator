package azhar.graduated.calculatormvvmkotlin

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ResultDao {

    @Insert
    fun insert(lastExpression: LastExpression)

    @Query("select * from  LastExpression order by result ASC limit 1")
    fun getLastItem():LiveData<LastExpression>
}