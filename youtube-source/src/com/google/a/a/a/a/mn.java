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
//            mo, md

public final class mn extends b
{

    public static final mn a[] = new mn[0];
    public md b;
    public mo c[];

    public mn()
    {
        b = null;
        c = com.google.a.a.a.a.mo.a;
    }

    public final int a()
    {
        int j = 0;
        int i;
        int k;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        k = i;
        if (c != null)
        {
            mo amo[] = c;
            int l = amo.length;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, amo[j]);
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
                b = new md();
                a1.a(b);
                break;

            case 18: // '\022'
                int k = f.a(a1, 18);
                mo amo[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                amo = new mo[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, amo, 0, j);
                }
                for (c = amo; j < c.length - 1; j++)
                {
                    c[j] = new mo();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new mo();
                a1.a(c[j]);
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
            mo amo[] = c;
            int j = amo.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, amo[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
