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

public final class eo extends b
{

    public static final eo a[] = new eo[0];
    public long b;
    public int c;
    public int d;

    public eo()
    {
        b = 0L;
        c = 0;
        d = 0;
    }

    public final int a()
    {
        int j = 0;
        if (b != 0L)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (c != 0)
        {
            i = j + CodedOutputByteBufferNano.e(2, c);
        }
        j = i;
        if (d != 0)
        {
            j = i + CodedOutputByteBufferNano.e(3, d);
        }
        i = j + f.a(dl);
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

            case 8: // '\b'
                b = a1.c();
                break;

            case 21: // '\025'
                c = a1.i();
                break;

            case 29: // '\035'
                d = a1.i();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0L)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
