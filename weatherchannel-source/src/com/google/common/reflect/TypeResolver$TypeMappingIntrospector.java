// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Map;

// Referenced classes of package com.google.common.reflect:
//            TypeVisitor, TypeResolver

private static final class  extends TypeVisitor
{

    private static final visit wildcardCapturer = new visit(null);
    private final Map mappings = Maps.newHashMap();

    static ImmutableMap getTypeMappings(Type type)
    {
          = new <init>();
        .visit(new Type[] {
            wildcardCapturer.(type)
        });
        return ImmutableMap.copyOf(.mappings);
    }

    private void map(mappings mappings1, Type type)
    {
        if (!mappings.containsKey(mappings1)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Type type1 = type;
        do
        {
            if (type1 == null)
            {
                break;
            }
            if (mappings1.pe(type1))
            {
                while (type != null) 
                {
                    type = (Type)mappings.remove(p(type));
                }
                continue; /* Loop/switch isn't completed */
            }
            type1 = (Type)mappings.get(p(type1));
        } while (true);
        mappings.put(mappings1, type);
        return;
        if (true) goto _L1; else goto _L3
_L3:
    }

    void visitClass(Class class1)
    {
        visit(new Type[] {
            class1.getGenericSuperclass()
        });
        visit(class1.getGenericInterfaces());
    }

    void visitParameterizedType(ParameterizedType parameterizedtype)
    {
        Class class1 = (Class)parameterizedtype.getRawType();
        TypeVariable atypevariable[] = class1.getTypeParameters();
        Type atype[] = parameterizedtype.getActualTypeArguments();
        boolean flag;
        if (atypevariable.length == atype.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        for (int i = 0; i < atypevariable.length; i++)
        {
            map(new map(atypevariable[i]), atype[i]);
        }

        visit(new Type[] {
            class1
        });
        visit(new Type[] {
            parameterizedtype.getOwnerType()
        });
    }

    void visitTypeVariable(TypeVariable typevariable)
    {
        visit(typevariable.getBounds());
    }

    void visitWildcardType(WildcardType wildcardtype)
    {
        visit(wildcardtype.getUpperBounds());
    }


    private ()
    {
    }
}
