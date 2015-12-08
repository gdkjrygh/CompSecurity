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

public final class ep extends b
{

    public static final ep a[] = new ep[0];
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;

    public ep()
    {
        b = false;
        c = false;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        h = 0;
        i = 0;
        j = 0.0F;
        k = 0.0F;
        l = 0.0F;
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
    }

    public final int a()
    {
        int j1 = 0;
        if (b)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(3, d);
        }
        i1 = j1;
        if (e != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(4, e);
        }
        j1 = i1;
        if (f != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(5, f);
        }
        i1 = j1;
        if (g != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, g);
        }
        j1 = i1;
        if (h != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(7, h);
        }
        i1 = j1;
        if (i != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(8, i);
        }
        j1 = i1;
        if (j != 0.0F)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != 0.0F)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != 0.0F)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(12, m);
        }
        j1 = i1;
        if (n != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(13, n);
        }
        i1 = j1;
        if (o != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(14, o);
        }
        j1 = i1;
        if (p != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(15, p);
        }
        i1 = j1;
        if (q != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(16, q);
        }
        j1 = i1;
        if (r != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(17, r);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                b = a1.e();
                break;

            case 16: // '\020'
                c = a1.e();
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 32: // ' '
                e = a1.d();
                break;

            case 40: // '('
                f = a1.d();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 56: // '8'
                h = a1.d();
                break;

            case 64: // '@'
                i = a1.d();
                break;

            case 77: // 'M'
                j = Float.intBitsToFloat(a1.i());
                break;

            case 85: // 'U'
                k = Float.intBitsToFloat(a1.i());
                break;

            case 93: // ']'
                l = Float.intBitsToFloat(a1.i());
                break;

            case 96: // '`'
                m = a1.d();
                break;

            case 104: // 'h'
                n = a1.d();
                break;

            case 112: // 'p'
                o = a1.d();
                break;

            case 120: // 'x'
                p = a1.d();
                break;

            case 128: 
                q = a1.d();
                break;

            case 136: 
                r = a1.d();
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
        if (c)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != 0)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != 0.0F)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != 0.0F)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != 0.0F)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != 0)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != 0)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != 0)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p != 0)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != 0)
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (r != 0)
        {
            codedoutputbytebuffernano.a(17, r);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
