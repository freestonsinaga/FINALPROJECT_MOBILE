package com.example.melodiamusik.ui.keyboard


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R
import com.example.melodiamusik.ui.gitar.GitarData

class KeyboardFragment : Fragment() {

    private lateinit var KeyboardViewModel: KeyboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.keyboard_fragment, container, false)
        val testData = createKeyboardData()
        root.findViewById<RecyclerView>(R.id.KeyboardRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.KeyboardRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.KeyboardRV).adapter = KeyboardAdapter(testData, { KeyboardItem: KeyboardData ->KeyboardItemClicked(KeyboardItem)})
        return root
    }

    private fun KeyboardItemClicked(KeyboardData: KeyboardData) {
        val showDetailActivity = Intent(context, KeyboardDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, KeyboardData.KeyboardPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, KeyboardData.KeyboardNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, KeyboardData.KeyboardHarga.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, KeyboardData.KeyboardDeskripsi.toString())
        startActivity(showDetailActivity)
    }


    private fun createKeyboardData() : List<KeyboardData> {
        val partList = ArrayList<KeyboardData>()
        partList.add(KeyboardData(R.drawable.k1,
                "Yamaha Portable PSR F51" ,
                "Rp. 750.000",
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
        partList.add(KeyboardData(R.drawable.k2,
                "Casio Arranger CTK 2400",
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
        partList.add(KeyboardData(R.drawable.k3,
                "Korg Krome 61",
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
        partList.add(KeyboardData(R.drawable.k4,
                "Samson Carbon 49",
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
        partList.add(KeyboardData(R.drawable.k5,
                "Samson Graphite M25 Midi",
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
        partList.add(KeyboardData(R.drawable.k6,
                "Novation Launchkey Mini Mk2",
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
        partList.add(KeyboardData(R.drawable.k7,
                "Casio Arranger CTK 1500",
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
        partList.add(KeyboardData(R.drawable.k8,
                "Yamaha YPT 220",
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
        partList.add(KeyboardData(R.drawable.k9,
                "Techno T-5000",
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
        partList.add(KeyboardData(R.drawable.k10,
                "Yamaha PSR E253",
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