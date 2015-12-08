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
//            sx, fk, ht, hu

public final class rm extends b
{

    public static final rm a[] = new rm[0];
    public sx b;
    public fk c;
    public fk d;
    public ht e;
    public hu f;
    public String g[];
    public byte h[];

    public rm()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = f.j;
        h = f.l;
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
        k = j;
        if (e != null)
        {
            k = j + CodedOutputByteBufferNano.b(4, e);
        }
        i = k;
        if (f != null)
        {
            i = k + CodedOutputByteBufferNano.b(5, f);
        }
        j = i;
        if (g != null)
        {
            j = i;
            if (g.length > 0)
            {
                String as[] = g;
                int i1 = as.length;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < i1; j++)
                {
                    l += CodedOutputByteBufferNano.a(as[j]);
                }

                j = i + l + g.length * 1;
            }
        }
        i = j;
        if (!Arrays.equals(h, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(8, h);
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
                b = new sx();
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
                e = new ht();
                a1.a(e);
                break;

            case 42: // '*'
                f = new hu();
                a1.a(f);
                break;

            case 50: // '2'
                int k = com.google.protobuf.nano.f.a(a1, 50);
                int j = g.length;
                String as[] = new String[k + j];
                System.arraycopy(g, 0, as, 0, j);
                for (g = as; j < g.length - 1; j++)
                {
                    g[j] = a1.f();
                    a1.a();
                }

                g[j] = a1.f();
                break;

            case 66: // 'B'
                h = a1.g();
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
        if (g != null)
        {
            String as[] = g;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(6, as[i]);
            }

        }
        if (!Arrays.equals(h, f.l))
        {
            codedoutputbytebuffernano.a(8, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
