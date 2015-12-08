// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.common.reflect:
//            Invokable

static class method extends Invokable
{

    final Method method;

    Type[] getGenericExceptionTypes()
    {
        return method.getGenericExceptionTypes();
    }

    Type[] getGenericParameterTypes()
    {
        return method.getGenericParameterTypes();
    }

    Type getGenericReturnType()
    {
        return method.getGenericReturnType();
    }

    final Annotation[][] getParameterAnnotations()
    {
        return method.getParameterAnnotations();
    }

    public final TypeVariable[] getTypeParameters()
    {
        return method.getTypeParameters();
    }

    final Object invokeInternal(Object obj, Object aobj[])
        throws InvocationTargetException, IllegalAccessException
    {
        return method.invoke(obj, aobj);
    }

    public final boolean isOverridable()
    {
        return !isFinal() && !isPrivate() && !isStatic() && !Modifier.isFinal(getDeclaringClass().getModifiers());
    }

    public final boolean isVarArgs()
    {
        return method.isVarArgs();
    }

    _cls9(Method method1)
    {
        super(method1);
        method = method1;
    }
}
