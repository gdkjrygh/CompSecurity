// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.NoSuchElementException;

// Referenced classes of package com.google:
//            w, aI, fe

class dY
    implements w
{

    private int a;
    private final int b;
    final aI c;

    private dY(aI ai)
    {
        c = ai;
        super();
        a = 0;
        b = ai.c();
    }

    dY(aI ai, fe fe)
    {
        this(ai);
    }

    public byte a()
    {
        byte byte0;
        byte abyte0[];
        int i;
        try
        {
            abyte0 = c.c;
            i = a;
            a = i + 1;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
        }
        byte0 = abyte0[i];
        return byte0;
    }

    public Byte a()
    {
        return Byte.valueOf(a());
    }

    public boolean hasNext()
    {
        int i;
        int j;
        try
        {
            i = a;
            j = b;
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw arrayindexoutofboundsexception;
        }
        return i < j;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
