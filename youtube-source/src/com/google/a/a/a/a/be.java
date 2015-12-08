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
//            kz, sx

public final class be extends b
{

    public static final be a[] = new be[0];
    public long b;
    public long c;
    public long d;
    public String e;
    public String f;
    public String g;
    public String h;
    public kz i;
    public sx j;

    public be()
    {
        b = 0L;
        c = 0L;
        d = 0L;
        e = "";
        f = "";
        g = "";
        h = "";
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
        if (d != 0L)
        {
            l = k + CodedOutputByteBufferNano.d(3, d);
        }
        k = l;
        if (!e.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(4, e);
        }
        l = k;
        if (!f.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(5, f);
        }
        k = l;
        if (!g.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (!h.equals(""))
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

            case 24: // '\030'
                d = a1.c();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = new kz();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new sx();
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
        if (d != 0L)
        {
            codedoutputbytebuffernano.b(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
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
