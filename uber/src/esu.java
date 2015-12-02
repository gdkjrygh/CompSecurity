// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class esu
    implements esl
{

    private esu()
    {
    }

    esu(byte byte0)
    {
        this();
    }

    public final int a()
    {
        return 16;
    }

    public final boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            s = s.replaceAll("\\s", "");
            return Pattern.compile("^4.*").matcher(s).matches();
        }
    }

    public final int b()
    {
        return 3;
    }

    public final boolean b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (TextUtils.isDigitsOnly(s = s.replaceAll("\\s", "")) && s.length() >= 13 && s.length() <= 16)
            {
                return esj.e(s);
            }
        }
        return false;
    }

    public final boolean c(String s)
    {
        return esj.f(s);
    }

    public final String d(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        s1 = s1.replaceAll("\\s", "");
        s = s1;
        if (s1.length() > 16)
        {
            s = s1.substring(0, 16);
        }
        return s.replaceAll("\\S{4}", "$0 ").trim();
    }
}
