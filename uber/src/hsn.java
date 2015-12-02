// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

public final class hsn
{

    public static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 11;
    }

    public static boolean b()
    {
        return android.os.Build.VERSION.SDK_INT >= 19;
    }

    public static String c()
    {
        Locale locale = Locale.getDefault();
        if ("es".equalsIgnoreCase(locale.getLanguage()))
        {
            return "es_MX";
        }
        if (!TextUtils.isEmpty(locale.getCountry()))
        {
            return String.format("%s_%s", new Object[] {
                locale.getLanguage(), locale.getCountry()
            });
        } else
        {
            return locale.getLanguage();
        }
    }
}
