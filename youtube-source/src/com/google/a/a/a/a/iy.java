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
//            jd, fk

public final class iy extends b
{

    public static final iy a[] = new iy[0];
    public jd b;
    public int c;
    public int d;
    public fk e;
    public fk f;
    public fk g;
    public int h;
    public fk i;
    public fk j;
    public fk k;
    public byte l[];
    public boolean m;

    public iy()
    {
        b = null;
        c = 0;
        d = 0;
        e = null;
        f = null;
        g = null;
        h = 0;
        i = null;
        j = null;
        k = null;
        l = f.l;
        m = false;
    }

    public final int a()
    {
        int j1 = 0;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(2, c);
        }
        j1 = i1;
        if (d != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(3, d);
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
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, g);
        }
        j1 = i1;
        if (h != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(7, h);
        }
        i1 = j1;
        if (i != null)
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
        if (!Arrays.equals(l, f.l))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, m);
        }
        i1 += com.google.protobuf.nano.f.a(dl);
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
                b = new jd();
                a1.a(b);
                break;

            case 16: // '\020'
                int j1 = a1.d();
                if (j1 == 0 || j1 == 1 || j1 == 2)
                {
                    c = j1;
                } else
                {
                    c = 0;
                }
                break;

            case 24: // '\030'
                d = a1.d();
                break;

            case 34: // '"'
                e = new fk();
                a1.a(e);
                break;

            case 42: // '*'
                f = new fk();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 56: // '8'
                h = a1.d();
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
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
                l = a1.g();
                break;

            case 104: // 'h'
                m = a1.e();
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
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
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
        if (h != 0)
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
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!Arrays.equals(l, f.l))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m)
        {
            codedoutputbytebuffernano.a(13, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
