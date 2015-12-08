// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.geometry;

import com.google.common.base.Predicate;

// Referenced classes of package com.weather.util.geometry:
//            TwcGeohashUtils

private static final class excludeString
    implements Predicate
{

    private final String excludeString;

    public volatile boolean apply(Object obj)
    {
        return apply((String)obj);
    }

    public boolean apply(String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (excludeString.indexOf(s.charAt(0)) == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    (String s)
    {
        excludeString = s;
    }
}
