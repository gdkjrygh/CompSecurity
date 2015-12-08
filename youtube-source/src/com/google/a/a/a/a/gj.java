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
//            gk, fk

public final class gj extends b
{

    public static final gj a[] = new gj[0];
    public String b;
    public gk c[];
    public String d;
    public byte e[];
    public fk f;

    public gj()
    {
        b = "";
        c = com.google.a.a.a.a.gk.a;
        d = "";
        e = f.l;
        f = null;
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (!b.equals(""))
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            gk agk[] = c;
            int l = agk.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(2, agk[k]);
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
            j = i + CodedOutputByteBufferNano.b(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + CodedOutputByteBufferNano.b(6, f);
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
                b = a1.f();
                break;

            case 18: // '\022'
                int k = com.google.protobuf.nano.f.a(a1, 18);
                gk agk[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                agk = new gk[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, agk, 0, j);
                }
                for (c = agk; j < c.length - 1; j++)
                {
                    c[j] = new gk();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new gk();
                a1.a(c[j]);
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 42: // '*'
                e = a1.g();
                break;

            case 50: // '2'
                f = new fk();
                a1.a(f);
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
        if (c != null)
        {
            gk agk[] = c;
            int j = agk.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(2, agk[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!Arrays.equals(e, f.l))
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
