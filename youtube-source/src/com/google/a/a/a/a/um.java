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
//            kz, fk

public final class um extends b
{

    public static final um a[] = new um[0];
    public int b;
    public String c;
    public String d;
    public kz e;
    public int f;
    public int g;
    public fk h;
    public int i;
    public int j;

    public um()
    {
        b = 0;
        c = "";
        d = "";
        e = null;
        f = 0;
        g = 0;
        h = null;
        i = 0;
        j = 0;
    }

    public final int a()
    {
        int l = 0;
        if (b != 0)
        {
            l = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int k = l;
        if (!c.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(2, c);
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
        if (f != 0)
        {
            l = k + CodedOutputByteBufferNano.d(5, f);
        }
        k = l;
        if (g != 0)
        {
            k = l + CodedOutputByteBufferNano.d(6, g);
        }
        l = k;
        if (h != null)
        {
            l = k + CodedOutputByteBufferNano.b(7, h);
        }
        k = l;
        if (i != 0)
        {
            k = l + CodedOutputByteBufferNano.d(8, i);
        }
        l = k;
        if (j != 0)
        {
            l = k + CodedOutputByteBufferNano.d(9, j);
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
                int l = a1.d();
                if (l == 0 || l == 1 || l == 2)
                {
                    b = l;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = new kz();
                a1.a(e);
                break;

            case 40: // '('
                f = a1.d();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 64: // '@'
                i = a1.d();
                break;

            case 72: // 'H'
                j = a1.d();
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
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
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
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != 0)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
