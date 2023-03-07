package mick.studio.donationx.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mick.studio.donationx.R
import mick.studio.donationx.databinding.CardDonateBinding
import mick.studio.donationx.models.DonationModel

class DonationAdapter constructor(private var donations: List<DonationModel>) : RecyclerView.Adapter<DonationAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = CardDonateBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val donation = donations[holder.adapterPosition]
        holder.bind(donation)
    }

    override fun getItemCount(): Int = donations.size

    inner class MainHolder(val binding : CardDonateBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(donation: DonationModel) {
            binding.paymentamount.text = donation.amount.toString()
            binding.paymentmethod.text = donation.paymentmethod
            binding.imageIcon.setImageResource(R.mipmap.ic_launcher_round)
        }
    }
}