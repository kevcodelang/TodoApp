package com.kelvin.todoapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kelvin.todoapp.databinding.CountryItemBinding
import com.kelvin.todoapp.models.Country

class CountryAdapter(val countries: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    class CountryViewHolder(var binding: CountryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun blind(country: Country) {
            binding.continent.text = country.continent
            binding.countryName.text = country.name
            binding.population.text = country.population.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return countries.size
    }

}