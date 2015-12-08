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
//            ii, fi

public final class ql extends b
{

    public static final ql a[] = new ql[0];
    public ii b;
    public String c;
    public String d;
    public int e;
    public String f;
    public fi g;

    public ql()
    {
        b = null;
        c = "";
        d = "";
        e = 0;
        f = "";
        g = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != 0)
        {
            i = j + CodedOutputByteBufferNano.d(4, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(8, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(11, g);
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
                b = new ii();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 32: // ' '
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3)
                {
                    e = j;
                } else
                {
                    e = 0;
                }
                break;

            case 66: // 'B'
                f = a1.f();
                break;

            case 90: // 'Z'
                g = new fi();
                a1.a(g);
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
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(8, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(11, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
