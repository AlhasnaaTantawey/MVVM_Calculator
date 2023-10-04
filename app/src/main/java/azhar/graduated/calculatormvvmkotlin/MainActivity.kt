package azhar.graduated.calculatormvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
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

        binding.mainActivityButton0.text="yuyyu"
        binding.mainActivityButton0.length()

//  var x=      binding.mainActivityButton0.apply {
//            this.text="juuy"
//            this.length()
//      3
//
//        }
//
//        var w=      binding.mainActivityButton0.let {
//            it.text="juuy"
//            it.length()
//            "yuy"
//
//        }
    }



    fun Button1Action(view: View) {
        viewModel.number1OnClick()
    }

    fun Button7Action(view: View) {
        viewModel.number7OnClick()
    }
    fun Button8Action(view: View) {
        viewModel.number8OnClick()
    }
    fun Button9Action(view: View) {
        viewModel.number9OnClick()
    }
    fun Button4Action(view: View) {
        viewModel.number4OnClick()
    }
    fun Button5Action(view: View) {
        viewModel.number5OnClick()
    }
    fun Button6Action(view: View) {
        viewModel.number6OnClick()
    }
    fun Button2Action(view: View) {
        viewModel.number2OnClick()
    }
    fun Button3Action(view: View) {
        viewModel.number3OnClick()
    }

    fun plusAction(view: View) {
        viewModel.plusOnClick()
    }
    fun equalAction(view: View) {
        viewModel.equalOnClick()
    }

    fun bnplusMinusButtonAction(view: View) {
viewModel.plusOnClick()
    }
}