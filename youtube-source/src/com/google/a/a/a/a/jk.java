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
//            kz, sx

public final class jk extends b
{

    public static final jk a[] = new jk[0];
    public kz b;
    public String c;
    public sx d;
    public boolean e;
    public jk f[];

    public jk()
    {
        b = null;
        c = "";
        d = null;
        e = false;
        f = a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        k = i;
        if (f != null)
        {
            jk ajk[] = f;
            int l = ajk.length;
            j = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(5, ajk[j]);
                j++;
            } while (true);
        }
        i = k + com.google.protobuf.nano.f.a(dl);
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
                b = new kz();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = new sx();
                a1.a(d);
                break;

            case 32: // ' '
                e = a1.e();
                break;

            case 42: // '*'
                int k = com.google.protobuf.nano.f.a(a1, 42);
                jk ajk[];
                int j;
                if (f == null)
                {
                    j = 0;
                } else
                {
                    j = f.length;
                }
                ajk = new jk[k + j];
                if (f != null)
                {
                    System.arraycopy(f, 0, ajk, 0, j);
                }
                for (f = ajk; j < f.length - 1; j++)
                {
                    f[j] = new jk();
                    a1.a(f[j]);
                    a1.a();
                }

                f[j] = new jk();
                a1.a(f[j]);
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            jk ajk[] = f;
            int j = ajk.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(5, ajk[i]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
