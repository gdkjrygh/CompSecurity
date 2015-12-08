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
//            gm, fk

public final class gl extends b
{

    public static final gl a[] = new gl[0];
    public gm b[];
    public String c;
    public String d;
    public byte e[];
    public fk f;

    public gl()
    {
        b = com.google.a.a.a.a.gm.a;
        c = "";
        d = "";
        e = f.l;
        f = null;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            gm agm[] = b;
            int l = agm.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(3, agm[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(4, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(5, d);
        }
        i = j;
        if (!Arrays.equals(e, f.l))
        {
            i = j + CodedOutputByteBufferNano.b(7, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(8, f);
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

            case 26: // '\032'
                int k = com.google.protobuf.nano.f.a(a1, 26);
                gm agm[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                agm = new gm[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, agm, 0, j);
                }
                for (b = agm; j < b.length - 1; j++)
                {
                    b[j] = new gm();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new gm();
                a1.a(b[j]);
                break;

            case 34: // '"'
                c = a1.f();
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
        if (b != null)
        {
            gm agm[] = b;
            int j = agm.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, agm[i]);
            }

        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(4, c);
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
