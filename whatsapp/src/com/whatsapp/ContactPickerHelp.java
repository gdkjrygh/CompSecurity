// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            DialogToastListActivity, ug, a_r, App, 
//            a3s, by, a_u, l2

public class ContactPickerHelp extends DialogToastListActivity
{

    private static final String z;
    CheckBox i;
    TextView j;
    List k;
    boolean l;
    a_r m;

    public ContactPickerHelp()
    {
    }

    public void onCreate(Bundle bundle)
    {
        Log.i(z);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(0x7f030035);
        ((Button)findViewById(0x7f0b012f)).setOnClickListener(new ug(this));
        j = (TextView)findViewById(0x7f0b0134);
        k = new ArrayList();
        m = new a_r(this, 0x7f030036, k);
        getListView().setAdapter(m);
        j.setVisibility(4);
        getListView().setVisibility(8);
        i = (CheckBox)findViewById(0x7f0b0132);
        i.setChecked(App.u(this));
        i.setOnCheckedChangeListener(new a3s(this));
        findViewById(0x7f0b0131).setOnClickListener(new by(this));
        ((ScrollView)findViewById(0x7f0b00fa)).post(new a_u(this));
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e032c));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 2: // '\002'
            ProgressDialog progressdialog1 = new ProgressDialog(this);
            progressdialog1.setMessage(getString(0x7f0e0353));
            progressdialog1.setIndeterminate(true);
            progressdialog1.setCancelable(false);
            return progressdialog1;

        case 3: // '\003'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e00dc).setCancelable(false).setNeutralButton(0x7f0e02ba, new l2(this)).create();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    static 
    {
        char ac[];
        int i1;
        int j1;
        ac = "\037\"wuq\0379qd|\fbzsu\0359|".toCharArray();
        j1 = ac.length;
        i1 = 0;
_L7:
        char c;
        if (j1 <= i1)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i1];
        i1 % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 16;
_L8:
        ac[i1] = (char)(byte0 ^ c);
        i1++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 124;
          goto _L8
_L3:
        byte0 = 77;
          goto _L8
_L4:
        byte0 = 25;
          goto _L8
        byte0 = 1;
          goto _L8
    }
}
