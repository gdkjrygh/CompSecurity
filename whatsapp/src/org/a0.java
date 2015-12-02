// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org;

import java.io.IOException;

public class a0 extends IOException
{

    public static int a = 0;
    private static final long serialVersionUID = 0xdbe0a50853f59664L;
    private final long b;

    public a0(String s, long l, IOException ioexception)
    {
        super(s);
        initCause(ioexception);
        b = l;
    }

    public IOException a()
    {
        return (IOException)getCause();
    }

    public long b()
    {
        return b;
    }
}
