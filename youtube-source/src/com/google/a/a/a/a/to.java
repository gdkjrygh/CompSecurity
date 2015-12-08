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
//            ii

public final class to extends b
{

    public static final to a[] = new to[0];
    public ii b;
    public String c[];

    public to()
    {
        b = null;
        c = f.j;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
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
                String as[] = c;
                int l = as.length;
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < l; j++)
                {
                    k += CodedOutputByteBufferNano.a(as[j]);
                }

                j = i + k + c.length * 1;
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
                b = new ii();
                a1.a(b);
                break;

            case 18: // '\022'
                int k = f.a(a1, 18);
                int j = c.length;
                String as[] = new String[k + j];
                System.arraycopy(c, 0, as, 0, j);
                for (c = as; j < c.length - 1; j++)
                {
                    c[j] = a1.f();
                    a1.a();
                }

                c[j] = a1.f();
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
            String as[] = c;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, as[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
