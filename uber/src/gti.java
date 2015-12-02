// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class gti
{

    private static final Map a = new _cls1();

    public static Drawable a(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context is null");
        }
        context = context.getResources();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 11: default 132
    //                   -1802816241: 299
    //                   -676914601: 214
    //                   -298759312: 200
    //                   -231891079: 329
    //                   -46205774: 314
    //                   73257: 270
    //                   2666593: 344
    //                   73191083: 284
    //                   337828873: 242
    //                   344963008: 256
    //                   1098092761: 228;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L3:
        byte0;
        JVM INSTR tableswitch 0 10: default 192
    //                   0 359
    //                   1 367
    //                   2 375
    //                   3 383
    //                   4 391
    //                   5 399
    //                   6 407
    //                   7 415
    //                   8 423
    //                   9 431
    //                   10 439;
           goto _L2 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25
_L2:
        return context.getDrawable(gsc.ub__payment_type_unknown);
_L6:
        if (s.equals("American Express"))
        {
            byte0 = 0;
        }
          goto _L3
_L5:
        if (s.equals("Diners Club 14 Digit"))
        {
            byte0 = 1;
        }
          goto _L3
_L14:
        if (s.equals("Diners Club 16 Digit"))
        {
            byte0 = 2;
        }
          goto _L3
_L12:
        if (s.equals("Discover"))
        {
            byte0 = 3;
        }
          goto _L3
_L13:
        if (s.equals("Google Wallet"))
        {
            byte0 = 4;
        }
          goto _L3
_L9:
        if (s.equals("JCB"))
        {
            byte0 = 5;
        }
          goto _L3
_L11:
        if (s.equals("Laser"))
        {
            byte0 = 6;
        }
          goto _L3
_L4:
        if (s.equals("Maestro"))
        {
            byte0 = 7;
        }
          goto _L3
_L8:
        if (s.equals("MasterCard"))
        {
            byte0 = 8;
        }
          goto _L3
_L7:
        if (s.equals("UnionPay"))
        {
            byte0 = 9;
        }
          goto _L3
_L10:
        if (s.equals("Visa"))
        {
            byte0 = 10;
        }
          goto _L3
_L15:
        return context.getDrawable(gsc.ub__payment_profile_cc_amex);
_L16:
        return context.getDrawable(gsc.ub__payment_profile_cc_diners_club);
_L17:
        return context.getDrawable(gsc.ub__payment_profile_cc_diners_club);
_L18:
        return context.getDrawable(gsc.ub__payment_profile_cc_discover);
_L19:
        return context.getDrawable(gsc.ub__payment_type_googlewallet);
_L20:
        return context.getDrawable(gsc.ub__payment_profile_cc_jcb);
_L21:
        return context.getDrawable(gsc.ub__payment_type_unknown);
_L22:
        return context.getDrawable(gsc.ub__payment_type_unknown);
_L23:
        return context.getDrawable(gsc.ub__payment_profile_cc_mastercard);
_L24:
        return context.getDrawable(gsc.ub__payment_type_unionpay);
_L25:
        return context.getDrawable(gsc.ub__payment_profile_cc_visa);
    }

    public static String a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        }
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            gtk gtk1 = (gtk)a.get(s1);
            if (gtk1 != null && gtk1.a(s))
            {
                return s1;
            }
        }

        return "";
    }

    public static boolean a(String s, String s1)
    {
        s = (gtk)a.get(s);
        if (s != null)
        {
            return s.b(s1);
        }
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        return s1.replaceAll("\\s", "").length() >= 12;
    }

    public static int b(String s)
    {
        s = (gtk)a.get(s);
        if (s != null)
        {
            return s.b();
        } else
        {
            return 3;
        }
    }

    public static boolean b(String s, String s1)
    {
        s = (gtk)a.get(s);
        if (s != null)
        {
            return s.c(s1);
        }
        if (TextUtils.isEmpty(s1))
        {
            return false;
        }
        return s1.length() >= 3;
    }

    public static int c(String s)
    {
        s = (gtk)a.get(s);
        if (s != null)
        {
            return s.a();
        } else
        {
            return 16;
        }
    }

    public static String c(String s, String s1)
    {
        s = (gtk)a.get(s);
        if (s != null)
        {
            return s.d(s1);
        }
        if (TextUtils.isEmpty(s1))
        {
            return "";
        }
        s1 = s1.replaceAll("\\s", "");
        s = s1;
        if (s1.length() > 16)
        {
            s = s1.substring(0, 16);
        }
        return s.replaceAll("\\S{4}", "$0 ").trim();
    }

    static boolean d(String s)
    {
        return f(s);
    }

    static boolean e(String s)
    {
        return g(s);
    }

    private static boolean f(String s)
    {
        if (!TextUtils.isEmpty(s) && TextUtils.isDigitsOnly(s))
        {
            s = s.replaceAll("\\s", "").toCharArray();
            int i = s.length;
            int k = 1;
            int l = i - 1;
            i = 0;
            int j = 0;
            int i1 = 0;
            while (l >= 0) 
            {
                int j1 = Character.getNumericValue(s[l]);
                if (k == 1)
                {
                    i1 = j1;
                }
                if (k % 2 == 0)
                {
                    i = (j1 * 2) % 10 + j1 / 5 + i;
                } else
                {
                    j = j1 + j;
                }
                l--;
                k++;
            }
            if ((j + i) % 10 == 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (i1 == (((i + j) - i1) * 9) % 10)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (k && i)
            {
                return true;
            }
        }
        return false;
    }

    private static boolean g(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s.replaceAll("\\s", "");
            if (TextUtils.isDigitsOnly(s) && s.length() == 3)
            {
                return true;
            }
        }
        return false;
    }


    /* member class not found */
    class _cls1 {}

}
