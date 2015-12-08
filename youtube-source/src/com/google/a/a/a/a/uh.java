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
//            sx

public final class uh extends b
{

    public static final uh a[] = new uh[0];
    public String b;
    public String c;
    public long d;
    public boolean e;
    public String f[];
    public String g;
    public boolean h;
    public String i;
    public boolean j;
    public boolean k;
    public sx l;

    public uh()
    {
        b = "";
        c = "";
        d = 0L;
        e = false;
        f = f.j;
        g = "";
        h = false;
        i = "";
        j = false;
        k = false;
        l = null;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, c);
        }
        j1 = i1;
        if (d != 0L)
        {
            j1 = i1 + CodedOutputByteBufferNano.c(16, d);
        }
        i1 = j1;
        if (e)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(17, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1;
            if (f.length > 0)
            {
                String as[] = f;
                int l1 = as.length;
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(as[j1]);
                }

                j1 = i1 + k1 + f.length * 2;
            }
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(19, g);
        }
        j1 = i1;
        if (h)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(20, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(21, i);
        }
        j1 = i1;
        if (j)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(22, j);
        }
        i1 = j1;
        if (k)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(24, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(25, l);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = a1.f();
                break;

            case 122: // 'z'
                c = a1.f();
                break;

            case 128: 
                d = a1.b();
                break;

            case 136: 
                e = a1.e();
                break;

            case 146: 
                int k1 = com.google.protobuf.nano.f.a(a1, 146);
                int j1 = f.length;
                String as[] = new String[k1 + j1];
                System.arraycopy(f, 0, as, 0, j1);
                for (f = as; j1 < f.length - 1; j1++)
                {
                    f[j1] = a1.f();
                    a1.a();
                }

                f[j1] = a1.f();
                break;

            case 154: 
                g = a1.f();
                break;

            case 160: 
                h = a1.e();
                break;

            case 170: 
                i = a1.f();
                break;

            case 176: 
                j = a1.e();
                break;

            case 192: 
                k = a1.e();
                break;

            case 202: 
                l = new sx();
                a1.a(l);
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(15, c);
        }
        if (d != 0L)
        {
            codedoutputbytebuffernano.a(16, d);
        }
        if (e)
        {
            codedoutputbytebuffernano.a(17, e);
        }
        if (f != null)
        {
            String as[] = f;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(18, as[i1]);
            }

        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(19, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(20, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(21, i);
        }
        if (j)
        {
            codedoutputbytebuffernano.a(22, j);
        }
        if (k)
        {
            codedoutputbytebuffernano.a(24, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(25, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
