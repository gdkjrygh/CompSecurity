// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            dx, App, ao_, atn, 
//            Main, c9

public class DialogToastPreferenceActivity extends SherlockPreferenceActivity
    implements dx
{

    private static final String z[];
    private String a;
    private c9 b;
    private int c;
    private ao_ d;
    private boolean e;
    private int f;
    private int g;

    public DialogToastPreferenceActivity()
    {
        e = true;
    }

    static c9 a(DialogToastPreferenceActivity dialogtoastpreferenceactivity)
    {
        return dialogtoastpreferenceactivity.b;
    }

    public void a(int i)
    {
        try
        {
            b = null;
            a = getString(i);
            if (!isFinishing())
            {
                showDialog(500);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public void a(int i, int j)
    {
        try
        {
            f = i;
            g = j;
            if (!isFinishing())
            {
                showDialog(501);
            }
            return;
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
    }

    public boolean a()
    {
        return false;
    }

    public boolean b()
    {
        return false;
    }

    public void c()
    {
        removeDialog(501);
    }

    public boolean d()
    {
        return false;
    }

    public void f(String s)
    {
        try
        {
            b = null;
            a = s;
            if (!isFinishing())
            {
                showDialog(500);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    public void onBackPressed()
    {
        boolean flag = e;
        if (!flag)
        {
            NullPointerException nullpointerexception;
            int i;
            try
            {
                i = android.os.Build.VERSION.SDK_INT;
            }
            catch (NullPointerException nullpointerexception1)
            {
                try
                {
                    throw nullpointerexception1;
                }
                catch (NullPointerException nullpointerexception2)
                {
                    throw nullpointerexception2;
                }
            }
            if (i >= 11)
            {
                break MISSING_BLOCK_LABEL_29;
            }
        }
        super.onBackPressed();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Log.e(z[0]);
        return;
        nullpointerexception;
        throw nullpointerexception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        d = new ao_();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            bundle = findViewById(0x102000a);
            if (bundle != null)
            {
                int l = bundle.getPaddingLeft();
                int k = bundle.getPaddingLeft();
                Object obj = bundle.getParent();
                int j = k;
                int i = l;
                if (obj instanceof View)
                {
                    obj = (View)obj;
                    i = l + ((View) (obj)).getPaddingLeft();
                    j = k + ((View) (obj)).getPaddingRight();
                    ((View) (obj)).setPadding(0, 0, 0, 0);
                }
                bundle.setPadding(i, 0, j, 0);
                bundle.setScrollBarStyle(0x2000000);
            }
        }
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (ContextMenu contextmenu)
        {
            throw contextmenu;
        }
        super.onCreateContextMenu(contextmenu, view, contextmenuinfo);
    }

    protected Dialog onCreateDialog(int i)
    {
        ProgressDialog progressdialog;
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 500: 
            AlertDialog alertdialog;
            try
            {
                alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(a).setNeutralButton(0x7f0e02ba, new atn(this)).create();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return alertdialog;

        case 501: 
            progressdialog = new ProgressDialog(this);
            break;
        }
        try
        {
            if (f != 0)
            {
                progressdialog.setTitle(f);
            }
        }
        catch (NullPointerException nullpointerexception1)
        {
            throw nullpointerexception1;
        }
        progressdialog.setMessage(getString(g));
        progressdialog.setIndeterminate(true);
        progressdialog.setCancelable(false);
        return progressdialog;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        try
        {
            if (App.u == 3)
            {
                a5.b(this);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Menu menu)
        {
            throw menu;
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        int j;
        try
        {
            j = App.u;
        }
        // Misplaced declaration of an exception variable
        catch (KeyEvent keyevent)
        {
            throw keyevent;
        }
        if (j != 3) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR lookupswitch 3: default 44
    //                   24: 54
    //                   25: 71
    //                   84: 64;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.onKeyDown(i, keyevent);
_L3:
        a5.a(this).show();
        return true;
_L5:
        a5.a(this, false);
        return true;
_L4:
        a5.c();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR tableswitch 16908332 16908332: default 33
    //                   16908332 24;
           goto _L1 _L2
_L2:
        finish();
        return true;
        menuitem;
        throw menuitem;
_L1:
        return false;
    }

    protected void onPause()
    {
        try
        {
            App.a(this);
            super.onPause();
            if (d.hasMessages(0))
            {
                d.removeMessages(0);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        App.aL();
        e = false;
    }

    protected void onPrepareDialog(int i, Dialog dialog)
    {
        i;
        JVM INSTR tableswitch 500 500: default 20
    //                   500 27;
           goto _L1 _L2
_L1:
        super.onPrepareDialog(i, dialog);
_L3:
        return;
_L2:
        AlertDialog alertdialog = (AlertDialog)dialog;
        int j;
        try
        {
            alertdialog.setMessage(a);
            j = App.am;
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            throw dialog;
        }
        if (j == 0) goto _L3; else goto _L1
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        try
        {
            super.onRestoreInstanceState(bundle);
        }
        catch (NullPointerException nullpointerexception)
        {
            Log.c(nullpointerexception);
        }
        try
        {
            a = bundle.getString(z[6]);
            c = bundle.getInt(z[5], 0);
            if (c != 0)
            {
                a = getString(c);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        f = bundle.getInt(z[8], 0);
        g = bundle.getInt(z[7], 0);
    }

    protected void onResume()
    {
        App.b(this);
        super.onResume();
        d.sendEmptyMessageDelayed(0, 3000L);
        e = true;
        if (App.f(this) != 3)
        {
            Log.i((new StringBuilder()).append(z[9]).append(App.f(this)).toString());
            startActivity(new Intent(this, com/whatsapp/Main));
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[2], a);
        bundle.putInt(z[1], c);
        bundle.putInt(z[4], f);
        bundle.putInt(z[3], g);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "E\017X\r2F\022V\000.U\022K\004;D\024\\\017>D\007Z\0254W\017M\030rN\b[\000>J\026K\004.R\003]N<B\022P\0274U\037\031\0172\001\007Z\0254W\003";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "L\"P\0001N\001m\016<R\022j\025/H\b^(9";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "L\"P\0001N\001m\016<R\022j\025/H\b^";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "L6K\016:S\003J\022\016Q\017W\0178S+\\\022.@\001\\(9";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "L6K\016:S\003J\022\016Q\017W\0178S2P\0251D/]";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "L\"P\0001N\001m\016<R\022j\025/H\b^(9";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "L\"P\0001N\001m\016<R\022j\025/H\b^";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "L6K\016:S\003J\022\016Q\017W\0178S+\\\022.@\001\\(9";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "L6K\016:S\003J\022\016Q\017W\0178S2P\0251D/]";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "R\003M\0254O\001JN/D\025L\f8\016\021K\0163FKJ\025<U\003\031";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 344;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_344;
_L3:
        byte byte1 = 93;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 33;
          goto _L9
_L5:
        byte1 = 102;
          goto _L9
_L6:
        byte1 = 57;
          goto _L9
        byte1 = 97;
          goto _L9
    }
}
