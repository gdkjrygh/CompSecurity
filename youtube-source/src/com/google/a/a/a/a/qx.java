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

public final class qx extends b
{

    public static final qx a[] = new qx[0];
    public int b;
    public int c;

    public qx()
    {
        b = 0;
        c = 0;
    }

    public final int a()
    {
        int i = 0;
        if (b != 0)
        {
            i = CodedOutputByteBufferNano.f(1, b) + 0;
        }
        int j = i;
        if (c != 0)
        {
            j = i + CodedOutputByteBufferNano.f(2, c);
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
                b = a1.h();
                break;

            case 16: // '\020'
                c = a1.h();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.c(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.c(2, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
