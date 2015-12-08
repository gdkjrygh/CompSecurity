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
//            mn, py, mc

public final class mb extends b
{

    public static final mb a[] = new mb[0];
    public py b;
    public mn c[];
    public mc d;
    public String e;
    public int f;

    public mb()
    {
        b = null;
        c = com.google.a.a.a.a.mn.a;
        d = null;
        e = "";
        f = 0;
    }

    public final int a()
    {
        int k = 0;
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
            mn amn[] = c;
            int l = amn.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, amn[k]);
                k++;
            } while (true);
        }
        i = j;
        if (d != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = i;
        if (!e.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(4, e);
        }
        i = j;
        if (f != 0)
        {
            i = j + CodedOutputByteBufferNano.f(5, f);
        }
        i += com.google.protobuf.nano.f.a(dl);
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
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new py();
                a1.a(b);
                break;

            case 18: // '\022'
                int k = com.google.protobuf.nano.f.a(a1, 18);
                mn amn[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                amn = new mn[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, amn, 0, j);
                }
                for (c = amn; j < c.length - 1; j++)
                {
                    c[j] = new mn();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new mn();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = new mc();
                a1.a(d);
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 40: // '('
                f = a1.h();
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
            mn amn[] = c;
            int j = amn.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, amn[i]);
            }

        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.c(5, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
