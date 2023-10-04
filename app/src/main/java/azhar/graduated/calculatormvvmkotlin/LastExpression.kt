package azhar.graduated.calculatormvvmkotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LastExpression(
    @PrimaryKey(autoGenerate = true)
    val id:Int=0 ,

 @ColumnInfo
    val result:String
)
