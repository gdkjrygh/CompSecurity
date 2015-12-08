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
//            ex, ta, rz, gz, 
//            l

public final class hf extends b
{

    public static final hf a[] = new hf[0];
    public int b[];
    public rz c;
    public String d;
    public gz e;
    public ex f[];
    public ta g[];
    public String h;
    public String i[];
    public String j;
    public l k;
    public String l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public String t;

    public hf()
    {
        b = f.e;
        c = null;
        d = "";
        e = null;
        f = com.google.a.a.a.a.ex.a;
        g = com.google.a.a.a.a.ta.a;
        h = "";
        i = f.j;
        j = "";
        k = null;
        l = "";
        m = 0;
        n = 0;
        o = 0;
        p = 0;
        q = 0;
        r = 0;
        s = "";
        t = "";
    }

    public final int a()
    {
        boolean flag = false;
        int j1;
        int k1;
        int i2;
        if (b != null && b.length > 0)
        {
            int ai[] = b;
            int l1 = ai.length;
            int i1 = 0;
            k1 = 0;
            for (; i1 < l1; i1++)
            {
                k1 += CodedOutputByteBufferNano.a(ai[i1]);
            }

            k1 = k1 + 0 + b.length * 1;
        } else
        {
            k1 = 0;
        }
        j1 = k1;
        if (c != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(2, c);
        }
        i2 = j1;
        if (!d.equals(""))
        {
            i2 = j1 + CodedOutputByteBufferNano.b(3, d);
        }
        k1 = i2;
        if (e != null)
        {
            k1 = i2 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = k1;
        if (f != null)
        {
            ex aex[] = f;
            int i3 = aex.length;
            int j2 = 0;
            do
            {
                j1 = k1;
                if (j2 >= i3)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(5, aex[j2]);
                j2++;
                k1 = j1 + k1;
            } while (true);
        }
        k1 = j1;
        if (g != null)
        {
            ta ata[] = g;
            int j3 = ata.length;
            int k2 = 0;
            do
            {
                k1 = j1;
                if (k2 >= j3)
                {
                    break;
                }
                k1 = CodedOutputByteBufferNano.b(6, ata[k2]);
                k2++;
                j1 = k1 + j1;
            } while (true);
        }
        j1 = k1;
        if (!h.equals(""))
        {
            j1 = k1 + CodedOutputByteBufferNano.b(7, h);
        }
        k1 = j1;
        if (i != null)
        {
            k1 = j1;
            if (i.length > 0)
            {
                String as[] = i;
                int k3 = as.length;
                int l2 = 0;
                for (k1 = ((flag) ? 1 : 0); k1 < k3; k1++)
                {
                    l2 += CodedOutputByteBufferNano.a(as[k1]);
                }

                k1 = j1 + l2 + i.length * 1;
            }
        }
        j1 = k1;
        if (!j.equals(""))
        {
            j1 = k1 + CodedOutputByteBufferNano.b(9, j);
        }
        k1 = j1;
        if (k != null)
        {
            k1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = k1;
        if (!l.equals(""))
        {
            j1 = k1 + CodedOutputByteBufferNano.b(11, l);
        }
        k1 = j1;
        if (m != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.d(12, m);
        }
        j1 = k1;
        if (n != 0)
        {
            j1 = k1 + CodedOutputByteBufferNano.d(13, n);
        }
        k1 = j1;
        if (o != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.d(14, o);
        }
        j1 = k1;
        if (p != 0)
        {
            j1 = k1 + CodedOutputByteBufferNano.d(15, p);
        }
        k1 = j1;
        if (q != 0)
        {
            k1 = j1 + CodedOutputByteBufferNano.d(16, q);
        }
        j1 = k1;
        if (r != 0)
        {
            j1 = k1 + CodedOutputByteBufferNano.d(17, r);
        }
        k1 = j1;
        if (!s.equals(""))
        {
            k1 = j1 + CodedOutputByteBufferNano.b(18, s);
        }
        j1 = k1;
        if (!t.equals(""))
        {
            j1 = k1 + CodedOutputByteBufferNano.b(19, t);
        }
        j1 += com.google.protobuf.nano.f.a(dl);
        dm = j1;
        return j1;
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
                int j2 = com.google.protobuf.nano.f.a(a1, 8);
                int j1 = b.length;
                int ai[] = new int[j2 + j1];
                System.arraycopy(b, 0, ai, 0, j1);
                for (b = ai; j1 < b.length - 1; j1++)
                {
                    b[j1] = a1.d();
                    a1.a();
                }

                b[j1] = a1.d();
                break;

            case 18: // '\022'
                c = new rz();
                a1.a(c);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = new gz();
                a1.a(e);
                break;

            case 42: // '*'
                int k2 = com.google.protobuf.nano.f.a(a1, 42);
                ex aex[];
                int k1;
                if (f == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = f.length;
                }
                aex = new ex[k2 + k1];
                if (f != null)
                {
                    System.arraycopy(f, 0, aex, 0, k1);
                }
                for (f = aex; k1 < f.length - 1; k1++)
                {
                    f[k1] = new ex();
                    a1.a(f[k1]);
                    a1.a();
                }

                f[k1] = new ex();
                a1.a(f[k1]);
                break;

            case 50: // '2'
                int l2 = com.google.protobuf.nano.f.a(a1, 50);
                ta ata[];
                int l1;
                if (g == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = g.length;
                }
                ata = new ta[l2 + l1];
                if (g != null)
                {
                    System.arraycopy(g, 0, ata, 0, l1);
                }
                for (g = ata; l1 < g.length - 1; l1++)
                {
                    g[l1] = new ta();
                    a1.a(g[l1]);
                    a1.a();
                }

                g[l1] = new ta();
                a1.a(g[l1]);
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 66: // 'B'
                int i3 = com.google.protobuf.nano.f.a(a1, 66);
                int i2 = i.length;
                String as[] = new String[i3 + i2];
                System.arraycopy(i, 0, as, 0, i2);
                for (i = as; i2 < i.length - 1; i2++)
                {
                    i[i2] = a1.f();
                    a1.a();
                }

                i[i2] = a1.f();
                break;

            case 74: // 'J'
                j = a1.f();
                break;

            case 82: // 'R'
                k = new l();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = a1.f();
                break;

            case 96: // '`'
                m = a1.d();
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

            case 128: 
                q = a1.d();
                break;

            case 136: 
                r = a1.d();
                break;

            case 146: 
                s = a1.f();
                break;

            case 154: 
                t = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null && b.length > 0)
        {
            int ai[] = b;
            int i2 = ai.length;
            for (int i1 = 0; i1 < i2; i1++)
            {
                codedoutputbytebuffernano.a(1, ai[i1]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            ex aex[] = f;
            int j2 = aex.length;
            for (int j1 = 0; j1 < j2; j1++)
            {
                codedoutputbytebuffernano.a(5, aex[j1]);
            }

        }
        if (g != null)
        {
            ta ata[] = g;
            int k2 = ata.length;
            for (int k1 = 0; k1 < k2; k1++)
            {
                codedoutputbytebuffernano.a(6, ata[k1]);
            }

        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            String as[] = i;
            int l2 = as.length;
            for (int l1 = ((flag) ? 1 : 0); l1 < l2; l1++)
            {
                codedoutputbytebuffernano.a(8, as[l1]);
            }

        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != 0)
        {
            codedoutputbytebuffernano.a(12, m);
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
        if (q != 0)
        {
            codedoutputbytebuffernano.a(16, q);
        }
        if (r != 0)
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
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
