package azhar.graduated.calculatormvvmkotlin

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.room.Room

class AllOperationsViewModel(application: Application) :AndroidViewModel(application) {

    val db:ResultRoomDatabase= Room.databaseBuilder(getApplication<Application>().applicationContext,
        ResultRoomDatabase::class.java,"mydatabase"
    ).allowMainThreadQueries().build()

    var list = MutableLiveData<List<LastExpression>>()
    init {
        list.value=db.resultDao().getAllExpression()
    }
}