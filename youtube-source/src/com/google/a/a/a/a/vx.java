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
//            fk, kz, vm, vv, 
//            vq

public final class vx extends b
{

    public static final vx a[] = new vx[0];
    public fk b;
    public kz c;
    public fk d[];
    public vm e;
    public vv f;
    public vq g;
    public boolean h;
    public fk i;

    public vx()
    {
        b = null;
        c = null;
        d = com.google.a.a.a.a.fk.a;
        e = null;
        f = null;
        g = null;
        h = false;
        i = null;
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
            fk afk[] = d;
            int i1 = afk.length;
            do
            {
                k = j;
                if (l >= i1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(3, afk[l]);
                l++;
            } while (true);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(4, e);
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
        if (h)
        {
            k = j + CodedOutputByteBufferNano.b(7, h);
        }
        j = k;
        if (i != null)
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
                c = new kz();
                a1.a(c);
                break;

            case 26: // '\032'
                int l = com.google.protobuf.nano.f.a(a1, 26);
                fk afk[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                afk = new fk[l + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, afk, 0, k);
                }
                for (d = afk; k < d.length - 1; k++)
                {
                    d[k] = new fk();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new fk();
                a1.a(d[k]);
                break;

            case 34: // '"'
                e = new vm();
                a1.a(e);
                break;

            case 42: // '*'
                f = new vv();
                a1.a(f);
                break;

            case 50: // '2'
                g = new vq();
                a1.a(g);
                break;

            case 56: // '8'
                h = a1.e();
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
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
            fk afk[] = d;
            int k = afk.length;
            for (int j = 0; j < k; j++)
            {
                codedoutputbytebuffernano.a(3, afk[j]);
            }

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
        if (h)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
