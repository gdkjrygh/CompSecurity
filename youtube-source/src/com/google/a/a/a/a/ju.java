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
//            jv, fk, sx, kz

public final class ju extends b
{

    public static final ju a[] = new ju[0];
    public String b;
    public fk c;
    public sx d;
    public kz e;
    public fk f;
    public jv g[];
    public kz h;
    public fk i;
    public fk j;
    public byte k[];

    public ju()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = com.google.a.a.a.a.jv.a;
        h = null;
        i = null;
        j = null;
        k = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int l;
        int i1;
        int j1;
        if (!b.equals(""))
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
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        l = j1;
        if (f != null)
        {
            l = j1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = l;
        if (g != null)
        {
            jv ajv[] = g;
            int l1 = ajv.length;
            int k1 = ((flag) ? 1 : 0);
            do
            {
                i1 = l;
                if (k1 >= l1)
                {
                    break;
                }
                l += CodedOutputByteBufferNano.b(7, ajv[k1]);
                k1++;
            } while (true);
        }
        l = i1;
        if (h != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(8, h);
        }
        i1 = l;
        if (i != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(9, i);
        }
        l = i1;
        if (j != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(10, j);
        }
        i1 = l;
        if (!Arrays.equals(k, f.l))
        {
            i1 = l + CodedOutputByteBufferNano.b(11, k);
        }
        l = i1 + com.google.protobuf.nano.f.a(dl);
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
                b = a1.f();
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 34: // '"'
                e = new kz();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 58: // ':'
                int j1 = com.google.protobuf.nano.f.a(a1, 58);
                jv ajv[];
                int i1;
                if (g == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = g.length;
                }
                ajv = new jv[j1 + i1];
                if (g != null)
                {
                    System.arraycopy(g, 0, ajv, 0, i1);
                }
                for (g = ajv; i1 < g.length - 1; i1++)
                {
                    g[i1] = new jv();
                    a1.a(g[i1]);
                    a1.a();
                }

                g[i1] = new jv();
                a1.a(g[i1]);
                break;

            case 66: // 'B'
                h = new kz();
                a1.a(h);
                break;

            case 74: // 'J'
                i = new fk();
                a1.a(i);
                break;

            case 82: // 'R'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = a1.g();
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
            jv ajv[] = g;
            int i1 = ajv.length;
            for (int l = 0; l < i1; l++)
            {
                codedoutputbytebuffernano.a(7, ajv[l]);
            }

        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (!Arrays.equals(k, f.l))
        {
            codedoutputbytebuffernano.a(11, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
