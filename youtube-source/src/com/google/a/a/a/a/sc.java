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

public final class sc extends b
{

    public static final sc a[] = new sc[0];
    public String b;
    public boolean c;
    public boolean d;
    public boolean e;
    public kz f;
    public boolean g;

    public sc()
    {
        b = "";
        c = false;
        d = false;
        e = false;
        f = null;
        g = false;
    }

    public final int a()
    {
        int j = 0;
        if (!b.equals(""))
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (c)
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (d)
        {
            j = i + CodedOutputByteBufferNano.b(3, d);
        }
        i = j;
        if (e)
        {
            i = j + CodedOutputByteBufferNano.b(4, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(5, f);
        }
        i = j;
        if (g)
        {
            i = j + CodedOutputByteBufferNano.b(6, g);
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
                c = a1.e();
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 32: // ' '
                e = a1.e();
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 48: // '0'
                g = a1.e();
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
        if (c)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (e)
        {
            codedoutputbytebuffernano.a(4, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if (g)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
