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
//            oc, ii

public final class od extends b
{

    public static final od a[] = new od[0];
    public ii b;
    public oc c[];
    public String d;
    public int e;

    public od()
    {
        b = null;
        c = com.google.a.a.a.a.oc.a;
        d = "";
        e = 0;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            oc aoc[] = c;
            int l = aoc.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, aoc[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = i;
        if (e != 0)
        {
            j = i + CodedOutputByteBufferNano.d(4, e);
        }
        i = j + f.a(dl);
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
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new ii();
                a1.a(b);
                break;

            case 18: // '\022'
                int l = f.a(a1, 18);
                oc aoc[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aoc = new oc[l + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, aoc, 0, j);
                }
                for (c = aoc; j < c.length - 1; j++)
                {
                    c[j] = new oc();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new oc();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 32: // ' '
                int k = a1.d();
                if (k == 0 || k == 1)
                {
                    e = k;
                } else
                {
                    e = 0;
                }
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
            oc aoc[] = c;
            int j = aoc.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, aoc[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
