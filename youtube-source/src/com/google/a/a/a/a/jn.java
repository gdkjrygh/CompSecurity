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
//            ak, qy, fk, kz, 
//            si, sx, jo

public final class jn extends b
{

    public static final jn a[] = new jn[0];
    public String b;
    public fk c;
    public kz d;
    public fk e;
    public fk f;
    public si g;
    public String h;
    public ak i[];
    public ak j[];
    public sx k;
    public fk l;
    public jo m;
    public byte n[];
    public qy o[];

    public jn()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = "";
        i = com.google.a.a.a.a.ak.a;
        j = com.google.a.a.a.a.ak.a;
        k = null;
        l = null;
        m = null;
        n = f.l;
        o = com.google.a.a.a.a.qy.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int i2;
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
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(5, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, g);
        }
        j1 = i1;
        if (!h.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(10, h);
        }
        i1 = j1;
        if (i != null)
        {
            ak aak[] = i;
            int j2 = aak.length;
            int k1 = 0;
            do
            {
                i1 = j1;
                if (k1 >= j2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(11, aak[k1]);
                k1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (j != null)
        {
            ak aak1[] = j;
            int k2 = aak1.length;
            int l1 = 0;
            do
            {
                j1 = i1;
                if (l1 >= k2)
                {
                    break;
                }
                j1 = CodedOutputByteBufferNano.b(12, aak1[l1]);
                l1++;
                i1 = j1 + i1;
            } while (true);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(13, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(14, l);
        }
        i2 = j1;
        if (m != null)
        {
            i2 = j1 + CodedOutputByteBufferNano.b(16, m);
        }
        i1 = i2;
        if (!Arrays.equals(n, f.l))
        {
            i1 = i2 + CodedOutputByteBufferNano.b(17, n);
        }
        i2 = i1;
        if (o != null)
        {
            qy aqy[] = o;
            int l2 = aqy.length;
            j1 = ((flag) ? 1 : 0);
            do
            {
                i2 = i1;
                if (j1 >= l2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(18, aqy[j1]);
                j1++;
            } while (true);
        }
        i1 = i2 + com.google.protobuf.nano.f.a(dl);
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
                d = new kz();
                a1.a(d);
                break;

            case 42: // '*'
                e = new fk();
                a1.a(e);
                break;

            case 50: // '2'
                f = new fk();
                a1.a(f);
                break;

            case 66: // 'B'
                g = new si();
                a1.a(g);
                break;

            case 82: // 'R'
                h = a1.f();
                break;

            case 90: // 'Z'
                int i2 = com.google.protobuf.nano.f.a(a1, 90);
                ak aak[];
                int j1;
                if (i == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = i.length;
                }
                aak = new ak[i2 + j1];
                if (i != null)
                {
                    System.arraycopy(i, 0, aak, 0, j1);
                }
                for (i = aak; j1 < i.length - 1; j1++)
                {
                    i[j1] = new ak();
                    a1.a(i[j1]);
                    a1.a();
                }

                i[j1] = new ak();
                a1.a(i[j1]);
                break;

            case 98: // 'b'
                int j2 = com.google.protobuf.nano.f.a(a1, 98);
                ak aak1[];
                int k1;
                if (j == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = j.length;
                }
                aak1 = new ak[j2 + k1];
                if (j != null)
                {
                    System.arraycopy(j, 0, aak1, 0, k1);
                }
                for (j = aak1; k1 < j.length - 1; k1++)
                {
                    j[k1] = new ak();
                    a1.a(j[k1]);
                    a1.a();
                }

                j[k1] = new ak();
                a1.a(j[k1]);
                break;

            case 106: // 'j'
                k = new sx();
                a1.a(k);
                break;

            case 114: // 'r'
                l = new fk();
                a1.a(l);
                break;

            case 130: 
                m = new jo();
                a1.a(m);
                break;

            case 138: 
                n = a1.g();
                break;

            case 146: 
                int k2 = com.google.protobuf.nano.f.a(a1, 146);
                qy aqy[];
                int l1;
                if (o == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = o.length;
                }
                aqy = new qy[k2 + l1];
                if (o != null)
                {
                    System.arraycopy(o, 0, aqy, 0, l1);
                }
                for (o = aqy; l1 < o.length - 1; l1++)
                {
                    o[l1] = new qy();
                    a1.a(o[l1]);
                    a1.a();
                }

                o[l1] = new qy();
                a1.a(o[l1]);
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
            codedoutputbytebuffernano.a(3, d);
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
            codedoutputbytebuffernano.a(8, g);
        }
        if (!h.equals(""))
        {
            codedoutputbytebuffernano.a(10, h);
        }
        if (i != null)
        {
            ak aak[] = i;
            int l1 = aak.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                codedoutputbytebuffernano.a(11, aak[i1]);
            }

        }
        if (j != null)
        {
            ak aak1[] = j;
            int i2 = aak1.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                codedoutputbytebuffernano.a(12, aak1[j1]);
            }

        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(13, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(14, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(16, m);
        }
        if (!Arrays.equals(n, f.l))
        {
            codedoutputbytebuffernano.a(17, n);
        }
        if (o != null)
        {
            qy aqy[] = o;
            int j2 = aqy.length;
            for (int k1 = ((flag) ? 1 : 0); k1 < j2; k1++)
            {
                codedoutputbytebuffernano.a(18, aqy[k1]);
            }

        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
