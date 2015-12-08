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

public final class aj extends b
{

    public static final aj a[] = new aj[0];
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;

    public aj()
    {
        b = false;
        c = 0.0F;
        d = 0.0F;
        e = 0.0F;
        f = 0.0F;
    }

    public final int a()
    {
        int j = 0;
        if (b)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (c != 0.0F)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != 0.0F)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != 0.0F)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (f != 0.0F)
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
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
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                b = a1.e();
                break;

            case 21: // '\025'
                c = Float.intBitsToFloat(a1.i());
                break;

            case 29: // '\035'
                d = Float.intBitsToFloat(a1.i());
                break;

            case 37: // '%'
                e = Float.intBitsToFloat(a1.i());
                break;

            case 45: // '-'
                f = Float.intBitsToFloat(a1.i());
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0.0F)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0.0F)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0.0F)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0.0F)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
