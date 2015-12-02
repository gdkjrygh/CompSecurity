// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.SherlockListActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;

// Referenced classes of package com.whatsapp:
//            dx, App, ao_, a9h, 
//            all, yk, DialogToastActivity, iz, 
//            c9

public class DialogToastListActivity extends SherlockListActivity
    implements dx
{

    private static final String z[];
    private int b;
    private c9 c;
    private String d;
    private ao_ e;
    private int f;
    private boolean g;
    private int h;

    public DialogToastListActivity()
    {
        g = true;
    }

    static c9 a(DialogToastListActivity dialogtoastlistactivity)
    {
        return dialogtoastlistactivity.c;
    }

    public void a(int i)
    {
        try
        {
            c = null;
            d = getString(i);
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
            b = i;
            f = j;
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

    public void a(int i, c9 c9)
    {
        try
        {
            c = c9;
            d = getString(i);
            if (!isFinishing())
            {
                showDialog(500);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c9 c9)
        {
            throw c9;
        }
    }

    public boolean a()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(114);
            return true;
        }
    }

    public boolean b()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(113);
            return true;
        }
    }

    public void c()
    {
        removeDialog(501);
    }

    public boolean d()
    {
        boolean flag;
        try
        {
            flag = isFinishing();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        if (flag)
        {
            return false;
        } else
        {
            showDialog(110);
            return true;
        }
    }

    public void f(String s)
    {
        try
        {
            c = null;
            d = s;
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
        boolean flag = g;
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
        Log.e(z[4]);
        return;
        nullpointerexception;
        throw nullpointerexception;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = new ao_();
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
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 500: 
            AlertDialog alertdialog;
            try
            {
                alertdialog = (new android.app.AlertDialog.Builder(this)).setMessage(d).setNeutralButton(0x7f0e02ba, new a9h(this)).create();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw nullpointerexception;
            }
            return alertdialog;

        case 501: 
            ProgressDialog progressdialog = new ProgressDialog(this);
            try
            {
                if (b != 0)
                {
                    progressdialog.setTitle(b);
                }
            }
            catch (NullPointerException nullpointerexception1)
            {
                throw nullpointerexception1;
            }
            progressdialog.setMessage(getString(f));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 114: // 'r'
            Log.w(z[9]);
            return all.b(this);

        case 110: // 'n'
            Log.w(z[10]);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e022f).setCancelable(false).setNeutralButton(0x7f0e02be, new yk(this)).create();

        case 113: // 'q'
            Log.w(z[11]);
            return all.d(this);
        }
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

    public boolean onMenuItemSelected(int i, android.view.MenuItem menuitem)
    {
        DialogToastActivity.a(menuitem);
        return super.onMenuItemSelected(i, menuitem);
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

    public void onPause()
    {
        try
        {
            App.a(this);
            super.onPause();
            if (e.hasMessages(0))
            {
                e.removeMessages(0);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        App.aL();
        g = false;
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
            alertdialog.setMessage(d);
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
            d = bundle.getString(z[5]);
            h = bundle.getInt(z[6], 0);
            if (h != 0)
            {
                d = getString(h);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        b = bundle.getInt(z[7], 0);
        f = bundle.getInt(z[8], 0);
    }

    public void onResume()
    {
        App.b(this);
        super.onResume();
        e.sendEmptyMessageDelayed(0, 3000L);
        g = true;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(z[2], d);
        bundle.putInt(z[1], h);
        bundle.putInt(z[0], b);
        bundle.putInt(z[3], f);
    }

    public void setContentView(int i)
    {
        setContentView(iz.a(getLayoutInflater(), i, null, false));
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "\000.qSI\037\033pO}\035\027mRK\037*jHB\b7g";
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
                obj = "\000:j]B\002\031WSO\036\nPH\\\004\020duJ";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\000:j]B\002\031WSO\036\nPH\\\004\020d";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\000.qSI\037\033pO}\035\027mRK\0373fO]\f\031fuJ";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\t\027bPA\n\nl]]\031\022jOZ\f\035wUX\004\nz\023A\003\034b_E\035\ffO]\b\032,]M\031\027uUZ\024^mS\016\f\035wUX\b";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\000:j]B\002\031WSO\036\nPH\\\004\020d";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\000:j]B\002\031WSO\036\nPH\\\004\020duJ";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "\000.qSI\037\033pO}\035\027mRK\037*jHB\b7g";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "\000.qSI\037\033pO}\035\027mRK\0373fO]\f\031fuJ";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\t\027bPA\nQpSH\031\tbNK@\033{LG\037\033g";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "\t\027bPA\nQoSI\004\020.ZO\004\022fX";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\t\027bPA\nQ`PA\016\025.K\\\002\020d";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 387;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_387;
_L3:
        byte byte1 = 46;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 109;
          goto _L9
_L5:
        byte1 = 126;
          goto _L9
_L6:
        byte1 = 3;
          goto _L9
        byte1 = 60;
          goto _L9
    }
}
