// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;

// Referenced classes of package com.google.common.base:
//            Converter, Preconditions

private static final class  extends Converter
    implements Serializable
{

    static final reverse INSTANCE = new <init>();
    private static final long serialVersionUID = 0L;

    private Object readResolve()
    {
        return INSTANCE;
    }

    Converter doAndThen(Converter converter)
    {
        return (Converter)Preconditions.checkNotNull(converter, "otherConverter");
    }

    protected Object doBackward(Object obj)
    {
        return obj;
    }

    protected Object doForward(Object obj)
    {
        return obj;
    }

    public INSTANCE reverse()
    {
        return this;
    }

    public volatile Converter reverse()
    {
        return reverse();
    }

    public String toString()
    {
        return "Converter.identity()";
    }


    private ()
    {
    }
}
