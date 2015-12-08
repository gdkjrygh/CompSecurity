// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class nit> extends nit>
{

    Type newArrayType(Type type)
    {
        return JAVA7.wArrayType(type);
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
        return JAVA7.edInGenericType(type);
    }

    (String s, int i)
    {
        super(s, i, null);
    }
}
