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
//            uy, ce, dj, op, 
//            de, db, ka, dd

public final class ew extends b
{

    public static final ew a[] = new ew[0];
    public uy b;
    public ce c;
    public dj d;
    public op e;
    public de f;
    public db g;
    public ka h;
    public dd i;

    public ew()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
    }

    public final int a()
    {
        int k = 0;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(0x303c1d6, b) + 0;
        }
        int j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x303f243, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3049143, d);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3061cf4, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3064567, f);
        }
        j = k;
        if (g != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3070f41, g);
        }
        k = j;
        if (h != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x37c69c4, h);
        }
        j = k;
        if (i != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x37c6a1c, i);
        }
        j += com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
    }

    public final c a(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 404623026: 
                b = new uy();
                a1.a(b);
                break;

            case 404722202: 
                c = new ce();
                a1.a(c);
                break;

            case 405047834: 
                d = new dj();
                a1.a(d);
                break;

            case 405858210: 
                e = new op();
                a1.a(e);
                break;

            case 405941050: 
                f = new de();
                a1.a(f);
                break;

            case 406354442: 
                g = new db();
                a1.a(g);
                break;

            case 467881506: 
                h = new ka();
                a1.a(h);
                break;

            case 467882210: 
                i = new dd();
                a1.a(i);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x303c1d6, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x303f243, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3049143, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3061cf4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3064567, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3070f41, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x37c69c4, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x37c6a1c, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
