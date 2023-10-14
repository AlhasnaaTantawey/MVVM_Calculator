package azhar.graduated.calculatormvvmkotlin

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Room

class MainViewModel(application: Application):AndroidViewModel(application) {

   private var currentNumber = MutableLiveData<String>("")
    private var resultNumber = MutableLiveData<String>("")
     var outPutLiveData = MediatorLiveData<String>()
    var lastExpression:LiveData<LastExpression>
    var publicCurrentNumber:LiveData<String> =currentNumber
  private  var  firstNumber = 0
 private   var secondNumber = 0
    private  var operation =""
    val db:ResultRoomDatabase=Room.databaseBuilder(getApplication<Application>().applicationContext,
        ResultRoomDatabase::class.java,"mydatabase"
    ).allowMainThreadQueries().build()

    init {

        outPutLiveData.addSource(currentNumber){
            outPutLiveData.value=it
        }
        outPutLiveData.addSource(resultNumber){
            outPutLiveData.value=it
        }

        lastExpression= db.resultDao().getLastItem()
    }

    fun plusOnClick(){

          currentNumber.value?.let {
             firstNumber=it.toInt()
          }
      // firstNumber= currentNumber.value?.toInt() ?: 0
        currentNumber.value=""
        operation="+"
    }


  fun equalOnClick(){
      secondNumber=currentNumber.value?.toInt() ?: 0
      currentNumber.value=" "
      when(operation){
          "+" -> resultNumber.value=(firstNumber+secondNumber).toString()
      }

       val lastExp=LastExpression(result = "$firstNumber$operation$secondNumber=${resultNumber.value}")
      db.resultDao().insert(lastExp)
  }



    fun number1OnClick() {
        currentNumber.value="${currentNumber.value}1"

    }
    fun number2OnClick(){
        currentNumber.value="${currentNumber.value}2"
    }
    fun number3OnClick(){
        currentNumber.value="${currentNumber.value}3"
    }
    fun number4OnClick(){
        currentNumber.value="${currentNumber.value}4"
    }
    fun number5OnClick(){
        currentNumber.value="${currentNumber.value}5"
    }
    fun number6OnClick(){
        currentNumber.value="${currentNumber.value}6"
    }
    fun number7OnClick(){
        currentNumber.value="${currentNumber.value}7"
    }

    fun number8OnClick(){
        currentNumber.value="${currentNumber.value}8"
    }

    fun number9OnClick(){
        currentNumber.value="${currentNumber.value}9"
    }

    fun numberZeroOnClick(){
        currentNumber.value="${currentNumber.value}0"
    }

}