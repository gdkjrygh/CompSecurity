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
//            sx, fk, kz, px

public final class pw extends b
{

    public static final pw a[] = new pw[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public fk f;
    public fk g;
    public sx h;
    public fk i;
    public kz j;
    public fk k;
    public String l[];
    public String m;
    public String n[];
    public px o;

    public pw()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = f.j;
        m = "";
        n = f.j;
        o = null;
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
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
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
        if (!m.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1;
            if (n.length > 0)
            {
                String as1[] = n;
                int j2 = as1.length;
                int l1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < j2; j1++)
                {
                    l1 += CodedOutputByteBufferNano.a(as1[j1]);
                }

                j1 = i1 + l1 + n.length * 1;
            }
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(20, o);
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
                c = new sx();
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
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new sx();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new kz();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new fk();
                a1.a(k);
                break;

            case 90: // 'Z'
                int l1 = com.google.protobuf.nano.f.a(a1, 90);
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

            case 98: // 'b'
                m = a1.f();
                break;

            case 114: // 'r'
                int i2 = com.google.protobuf.nano.f.a(a1, 114);
                int k1 = n.length;
                String as1[] = new String[i2 + k1];
                System.arraycopy(n, 0, as1, 0, k1);
                for (n = as1; k1 < n.length - 1; k1++)
                {
                    n[k1] = a1.f();
                    a1.a();
                }

                n[k1] = a1.f();
                break;

            case 162: 
                o = new px();
                a1.a(o);
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
        if (g != null)
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
            String as[] = l;
            int k1 = as.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(11, as[i1]);
            }

        }
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            String as1[] = n;
            int l1 = as1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(14, as1[j1]);
            }

        }
        if (o != null)
        {
            codedoutputbytebuffernano.a(20, o);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
