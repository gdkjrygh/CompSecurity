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
//            pp

public final class fj extends b
{

    public static final fj a[] = new fj[0];
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public int i;
    public pp j;
    public pp k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public String q;
    public boolean r;
    public boolean s;
    public int t;
    public String u;

    public fj()
    {
        b = 0;
        c = "";
        d = "";
        e = "";
        f = "";
        g = 0;
        h = 0;
        i = 0;
        j = null;
        k = null;
        l = 0L;
        m = 0L;
        n = 0;
        o = 0;
        p = 0;
        q = "";
        r = false;
        s = false;
        t = 0;
        u = "";
    }

    public final int a()
    {
        int j1 = 0;
        if (b != 0)
        {
            j1 = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (!f.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
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
        if (l != 0L)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(11, l);
        }
        i1 = j1;
        if (m != 0L)
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
        if (!q.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, q);
        }
        j1 = i1;
        if (r)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, r);
        }
        i1 = j1;
        if (s)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, s);
        }
        j1 = i1;
        if (t != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(19, t);
        }
        i1 = j1;
        if (!u.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(20, u);
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

            case 8: // '\b'
                b = a1.d();
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
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

            case 74: // 'J'
                j = new pp();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new pp();
                a1.a(k);
                break;

            case 88: // 'X'
                l = a1.c();
                break;

            case 96: // '`'
                m = a1.c();
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

            case 130: 
                q = a1.f();
                break;

            case 136: 
                r = a1.e();
                break;

            case 144: 
                s = a1.e();
                break;

            case 152: 
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2)
                {
                    t = j1;
                } else
                {
                    t = 0;
                }
                break;

            case 162: 
                u = a1.f();
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
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
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
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != 0L)
        {
            codedoutputbytebuffernano.b(11, l);
        }
        if (m != 0L)
        {
            codedoutputbytebuffernano.b(12, m);
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
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (r)
        {
            codedoutputbytebuffernano.a(17, r);
        }
        if (s)
        {
            codedoutputbytebuffernano.a(18, s);
        }
        if (t != 0)
        {
            codedoutputbytebuffernano.a(19, t);
        }
        if (!u.equals(""))
        {
            codedoutputbytebuffernano.a(20, u);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
