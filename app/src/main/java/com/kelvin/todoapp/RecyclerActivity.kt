package com.kelvin.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kelvin.todoapp.adapter.CountryAdapter
import com.kelvin.todoapp.databinding.ActivityRecyclerBinding
import com.kelvin.todoapp.models.Country
import kotlinx.android.synthetic.main.country_item.*

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myCountryAdapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(
            Country(
                R.drawable.ic__brazil,
                "Brazil",
                "America",
                40L
            ),
            Country(
                R.drawable.ic_usa,
                "America",
                "North America",
                45L
            ),
            Country(
                R.drawable.ic_uk,
                "United Kingdom",
                "Europe",
                30L
            )
        )
        myCountryAdapter = CountryAdapter(countries)
        binding.countryRecyclerView.adapter=myCountryAdapter
    }
}