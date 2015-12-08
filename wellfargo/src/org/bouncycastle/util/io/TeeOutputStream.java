// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.io;

import java.io.OutputStream;

public class TeeOutputStream extends OutputStream
{

    private OutputStream output1;
    private OutputStream output2;

    public TeeOutputStream(OutputStream outputstream, OutputStream outputstream1)
    {
        output1 = outputstream;
        output2 = outputstream1;
    }

    public void close()
    {
        output1.close();
        output2.close();
    }

    public void flush()
    {
        output1.flush();
        output2.flush();
    }

    public void write(int i)
    {
        output1.write(i);
        output2.write(i);
    }

    public void write(byte abyte0[])
    {
        output1.write(abyte0);
        output2.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        output1.write(abyte0, i, j);
        output2.write(abyte0, i, j);
    }
}
