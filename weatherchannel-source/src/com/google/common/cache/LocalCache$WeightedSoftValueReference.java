// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import java.lang.ref.ReferenceQueue;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class weight extends weight
{

    final int weight;

    public weight copyFor(ReferenceQueue referencequeue, Object obj, weight weight1)
    {
        return new <init>(referencequeue, obj, weight1, weight);
    }

    public int getWeight()
    {
        return weight;
    }

    (ReferenceQueue referencequeue, Object obj,  , int i)
    {
        super(referencequeue, obj, );
        weight = i;
    }
}
