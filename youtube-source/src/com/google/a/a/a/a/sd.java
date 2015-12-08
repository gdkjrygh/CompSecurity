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
//            fk, se, tn

public final class sd extends b
{

    public static final sd a[] = new sd[0];
    public fk b;
    public fk c;
    public boolean d;
    public boolean e;
    public se f;
    public int g;
    public String h;
    public boolean i;
    public fk j;
    public fk k;
    public tn l;

    public sd()
    {
        b = null;
        c = null;
        d = false;
        e = false;
        f = null;
        g = 0;
        h = "";
        i = false;
        j = null;
        k = null;
        l = null;
    }

    public final int a()
    {
        int j1 = 0;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(9, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new fk();
                a1.a(b);
                break;

            case 18: // '\022'
                c = new fk();
                a1.a(c);
                break;

            case 24: // '\030'
                d = a1.e();
                break;

            case 32: // ' '
                e = a1.e();
                break;

            case 42: // '*'
                f = new se();
                a1.a(f);
                break;

            case 48: // '0'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2)
                {
                    g = j1;
                } else
                {
                    g = 0;
                }
                break;

            case 58: // ':'
                h = a1.f();
                break;

            case 64: // '@'
                i = a1.e();
                break;

            case 74: // 'J'
                j = new fk();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new fk();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new tn();
                a1.a(l);
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
        if (g != 0)
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i)
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(9, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
