package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fruits = listOf(
            Fruit("Apple"),
            Fruit("Banana"),
            Fruit("Orange"),
            Fruit("Mango"),
            Fruit("Grapes"),
        )

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = FruitAdapter(fruits)
    }
}