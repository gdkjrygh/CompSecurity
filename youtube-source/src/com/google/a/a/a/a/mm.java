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
//            mj

public final class mm extends b
{

    public static final mm a[] = new mm[0];
    public String b;
    public mj c[];

    public mm()
    {
        b = "";
        c = com.google.a.a.a.a.mj.a;
    }

    public final int a()
    {
        int j = 0;
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
            mj amj[] = c;
            int l = amj.length;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, amj[j]);
                j++;
            } while (true);
        }
        i = k + f.a(dl);
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
                int k = f.a(a1, 18);
                mj amj[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                amj = new mj[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, amj, 0, j);
                }
                for (c = amj; j < c.length - 1; j++)
                {
                    c[j] = new mj();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new mj();
                a1.a(c[j]);
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
            mj amj[] = c;
            int j = amj.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, amj[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
