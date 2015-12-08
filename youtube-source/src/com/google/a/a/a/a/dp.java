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
//            ly, li, pd, mq, 
//            pr, pe, lj

public final class dp extends b
{

    public static final dp a[] = new dp[0];
    public ly b;
    public li c;
    public pd d;
    public mq e;
    public pr f;
    public pe g;
    public lj h;

    public dp()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x3120359, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x31a2ee9, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x31a2eed, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x31a2ef1, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x39af697, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3af2bec, g);
        }
        j = i;
        if (h != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3af2c08, h);
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

            case 412097226: 
                b = new ly();
                a1.a(b);
                break;

            case 416380746: 
                c = new li();
                a1.a(c);
                break;

            case 416380778: 
                d = new pd();
                a1.a(d);
                break;

            case 416380810: 
                e = new mq();
                a1.a(e);
                break;

            case 483898554: 
                f = new pr();
                a1.a(f);
                break;

            case 494493538: 
                g = new pe();
                a1.a(g);
                break;

            case 494493762: 
                h = new lj();
                a1.a(h);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3120359, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x31a2ee9, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x31a2eed, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x31a2ef1, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x39af697, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3af2bec, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x3af2c08, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
