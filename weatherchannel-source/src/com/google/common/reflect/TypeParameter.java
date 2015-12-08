// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.common.reflect:
//            TypeCapture

public abstract class TypeParameter extends TypeCapture
{

    final TypeVariable typeVariable;

    protected TypeParameter()
    {
        java.lang.reflect.Type type = capture();
        Preconditions.checkArgument(type instanceof TypeVariable, "%s should be a type variable.", new Object[] {
            type
        });
        typeVariable = (TypeVariable)type;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof TypeParameter)
        {
            obj = (TypeParameter)obj;
            return typeVariable.equals(((TypeParameter) (obj)).typeVariable);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return typeVariable.hashCode();
    }

    public String toString()
    {
        return typeVariable.toString();
    }
}
