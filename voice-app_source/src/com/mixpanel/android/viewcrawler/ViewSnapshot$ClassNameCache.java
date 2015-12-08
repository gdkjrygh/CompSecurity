// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.util.LruCache;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewSnapshot

private static class  extends LruCache
{

    protected volatile Object create(Object obj)
    {
        return create((Class)obj);
    }

    protected String create(Class class1)
    {
        return class1.getCanonicalName();
    }

    public (int i)
    {
        super(i);
    }
}
