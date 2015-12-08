// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Map;

public class TypeToken
{

    final int hashCode;
    final Class rawType;
    final Type type;

    protected TypeToken()
    {
        type = getSuperclassTypeParameter(getClass());
        rawType = com.google.gson.internal..Gson.Types.getRawType(type);
        hashCode = type.hashCode();
    }

    TypeToken(Type type1)
    {
        type = com.google.gson.internal..Gson.Types.canonicalize((Type)com.google.gson.internal..Gson.Preconditions.checkNotNull(type1));
        rawType = com.google.gson.internal..Gson.Types.getRawType(type);
        hashCode = type.hashCode();
    }

    private static transient AssertionError buildUnexpectedTypeError(Type type1, Class aclass[])
    {
        StringBuilder stringbuilder = new StringBuilder("Unexpected type. Expected one of: ");
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(aclass[i].getName()).append(", ");
        }

        stringbuilder.append("but got: ").append(type1.getClass().getName()).append(", for type token: ").append(type1.toString()).append('.');
        return new AssertionError(stringbuilder.toString());
    }

    public static TypeToken get(Class class1)
    {
        return new TypeToken(class1);
    }

    public static TypeToken get(Type type1)
    {
        return new TypeToken(type1);
    }

    static Type getSuperclassTypeParameter(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            return com.google.gson.internal..Gson.Types.canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
        }
    }

    private static boolean isAssignableFrom(Type type1, GenericArrayType genericarraytype)
    {
        Type type2 = genericarraytype.getGenericComponentType();
        if (!(type2 instanceof ParameterizedType)) goto _L2; else goto _L1
_L1:
        genericarraytype = type1;
        if (!(type1 instanceof GenericArrayType)) goto _L4; else goto _L3
_L3:
        genericarraytype = ((GenericArrayType)type1).getGenericComponentType();
_L5:
        return isAssignableFrom(((Type) (genericarraytype)), (ParameterizedType)type2, ((Map) (new HashMap())));
_L4:
        if (type1 instanceof Class)
        {
            for (type1 = (Class)type1; type1.isArray(); type1 = type1.getComponentType()) { }
            genericarraytype = type1;
        }
        if (true) goto _L5; else goto _L2
_L2:
        return true;
    }

    private static boolean isAssignableFrom(Type type1, ParameterizedType parameterizedtype, Map map)
    {
        if (type1 == null)
        {
            return false;
        }
        if (parameterizedtype.equals(type1))
        {
            return true;
        }
        Class class1 = com.google.gson.internal..Gson.Types.getRawType(type1);
        ParameterizedType parameterizedtype1 = null;
        if (type1 instanceof ParameterizedType)
        {
            parameterizedtype1 = (ParameterizedType)type1;
        }
        if (parameterizedtype1 != null)
        {
            Type atype[] = parameterizedtype1.getActualTypeArguments();
            TypeVariable atypevariable[] = class1.getTypeParameters();
            for (int i = 0; i < atype.length; i++)
            {
                type1 = atype[i];
                TypeVariable typevariable = atypevariable[i];
                for (; type1 instanceof TypeVariable; type1 = (Type)map.get(((TypeVariable)type1).getName())) { }
                map.put(typevariable.getName(), type1);
            }

            if (typeEquals(parameterizedtype1, parameterizedtype, map))
            {
                return true;
            }
        }
        type1 = class1.getGenericInterfaces();
        int k = type1.length;
        for (int j = 0; j < k; j++)
        {
            if (isAssignableFrom(type1[j], parameterizedtype, ((Map) (new HashMap(map)))))
            {
                return true;
            }
        }

        return isAssignableFrom(class1.getGenericSuperclass(), parameterizedtype, ((Map) (new HashMap(map))));
    }

    private static boolean matches(Type type1, Type type2, Map map)
    {
        return type2.equals(type1) || (type1 instanceof TypeVariable) && type2.equals(map.get(((TypeVariable)type1).getName()));
    }

    private static boolean typeEquals(ParameterizedType parameterizedtype, ParameterizedType parameterizedtype1, Map map)
    {
        if (!parameterizedtype.getRawType().equals(parameterizedtype1.getRawType())) goto _L2; else goto _L1
_L1:
        int i;
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        parameterizedtype1 = parameterizedtype1.getActualTypeArguments();
        i = 0;
_L5:
        if (i >= parameterizedtype.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (matches(parameterizedtype[i], parameterizedtype1[i], map)) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return true;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof TypeToken) && com.google.gson.internal..Gson.Types.equals(type, ((TypeToken)obj).type);
    }

    public final Class getRawType()
    {
        return rawType;
    }

    public final Type getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return hashCode;
    }

    public boolean isAssignableFrom(TypeToken typetoken)
    {
        return isAssignableFrom(typetoken.getType());
    }

    public boolean isAssignableFrom(Class class1)
    {
        return isAssignableFrom(((Type) (class1)));
    }

    public boolean isAssignableFrom(Type type1)
    {
        if (type1 == null)
        {
            return false;
        }
        if (type.equals(type1))
        {
            return true;
        }
        if (type instanceof Class)
        {
            return rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1));
        }
        if (type instanceof ParameterizedType)
        {
            return isAssignableFrom(type1, (ParameterizedType)type, ((Map) (new HashMap())));
        }
        if (type instanceof GenericArrayType)
        {
            boolean flag;
            if (rawType.isAssignableFrom(com.google.gson.internal..Gson.Types.getRawType(type1)) && isAssignableFrom(type1, (GenericArrayType)type))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        } else
        {
            throw buildUnexpectedTypeError(type, new Class[] {
                java/lang/Class, java/lang/reflect/ParameterizedType, java/lang/reflect/GenericArrayType
            });
        }
    }

    public final String toString()
    {
        return com.google.gson.internal..Gson.Types.typeToString(type);
    }
}
