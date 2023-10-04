package azhar.graduated.calculatormvvmkotlin

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [LastExpression::class], version = 1)
 abstract class ResultRoomDatabase :RoomDatabase() {

    abstract fun resultDao() :ResultDao
}