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
//            pu, wc, py, wk, 
//            dq, kz, ej, pi, 
//            nu, dm

public final class wg extends b
{

    public static final wg a[] = new wg[0];
    public py b;
    public pu c;
    public pu d;
    public pu e[];
    public pu f;
    public String g;
    public wk h;
    public dq i;
    public kz j;
    public ej k;
    public pi l;
    public wc m[];
    public byte n[];
    public nu o;
    public dm p;

    public wg()
    {
        b = null;
        c = null;
        d = null;
        e = com.google.a.a.a.a.pu.a;
        f = null;
        g = "";
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = com.google.a.a.a.a.wc.a;
        n = f.l;
        o = null;
        p = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (b != null)
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(3, d);
        }
        j1 = i1;
        if (e != null)
        {
            pu apu[] = e;
            int i2 = apu.length;
            int k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(4, apu[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, f);
        }
        j1 = i1;
        if (!g.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            wc awc[] = m;
            int j2 = awc.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(12, awc[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (!Arrays.equals(n, f.l))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, o);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, p);
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
                b = new py();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new pu();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new pu();
                a1.a(d);
                break;

            case 34: // '"'
                int l1 = com.google.protobuf.nano.f.a(a1, 34);
                pu apu[];
                int j1;
                if (e == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = e.length;
                }
                apu = new pu[l1 + j1];
                if (e != null)
                {
                    System.arraycopy(e, 0, apu, 0, j1);
                }
                for (e = apu; j1 < e.length - 1; j1++)
                {
                    e[j1] = new pu();
                    a1.a(e[j1]);
                    a1.a();
                }

                e[j1] = new pu();
                a1.a(e[j1]);
                break;

            case 42: // '*'
                f = new pu();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = new wk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new dq();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new kz();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new ej();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new pi();
                a1.a(l);
                break;

            case 98: // 'b'
                int i2 = com.google.protobuf.nano.f.a(a1, 98);
                wc awc[];
                int k1;
                if (m == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = m.length;
                }
                awc = new wc[i2 + k1];
                if (m != null)
                {
                    System.arraycopy(m, 0, awc, 0, k1);
                }
                for (m = awc; k1 < m.length - 1; k1++)
                {
                    m[k1] = new wc();
                    a1.a(m[k1]);
                    a1.a();
                }

                m[k1] = new wc();
                a1.a(m[k1]);
                break;

            case 106: // 'j'
                n = a1.g();
                break;

            case 114: // 'r'
                o = new nu();
                a1.a(o);
                break;

            case 122: // 'z'
                p = new dm();
                a1.a(p);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
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
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            pu apu[] = e;
            int k1 = apu.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(4, apu[i1]);
            }

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
        if (m != null)
        {
            wc awc[] = m;
            int l1 = awc.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(12, awc[j1]);
            }

        }
        if (!Arrays.equals(n, f.l))
        {
            codedoutputbytebuffernano.a(13, n);
        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(14, o);
        }
        if (p != null)
        {
            codedoutputbytebuffernano.a(15, p);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
