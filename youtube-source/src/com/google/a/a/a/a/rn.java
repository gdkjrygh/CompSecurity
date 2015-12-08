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

// Referenced classes of package com.google.a.a.a.a:
//            sx, fk

public final class rn extends b
{

    public static final rn a[] = new rn[0];
    public sx b;
    public fk c;
    public String d[];
    public byte e[];

    public rn()
    {
        b = null;
        c = null;
        d = f.j;
        e = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                String as[] = d;
                int l = as.length;
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < l; j++)
                {
                    k += CodedOutputByteBufferNano.a(as[j]);
                }

                j = i + k + d.length * 1;
            }
        }
        i = j;
        if (!Arrays.equals(e, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(5, e);
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
                b = new sx();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                int j = d.length;
                String as[] = new String[k + j];
                System.arraycopy(d, 0, as, 0, j);
                for (d = as; j < d.length - 1; j++)
                {
                    d[j] = a1.f();
                    a1.a();
                }

                d[j] = a1.f();
                break;

            case 42: // '*'
                e = a1.g();
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
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            String as[] = d;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, as[i]);
            }

        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(5, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
