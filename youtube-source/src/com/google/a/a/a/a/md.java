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
//            lz

public final class md extends b
{

    public static final md a[] = new md[0];
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public lz g;

    public md()
    {
        b = "";
        c = 0;
        d = 0;
        e = 0;
        f = "";
        g = null;
    }

    public final int a()
    {
        int j = 0;
        if (!b.equals(""))
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (c != 0)
        {
            i = j + CodedOutputByteBufferNano.f(2, c);
        }
        j = i;
        if (d != 0)
        {
            j = i + CodedOutputByteBufferNano.f(3, d);
        }
        i = j;
        if (e != 0)
        {
            i = j + CodedOutputByteBufferNano.d(5, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(7, g);
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
                b = a1.f();
                break;

            case 16: // '\020'
                c = a1.h();
                break;

            case 24: // '\030'
                d = a1.h();
                break;

            case 40: // '('
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6)
                {
                    e = j;
                } else
                {
                    e = 0;
                }
                break;

            case 50: // '2'
                f = a1.f();
                break;

            case 58: // ':'
                g = new lz();
                a1.a(g);
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
        if (c != 0)
        {
            codedoutputbytebuffernano.c(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.c(3, d);
        }
        if (e != 0)
        {
            codedoutputbytebuffernano.a(5, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(6, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
