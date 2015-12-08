// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

// Referenced classes of package com.google.common.reflect:
//            Types

private static final class ricType
    implements ParameterizedType, Serializable
{

    private static final long serialVersionUID = 0L;
    private final ImmutableList argumentsList;
    private final Type ownerType;
    private final Class rawType;

    public boolean equals(Object obj)
    {
        if (obj instanceof ParameterizedType)
        {
            if (getRawType().equals(((ParameterizedType) (obj = (ParameterizedType)obj)).getRawType()) && Objects.equal(getOwnerType(), ((ParameterizedType) (obj)).getOwnerType()) && Arrays.equals(getActualTypeArguments(), ((ParameterizedType) (obj)).getActualTypeArguments()))
            {
                return true;
            }
        }
        return false;
    }

    public Type[] getActualTypeArguments()
    {
        return Types.access$300(argumentsList);
    }

    public Type getOwnerType()
    {
        return ownerType;
    }

    public Type getRawType()
    {
        return rawType;
    }

    public int hashCode()
    {
        int i;
        if (ownerType == null)
        {
            i = 0;
        } else
        {
            i = ownerType.hashCode();
        }
        return i ^ argumentsList.hashCode() ^ rawType.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (ownerType != null)
        {
            stringbuilder.append(ownerType.ownerType(ownerType)).append('.');
        }
        stringbuilder.append(rawType.getName()).append('<').append(Types.access$500().join(Iterables.transform(argumentsList, Types.access$400()))).append('>');
        return stringbuilder.toString();
    }

    (Type type, Class class1, Type atype[])
    {
        Preconditions.checkNotNull(class1);
        boolean flag;
        if (atype.length == class1.getTypeParameters().length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Types.access$200(atype, "type parameter");
        ownerType = type;
        rawType = class1;
        argumentsList = argumentsList.ricType(atype);
    }
}
