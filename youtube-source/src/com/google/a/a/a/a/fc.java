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
//            sx, kz, fk

public final class fc extends b
{

    public static final fc a[] = new fc[0];
    public long b;
    public long c;
    public String d;
    public sx e;
    public String f;
    public kz g;
    public fk h;
    public fk i;
    public fk j;

    public fc()
    {
        b = 0L;
        c = 0L;
        d = "";
        e = null;
        f = "";
        g = null;
        h = null;
        i = null;
        j = null;
    }

    public final int a()
    {
        int l = 0;
        if (b != 0L)
        {
            l = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int k = l;
        if (c != 0L)
        {
            k = l + CodedOutputByteBufferNano.d(2, c);
        }
        l = k;
        if (!d.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = l;
        if (e != null)
        {
            k = l + CodedOutputByteBufferNano.b(4, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(5, f);
        }
        k = l;
        if (g != null)
        {
            k = l + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (h != null)
        {
            l = k + CodedOutputByteBufferNano.b(7, h);
        }
        k = l;
        if (i != null)
        {
            k = l + CodedOutputByteBufferNano.b(8, i);
        }
        l = k;
        if (j != null)
        {
            l = k + CodedOutputByteBufferNano.b(9, j);
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

            case 8: // '\b'
                b = a1.c();
                break;

            case 16: // '\020'
                c = a1.c();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = new sx();
                a1.a(e);
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 50: // '2'
                g = new kz();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0L)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if (c != 0L)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
