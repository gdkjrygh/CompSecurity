// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.ads;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import java.io.IOException;

// Referenced classes of package com.google.android.ads:
//            v

final class w
    implements v
{

    private CodedOutputByteBufferNano a;
    private byte b[];
    private final int c = 239;

    public w(int i)
    {
        a();
    }

    public final void a()
    {
        b = new byte[c];
        byte abyte0[] = b;
        a = CodedOutputByteBufferNano.a(abyte0, 0, abyte0.length);
    }

    public final void a(int i, long l)
    {
        a.b(i, l);
    }

    public final void a(int i, String s)
    {
        a.a(i, s);
    }

    public final byte[] b()
    {
        int i = a.a();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return b;
        } else
        {
            byte abyte0[] = new byte[b.length - i];
            System.arraycopy(b, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
