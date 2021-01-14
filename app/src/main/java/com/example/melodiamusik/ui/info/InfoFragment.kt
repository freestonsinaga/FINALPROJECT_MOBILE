package com.example.melodiamusik.ui.info


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.melodiamusik.R

class InfoFragment : Fragment() {

    private lateinit var InfoViewModel: InfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.info_fragment, container, false)
        val testData = createInfoData()
        root.findViewById<RecyclerView>(R.id.infoRV).layoutManager = LinearLayoutManager(context)
        root.findViewById<RecyclerView>(R.id.infoRV).setHasFixedSize(true)
        root.findViewById<RecyclerView>(R.id.infoRV).adapter =
            InfoAdapter(testData, { InfoItem: InfoData -> InfoItemClicked(InfoItem) })
        return root
    }

    private fun InfoItemClicked(InfoData: InfoData) {
        val showDetailActivity = Intent(context, InfoDetailActivity::class.java)
        showDetailActivity.putExtra(Intent.EXTRA_SPLIT_NAME, InfoData.InfoPhoto.toString())
        showDetailActivity.putExtra(Intent.EXTRA_COMPONENT_NAME, InfoData.InfoNama.toString())
        showDetailActivity.putExtra(Intent.EXTRA_INSTALLER_PACKAGE_NAME, InfoData.InfoIdentitas.toString())
        showDetailActivity.putExtra(Intent.EXTRA_REFERRER_NAME, InfoData.InfoWebsite.toString())
        startActivity(showDetailActivity)
    }

    private fun createInfoData(): List<InfoData> {
        val partList = ArrayList<InfoData>()
        partList.add(
            InfoData(
                R.drawable.me,
                "Freeston Hamonangan Sinaga",
                "NPM : 18082010019\n"+
                        "Paralel : A\n"+
                        "Jurusan : Sistem Informasi\n" +
                        "Fakultas : Ilmu Komputer\n"+
                        "Universitas : UPN “Veteran” Jawa Timur",
                "https://github.com/freestonsinaga",

                )
        )
        return partList
    }
}