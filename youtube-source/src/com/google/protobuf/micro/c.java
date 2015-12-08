// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.IOException;

// Referenced classes of package com.google.protobuf.micro:
//            InvalidProtocolBufferMicroException, b, CodedOutputStreamMicro

public abstract class c
{

    public c()
    {
    }

    private c a(byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = com.google.protobuf.micro.b.a(abyte0, 0, j);
            a(((b) (abyte0)));
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return this;
    }

    public abstract c a(b b1);

    public abstract void a(CodedOutputStreamMicro codedoutputstreammicro);

    public final c b(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public abstract int e();

    public abstract int f();

    public final byte[] s()
    {
        byte abyte0[] = new byte[f()];
        int i = abyte0.length;
        try
        {
            CodedOutputStreamMicro codedoutputstreammicro = CodedOutputStreamMicro.a(abyte0, 0, i);
            a(codedoutputstreammicro);
            codedoutputstreammicro.a();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
        return abyte0;
    }
}
