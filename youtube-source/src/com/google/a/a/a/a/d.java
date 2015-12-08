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
//            e, fk

public final class d extends b
{

    public static final d a[] = new d[0];
    public e b[];
    public fk c;
    public fk d;

    public d()
    {
        b = com.google.a.a.a.a.e.a;
        c = null;
        d = null;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            e ae[] = b;
            int l = ae.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, ae[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(5, d);
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
                e ae[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ae = new e[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, ae, 0, j);
                }
                for (b = ae; j < b.length - 1; j++)
                {
                    b[j] = new e();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new e();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 42: // '*'
                d = new fk();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            e ae[] = b;
            int j = ae.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, ae[i]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(5, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
