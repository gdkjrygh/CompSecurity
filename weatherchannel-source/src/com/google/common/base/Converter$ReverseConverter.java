// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Converter

private static final class original extends Converter
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Converter original;

    Object correctedDoBackward(Object obj)
    {
        return original.correctedDoForward(obj);
    }

    Object correctedDoForward(Object obj)
    {
        return original.correctedDoBackward(obj);
    }

    protected Object doBackward(Object obj)
    {
        throw new AssertionError();
    }

    protected Object doForward(Object obj)
    {
        throw new AssertionError();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof rd)
        {
            obj = (rd)obj;
            return original.equals(((original) (obj)).original);
        } else
        {
            return false;
        }
    }

    public int hashCode()
    {
        return ~original.hashCode();
    }

    public Converter reverse()
    {
        return original;
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(original));
        return (new StringBuilder(s.length() + 10)).append(s).append(".reverse()").toString();
    }

    (Converter converter)
    {
        original = converter;
    }
}
