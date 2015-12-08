// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeVisitor, TypeResolver, Types

static final class it> extends TypeVisitor
{

    final Map val$mappings;
    final Type val$to;

    void visitClass(Class class1)
    {
        class1 = String.valueOf(String.valueOf(class1));
        throw new IllegalArgumentException((new StringBuilder(class1.length() + 21)).append("No type mapping from ").append(class1).toString());
    }

    void visitGenericArrayType(GenericArrayType genericarraytype)
    {
        Type type = Types.getComponentType(val$to);
        boolean flag;
        if (type != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s is not an array type.", new Object[] {
            val$to
        });
        TypeResolver.access$100(val$mappings, genericarraytype.getGenericComponentType(), type);
    }

    void visitParameterizedType(ParameterizedType parameterizedtype)
    {
        ParameterizedType parameterizedtype1 = (ParameterizedType)TypeResolver.access$000(java/lang/reflect/ParameterizedType, val$to);
        Preconditions.checkArgument(parameterizedtype.getRawType().equals(parameterizedtype1.getRawType()), "Inconsistent raw type: %s vs. %s", new Object[] {
            parameterizedtype, val$to
        });
        Type atype[] = parameterizedtype.getActualTypeArguments();
        Type atype1[] = parameterizedtype1.getActualTypeArguments();
        boolean flag;
        if (atype.length == atype1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "%s not compatible with %s", new Object[] {
            parameterizedtype, parameterizedtype1
        });
        for (int i = 0; i < atype.length; i++)
        {
            TypeResolver.access$100(val$mappings, atype[i], atype1[i]);
        }

    }

    void visitTypeVariable(TypeVariable typevariable)
    {
        val$mappings.put(new peVariableKey(typevariable), val$to);
    }

    void visitWildcardType(WildcardType wildcardtype)
    {
        WildcardType wildcardtype1 = (WildcardType)TypeResolver.access$000(java/lang/reflect/WildcardType, val$to);
        Type atype[] = wildcardtype.getUpperBounds();
        Type atype1[] = wildcardtype1.getUpperBounds();
        Type atype2[] = wildcardtype.getLowerBounds();
        Type atype3[] = wildcardtype1.getLowerBounds();
        boolean flag;
        if (atype.length == atype1.length && atype2.length == atype3.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Incompatible type: %s vs. %s", new Object[] {
            wildcardtype, val$to
        });
        for (int i = 0; i < atype.length; i++)
        {
            TypeResolver.access$100(val$mappings, atype[i], atype1[i]);
        }

        for (int j = 0; j < atype2.length; j++)
        {
            TypeResolver.access$100(val$mappings, atype2[j], atype3[j]);
        }

    }

    peVariableKey(Map map, Type type)
    {
        val$mappings = map;
        val$to = type;
        super();
    }
}
