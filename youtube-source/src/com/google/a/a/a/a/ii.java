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
//            ct, tx, bg, pv, 
//            cs, su, o

public final class ii extends b
{

    public static final ii a[] = new ii[0];
    public ct b;
    public tx c;
    public bg d;
    public pv e;
    public cs f;
    public su g;
    public ct h;
    public o i;

    public ii()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
    }

    public final int a()
    {
        int k = 0;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(4, d);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + CodedOutputByteBufferNano.b(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + CodedOutputByteBufferNano.b(8, h);
        }
        j = k;
        if (i != null)
        {
            j = k + CodedOutputByteBufferNano.b(9, i);
        }
        j += com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
    }

    public final c a(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new ct();
                a1.a(b);
                break;

            case 26: // '\032'
                c = new tx();
                a1.a(c);
                break;

            case 34: // '"'
                d = new bg();
                a1.a(d);
                break;

            case 42: // '*'
                e = new pv();
                a1.a(e);
                break;

            case 50: // '2'
                f = new cs();
                a1.a(f);
                break;

            case 58: // ':'
                g = new su();
                a1.a(g);
                break;

            case 66: // 'B'
                h = new ct();
                a1.a(h);
                break;

            case 74: // 'J'
                i = new o();
                a1.a(i);
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
        if (c != null)
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
        if (g != null)
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(8, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
