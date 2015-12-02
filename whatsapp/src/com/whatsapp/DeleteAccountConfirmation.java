// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.View;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.notification.a1;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.x;
import java.io.File;

// Referenced classes of package com.whatsapp:
//            to, App, o4, aoz, 
//            k, nk, s6, asw, 
//            iz, cc, m7, h4, 
//            a8r, Main

public class DeleteAccountConfirmation extends SherlockActivity
{

    private static DeleteAccountConfirmation c;
    private static final String z[];
    private Handler b;

    public DeleteAccountConfirmation()
    {
        b = new to(this);
    }

    static Handler a(DeleteAccountConfirmation deleteaccountconfirmation)
    {
        return deleteaccountconfirmation.b;
    }

    static void a()
    {
        if (!App.au.getSharedPreferences(z[9], 0).edit().clear().commit())
        {
            Log.e(z[10]);
        }
        if (!App.au.getSharedPreferences(z[11], 0).edit().clear().commit())
        {
            Log.e(z[12]);
        }
    }

    static void b()
    {
        d();
    }

    static DeleteAccountConfirmation c()
    {
        return c;
    }

    private static void d()
    {
        App.Z = null;
        (new File(App.au.getFilesDir(), z[1])).delete();
        o4.o();
        App.e(App.au, null);
        App.d(App.au, 0);
        App.ah.r();
        App.az.c();
        App.n = false;
        o4.N();
    }

    public static void e()
    {
        int j = App.am;
        App.d(App.au, 6);
        if (c != null)
        {
            c.b.removeMessages(0);
        }
        a1.c().b();
        Object obj = App.au.getFilesDir();
        String as[] = App.au.fileList();
        int l = as.length;
        int i = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            String s = as[i];
            i++;
        } while (j == 0);
        aoz.a(((File) (obj)));
        x.a(new nk());
        obj = PreferenceManager.getDefaultSharedPreferences(App.au);
        if (!((SharedPreferences) (obj)).edit().clear().commit())
        {
            Log.e(z[3]);
        }
        PreferenceManager.setDefaultValues(App.au, 0x7f050004, true);
        App.d(App.au, 6);
        if (!((SharedPreferences) (obj)).edit().putString(z[5], z[6]).commit())
        {
            Log.e(z[8]);
        }
        a();
        App.aF = false;
        App.a0();
        obj = Environment.getExternalStorageState();
        Log.i((new StringBuilder()).append(z[7]).append(((String) (obj))).toString());
        if (((String) (obj)).equals(z[4]))
        {
            App.ah.d();
        }
        App.Y();
        asw.a(new s6(), new Void[0]);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Log.i(z[0]);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setContentView(iz.a(getLayoutInflater(), 0x7f03005d, null, false));
        findViewById(0x7f0b01b4).setOnClickListener(new cc(this));
        int j = m7.e;
        int i = j;
        if (j == -1)
        {
            i = m7.c();
        }
        if (i != 0)
        {
            findViewById(0x7f0b01ad).setVisibility(0);
        }
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e0119));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setMessage(getString(0x7f0e0317, new Object[] {
                getString(0x7f0e00c6)
            })).setNeutralButton(0x7f0e02ba, new h4(this)).create();

        case 3: // '\003'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0111).setNeutralButton(0x7f0e02ba, new a8r(this)).create();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        b.removeMessages(0);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (App.u == 3 && i == 84)
        {
            a5.a(this, false);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
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

    protected void onPause()
    {
        super.onPause();
        c = null;
    }

    protected void onResume()
    {
        super.onResume();
        c = this;
        int i = App.f(this);
        if (i != 3 && i != 6)
        {
            Log.e((new StringBuilder()).append(z[2]).append(i).toString());
            startActivity(new Intent(this, com/whatsapp/Main));
            finish();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[13];
        obj = ",\027d\"\002-\023k$\031=\034|$\031&\024a5\033g\021z\"\027<\027";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "%\027";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'0\004'\034oj\005<\023|\"V*\035})\025-R|(V%\023a)V";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'$\032-\023f2\006g\021d\"\027:Rn&\037$\027l";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "%\035})\002-\026";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = ">\027z4\037'\034";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "z\\9vX}A9";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'\"\016<\027z)\027$\037m#\037)_{3\027<\027(";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'$\032-\023f2\006g\001m3\000-\000{.\031&Rn&\037$\027l";
                byte0 = 7;
                i = 8;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "\032\027o.\005<\027z\027\036'\034m";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'5\023/\002`(\030-]k(\033%\033|g\020)\033d\"\022";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "\036\027z.\0201!e4";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ",\027d\"\002-\023k$\002+\035f!\037:\037'1\023:\033n>\005%\001'$\031%\037a3V.\023a+\023,";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                z = as;
                c = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 372
    //                   0 395
    //                   1 402
    //                   2 409
    //                   3 416;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_416;
_L3:
        byte byte1 = 118;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 72;
          goto _L9
_L5:
        byte1 = 114;
          goto _L9
_L6:
        byte1 = 8;
          goto _L9
        byte1 = 71;
          goto _L9
    }
}
