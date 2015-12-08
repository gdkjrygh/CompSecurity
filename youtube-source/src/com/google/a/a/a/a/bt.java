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
//            kz

public final class bt extends b
{

    public static final bt a[] = new bt[0];
    public kz b;
    public String c;
    public boolean d;
    public String e;
    public int f;

    public bt()
    {
        b = null;
        c = "";
        d = false;
        e = "";
        f = 0;
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
        if (d)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (f != 0)
        {
            j = i + CodedOutputByteBufferNano.d(5, f);
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
                b = new kz();
                a1.a(b);
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 40: // '('
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2)
                {
                    f = j;
                } else
                {
                    f = 0;
                }
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
        if (d)
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
