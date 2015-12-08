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
//            sx

public final class ca extends b
{

    public static final ca a[] = new ca[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    public String k;
    public String l[];
    public boolean m;
    public sx n;
    public String o;
    public boolean p;
    public String q;
    public String r[];
    public String s;

    public ca()
    {
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
        h = "";
        i = "";
        j = false;
        k = "";
        l = f.j;
        m = false;
        n = null;
        o = "";
        p = false;
        q = "";
        r = f.j;
        s = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
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
            j1 = i1 + CodedOutputByteBufferNano.b(6, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(8, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, i);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, j);
        }
        i1 = j1;
        if (!k.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1;
            if (l.length > 0)
            {
                String as[] = l;
                int i2 = as.length;
                j1 = 0;
                int k1 = 0;
                for (; j1 < i2; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + k1 + l.length * 1;
            }
        }
        i1 = j1;
        if (m)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, n);
        }
        i1 = j1;
        if (!o.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(16, p);
        }
        i1 = j1;
        if (!q.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, q);
        }
        j1 = i1;
        if (r != null)
        {
            j1 = i1;
            if (r.length > 0)
            {
                String as1[] = r;
                int j2 = as1.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < j2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as1[j1]);
                }

                j1 = i1 + l1 + r.length * 2;
            }
        }
        i1 = j1;
        if (!s.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, s);
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

            case 50: // '2'
                f = a1.f();
                break;

            case 58: // ':'
                g = a1.f();
                break;

            case 66: // 'B'
                h = a1.f();
                break;

            case 74: // 'J'
                i = a1.f();
                break;

            case 80: // 'P'
                j = a1.e();
                break;

            case 90: // 'Z'
                k = a1.f();
                break;

            case 98: // 'b'
                int l1 = com.google.protobuf.nano.f.a(a1, 98);
                int j1 = l.length;
                String as[] = new String[l1 + j1];
                System.arraycopy(l, 0, as, 0, j1);
                for (l = as; j1 < l.length - 1; j1++)
                {
                    l[j1] = a1.f();
                    a1.a();
                }

                l[j1] = a1.f();
                break;

            case 104: // 'h'
                m = a1.e();
                break;

            case 114: // 'r'
                n = new sx();
                a1.a(n);
                break;

            case 122: // 'z'
                o = a1.f();
                break;

            case 128: 
                p = a1.e();
                break;

            case 138: 
                q = a1.f();
                break;

            case 146: 
                int i2 = com.google.protobuf.nano.f.a(a1, 146);
                int k1 = r.length;
                String as1[] = new String[i2 + k1];
                System.arraycopy(r, 0, as1, 0, k1);
                for (r = as1; k1 < r.length - 1; k1++)
                {
                    r[k1] = a1.f();
                    a1.a();
                }

                r[k1] = a1.f();
                break;

            case 154: 
                s = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
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
            codedoutputbytebuffernano.a(6, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(8, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(11, k);
        }
        if (l != null)
        {
            String as[] = l;
            int k1 = as.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(12, as[i1]);
            }

        }
        if (m)
        {
            codedoutputbytebuffernano.a(13, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(14, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(15, o);
        }
        if (p)
        {
            codedoutputbytebuffernano.a(16, p);
        }
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(17, q);
        }
        if (r != null)
        {
            String as1[] = r;
            int l1 = as1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(18, as1[j1]);
            }

        }
        if (!s.equals(""))
        {
            codedoutputbytebuffernano.a(19, s);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
