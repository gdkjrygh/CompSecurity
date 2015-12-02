// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dur
{

    public static String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = Pattern.compile("\\d{4,}").matcher(s)).find() && (s = s.group()).length() == 4)
            {
                return s;
            }
        }
        return null;
    }
}
