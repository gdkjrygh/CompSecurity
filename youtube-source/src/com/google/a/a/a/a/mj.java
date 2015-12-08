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
//            ml

public final class mj extends b
{

    public static final mj a[] = new mj[0];
    public String b;
    public int c;
    public int d;
    public ml e[];

    public mj()
    {
        b = "";
        c = 0;
        d = 0;
        e = com.google.a.a.a.a.ml.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int l;
        if (!b.equals(""))
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != 0)
        {
            j = i + CodedOutputByteBufferNano.f(2, c);
        }
        i = j;
        if (d != 0)
        {
            i = j + CodedOutputByteBufferNano.f(3, d);
        }
        l = i;
        if (e != null)
        {
            ml aml[] = e;
            int i1 = aml.length;
            int k = ((flag) ? 1 : 0);
            do
            {
                l = i;
                if (k >= i1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, aml[k]);
                k++;
            } while (true);
        }
        i = l + f.a(dl);
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
                b = a1.f();
                break;

            case 16: // '\020'
                c = a1.h();
                break;

            case 24: // '\030'
                d = a1.h();
                break;

            case 34: // '"'
                int k = f.a(a1, 34);
                ml aml[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                aml = new ml[k + j];
                if (e != null)
                {
                    System.arraycopy(e, 0, aml, 0, j);
                }
                for (e = aml; j < e.length - 1; j++)
                {
                    e[j] = new ml();
                    a1.a(e[j]);
                    a1.a();
                }

                e[j] = new ml();
                a1.a(e[j]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.c(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.c(3, d);
        }
        if (e != null)
        {
            ml aml[] = e;
            int j = aml.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, aml[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
