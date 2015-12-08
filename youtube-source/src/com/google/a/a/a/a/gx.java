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
//            gy, fk

public final class gx extends b
{

    public static final gx a[] = new gx[0];
    public gy b[];
    public fk c;

    public gx()
    {
        b = com.google.a.a.a.a.gy.a;
        c = null;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            gy agy[] = b;
            int l = agy.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, agy[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, c);
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
                gy agy[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                agy = new gy[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, agy, 0, j);
                }
                for (b = agy; j < b.length - 1; j++)
                {
                    b[j] = new gy();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new gy();
                a1.a(b[j]);
                break;

            case 26: // '\032'
                c = new fk();
                a1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            gy agy[] = b;
            int j = agy.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, agy[i]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
