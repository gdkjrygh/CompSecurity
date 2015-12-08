// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

// Referenced classes of package com.google.common.reflect:
//            Types

static final class nGenericType
    implements WildcardType, Serializable
{

    private static final long serialVersionUID = 0L;
    private final ImmutableList lowerBounds;
    private final ImmutableList upperBounds;

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof WildcardType)
        {
            obj = (WildcardType)obj;
            flag = flag1;
            if (lowerBounds.equals(Arrays.asList(((WildcardType) (obj)).getLowerBounds())))
            {
                flag = flag1;
                if (upperBounds.equals(Arrays.asList(((WildcardType) (obj)).getUpperBounds())))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Type[] getLowerBounds()
    {
        return Types.access$300(lowerBounds);
    }

    public Type[] getUpperBounds()
    {
        return Types.access$300(upperBounds);
    }

    public int hashCode()
    {
        return lowerBounds.hashCode() ^ upperBounds.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("?");
        Type type;
        for (Iterator iterator = lowerBounds.iterator(); iterator.hasNext(); stringbuilder.append(" super ").append(NT.ame(type)))
        {
            type = (Type)iterator.next();
        }

        Type type1;
        for (Iterator iterator1 = Types.access$600(upperBounds).iterator(); iterator1.hasNext(); stringbuilder.append(" extends ").append(NT.ame(type1)))
        {
            type1 = (Type)iterator1.next();
        }

        return stringbuilder.toString();
    }

    (Type atype[], Type atype1[])
    {
        Types.access$200(atype, "lower bound for wildcard");
        Types.access$200(atype1, "upper bound for wildcard");
        lowerBounds = NT.nGenericType(atype);
        upperBounds = NT.nGenericType(atype1);
    }
}
