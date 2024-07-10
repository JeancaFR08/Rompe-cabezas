package com.example.rompecabezasdelicia

import android.content.ClipData
import android.content.ClipDescription
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Point
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.DragEvent
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class Juego : AppCompatActivity() {

    lateinit var iv_uno:ImageView
    lateinit var iv_dos:ImageView
    lateinit var iv_tres:ImageView
    lateinit var iv_cuatro:ImageView
    lateinit var iv_cinco:ImageView
    lateinit var iv_seis:ImageView
    lateinit var iv_siete:ImageView
    lateinit var iv_ocho:ImageView
    lateinit var iv_nueve:ImageView
    lateinit var iv_diez:ImageView
    lateinit var iv_once:ImageView
    lateinit var iv_doce:ImageView
    lateinit var iv_trece:ImageView
    lateinit var iv_catorce:ImageView
    lateinit var iv_quince:ImageView
    lateinit var iv_dieciseis:ImageView

    lateinit var iv_unoBajo:ImageView
    lateinit var iv_dosBajo:ImageView
    lateinit var iv_tresBajo:ImageView
    lateinit var iv_cuatroBajo:ImageView
    lateinit var iv_cincoBajo:ImageView
    lateinit var iv_seisBajo:ImageView
    lateinit var iv_sieteBajo:ImageView
    lateinit var iv_ochoBajo:ImageView
    lateinit var iv_nueveBajo:ImageView
    lateinit var iv_diezBajo:ImageView
    lateinit var iv_onceBajo:ImageView
    lateinit var iv_doceBajo:ImageView
    lateinit var iv_treceBajo:ImageView
    lateinit var iv_catorceBajo:ImageView
    lateinit var iv_quinceBajo:ImageView
    lateinit var iv_dieciseisBajo:ImageView
    lateinit var tv_tiempo: TextView
    var tiempo = 40

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juego)

        enlazarGUI()
        cuentaAtras()

        iv_unoBajo.setOnLongClickListener(longClickListener)
        iv_dosBajo.setOnLongClickListener(longClickListener)
        iv_tresBajo.setOnLongClickListener(longClickListener)
        iv_cuatroBajo.setOnLongClickListener(longClickListener)
        iv_cincoBajo.setOnLongClickListener(longClickListener)
        iv_seisBajo.setOnLongClickListener(longClickListener)
        iv_sieteBajo.setOnLongClickListener(longClickListener)
        iv_ochoBajo.setOnLongClickListener(longClickListener)
        iv_nueveBajo.setOnLongClickListener(longClickListener)
        iv_diezBajo.setOnLongClickListener(longClickListener)
        iv_onceBajo.setOnLongClickListener(longClickListener)
        iv_doceBajo.setOnLongClickListener(longClickListener)
        iv_treceBajo.setOnLongClickListener(longClickListener)
        iv_catorceBajo.setOnLongClickListener(longClickListener)
        iv_quinceBajo.setOnLongClickListener(longClickListener)
        iv_dieciseisBajo.setOnLongClickListener(longClickListener)

        iv_uno.setOnDragListener(dragListener)
        iv_dos.setOnDragListener(dragListener)
        iv_tres.setOnDragListener(dragListener)
        iv_cuatro.setOnDragListener(dragListener)
        iv_cinco.setOnDragListener(dragListener)
        iv_seis.setOnDragListener(dragListener)
        iv_siete.setOnDragListener(dragListener)
        iv_ocho.setOnDragListener(dragListener)
        iv_nueve.setOnDragListener(dragListener)
        iv_diez.setOnDragListener(dragListener)
        iv_once.setOnDragListener(dragListener)
        iv_doce.setOnDragListener(dragListener)
        iv_trece.setOnDragListener(dragListener)
        iv_catorce.setOnDragListener(dragListener)
        iv_quince.setOnDragListener(dragListener)
        iv_dieciseis.setOnDragListener(dragListener)
    }

    private fun enlazarGUI() {
        tv_tiempo=findViewById(R.id.tv_tiempo)

        iv_uno = findViewById(R.id.iv_uno)
        iv_dos = findViewById(R.id.iv_dos)
        iv_tres = findViewById(R.id.iv_tres)
        iv_cuatro = findViewById(R.id.iv_cuatro)
        iv_cinco = findViewById(R.id.iv_cinco)
        iv_seis = findViewById(R.id.iv_seis)
        iv_siete = findViewById(R.id.iv_siete)
        iv_ocho = findViewById(R.id.iv_ocho)
        iv_nueve = findViewById(R.id.iv_nueve)
        iv_diez = findViewById(R.id.iv_diez)
        iv_once = findViewById(R.id.iv_once)
        iv_doce = findViewById(R.id.iv_doce)
        iv_trece = findViewById(R.id.iv_trece)
        iv_catorce = findViewById(R.id.iv_catorce)
        iv_quince = findViewById(R.id.iv_quince)
        iv_dieciseis = findViewById(R.id.iv_dieciseis)

        iv_uno.setAlpha(20)
        iv_dos.setAlpha(20)
        iv_tres.setAlpha(20)
        iv_cuatro.setAlpha(20)
        iv_cinco.setAlpha(20)
        iv_seis.setAlpha(20)
        iv_siete.setAlpha(20)
        iv_ocho.setAlpha(20)
        iv_nueve.setAlpha(20)
        iv_diez.setAlpha(20)
        iv_once.setAlpha(20)
        iv_doce.setAlpha(20)
        iv_trece.setAlpha(20)
        iv_catorce.setAlpha(20)
        iv_quince.setAlpha(20)
        iv_dieciseis.setAlpha(20)

        iv_unoBajo = findViewById(R.id.iv_unoBajo)
        iv_dosBajo = findViewById(R.id.iv_dosBajo)
        iv_tresBajo = findViewById(R.id.iv_tresBajo)
        iv_cuatroBajo = findViewById(R.id.iv_cuatroBajo)
        iv_cincoBajo = findViewById(R.id.iv_cincoBajo)
        iv_seisBajo = findViewById(R.id.iv_seisBajo)
        iv_sieteBajo = findViewById(R.id.iv_sieteBajo)
        iv_ochoBajo = findViewById(R.id.iv_ochoBajo)
        iv_nueveBajo = findViewById(R.id.iv_nueveBajo)
        iv_diezBajo = findViewById(R.id.iv_diezBajo)
        iv_onceBajo = findViewById(R.id.iv_onceBajo)
        iv_doceBajo = findViewById(R.id.iv_doceBajo)
        iv_treceBajo = findViewById(R.id.iv_treceBajo)
        iv_catorceBajo = findViewById(R.id.iv_catorceBajo)
        iv_quinceBajo = findViewById(R.id.iv_quinceBajo)
        iv_dieciseisBajo = findViewById(R.id.iv_dieciseisBajo)
    }

    private fun cuentaAtras() {
        object : CountDownTimer(41000,1000){
            override fun onTick(millisUntilFinished: Long) {
                tiempo = (millisUntilFinished/1000).toInt()
                tv_tiempo.setText("TIEMPO: " + tiempo + "s" )
            }

            override fun onFinish() {
                if (tiempo == 0 && iv_unoBajo.visibility == View.VISIBLE ||
                    iv_dosBajo.visibility == View.VISIBLE ||
                    iv_tresBajo.visibility == View.VISIBLE ||
                    iv_cuatroBajo.visibility == View.VISIBLE ||
                    iv_cincoBajo.visibility == View.VISIBLE ||
                    iv_seisBajo.visibility == View.VISIBLE ||
                    iv_sieteBajo.visibility == View.VISIBLE ||
                    iv_ochoBajo.visibility == View.VISIBLE ||
                    iv_nueveBajo.visibility == View.VISIBLE ||
                    iv_diezBajo.visibility == View.VISIBLE ||
                    iv_onceBajo.visibility == View.VISIBLE ||
                    iv_doceBajo.visibility == View.VISIBLE ||
                    iv_treceBajo.visibility == View.VISIBLE ||
                    iv_catorceBajo.visibility == View.VISIBLE ||
                    iv_quinceBajo.visibility == View.VISIBLE ||
                    iv_dieciseisBajo.visibility == View.VISIBLE)
                {
                    validarDerrota()
                }

            }
        }.start()
    }

    private fun validarDerrota(){
        val intent = Intent(this, Derrota::class.java)
        startActivity(intent)
        finish()
    }

    private val longClickListener = View.OnLongClickListener { v ->
        val item = ClipData.Item(v.tag as? CharSequence)

        val dragData = ClipData(
            v.tag as CharSequence,
            arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN),
            item
        )
        val myShadow = MyDragShadowBuilder(v)

        v.startDragAndDrop(dragData, myShadow, null, 0)
        true
    }

    private val dragListener = View.OnDragListener { v, event ->
        val receiverView: ImageView = v as ImageView

        when (event.action) {
            DragEvent.ACTION_DRAG_STARTED ->{
                //arrastrando imagen
                true
            }

            DragEvent.ACTION_DRAG_ENTERED ->{
                //entraste a la imagen

                if (receiverView.tag as String == event.clipDescription.label){
                    v.setAlpha(255)
                    if (receiverView.tag == "uno"){
                        iv_unoBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "dos"){
                        iv_dosBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "tres"){
                        iv_tresBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "cuatro"){
                        iv_cuatroBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "cinco"){
                        iv_cincoBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "seis"){
                        iv_seisBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "siete"){
                        iv_sieteBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "ocho"){
                        iv_ochoBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "nueve"){
                        iv_nueveBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "diez"){
                        iv_diezBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "once"){
                        iv_onceBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "doce"){
                        iv_doceBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "trece"){
                        iv_treceBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "catorce"){
                        iv_catorceBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "quince"){
                        iv_quinceBajo.visibility = View.INVISIBLE
                    } else if (receiverView.tag == "dieciseis"){
                        iv_dieciseisBajo.visibility = View.INVISIBLE
                    }

                    if (iv_unoBajo.visibility == View.INVISIBLE &&
                        iv_dosBajo.visibility == View.INVISIBLE &&
                        iv_tresBajo.visibility == View.INVISIBLE &&
                        iv_cuatroBajo.visibility == View.INVISIBLE &&
                        iv_cincoBajo.visibility == View.INVISIBLE &&
                        iv_seisBajo.visibility == View.INVISIBLE &&
                        iv_sieteBajo.visibility == View.INVISIBLE &&
                        iv_ochoBajo.visibility == View.INVISIBLE &&
                        iv_nueveBajo.visibility == View.INVISIBLE &&
                        iv_diezBajo.visibility == View.INVISIBLE &&
                        iv_onceBajo.visibility == View.INVISIBLE &&
                        iv_doceBajo.visibility == View.INVISIBLE &&
                        iv_treceBajo.visibility == View.INVISIBLE &&
                        iv_catorceBajo.visibility == View.INVISIBLE &&
                        iv_quinceBajo.visibility == View.INVISIBLE &&
                        iv_dieciseisBajo.visibility == View.INVISIBLE && tiempo > 0)
                    {
                        val intent = Intent(this, Victoria::class.java)
                        startActivity(intent)
                        finish()
                    }

                } else {
                    //error
                }
                true
            }

            DragEvent.ACTION_DRAG_LOCATION ->{
                true
            }

            DragEvent.ACTION_DRAG_EXITED ->{
                //saliste de la imagen
                true
            }

            DragEvent.ACTION_DROP ->{
                //soltaste la imagen
                true
            }

            DragEvent.ACTION_DRAG_ENDED ->{
                //dejaste de arrastrar la imagen
                true
            }

            else ->{
                false
            }
        }
    }

    private class MyDragShadowBuilder(val v: View) : View.DragShadowBuilder(v) {
        override fun onProvideShadowMetrics(size: Point, touch: Point) {
            size.set(view.width, view.height)
            touch.set(view.width / 2, view.height / 2)
        }
        override fun onDrawShadow(canvas: Canvas){
            v.draw(canvas)
        }
    }
}