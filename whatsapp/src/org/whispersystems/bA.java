// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;


// Referenced classes of package org.whispersystems:
//            h, a0, bZ, a1, 
//            U, bB, bD, bM, 
//            ad, X, Q, aW, 
//            b9, aB, al, K, 
//            c, T, ak, bW, 
//            a_, ae, bs, e, 
//            ah, i, R

public class bA
{

    private static final String d;
    private static final String z[];
    private final T a;
    private final bB b;
    private final long c;
    private final Q e;
    private final X f;
    private final int g;

    public bA(T t, Q q, bB bb, X x, long l, int j)
    {
        a = t;
        e = q;
        b = bb;
        f = x;
        c = l;
        g = j;
    }

    private U a(bZ bz, h h1)
    {
        ad ad1;
label0:
        {
            if (bz.a(h1.d(), h1.c().a()))
            {
                a1.a(d, z[0]);
                return U.c();
            }
            i j = b.a(h1.g()).b();
            ad1 = bM.b();
            ad1.a(h1.c()).a(h1.h()).a(f.a()).a(j).b(j);
            if (h1.e().b())
            {
                ad1.a(U.b(e.b(((Integer)h1.e().a()).intValue()).c()));
                if (!b9.a)
                {
                    break label0;
                }
            }
            ad1.a(U.c());
        }
        if (!bz.d())
        {
            bz.b();
        }
        aB.a(bz.e(), h1.d(), ad1.a());
        bz.e().a(f.b());
        bz.e().d(h1.b());
        bz.e().a(h1.c().a());
        if (h1.e().b() && ((Integer)h1.e().a()).intValue() != K.a)
        {
            return h1.e();
        } else
        {
            return U.c();
        }
    }

    private U c(bZ bz, h h1)
    {
        if (!h1.e().b())
        {
            throw new c(z[2]);
        }
        if (!e.a(((Integer)h1.e().a()).intValue()) && a.a(c, g))
        {
            a1.a(d, z[1]);
            return U.c();
        }
        i j = e.b(((Integer)h1.e().a()).intValue()).c();
        ad ad1 = bM.b();
        ad1.a(f.a()).a(j).b(j).a(U.c()).a(h1.h()).a(h1.c());
        if (!bz.d())
        {
            bz.b();
        }
        aB.a(bz.e(), h1.d(), ad1.a());
        bz.e().a(f.b());
        bz.e().d(h1.b());
        bz.e().a(h1.c().a());
        if (((Integer)h1.e().a()).intValue() != K.a)
        {
            return h1.e();
        } else
        {
            return U.c();
        }
    }

    public void a(bW bw)
    {
        byte byte1;
        boolean flag;
        boolean flag1;
        byte1 = 3;
        flag = false;
        flag1 = b9.a;
        Object obj1 = ak.f;
        obj1;
        JVM INSTR monitorenter ;
        if (!f.b(c, bw.d()))
        {
            throw new a_();
        }
        break MISSING_BLOCK_LABEL_53;
        bw;
        obj1;
        JVM INSTR monitorexit ;
        throw bw;
        if (bw.g() != null && !bs.a(bw.d().a(), bw.g().a(), bw.e()))
        {
            throw new b9(z[4]);
        }
        if (bw.g() == null && bw.c() == null)
        {
            throw new b9(z[3]);
        }
        U u;
        Object obj;
        U u1;
        bZ bz;
        i j;
        ah ah1;
        ah ah2;
        byte byte0;
        if (bw.g() != null)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        bz = a.b(c, g);
        j = bs.a();
        if (byte0 == 0) goto _L2; else goto _L1
_L1:
        obj = bw.g();
_L5:
        u1 = U.a(bw.c());
        if (!u1.b()) goto _L4; else goto _L3
_L3:
        u = U.b(Integer.valueOf(bw.b()));
_L6:
        ah1 = org.whispersystems.e.g();
        ah2 = ah1.a(j).a(f.a()).a(bw.d()).a(((a0) (obj))).b(((a0) (obj)));
        if (byte0 == 0)
        {
            break MISSING_BLOCK_LABEL_435;
        }
        obj = u1;
_L7:
        ah2.a(((U) (obj)));
        if (!bz.d())
        {
            bz.b();
        }
        obj = bz.e();
        if (byte0 != 0)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 2;
        }
        aB.a(((al) (obj)), byte0, ah1.a());
        bz.e().a(u, bw.f(), j.a());
        bz.e().a(f.b());
        bz.e().d(bw.a());
        bz.e().a(j.a().a());
        a.a(c, g, bz);
        f.a(c, bw.d());
        obj1;
        JVM INSTR monitorexit ;
        if (flag1)
        {
            if (!R.A)
            {
                flag = true;
            }
            R.A = flag;
        }
        return;
_L2:
        obj = bw.c();
          goto _L5
_L4:
        u = U.c();
          goto _L6
        obj = U.c();
          goto _L7
    }

    U b(bZ bz, h h1)
    {
        ae ae1;
        int j;
        boolean flag;
        flag = b9.a;
        j = h1.d();
        ae1 = h1.h();
        if (!f.b(c, ae1))
        {
            throw new a_();
        }
        j;
        JVM INSTR tableswitch 2 3: default 68
    //                   2 99
    //                   3 111;
           goto _L1 _L2 _L3
_L1:
        throw new AssertionError((new StringBuilder()).append(z[5]).append(j).toString());
_L2:
        U u;
        u = c(bz, h1);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        u = a(bz, h1);
        if (flag) goto _L1; else goto _L4
_L4:
        f.a(c, ae1);
        return u;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[6];
        obj = "\020^\006\0259gZM\0219&_XC/\"OT\023|&\033R\006/4RN\r|!TSC(/RRC\nt\033L\006/4ZF\006pgWD\027(.UFC>2UE\0179#\033L\006/4ZF\006|!ZM\017|3SS\f) S\017Mr";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "\020^\006\0259gZM\0219&_XC,5TB\006/4^EC(/^\001\023.\"PD\032|7ZS\027|(]\001\0274.H\0015ngHD\020/.TOO|+^U\0275)\\\001\001))_M\0068gVD\020/&\\DC:&WMC(/IN\026;/\025\017M";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "\021\t\001\01694H@\0049gID\022).ID\020|(UDC(.VDC,5^J\006%gREB";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "\005TU\013|4RF\r9#\033@\r8gNO\0205 UD\007|7ID\b9>H\001\002.\"\033@\001/\"UUB";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "\016UW\0020._\001\0205 U@\027)5^\001\f2g_D\0255$^\001\b9>\032";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "\022UJ\r30U\001\02595HH\f2}\033";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                z = as;
                d = org/whispersystems/bA.getSimpleName();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 224
    //                   0 247
    //                   1 254
    //                   2 261
    //                   3 268;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_268;
_L3:
        byte byte1 = 92;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 71;
          goto _L9
_L5:
        byte1 = 59;
          goto _L9
_L6:
        byte1 = 33;
          goto _L9
        byte1 = 99;
          goto _L9
    }
}
