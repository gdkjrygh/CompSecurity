// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ereceipt;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EReceiptUtils
{

    private static final Pattern sReceiptUrlPattern = Pattern.compile("^https?://wm(rt|tq?)\\.co/r/(.*)");

    public EReceiptUtils()
    {
    }

    public static String getUuid(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (!TextUtils.isEmpty(s))
        {
            s = sReceiptUrlPattern.matcher(s);
            s1 = obj;
            if (s.matches())
            {
                s1 = s.group(2).trim();
            }
        }
        return s1;
    }

}
