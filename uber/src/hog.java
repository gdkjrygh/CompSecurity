// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class hog
{

    private final int a = 6;
    private final Pattern b = Pattern.compile("\\d{6,}");

    public hog()
    {
    }

    public final String a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            if ((s = b.matcher(s)).find() && (s = s.group()).length() == a)
            {
                return s;
            }
        }
        return null;
    }
}
