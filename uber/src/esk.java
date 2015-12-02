// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class esk
    implements esl
{

    private esk()
    {
    }

    esk(byte byte0)
    {
        this();
    }

    public final int a()
    {
        return 15;
    }

    public final boolean a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            s = s.replaceAll("\\s", "");
            return Pattern.compile("^3[47].*").matcher(s).matches();
        }
    }

    public final int b()
    {
        return 4;
    }

    public final boolean b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if (TextUtils.isDigitsOnly(s = s.replaceAll("\\s", "")) && s.length() == 15)
            {
                return esj.e(s);
            }
        }
        return false;
    }

    public final boolean c(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s.replaceAll("\\s", "");
            if (TextUtils.isDigitsOnly(s) && s.length() == 4)
            {
                return true;
            }
        }
        return false;
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
        if (s1.length() > 15)
        {
            s = s1.substring(0, 15);
        }
        return s.replaceFirst("\\S{4}", "$0 ").replaceFirst("\\S{6}", "$0 ").trim();
    }
}
