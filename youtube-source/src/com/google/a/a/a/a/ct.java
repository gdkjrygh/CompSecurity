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

public final class ct extends b
{

    public static final ct a[] = new ct[0];
    public String b;
    public String c;
    public String d;
    public int e[];
    public String f;
    public boolean g;
    public String h;
    public String i;
    public int j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;

    public ct()
    {
        b = "";
        c = "";
        d = "";
        e = f.e;
        f = "";
        g = false;
        h = "";
        i = "";
        j = 1;
        k = "";
        l = "";
        m = "";
        n = "";
        o = "";
        p = "";
        q = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (!b.equals(""))
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (!c.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = j1;
        if (!d.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1;
            if (e.length > 0)
            {
                int ai[] = e;
                int l1 = ai.length;
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(ai[j1]);
                }

                j1 = i1 + k1 + e.length * 1;
            }
        }
        i1 = j1;
        if (!f.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, f);
        }
        j1 = i1;
        if (g)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, g);
        }
        i1 = j1;
        if (!h.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, h);
        }
        j1 = i1;
        if (!i.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, i);
        }
        i1 = j1;
        if (j != 1)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(16, j);
        }
        j1 = i1;
        if (!k.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, k);
        }
        i1 = j1;
        if (!l.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, l);
        }
        j1 = i1;
        if (!m.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(19, m);
        }
        i1 = j1;
        if (!n.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, n);
        }
        j1 = i1;
        if (!o.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(22, o);
        }
        i1 = j1;
        if (!p.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(25, p);
        }
        j1 = i1;
        if (!q.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(27, q);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
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

            case 66: // 'B'
                d = a1.f();
                break;

            case 72: // 'H'
                int l1 = com.google.protobuf.nano.f.a(a1, 72);
                int j1 = e.length;
                int ai[] = new int[l1 + j1];
                System.arraycopy(e, 0, ai, 0, j1);
                for (e = ai; j1 < e.length - 1; j1++)
                {
                    e[j1] = a1.d();
                    a1.a();
                }

                e[j1] = a1.d();
                break;

            case 82: // 'R'
                f = a1.f();
                break;

            case 88: // 'X'
                g = a1.e();
                break;

            case 98: // 'b'
                h = a1.f();
                break;

            case 106: // 'j'
                i = a1.f();
                break;

            case 128: 
                int k1 = a1.d();
                if (k1 == 1 || k1 == 2 || k1 == 3 || k1 == 5 || k1 == 7 || k1 == 8 || k1 == 11 || k1 == 12 || k1 == 13 || k1 == 14 || k1 == 15 || k1 == 16)
                {
                    j = k1;
                } else
                {
                    j = 1;
                }
                break;

            case 138: 
                k = a1.f();
                break;

            case 146: 
                l = a1.f();
                break;

            case 154: 
                m = a1.f();
                break;

            case 170: 
                n = a1.f();
                break;

            case 178: 
                o = a1.f();
                break;

            case 202: 
                p = a1.f();
                break;

            case 218: 
                q = a1.f();
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
            codedoutputbytebuffernano.a(8, d);
        }
        if (e != null)
        {
            int ai[] = e;
            int j1 = ai.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(9, ai[i1]);
            }

        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(10, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(11, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(12, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(13, i);
        }
        if (j != 1)
        {
            codedoutputbytebuffernano.a(16, j);
        }
        if (!k.equals(""))
        {
            codedoutputbytebuffernano.a(17, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(18, l);
        }
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(19, m);
        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(21, n);
        }
        if (!o.equals(""))
        {
            codedoutputbytebuffernano.a(22, o);
        }
        if (!p.equals(""))
        {
            codedoutputbytebuffernano.a(25, p);
        }
        if (!q.equals(""))
        {
            codedoutputbytebuffernano.a(27, q);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
