// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Throwables;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.collect:
//            ComputingConcurrentHashMap, MapMaker, ComputationException

static final class nit> extends ComputingConcurrentHashMap
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    public Object get(Object obj)
    {
        Object obj1;
        try
        {
            obj1 = getOrCompute(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ((ExecutionException) (obj)).getCause();
            Throwables.propagateIfInstanceOf(((Throwable) (obj)), com/google/common/collect/ComputationException);
            throw new ComputationException(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            obj1 = String.valueOf(String.valueOf(computingFunction));
            obj = String.valueOf(String.valueOf(obj));
            throw new NullPointerException((new StringBuilder(((String) (obj1)).length() + 24 + ((String) (obj)).length())).append(((String) (obj1))).append(" returned null for key ").append(((String) (obj))).append(".").toString());
        } else
        {
            return obj1;
        }
    }

    (MapMaker mapmaker, Function function)
    {
        super(mapmaker, function);
    }
}
