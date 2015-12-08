// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

// Referenced classes of package com.google.common.reflect:
//            TypeToken

static final class nit> extends nit>
{

    public boolean apply(TypeToken typetoken)
    {
        return !(TypeToken.access$400(typetoken) instanceof TypeVariable) && !(TypeToken.access$400(typetoken) instanceof WildcardType);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((TypeToken)obj);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
