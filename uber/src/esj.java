// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class esj
{

    private static final Map a = new HashMap() {

            
            {
                put("American Express", new esk((byte)0));
                put("Diners Club 14 Digit", new esm((byte)0));
                put("Diners Club 16 Digit", new esn((byte)0));
                put("Discover", new eso((byte)0));
                put("JCB", new esp((byte)0));
                put("Laser", new esq((byte)0));
                put("Maestro", new esr((byte)0));
                put("MasterCard", new ess((byte)0));
                put("UnionPay", new est((byte)0));
                put("Visa", new esu((byte)0));
            }
    };

    public static Drawable a(Context context, String s)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context is null");
        } else
        {
            return context.getResources().getDrawable(c(s));
        }
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
            if (((esl)a.get(s1)).a(s))
            {
                return s1;
            }
        }

        return "";
    }

    private static String a(String s, int i)
    {
        if (s.length() >= i)
        {
            return s;
        }
        StringBuilder stringbuilder = new StringBuilder(i);
        for (int j = s.length(); j < i; j++)
        {
            stringbuilder.append('\u2022');
        }

        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public static boolean a(String s, String s1)
    {
        s = (esl)a.get(s);
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
        s = (esl)a.get(s);
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
        s = (esl)a.get(s);
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
        int i = 0x7f020276;
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 14: default 140
    //                   -2052918671: 406
    //                   -1911368973: 346
    //                   -298759312: 231
    //                   -231891079: 376
    //                   -46205774: 331
    //                   2092883: 259
    //                   2666593: 391
    //                   76891393: 361
    //                   337828873: 287
    //                   344963008: 301
    //                   872368606: 245
    //                   883966373: 273
    //                   1753544288: 316
    //                   1963873898: 217;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L3:
        byte0;
        JVM INSTR tableswitch 0 13: default 212
    //                   0 421
    //                   1 424
    //                   2 427
    //                   3 430
    //                   4 433
    //                   5 436
    //                   6 439
    //                   7 215
    //                   8 442
    //                   9 445
    //                   10 448
    //                   11 215
    //                   12 451
    //                   13 454;
           goto _L2 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L25 _L29 _L30
_L2:
        i = 0x7f020277;
_L25:
        return i;
_L17:
        if (s.equals("Alipay"))
        {
            byte0 = 0;
        }
          goto _L3
_L6:
        if (s.equals("American Express"))
        {
            byte0 = 1;
        }
          goto _L3
_L14:
        if (s.equals("Baidu Wallet"))
        {
            byte0 = 2;
        }
          goto _L3
_L9:
        if (s.equals("Cash"))
        {
            byte0 = 3;
        }
          goto _L3
_L15:
        if (s.equals("Delegate"))
        {
            byte0 = 4;
        }
          goto _L3
_L12:
        if (s.equals("Discover"))
        {
            byte0 = 5;
        }
          goto _L3
_L13:
        if (s.equals("Google Wallet"))
        {
            byte0 = 6;
        }
          goto _L3
_L16:
        if (s.equals("Lian Lian"))
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
_L5:
        if (s.equals("PayPal"))
        {
            byte0 = 9;
        }
          goto _L3
_L11:
        if (s.equals("Paytm"))
        {
            byte0 = 10;
        }
          goto _L3
_L7:
        if (s.equals("UnionPay"))
        {
            byte0 = 11;
        }
          goto _L3
_L10:
        if (s.equals("Visa"))
        {
            byte0 = 12;
        }
          goto _L3
_L4:
        if (s.equals("Airtel Money"))
        {
            byte0 = 13;
        }
          goto _L3
_L18:
        return 0x7f02026e;
_L19:
        return 0x7f020263;
_L20:
        return 0x7f02026f;
_L21:
        return 0x7f020270;
_L22:
        return 0x7f020272;
_L23:
        return 0x7f020265;
_L24:
        return 0x7f020273;
_L26:
        return 0x7f020267;
_L27:
        return 0x7f020274;
_L28:
        return 0x7f020275;
_L29:
        return 0x7f020268;
_L30:
        return 0x7f02026c;
    }

    public static String c(String s, String s1)
    {
        s = (esl)a.get(s);
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

    public static int d(String s)
    {
        s = (esl)a.get(s);
        if (s != null)
        {
            return s.a();
        } else
        {
            return 16;
        }
    }

    public static String d(String s, String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            return "";
        } else
        {
            int i = d(s);
            return c(s, a(s1.substring(Math.max(0, s1.length() - 4)), i));
        }
    }

    static boolean e(String s)
    {
        return g(s);
    }

    static boolean f(String s)
    {
        return h(s);
    }

    private static boolean g(String s)
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

    private static boolean h(String s)
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

}
