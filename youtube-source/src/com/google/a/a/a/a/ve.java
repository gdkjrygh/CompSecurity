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

public final class ve extends b
{

    public static final ve a[] = new ve[0];
    public byte b[];
    public int c;
    public int d;
    public int e[];

    public ve()
    {
        b = f.l;
        c = 0;
        d = 0;
        e = f.e;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (!Arrays.equals(b, f.l))
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, c);
        }
        i = j;
        if (d != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int ai[] = e;
                int l = ai.length;
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < l; j++)
                {
                    k += CodedOutputByteBufferNano.a(ai[j]);
                }

                j = i + k + e.length * 1;
            }
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
                b = a1.g();
                break;

            case 16: // '\020'
                c = a1.d();
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 32: // ' '
                int k = f.a(a1, 32);
                int j = e.length;
                int ai[] = new int[k + j];
                System.arraycopy(e, 0, ai, 0, j);
                for (e = ai; j < e.length - 1; j++)
                {
                    e[j] = a1.d();
                    a1.a();
                }

                e[j] = a1.d();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!Arrays.equals(b, f.l))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != null)
        {
            int ai[] = e;
            int j = ai.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, ai[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
