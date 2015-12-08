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

public final class pp extends b
{

    public static final pp a[] = new pp[0];
    public int b;
    public int c;
    public long d;
    public long e;

    public pp()
    {
        b = 0;
        c = 0;
        d = 0L;
        e = 0L;
    }

    public final int a()
    {
        int j = 0;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (c != 0)
        {
            i = j + CodedOutputByteBufferNano.d(2, c);
        }
        j = i;
        if (d != 0L)
        {
            j = i + CodedOutputByteBufferNano.d(3, d);
        }
        i = j;
        if (e != 0L)
        {
            i = j + CodedOutputByteBufferNano.d(4, e);
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

            case 8: // '\b'
                b = a1.d();
                break;

            case 16: // '\020'
                c = a1.d();
                break;

            case 24: // '\030'
                d = a1.c();
                break;

            case 32: // ' '
                e = a1.c();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0L)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
