// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v4.app.NotificationManagerCompat;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import com.google.af;
import com.google.fi;
import com.whatsapp.util.Log;
import com.whatsapp.util.b8;
import java.util.Random;

// Referenced classes of package com.whatsapp:
//            UserFeedbackActivity, q, i, App, 
//            ve, asy, o4, Main, 
//            RegisterName, m_, _a, kl

public class VerifyNumber extends UserFeedbackActivity
{

    protected static String k;
    private static final String z[];
    boolean j;
    PhoneStateListener l;
    boolean m;
    boolean n;
    private int o;
    private String p;
    int q;

    public VerifyNumber()
    {
        n = false;
        j = false;
        m = false;
        p = null;
        o = -1;
        l = new q(this);
    }

    static kl a(Context context, String s, String s1, String s2, String s3)
    {
        context = i.a(context, s1);
        b8 b8_1 = b8.a(App.z.getNetworkOperator());
        b8 b8_2 = b8.a(App.z.getSimOperator());
        return ve.a(s, (new StringBuilder()).append(s).append(s1).toString(), s1, b8_1, b8_2, s2, s3, context.toString());
    }

    static String a(String s)
    {
        int j1 = App.am;
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = 0;
        do
        {
            if (i1 >= s.length())
            {
                break;
            }
            stringbuilder.append((char)(s.charAt(i1) ^ 0x12));
            i1 += 6;
        } while (j1 == 0);
        return stringbuilder.toString();
    }

    static String a(String s, String s1)
    {
        if (s != null && s1 != null) goto _L2; else goto _L1
_L1:
        try
        {
            Log.e(z[1]);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        s = null;
_L4:
        return s;
_L2:
        String s2 = (new StringBuilder()).append("+").append(s).append(" ").append(s1).toString();
        af af1 = af.a();
        try
        {
            s1 = af1.c(s1, asy.h(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.a(z[0], s);
            return s2;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.a(z[2], s);
            return s2;
        }
        s = s2;
        if (s1 == null) goto _L4; else goto _L3
_L3:
        s = af1.a(s1, fi.INTERNATIONAL);
        return s;
    }

    static String c(String s)
    {
        int k1 = App.am;
        if (s == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        int i1 = 0;
        do
        {
            if (i1 >= s.length())
            {
                break;
            }
            stringbuilder.append((char)(s.charAt(i1) ^ 0x12));
            int j1 = 1;
            do
            {
                if (j1 >= 6)
                {
                    break;
                }
                stringbuilder.append((char)((new Random()).nextInt(10) + 48 ^ 0x12));
                j1++;
            } while (k1 == 0);
            i1++;
        } while (k1 == 0);
        return stringbuilder.toString();
    }

    static String f()
    {
        String s;
        try
        {
            s = App.z.getLine1Number();
        }
        catch (Exception exception)
        {
            Log.w((new StringBuilder()).append(z[9]).append(exception.toString()).toString());
            return null;
        }
        return s;
    }

    protected void a(ServiceState servicestate)
    {
    }

    String b(String s, String s1)
    {
        int i1 = App.z.getNetworkType();
        Log.i((new StringBuilder()).append(z[6]).append(i1).toString());
        String s2 = App.z.getNetworkOperator();
        String s3 = App.z.getNetworkOperatorName();
        android.net.NetworkInfo networkinfo = App.aI.getActiveNetworkInfo();
        Log.i((new StringBuilder()).append(z[4]).append(s3).append(z[5]).append(s2).toString());
        Log.i((new StringBuilder()).append(z[7]).append(getResources().getConfiguration().mcc).append(" ").append(getResources().getConfiguration().mnc).toString());
        Log.i((new StringBuilder()).append(z[8]).append(App.z.getSimOperator()).toString());
        if (asy.a(s, s2) || asy.b(s, s3) || asy.a(s, networkinfo))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append("+").append(s).append(s1).toString();
        }
    }

    protected void b(String s)
    {
        e(s);
    }

    protected void c(int i1)
    {
        Log.i(z[10]);
        long l1 = System.currentTimeMillis();
        Object obj = getString(0x7f0e03dd);
        String s = getString(0x7f0e03e1);
        String s1 = getString(0x7f0e03df);
        obj = new Notification(0x7f0205da, ((CharSequence) (obj)), l1);
        obj.defaults = 3;
        obj.flags = 16;
        Context context = getApplicationContext();
        Intent intent = new Intent(context, getClass());
        if (i1 != -1)
        {
            intent.putExtra(z[11], i1);
        }
        intent.addFlags(0x20000000);
        ((Notification) (obj)).setLatestEventInfo(context, s, s1, PendingIntent.getActivity(context, 0, intent, 0x10000000));
        NotificationManagerCompat.from(this).notify(1, ((Notification) (obj)));
    }

    protected boolean c()
    {
label0:
        {
            if (o4.a() != null || o4.P() || App.l != 3 && o4.p() || !o4.c(getApplication()) || o4.a(getApplication()) == null)
            {
                k = z[13];
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (q == 2)
            {
                k = z[14];
            }
        }
        return false;
    }

    protected void d()
    {
        c(-1);
    }

    public void d(int i1)
    {
label0:
        {
            if (!j && !isFinishing())
            {
                a(i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            p = getString(i1);
        }
    }

    public void d(String s)
    {
label0:
        {
            if (!j && !isFinishing())
            {
                super.f(s);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            p = s;
        }
    }

    protected void e()
    {
        Object obj;
        String s;
        String s1;
        Notification notification;
        Context context;
label0:
        {
            Log.i(z[3]);
            long l1 = System.currentTimeMillis();
            obj = getString(0x7f0e03de);
            s = getString(0x7f0e03e2);
            s1 = getString(0x7f0e03e0);
            notification = new Notification(0x7f0205da, ((CharSequence) (obj)), l1);
            notification.defaults = 3;
            notification.flags = 16;
            context = getApplicationContext();
            if (m)
            {
                obj = new Intent(context, com/whatsapp/Main);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            obj = new Intent(context, com/whatsapp/RegisterName);
            App.d(this, 2);
        }
        notification.setLatestEventInfo(context, s, s1, PendingIntent.getActivity(context, 0, ((Intent) (obj)), 0x10000000));
        NotificationManagerCompat.from(this).notify(1, notification);
    }

    protected void e(int i1)
    {
label0:
        {
            if (j || isFinishing())
            {
                c(i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            showDialog(i1);
        }
    }

    public void f(int i1)
    {
label0:
        {
            if (!j && !isFinishing())
            {
                showDialog(i1);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            o = i1;
        }
    }

    protected void g(String s)
    {
        k = s;
        App.c(this, s);
    }

    protected boolean g()
    {
        return App.z.getNetworkType() != 11;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        q = App.z.getPhoneType();
        Log.i((new StringBuilder()).append(z[12]).append(q).toString());
    }

    protected Dialog onCreateDialog(int i1)
    {
        switch (i1)
        {
        default:
            return super.onCreateDialog(i1);

        case 109: // 'm'
            return (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0e033d).setPositiveButton(0x7f0e008f, new m_(this)).setNeutralButton(0x7f0e007b, new _a(this)).create();
        }
    }

    public void onPause()
    {
        j = true;
        super.onPause();
        App.c(this, k);
    }

    public void onResume()
    {
        j = false;
        super.onResume();
        k = App.k(this);
        if (p != null)
        {
            f(p);
        }
        if (o != -1)
        {
            showDialog(o);
        }
        p = null;
        o = -1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[15];
        obj = "MLA\017RBGF\013V^[\034\000[IDR\022@^[\036\003LXLC\022]TG";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "MLA\017RBGF\013V^[\034\026F^]G\037DI@]\022\033XJ\036\tF\026Y[\bAV\004Z\025\031U\\_\n";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "MLA\017RBGF\013V^[\034\000[IDR\022@^[\036\017ZR]\036\003LXLC\022]TG";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "MLA\017RBGF\013V^[\034\b[O@U\037\033MLA\017RRLW";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "MLA\017RBGF\013V^[\034\bQO^\\\024_\024GR\013Q\006";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "\024J\\\002Q\006";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "MLA\017RBGF\013V^[\034\bQO^\\\024_\024";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "MLA\017RBGF\013V^[\034\005[UOZ\001\024";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "MLA\017RBGF\013V^[\034\025]VFCF";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "MLA\017RBGF\013V^[\034\001QOY[\tZ^G]\023YYLAIQI[\\\024\024";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "MLA\017RBGF\013V^[\034\b[O@U\037\033NGE\003FROZ\003P";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "XF^HCSHG\025UKY\035\020QI@U\037ZNDQ\003F\025MZ\007XTN";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "MLA\017RBGF\013V^[\034\026\\TGV9@BYVF";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                i1 = 13;
                obj = "HL_\000\031HL]\002\031QHZ\nVIFX\003Z";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i1] = ((String) (obj));
                i1 = 14;
                obj = "HL_\000\031HL]\002\031XM^\007";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i1] = ((String) (obj));
                z = as;
                k = "";
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 416
    //                   0 439
    //                   1 446
    //                   2 453
    //                   3 460;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_460;
_L3:
        byte byte1 = 52;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 59;
          goto _L9
_L5:
        byte1 = 41;
          goto _L9
_L6:
        byte1 = 51;
          goto _L9
        byte1 = 102;
          goto _L9
    }
}
