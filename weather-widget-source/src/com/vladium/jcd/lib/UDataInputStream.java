// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class UDataInputStream extends DataInputStream
{

    public UDataInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    public final int readU2()
        throws IOException
    {
        return 0xffff & readShort();
    }

    public final long readU4()
        throws IOException
    {
        return (long)readInt() & 0xffffffffL;
    }
}
