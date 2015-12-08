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
//            sx, fk, kz

public final class en extends b
{

    public static final en a[] = new en[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public fk h;
    public int i;
    public boolean j;
    public kz k;

    public en()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        j = false;
        k = null;
    }

    public final int a()
    {
        int i1 = 0;
        if (!b.equals(""))
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int l = i1;
        if (c != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(7, h);
        }
        l = i1;
        if (i != 0)
        {
            l = i1 + CodedOutputByteBufferNano.d(8, i);
        }
        i1 = l;
        if (j)
        {
            i1 = l + CodedOutputByteBufferNano.b(9, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(10, k);
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
                b = a1.f();
                break;

            case 18: // '\022'
                c = new sx();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 64: // '@'
                i = a1.d();
                break;

            case 72: // 'H'
                j = a1.e();
                break;

            case 82: // 'R'
                k = new kz();
                a1.a(k);
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
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
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
        if (i != 0)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
