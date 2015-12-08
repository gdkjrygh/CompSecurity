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
//            ak, sx, fk, kz, 
//            fn

public final class fm extends b
{

    public static final fm a[] = new fm[0];
    public String b;
    public sx c;
    public fk d;
    public fk e;
    public kz f;
    public String g;
    public fk h;
    public fn i;
    public ak j[];
    public ak k[];
    public byte l[];

    public fm()
    {
        b = "";
        c = null;
        d = null;
        e = null;
        f = null;
        g = "";
        h = null;
        i = null;
        j = com.google.a.a.a.a.ak.a;
        k = com.google.a.a.a.a.ak.a;
        l = f.l;
    }

    public final int a()
    {
        boolean flag = false;
        int i1;
        int j1;
        int k1;
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
            j1 = i1 + CodedOutputByteBufferNano.b(4, d);
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
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(7, g);
        }
        k1 = i1;
        if (h != null)
        {
            k1 = i1 + CodedOutputByteBufferNano.b(9, h);
        }
        j1 = k1;
        if (i != null)
        {
            j1 = k1 + CodedOutputByteBufferNano.b(11, i);
        }
        i1 = j1;
        if (j != null)
        {
            ak aak[] = j;
            int j2 = aak.length;
            int l1 = 0;
            do
            {
                i1 = j1;
                if (l1 >= j2)
                {
                    break;
                }
                i1 = CodedOutputByteBufferNano.b(12, aak[l1]);
                l1++;
                j1 = i1 + j1;
            } while (true);
        }
        j1 = i1;
        if (k != null)
        {
            ak aak1[] = k;
            int k2 = aak1.length;
            int i2 = ((flag) ? 1 : 0);
            do
            {
                j1 = i1;
                if (i2 >= k2)
                {
                    break;
                }
                i1 += CodedOutputByteBufferNano.b(13, aak1[i2]);
                i2++;
            } while (true);
        }
        i1 = j1;
        if (!Arrays.equals(l, f.l))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, l);
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
                c = new sx();
                a1.a(c);
                break;

            case 34: // '"'
                d = new fk();
                a1.a(d);
                break;

            case 42: // '*'
                e = new fk();
                a1.a(e);
                break;

            case 50: // '2'
                f = new kz();
                a1.a(f);
                break;

            case 58: // ':'
                g = a1.f();
                break;

            case 74: // 'J'
                h = new fk();
                a1.a(h);
                break;

            case 90: // 'Z'
                i = new fn();
                a1.a(i);
                break;

            case 98: // 'b'
                int l1 = com.google.protobuf.nano.f.a(a1, 98);
                ak aak[];
                int j1;
                if (j == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = j.length;
                }
                aak = new ak[l1 + j1];
                if (j != null)
                {
                    System.arraycopy(j, 0, aak, 0, j1);
                }
                for (j = aak; j1 < j.length - 1; j1++)
                {
                    j[j1] = new ak();
                    a1.a(j[j1]);
                    a1.a();
                }

                j[j1] = new ak();
                a1.a(j[j1]);
                break;

            case 106: // 'j'
                int i2 = com.google.protobuf.nano.f.a(a1, 106);
                ak aak1[];
                int k1;
                if (k == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = k.length;
                }
                aak1 = new ak[i2 + k1];
                if (k != null)
                {
                    System.arraycopy(k, 0, aak1, 0, k1);
                }
                for (k = aak1; k1 < k.length - 1; k1++)
                {
                    k[k1] = new ak();
                    a1.a(k[k1]);
                    a1.a();
                }

                k[k1] = new ak();
                a1.a(k[k1]);
                break;

            case 114: // 'r'
                l = a1.g();
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
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(7, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(11, i);
        }
        if (j != null)
        {
            ak aak[] = j;
            int k1 = aak.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                codedoutputbytebuffernano.a(12, aak[i1]);
            }

        }
        if (k != null)
        {
            ak aak1[] = k;
            int l1 = aak1.length;
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                codedoutputbytebuffernano.a(13, aak1[j1]);
            }

        }
        if (!Arrays.equals(l, f.l))
        {
            codedoutputbytebuffernano.a(14, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
