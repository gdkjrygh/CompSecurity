// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;

// Referenced classes of package com.google.common.cache:
//            CacheLoader

private static final class computingSupplier extends CacheLoader
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Supplier computingSupplier;

    public Object load(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return computingSupplier.get();
    }

    public (Supplier supplier)
    {
        computingSupplier = (Supplier)Preconditions.checkNotNull(supplier);
    }
}
