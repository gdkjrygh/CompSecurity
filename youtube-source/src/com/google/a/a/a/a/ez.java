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
//            kz, sx, fk

public final class ez extends b
{

    public static final ez a[] = new ez[0];
    public long b;
    public long c;
    public String d;
    public String e;
    public kz f;
    public sx g;
    public fk h;

    public ez()
    {
        b = 0L;
        c = 0L;
        d = "";
        e = "";
        f = null;
        g = null;
        h = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != 0L)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (c != 0L)
        {
            i = j + CodedOutputByteBufferNano.d(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(6, g);
        }
        j = i;
        if (h != null)
        {
            j = i + CodedOutputByteBufferNano.b(7, h);
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

            case 8: // '\b'
                b = a1.c();
                break;

            case 16: // '\020'
                c = a1.c();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 50: // '2'
                g = new sx();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0L)
        {
            codedoutputbytebuffernano.b(1, b);
        }
        if (c != 0L)
        {
            codedoutputbytebuffernano.b(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
