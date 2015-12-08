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
//            gp, fk

public final class go extends b
{

    public static final go a[] = new go[0];
    public int b;
    public gp c[];
    public String d;
    public byte e[];
    public fk f;

    public go()
    {
        b = 0;
        c = com.google.a.a.a.a.gp.a;
        d = "";
        e = f.l;
        f = null;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b != 0)
        {
            i = CodedOutputByteBufferNano.d(2, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            gp agp[] = c;
            int l = agp.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, agp[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(5, d);
        }
        j = i;
        if (!Arrays.equals(e, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(7, e);
        }
        i = j;
        if (f != null)
        {
            i = j + CodedOutputByteBufferNano.b(8, f);
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

            case 16: // '\020'
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
                break;

            case 34: // '"'
                int l = com.google.protobuf.nano.f.a(a1, 34);
                gp agp[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                agp = new gp[l + k];
                if (c != null)
                {
                    System.arraycopy(c, 0, agp, 0, k);
                }
                for (c = agp; k < c.length - 1; k++)
                {
                    c[k] = new gp();
                    a1.a(c[k]);
                    a1.a();
                }

                c[k] = new gp();
                a1.a(c[k]);
                break;

            case 42: // '*'
                d = a1.f();
                break;

            case 58: // ':'
                e = a1.g();
                break;

            case 66: // 'B'
                f = new fk();
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null)
        {
            gp agp[] = c;
            int j = agp.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, agp[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(5, d);
        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(7, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(8, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
