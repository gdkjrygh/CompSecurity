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

public final class pf extends b
{

    public static final pf a[] = new pf[0];
    public int b;
    public String c;
    public double d;

    public pf()
    {
        b = 0;
        c = "";
        d = 0.0D;
    }

    public final int a()
    {
        int j = 0;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != 0.0D)
        {
            double d1 = d;
            j = i + (CodedOutputByteBufferNano.c(3) + 8);
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
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 25: // '\031'
                d = Double.longBitsToDouble(a1.j());
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0.0D)
        {
            double d1 = d;
            codedoutputbytebuffernano.g(3, 1);
            long l = Double.doubleToLongBits(d1);
            codedoutputbytebuffernano.b((int)l & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 8) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 16) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 24) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 32) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 40) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 48) & 0xff);
            codedoutputbytebuffernano.b((int)(l >> 56) & 0xff);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
