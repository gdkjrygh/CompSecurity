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
//            sc

public final class fk extends b
{

    public static final fk a[] = new fk[0];
    public sc b[];
    public boolean c;

    public fk()
    {
        b = com.google.a.a.a.a.sc.a;
        c = false;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            sc asc[] = b;
            int l = asc.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, asc[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (c)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
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
                int k = f.a(a1, 10);
                sc asc[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                asc = new sc[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, asc, 0, j);
                }
                for (b = asc; j < b.length - 1; j++)
                {
                    b[j] = new sc();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new sc();
                a1.a(b[j]);
                break;

            case 16: // '\020'
                c = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            sc asc[] = b;
            int j = asc.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, asc[i]);
            }

        }
        if (c)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
