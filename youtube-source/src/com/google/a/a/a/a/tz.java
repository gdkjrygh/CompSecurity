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
//            j

public final class tz extends b
{

    public static final tz a[] = new tz[0];
    public String b;
    public j c[];
    public String d;

    public tz()
    {
        b = "";
        c = com.google.a.a.a.a.j.a;
        d = "";
    }

    public final int a()
    {
        int l = 0;
        int i;
        int k;
        if (!b.equals(""))
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        k = i;
        if (c != null)
        {
            j aj[] = c;
            int i1 = aj.length;
            do
            {
                k = i;
                if (l >= i1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, aj[l]);
                l++;
            } while (true);
        }
        i = k;
        if (!d.equals(""))
        {
            i = k + CodedOutputByteBufferNano.b(3, d);
        }
        i += f.a(dl);
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
                b = a1.f();
                break;

            case 18: // '\022'
                int l = f.a(a1, 18);
                j aj[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aj = new j[l + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, aj, 0, k);
                }
                for (c = aj; k < c.length - 1; k++)
                {
                    c[k] = new j();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new j();
                a1.a(c[k]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            j aj[] = c;
            int k = aj.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, aj[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
