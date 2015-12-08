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
//            au

public final class at extends b
{

    public static final at a[] = new at[0];
    public au b[];

    public at()
    {
        b = com.google.a.a.a.a.au.a;
    }

    public final int a()
    {
        int k = 0;
        int i = 0;
        if (b != null)
        {
            au aau[] = b;
            int l = aau.length;
            int j = 0;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                k = CodedOutputByteBufferNano.b(1, aau[j]);
                j++;
                i = k + i;
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
                int k = f.a(a1, 10);
                au aau[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aau = new au[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aau, 0, j);
                }
                for (b = aau; j < b.length - 1; j++)
                {
                    b[j] = new au();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new au();
                a1.a(b[j]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            au aau[] = b;
            int j = aau.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, aau[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
