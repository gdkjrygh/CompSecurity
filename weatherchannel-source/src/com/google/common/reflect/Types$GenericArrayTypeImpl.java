// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

// Referenced classes of package com.google.common.reflect:
//            Types

private static final class ericType
    implements GenericArrayType, Serializable
{

    private static final long serialVersionUID = 0L;
    private final Type componentType;

    public boolean equals(Object obj)
    {
        if (obj instanceof GenericArrayType)
        {
            obj = (GenericArrayType)obj;
            return Objects.equal(getGenericComponentType(), ((GenericArrayType) (obj)).getGenericComponentType());
        } else
        {
            return false;
        }
    }

    public Type getGenericComponentType()
    {
        return componentType;
    }

    public int hashCode()
    {
        return componentType.hashCode();
    }

    public String toString()
    {
        return String.valueOf(Types.toString(componentType)).concat("[]");
    }

    (Type type)
    {
        componentType = componentType.ericType(type);
    }
}
