// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.reflect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

// Referenced classes of package com.google.common.reflect:
//            TypeResolver

static final class var
{

    private final TypeVariable var;

    private boolean equalsTypeVariable(TypeVariable typevariable)
    {
        return var.getGenericDeclaration().equals(typevariable.getGenericDeclaration()) && var.getName().equals(typevariable.getName());
    }

    static Object forLookup(Type type)
    {
        if (type instanceof TypeVariable)
        {
            return new <init>((TypeVariable)type);
        } else
        {
            return null;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof <init>)
        {
            return equalsTypeVariable(((equalsTypeVariable)obj).var);
        } else
        {
            return false;
        }
    }

    boolean equalsType(Type type)
    {
        if (type instanceof TypeVariable)
        {
            return equalsTypeVariable((TypeVariable)type);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return Objects.hashCode(new Object[] {
            var.getGenericDeclaration(), var.getName()
        });
    }

    public String toString()
    {
        return var.toString();
    }

    (TypeVariable typevariable)
    {
        var = (TypeVariable)Preconditions.checkNotNull(typevariable);
    }
}
