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
//            ii

public final class wf extends b
{

    public static final wf a[] = new wf[0];
    public ii b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public boolean h;

    public wf()
    {
        b = null;
        c = "";
        d = "";
        e = "";
        f = 0;
        g = "";
        h = false;
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
            j = i + CodedOutputByteBufferNano.b(4, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(6, e);
        }
        j = i;
        if (f != 0)
        {
            j = i + CodedOutputByteBufferNano.d(7, f);
        }
        i = j;
        if (!g.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(8, g);
        }
        j = i;
        if (h)
        {
            j = i + CodedOutputByteBufferNano.b(9, h);
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

            case 10: // '\n'
                b = new ii();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 34: // '"'
                d = a1.f();
                break;

            case 50: // '2'
                e = a1.f();
                break;

            case 56: // '8'
                f = a1.d();
                break;

            case 66: // 'B'
                g = a1.f();
                break;

            case 72: // 'H'
                h = a1.e();
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
            codedoutputbytebuffernano.a(4, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(9, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
