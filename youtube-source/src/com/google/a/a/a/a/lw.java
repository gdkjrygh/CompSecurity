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
//            lx

public final class lw extends b
{

    public static final lw a[] = new lw[0];
    public lx b[];
    public String c;
    public boolean d;

    public lw()
    {
        b = com.google.a.a.a.a.lx.a;
        c = "";
        d = false;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            lx alx[] = b;
            int l = alx.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, alx[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
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
                int k = f.a(a1, 10);
                lx alx[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alx = new lx[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, alx, 0, j);
                }
                for (b = alx; j < b.length - 1; j++)
                {
                    b[j] = new lx();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new lx();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 24: // '\030'
                d = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            lx alx[] = b;
            int j = alx.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, alx[i]);
            }

        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
