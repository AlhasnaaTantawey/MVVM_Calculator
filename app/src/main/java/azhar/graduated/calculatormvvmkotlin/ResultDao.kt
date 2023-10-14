package azhar.graduated.calculatormvvmkotlin

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ResultDao {

    @Insert
    fun insert(lastExpression: LastExpression)

    @Query("select * from  LastExpression order by result asc limit 1")
    fun getLastItem():LiveData<LastExpression>

    @Query("select * from LastExpression")
      fun getAllExpression() :List<LastExpression>
}