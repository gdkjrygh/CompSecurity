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
//            sx, ob, fk, kz, 
//            s, iz

public final class op extends b
{

    public static final op a[] = new op[0];
    public String b;
    public fk c;
    public sx d[];
    public long e;
    public kz f;
    public fk g;
    public fk h;
    public fk i;
    public ob j[];
    public s k;
    public String l;
    public fk m;
    public iz n;
    public byte o[];

    public op()
    {
        b = "";
        c = null;
        d = com.google.a.a.a.a.sx.a;
        e = 0L;
        f = null;
        g = null;
        h = null;
        i = null;
        j = com.google.a.a.a.a.ob.a;
        k = null;
        l = "";
        m = null;
        n = null;
        o = f.l;
    }

    public final int a()
    {
        boolean flag = false;
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
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(2, c);
        }
        j1 = i1;
        if (d != null)
        {
            sx asx[] = d;
            int i2 = asx.length;
            int k1 = 0;
            do
            {
                j1 = i1;
                if (k1 >= i2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(3, asx[k1]);
                k1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (e != 0L)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(4, e);
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
            ob aob[] = j;
            int j2 = aob.length;
            int l1 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(9, aob[l1]);
                l1++;
            } while (true);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(10, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(11, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, n);
        }
        i1 = j1;
        if (!Arrays.equals(o, f.l))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(15, o);
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
                c = new fk();
                a1.a(c);
                break;

            case 26: // '\032'
                int l1 = com.google.protobuf.nano.f.a(a1, 26);
                sx asx[];
                int j1;
                if (d == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = d.length;
                }
                asx = new sx[l1 + j1];
                if (d != null)
                {
                    System.arraycopy(d, 0, asx, 0, j1);
                }
                for (d = asx; j1 < d.length - 1; j1++)
                {
                    d[j1] = new sx();
                    a1.a(d[j1]);
                    a1.a();
                }

                d[j1] = new sx();
                a1.a(d[j1]);
                break;

            case 32: // ' '
                e = a1.c();
                break;

            case 42: // '*'
                f = new kz();
                a1.a(f);
                break;

            case 50: // '2'
                g = new fk();
                a1.a(g);
                break;

            case 58: // ':'
                h = new fk();
                a1.a(h);
                break;

            case 66: // 'B'
                i = new fk();
                a1.a(i);
                break;

            case 74: // 'J'
                int i2 = com.google.protobuf.nano.f.a(a1, 74);
                ob aob[];
                int k1;
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                aob = new ob[i2 + k1];
                if (j != null)
                {
                    System.arraycopy(j, 0, aob, 0, k1);
                }
                for (j = aob; k1 < j.length - 1; k1++)
                {
                    j[k1] = new ob();
                    a1.a(j[k1]);
                    a1.a();
                }

                j[k1] = new ob();
                a1.a(j[k1]);
                break;

            case 82: // 'R'
                k = new s();
                a1.a(k);
                break;

            case 90: // 'Z'
                l = a1.f();
                break;

            case 106: // 'j'
                m = new fk();
                a1.a(m);
                break;

            case 114: // 'r'
                n = new iz();
                a1.a(n);
                break;

            case 122: // 'z'
                o = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        boolean flag = false;
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
            sx asx[] = d;
            int k1 = asx.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(3, asx[i1]);
            }

        }
        if (e != 0L)
        {
            codedoutputbytebuffernano.b(4, e);
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
            ob aob[] = j;
            int l1 = aob.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(9, aob[j1]);
            }

        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(10, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(11, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(13, m);
        }
        if (n != null)
        {
            codedoutputbytebuffernano.a(14, n);
        }
        if (!Arrays.equals(o, f.l))
        {
            codedoutputbytebuffernano.a(15, o);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
