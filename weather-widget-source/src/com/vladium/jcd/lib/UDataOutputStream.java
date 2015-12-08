// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.lib;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class UDataOutputStream extends DataOutputStream
{

    public UDataOutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public final void writeU2(int i)
        throws IOException
    {
        writeShort((short)i);
    }

    public final void writeU4(long l)
        throws IOException
    {
        writeInt((int)l);
    }
}
