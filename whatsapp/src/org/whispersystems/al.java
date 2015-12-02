// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.a3;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package org.whispersystems:
//            ac, bk, b9, aw, 
//            bs, bd, a1, a2, 
//            aY, bp, ae, aK, 
//            bX, a0, U, Y, 
//            aP, a6, b0, bt, 
//            i, b8, at, Z

public class al
{

    private static final String z[];
    private ac a;

    public al()
    {
        a = ac.r().m();
    }

    public al(ac ac1)
    {
        a = ac1;
    }

    public al(al al1)
    {
        a = al1.a.x().m();
    }

    private bd b(a0 a0_1)
    {
        Iterator iterator;
        int i1;
        int j1;
        j1 = ac.H;
        iterator = a.q().iterator();
        i1 = 0;
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj = (aw)iterator.next();
        if (!bs.a(((aw) (obj)).p().f(), 0).equals(a0_1))
        {
            break MISSING_BLOCK_LABEL_84;
        }
        obj = new bd(obj, Integer.valueOf(i1));
        return ((bd) (obj));
        b9 b9_1;
        b9_1;
        a1.a(z[3], b9_1);
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        return null;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public aY a(a0 a0_1, int i1)
    {
        bd bd1;
        aw aw1;
        LinkedList linkedlist;
        Iterator iterator;
        bd1 = b(a0_1);
        aw1 = (aw)bd1.a();
        if (aw1 == null)
        {
            return null;
        }
        linkedlist = new LinkedList(aw1.q());
        iterator = linkedlist.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a0_1 = (a2)iterator.next();
        if (a0_1.c() != i1) goto _L4; else goto _L3
_L3:
        a0_1 = new aY(new SecretKeySpec(a0_1.k().f(), z[0]), new SecretKeySpec(a0_1.b().f(), z[1]), new IvParameterSpec(a0_1.g().f()), a0_1.c());
        iterator.remove();
_L6:
        aw1 = aw1.i().b().a(linkedlist).j();
        a = a.x().a(((Integer)bd1.b()).intValue(), aw1).m();
        return a0_1;
_L2:
        a0_1 = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public ae a()
    {
        if (!a.t())
        {
            return null;
        }
        ae ae1;
        try
        {
            ae1 = new ae(a.J().f(), 0);
        }
        catch (b9 b9_1)
        {
            a1.a(z[2], b9_1);
            return null;
        }
        return ae1;
    }

    public void a(int i1)
    {
        a = a.x().c(i1).m();
    }

    public void a(U u, int i1, a0 a0_1)
    {
        a0_1 = aK.i().a(i1).a(a3.a(a0_1.a()));
        if (u.b())
        {
            a0_1.b(((Integer)u.a()).intValue());
        }
        a = a.x().b(a0_1.b()).m();
    }

    public void a(Y y)
    {
        a = a.x().d(a3.a(y.a())).m();
    }

    public void a(a0 a0_1, a6 a6_1)
    {
        a6_1 = aP.l().a(a3.a(a6_1.b())).a(a6_1.d()).a();
        a0_1 = aw.s().b(a6_1).a(a3.a(a0_1.a())).j();
        a = a.x().b(a0_1).m();
        if (a.q().size() > 5)
        {
            a = a.x().b(0).m();
        }
    }

    public void a(a0 a0_1, aY ay)
    {
        a0_1 = b(a0_1);
        aw aw1 = (aw)a0_1.a();
        ay = a2.h().b(a3.a(ay.c().getEncoded())).a(a3.a(ay.b().getEncoded())).a(ay.a()).c(a3.a(ay.d().getIV())).d();
        ay = aw1.i().a(ay).j();
        a = a.x().a(((Integer)a0_1.b()).intValue(), ay).m();
    }

    public void a(a6 a6_1)
    {
        a6_1 = aP.l().a(a3.a(a6_1.b())).a(a6_1.d()).a();
        a6_1 = a.y().i().b(a6_1).j();
        a = a.x().c(a6_1).m();
    }

    public void a(ae ae1)
    {
        a = a.x().b(a3.a(ae1.b())).m();
    }

    public void a(i i1, a6 a6_1)
    {
        a6_1 = aP.l().a(a3.a(a6_1.b())).a(a6_1.d()).a();
        i1 = aw.s().a(a3.a(i1.a().a())).b(a3.a(i1.b().a())).b(a6_1).j();
        a = a.x().c(i1).m();
    }

    public void a(byte abyte0[])
    {
        a = a.x().c(a3.a(abyte0)).m();
    }

    public boolean a(a0 a0_1)
    {
        return b(a0_1) != null;
    }

    public int b()
    {
        int j1 = a.B();
        int i1 = j1;
        if (j1 == 0)
        {
            i1 = 2;
        }
        return i1;
    }

    public void b(int i1)
    {
        a = a.x().e(i1).m();
    }

    public void b(a0 a0_1, a6 a6_1)
    {
        a0_1 = b(a0_1);
        aw aw1 = (aw)a0_1.a();
        a6_1 = aP.l().a(a3.a(a6_1.b())).a(a6_1.d()).a();
        a6_1 = aw1.i().b(a6_1).j();
        a = a.x().a(((Integer)a0_1.b()).intValue(), a6_1).m();
    }

    public void b(ae ae1)
    {
        a = a.x().a(a3.a(ae1.b())).m();
    }

    public boolean b(a0 a0_1, int i1)
    {
        int j1 = ac.H;
        a0_1 = (aw)b(a0_1).a();
        if (a0_1 == null)
        {
            return false;
        }
        a0_1 = a0_1.q().iterator();
        do
        {
            if (!a0_1.hasNext())
            {
                break;
            }
            if (((a2)a0_1.next()).c() == i1)
            {
                return true;
            }
        } while (j1 == 0);
        return false;
    }

    public int c()
    {
        return a.i();
    }

    public a6 c(a0 a0_1)
    {
        a0_1 = (aw)b(a0_1).a();
        if (a0_1 == null)
        {
            return null;
        } else
        {
            return new a6(at.a(b()), a0_1.g().d().f(), a0_1.g().g());
        }
    }

    public void c(int i1)
    {
        a = a.x().a(i1).m();
    }

    public Z d()
    {
        Object obj;
        try
        {
label0:
            {
                if (a.v().a())
                {
                    obj = U.b(Integer.valueOf(a.v().f()));
                    if (ac.H == 0)
                    {
                        break label0;
                    }
                }
                obj = U.c();
            }
            obj = new Z(((U) (obj)), a.v().l(), bs.a(a.v().c().f(), 0));
        }
        catch (b9 b9_1)
        {
            throw new AssertionError(b9_1);
        }
        return ((Z) (obj));
    }

    public void d(int i1)
    {
        a = a.x().d(i1).m();
    }

    public a0 e()
    {
        a0 a0_1;
        try
        {
            a0_1 = bs.a(a.y().p().f(), 0);
        }
        catch (b9 b9_1)
        {
            throw new AssertionError(b9_1);
        }
        return a0_1;
    }

    public a6 f()
    {
        aP ap = a.y().g();
        return new a6(at.a(b()), ap.d().f(), ap.g());
    }

    public int g()
    {
        return a.m();
    }

    public Y h()
    {
        return new Y(at.a(b()), a.n().f());
    }

    public boolean i()
    {
        return a.K();
    }

    public ac j()
    {
        return a;
    }

    public void k()
    {
        a = a.x().i().m();
    }

    public int l()
    {
        return a.o();
    }

    public boolean m()
    {
        return a.h();
    }

    public byte[] n()
    {
        return a.C().f();
    }

    public i o()
    {
        return new i(e(), bs.a(a.y().o().f()));
    }

    public ae p()
    {
        ae ae1;
        try
        {
            ae1 = new ae(a.l().f(), 0);
        }
        catch (b9 b9_1)
        {
            throw new AssertionError(b9_1);
        }
        return ae1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "6\017g";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "?'U&z?\013\006p\037";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "$/G6@\030$f J\0308P\023\033";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "$/G6@\030$f J\0308P\023\033";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 176
    //                   0 197
    //                   1 203
    //                   2 209
    //                   3 215;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_215;
_L3:
        byte byte0 = 41;
_L9:
        obj[j1] = (char)(byte0 ^ c1);
        j1++;
          goto _L8
_L4:
        byte0 = 119;
          goto _L9
_L5:
        byte0 = 74;
          goto _L9
_L6:
        byte0 = 52;
          goto _L9
        byte0 = 69;
          goto _L9
    }
}
