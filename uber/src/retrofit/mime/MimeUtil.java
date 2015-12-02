// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MimeUtil
{

    private static final Pattern CHARSET = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    private MimeUtil()
    {
    }

    public static String parseCharset(String s)
    {
        return parseCharset(s, "UTF-8");
    }

    public static String parseCharset(String s, String s1)
    {
        s = CHARSET.matcher(s);
        if (s.find())
        {
            s1 = s.group(1).replaceAll("[\"\\\\]", "");
        }
        return s1;
    }

}
