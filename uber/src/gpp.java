// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public final class gpp
{

    private static final List a = a();
    private static final Locale b = new Locale("en", "IN");

    public static String a(Context context, double d)
    {
        NumberFormat numberformat = NumberFormat.getCurrencyInstance(b);
        numberformat.setMinimumFractionDigits(0);
        return numberformat.format(d).replace("Rs.", context.getString(gom.ub__india_rupee_symbol));
    }

    private static List a()
    {
        gkf gkf1 = (new gkf()).a(Character.UnicodeBlock.CJK_RADICALS_SUPPLEMENT).a(Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION).a(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A).a(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS).a(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS).a(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B).a(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT);
        if (b())
        {
            gkf1.a(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_C);
            gkf1.a(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_D);
        }
        return gkf1.a();
    }

    public static boolean a(char c)
    {
        return a.contains(Character.UnicodeBlock.of(c));
    }

    public static boolean a(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= s.length())
                {
                    break label1;
                }
                if (!a(s.charAt(i)))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public static boolean a(Locale locale)
    {
        return locale.equals(Locale.CHINA) || locale.getLanguage().equals(Locale.CHINESE.getLanguage());
    }

    private static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

}
