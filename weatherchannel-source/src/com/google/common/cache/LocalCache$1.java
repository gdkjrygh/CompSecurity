// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class ferenceEntry
    implements lueReference
{

    public lueReference copyFor(ReferenceQueue referencequeue, Object obj, ferenceEntry ferenceentry)
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public ferenceEntry getEntry()
    {
        return null;
    }

    public int getWeight()
    {
        return 0;
    }

    public boolean isActive()
    {
        return false;
    }

    public boolean isLoading()
    {
        return false;
    }

    public void notifyNewValue(Object obj)
    {
    }

    public Object waitForValue()
    {
        return null;
    }

    ferenceEntry()
    {
    }
}
