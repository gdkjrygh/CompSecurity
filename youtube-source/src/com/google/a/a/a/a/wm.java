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
//            tt, ex, wp, p

public final class wm extends b
{

    public static final wm a[] = new wm[0];
    public p b;
    public String c;
    public String d;
    public tt e[];
    public ex f[];
    public wp g[];

    public wm()
    {
        b = null;
        c = "";
        d = "";
        e = com.google.a.a.a.a.tt.a;
        f = com.google.a.a.a.a.ex.a;
        g = com.google.a.a.a.a.wp.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int i1;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != null)
        {
            tt att[] = e;
            int j1 = att.length;
            int k = 0;
            do
            {
                i = j;
                if (k >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(4, att[k]);
                k++;
                j = i + j;
            } while (true);
        }
        j = i;
        if (f != null)
        {
            ex aex[] = f;
            int k1 = aex.length;
            int l = 0;
            do
            {
                j = i;
                if (l >= k1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(5, aex[l]);
                l++;
                i = j + i;
            } while (true);
        }
        i1 = j;
        if (g != null)
        {
            wp awp[] = g;
            int l1 = awp.length;
            i = ((flag) ? 1 : 0);
            do
            {
                i1 = j;
                if (i >= l1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(6, awp[i]);
                i++;
            } while (true);
        }
        i = i1 + com.google.protobuf.nano.f.a(dl);
        dm = i;
        return i;
    }

    public final c a(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i))
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
                int i1 = com.google.protobuf.nano.f.a(a1, 34);
                tt att[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                att = new tt[i1 + j];
                if (e != null)
                {
                    System.arraycopy(e, 0, att, 0, j);
                }
                for (e = att; j < e.length - 1; j++)
                {
                    e[j] = new tt();
                    a1.a(e[j]);
                    a1.a();
                }

                e[j] = new tt();
                a1.a(e[j]);
                break;

            case 42: // '*'
                int j1 = com.google.protobuf.nano.f.a(a1, 42);
                ex aex[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                aex = new ex[j1 + k];
                if (f != null)
                {
                    System.arraycopy(f, 0, aex, 0, k);
                }
                for (f = aex; k < f.length - 1; k++)
                {
                    f[k] = new ex();
                    a1.a(f[k]);
                    a1.a();
                }

                f[k] = new ex();
                a1.a(f[k]);
                break;

            case 50: // '2'
                int k1 = com.google.protobuf.nano.f.a(a1, 50);
                wp awp[];
                int l;
                if (g == null)
                {
                    l = 0;
                } else
                {
                    l = g.length;
                }
                awp = new wp[k1 + l];
                if (g != null)
                {
                    System.arraycopy(g, 0, awp, 0, l);
                }
                for (g = awp; l < g.length - 1; l++)
                {
                    g[l] = new wp();
                    a1.a(g[l]);
                    a1.a();
                }

                g[l] = new wp();
                a1.a(g[l]);
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
        if (e != null)
        {
            tt att[] = e;
            int l = att.length;
            for (int i = 0; i < l; i++)
            {
                codedoutputbytebuffernano.a(4, att[i]);
            }

        }
        if (f != null)
        {
            ex aex[] = f;
            int i1 = aex.length;
            for (int j = 0; j < i1; j++)
            {
                codedoutputbytebuffernano.a(5, aex[j]);
            }

        }
        if (g != null)
        {
            wp awp[] = g;
            int j1 = awp.length;
            for (int k = ((flag) ? 1 : 0); k < j1; k++)
            {
                codedoutputbytebuffernano.a(6, awp[k]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
