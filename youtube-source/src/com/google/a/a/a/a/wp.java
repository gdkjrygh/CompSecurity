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
//            wq, wo, ws

public final class wp extends b
{

    public static final wp a[] = new wp[0];
    public int b;
    public wq c;
    public wo d;
    public ws e;
    public String f;
    public int g;
    public String h;

    public wp()
    {
        b = 0;
        c = null;
        d = null;
        e = null;
        f = "";
        g = 0;
        h = "";
    }

    public final int a()
    {
        int j = 0;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g != 0)
        {
            i = j + CodedOutputByteBufferNano.d(6, g);
        }
        j = i;
        if (!h.equals(""))
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
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
                break;

            case 18: // '\022'
                c = new wq();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new wo();
                a1.a(d);
                break;

            case 34: // '"'
                e = new ws();
                a1.a(e);
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 58: // ':'
                h = a1.f();
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
        if (e != null)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
