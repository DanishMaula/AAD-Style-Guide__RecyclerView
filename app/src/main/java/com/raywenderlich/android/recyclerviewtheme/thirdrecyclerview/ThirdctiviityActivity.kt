package com.raywenderlich.android.recyclerviewtheme.thirdrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.raywenderlich.android.recyclerviewtheme.R
import com.raywenderlich.android.recyclerviewtheme.databinding.ActivityThirdctiviityBinding
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.nio.charset.StandardCharsets

class ThirdctiviityActivity : AppCompatActivity() {
    private var modelPahlawan: MutableList<ModelPahlawan> = ArrayList()
    lateinit var pahlawanAdapter: PahlawanAdapter

    private lateinit var binding: ActivityThirdctiviityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdctiviityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPahwalan.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ThirdctiviityActivity)
        }

        getListPahlawan()
    }

    private fun getListPahlawan() {
        try {
            // membuka json
            val stream = assets.open("pahlawan_nasional.json")
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()

            val strContent = String(buffer, StandardCharsets.UTF_8)
            try {
                val jsonObject = JSONObject(strContent)
                val jsonArray = jsonObject.getJSONArray("daftar_pahlawan")
                for (i in 0..jsonArray.length() - 1 ){
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataApi = ModelPahlawan()

                    dataApi.nameP = jsonObjectData.getString("nama")
                    dataApi.namaLengkap = jsonObjectData.getString("nama2")
                    dataApi.image = jsonObjectData.getString("img")
                    modelPahlawan.add(dataApi)
                }

                pahlawanAdapter = PahlawanAdapter(modelPahlawan)
                //setup recycler view
                binding.rvPahwalan.adapter = pahlawanAdapter

            }catch (e: JSONException){
                e.printStackTrace()
            }

        }catch (e: JSONException){
            Toast.makeText(this@ThirdctiviityActivity, "Something wrong", Toast.LENGTH_SHORT).show()
        }
    }
}