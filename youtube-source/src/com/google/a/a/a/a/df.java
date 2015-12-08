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
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            sx, fk, kz

public final class df extends b
{

    public static final df a[] = new df[0];
    public String b;
    public sx c;
    public fk d;
    public sx e;
    public kz f;
    public String g;
    public fk h;
    public kz i;
    public fk j;
    public fk k;
    public byte l[];

    public df()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        h = null;
        i = null;
        j = null;
        k = null;
        l = f.l;
    }

    public final int a()
    {
        int j1 = 0;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(11, k);
        }
        j1 = i1;
        if (!Arrays.equals(l, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(12, l);
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
                b = a1.f();
                break;

            case 18: // '\022'
                c = new sx();
                a1.a(c);
                break;

            case 26: // '\032'
                d = new fk();
                a1.a(d);
                break;

            case 34: // '"'
                e = new sx();
                a1.a(e);
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 50: // '2'
                g = a1.f();
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 74: // 'J'
                i = new kz();
                a1.a(i);
                break;

            case 82: // 'R'
                j = new fk();
                a1.a(j);
                break;

            case 90: // 'Z'
                k = new fk();
                a1.a(k);
                break;

            case 98: // 'b'
                l = a1.g();
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
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(6, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(9, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(10, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(11, k);
        }
        if (!Arrays.equals(l, f.l))
        {
            codedoutputbytebuffernano.a(12, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
