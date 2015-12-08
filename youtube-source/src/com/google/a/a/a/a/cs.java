// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import java.util.ArrayList;
import java.util.Arrays;

public final class cs extends b
{

    public static final cs a[] = new cs[0];
    public byte b[];

    public cs()
    {
        b = f.l;
    }

    public final int a()
    {
        int i = 0;
        if (!Arrays.equals(b, f.l))
        {
            i = CodedOutputByteBufferNano.b(2, b) + 0;
        }
        i += f.a(dl);
        dm = i;
        return i;
    }

    public final c a(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 18: // '\022'
                b = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!Arrays.equals(b, f.l))
        {
            codedoutputbytebuffernano.a(2, b);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
