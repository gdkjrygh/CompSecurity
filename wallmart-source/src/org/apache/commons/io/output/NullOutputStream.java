// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.IOException;
import java.io.OutputStream;

public class NullOutputStream extends OutputStream
{

    public static final NullOutputStream NULL_OUTPUT_STREAM = new NullOutputStream();

    public NullOutputStream()
    {
    }

    public void write(int i)
    {
    }

    public void write(byte abyte0[])
        throws IOException
    {
    }

    public void write(byte abyte0[], int i, int j)
    {
    }

}
