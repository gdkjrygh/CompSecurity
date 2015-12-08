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
//            sh, fk

public final class ey extends b
{

    public static final ey a[] = new ey[0];
    public int b;
    public sh c[];
    public fk d;

    public ey()
    {
        b = 0;
        c = com.google.a.a.a.a.sh.a;
        d = null;
    }

    public final int a()
    {
        int k = 0;
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
            sh ash[] = c;
            int l = ash.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, ash[k]);
                k++;
            } while (true);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
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

            case 18: // '\022'
                int k = f.a(a1, 18);
                sh ash[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ash = new sh[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, ash, 0, j);
                }
                for (c = ash; j < c.length - 1; j++)
                {
                    c[j] = new sh();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new sh();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.c(1, b);
        }
        if (c != null)
        {
            sh ash[] = c;
            int j = ash.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, ash[i]);
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
