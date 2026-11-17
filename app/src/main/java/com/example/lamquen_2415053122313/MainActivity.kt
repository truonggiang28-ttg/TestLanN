package com.example.lamquen_2415053122313

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lamquen_2415053122313.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var luoiCuoi_2313 : LuotNhan? = null
    private var stt = 0
    private fun kiemTra_2313(){
        with(binding){
            val ten = edtTen.text.toString().chuanHoaTen_2313()
            val soluong = edtSoLuong.text.toString().chuanHoaTen_2313().toIntOrNull()

            if (ten.length < 2 || ten.length>40 ){
                edtTen.error="Nhap ten tu 2-40 ki tu"
                edtTen.requestFocus()
                return
            }
            else{
                edtTen.error = null
            }
            if (soluong == null ||soluong < 1 || soluong >9){
                edtSoLuong.error="Nhap so luong tu 1-9"
                edtSoLuong.requestFocus()
                return
            }
            else{
                edtSoLuong.error = null
            }
            stt++

            luoiCuoi_2313 = LuotNhan(stt.toString(), ten, soluong)

            txtKetQua.text = "Ho Ten: ${ten}" + "So luong: ${soluong}"
            txtMaLuot.text = "luot: ${stt}"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
}