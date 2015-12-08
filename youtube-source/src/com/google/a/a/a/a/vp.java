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
//            vo, fk, kz, vi, 
//            vv

public final class vp extends b
{

    public static final vp a[] = new vp[0];
    public fk b;
    public kz c;
    public vo d[];
    public int e;
    public vi f;
    public vv g;
    public fk h;

    public vp()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.vo.a;
        e = 0;
        f = null;
        g = null;
        h = null;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            vo avo[] = d;
            int l = avo.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, avo[k]);
                k++;
            } while (true);
        }
        i = j;
        if (e != 0)
        {
            i = j + CodedOutputByteBufferNano.d(4, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(6, g);
        }
        j = i;
        if (h != null)
        {
            j = i + CodedOutputByteBufferNano.b(7, h);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new kz();
                a1.a(c);
                break;

            case 26: // '\032'
                int k = com.google.protobuf.nano.f.a(a1, 26);
                vo avo[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                avo = new vo[k + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, avo, 0, j);
                }
                for (d = avo; j < d.length - 1; j++)
                {
                    d[j] = new vo();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new vo();
                a1.a(d[j]);
                break;

            case 32: // ' '
                e = a1.d();
                break;

            case 42: // '*'
                f = new vi();
                a1.a(f);
                break;

            case 50: // '2'
                g = new vv();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
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
            vo avo[] = d;
            int j = avo.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, avo[i]);
            }

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
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
