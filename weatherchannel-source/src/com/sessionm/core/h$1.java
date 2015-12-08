// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.core;

import java.util.Comparator;

// Referenced classes of package com.sessionm.core:
//            h

static final class r
    implements Comparator
{

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public int compare(String s, String s1)
    {
        byte byte0 = 2;
        String as[] = s.split("=");
        String s3 = as[0];
        s = "";
        if (as.length > 1)
        {
            s = as[1];
        }
        int i = 2;
        String s2 = s;
        for (; i < as.length; i++)
        {
            s2 = (new StringBuilder()).append(s2).append("=").append(as[i]).toString();
        }

        s1 = s1.split("=");
        String s4 = s1[0];
        s = "";
        i = byte0;
        if (s1.length > 1)
        {
            s = s1[1];
            i = byte0;
        }
        for (; i < s1.length; i++)
        {
            s = (new StringBuilder()).append(s).append("=").append(s1[i]).toString();
        }

        if (s3.equals(s4))
        {
            return s2.compareTo(s);
        } else
        {
            return s3.compareTo(s4);
        }
    }

    r()
    {
    }
}
