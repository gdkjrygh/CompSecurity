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
//            hy

public final class hs extends b
{

    public static final hs a[] = new hs[0];
    public String b;
    public String c;
    public hy d;
    public String e;
    public String f;
    public int g;
    public hy h;
    public String i;
    public hy j[];
    public float k;
    public String l;
    public String m;

    public hs()
    {
        b = "";
        c = "";
        d = null;
        e = "";
        f = "";
        g = 0;
        h = null;
        i = "";
        j = com.google.a.a.a.a.hy.a;
        k = 0.0F;
        l = "";
        m = "";
    }

    public final int a()
    {
        int k1 = 0;
        int i1;
        int j1;
        if (!b.equals(""))
        {
            j1 = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j1 = 0;
        }
        i1 = j1;
        if (!c.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(4, e);
        }
        j1 = i1;
        if (!f.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(5, f);
        }
        i1 = j1;
        if (g != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(6, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, i);
        }
        j1 = i1;
        if (j != null)
        {
            hy ahy[] = j;
            int l1 = ahy.length;
            do
            {
                j1 = i1;
                if (k1 >= l1)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(9, ahy[k1]);
                k1++;
            } while (true);
        }
        i1 = j1;
        if (k != 0.0F)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (!m.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(12, m);
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
                b = a1.f();
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 26: // '\032'
                d = new hy();
                a1.a(d);
                break;

            case 34: // '"'
                e = a1.f();
                break;

            case 42: // '*'
                f = a1.f();
                break;

            case 48: // '0'
                g = a1.d();
                break;

            case 58: // ':'
                h = new hy();
                a1.a(h);
                break;

            case 66: // 'B'
                i = a1.f();
                break;

            case 74: // 'J'
                int k1 = com.google.protobuf.nano.f.a(a1, 74);
                hy ahy[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                ahy = new hy[k1 + j1];
                if (j != null)
                {
                    System.arraycopy(j, 0, ahy, 0, j1);
                }
                for (j = ahy; j1 < j.length - 1; j1++)
                {
                    j[j1] = new hy();
                    a1.a(j[j1]);
                    a1.a();
                }

                j[j1] = new hy();
                a1.a(j[j1]);
                break;

            case 85: // 'U'
                k = Float.intBitsToFloat(a1.i());
                break;

            case 90: // 'Z'
                l = a1.f();
                break;

            case 98: // 'b'
                m = a1.f();
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
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
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
        if (h != null)
        {
            codedoutputbytebuffernano.a(7, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(8, i);
        }
        if (j != null)
        {
            hy ahy[] = j;
            int j1 = ahy.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(9, ahy[i1]);
            }

        }
        if (k != 0.0F)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(12, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
