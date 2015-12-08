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
//            qt, qs, qr

public final class qq extends b
{

    public static final qq a[] = new qq[0];
    public qt b[];
    public qs c[];
    public byte d[];
    public qr e;

    public qq()
    {
        b = com.google.a.a.a.a.qt.a;
        c = com.google.a.a.a.a.qs.a;
        d = f.l;
        e = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        if (b != null)
        {
            qt aqt[] = b;
            int j1 = aqt.length;
            int l = 0;
            int j = 0;
            do
            {
                i = j;
                if (l >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(1, aqt[l]);
                l++;
                j = i + j;
            } while (true);
        } else
        {
            i = 0;
        }
        int k = i;
        if (c != null)
        {
            qs aqs[] = c;
            int k1 = aqs.length;
            int i1 = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (i1 >= k1)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, aqs[i1]);
                i1++;
            } while (true);
        }
        i = k;
        if (!Arrays.equals(d, f.l))
        {
            i = k + CodedOutputByteBufferNano.b(4, d);
        }
        k = i;
        if (e != null)
        {
            k = i + CodedOutputByteBufferNano.b(5, e);
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
                qt aqt[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                aqt = new qt[l + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, aqt, 0, j);
                }
                for (b = aqt; j < b.length - 1; j++)
                {
                    b[j] = new qt();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new qt();
                a1.a(b[j]);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                qs aqs[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                aqs = new qs[i1 + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, aqs, 0, k);
                }
                for (c = aqs; k < c.length - 1; k++)
                {
                    c[k] = new qs();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new qs();
                a1.a(c[k]);
                break;

            case 34: // '"'
                d = a1.g();
                break;

            case 42: // '*'
                e = new qr();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            qt aqt[] = b;
            int k = aqt.length;
            for (int i = 0; i < k; i++)
            {
                codedoutputbytebuffernano.a(1, aqt[i]);
            }

        }
        if (c != null)
        {
            qs aqs[] = c;
            int l = aqs.length;
            for (int j = ((flag) ? 1 : 0); j < l; j++)
            {
                codedoutputbytebuffernano.a(2, aqs[j]);
            }

        }
        if (!Arrays.equals(d, f.l))
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
