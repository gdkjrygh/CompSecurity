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
//            fk

public final class bq extends b
{

    public static final bq a[] = new bq[0];
    public fk b;
    public fk c;
    public fk d;
    public int e;
    public fk f;
    public fk g;
    public fk h[];
    public String i;

    public bq()
    {
        b = null;
        c = null;
        d = null;
        e = 0;
        f = null;
        g = null;
        h = com.google.a.a.a.a.fk.a;
        i = "";
    }

    public final int a()
    {
        int l = 0;
        int j;
        int k;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            k = 0;
        }
        j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(2, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = k;
        if (e != 0)
        {
            j = k + CodedOutputByteBufferNano.d(4, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(5, f);
        }
        j = k;
        if (g != null)
        {
            j = k + CodedOutputByteBufferNano.b(6, g);
        }
        k = j;
        if (h != null)
        {
            fk afk[] = h;
            int i1 = afk.length;
            do
            {
                k = j;
                if (l >= i1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(7, afk[l]);
                l++;
            } while (true);
        }
        j = k;
        if (!i.equals(""))
        {
            j = k + CodedOutputByteBufferNano.b(8, i);
        }
        j += com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
    }

    public final c a(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, j))
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
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 32: // ' '
                e = a1.d();
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
                int l = com.google.protobuf.nano.f.a(a1, 58);
                fk afk[];
                int k;
                if (h == null)
                {
                    k = 0;
                } else
                {
                    k = h.length;
                }
                afk = new fk[l + k];
                if (h != null)
                {
                    System.arraycopy(h, 0, afk, 0, k);
                }
                for (h = afk; k < h.length - 1; k++)
                {
                    h[k] = new fk();
                    a1.a(h[k]);
                    a1.a();
                }

                h[k] = new fk();
                a1.a(h[k]);
                break;

            case 66: // 'B'
                i = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
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
        if (e != 0)
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
            fk afk[] = h;
            int k = afk.length;
            for (int j = 0; j < k; j++)
            {
                codedoutputbytebuffernano.a(7, afk[j]);
            }

        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(8, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
