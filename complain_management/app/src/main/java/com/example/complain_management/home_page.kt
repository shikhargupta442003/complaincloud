package com.example.demofigmatoandroid

import android.app.Activity
import android.os.Build.VERSION_CODES.R
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.complain_management.R


class homepage_activity : AppCompatActivity() {
    private var _bg__homepage_ek2: View? = null
    private var _bg__admin_activity_ek1: View? = null
    private var rectangle_2: View? = null
    private var ellipse_1: View? = null
    private var ellipse_2: View? = null
    private var _bg__add_user_ek1: View? = null
    private var vector: ImageView? = null
    private var admin_console: TextView? = null
    private var view_pending_actions: TextView? = null
    private var vector_ek1: ImageView? = null
    private var _bg__user_display_ek1: View? = null
    private var rectangle_3: View? = null
    private var ellipse_3: View? = null
    private var ellipse_4: View? = null
    private var ellipse_5: View? = null
    private var _bg__viewall_ek1: View? = null
    private var ellipse_7: View? = null
    private var ellipse_8: View? = null
    private var ellipse_6: View? = null
    private var vector_ek2: ImageView? = null
    private var ravi: TextView? = null
    private var mala: TextView? = null
    private var bharat: TextView? = null
    private var view_all: TextView? = null
    private var _bg__functions_ek1: View? = null
    private var pre_approve: TextView? = null
    private var helpdesk: TextView? = null
    private var amenities: TextView? = null
    private var directory: TextView? = null
    private var payments: TextView? = null
    private var _bg__group_1_ek1: View? = null
    private var rectangle_4: View? = null
    private var rectangle_5: View? = null
    private var rectangle_6: View? = null
    private var rectangle_7: View? = null
    private var rectangle_8: View? = null
    private var _bg__iconly_light_add_user_ek1: View? = null
    private var _bg__add_user_ek3: View? = null
    private var stroke_1: ImageView? = null
    private var stroke_3: ImageView? = null
    private var stroke_5: ImageView? = null
    private var stroke_7: ImageView? = null
    private var _bg__call_ek1: View? = null
    private var stroke_1_ek1: ImageView? = null
    private var _bg__iconly_light_bookmark_ek1: View? = null
    private var _bg__bookmark_ek1: View? = null
    private var stroke_1_ek2: ImageView? = null
    private var stroke_3_ek1: ImageView? = null
    private var _bg__scan_ek1: View? = null
    private var _bg__iconly_light_scan_ek1: View? = null
    private var _bg__scan_ek3: View? = null
    private var stroke_1_ek3: ImageView? = null
    private var stroke_3_ek2: ImageView? = null
    private var stroke_5_ek1: ImageView? = null
    private var stroke_7_ek1: ImageView? = null
    private var stroke_9: ImageView? = null
    private var _bg__iconly_light_document_ek1: View? = null
    private var _bg__document_ek1: View? = null
    private var stroke_1_ek4: ImageView? = null
    private var stroke_2: ImageView? = null
    private var stroke_3_ek3: ImageView? = null
    private var stroke_4: ImageView? = null
    private var rectangle_9: View? = null
    private var line_1: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        _bg__homepage_ek2 = findViewById<View>(R.id._bg__homepage_ek2) as View
        _bg__admin_activity_ek1 = findViewById<View>(R.id._bg__admin_activity_ek1) as View
        rectangle_2 = findViewById<View>(R.id.rectangle_2) as View
        ellipse_1 = findViewById<View>(R.id.ellipse_1) as View
        ellipse_2 = findViewById<View>(R.id.ellipse_2) as View
        _bg__add_user_ek1 = findViewById<View>(R.id._bg__add_user_ek1) as View
        vector = findViewById<View>(R.id.vector) as ImageView
        admin_console = findViewById<View>(R.id.admin_console) as TextView
        view_pending_actions = findViewById<View>(R.id.view_pending_actions) as TextView
        vector_ek1 = findViewById<View>(R.id.vector_ek1) as ImageView
        _bg__user_display_ek1 = findViewById<View>(R.id._bg__user_display_ek1) as View
        rectangle_3 = findViewById<View>(R.id.rectangle_3) as View
        ellipse_3 = findViewById<View>(R.id.ellipse_3) as View
        ellipse_4 = findViewById<View>(R.id.ellipse_4) as View
        ellipse_5 = findViewById<View>(R.id.ellipse_5) as View
        _bg__viewall_ek1 = findViewById<View>(R.id._bg__viewall_ek1) as View
        ellipse_7 = findViewById<View>(R.id.ellipse_7) as View
        ellipse_8 = findViewById<View>(R.id.ellipse_8) as View
        ellipse_6 = findViewById<View>(R.id.ellipse_6) as View
        vector_ek2 = findViewById<View>(R.id.vector_ek2) as ImageView
        ravi = findViewById<View>(R.id.ravi) as TextView
        mala = findViewById<View>(R.id.mala) as TextView
        bharat = findViewById<View>(R.id.bharat) as TextView
        view_all = findViewById<View>(R.id.view_all) as TextView
        _bg__functions_ek1 = findViewById<View>(R.id._bg__functions_ek1) as View
        pre_approve = findViewById<View>(R.id.pre_approve) as TextView
        helpdesk = findViewById<View>(R.id.helpdesk) as TextView
        amenities = findViewById<View>(R.id.amenities) as TextView
        directory = findViewById<View>(R.id.directory) as TextView
        payments = findViewById<View>(R.id.payments) as TextView
        _bg__group_1_ek1 = findViewById<View>(R.id._bg__group_1_ek1) as View
        rectangle_4 = findViewById<View>(R.id.rectangle_4) as View
        rectangle_5 = findViewById<View>(R.id.rectangle_5) as View
        rectangle_6 = findViewById<View>(R.id.rectangle_6) as View
        rectangle_7 = findViewById<View>(R.id.rectangle_7) as View
        rectangle_8 = findViewById<View>(R.id.rectangle_8) as View
        _bg__iconly_light_add_user_ek1 =
            findViewById<View>(R.id._bg__iconly_light_add_user_ek1) as View
        _bg__add_user_ek3 = findViewById<View>(R.id._bg__add_user_ek3) as View
        stroke_1 = findViewById<View>(R.id.stroke_1) as ImageView
        stroke_3 = findViewById<View>(R.id.stroke_3) as ImageView
        stroke_5 = findViewById<View>(R.id.stroke_5) as ImageView
        stroke_7 = findViewById<View>(R.id.stroke_7) as ImageView
        _bg__call_ek1 = findViewById<View>(R.id._bg__call_ek1) as View
        stroke_1_ek1 = findViewById<View>(R.id.stroke_1_ek1) as ImageView
        _bg__iconly_light_bookmark_ek1 =
            findViewById<View>(R.id._bg__iconly_light_bookmark_ek1) as View
        _bg__bookmark_ek1 = findViewById<View>(R.id._bg__bookmark_ek1) as View
        stroke_1_ek2 = findViewById<View>(R.id.stroke_1_ek2) as ImageView
        stroke_3_ek1 = findViewById<View>(R.id.stroke_3_ek1) as ImageView
        _bg__scan_ek1 = findViewById<View>(R.id._bg__scan_ek1) as View
        _bg__iconly_light_scan_ek1 = findViewById<View>(R.id._bg__iconly_light_scan_ek1) as View
        _bg__scan_ek3 = findViewById<View>(R.id._bg__scan_ek3) as View
        stroke_1_ek3 = findViewById<View>(R.id.stroke_1_ek3) as ImageView
        stroke_3_ek2 = findViewById<View>(R.id.stroke_3_ek2) as ImageView
        stroke_5_ek1 = findViewById<View>(R.id.stroke_5_ek1) as ImageView
        stroke_7_ek1 = findViewById<View>(R.id.stroke_7_ek1) as ImageView
        stroke_9 = findViewById<View>(R.id.stroke_9) as ImageView
        _bg__iconly_light_document_ek1 =
            findViewById<View>(R.id._bg__iconly_light_document_ek1) as View
        _bg__document_ek1 = findViewById<View>(R.id._bg__document_ek1) as View
        stroke_1_ek4 = findViewById<View>(R.id.stroke_1_ek4) as ImageView
        stroke_2 = findViewById<View>(R.id.stroke_2) as ImageView
        stroke_3_ek3 = findViewById<View>(R.id.stroke_3_ek3) as ImageView
        stroke_4 = findViewById<View>(R.id.stroke_4) as ImageView
        rectangle_9 = findViewById<View>(R.id.rectangle_9) as View
        line_1 = findViewById<View>(R.id.line_1) as ImageView


        //custom code goes here
    }
}
