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
//            kz, fk, sx, ja, 
//            rb, oh, iz, el, 
//            oj

public final class oi extends b
{

    public static final oi a[] = new oi[0];
    public String b;
    public kz c;
    public fk d;
    public sx e;
    public fk f;
    public fk g;
    public fk h;
    public fk i;
    public fk j;
    public ja k;
    public rb l;
    public boolean m;
    public oh n;
    public boolean o;
    public iz p;
    public int q;
    public kz r;
    public el s;
    public kz t;
    public oj u;

    public oi()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = false;
        n = null;
        o = false;
        p = null;
        q = 0;
        r = null;
        s = null;
        t = null;
        u = null;
    }

    public final int a()
    {
        int j1 = 0;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
        }
        i1 = j1;
        if (o)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, o);
        }
        j1 = i1;
        if (p != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, p);
        }
        i1 = j1;
        if (q != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(16, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, r);
        }
        i1 = j1;
        if (s != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, s);
        }
        j1 = i1;
        if (t != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(19, t);
        }
        i1 = j1;
        if (u != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, u);
        }
        i1 += com.google.protobuf.nano.f.a(dl);
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

            case 10: // '\n'
                b = a1.f();
                break;

            case 18: // '\022'
                c = new kz();
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

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new ja();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new rb();
                a1.a(l);
                break;

            case 96: // '`'
                m = a1.e();
                break;

            case 106: // 'j'
                n = new oh();
                a1.a(n);
                break;

            case 112: // 'p'
                o = a1.e();
                break;

            case 122: // 'z'
                p = new iz();
                a1.a(p);
                break;

            case 128: 
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2)
                {
                    q = j1;
                } else
                {
                    q = 0;
                }
                break;

            case 138: 
                r = new kz();
                a1.a(r);
                break;

            case 146: 
                s = new el();
                a1.a(s);
                break;

            case 154: 
                t = new kz();
                a1.a(t);
                break;

            case 170: 
                u = new oj();
                a1.a(u);
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
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (q != 0)
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(17, r);
        }
        if (s != null)
        {
            codedoutputbytebuffernano.a(18, s);
        }
        if (t != null)
        {
            codedoutputbytebuffernano.a(19, t);
        }
        if (u != null)
        {
            codedoutputbytebuffernano.a(21, u);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
