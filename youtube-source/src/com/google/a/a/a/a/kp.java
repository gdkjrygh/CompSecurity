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
//            qy, fk, sx

public final class kp extends b
{

    public static final kp a[] = new kp[0];
    public fk b;
    public fk c;
    public fk d;
    public fk e;
    public String f;
    public sx g;
    public qy h[];

    public kp()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = "";
        g = null;
        h = com.google.a.a.a.a.qy.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
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
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(6, g);
        }
        k = i;
        if (h != null)
        {
            qy aqy[] = h;
            int l = aqy.length;
            j = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(7, aqy[j]);
                j++;
            } while (true);
        }
        i = k + com.google.protobuf.nano.f.a(dl);
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
                c = new fk();
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
                f = a1.f();
                break;

            case 50: // '2'
                g = new sx();
                a1.a(g);
                break;

            case 58: // ':'
                int k = com.google.protobuf.nano.f.a(a1, 58);
                qy aqy[];
                int j;
                if (h == null)
                {
                    j = 0;
                } else
                {
                    j = h.length;
                }
                aqy = new qy[k + j];
                if (h != null)
                {
                    System.arraycopy(h, 0, aqy, 0, j);
                }
                for (h = aqy; j < h.length - 1; j++)
                {
                    h[j] = new qy();
                    a1.a(h[j]);
                    a1.a();
                }

                h[j] = new qy();
                a1.a(h[j]);
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
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            qy aqy[] = h;
            int j = aqy.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(7, aqy[i]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
