// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

abstract class TypeVisitor
{

    private final Set visited = Sets.newHashSet();

    TypeVisitor()
    {
    }

    public final transient void visit(Type atype[])
    {
        int i;
        int j;
        j = atype.length;
        i = 0;
_L2:
        Type type;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        type = atype[i];
        if (type != null && visited.add(type))
        {
            break; /* Loop/switch isn't completed */
        }
_L5:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!(type instanceof TypeVariable)) goto _L4; else goto _L3
_L3:
        visitTypeVariable((TypeVariable)type);
_L6:
        if (false)
        {
            visited.remove(type);
        }
          goto _L5
_L4:
        if (!(type instanceof WildcardType))
        {
            break MISSING_BLOCK_LABEL_109;
        }
        visitWildcardType((WildcardType)type);
          goto _L6
        atype;
        if (true)
        {
            visited.remove(type);
        }
        throw atype;
label0:
        {
            if (!(type instanceof ParameterizedType))
            {
                break label0;
            }
            visitParameterizedType((ParameterizedType)type);
        }
          goto _L6
label1:
        {
            if (!(type instanceof Class))
            {
                break label1;
            }
            visitClass((Class)type);
        }
          goto _L6
label2:
        {
            if (!(type instanceof GenericArrayType))
            {
                break label2;
            }
            visitGenericArrayType((GenericArrayType)type);
        }
          goto _L6
        atype = String.valueOf(String.valueOf(type));
        throw new AssertionError((new StringBuilder(atype.length() + 14)).append("Unknown type: ").append(atype).toString());
          goto _L5
    }

    void visitClass(Class class1)
    {
    }

    void visitGenericArrayType(GenericArrayType genericarraytype)
    {
    }

    void visitParameterizedType(ParameterizedType parameterizedtype)
    {
    }

    void visitTypeVariable(TypeVariable typevariable)
    {
    }

    void visitWildcardType(WildcardType wildcardtype)
    {
    }
}
