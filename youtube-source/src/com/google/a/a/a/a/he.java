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
//            tt, hh, ex, ho, 
//            p, pf

public final class he extends b
{

    public static final he a[] = new he[0];
    public p b;
    public String c;
    public String d;
    public String e;
    public pf f;
    public String g;
    public String h[];
    public tt i[];
    public hh j[];
    public ex k[];
    public ho l[];

    public he()
    {
        b = null;
        c = "";
        d = "";
        e = "";
        f = null;
        g = "";
        h = f.j;
        i = com.google.a.a.a.a.tt.a;
        j = com.google.a.a.a.a.hh.a;
        k = com.google.a.a.a.a.ex.a;
        l = com.google.a.a.a.a.ho.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k2;
        if (b != null)
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
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1;
            if (h.length > 0)
            {
                String as[] = h;
                int l2 = as.length;
                j1 = 0;
                int k1 = 0;
                for (; j1 < l2; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + k1 + h.length * 1;
            }
        }
        i1 = j1;
        if (i != null)
        {
            tt att[] = i;
            int i3 = att.length;
            int l1 = 0;
            do
            {
                i1 = j1;
                if (l1 >= i3)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(8, att[l1]);
                l1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (j != null)
        {
            hh ahh[] = j;
            int j3 = ahh.length;
            int i2 = 0;
            do
            {
                j1 = i1;
                if (i2 >= j3)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(9, ahh[i2]);
                i2++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (k != null)
        {
            ex aex[] = k;
            int k3 = aex.length;
            int j2 = 0;
            do
            {
                i1 = j1;
                if (j2 >= k3)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(10, aex[j2]);
                j2++;
                j1 = i1 + j1;
            } while (true);
        }
        k2 = i1;
        if (l != null)
        {
            ho aho[] = l;
            int l3 = aho.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                k2 = i1;
                if (j1 >= l3)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(11, aho[j1]);
                j1++;
            } while (true);
        }
        i1 = k2 + com.google.protobuf.nano.f.a(dl);
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
                b = new p();
                a1.a(b);
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
                f = new pf();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                int k2 = com.google.protobuf.nano.f.a(a1, 58);
                int j1 = h.length;
                String as[] = new String[k2 + j1];
                System.arraycopy(h, 0, as, 0, j1);
                for (h = as; j1 < h.length - 1; j1++)
                {
                    h[j1] = a1.f();
                    a1.a();
                }

                h[j1] = a1.f();
                break;

            case 66: // 'B'
                int l2 = com.google.protobuf.nano.f.a(a1, 66);
                tt att[];
                int k1;
                if (i == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = i.length;
                }
                att = new tt[l2 + k1];
                if (i != null)
                {
                    System.arraycopy(i, 0, att, 0, k1);
                }
                for (i = att; k1 < i.length - 1; k1++)
                {
                    i[k1] = new tt();
                    a1.a(i[k1]);
                    a1.a();
                }

                i[k1] = new tt();
                a1.a(i[k1]);
                break;

            case 74: // 'J'
                int i3 = com.google.protobuf.nano.f.a(a1, 74);
                hh ahh[];
                int l1;
                if (j == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = j.length;
                }
                ahh = new hh[i3 + l1];
                if (j != null)
                {
                    System.arraycopy(j, 0, ahh, 0, l1);
                }
                for (j = ahh; l1 < j.length - 1; l1++)
                {
                    j[l1] = new hh();
                    a1.a(j[l1]);
                    a1.a();
                }

                j[l1] = new hh();
                a1.a(j[l1]);
                break;

            case 82: // 'R'
                int j3 = com.google.protobuf.nano.f.a(a1, 82);
                ex aex[];
                int i2;
                if (k == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = k.length;
                }
                aex = new ex[j3 + i2];
                if (k != null)
                {
                    System.arraycopy(k, 0, aex, 0, i2);
                }
                for (k = aex; i2 < k.length - 1; i2++)
                {
                    k[i2] = new ex();
                    a1.a(k[i2]);
                    a1.a();
                }

                k[i2] = new ex();
                a1.a(k[i2]);
                break;

            case 90: // 'Z'
                int k3 = com.google.protobuf.nano.f.a(a1, 90);
                ho aho[];
                int j2;
                if (l == null)
                {
                    j2 = 0;
                } else
                {
                    j2 = l.length;
                }
                aho = new ho[k3 + j2];
                if (l != null)
                {
                    System.arraycopy(l, 0, aho, 0, j2);
                }
                for (l = aho; j2 < l.length - 1; j2++)
                {
                    l[j2] = new ho();
                    a1.a(l[j2]);
                    a1.a();
                }

                l[j2] = new ho();
                a1.a(l[j2]);
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
            String as[] = h;
            int j2 = as.length;
            for (int i1 = 0; i1 < j2; i1++)
            {
                codedoutputbytebuffernano.a(7, as[i1]);
            }

        }
        if (i != null)
        {
            tt att[] = i;
            int k2 = att.length;
            for (int j1 = 0; j1 < k2; j1++)
            {
                codedoutputbytebuffernano.a(8, att[j1]);
            }

        }
        if (j != null)
        {
            hh ahh[] = j;
            int l2 = ahh.length;
            for (int k1 = 0; k1 < l2; k1++)
            {
                codedoutputbytebuffernano.a(9, ahh[k1]);
            }

        }
        if (k != null)
        {
            ex aex[] = k;
            int i3 = aex.length;
            for (int l1 = 0; l1 < i3; l1++)
            {
                codedoutputbytebuffernano.a(10, aex[l1]);
            }

        }
        if (l != null)
        {
            ho aho[] = l;
            int j3 = aho.length;
            for (int i2 = ((flag) ? 1 : 0); i2 < j3; i2++)
            {
                codedoutputbytebuffernano.a(11, aho[i2]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
