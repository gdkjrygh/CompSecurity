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
//            gw, fk

public final class gv extends b
{

    public static final gv a[] = new gv[0];
    public gw b[];
    public fk c;
    public byte d[];

    public gv()
    {
        b = com.google.a.a.a.a.gw.a;
        c = null;
        d = f.l;
    }

    public final int a()
    {
        int j = 0;
        int i = 0;
        if (b != null)
        {
            gw agw[] = b;
            int l = agw.length;
            int k = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    break;
                }
                j = CodedOutputByteBufferNano.b(1, agw[k]);
                k++;
                i = j + i;
            } while (true);
        }
        i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(3, c);
        }
        j = i;
        if (!Arrays.equals(d, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(4, d);
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
                int k = f.a(a1, 10);
                gw agw[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                agw = new gw[k + j];
                if (b != null)
                {
                    System.arraycopy(b, 0, agw, 0, j);
                }
                for (b = agw; j < b.length - 1; j++)
                {
                    b[j] = new gw();
                    a1.a(b[j]);
                    a1.a();
                }

                b[j] = new gw();
                a1.a(b[j]);
                break;

            case 26: // '\032'
                c = new fk();
                a1.a(c);
                break;

            case 34: // '"'
                d = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            gw agw[] = b;
            int j = agw.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, agw[i]);
            }

        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (!Arrays.equals(d, f.l))
        {
            codedoutputbytebuffernano.a(4, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
