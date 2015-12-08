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
//            al, py, as, dq, 
//            ao, an, ap

public final class ar extends b
{

    public static final ar a[] = new ar[0];
    public py b;
    public String c;
    public as d;
    public dq e;
    public ao f;
    public an g;
    public al h[];
    public ap i;
    public byte j[];

    public ar()
    {
        b = null;
        c = "";
        d = null;
        e = null;
        f = null;
        g = null;
        h = com.google.a.a.a.a.al.a;
        i = null;
        j = f.l;
    }

    public final int a()
    {
        int i1 = 0;
        int k;
        int l;
        if (b != null)
        {
            l = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            l = 0;
        }
        k = l;
        if (!c.equals(""))
        {
            k = l + CodedOutputByteBufferNano.b(5, c);
        }
        l = k;
        if (d != null)
        {
            l = k + CodedOutputByteBufferNano.b(9, d);
        }
        k = l;
        if (e != null)
        {
            k = l + CodedOutputByteBufferNano.b(10, e);
        }
        l = k;
        if (f != null)
        {
            l = k + CodedOutputByteBufferNano.b(12, f);
        }
        k = l;
        if (g != null)
        {
            k = l + CodedOutputByteBufferNano.b(13, g);
        }
        l = k;
        if (h != null)
        {
            al aal[] = h;
            int j1 = aal.length;
            do
            {
                l = k;
                if (i1 >= j1)
                {
                    break;
                }
                k += CodedOutputByteBufferNano.b(14, aal[i1]);
                i1++;
            } while (true);
        }
        k = l;
        if (i != null)
        {
            k = l + CodedOutputByteBufferNano.b(15, i);
        }
        l = k;
        if (!Arrays.equals(j, f.l))
        {
            l = k + CodedOutputByteBufferNano.b(16, j);
        }
        k = l + com.google.protobuf.nano.f.a(dl);
        dm = k;
        return k;
    }

    public final c a(a a1)
    {
        do
        {
            int k = a1.a();
            switch (k)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, k))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                b = new py();
                a1.a(b);
                break;

            case 42: // '*'
                c = a1.f();
                break;

            case 74: // 'J'
                d = new as();
                a1.a(d);
                break;

            case 82: // 'R'
                e = new dq();
                a1.a(e);
                break;

            case 98: // 'b'
                f = new ao();
                a1.a(f);
                break;

            case 106: // 'j'
                g = new an();
                a1.a(g);
                break;

            case 114: // 'r'
                int i1 = com.google.protobuf.nano.f.a(a1, 114);
                al aal[];
                int l;
                if (h == null)
                {
                    l = 0;
                } else
                {
                    l = h.length;
                }
                aal = new al[i1 + l];
                if (h != null)
                {
                    System.arraycopy(h, 0, aal, 0, l);
                }
                for (h = aal; l < h.length - 1; l++)
                {
                    h[l] = new al();
                    a1.a(h[l]);
                    a1.a();
                }

                h[l] = new al();
                a1.a(h[l]);
                break;

            case 122: // 'z'
                i = new ap();
                a1.a(i);
                break;

            case 130: 
                j = a1.g();
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(5, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(9, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(10, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(12, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(13, g);
        }
        if (h != null)
        {
            al aal[] = h;
            int l = aal.length;
            for (int k = 0; k < l; k++)
            {
                codedoutputbytebuffernano.a(14, aal[k]);
            }

        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(15, i);
        }
        if (!Arrays.equals(j, f.l))
        {
            codedoutputbytebuffernano.a(16, j);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
