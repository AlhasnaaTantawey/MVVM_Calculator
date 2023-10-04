package azhar.graduated.calculatormvvmkotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ResultDao {

    @Insert
    fun insert(lastExpression: LastExpression)

    @Query("select * from  LastExpression order by result desc limit 1")
    fun getLastItem():LastExpression
}