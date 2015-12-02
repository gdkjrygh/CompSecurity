// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class dyj
{

    public static boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
    }

    public static boolean b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (!TextUtils.isEmpty(s = duj.c(s, null)) && duj.e(s, null))
            {
                return true;
            }
        }
        return false;
    }
}
