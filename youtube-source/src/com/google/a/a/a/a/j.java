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
//            he, wm

public final class j extends b
{

    public static final j a[] = new j[0];
    public int b;
    public he c;
    public wm d;
    public String e;
    public int f;

    public j()
    {
        b = 0;
        c = null;
        d = null;
        e = "";
        f = 0;
    }

    public final int a()
    {
        int k = 0;
        if (b != 0)
        {
            k = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = k;
        if (c != null)
        {
            i = k + CodedOutputByteBufferNano.b(2, c);
        }
        k = i;
        if (d != null)
        {
            k = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = k;
        if (!e.equals(""))
        {
            i = k + CodedOutputByteBufferNano.b(4, e);
        }
        k = i;
        if (f != 0)
        {
            k = i + CodedOutputByteBufferNano.d(5, f);
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

            case 8: // '\b'
                int k = a1.d();
                if (k == 0 || k == 1 || k == 2)
                {
                    b = k;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = new he();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new wm();
                a1.a(d);
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 40: // '('
                f = a1.d();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
