// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            MapMakerInternalMap

static interface 
{

    public abstract void clear( );

    public abstract  copyFor(ReferenceQueue referencequeue, Object obj,  );

    public abstract Object get();

    public abstract  getEntry();

    public abstract boolean isComputingReference();

    public abstract Object waitForValue()
        throws ExecutionException;
}
