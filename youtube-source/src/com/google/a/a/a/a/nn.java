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

public final class nn extends b
{

    public static final nn a[] = new nn[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m[];
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;

    public nn()
    {
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = "";
        k = "";
        l = "";
        m = f.j;
        n = "";
        o = "";
        p = "";
        q = "";
        r = "";
        s = "";
        t = "";
        u = "";
        v = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
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
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (!j.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        k1 = j1;
        if (!k.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = k1;
        if (!l.equals(""))
        {
            i1 = k1 + CodedOutputByteBufferNano.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1;
            if (m.length > 0)
            {
                String as[] = m;
                int i2 = as.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < i2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + l1 + m.length * 1;
            }
        }
        i1 = j1;
        if (!n.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, n);
        }
        j1 = i1;
        if (!o.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, o);
        }
        i1 = j1;
        if (!p.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, p);
        }
        j1 = i1;
        if (!q.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(16, q);
        }
        i1 = j1;
        if (!r.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, r);
        }
        j1 = i1;
        if (!s.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(18, s);
        }
        i1 = j1;
        if (!t.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, t);
        }
        j1 = i1;
        if (!u.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, u);
        }
        i1 = j1;
        if (!v.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, v);
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

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                i = a1.f();
                break;

            case 74: // 'J'
                j = a1.f();
                break;

            case 82: // 'R'
                k = a1.f();
                break;

            case 90: // 'Z'
                l = a1.f();
                break;

            case 98: // 'b'
                int k1 = com.google.protobuf.nano.f.a(a1, 98);
                int j1 = m.length;
                String as[] = new String[k1 + j1];
                System.arraycopy(m, 0, as, 0, j1);
                for (m = as; j1 < m.length - 1; j1++)
                {
                    m[j1] = a1.f();
                    a1.a();
                }

                m[j1] = a1.f();
                break;

            case 106: // 'j'
                n = a1.f();
                break;

            case 114: // 'r'
                o = a1.f();
                break;

            case 122: // 'z'
                p = a1.f();
                break;

            case 130: 
                q = a1.f();
                break;

            case 138: 
                r = a1.f();
                break;

            case 146: 
                s = a1.f();
                break;

            case 154: 
                t = a1.f();
                break;

            case 162: 
                u = a1.f();
                break;

            case 170: 
                v = a1.f();
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
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            String as[] = m;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(12, as[i1]);
            }

        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (!p.equals(""))
        {
            codedoutputbytebuffernano.a(15, p);
        }
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (!r.equals(""))
        {
            codedoutputbytebuffernano.a(17, r);
        }
        if (!s.equals(""))
        {
            codedoutputbytebuffernano.a(18, s);
        }
        if (!t.equals(""))
        {
            codedoutputbytebuffernano.a(19, t);
        }
        if (!u.equals(""))
        {
            codedoutputbytebuffernano.a(20, u);
        }
        if (!v.equals(""))
        {
            codedoutputbytebuffernano.a(21, v);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
