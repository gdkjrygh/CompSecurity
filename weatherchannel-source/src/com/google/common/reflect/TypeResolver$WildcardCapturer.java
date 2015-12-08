// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.common.reflect:
//            TypeResolver, Types

private static final class <init>
{

    private final AtomicInteger id;

    private Type[] capture(Type atype[])
    {
        Type atype1[] = new Type[atype.length];
        for (int i = 0; i < atype.length; i++)
        {
            atype1[i] = capture(atype[i]);
        }

        return atype1;
    }

    private Type captureNullable(Type type)
    {
        if (type == null)
        {
            return null;
        } else
        {
            return capture(type);
        }
    }

    Type capture(Type type)
    {
        Preconditions.checkNotNull(type);
        break MISSING_BLOCK_LABEL_5;
        if (!(type instanceof Class) && !(type instanceof TypeVariable))
        {
            if (type instanceof GenericArrayType)
            {
                return Types.newArrayType(capture(((GenericArrayType)type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType)
            {
                type = (ParameterizedType)type;
                return Types.newParameterizedTypeWithOwner(captureNullable(type.getOwnerType()), (Class)type.getRawType(), capture(type.getActualTypeArguments()));
            }
            if (type instanceof WildcardType)
            {
                WildcardType wildcardtype = (WildcardType)type;
                if (wildcardtype.getLowerBounds().length == 0)
                {
                    type = wildcardtype.getUpperBounds();
                    int i = id.incrementAndGet();
                    type = String.valueOf(String.valueOf(Joiner.on('&').join(type)));
                    return Types.newArtificialTypeVariable(com/google/common/reflect/TypeResolver$WildcardCapturer, (new StringBuilder(type.length() + 33)).append("capture#").append(i).append("-of ? extends ").append(type).toString(), wildcardtype.getUpperBounds());
                }
            } else
            {
                throw new AssertionError("must have been one of the known types");
            }
        }
        return type;
    }

    private ()
    {
        id = new AtomicInteger();
    }

    id(id id1)
    {
        this();
    }
}
