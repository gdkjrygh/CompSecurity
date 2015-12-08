// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

abstract class TypeCapture
{

    TypeCapture()
    {
    }

    final Type capture()
    {
        Type type = getClass().getGenericSuperclass();
        Preconditions.checkArgument(type instanceof ParameterizedType, "%s isn't parameterized", new Object[] {
            type
        });
        return ((ParameterizedType)type).getActualTypeArguments()[0];
    }
}
