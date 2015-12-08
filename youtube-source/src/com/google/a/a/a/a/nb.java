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
//            tb

public final class nb extends b
{

    public static final nb a[] = new nb[0];
    public tb b;
    public tb c;
    public tb d;
    public tb e;
    public tb f;
    public tb g;
    public tb h;
    public tb i;
    public tb j;
    public boolean k;

    public nb()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = false;
    }

    public final int a()
    {
        int i1 = 0;
        if (b != null)
        {
            i1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int l = i1;
        if (c != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(2, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(3, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(4, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(5, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(6, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(7, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(8, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(9, j);
        }
        l = i1;
        if (k)
        {
            l = i1 + CodedOutputByteBufferNano.b(10, k);
        }
        l += com.google.protobuf.nano.f.a(dl);
        dm = l;
        return l;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, l))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new tb();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new tb();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new tb();
                a1.a(d);
                break;

            case 34: // '"'
                e = new tb();
                a1.a(e);
                break;

            case 42: // '*'
                f = new tb();
                a1.a(f);
                break;

            case 50: // '2'
                g = new tb();
                a1.a(g);
                break;

            case 58: // ':'
                h = new tb();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new tb();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new tb();
                a1.a(j);
                break;

            case 80: // 'P'
                k = a1.e();
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
        if (i != null)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
