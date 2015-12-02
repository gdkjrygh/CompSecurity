// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cP, fW

public final class b2
{

    public b2()
    {
    }

    static String a(fW fw, cP cp, String s)
    {
        return b(fw, cp, s);
    }

    private static String b(fW fw, cP cp, String s)
    {
        if (cp != null)
        {
            cp = (new StringBuilder()).append(cp.c()).append('.').append(s).toString();
        } else
        {
            cp = s;
            if (fw.f().length() > 0)
            {
                return (new StringBuilder()).append(fw.f()).append('.').append(s).toString();
            }
        }
        return cp;
    }
}
