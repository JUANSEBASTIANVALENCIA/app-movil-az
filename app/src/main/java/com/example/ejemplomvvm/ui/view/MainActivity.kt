package com.example.ejemplomvvm.view


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.ejemplomvvm.databinding.ActivityMainBinding
import com.example.ejemplomvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    private val quoteViewModel:QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { currenQuote ->
            binding.TexViewQuote.text = currenQuote.quote
            binding.TexViewAuthor.text = currenQuote.author
        })

        binding.viewContainer.setOnClickListener{
            quoteViewModel.randomQuote()
        }

    }
}