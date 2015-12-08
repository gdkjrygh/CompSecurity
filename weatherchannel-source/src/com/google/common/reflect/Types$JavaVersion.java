// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.common.reflect:
//            Types, TypeCapture

static abstract class <init> extends Enum
{

    private static final JAVA6 $VALUES[];
    static final JAVA6 CURRENT;
    public static final JAVA6 JAVA6;
    public static final JAVA6 JAVA7;
    public static final JAVA6 JAVA8;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/common/reflect/Types$JavaVersion, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract Type newArrayType(Type type);

    String typeName(Type type)
    {
        return Types.toString(type);
    }

    final ImmutableList usedInGenericType(Type atype[])
    {
        com.google.common.collect.der der = ImmutableList.builder();
        int j = atype.length;
        for (int i = 0; i < j; i++)
        {
            der.add(usedInGenericType(atype[i]));
        }

        return der.build();
    }

    abstract Type usedInGenericType(Type type);

    static 
    {
        JAVA6 = new Types.JavaVersion("JAVA6", 0) {

            GenericArrayType newArrayType(Type type)
            {
                return new Types.GenericArrayTypeImpl(type);
            }

            volatile Type newArrayType(Type type)
            {
                return newArrayType(type);
            }

            Type usedInGenericType(Type type)
            {
                Preconditions.checkNotNull(type);
                Object obj = type;
                if (type instanceof Class)
                {
                    Class class1 = (Class)type;
                    obj = type;
                    if (class1.isArray())
                    {
                        obj = new Types.GenericArrayTypeImpl(class1.getComponentType());
                    }
                }
                return ((Type) (obj));
            }

        };
        JAVA7 = new Types.JavaVersion("JAVA7", 1) {

            Type newArrayType(Type type)
            {
                if (type instanceof Class)
                {
                    return Types.getArrayClass((Class)type);
                } else
                {
                    return new Types.GenericArrayTypeImpl(type);
                }
            }

            Type usedInGenericType(Type type)
            {
                return (Type)Preconditions.checkNotNull(type);
            }

        };
        JAVA8 = new Types.JavaVersion("JAVA8", 2) {

            Type newArrayType(Type type)
            {
                return JAVA7.newArrayType(type);
            }

            String typeName(Type type)
            {
                try
                {
                    type = (String)java/lang/reflect/Type.getMethod("getTypeName", new Class[0]).invoke(type, new Object[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Type type)
                {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                }
                // Misplaced declaration of an exception variable
                catch (Type type)
                {
                    throw new RuntimeException(type);
                }
                // Misplaced declaration of an exception variable
                catch (Type type)
                {
                    throw new RuntimeException(type);
                }
                return type;
            }

            Type usedInGenericType(Type type)
            {
                return JAVA7.usedInGenericType(type);
            }

        };
        $VALUES = (new .VALUES[] {
            JAVA6, JAVA7, JAVA8
        });
        if (java/lang/reflect/AnnotatedElement.isAssignableFrom(java/lang/reflect/TypeVariable))
        {
            CURRENT = JAVA8;
        } else
        if ((new TypeCapture() {

    }).capture() instanceof Class)
        {
            CURRENT = JAVA7;
        } else
        {
            CURRENT = JAVA6;
        }
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    _cls4(String s, int i, _cls4 _pcls4)
    {
        this(s, i);
    }
}
