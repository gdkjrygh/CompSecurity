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

public final class fq extends b
{

    public static final fq a[] = new fq[0];
    public String b;
    public sx c;
    public fk d;
    public sx e;
    public kz f;
    public String g;
    public fk h;
    public kz i;
    public fk j;
    public fk k;

    public fq()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        h = null;
        i = null;
        j = null;
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
        if (!g.equals(""))
        {
            l = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(7, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(9, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(10, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(11, k);
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
                e = new sx();
                a1.a(e);
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 74: // 'J'
                i = new kz();
                a1.a(i);
                break;

            case 82: // 'R'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = new fk();
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
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(11, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
