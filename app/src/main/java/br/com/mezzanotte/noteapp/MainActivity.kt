package br.com.mezzanotte.noteapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import java.nio.file.Files.delete
import java.nio.file.Files.delete
import android.R.id.edit
import android.util.Log
import android.widget.AdapterView.AdapterContextMenuInfo







class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.pesquisar -> {
                Toast.makeText(this, "Pesquisando ...", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.salvar -> {
                Toast.makeText(this, "Salvando ...", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onContextItemSelected(item)
        }
    }

}
