package com.rival.buttonalerttoastandsnackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_toast.setOnClickListener {
            Toast.makeText(this, "This is A Toast", Toast.LENGTH_SHORT).show()
        }

        btn_snackBar.setOnClickListener { View ->
            Snackbar.make(View, "This is A Snackbar", Snackbar.LENGTH_SHORT).show()
        }

        btn_alert.setOnClickListener {
            val alert = AlertDialog.Builder(this)
            alert.apply {
                setTitle("Delete Item")
                setMessage("Are You Sure To Delete This?")
                setNegativeButton("close") {dialogInterface, i ->
                    dialogInterface.dismiss()
                }
                setPositiveButton("Yes") {dialogInterface, c ->
                    Toast.makeText(this@MainActivity, "Success deleted", Toast.LENGTH_SHORT).show()
                }
                alert.show()
            }
        }
    }
}