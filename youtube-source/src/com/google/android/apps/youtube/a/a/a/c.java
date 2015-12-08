// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import java.util.ArrayList;

public final class c extends b
{

    public static final c a[] = new c[0];
    public String b;
    public String c[];
    public String d;
    public int e;
    public String f[];
    public String g;
    public int h;
    public int i;
    public int j[];

    public c()
    {
        b = "";
        c = f.j;
        d = "";
        e = 0;
        f = f.j;
        g = "";
        h = 0;
        i = 0;
        j = f.e;
    }

    public final int a()
    {
        boolean flag = false;
        int k;
        int l;
        int j1;
        if (!b.equals(""))
        {
            k = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            k = 0;
        }
        l = k;
        if (c != null)
        {
            l = k;
            if (c.length > 0)
            {
                String as[] = c;
                int i2 = as.length;
                l = 0;
                int i1 = 0;
                for (; l < i2; l++)
                {
                    i1 += CodedOutputByteBufferNano.a(as[l]);
                }

                l = k + i1 + c.length * 1;
            }
        }
        j1 = l;
        if (!d.equals(""))
        {
            j1 = l + CodedOutputByteBufferNano.b(3, d);
        }
        k = j1;
        if (e != 0)
        {
            k = j1 + CodedOutputByteBufferNano.d(8, e);
        }
        l = k;
        if (f != null)
        {
            l = k;
            if (f.length > 0)
            {
                String as1[] = f;
                int j2 = as1.length;
                l = 0;
                int k1 = 0;
                for (; l < j2; l++)
                {
                    k1 += CodedOutputByteBufferNano.a(as1[l]);
                }

                l = k + k1 + f.length * 1;
            }
        }
        k = l;
        if (!g.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(11, g);
        }
        l = k;
        if (h != 0)
        {
            l = k + CodedOutputByteBufferNano.d(13, h);
        }
        k = l;
        if (i != 0)
        {
            k = l + CodedOutputByteBufferNano.d(1001, i);
        }
        l = k;
        if (j != null)
        {
            l = k;
            if (j.length > 0)
            {
                int ai[] = j;
                int k2 = ai.length;
                int l1 = 0;
                for (l = ((flag) ? 1 : 0); l < k2; l++)
                {
                    l1 += CodedOutputByteBufferNano.a(ai[l]);
                }

                l = k + l1 + j.length * 2;
            }
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final com.google.protobuf.nano.c a(a a1)
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
                b = a1.f();
                break;

            case 18: // '\022'
                int l1 = com.google.protobuf.nano.f.a(a1, 18);
                int l = c.length;
                String as[] = new String[l1 + l];
                System.arraycopy(c, 0, as, 0, l);
                for (c = as; l < c.length - 1; l++)
                {
                    c[l] = a1.f();
                    a1.a();
                }

                c[l] = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 64: // '@'
                int i1 = a1.d();
                if (i1 == 0 || i1 == 1 || i1 == 2)
                {
                    e = i1;
                } else
                {
                    e = 0;
                }
                break;

            case 82: // 'R'
                int i2 = com.google.protobuf.nano.f.a(a1, 82);
                int j1 = f.length;
                String as1[] = new String[i2 + j1];
                System.arraycopy(f, 0, as1, 0, j1);
                for (f = as1; j1 < f.length - 1; j1++)
                {
                    f[j1] = a1.f();
                    a1.a();
                }

                f[j1] = a1.f();
                break;

            case 90: // 'Z'
                g = a1.f();
                break;

            case 104: // 'h'
                h = a1.d();
                break;

            case 8008: 
                i = a1.d();
                break;

            case 8016: 
                int j2 = com.google.protobuf.nano.f.a(a1, 8016);
                int k1 = j.length;
                int ai[] = new int[j2 + k1];
                System.arraycopy(j, 0, ai, 0, k1);
                for (j = ai; k1 < j.length - 1; k1++)
                {
                    j[k1] = a1.d();
                    a1.a();
                }

                j[k1] = a1.d();
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
            String as[] = c;
            int j1 = as.length;
            for (int k = 0; k < j1; k++)
            {
                codedoutputbytebuffernano.a(2, as[k]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(8, e);
        }
        if (f != null)
        {
            String as1[] = f;
            int k1 = as1.length;
            for (int l = 0; l < k1; l++)
            {
                codedoutputbytebuffernano.a(10, as1[l]);
            }

        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(11, g);
        }
        if (h != 0)
        {
            codedoutputbytebuffernano.a(13, h);
        }
        if (i != 0)
        {
            codedoutputbytebuffernano.a(1001, i);
        }
        if (j != null)
        {
            int ai[] = j;
            int l1 = ai.length;
            for (int i1 = ((flag) ? 1 : 0); i1 < l1; i1++)
            {
                codedoutputbytebuffernano.a(1002, ai[i1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
