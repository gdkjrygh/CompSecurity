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
//            jk, qy, fk

public final class fh extends b
{

    public static final fh a[] = new fh[0];
    public fk b;
    public jk c[];
    public jk d[];
    public qy e[];

    public fh()
    {
        b = null;
        c = com.google.a.a.a.a.jk.a;
        d = com.google.a.a.a.a.jk.a;
        e = com.google.a.a.a.a.qy.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int i1;
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
            jk ajk[] = c;
            int j1 = ajk.length;
            int k = 0;
            do
            {
                i = j;
                if (k >= j1)
                {
                    break;
                }
                i = CodedOutputByteBufferNano.b(2, ajk[k]);
                k++;
                j = i + j;
            } while (true);
        }
        j = i;
        if (d != null)
        {
            jk ajk1[] = d;
            int k1 = ajk1.length;
            int l = 0;
            do
            {
                j = i;
                if (l >= k1)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(3, ajk1[l]);
                l++;
                i = j + i;
            } while (true);
        }
        i1 = j;
        if (e != null)
        {
            qy aqy[] = e;
            int l1 = aqy.length;
            i = ((flag) ? 1 : 0);
            do
            {
                i1 = j;
                if (i >= l1)
                {
                    break;
                }
                j += CodedOutputByteBufferNano.b(4, aqy[i]);
                i++;
            } while (true);
        }
        i = i1 + f.a(dl);
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
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                int i1 = f.a(a1, 18);
                jk ajk[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajk = new jk[i1 + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, ajk, 0, j);
                }
                for (c = ajk; j < c.length - 1; j++)
                {
                    c[j] = new jk();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new jk();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                int j1 = f.a(a1, 26);
                jk ajk1[];
                int k;
                if (d == null)
                {
                    k = 0;
                } else
                {
                    k = d.length;
                }
                ajk1 = new jk[j1 + k];
                if (d != null)
                {
                    System.arraycopy(d, 0, ajk1, 0, k);
                }
                for (d = ajk1; k < d.length - 1; k++)
                {
                    d[k] = new jk();
                    a1.a(d[k]);
                    a1.a();
                }

                d[k] = new jk();
                a1.a(d[k]);
                break;

            case 34: // '"'
                int k1 = f.a(a1, 34);
                qy aqy[];
                int l;
                if (e == null)
                {
                    l = 0;
                } else
                {
                    l = e.length;
                }
                aqy = new qy[k1 + l];
                if (e != null)
                {
                    System.arraycopy(e, 0, aqy, 0, l);
                }
                for (e = aqy; l < e.length - 1; l++)
                {
                    e[l] = new qy();
                    a1.a(e[l]);
                    a1.a();
                }

                e[l] = new qy();
                a1.a(e[l]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            jk ajk[] = c;
            int l = ajk.length;
            for (int i = 0; i < l; i++)
            {
                codedoutputbytebuffernano.a(2, ajk[i]);
            }

        }
        if (d != null)
        {
            jk ajk1[] = d;
            int i1 = ajk1.length;
            for (int j = 0; j < i1; j++)
            {
                codedoutputbytebuffernano.a(3, ajk1[j]);
            }

        }
        if (e != null)
        {
            qy aqy[] = e;
            int j1 = aqy.length;
            for (int k = ((flag) ? 1 : 0); k < j1; k++)
            {
                codedoutputbytebuffernano.a(4, aqy[k]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
