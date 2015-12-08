// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            ByteStreams

static final class s extends OutputStream
{

    public String toString()
    {
        return "ByteStreams.nullOutputStream()";
    }

    public void write(int i)
    {
    }

    public void write(byte abyte0[])
    {
        Preconditions.checkNotNull(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
    {
        Preconditions.checkNotNull(abyte0);
    }

    s()
    {
    }
}
