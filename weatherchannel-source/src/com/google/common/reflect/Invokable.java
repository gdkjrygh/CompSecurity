// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

// Referenced classes of package com.google.common.reflect:
//            Element, TypeToken, Parameter, Types

public abstract class Invokable extends Element
    implements GenericDeclaration
{
    static class ConstructorInvokable extends Invokable
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

        ConstructorInvokable(Constructor constructor1)
        {
            super(constructor1);
            constructor = constructor1;
        }
    }

    static class MethodInvokable extends Invokable
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

        MethodInvokable(Method method1)
        {
            super(method1);
            method = method1;
        }
    }


    Invokable(AccessibleObject accessibleobject)
    {
        super(accessibleobject);
    }

    public static Invokable from(Constructor constructor)
    {
        return new ConstructorInvokable(constructor);
    }

    public static Invokable from(Method method)
    {
        return new MethodInvokable(method);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public final Class getDeclaringClass()
    {
        return super.getDeclaringClass();
    }

    public final ImmutableList getExceptionTypes()
    {
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        Type atype[] = getGenericExceptionTypes();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            builder.add(TypeToken.of(atype[i]));
        }

        return builder.build();
    }

    abstract Type[] getGenericExceptionTypes();

    abstract Type[] getGenericParameterTypes();

    abstract Type getGenericReturnType();

    public TypeToken getOwnerType()
    {
        return TypeToken.of(getDeclaringClass());
    }

    abstract Annotation[][] getParameterAnnotations();

    public final ImmutableList getParameters()
    {
        Type atype[] = getGenericParameterTypes();
        Annotation aannotation[][] = getParameterAnnotations();
        com.google.common.collect.ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < atype.length; i++)
        {
            builder.add(new Parameter(this, i, TypeToken.of(atype[i]), aannotation[i]));
        }

        return builder.build();
    }

    public final TypeToken getReturnType()
    {
        return TypeToken.of(getGenericReturnType());
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public final transient Object invoke(Object obj, Object aobj[])
        throws InvocationTargetException, IllegalAccessException
    {
        return invokeInternal(obj, (Object[])Preconditions.checkNotNull(((Object) (aobj))));
    }

    abstract Object invokeInternal(Object obj, Object aobj[])
        throws InvocationTargetException, IllegalAccessException;

    public abstract boolean isOverridable();

    public abstract boolean isVarArgs();

    public final Invokable returning(TypeToken typetoken)
    {
        if (!typetoken.isAssignableFrom(getReturnType()))
        {
            String s = String.valueOf(String.valueOf(getReturnType()));
            typetoken = String.valueOf(String.valueOf(typetoken));
            throw new IllegalArgumentException((new StringBuilder(s.length() + 35 + typetoken.length())).append("Invokable is known to return ").append(s).append(", not ").append(typetoken).toString());
        } else
        {
            return this;
        }
    }

    public final Invokable returning(Class class1)
    {
        return returning(TypeToken.of(class1));
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
