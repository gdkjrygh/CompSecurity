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
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            nc, py, mw, sb, 
//            gr, nb, bh, uh, 
//            v, md, nh, sa, 
//            sv, kf, jm, ig

public final class nw extends b
{

    public static final nw a[] = new nw[0];
    public py b;
    public mw c;
    public sb d;
    public String e;
    public gr f;
    public nc g[];
    public nb h;
    public bh i;
    public uh j;
    public v k;
    public md l;
    public nh m;
    public sa n;
    public sv o;
    public kf p;
    public jm q;
    public ig r;
    public byte s[];

    public nw()
    {
        b = null;
        c = null;
        d = null;
        e = "";
        f = null;
        g = com.google.a.a.a.a.nc.a;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        p = null;
        q = null;
        r = null;
        s = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(4, d);
        }
        k1 = j1;
        if (!e.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(5, e);
        }
        i1 = k1;
        if (f != null)
        {
            i1 = k1 + CodedOutputByteBufferNano.b(6, f);
        }
        j1 = i1;
        if (g != null)
        {
            nc anc[] = g;
            int i2 = anc.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= i2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(7, anc[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(16, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, p);
        }
        j1 = i1;
        if (q != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(19, q);
        }
        i1 = j1;
        if (r != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(20, r);
        }
        j1 = i1;
        if (!Arrays.equals(s, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(21, s);
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
                b = new py();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new mw();
                a1.a(c);
                break;

            case 34: // '"'
                d = new sb();
                a1.a(d);
                break;

            case 42: // '*'
                e = a1.f();
                break;

            case 50: // '2'
                f = new gr();
                a1.a(f);
                break;

            case 58: // ':'
                int k1 = com.google.protobuf.nano.f.a(a1, 58);
                nc anc[];
                int j1;
                if (g == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = g.length;
                }
                anc = new nc[k1 + j1];
                if (g != null)
                {
                    System.arraycopy(g, 0, anc, 0, j1);
                }
                for (g = anc; j1 < g.length - 1; j1++)
                {
                    g[j1] = new nc();
                    a1.a(g[j1]);
                    a1.a();
                }

                g[j1] = new nc();
                a1.a(g[j1]);
                break;

            case 74: // 'J'
                h = new nb();
                a1.a(h);
                break;

            case 82: // 'R'
                i = new bh();
                a1.a(i);
                break;

            case 90: // 'Z'
                j = new uh();
                a1.a(j);
                break;

            case 106: // 'j'
                k = new v();
                a1.a(k);
                break;

            case 114: // 'r'
                l = new md();
                a1.a(l);
                break;

            case 122: // 'z'
                m = new nh();
                a1.a(m);
                break;

            case 130: 
                n = new sa();
                a1.a(n);
                break;

            case 138: 
                o = new sv();
                a1.a(o);
                break;

            case 146: 
                p = new kf();
                a1.a(p);
                break;

            case 154: 
                q = new jm();
                a1.a(q);
                break;

            case 162: 
                r = new ig();
                a1.a(r);
                break;

            case 170: 
                s = a1.g();
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
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null)
        {
            nc anc[] = g;
            int j1 = anc.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(7, anc[i1]);
            }

        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(10, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(11, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(13, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(14, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(15, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(16, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(17, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(18, p);
        }
        if (q != null)
        {
            codedoutputbytebuffernano.a(19, q);
        }
        if (r != null)
        {
            codedoutputbytebuffernano.a(20, r);
        }
        if (!Arrays.equals(s, f.l))
        {
            codedoutputbytebuffernano.a(21, s);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
