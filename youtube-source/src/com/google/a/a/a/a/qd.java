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

public final class qd extends b
{

    public static final qd a[] = new qd[0];
    public int b;
    public byte c[][];
    public ve d[];
    public byte e[];
    public String f;

    public qd()
    {
        b = 0;
        c = f.k;
        d = com.google.a.a.a.a.ve.a;
        e = f.l;
        f = "";
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                byte abyte0[][] = c;
                int i1 = abyte0.length;
                i = 0;
                int k = 0;
                for (; i < i1; i++)
                {
                    k += CodedOutputByteBufferNano.a(abyte0[i]);
                }

                i = j + k + c.length * 1;
            }
        }
        j = i;
        if (d != null)
        {
            ve ave[] = d;
            int j1 = ave.length;
            int l = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (l >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, ave[l]);
                l++;
            } while (true);
        }
        i = j;
        if (!Arrays.equals(e, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
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

            case 8: // '\b'
                b = a1.d();
                break;

            case 18: // '\022'
                int l = com.google.protobuf.nano.f.a(a1, 18);
                int j = c.length;
                byte abyte0[][] = new byte[l + j][];
                System.arraycopy(c, 0, abyte0, 0, j);
                for (c = abyte0; j < c.length - 1; j++)
                {
                    c[j] = a1.g();
                    a1.a();
                }

                c[j] = a1.g();
                break;

            case 26: // '\032'
                int i1 = com.google.protobuf.nano.f.a(a1, 26);
                ve ave[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                ave = new ve[i1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, ave, 0, k);
                }
                for (d = ave; k < d.length - 1; k++)
                {
                    d[k] = new ve();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new ve();
                a1.a(d[k]);
                break;

            case 34: // '"'
                e = a1.g();
                break;

            case 42: // '*'
                f = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            byte abyte0[][] = c;
            int k = abyte0.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(2, abyte0[i]);
            }

        }
        if (d != null)
        {
            ve ave[] = d;
            int l = ave.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(3, ave[j]);
            }

        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
