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
//            ve

public final class qb extends b
{

    public static final qb a[] = new qb[0];
    public ve b;
    public ve c[];
    public String d;
    public byte e[];

    public qb()
    {
        b = null;
        c = com.google.a.a.a.a.ve.a;
        d = "";
        e = f.l;
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
            ve ave[] = c;
            int l = ave.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, ave[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, d);
        }
        j = i;
        if (!Arrays.equals(e, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(4, e);
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
                b = new ve();
                a1.a(b);
                break;

            case 18: // '\022'
                int k = f.a(a1, 18);
                ve ave[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ave = new ve[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, ave, 0, j);
                }
                for (c = ave; j < c.length - 1; j++)
                {
                    c[j] = new ve();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new ve();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
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
            ve ave[] = c;
            int j = ave.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, ave[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
