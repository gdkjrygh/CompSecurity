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
//            fk, sx, kz

public final class em extends b
{

    public static final em a[] = new em[0];
    public String b;
    public fk c;
    public sx d;
    public long e;
    public fk f;
    public fk g;
    public fk h;
    public fk i;
    public kz j;

    public em()
    {
        b = "";
        c = null;
        d = null;
        e = 0L;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
    }

    public final int a()
    {
        int l = 0;
        if (!b.equals(""))
        {
            l = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int k = l;
        if (c != null)
        {
            k = l + CodedOutputByteBufferNano.b(2, c);
        }
        l = k;
        if (d != null)
        {
            l = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = l;
        if (e != 0L)
        {
            k = l + CodedOutputByteBufferNano.d(4, e);
        }
        l = k;
        if (f != null)
        {
            l = k + CodedOutputByteBufferNano.b(6, f);
        }
        k = l;
        if (g != null)
        {
            k = l + CodedOutputByteBufferNano.b(7, g);
        }
        l = k;
        if (h != null)
        {
            l = k + CodedOutputByteBufferNano.b(10, h);
        }
        k = l;
        if (i != null)
        {
            k = l + CodedOutputByteBufferNano.b(11, i);
        }
        l = k;
        if (j != null)
        {
            l = k + CodedOutputByteBufferNano.b(13, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = a1.f();
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 32: // ' '
                e = a1.c();
                break;

            case 50: // '2'
                f = new fk();
                a1.a(f);
                break;

            case 58: // ':'
                g = new fk();
                a1.a(g);
                break;

            case 82: // 'R'
                h = new fk();
                a1.a(h);
                break;

            case 90: // 'Z'
                i = new fk();
                a1.a(i);
                break;

            case 106: // 'j'
                j = new kz();
                a1.a(j);
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
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(10, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(11, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(13, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
