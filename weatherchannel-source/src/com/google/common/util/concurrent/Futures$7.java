// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Function;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.common.util.concurrent:
//            Futures

static final class 
    implements Function
{

    public Boolean apply(Constructor constructor)
    {
        return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(java/lang/String));
    }

    public volatile Object apply(Object obj)
    {
        return apply((Constructor)obj);
    }

    ()
    {
    }
}
