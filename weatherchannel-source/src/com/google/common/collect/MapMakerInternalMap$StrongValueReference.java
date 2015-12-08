// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class referent
    implements referent
{

    final Object referent;

    public void clear(referent referent1)
    {
    }

    public referent copyFor(ReferenceQueue referencequeue, Object obj, referent referent1)
    {
        return this;
    }

    public Object get()
    {
        return referent;
    }

    public referent getEntry()
    {
        return null;
    }

    public boolean isComputingReference()
    {
        return false;
    }

    public Object waitForValue()
    {
        return get();
    }

    (Object obj)
    {
        referent = obj;
    }
}
