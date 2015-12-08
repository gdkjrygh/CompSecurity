// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Converter, Enums, Preconditions

private static final class Null extends Converter
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Class enumClass;

    protected volatile Object doBackward(Object obj)
    {
        return doBackward((Enum)obj);
    }

    protected String doBackward(Enum enum)
    {
        return enum.name();
    }

    protected Enum doForward(String s)
    {
        return Enum.valueOf(enumClass, s);
    }

    protected volatile Object doForward(Object obj)
    {
        return doForward((String)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof doForward)
        {
            obj = (doForward)obj;
            return enumClass.equals(((enumClass) (obj)).enumClass);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return enumClass.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(enumClass.getName()));
        return (new StringBuilder(s.length() + 29)).append("Enums.stringConverter(").append(s).append(".class)").toString();
    }

    (Class class1)
    {
        enumClass = (Class)Preconditions.checkNotNull(class1);
    }
}
