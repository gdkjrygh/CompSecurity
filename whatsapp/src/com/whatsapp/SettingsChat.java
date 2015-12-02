// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.preference.CheckBoxPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import com.whatsapp.util.Log;
import com.whatsapp.util.c1;
import com.whatsapp.util.q;
import com.whatsapp.wallpaper.CropImage;
import com.whatsapp.wallpaper.d;
import java.io.FileNotFoundException;
import java.util.Calendar;

// Referenced classes of package com.whatsapp:
//            DialogToastPreferenceActivity, App, uv, rp, 
//            a_p, alq, qp, a30, 
//            wo, c, u5, abo, 
//            e4, ly, aoo, aod, 
//            b, auu, k, vc, 
//            nn

public class SettingsChat extends DialogToastPreferenceActivity
{

    private static final String z[];
    private String h;
    private Handler i;

    public SettingsChat()
    {
        i = new Handler();
        h = null;
    }

    static Handler a(SettingsChat settingschat)
    {
        return settingschat.i;
    }

    public static void a()
    {
        dx dx = App.ak();
        if (dx instanceof SettingsChat)
        {
            ((SettingsChat)dx).b();
        }
    }

    private void a(Uri uri, int j, int l, int i1)
    {
label0:
        {
            if (uri == null)
            {
                d.a(this, true, j, null, l, i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            d.a(this, false, -1, uri, 0, 0);
        }
        c1.a(this, uri);
        App.b(getBaseContext(), getString(0x7f0e049f), 0);
    }

    private void b()
    {
        String s;
label0:
        {
            int j = App.am;
            long l = App.P();
            if (l == 0L)
            {
                s = getString(0x7f0e029c);
                if (j == 0)
                {
                    break label0;
                }
            }
            if (l == -1L)
            {
                s = getString(0x7f0e0458);
                if (j == 0)
                {
                    break label0;
                }
            }
            s = q.l(this, l);
        }
        findPreference(z[39]).setSummary(String.format(getString(0x7f0e03b4), new Object[] {
            s
        }));
    }

    static void b(SettingsChat settingschat)
    {
        settingschat.b();
    }

    protected void onActivityResult(int j, int l, Intent intent)
    {
        int i1;
        i1 = App.am;
        if (l != 0 || intent == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        boolean flag = intent.getBooleanExtra(z[24], false);
        if (flag)
        {
            try
            {
                Log.e(z[27]);
                App.a(this, App.au.getString(0x7f0e0163));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        try
        {
            if (intent.getBooleanExtra(z[23], false))
            {
                Log.e(z[26]);
                App.a(this, App.au.getString(0x7f0e015f));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        try
        {
            if (intent.getBooleanExtra(z[0], false))
            {
                Log.e(z[16]);
                App.a(this, App.au.getString(0x7f0e015a));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw intent;
        }
        j;
        JVM INSTR lookupswitch 3: default 156
    //                   17: 283
    //                   18: 206
    //                   104: 176;
           goto _L1 _L2 _L3 _L4
_L1:
        super.onActivityResult(j, l, intent);
_L8:
        return;
        intent;
        throw intent;
_L4:
        Object obj;
        Point point;
        if (l != -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        android.graphics.BitmapFactory.Options options;
        int j1;
        boolean flag1;
        try
        {
            h = intent.getStringExtra(z[12]);
            showDialog(19);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent) { }
            try
            {
                throw intent;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (l != -1) goto _L6; else goto _L5
_L5:
        if (intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = intent.getData();
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(intent.getData(), -1, 0, 0);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = intent.getBooleanExtra(z[1], true);
        if (!flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.e(z[21]);
        showDialog(7);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L2:
        if (l != -1 || intent == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        point = d.e(this);
        if (intent.getData() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i((new StringBuilder()).append(z[22]).append(intent.getData().toString()).toString());
        obj = com.whatsapp.App.d.query(intent.getData(), null, null, null, null);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        ((Cursor) (obj)).moveToFirst();
        j1 = ((Cursor) (obj)).getColumnIndex(z[19]);
        if (j1 < 0)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        flag1 = ((Cursor) (obj)).getString(j1).equals(z[8]);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(com.whatsapp.App.d.openInputStream(intent.getData()), null, options);
        if (options.outWidth != point.x || options.outHeight != point.y)
        {
            break MISSING_BLOCK_LABEL_548;
        }
        a(intent.getData(), -1, 0, 0);
        if (obj != null)
        {
            ((Cursor) (obj)).close();
            return;
        }
        if (true) goto _L8; else goto _L7
        intent;
        throw intent;
        intent;
        FileNotFoundException filenotfoundexception;
        int k1;
        boolean flag2;
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        throw intent;
        filenotfoundexception;
        Log.a(filenotfoundexception);
        if (obj != null)
        {
            try
            {
                ((Cursor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
        }
        Log.i((new StringBuilder()).append(z[2]).append(point.x).append(z[14]).append(point.y).toString());
        obj = new Intent(this, com/whatsapp/wallpaper/CropImage);
        ((Intent) (obj)).putExtra(z[4], point.x);
        ((Intent) (obj)).putExtra(z[17], point.y);
        ((Intent) (obj)).putExtra(z[15], 1);
        ((Intent) (obj)).putExtra(z[10], true);
        ((Intent) (obj)).putExtra(z[5], true);
        ((Intent) (obj)).setData(intent.getData());
        ((Intent) (obj)).putExtra(z[11], d.a());
        ((Intent) (obj)).putExtra(z[28], android.graphics.Bitmap.CompressFormat.JPEG.toString());
        startActivityForResult(((Intent) (obj)), 18);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L7:
        k1 = intent.getIntExtra(z[20], 0);
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_850;
        }
        Log.i((new StringBuilder()).append(z[6]).append(k1).append(z[25]).append(point.x).append(",").append(point.y).append("]").toString());
        a(null, k1, point.x, point.y);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = intent.getBooleanExtra(z[7], false);
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_901;
        }
        d.b(this);
        App.b(getBaseContext(), getString(0x7f0e049e), 0);
        Log.i(z[9]);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag2 = intent.getBooleanExtra(z[18], false);
        if (flag2)
        {
            try
            {
                d.d(this);
                App.b(getBaseContext(), getString(0x7f0e049f), 0);
                Log.i(z[3]);
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                throw intent;
            }
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        App.b(getBaseContext(), getString(0x7f0e016e), 0);
        Log.e((new StringBuilder()).append(z[13]).append(intent.toString()).toString());
        if (true) goto _L1; else goto _L9
_L9:
        intent;
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        try
        {
            throw intent;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent) { }
        throw intent;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(0x7f050007);
        bundle = (CheckBoxPreference)findPreference(z[31]);
        bundle.setOnPreferenceClickListener(new uv(this, bundle));
        findPreference(z[32]).setOnPreferenceClickListener(new rp(this));
        bundle = (ListPreference)findPreference(z[38]);
        bundle.setTitle(getString(0x7f0e03ac, new Object[] {
            bundle.getEntry()
        }));
        bundle.setOnPreferenceChangeListener(new a_p(this));
        findPreference(z[30]).setOnPreferenceClickListener(new alq(this));
        findPreference(z[29]).setOnPreferenceClickListener(new qp(this));
        findPreference(z[36]).setOnPreferenceClickListener(new a30(this));
        findPreference(z[34]).setOnPreferenceClickListener(new wo(this));
        findPreference(z[33]).setOnPreferenceClickListener(new c(this));
        bundle = findPreference(z[35]);
        int j = u5.b();
        int l = u5.a();
        if (j > 0 || l == 0)
        {
            j = 0x7f0e0048;
        } else
        {
            j = 0x7f0e044f;
        }
        bundle.setTitle(j);
        findPreference(z[37]).setOnPreferenceClickListener(new abo(this));
    }

    protected Dialog onCreateDialog(int j)
    {
        switch (j)
        {
        case 7: // '\007'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        default:
            return super.onCreateDialog(j);

        case 8: // '\b'
            Calendar calendar = Calendar.getInstance();
            calendar.set(14, 0);
            calendar.set(13, 0);
            calendar.set(12, 0);
            calendar.set(11, 4);
            e4 e4_1 = new e4(this);
            e4_1.setTitle(getString(0x7f0e0265));
            if (App.m())
            {
                j = 0x7f0e0395;
            } else
            {
                j = 0x7f0e0396;
            }
            e4_1.setMessage(getString(j, new Object[] {
                q.g(this, calendar.getTimeInMillis())
            }));
            e4_1.setIndeterminate(true);
            e4_1.setCancelable(false);
            return e4_1;

        case 9: // '\t'
            android.app.AlertDialog.Builder builder = (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f0e026b));
            if (App.m())
            {
                j = 0x7f0e0300;
            } else
            {
                j = 0x7f0e0301;
            }
            return builder.setMessage(getString(j)).setNeutralButton(0x7f0e02ba, new ly(this)).create();

        case 10: // '\n'
            android.app.AlertDialog.Builder builder1 = (new android.app.AlertDialog.Builder(this)).setTitle(getString(0x7f0e026b));
            if (App.m())
            {
                j = 0x7f0e02ab;
            } else
            {
                j = 0x7f0e02ac;
            }
            return builder1.setMessage(getString(j)).setNeutralButton(0x7f0e02ba, new aoo(this)).create();

        case 3: // '\003'
            aod aod1 = new aod(this);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0092).setPositiveButton(0x7f0e02ba, aod1).setNeutralButton(0x7f0e007b, null).create();

        case 4: // '\004'
            b b1 = new b(this);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e011d).setPositiveButton(0x7f0e02ba, b1).setNeutralButton(0x7f0e007b, null).create();

        case 5: // '\005'
            auu auu1;
            android.app.AlertDialog.Builder builder2;
            boolean flag;
            if (u5.b() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            auu1 = new auu(this, flag);
            builder2 = new android.app.AlertDialog.Builder(this);
            if (flag)
            {
                j = 0x7f0e0049;
            } else
            {
                j = 0x7f0e0450;
            }
            return builder2.setMessage(j).setPositiveButton(0x7f0e02ba, auu1).setNeutralButton(0x7f0e007b, null).create();

        case 6: // '\006'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setTitle(getString(0x7f0e02f8));
            progressdialog.setMessage(getString(0x7f0e0353));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 19: // '\023'
            break;
        }
        if (h == null)
        {
            return super.onCreateDialog(j);
        } else
        {
            og og = App.az.e(h);
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0146).setPositiveButton(0x7f0e0053, new vc(this, og)).setNeutralButton(0x7f0e04b4, new nn(this, og)).create();
        }
    }

    protected void onResume()
    {
        super.onResume();
        b();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[40];
        obj = "`(zA\002{(%";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "l5%K\002$(8I";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "~&;H\000h72V_j58T_a\">C\030}}";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                j = 3;
                obj = "z\"#P\031g $\013\007h+;T\021y\"%\013\024l!6Q\034}";
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                j = 4;
                obj = "f2#T\005}\037";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "j58T2p\b\"P\000|3\004M\nl";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "~&;H\000h72VPo58IPy <\036";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "`4\bV\025z\"#";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "^&;H h72V";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                obj = "z\"#P\031g $\013\007h+;T\021y\"%\013\002l42P";
                byte0 = 8;
                j = 9;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "z$6H\025\\7\036B>l\"3A\024";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "f2#T\005}";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "j(9P\021j3";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "z\"#P\031g $\013\007h+;T\021y\"%\013\031g16H\031m\0301M\034l}";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = ");w";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "z$6H\025";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                j = 16;
                obj = "j(9R\025{46P\031f)xE\023}.!M\004p52W_o&>H_e(6@]`*6C\025";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[j] = ((String) (obj));
                j = 17;
                obj = "f2#T\005}\036";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[j] = ((String) (obj));
                j = 18;
                obj = "`4\b@\025o&\"H\004";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[j] = ((String) (obj));
                j = 19;
                obj = "k24O\025}\0303M\003y+6]/g&:A";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[j] = ((String) (obj));
                j = 20;
                obj = "{\"3m\024";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[j] = ((String) (obj));
                j = 21;
                obj = "j(9R\025{46P\031f)xE\023}.!M\004p52W\005e3xG\002f7>I\021n\"xK\037dj2V\002f5";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[j] = ((String) (obj));
                j = 22;
                obj = "~&;H\000h72V_z\"#Q\000&4%GJ";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[j] = ((String) (obj));
                j = 23;
                obj = "g(zW\000h$2";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[j] = ((String) (obj));
                j = 24;
                obj = "f(:";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[j] = ((String) (obj));
                j = 25;
                obj = ")\034";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[j] = ((String) (obj));
                j = 26;
                obj = "j(9R\025{46P\031f)xE\023}.!M\004p52W_g(zW\000h$2";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[j] = ((String) (obj));
                j = 27;
                obj = "j(9R\025{46P\031f)xE\023}.!M\004p52W_f(:\t\025{58V";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[j] = ((String) (obj));
                j = 28;
                obj = "f2#T\005}\0018V\035h3";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[j] = ((String) (obj));
                j = 29;
                obj = "l*6M\034V$?E\004V/>W\004f5.";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[j] = ((String) (obj));
                j = 30;
                obj = "z\"#P\031g ${\007h+;T\021y\"%";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[j] = ((String) (obj));
                j = 31;
                obj = "`)'Q\004V\"9P\025{\030$A\036m";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[j] = ((String) (obj));
                j = 32;
                obj = "z\"#P\031g ${\021|38@\037~);K\021m";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[j] = ((String) (obj));
                j = 33;
                obj = "d40W\004f52{\023e\"6V/h+;{\023a&#W";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[j] = ((String) (obj));
                j = 34;
                obj = "d40W\004f52{\024l+2P\025V&;H/j/6P\003";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[j] = ((String) (obj));
                j = 35;
                obj = "d40W\004f52{\021{$?M\006l\0306H\034V$?E\004z";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[j] = ((String) (obj));
                obj = "d40W\004f52{\022h$<Q\000V)8S";
                byte0 = 35;
                j = 36;
                break;

            case 35: // '#'
                as1[j] = ((String) (obj));
                j = 37;
                obj = "d40W\004f52{\021{$?M\006l\0306H\034V$?E\004z";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[j] = ((String) (obj));
                j = 38;
                obj = "`)#A\002o&4A/o(9P/z.-A";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[j] = ((String) (obj));
                j = 39;
                obj = "d40W\004f52{\022h$<Q\000V)8S";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c2 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 960
    //                   0 983
    //                   1 990
    //                   2 997
    //                   3 1004;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1004;
_L3:
        byte byte1 = 112;
_L9:
        obj[l] = (char)(byte1 ^ c2);
        l++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 71;
          goto _L9
_L6:
        byte1 = 87;
          goto _L9
        byte1 = 36;
          goto _L9
    }
}
