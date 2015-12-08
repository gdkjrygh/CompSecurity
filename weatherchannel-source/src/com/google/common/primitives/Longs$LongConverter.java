// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

// Referenced classes of package com.google.common.primitives:
//            Longs

private static final class  extends Converter
    implements Serializable
{

    static final doForward INSTANCE = new <init>();
    private static final long serialVersionUID = 1L;

    private Object readResolve()
    {
        return INSTANCE;
    }

    protected volatile Object doBackward(Object obj)
    {
        return doBackward((Long)obj);
    }

    protected String doBackward(Long long1)
    {
        return long1.toString();
    }

    protected Long doForward(String s)
    {
        return Long.decode(s);
    }

    protected volatile Object doForward(Object obj)
    {
        return doForward((String)obj);
    }

    public String toString()
    {
        return "Longs.stringConverter()";
    }


    private ()
    {
    }
}
