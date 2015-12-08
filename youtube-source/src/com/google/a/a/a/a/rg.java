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
//            fk, ak, vq, kz, 
//            vm, vv

public final class rg extends b
{

    public static final rg a[] = new rg[0];
    public fk b;
    public kz c;
    public fk d[];
    public ak e[];
    public vm f;
    public vv g;
    public vq h[];
    public boolean i;
    public fk j;

    public rg()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.fk.a;
        e = com.google.a.a.a.a.ak.a;
        f = null;
        g = null;
        h = com.google.a.a.a.a.vq.a;
        i = false;
        j = null;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        int l;
        int k1;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            k = 0;
        }
        l = k;
        if (c != null)
        {
            l = k + CodedOutputByteBufferNano.b(2, c);
        }
        k = l;
        if (d != null)
        {
            fk afk[] = d;
            int i2 = afk.length;
            int i1 = 0;
            do
            {
                k = l;
                if (i1 >= i2)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(3, afk[i1]);
                i1++;
                l = k + l;
            } while (true);
        }
        l = k;
        if (e != null)
        {
            ak aak[] = e;
            int j2 = aak.length;
            int j1 = 0;
            do
            {
                l = k;
                if (j1 >= j2)
                {
                    break;
                }
                l = CodedOutputByteBufferNano.b(4, aak[j1]);
                j1++;
                k = l + k;
            } while (true);
        }
        k1 = l;
        if (f != null)
        {
            k1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        k = k1;
        if (g != null)
        {
            k = k1 + CodedOutputByteBufferNano.b(6, g);
        }
        l = k;
        if (h != null)
        {
            vq avq[] = h;
            int k2 = avq.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                l = k;
                if (l1 >= k2)
                {
                    break;
                }
                k += CodedOutputByteBufferNano.b(7, avq[l1]);
                l1++;
            } while (true);
        }
        k = l;
        if (i)
        {
            k = l + CodedOutputByteBufferNano.b(8, i);
        }
        l = k;
        if (j != null)
        {
            l = k + CodedOutputByteBufferNano.b(9, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new kz();
                a1.a(c);
                break;

            case 26: // '\032'
                int k1 = com.google.protobuf.nano.f.a(a1, 26);
                fk afk[];
                int l;
                if (d == null)
                {
                    l = 0;
                } else
                {
                    l = d.length;
                }
                afk = new fk[k1 + l];
                if (d != null)
                {
                    System.arraycopy(d, 0, afk, 0, l);
                }
                for (d = afk; l < d.length - 1; l++)
                {
                    d[l] = new fk();
                    a1.a(d[l]);
                    a1.a();
                }

                d[l] = new fk();
                a1.a(d[l]);
                break;

            case 34: // '"'
                int l1 = com.google.protobuf.nano.f.a(a1, 34);
                ak aak[];
                int i1;
                if (e == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = e.length;
                }
                aak = new ak[l1 + i1];
                if (e != null)
                {
                    System.arraycopy(e, 0, aak, 0, i1);
                }
                for (e = aak; i1 < e.length - 1; i1++)
                {
                    e[i1] = new ak();
                    a1.a(e[i1]);
                    a1.a();
                }

                e[i1] = new ak();
                a1.a(e[i1]);
                break;

            case 42: // '*'
                f = new vm();
                a1.a(f);
                break;

            case 50: // '2'
                g = new vv();
                a1.a(g);
                break;

            case 58: // ':'
                int i2 = com.google.protobuf.nano.f.a(a1, 58);
                vq avq[];
                int j1;
                if (h == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = h.length;
                }
                avq = new vq[i2 + j1];
                if (h != null)
                {
                    System.arraycopy(h, 0, avq, 0, j1);
                }
                for (h = avq; j1 < h.length - 1; j1++)
                {
                    h[j1] = new vq();
                    a1.a(h[j1]);
                    a1.a();
                }

                h[j1] = new vq();
                a1.a(h[j1]);
                break;

            case 64: // '@'
                i = a1.e();
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
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
            fk afk[] = d;
            int j1 = afk.length;
            for (int k = 0; k < j1; k++)
            {
                codedoutputbytebuffernano.a(3, afk[k]);
            }

        }
        if (e != null)
        {
            ak aak[] = e;
            int k1 = aak.length;
            for (int l = 0; l < k1; l++)
            {
                codedoutputbytebuffernano.a(4, aak[l]);
            }

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
            vq avq[] = h;
            int l1 = avq.length;
            for (int i1 = ((flag) ? 1 : 0); i1 < l1; i1++)
            {
                codedoutputbytebuffernano.a(7, avq[i1]);
            }

        }
        if (i)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
