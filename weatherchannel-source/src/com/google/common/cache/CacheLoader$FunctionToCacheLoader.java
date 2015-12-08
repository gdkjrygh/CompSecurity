// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.io.Serializable;

// Referenced classes of package com.google.common.cache:
//            CacheLoader

private static final class computingFunction extends CacheLoader
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Function computingFunction;

    public Object load(Object obj)
    {
        return computingFunction.apply(Preconditions.checkNotNull(obj));
    }

    public (Function function)
    {
        computingFunction = (Function)Preconditions.checkNotNull(function);
    }
}
