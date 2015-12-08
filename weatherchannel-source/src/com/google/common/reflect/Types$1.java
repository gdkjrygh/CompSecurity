// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Function;
import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class vaVersion
    implements Function
{

    public volatile Object apply(Object obj)
    {
        return apply((Type)obj);
    }

    public String apply(Type type)
    {
        return vaVersion.CURRENT.typeName(type);
    }

    vaVersion()
    {
    }
}
