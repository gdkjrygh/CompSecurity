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
//            fg, qy, sx, kz, 
//            fk, fe

public final class ff extends b
{

    public static final ff a[] = new ff[0];
    public sx b;
    public kz c;
    public fk d;
    public fk e;
    public fk f;
    public String g;
    public fg h[];
    public fe i;
    public fg j;
    public qy k[];

    public ff()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        h = com.google.a.a.a.a.fg.a;
        i = null;
        j = null;
        k = com.google.a.a.a.a.qy.a;
    }

    public final int a()
    {
        boolean flag = false;
        int l;
        int i1;
        int k1;
        if (b != null)
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i1 = 0;
        }
        l = i1;
        if (c != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i1;
        if (!g.equals(""))
        {
            l = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = l;
        if (h != null)
        {
            fg afg[] = h;
            int l1 = afg.length;
            int j1 = 0;
            do
            {
                i1 = l;
                if (j1 >= l1)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(7, afg[j1]);
                j1++;
                l = i1 + l;
            } while (true);
        }
        k1 = i1;
        if (i != null)
        {
            k1 = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        l = k1;
        if (j != null)
        {
            l = k1 + CodedOutputByteBufferNano.b(10, j);
        }
        k1 = l;
        if (k != null)
        {
            qy aqy[] = k;
            int i2 = aqy.length;
            i1 = ((flag) ? 1 : 0);
            do
            {
                k1 = l;
                if (i1 >= i2)
                {
                    break;
                }
                l += CodedOutputByteBufferNano.b(11, aqy[i1]);
                i1++;
            } while (true);
        }
        l = k1 + com.google.protobuf.nano.f.a(dl);
        dm = l;
        return l;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new sx();
                a1.a(b);
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
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                int k1 = com.google.protobuf.nano.f.a(a1, 58);
                fg afg[];
                int i1;
                if (h == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = h.length;
                }
                afg = new fg[k1 + i1];
                if (h != null)
                {
                    System.arraycopy(h, 0, afg, 0, i1);
                }
                for (h = afg; i1 < h.length - 1; i1++)
                {
                    h[i1] = new fg();
                    a1.a(h[i1]);
                    a1.a();
                }

                h[i1] = new fg();
                a1.a(h[i1]);
                break;

            case 66: // 'B'
                i = new fe();
                a1.a(i);
                break;

            case 82: // 'R'
                j = new fg();
                a1.a(j);
                break;

            case 90: // 'Z'
                int l1 = com.google.protobuf.nano.f.a(a1, 90);
                qy aqy[];
                int j1;
                if (k == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = k.length;
                }
                aqy = new qy[l1 + j1];
                if (k != null)
                {
                    System.arraycopy(k, 0, aqy, 0, j1);
                }
                for (k = aqy; j1 < k.length - 1; j1++)
                {
                    k[j1] = new qy();
                    a1.a(k[j1]);
                    a1.a();
                }

                k[j1] = new qy();
                a1.a(k[j1]);
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
            fg afg[] = h;
            int j1 = afg.length;
            for (int l = 0; l < j1; l++)
            {
                codedoutputbytebuffernano.a(7, afg[l]);
            }

        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (k != null)
        {
            qy aqy[] = k;
            int k1 = aqy.length;
            for (int i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(11, aqy[i1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
