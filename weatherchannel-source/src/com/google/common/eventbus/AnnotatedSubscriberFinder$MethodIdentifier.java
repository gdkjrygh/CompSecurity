// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.eventbus;

import com.google.common.base.Objects;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.common.eventbus:
//            AnnotatedSubscriberFinder

private static final class parameterTypes
{

    private final String name;
    private final List parameterTypes;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof parameterTypes)
        {
            obj = (parameterTypes)obj;
            flag = flag1;
            if (name.equals(((name) (obj)).name))
            {
                flag = flag1;
                if (parameterTypes.equals(((parameterTypes) (obj)).parameterTypes))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            name, parameterTypes
        });
    }

    (Method method)
    {
        name = method.getName();
        parameterTypes = Arrays.asList(method.getParameterTypes());
    }
}
