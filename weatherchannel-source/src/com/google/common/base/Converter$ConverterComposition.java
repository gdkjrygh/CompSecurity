// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Converter

private static final class second extends Converter
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Converter first;
    final Converter second;

    Object correctedDoBackward(Object obj)
    {
        return first.correctedDoBackward(second.correctedDoBackward(obj));
    }

    Object correctedDoForward(Object obj)
    {
        return second.correctedDoForward(first.correctedDoForward(obj));
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
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof first)
        {
            obj = (first)obj;
            flag = flag1;
            if (first.equals(((first) (obj)).first))
            {
                flag = flag1;
                if (second.equals(((second) (obj)).second))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return first.hashCode() * 31 + second.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(String.valueOf(first));
        String s1 = String.valueOf(String.valueOf(second));
        return (new StringBuilder(s.length() + 10 + s1.length())).append(s).append(".andThen(").append(s1).append(")").toString();
    }

    (Converter converter, Converter converter1)
    {
        first = converter;
        second = converter1;
    }
}
