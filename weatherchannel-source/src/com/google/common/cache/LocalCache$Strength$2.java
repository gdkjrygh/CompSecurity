// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class nit> extends nit>
{

    Equivalence defaultEquivalence()
    {
        return Equivalence.identity();
    }

    nce referenceValue(try try1, try try2, Object obj, int i)
    {
        if (i == 1)
        {
            return new ference(try1.ueReferenceQueue, obj, try2);
        } else
        {
            return new tValueReference(try1.ueReferenceQueue, obj, try2, i);
        }
    }

    nce(String s, int i)
    {
        super(s, i, null);
    }
}
