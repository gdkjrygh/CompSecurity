// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

// Referenced classes of package com.google.common.reflect:
//            Invokable, Types

static class constructor extends Invokable
{

    final Constructor constructor;

    private boolean mayNeedHiddenThis()
    {
        Class class1 = constructor.getDeclaringClass();
        if (class1.getEnclosingConstructor() == null) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Method method;
        method = class1.getEnclosingMethod();
        if (method == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!Modifier.isStatic(method.getModifiers())) goto _L1; else goto _L3
_L3:
        return false;
        if (class1.getEnclosingClass() != null && !Modifier.isStatic(class1.getModifiers())) goto _L1; else goto _L4
_L4:
        return false;
    }

    Type[] getGenericExceptionTypes()
    {
        return constructor.getGenericExceptionTypes();
    }

    Type[] getGenericParameterTypes()
    {
        Type atype[] = constructor.getGenericParameterTypes();
        if (atype.length > 0 && mayNeedHiddenThis())
        {
            Class aclass[] = constructor.getParameterTypes();
            if (atype.length == aclass.length && aclass[0] == getDeclaringClass().getEnclosingClass())
            {
                return (Type[])Arrays.copyOfRange(atype, 1, atype.length);
            }
        }
        return atype;
    }

    Type getGenericReturnType()
    {
        Class class1 = getDeclaringClass();
        TypeVariable atypevariable[] = class1.getTypeParameters();
        Object obj = class1;
        if (atypevariable.length > 0)
        {
            obj = Types.newParameterizedType(class1, atypevariable);
        }
        return ((Type) (obj));
    }

    final Annotation[][] getParameterAnnotations()
    {
        return constructor.getParameterAnnotations();
    }

    public final TypeVariable[] getTypeParameters()
    {
        TypeVariable atypevariable[] = getDeclaringClass().getTypeParameters();
        TypeVariable atypevariable1[] = constructor.getTypeParameters();
        TypeVariable atypevariable2[] = new TypeVariable[atypevariable.length + atypevariable1.length];
        System.arraycopy(atypevariable, 0, atypevariable2, 0, atypevariable.length);
        System.arraycopy(atypevariable1, 0, atypevariable2, atypevariable.length, atypevariable1.length);
        return atypevariable2;
    }

    final Object invokeInternal(Object obj, Object aobj[])
        throws InvocationTargetException, IllegalAccessException
    {
        try
        {
            obj = constructor.newInstance(aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            aobj = String.valueOf(String.valueOf(constructor));
            throw new RuntimeException((new StringBuilder(((String) (aobj)).length() + 8)).append(((String) (aobj))).append(" failed.").toString(), ((Throwable) (obj)));
        }
        return obj;
    }

    public final boolean isOverridable()
    {
        return false;
    }

    public final boolean isVarArgs()
    {
        return constructor.isVarArgs();
    }

    (Constructor constructor1)
    {
        super(constructor1);
        constructor = constructor1;
    }
}
