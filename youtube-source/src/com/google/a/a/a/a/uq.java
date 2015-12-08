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

public final class uq extends b
{

    public static final uq a[] = new uq[0];
    public int b;
    public sx c;
    public kz d;
    public fk e;
    public int f;
    public int g;
    public String h;
    public String i;

    public uq()
    {
        b = 0;
        c = null;
        d = null;
        e = null;
        f = 0;
        g = 0;
        h = "";
        i = "";
    }

    public final int a()
    {
        int k = 0;
        if (b != 0)
        {
            k = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(2, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(4, e);
        }
        k = j;
        if (f != 0)
        {
            k = j + CodedOutputByteBufferNano.d(7, f);
        }
        j = k;
        if (g != 0)
        {
            j = k + CodedOutputByteBufferNano.d(8, g);
        }
        k = j;
        if (!h.equals(""))
        {
            k = j + CodedOutputByteBufferNano.b(9, h);
        }
        j = k;
        if (!i.equals(""))
        {
            j = k + CodedOutputByteBufferNano.b(10, i);
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

            case 8: // '\b'
                int k = a1.d();
                if (k == 0 || k == 1)
                {
                    b = k;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = new sx();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new kz();
                a1.a(d);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 56: // '8'
                f = a1.d();
                break;

            case 64: // '@'
                g = a1.d();
                break;

            case 74: // 'J'
                h = a1.f();
                break;

            case 82: // 'R'
                i = a1.f();
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
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(10, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
