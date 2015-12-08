// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.OutputStream;

// Referenced classes of package com.google.common.hash:
//            Funnels, PrimitiveSink

private static class tNull extends OutputStream
{

    final PrimitiveSink sink;

    public String toString()
    {
        String s = String.valueOf(String.valueOf(sink));
        return (new StringBuilder(s.length() + 24)).append("Funnels.asOutputStream(").append(s).append(")").toString();
    }

    public void write(int i)
    {
        sink.putByte((byte)i);
    }

    public void write(byte abyte0[])
    {
        sink.putBytes(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        sink.putBytes(abyte0, i, j);
    }

    (PrimitiveSink primitivesink)
    {
        sink = (PrimitiveSink)Preconditions.checkNotNull(primitivesink);
    }
}
