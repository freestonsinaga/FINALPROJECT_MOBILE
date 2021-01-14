package com.example.melodiamusik.ui.bass

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R


class BassFragment : Fragment() {

    private lateinit var BassViewModel: BassViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.bass_fragment, container, false)
        val testData = createBassData()
        root.findViewById<RecyclerView>(R.id.BassRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.BassRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.BassRV).adapter = BassAdapter(testData, {  BassItem: BassData -> BassItemClicked(BassItem)})
        return root
    }

    private fun BassItemClicked(BudayaData: BassData) {
        val showDetailActivity = Intent(context, BassDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, BudayaData.BassPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, BudayaData.BassNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, BudayaData.BassDeskripsi.toString())
        startActivity(showDetailActivity)
    }


    private fun createBassData() : List<BassData> {
        val partList = ArrayList<BassData>()
        partList.add(BassData(R.drawable.b9,
                "Ibanez Talman TMB100M",
                "Rp. 21.750.000",
                "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- "

        ))
        partList.add(BassData(R.drawable.b2,
                "Fender Mustang Bass PJ",
                "Rp. 17.200.000",
                "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle"

        ))
        partList.add(BassData(R.drawable.b7,
                "SR Mezzo SRMD200",
                "Rp. 16.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",


                ))
        partList.add(BassData(R.drawable.b4,
                "Yamaha BB434",
                "Rp. 16.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",


                ))
        partList.add(BassData(R.drawable.b2,
                "Fender Standart Jazz Bass",
                "15.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",

                ))
        partList.add(BassData(R.drawable.b6,
                "Schecter Omen-4 ",
                "14.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",

                ))
        partList.add(BassData(R.drawable.b7,
                "Gretsch G2220",
                "13.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",

                ))
        partList.add(BassData(R.drawable.b8,
                "Sterling ray4",
                "11.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",

                ))
        partList.add(BassData(R.drawable.b9,
                "Cort Action Bass v plus ",
                "6.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",
        ))
        partList.add(BassData(R.drawable.b4,
                "Yamaha TRBX305",
                "9.200.000",
                "Speck:\n" +
                        "- Neck mahoni\n" +
                        "- Sudah ada besi didalam neck\n" +
                        "- Back side dan Body Meranty\n" +
                        "- Fretboard dan bridge :rosewood\n" +
                        "- Dryer grover\n" +
                        "- Fret baja\n" +
                        "- Finishing glosy\n" +
                        "- Sudah ada pin,buat tempat sabuk tali gitar\n" +
                        "- List gading\n" +
                        "- Senar castle",

                ))
        return partList
    }
}