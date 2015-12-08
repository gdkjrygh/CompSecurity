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

public final class va extends b
{

    public static final va a[] = new va[0];
    public byte b[][];
    public ve c[];
    public byte d[];
    public String e;

    public va()
    {
        b = f.k;
        c = com.google.a.a.a.a.ve.a;
        d = f.l;
        e = "";
    }

    public final int a()
    {
        int l = 0;
        int i;
        int k;
        if (b != null && b.length > 0)
        {
            byte abyte0[][] = b;
            int i1 = abyte0.length;
            i = 0;
            int j = 0;
            for (; i < i1; i++)
            {
                j += CodedOutputByteBufferNano.a(abyte0[i]);
            }

            i = j + 0 + b.length * 1;
        } else
        {
            i = 0;
        }
        k = i;
        if (c != null)
        {
            ve ave[] = c;
            int j1 = ave.length;
            do
            {
                k = i;
                if (l >= j1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, ave[l]);
                l++;
            } while (true);
        }
        i = k;
        if (!Arrays.equals(d, f.l))
        {
            i = k + CodedOutputByteBufferNano.b(3, d);
        }
        k = i;
        if (!e.equals(""))
        {
            k = i + CodedOutputByteBufferNano.b(4, e);
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

            case 10: // '\n'
                int l = f.a(a1, 10);
                int j = b.length;
                byte abyte0[][] = new byte[l + j][];
                System.arraycopy(b, 0, abyte0, 0, j);
                for (b = abyte0; j < b.length - 1; j++)
                {
                    b[j] = a1.g();
                    a1.a();
                }

                b[j] = a1.g();
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                ve ave[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ave = new ve[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, ave, 0, k);
                }
                for (c = ave; k < c.length - 1; k++)
                {
                    c[k] = new ve();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new ve();
                a1.a(c[k]);
                break;

            case 26: // '\032'
                d = a1.g();
                break;

            case 34: // '"'
                e = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            byte abyte0[][] = b;
            int k = abyte0.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, abyte0[i]);
            }

        }
        if (c != null)
        {
            ve ave[] = c;
            int l = ave.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, ave[j]);
            }

        }
        if (!Arrays.equals(d, f.l))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
