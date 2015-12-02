// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.InputFilter;
import android.widget.EditText;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.view.MenuItem;
import com.whatsapp.messaging.MessageService;
import com.whatsapp.protocol.ci;
import com.whatsapp.protocol.cj;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            EnterPhoneNumber, xq, k9, a1a, 
//            jn, sd, sp, r2, 
//            _9, App, o4, aoz, 
//            mk, k, og, asy, 
//            a8z, a_3, RegisterPhone, m7, 
//            xi, asw, iz, ix, 
//            atf, hb, z5, al7, 
//            z8

public class ChangeNumber extends EnterPhoneNumber
{

    private static String A;
    private static Handler C;
    public static Runnable D;
    private static String F;
    private static String H;
    public static ci I;
    private static final String M[];
    private a8z B;
    private Runnable E;
    private Handler G;
    private Runnable J;
    private ci K;
    private cj L;

    public ChangeNumber()
    {
        E = new jn(this);
        J = new sd(this);
        G = new sp(this);
        L = new r2(this);
        K = new _9(this);
    }

    static a8z a(ChangeNumber changenumber)
    {
        return changenumber.B;
    }

    static String a()
    {
        return A;
    }

    public static void a(Activity activity)
    {
        App.Me me;
        Log.i(M[32]);
        me = App.aE();
        if (App.a(me)) goto _L2; else goto _L1
_L1:
        activity.finish();
_L4:
        return;
        activity;
        throw activity;
_L2:
        App.Z = me;
        activity = o4.e(me.jabber_id);
        boolean flag;
        o4.c(activity, me.jabber_id);
        o4.O();
        App.at();
        c(App.au);
        flag = App.ah.i();
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Log.i(M[31]);
        App.ah.u();
        App.m(App.au);
        MessageService.b(App.au);
        App.aw();
        App.au.aK();
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        MessageService.b(App.au);
        return;
        activity;
        throw activity;
        activity;
        throw activity;
    }

    public static void a(Context context)
    {
        App.Y();
        App.aV();
        mk.a(true);
        oh oh = App.az.f();
        oh.g();
        oh.a(0, 0);
        App.aF = false;
        MessageService.b(context, true);
    }

    public static void a(Context context, long l)
    {
        context = context.getSharedPreferences(M[4], 0).edit();
        try
        {
            context.putLong(M[2], l);
            if (!context.commit())
            {
                Log.e(M[3]);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    public static void a(Context context, String s, String s1)
    {
        context = context.getSharedPreferences(M[17], 0).edit();
        try
        {
            context.putString(M[19], (new StringBuilder()).append(s).append(" ").append(s1).toString());
            if (!context.commit())
            {
                Log.e(M[18]);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    static void a(ChangeNumber changenumber, String s, a8z a8z1)
    {
        changenumber.a(s, a8z1);
    }

    private void a(String s, a8z a8z1)
    {
        try
        {
            Log.i((new StringBuilder()).append(M[38]).append(s).append(M[36]).append(asy.f(s)).toString());
        }
        catch (IOException ioexception)
        {
            Log.e((new StringBuilder()).append(M[37]).append(s).append(M[33]).append(ioexception.toString()).toString());
        }
        if (a8z1.e != null)
        {
            a8z1.c.removeTextChangedListener(a8z1.e);
        }
        try
        {
            a8z1.e = new a_3(asy.f(s));
            a8z1.c.addTextChangedListener(a8z1.e);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (a8z a8z1)
        {
            Log.a((new StringBuilder()).append(M[34]).append(s).append(M[39]).toString(), a8z1);
        }
        break MISSING_BLOCK_LABEL_185;
        a8z1;
        throw a8z1;
        s;
        Log.a(M[35], s);
        return;
    }

    static boolean a(ChangeNumber changenumber, String s, String s1, a8z a8z1)
    {
        return changenumber.a(s, s1, a8z1);
    }

    private boolean a(String s, String s1, a8z a8z1)
    {
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = true;
        flag = false;
        i = App.am;
        RegisterPhone.a(s, s1);
        JVM INSTR tableswitch 1 7: default 60
    //                   1 144
    //                   2 415
    //                   3 409
    //                   4 403
    //                   5 397
    //                   6 391
    //                   7 385;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (!flag) goto _L10; else goto _L9
_L9:
        i = Integer.parseInt(s);
        s1 = s1.replaceAll(M[20], "");
        a8z1 = asy.a(i, s1);
        s1 = a8z1;
_L17:
        Log.i((new StringBuilder()).append(M[23]).append(s).append(M[21]).append(s1).toString());
        t = s;
        z = s1;
_L10:
        return flag;
_L2:
        flag = flag2;
        if (i == 0) goto _L1; else goto _L11
_L11:
        a(0x7f0e0310);
        a8z1.b.requestFocus();
        flag = flag1;
        if (i == 0) goto _L1; else goto _L12
_L12:
        a(0x7f0e0311);
        a8z1.b.setText("");
        a8z1.b.requestFocus();
        flag = flag1;
        if (i == 0) goto _L1; else goto _L13
_L13:
        a(0x7f0e031d);
        a8z1.c.requestFocus();
        flag = flag1;
        if (i == 0) goto _L1; else goto _L14
_L14:
        f(getString(0x7f0e0315, new Object[] {
            a8z1.a
        }));
        a8z1.c.requestFocus();
        flag = flag1;
        if (i == 0) goto _L1; else goto _L15
_L15:
        f(getString(0x7f0e0314, new Object[] {
            a8z1.a
        }));
        a8z1.c.requestFocus();
        flag = flag1;
        if (i == 0) goto _L1; else goto _L16
_L16:
        try
        {
            f(getString(0x7f0e0313, new Object[] {
                a8z1.a
            }));
            a8z1.c.requestFocus();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        flag = flag1;
          goto _L1
        s;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        throw s;
        a8z1;
        Log.a(M[22], a8z1);
          goto _L17
_L8:
        flag1 = false;
          goto _L16
_L7:
        flag1 = false;
          goto _L15
_L6:
        flag1 = false;
          goto _L14
_L5:
        flag1 = false;
          goto _L13
_L4:
        flag1 = false;
          goto _L12
_L3:
        flag1 = false;
          goto _L11
    }

    static String b(String s)
    {
        A = s;
        return s;
    }

    private void b()
    {
        try
        {
            if (isFinishing())
            {
                Log.i(M[0]);
                return;
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        w = null;
        s = 0L;
        a(false);
        App.b(App.au, c(w));
        String s = App.r((new StringBuilder()).append(t).append(z).toString());
        byte abyte1[] = o4.g(s);
        byte abyte0[] = abyte1;
        if (abyte1 == null)
        {
            abyte0 = o4.i();
            o4.a(abyte0, s);
        }
        a(App.au, m7.d);
        asw.a(new xi(this, E, J), new byte[][] {
            t.getBytes(), z.getBytes(), abyte0
        });
    }

    public static void b(Context context)
    {
        context = context.getSharedPreferences(M[44], 0).edit();
        try
        {
            context.remove(M[45]);
            if (!context.commit())
            {
                Log.e(M[46]);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    static void b(ChangeNumber changenumber)
    {
        changenumber.b();
    }

    static cj c(ChangeNumber changenumber)
    {
        return changenumber.L;
    }

    static String c()
    {
        return F;
    }

    public static void c(Context context)
    {
        context = context.getSharedPreferences(M[15], 0).edit();
        try
        {
            context.remove(M[16]);
            if (!context.commit())
            {
                Log.e(M[14]);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
    }

    public static long d(Context context)
    {
        return context.getSharedPreferences(M[10], 0).getLong(M[11], -1L);
    }

    static Handler d(ChangeNumber changenumber)
    {
        return changenumber.G;
    }

    static String d()
    {
        return H;
    }

    static String d(String s)
    {
        H = s;
        return s;
    }

    static Handler e()
    {
        return C;
    }

    static ci e(ChangeNumber changenumber)
    {
        return changenumber.K;
    }

    public static String e(Context context)
    {
        return context.getSharedPreferences(M[12], 0).getString(M[13], null);
    }

    static String e(String s)
    {
        F = s;
        return s;
    }

    public static boolean f()
    {
        App.Me me;
        try
        {
            me = App.aE();
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        return me != null;
    }

    protected void b(boolean flag)
    {
        App.a(this, t, z);
        Object obj;
        String s;
        if (flag)
        {
            try
            {
                if (j)
                {
                    e();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj = App.q(this);
        try
        {
            obj.jabber_id = App.b(App.au);
            s = ((App.Me) (obj)).jabber_id;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            Log.b(flag);
            if (!App.a(((App.Me) (obj))))
            {
                finish();
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        break MISSING_BLOCK_LABEL_84;
        obj;
        throw obj;
        App.Z = ((App.Me) (obj));
        App.m(getApplication());
        App.q();
        MessageService.b(App.au);
        App.s();
        App.d(this, 3);
        o4.N();
        a(this);
        finish();
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag;
        Log.i(M[27]);
        super.onCreate(bundle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        setContentView(iz.a(getLayoutInflater(), 0x7f03002b, null, false, new int[] {
            0x7f0b00fc, 0x7f0b0100
        }));
        B = new a8z();
        u = new a8z();
        B.b = (EditText)findViewById(0x7f0b00fd);
        u.b = (EditText)findViewById(0x7f0b0101);
        B.c = (EditText)findViewById(0x7f0b00fe);
        u.c = (EditText)findViewById(0x7f0b0102);
        bundle = new android.text.InputFilter.LengthFilter(3);
        B.b.setFilters(new InputFilter[] {
            bundle
        });
        bundle = new android.text.InputFilter.LengthFilter(17);
        B.c.setFilters(new InputFilter[] {
            bundle
        });
        bundle = App.z.getNetworkCountryIso();
        int i;
        if (bundle != null)
        {
            try
            {
                A = asy.a(bundle);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                Log.e(M[26]);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
        }
        try
        {
            B.b.addTextChangedListener(new ix(this, B));
            u.b.addTextChangedListener(new ix(this, u));
            B.c.requestFocus();
            B.g = RegisterPhone.a(B.c);
            B.f = RegisterPhone.a(B.b);
            u.g = RegisterPhone.a(u.c);
            u.f = RegisterPhone.a(u.b);
            hb.a(this, getSupportActionBar(), getString(0x7f0e013b).toUpperCase(), new atf(this));
            if (A != null)
            {
                B.b.setText(A);
                u.b.setText(A);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        bundle = B.a;
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        i = bundle.length();
        if (i > 0)
        {
            try
            {
                Log.i((new StringBuilder()).append(M[30]).append(bundle).append(M[28]).append(asy.f(bundle)).toString());
            }
            catch (IOException ioexception)
            {
                Log.a((new StringBuilder()).append(M[29]).append(bundle).append(M[25]).toString(), ioexception);
            }
            // Misplaced declaration of an exception variable
            catch (Bundle bundle)
            {
                throw bundle;
            }
            a(bundle, B);
            a(bundle, u);
        }
        try
        {
            bundle = e(this);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            throw bundle;
        }
        if (bundle != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        v = flag;
        x = e();
        return;
        bundle;
        throw bundle;
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 1: // '\001'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e031a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            return progressdialog;

        case 2: // '\002'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e0084).setNeutralButton(0x7f0e0067, new z5(this)).create();

        case 109: // 'm'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e033d).setPositiveButton(0x7f0e008f, new al7(this)).setNeutralButton(0x7f0e007b, new z8(this)).create();
        }
    }

    protected void onDestroy()
    {
        Log.i(M[24]);
        super.onDestroy();
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
        String s;
        super.onPause();
        Log.i(M[1]);
        B.g = RegisterPhone.a(B.c);
        B.f = RegisterPhone.a(B.b);
        u.g = RegisterPhone.a(u.c);
        u.f = RegisterPhone.a(u.b);
        s = e(this);
        boolean flag = v;
        if (flag)
        {
            NullPointerException nullpointerexception;
            int i;
            try
            {
                a(this, t, z);
                i = App.am;
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
            if (i == 0)
            {
                break MISSING_BLOCK_LABEL_120;
            }
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        b(this);
        return;
        nullpointerexception;
        throw nullpointerexception;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        A = bundle.getString(M[6]);
        H = bundle.getString(M[9]);
        t = bundle.getString(M[7]);
        z = bundle.getString(M[8]);
    }

    public void onResume()
    {
        try
        {
            super.onResume();
            if (A != null)
            {
                B.b.setText(A);
            }
        }
        catch (NullPointerException nullpointerexception)
        {
            throw nullpointerexception;
        }
        RegisterPhone.b(B.b, B.f);
        RegisterPhone.b(B.c, B.g);
        RegisterPhone.b(u.b, u.f);
        RegisterPhone.b(u.c, u.g);
        Log.i(M[5]);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence(M[42], A);
        bundle.putCharSequence(M[41], H);
        bundle.putCharSequence(M[43], t);
        bundle.putCharSequence(M[40], z);
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[47];
        obj = "(*\032\013-.,\016\b(.0T\023/9+\035\034e(#\025\006/'";
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
                obj = "(*\032\013-.,\016\b(.0T\025+>1\036";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "(*\032\013-.\035\025\020')'\t:%'&$\0002;+\t\004>\"-\025";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "(*\032\013-.,\016\b(.0T\026/?-\027\001/32\022\027+?+\024\013e-#\022\t//";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "(*\032\013-.,\016\b(.0T\027/87\026\0";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "(-\016\013>9;$\006%/'";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "8\001\024\020$?0\002&%/'";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "8\022\023\n$.\f\016\b(.0";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ";*\024\013/\024,\016\b(.0";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "(*\032\013-.\035\025\020')'\t:%'&$\0002;+\t\004>\"-\025";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "(*\032\013-.\035\025\020')'\t:$.5$\013?& \036\027\025)#\025\013//";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "(*\032\013-.,\016\b(.0T\001/''\017\000%'&\036\035:\"0\032\021#$,T\003+\".\036\001";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "(*\032\013-.\035\025\020')'\t:%'&$\0002;+\t\004>\"-\025";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "(*\032\013-.,\016\b(.0T\007e8'\017J,*+\027\000.";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "(*\032\013-.\035\025\020')'\t:$.5$\013?& \036\027\025)#\025\013//";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "\027\006";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "d,\016\b(.0F";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                i = 22;
                obj = "(*\032\013-.,\016\b(.0T\006)k$\032\f&.&[\0218\"/7\000+/+\025\002\020.0\024E,9-\026E\t$7\025\02182\022\023\n$.\013\025\003%";
                byte0 = 21;
                break;

            case 21: // '\025'
                as1[i] = ((String) (obj));
                i = 23;
                obj = "(*\032\013-.,\016\b(.0T\006)v";
                byte0 = 22;
                break;

            case 22: // '\026'
                as1[i] = ((String) (obj));
                i = 24;
                obj = "(*\032\013-.,\016\b(.0T\001/86\t\n3";
                byte0 = 23;
                break;

            case 23: // '\027'
                as1[i] = ((String) (obj));
                i = 25;
                obj = "k$\032\f&.&[&%>,\017\0273\033*\024\013/\002,\035\nd'-\024\016?;\001\024\020$?0\002$()09\034\004*/\036Mc";
                byte0 = 24;
                break;

            case 24: // '\030'
                as1[i] = ((String) (obj));
                i = 26;
                obj = "(*\032\013-.,\016\b(.0T\f9$m\030\n..b\035\004#''\037E>$b\034\000>k!\024\001/k$\t\n'k\001\024\020$?0\0025\"$,\036,$--";
                byte0 = 25;
                break;

            case 25: // '\031'
                as1[i] = ((String) (obj));
                i = 27;
                obj = "(*\032\013-.,\016\b(.0T\0068.#\017\0";
                byte0 = 26;
                break;

            case 26: // '\032'
                as1[i] = ((String) (obj));
                i = 28;
                obj = "k>[";
                byte0 = 27;
                break;

            case 27: // '\033'
                as1[i] = ((String) (obj));
                i = 29;
                obj = "(*\032\013-.,\016\b(.0T\006%>,\017\0273q";
                byte0 = 28;
                break;

            case 28: // '\034'
                as1[i] = ((String) (obj));
                i = 30;
                obj = "(*\032\013-.,\016\b(.0T\006%>,\017\0273q";
                byte0 = 29;
                break;

            case 29: // '\035'
                as1[i] = ((String) (obj));
                i = 31;
                obj = "(*\032\013-.,\016\b(.0T\027/='\t\021e&1\034\026>$0\036\001(d*\036\004&?*\002";
                byte0 = 30;
                break;

            case 30: // '\036'
                as1[i] = ((String) (obj));
                i = 32;
                obj = "(*\032\013-.,\016\b(.0T\027/='\t\021g?-V\n&/";
                byte0 = 31;
                break;

            case 31: // '\037'
                as1[i] = ((String) (obj));
                i = 33;
                obj = "-#\022\t//b\017\nj'-\024\016?;\001\024\020$?0\002$()09\034\004*/\036E,9-\026E\t$7\025\02182\022\023\n$.\013\025\003%k";
                byte0 = 32;
                break;

            case 32: // ' '
                as1[i] = ((String) (obj));
                i = 34;
                obj = "(*\032\013-.,\016\b(.0T\006%>,\017\0273q";
                byte0 = 33;
                break;

            case 33: // '!'
                as1[i] = ((String) (obj));
                i = 35;
                obj = "(*\032\013-.,\016\b(.0T\003%9/\032\021>.0V\0002('\013\021#$,";
                byte0 = 34;
                break;

            case 34: // '"'
                as1[i] = ((String) (obj));
                i = 36;
                obj = "k>[";
                byte0 = 35;
                break;

            case 35: // '#'
                as1[i] = ((String) (obj));
                i = 37;
                obj = "(*\032\013-.,\016\b(.0T\006%>,\017\0273qb";
                byte0 = 36;
                break;

            case 36: // '$'
                as1[i] = ((String) (obj));
                i = 38;
                obj = "(*\032\013-.,\016\b(.0T\006%>,\017\0273q";
                byte0 = 37;
                break;

            case 37: // '%'
                as1[i] = ((String) (obj));
                i = 39;
                obj = "k!\032\0209.&[\004$k\0134 2('\013\021#$,";
                byte0 = 38;
                break;

            case 38: // '&'
                as1[i] = ((String) (obj));
                i = 40;
                obj = "8\022\023\n$.\f\016\b(.0";
                byte0 = 39;
                break;

            case 39: // '\''
                as1[i] = ((String) (obj));
                i = 41;
                obj = ";*\024\013/\024,\016\b(.0";
                byte0 = 40;
                break;

            case 40: // '('
                as1[i] = ((String) (obj));
                i = 42;
                obj = "(-\016\013>9;$\006%/'";
                byte0 = 41;
                break;

            case 41: // ')'
                as1[i] = ((String) (obj));
                i = 43;
                obj = "8\001\024\020$?0\002&%/'";
                byte0 = 42;
                break;

            case 42: // '*'
                as1[i] = ((String) (obj));
                i = 44;
                obj = "(-\026K=##\017\026+;2$\0258.$\036\027/%!\036\026";
                byte0 = 43;
                break;

            case 43: // '+'
                as1[i] = ((String) (obj));
                i = 45;
                obj = "(*\032\013-.\035\025\020')'\t:$.5$\013?& \036\027\025)#\025\013//";
                byte0 = 44;
                break;

            case 44: // ','
                as1[i] = ((String) (obj));
                i = 46;
                obj = "(*\032\013-.,\016\b(.0T\007e9'\026\n<.m\035\004#''\037";
                byte0 = 45;
                break;

            case 45: // '-'
                as1[i] = ((String) (obj));
                M = as;
                A = null;
                H = null;
                F = null;
                C = new xq(Looper.getMainLooper());
                D = new k9();
                I = new a1a();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1160
    //                   0 1183
    //                   1 1190
    //                   2 1197
    //                   3 1204;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_1204;
_L3:
        byte byte1 = 74;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 75;
          goto _L9
_L5:
        byte1 = 66;
          goto _L9
_L6:
        byte1 = 123;
          goto _L9
        byte1 = 101;
          goto _L9
    }
}
