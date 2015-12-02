// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.reflect;

import java.lang.ref.SoftReference;

// Referenced classes of package org.aspectj.runtime.reflect:
//            SignatureImpl

private static final class makeCache
    implements makeCache
{

    private SoftReference toStringCacheRef;

    private String[] array()
    {
        return (String[])(String[])toStringCacheRef.get();
    }

    private String[] makeCache()
    {
        String as[] = new String[3];
        toStringCacheRef = new SoftReference(as);
        return as;
    }

    public String get(int i)
    {
        String as[] = array();
        if (as == null)
        {
            return null;
        } else
        {
            return as[i];
        }
    }

    public void set(int i, String s)
    {
        String as1[] = array();
        String as[] = as1;
        if (as1 == null)
        {
            as = makeCache();
        }
        as[i] = s;
    }

    public _cls9()
    {
        makeCache();
    }
}
