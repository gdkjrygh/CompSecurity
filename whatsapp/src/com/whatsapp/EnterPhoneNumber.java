// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            VerifyNumber, asy, App, a95, 
//            _s, iz, gk, a8z

public class EnterPhoneNumber extends VerifyNumber
{

    private static final String A[];
    protected static long s;
    protected static String t;
    protected static String w;
    protected static int y;
    protected static String z;
    protected ProgressDialog r;
    protected a8z u;
    protected boolean v;
    protected boolean x;

    public EnterPhoneNumber()
    {
        x = false;
        v = false;
    }

    public static int a(String s1, String s2)
    {
label0:
        {
            int i;
            try
            {
                if (s1.length() < 1)
                {
                    break label0;
                }
                i = s1.length();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                try
                {
                    throw s1;
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    Log.e((new StringBuilder()).append(A[10]).append(s1).toString());
                }
                return 7;
            }
            if (i <= 3)
            {
                break MISSING_BLOCK_LABEL_78;
            }
        }
        Log.w((new StringBuilder()).append(A[1]).append(s1).toString());
        return 2;
        if (asy.d(s1) != null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        Log.w((new StringBuilder()).append(A[9]).append(s1).toString());
        return 3;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        int j = s2.length();
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        j = s2.replaceAll(A[5], "").length();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        Log.w((new StringBuilder()).append(A[3]).append(s1).toString());
        return 4;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        int k;
        j = Integer.parseInt(s1);
        s2 = asy.a(j, s2.replaceAll(A[2], ""));
        k = asy.a(j, s2.length());
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        Log.w((new StringBuilder()).append(A[0]).append(j).append(A[6]).append(s2).append(A[7]).append(k).toString());
        return k >= 0 ? 6 : 5;
        s1;
        try
        {
            throw s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        throw s1;
        if (s1.length() + s2.length() > 15)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        j = s1.length();
        k = s2.length();
        if (j + k >= 8)
        {
            break MISSING_BLOCK_LABEL_354;
        }
        Log.w((new StringBuilder()).append(A[8]).append(s1).append(A[4]).append(s2).toString());
        return 7;
        s1;
        throw s1;
        return 1;
    }

    protected void a(boolean flag)
    {
        x = flag;
        android.content.SharedPreferences.Editor editor = getPreferences(0).edit();
        editor.putBoolean(A[19], x);
        if (!editor.commit())
        {
            Log.w(A[20]);
        }
    }

    protected void b(boolean flag)
    {
    }

    protected boolean e()
    {
        return getPreferences(0).getBoolean(A[21], false);
    }

    protected void f()
    {
    }

    protected void g()
    {
        removeDialog(9);
        r = null;
    }

    protected Dialog onCreateDialog(int i)
    {
        switch (i)
        {
        default:
            return super.onCreateDialog(i);

        case 9: // '\t'
            ProgressDialog progressdialog = new ProgressDialog(this);
            progressdialog.setMessage(getString(0x7f0e031a));
            progressdialog.setIndeterminate(true);
            progressdialog.setCancelable(false);
            r = progressdialog;
            return progressdialog;

        case 22: // '\026'
            Log.w(A[17]);
            String s4 = getString(0x7f0e0340);
            String s5 = A[18];
            String s3 = s5;
            String s1 = s4;
            if (A[15].equals(VerifyNumber.f()))
            {
                s3 = s5;
                s1 = s4;
                if (A[12].equals(App.z.getSubscriberId()))
                {
                    s1 = (new StringBuilder()).append(s4).append(A[13]).append(getString(0x7f0e0172)).toString();
                    Log.i(A[11]);
                    s3 = A[14];
                }
            }
            return (new android.app.AlertDialog.Builder(this)).setMessage(s1).setPositiveButton(0x7f0e031b, new a95(this, s3)).setNeutralButton(0x7f0e007b, new _s(this)).create();

        case 23: // '\027'
            Log.w(A[16]);
            String s2 = iz.a(VerifyNumber.a(t, z));
            s2 = (new StringBuilder()).append(getString(0x7f0e0343)).append("\n").append(s2).append("\n").append(getString(0x7f0e0342)).toString();
            return (new android.app.AlertDialog.Builder(this)).setMessage(s2).setNeutralButton(0x7f0e02ba, new gk(this)).create();
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[22];
        obj = "da\"fvqg9ma.a#n+d}$lv.f8uemf2#gb2";
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
                obj = "da\"fvqg9ma.l5,f`k{oaoh\"k$blk";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "]K";
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "da\"fvqg9ma.a#n+d}$lv.j;spx/5`9";
                byte0 = 2;
                i = 3;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "!\177>>";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "]K";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "!\177>ljd2";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                obj = "!}3p9";
                byte0 = 6;
                i = 7;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "da\"fvqg9ma.a#n+d}$lv.c3mcugv`g<";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "da\"fvqg9ma.l5,f`k{meljv";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "da\"fvqg9ma.j$qks/\"qmlC3b`ha1Yas`vlv!c9lot\177\025lqo{$zJ`b3#bs`;#Gnz8wvx_>ljdF8ek!F\031F|bj&wmna";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "da\"fvqg9ma.z8qab` fv`m:f+q`%pmcc3.p`m:fp";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = "2>f:=4?f341?f34";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = "\013\005";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = "sj1jwuj$.ti`8f7";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "0:c613>n274";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "da\"fvqg9ma.k?bhnhyaeo";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                i = 17;
                obj = "da\"fvqg9ma.k?bhnhyvjsj5lrd}7ahd\"3qvn}";
                byte0 = 16;
                break;

            case 16: // '\020'
                as1[i] = ((String) (obj));
                i = 18;
                obj = "sj1jwuj$.ti`8f6";
                byte0 = 17;
                break;

            case 17: // '\021'
                as1[i] = ((String) (obj));
                i = 19;
                obj = "b`;-sin\"peq\177xQaff%was_>ljd!8l[rj:e[rj8g";
                byte0 = 18;
                break;

            case 18: // '\022'
                as1[i] = ((String) (obj));
                i = 20;
                obj = "da\"fvqg9ma.|7uarj$uas\1773qih|%jko 5lilf\"#b`f:f`";
                byte0 = 19;
                break;

            case 19: // '\023'
                as1[i] = ((String) (obj));
                i = 21;
                obj = "b`;-sin\"peq\177xQaff%was_>ljd!8l[rj:e[rj8g";
                byte0 = 20;
                break;

            case 20: // '\024'
                as1[i] = ((String) (obj));
                A = as;
                t = null;
                z = null;
                y = 7;
                w = null;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 584
    //                   0 606
    //                   1 612
    //                   2 619
    //                   3 626;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_626;
_L3:
        byte byte1 = 4;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 1;
          goto _L9
_L5:
        byte1 = 15;
          goto _L9
_L6:
        byte1 = 86;
          goto _L9
        byte1 = 3;
          goto _L9
    }
}
