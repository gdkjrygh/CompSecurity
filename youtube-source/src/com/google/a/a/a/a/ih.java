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

public final class ih extends b
{

    public static final ih a[] = new ih[0];
    public int b;
    public int c[];
    public int d[];

    public ih()
    {
        b = 0;
        c = f.e;
        d = f.e;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (b != 0)
        {
            i = CodedOutputByteBufferNano.f(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                int ai[] = c;
                int i1 = ai.length;
                j = 0;
                int k = 0;
                for (; j < i1; j++)
                {
                    k += CodedOutputByteBufferNano.d(ai[j]);
                }

                j = i + k + c.length * 1;
            }
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                int ai1[] = d;
                int j1 = ai1.length;
                int l = 0;
                for (i = ((flag) ? 1 : 0); i < j1; i++)
                {
                    l += CodedOutputByteBufferNano.d(ai1[i]);
                }

                i = j + l + d.length * 1;
            }
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

            case 8: // '\b'
                b = a1.h();
                break;

            case 16: // '\020'
                int l = f.a(a1, 16);
                int j = c.length;
                int ai[] = new int[l + j];
                System.arraycopy(c, 0, ai, 0, j);
                for (c = ai; j < c.length - 1; j++)
                {
                    c[j] = a1.h();
                    a1.a();
                }

                c[j] = a1.h();
                break;

            case 24: // '\030'
                int i1 = f.a(a1, 24);
                int k = d.length;
                int ai1[] = new int[i1 + k];
                System.arraycopy(d, 0, ai1, 0, k);
                for (d = ai1; k < d.length - 1; k++)
                {
                    d[k] = a1.h();
                    a1.a();
                }

                d[k] = a1.h();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != 0)
        {
            codedoutputbytebuffernano.c(1, b);
        }
        if (c != null)
        {
            int ai[] = c;
            int k = ai.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.c(2, ai[i]);
            }

        }
        if (d != null)
        {
            int ai1[] = d;
            int l = ai1.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.c(3, ai1[j]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
