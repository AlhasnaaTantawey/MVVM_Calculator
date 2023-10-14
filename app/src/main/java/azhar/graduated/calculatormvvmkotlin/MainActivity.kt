package azhar.graduated.calculatormvvmkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import azhar.graduated.calculatormvvmkotlin.databinding.ActivityMainBinding

lateinit var binding:ActivityMainBinding
lateinit var  viewModel: MainViewModel
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        viewModel.outPutLiveData.observe(this){
            binding.textViewInputText.text=it
        }


        viewModel.lastExpression.observe(this){
            binding.textViewOutputresult.text=it.result
        }

        binding.mainActivityImageButton.setOnClickListener{

            val intent=Intent(this,AllOperationsActivity::class.java)
           startActivity(intent)
        }

}

    fun Button5Action(view: View) {
        viewModel.number5OnClick()
    }

    fun plusAction(view: View) {
        viewModel.plusOnClick()
    }
    fun btSubtractionOpEvent(view: View) {

    }
    fun btMultiplicationOpEvent(view: View) {

    }
    fun btDivisionOpEvent(view: View) {}
    fun Button9Action(view: View) {
        viewModel.number9OnClick()
    }
    fun Button8Action(view: View) {
        viewModel.number8OnClick()
    }
    fun Button7Action(view: View) {
        viewModel.number7OnClick()
    }
    fun Button6Action(view: View) {
        viewModel.number6OnClick()
    }
    fun Button4Action(view: View) {
        viewModel.number4OnClick()
    }
    fun Button3Action(view: View) {
        viewModel.number3OnClick()
    }
    fun Button2Action(view: View) {
        viewModel.number2OnClick()
    }
    fun Button1Action(view: View) {
        viewModel.number1OnClick()
    }
    fun Button0Action(view: View) {
        viewModel.numberZeroOnClick()
    }
    fun equalAction(view: View) {
        viewModel.equalOnClick()
    }
}