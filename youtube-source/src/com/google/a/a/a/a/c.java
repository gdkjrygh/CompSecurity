// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            fk, sx

public final class c extends b
{

    public static final c a[] = new c[0];
    public byte b[];
    public String c;
    public fk d;
    public fk e;
    public sx f;
    public boolean g;
    public boolean h;

    public c()
    {
        b = f.l;
        c = "";
        d = null;
        e = null;
        f = null;
        g = false;
        h = false;
    }

    public final int a()
    {
        int j = 0;
        if (!Arrays.equals(b, f.l))
        {
            j = CodedOutputByteBufferNano.b(2, b) + 0;
        }
        int i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(6, f);
        }
        i = j;
        if (g)
        {
            i = j + CodedOutputByteBufferNano.b(7, g);
        }
        j = i;
        if (h)
        {
            j = i + CodedOutputByteBufferNano.b(8, h);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
        dm = i;
        return i;
    }

    public final com.google.protobuf.nano.c a(a a1)
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

            case 18: // '\022'
                b = a1.g();
                break;

            case 26: // '\032'
                c = a1.f();
                break;

            case 34: // '"'
                d = new fk();
                a1.a(d);
                break;

            case 42: // '*'
                e = new fk();
                a1.a(e);
                break;

            case 50: // '2'
                f = new sx();
                a1.a(f);
                break;

            case 56: // '8'
                g = a1.e();
                break;

            case 64: // '@'
                h = a1.e();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!Arrays.equals(b, f.l))
        {
            codedoutputbytebuffernano.a(2, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
