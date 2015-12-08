// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static final class nit> extends nit>
{

    Equivalence defaultEquivalence()
    {
        return Equivalence.identity();
    }

    nce referenceValue(try try1, try try2, Object obj)
    {
        return new ference(try1.ueReferenceQueue, obj, try2);
    }

    nce(String s, int i)
    {
        super(s, i, null);
    }
}
