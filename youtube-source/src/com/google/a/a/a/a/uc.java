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
//            ud, kz

public final class uc extends b
{

    public static final uc a[] = new uc[0];
    public kz b;
    public ud c[];
    public String d;

    public uc()
    {
        b = null;
        c = com.google.a.a.a.a.ud.a;
        d = "";
    }

    public final int a()
    {
        int k = 0;
        int i;
        int j;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(2, b) + 0;
        } else
        {
            i = 0;
        }
        j = i;
        if (c != null)
        {
            ud aud[] = c;
            int l = aud.length;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(3, aud[k]);
                k++;
            } while (true);
        }
        i = j;
        if (!d.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(4, d);
        }
        i += f.a(dl);
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

            case 18: // '\022'
                b = new kz();
                a1.a(b);
                break;

            case 26: // '\032'
                int k = f.a(a1, 26);
                ud aud[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aud = new ud[k + j];
                if (c != null)
                {
                    System.arraycopy(c, 0, aud, 0, j);
                }
                for (c = aud; j < c.length - 1; j++)
                {
                    c[j] = new ud();
                    a1.a(c[j]);
                    a1.a();
                }

                c[j] = new ud();
                a1.a(c[j]);
                break;

            case 34: // '"'
                d = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (c != null)
        {
            ud aud[] = c;
            int j = aud.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(3, aud[i]);
            }

        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(4, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
