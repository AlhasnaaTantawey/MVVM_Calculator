package azhar.graduated.calculatormvvmkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import azhar.graduated.calculatormvvmkotlin.databinding.ActivityAllOperationsBinding

class AllOperationsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllOperationsBinding
    private lateinit var myviewModel: AllOperationsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAllOperationsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myviewModel= ViewModelProvider(this).get(AllOperationsViewModel::class.java)

        val recyclerview=  binding.recyclerview
        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)
        // var myviewModel = ViewModelProvider(this).get(HistoryViewModel::class.java)
        myviewModel.list.observe(this){
            var adapter= MyRecyclerViewAdapter(it)
            // Setting the Adapter with the recyclerview
            recyclerview.adapter=adapter
    }}
}