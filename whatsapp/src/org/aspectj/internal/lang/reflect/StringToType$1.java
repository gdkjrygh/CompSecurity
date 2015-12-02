// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.internal.lang.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

// Referenced classes of package org.aspectj.internal.lang.reflect:
//            StringToType

static final class val.baseClass
    implements ParameterizedType
{

    final Class val$baseClass;
    final Type val$typeParams[];

    public Type[] getActualTypeArguments()
    {
        return val$typeParams;
    }

    public Type getOwnerType()
    {
        return val$baseClass.getEnclosingClass();
    }

    public Type getRawType()
    {
        return val$baseClass;
    }

    (Type atype[], Class class1)
    {
        val$typeParams = atype;
        val$baseClass = class1;
        super();
    }
}
