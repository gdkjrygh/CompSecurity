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

public final class np extends b
{

    public static final np a[] = new np[0];
    public String A;
    public String B;
    public String C;
    public int D;
    public String E;
    public String F;
    public boolean G;
    public String H;
    public boolean I;
    public boolean J;
    public float K;
    public String L;
    public boolean M;
    public boolean N;
    public int O;
    public String P;
    public boolean Q;
    public String R;
    public int S;
    public String T;
    public boolean U;
    public int V;
    public String W;
    public int X;
    public String Y;
    public String Z;
    public String aa;
    public String ab;
    public String ac;
    public int ad;
    public boolean ae;
    public int af;
    public String ag;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public boolean w;
    public int x[];
    public String y;
    public int z;

    public np()
    {
        b = "";
        c = 0;
        d = "";
        e = "";
        f = "";
        g = "";
        h = 0;
        i = "";
        j = "";
        k = 0;
        l = "";
        m = "";
        n = "";
        o = false;
        p = false;
        q = false;
        r = "";
        s = "";
        t = "";
        u = "";
        v = "";
        w = false;
        x = f.e;
        y = "";
        z = 0;
        A = "";
        B = "";
        C = "";
        D = 0;
        E = "";
        F = "";
        G = false;
        H = "";
        I = false;
        J = false;
        K = 0.0F;
        L = "";
        M = false;
        N = false;
        O = 0;
        P = "";
        Q = false;
        R = "";
        S = 0;
        T = "";
        U = false;
        V = 0;
        W = "";
        X = 0;
        Y = "";
        Z = "";
        aa = "";
        ab = "";
        ac = "";
        ad = 0;
        ae = false;
        af = 0;
        ag = "";
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
        if (c != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(2, c);
        }
        j1 = i1;
        if (!d.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(3, d);
        }
        i1 = j1;
        if (!e.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(6, e);
        }
        j1 = i1;
        if (!f.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(7, f);
        }
        i1 = j1;
        if (!g.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(8, g);
        }
        j1 = i1;
        if (h != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(9, h);
        }
        i1 = j1;
        if (!i.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(14, i);
        }
        j1 = i1;
        if (!j.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(15, j);
        }
        i1 = j1;
        if (k != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(16, k);
        }
        j1 = i1;
        if (!l.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(17, l);
        }
        i1 = j1;
        if (!m.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(18, m);
        }
        j1 = i1;
        if (!n.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(19, n);
        }
        i1 = j1;
        if (o)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(20, o);
        }
        j1 = i1;
        if (p)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(21, p);
        }
        i1 = j1;
        if (q)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(22, q);
        }
        j1 = i1;
        if (!r.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(25, r);
        }
        i1 = j1;
        if (!s.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(26, s);
        }
        j1 = i1;
        if (!t.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(27, t);
        }
        i1 = j1;
        if (!u.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(29, u);
        }
        j1 = i1;
        if (!v.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(30, v);
        }
        i1 = j1;
        if (w)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(31, w);
        }
        j1 = i1;
        if (x != null)
        {
            j1 = i1;
            if (x.length > 0)
            {
                int ai[] = x;
                int l1 = ai.length;
                int k1 = 0;
                for (j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
                {
                    k1 += CodedOutputByteBufferNano.a(ai[j1]);
                }

                j1 = i1 + k1 + x.length * 2;
            }
        }
        i1 = j1;
        if (!y.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(33, y);
        }
        j1 = i1;
        if (z != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(34, z);
        }
        i1 = j1;
        if (!A.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(36, A);
        }
        j1 = i1;
        if (!B.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(37, B);
        }
        i1 = j1;
        if (!C.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(38, C);
        }
        j1 = i1;
        if (D != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(39, D);
        }
        i1 = j1;
        if (!E.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(40, E);
        }
        j1 = i1;
        if (!F.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(42, F);
        }
        i1 = j1;
        if (G)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(44, G);
        }
        j1 = i1;
        if (!H.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(45, H);
        }
        i1 = j1;
        if (I)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(46, I);
        }
        j1 = i1;
        if (J)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(47, J);
        }
        i1 = j1;
        if (K != 0.0F)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(49, K);
        }
        j1 = i1;
        if (!L.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(50, L);
        }
        i1 = j1;
        if (M)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(51, M);
        }
        j1 = i1;
        if (N)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(52, N);
        }
        i1 = j1;
        if (O != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(54, O);
        }
        j1 = i1;
        if (!P.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(55, P);
        }
        i1 = j1;
        if (Q)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(56, Q);
        }
        j1 = i1;
        if (!R.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(57, R);
        }
        i1 = j1;
        if (S != 0)
        {
            i1 = j1 + CodedOutputByteBufferNano.d(58, S);
        }
        j1 = i1;
        if (!T.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(59, T);
        }
        i1 = j1;
        if (U)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(60, U);
        }
        j1 = i1;
        if (V != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(61, V);
        }
        i1 = j1;
        if (!W.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(62, W);
        }
        j1 = i1;
        if (X != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(63, X);
        }
        i1 = j1;
        if (!Y.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(64, Y);
        }
        j1 = i1;
        if (!Z.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(65, Z);
        }
        i1 = j1;
        if (!aa.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(66, aa);
        }
        j1 = i1;
        if (!ab.equals(""))
        {
            j1 = i1 + CodedOutputByteBufferNano.b(67, ab);
        }
        i1 = j1;
        if (!ac.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(68, ac);
        }
        j1 = i1;
        if (ad != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(69, ad);
        }
        i1 = j1;
        if (ae)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(70, ae);
        }
        j1 = i1;
        if (af != 0)
        {
            j1 = i1 + CodedOutputByteBufferNano.d(71, af);
        }
        i1 = j1;
        if (!ag.equals(""))
        {
            i1 = j1 + CodedOutputByteBufferNano.b(72, ag);
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

            case 16: // '\020'
                c = a1.d();
                break;

            case 26: // '\032'
                d = a1.f();
                break;

            case 50: // '2'
                e = a1.f();
                break;

            case 58: // ':'
                f = a1.f();
                break;

            case 66: // 'B'
                g = a1.f();
                break;

            case 72: // 'H'
                h = a1.d();
                break;

            case 114: // 'r'
                i = a1.f();
                break;

            case 122: // 'z'
                j = a1.f();
                break;

            case 128: 
                k = a1.d();
                break;

            case 138: 
                l = a1.f();
                break;

            case 146: 
                m = a1.f();
                break;

            case 154: 
                n = a1.f();
                break;

            case 160: 
                o = a1.e();
                break;

            case 168: 
                p = a1.e();
                break;

            case 176: 
                q = a1.e();
                break;

            case 202: 
                r = a1.f();
                break;

            case 210: 
                s = a1.f();
                break;

            case 218: 
                t = a1.f();
                break;

            case 234: 
                u = a1.f();
                break;

            case 242: 
                v = a1.f();
                break;

            case 248: 
                w = a1.e();
                break;

            case 256: 
                int k1 = com.google.protobuf.nano.f.a(a1, 256);
                int j1 = x.length;
                int ai[] = new int[k1 + j1];
                System.arraycopy(x, 0, ai, 0, j1);
                for (x = ai; j1 < x.length - 1; j1++)
                {
                    x[j1] = a1.d();
                    a1.a();
                }

                x[j1] = a1.d();
                break;

            case 266: 
                y = a1.f();
                break;

            case 272: 
                z = a1.d();
                break;

            case 290: 
                A = a1.f();
                break;

            case 298: 
                B = a1.f();
                break;

            case 306: 
                C = a1.f();
                break;

            case 312: 
                D = a1.d();
                break;

            case 322: 
                E = a1.f();
                break;

            case 338: 
                F = a1.f();
                break;

            case 352: 
                G = a1.e();
                break;

            case 362: 
                H = a1.f();
                break;

            case 368: 
                I = a1.e();
                break;

            case 376: 
                J = a1.e();
                break;

            case 397: 
                K = Float.intBitsToFloat(a1.i());
                break;

            case 402: 
                L = a1.f();
                break;

            case 408: 
                M = a1.e();
                break;

            case 416: 
                N = a1.e();
                break;

            case 432: 
                O = a1.d();
                break;

            case 442: 
                P = a1.f();
                break;

            case 448: 
                Q = a1.e();
                break;

            case 458: 
                R = a1.f();
                break;

            case 464: 
                S = a1.d();
                break;

            case 474: 
                T = a1.f();
                break;

            case 480: 
                U = a1.e();
                break;

            case 488: 
                V = a1.d();
                break;

            case 498: 
                W = a1.f();
                break;

            case 504: 
                X = a1.d();
                break;

            case 514: 
                Y = a1.f();
                break;

            case 522: 
                Z = a1.f();
                break;

            case 530: 
                aa = a1.f();
                break;

            case 538: 
                ab = a1.f();
                break;

            case 546: 
                ac = a1.f();
                break;

            case 552: 
                ad = a1.d();
                break;

            case 560: 
                ae = a1.e();
                break;

            case 568: 
                af = a1.d();
                break;

            case 578: 
                ag = a1.f();
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
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(8, g);
        }
        if (h != 0)
        {
            codedoutputbytebuffernano.a(9, h);
        }
        if (!i.equals(""))
        {
            codedoutputbytebuffernano.a(14, i);
        }
        if (!j.equals(""))
        {
            codedoutputbytebuffernano.a(15, j);
        }
        if (k != 0)
        {
            codedoutputbytebuffernano.a(16, k);
        }
        if (!l.equals(""))
        {
            codedoutputbytebuffernano.a(17, l);
        }
        if (!m.equals(""))
        {
            codedoutputbytebuffernano.a(18, m);
        }
        if (!n.equals(""))
        {
            codedoutputbytebuffernano.a(19, n);
        }
        if (o)
        {
            codedoutputbytebuffernano.a(20, o);
        }
        if (p)
        {
            codedoutputbytebuffernano.a(21, p);
        }
        if (q)
        {
            codedoutputbytebuffernano.a(22, q);
        }
        if (!r.equals(""))
        {
            codedoutputbytebuffernano.a(25, r);
        }
        if (!s.equals(""))
        {
            codedoutputbytebuffernano.a(26, s);
        }
        if (!t.equals(""))
        {
            codedoutputbytebuffernano.a(27, t);
        }
        if (!u.equals(""))
        {
            codedoutputbytebuffernano.a(29, u);
        }
        if (!v.equals(""))
        {
            codedoutputbytebuffernano.a(30, v);
        }
        if (w)
        {
            codedoutputbytebuffernano.a(31, w);
        }
        if (x != null)
        {
            int ai[] = x;
            int j1 = ai.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                codedoutputbytebuffernano.a(32, ai[i1]);
            }

        }
        if (!y.equals(""))
        {
            codedoutputbytebuffernano.a(33, y);
        }
        if (z != 0)
        {
            codedoutputbytebuffernano.a(34, z);
        }
        if (!A.equals(""))
        {
            codedoutputbytebuffernano.a(36, A);
        }
        if (!B.equals(""))
        {
            codedoutputbytebuffernano.a(37, B);
        }
        if (!C.equals(""))
        {
            codedoutputbytebuffernano.a(38, C);
        }
        if (D != 0)
        {
            codedoutputbytebuffernano.a(39, D);
        }
        if (!E.equals(""))
        {
            codedoutputbytebuffernano.a(40, E);
        }
        if (!F.equals(""))
        {
            codedoutputbytebuffernano.a(42, F);
        }
        if (G)
        {
            codedoutputbytebuffernano.a(44, G);
        }
        if (!H.equals(""))
        {
            codedoutputbytebuffernano.a(45, H);
        }
        if (I)
        {
            codedoutputbytebuffernano.a(46, I);
        }
        if (J)
        {
            codedoutputbytebuffernano.a(47, J);
        }
        if (K != 0.0F)
        {
            codedoutputbytebuffernano.a(49, K);
        }
        if (!L.equals(""))
        {
            codedoutputbytebuffernano.a(50, L);
        }
        if (M)
        {
            codedoutputbytebuffernano.a(51, M);
        }
        if (N)
        {
            codedoutputbytebuffernano.a(52, N);
        }
        if (O != 0)
        {
            codedoutputbytebuffernano.a(54, O);
        }
        if (!P.equals(""))
        {
            codedoutputbytebuffernano.a(55, P);
        }
        if (Q)
        {
            codedoutputbytebuffernano.a(56, Q);
        }
        if (!R.equals(""))
        {
            codedoutputbytebuffernano.a(57, R);
        }
        if (S != 0)
        {
            codedoutputbytebuffernano.a(58, S);
        }
        if (!T.equals(""))
        {
            codedoutputbytebuffernano.a(59, T);
        }
        if (U)
        {
            codedoutputbytebuffernano.a(60, U);
        }
        if (V != 0)
        {
            codedoutputbytebuffernano.a(61, V);
        }
        if (!W.equals(""))
        {
            codedoutputbytebuffernano.a(62, W);
        }
        if (X != 0)
        {
            codedoutputbytebuffernano.a(63, X);
        }
        if (!Y.equals(""))
        {
            codedoutputbytebuffernano.a(64, Y);
        }
        if (!Z.equals(""))
        {
            codedoutputbytebuffernano.a(65, Z);
        }
        if (!aa.equals(""))
        {
            codedoutputbytebuffernano.a(66, aa);
        }
        if (!ab.equals(""))
        {
            codedoutputbytebuffernano.a(67, ab);
        }
        if (!ac.equals(""))
        {
            codedoutputbytebuffernano.a(68, ac);
        }
        if (ad != 0)
        {
            codedoutputbytebuffernano.a(69, ad);
        }
        if (ae)
        {
            codedoutputbytebuffernano.a(70, ae);
        }
        if (af != 0)
        {
            codedoutputbytebuffernano.a(71, af);
        }
        if (!ag.equals(""))
        {
            codedoutputbytebuffernano.a(72, ag);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
