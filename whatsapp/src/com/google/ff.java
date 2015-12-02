// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.regex.Pattern;

// Referenced classes of package com.google:
//            d3

public class ff
{

    private d3 a;

    public ff(int i)
    {
        a = new d3(i);
    }

    public Pattern a(String s)
    {
        Pattern pattern1 = (Pattern)a.a(s);
        Pattern pattern = pattern1;
        if (pattern1 == null)
        {
            pattern = Pattern.compile(s);
            a.a(s, pattern);
        }
        return pattern;
    }
}
