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
//            qy, fk, kz, sx

public final class kh extends b
{

    public static final kh a[] = new kh[0];
    public fk b;
    public fk c;
    public fk d;
    public kz e;
    public sx f;
    public String g;
    public fk h;
    public qy i[];

    public kh()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        h = null;
        i = com.google.a.a.a.a.qy.a;
    }

    public final int a()
    {
        boolean flag = false;
        int j;
        int k;
        int l;
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
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(4, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(5, f);
        }
        l = k;
        if (!g.equals(""))
        {
            l = k + CodedOutputByteBufferNano.b(6, g);
        }
        j = l;
        if (h != null)
        {
            j = l + CodedOutputByteBufferNano.b(7, h);
        }
        l = j;
        if (i != null)
        {
            qy aqy[] = i;
            int i1 = aqy.length;
            k = ((flag) ? 1 : 0);
            do
            {
                l = j;
                if (k >= i1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(8, aqy[k]);
                k++;
            } while (true);
        }
        j = l + com.google.protobuf.nano.f.a(dl);
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

            case 34: // '"'
                e = new kz();
                a1.a(e);
                break;

            case 42: // '*'
                f = new sx();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                int l = com.google.protobuf.nano.f.a(a1, 66);
                qy aqy[];
                int k;
                if (i == null)
                {
                    k = 0;
                } else
                {
                    k = i.length;
                }
                aqy = new qy[l + k];
                if (i != null)
                {
                    System.arraycopy(i, 0, aqy, 0, k);
                }
                for (i = aqy; k < i.length - 1; k++)
                {
                    i[k] = new qy();
                    a1.a(i[k]);
                    a1.a();
                }

                i[k] = new qy();
                a1.a(i[k]);
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
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            qy aqy[] = i;
            int k = aqy.length;
            for (int j = 0; j < k; j++)
            {
                codedoutputbytebuffernano.a(8, aqy[j]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
