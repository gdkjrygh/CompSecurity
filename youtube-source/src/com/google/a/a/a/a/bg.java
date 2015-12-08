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
//            ih, bf, dp, dn

public final class bg extends b
{

    public static final bg a[] = new bg[0];
    public String b;
    public ih c[];
    public ih d[];
    public bf e;
    public dp f;
    public dn g;

    public bg()
    {
        b = "";
        c = com.google.a.a.a.a.ih.a;
        d = com.google.a.a.a.a.ih.a;
        e = null;
        f = null;
        g = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (!b.equals(""))
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            ih aih[] = c;
            int i1 = aih.length;
            int k = 0;
            do
            {
                i = j;
                if (k >= i1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(2, aih[k]);
                k++;
                j = i + j;
            } while (true);
        }
        j = i;
        if (d != null)
        {
            ih aih1[] = d;
            int j1 = aih1.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (l >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, aih1[l]);
                l++;
            } while (true);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3175736, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x31ac7c8, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x32de345, g);
        }
        i += com.google.protobuf.nano.f.a(dl);
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
                b = a1.f();
                break;

            case 18: // '\022'
                int l = com.google.protobuf.nano.f.a(a1, 18);
                ih aih[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aih = new ih[l + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, aih, 0, j);
                }
                for (c = aih; j < c.length - 1; j++)
                {
                    c[j] = new ih();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new ih();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                int i1 = com.google.protobuf.nano.f.a(a1, 26);
                ih aih1[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                aih1 = new ih[i1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, aih1, 0, k);
                }
                for (d = aih1; k < d.length - 1; k++)
                {
                    d[k] = new ih();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new ih();
                a1.a(d[k]);
                break;

            case 414890418: 
                e = new bf();
                a1.a(e);
                break;

            case 416693826: 
                f = new dp();
                a1.a(f);
                break;

            case 426711594: 
                g = new dn();
                a1.a(g);
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
            ih aih[] = c;
            int k = aih.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, aih[i]);
            }

        }
        if (d != null)
        {
            ih aih1[] = d;
            int l = aih1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(3, aih1[j]);
            }

        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3175736, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x31ac7c8, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x32de345, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
