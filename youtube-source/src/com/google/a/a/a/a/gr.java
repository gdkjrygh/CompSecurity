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

public final class gr extends b
{

    public static final gr a[] = new gr[0];
    public String b;
    public long c;
    public long d;

    public gr()
    {
        b = "";
        c = 0L;
        d = 0L;
    }

    public final int a()
    {
        int j = 0;
        if (!b.equals(""))
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (c != 0L)
        {
            i = j + CodedOutputByteBufferNano.d(2, c);
        }
        j = i;
        if (d != 0L)
        {
            j = i + CodedOutputByteBufferNano.d(3, d);
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

            case 10: // '\n'
                b = a1.f();
                break;

            case 16: // '\020'
                c = a1.c();
                break;

            case 24: // '\030'
                d = a1.c();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0L)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if (d != 0L)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
