// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;

// Referenced classes of package com.google.common.primitives:
//            Shorts

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
        return doBackward((Short)obj);
    }

    protected String doBackward(Short short1)
    {
        return short1.toString();
    }

    protected volatile Object doForward(Object obj)
    {
        return doForward((String)obj);
    }

    protected Short doForward(String s)
    {
        return Short.decode(s);
    }

    public String toString()
    {
        return "Shorts.stringConverter()";
    }


    private ()
    {
    }
}
