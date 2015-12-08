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
//            un, uj, fk, up, 
//            uo, ui, ur, um, 
//            uq

public final class uk extends b
{

    public static final uk a[] = new uk[0];
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public un f;
    public uj g;
    public fk h;
    public up i;
    public uo j;
    public ui k;
    public ur l;
    public um m;
    public uq n;

    public uk()
    {
        b = false;
        c = false;
        d = false;
        e = false;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
    }

    public final int a()
    {
        int j1 = 0;
        if (b)
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i1 = j1;
        if (c)
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
        if (g != null)
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
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(13, n);
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

            case 8: // '\b'
                b = a1.e();
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
                f = new un();
                a1.a(f);
                break;

            case 50: // '2'
                g = new uj();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new up();
                a1.a(i);
                break;

            case 74: // 'J'
                j = new uo();
                a1.a(j);
                break;

            case 82: // 'R'
                k = new ui();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = new ur();
                a1.a(l);
                break;

            case 98: // 'b'
                m = new um();
                a1.a(m);
                break;

            case 106: // 'j'
                n = new uq();
                a1.a(n);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b)
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
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(12, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(13, n);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
