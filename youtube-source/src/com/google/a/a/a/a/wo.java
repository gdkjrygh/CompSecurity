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
//            wn

public final class wo extends b
{

    public static final wo a[] = new wo[0];
    public int b;
    public wn c[];

    public wo()
    {
        b = 0;
        c = com.google.a.a.a.a.wn.a;
    }

    public final int a()
    {
        int j = 0;
        int i;
        int k;
        if (b != 0)
        {
            i = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            i = 0;
        }
        k = i;
        if (c != null)
        {
            wn awn[] = c;
            int l = awn.length;
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, awn[j]);
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

            case 8: // '\b'
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                int l = f.a(a1, 18);
                wn awn[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                awn = new wn[l + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, awn, 0, k);
                }
                for (c = awn; k < c.length - 1; k++)
                {
                    c[k] = new wn();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new wn();
                a1.a(c[k]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            wn awn[] = c;
            int j = awn.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, awn[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
