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
//            mg, mh

public final class mf extends b
{

    public static final mf a[] = new mf[0];
    public boolean b;
    public mh c;
    public mg d[];
    public byte e[];

    public mf()
    {
        b = false;
        c = null;
        d = com.google.a.a.a.a.mg.a;
        e = f.l;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b)
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
            mg amg[] = d;
            int l = amg.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, amg[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!Arrays.equals(e, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
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
                b = a1.e();
                break;

            case 18: // '\022'
                c = new mh();
                a1.a(c);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                mg amg[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                amg = new mg[k + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, amg, 0, j);
                }
                for (d = amg; j < d.length - 1; j++)
                {
                    d[j] = new mg();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new mg();
                a1.a(d[j]);
                break;

            case 34: // '"'
                e = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            mg amg[] = d;
            int j = amg.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, amg[i]);
            }

        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
