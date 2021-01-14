package com.example.melodiamusik.ui.gitar


import com.example.melodiamusik.R
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class GitarFragment : Fragment() {

    private lateinit var GitarViewModel: GitarViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.gitar_fragment, container, false)
        val testData = createGitarData()
        root.findViewById<RecyclerView>(R.id.GitarRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.GitarRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.GitarRV).adapter = GitarAdapter(testData, { GitarItem: GitarData ->GitarItemClicked(GitarItem)})
        return root
    }

    private fun GitarItemClicked(GitarData: GitarData) {
        val showDetailActivity = Intent(context, GitarDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, GitarData.GitarPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, GitarData.GitarNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, GitarData.GitarHarga.toString())
        showDetailActivity.putExtra(Intent.EXTRA_EXCLUDE_COMPONENTS, GitarData.GitarDeskripsi.toString())
        startActivity(showDetailActivity)
    }


    private fun createGitarData() : List<GitarData> {
        val partList = ArrayList<GitarData>()
        partList.add(GitarData(R.drawable.apk500,
                "Gitar Yamaha APX-500",
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
        partList.add(GitarData(R.drawable.gsa500,
                "Ibanez GSA60",
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
        partList.add(GitarData(R.drawable.yh1,
                "Yamaha Pacifica PAC112J",
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
        partList.add(GitarData(R.drawable.cort200,
                "Cort M200-BK",
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
        partList.add(GitarData(R.drawable.eps,
                "Epiphone Les Paul Standart",
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
        partList.add(GitarData(R.drawable.rckwel,
                "Rockwell SCG-01",
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
        partList.add(GitarData(R.drawable.sch,
                "Schecter Omen Extreme-6",
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
        partList.add(GitarData(R.drawable.squ,
                "Squier Affinity Stratocaster",
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
        partList.add(GitarData(R.drawable.esp,
                "Esp LTD H-51",
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
        partList.add(GitarData(R.drawable.ib,
                "Ibanez GRX 55B",
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