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
//            ii, mx

public final class nv extends b
{

    public static final nv a[] = new nv[0];
    public ii b;
    public String c;
    public boolean d;
    public mx e;
    public boolean f;
    public boolean g;
    public String h;
    public int i;
    public int j;
    public String k;

    public nv()
    {
        b = null;
        c = "";
        d = false;
        e = null;
        f = false;
        g = false;
        h = "";
        i = 0;
        j = 0;
        k = "";
    }

    public final int a()
    {
        int i1 = 0;
        if (b != null)
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int l = i1;
        if (!c.equals(""))
        {
            l = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = l;
        if (d)
        {
            i1 = l + CodedOutputByteBufferNano.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = l;
        if (f)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i1;
        if (g)
        {
            l = i1 + CodedOutputByteBufferNano.b(8, g);
        }
        i1 = l;
        if (!h.equals(""))
        {
            i1 = l + CodedOutputByteBufferNano.b(9, h);
        }
        l = i1;
        if (i != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(10, i);
        }
        i1 = l;
        if (j != 0)
        {
            i1 = l + CodedOutputByteBufferNano.f(11, j);
        }
        l = i1;
        if (!k.equals(""))
        {
            l = i1 + CodedOutputByteBufferNano.b(12, k);
        }
        l += com.google.protobuf.nano.f.a(dl);
        dm = l;
        return l;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new ii();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 34: // '"'
                e = new mx();
                a1.a(e);
                break;

            case 40: // '('
                f = a1.e();
                break;

            case 64: // '@'
                g = a1.e();
                break;

            case 74: // 'J'
                h = a1.f();
                break;

            case 80: // 'P'
                i = a1.d();
                break;

            case 88: // 'X'
                j = a1.h();
                break;

            case 98: // 'b'
                k = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(10, i);
        }
        if (j != 0)
        {
            codedoutputbytebuffernano.c(11, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(12, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
