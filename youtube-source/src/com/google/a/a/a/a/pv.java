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

// Referenced classes of package com.google.a.a.a.a:
//            eo

public final class pv extends b
{

    public static final pv a[] = new pv[0];
    public boolean b;
    public boolean c;
    public eo d;
    public boolean e;
    public boolean f;

    public pv()
    {
        b = false;
        c = false;
        d = null;
        e = false;
        f = false;
    }

    public final int a()
    {
        int j = 0;
        if (b)
        {
            j = CodedOutputByteBufferNano.b(2, b) + 0;
        }
        int i = j;
        if (c)
        {
            i = j + CodedOutputByteBufferNano.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(5, d);
        }
        i = j;
        if (e)
        {
            i = j + CodedOutputByteBufferNano.b(7, e);
        }
        j = i;
        if (f)
        {
            j = i + CodedOutputByteBufferNano.b(9, f);
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

            case 16: // '\020'
                b = a1.e();
                break;

            case 24: // '\030'
                c = a1.e();
                break;

            case 42: // '*'
                d = new eo();
                a1.a(d);
                break;

            case 56: // '8'
                e = a1.e();
                break;

            case 72: // 'H'
                f = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (e)
        {
            codedoutputbytebuffernano.a(7, e);
        }
        if (f)
        {
            codedoutputbytebuffernano.a(9, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
