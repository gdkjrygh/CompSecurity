// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.whispersystems;

import com.google.a3;
import com.google.bp;

// Referenced classes of package org.whispersystems:
//            aO, a7, aC, a0, 
//            ae, bn, U, aa, 
//            b9, P, d, aZ, 
//            bY, bs, R

public class h
    implements aO
{

    private static final String z[];
    private final a0 a;
    private final ae b;
    private final byte c[];
    private final bn d;
    private final int e;
    private final int f;
    private final U g;
    private final int h;

    public h(int i, int j, U u, int k, a0 a0_1, ae ae1, bn bn1)
    {
        e = i;
        h = j;
        g = u;
        f = k;
        a = a0_1;
        b = ae1;
        d = bn1;
        a0_1 = a7.l().a(k).b(a3.a(a0_1.a())).a(a3.a(ae1.b())).c(a3.a(bn1.b())).b(j);
        if (u.b())
        {
            a0_1.c(((Integer)u.a()).intValue());
        }
        byte byte0 = aa.a(e, 3);
        u = a0_1.d().e();
        c = aa.a(new byte[][] {
            new byte[] {
                byte0
            }, u
        });
    }

    public h(byte abyte0[])
    {
        int j;
        j = d.a;
        super();
        e = aa.a(abyte0[0]);
        if (e > 3)
        {
            throw new aZ((new StringBuilder()).append(z[0]).append(e).toString());
        }
          goto _L1
_L3:
        throw new bY(abyte0);
_L1:
        a7 a7_1 = a7.a(a3.a(abyte0, 1, abyte0.length - 1));
        boolean flag;
        if (e != 2)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        flag = a7_1.i();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        int i = e;
        if (i != 3)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        flag = a7_1.j();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag = a7_1.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag = a7_1.q();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        flag = a7_1.o();
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        throw new bY(z[1]);
        abyte0;
        try
        {
            throw abyte0;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[]) { }
        if (true) goto _L3; else goto _L2
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
        abyte0;
        throw abyte0;
_L2:
        c = abyte0;
        h = a7_1.m();
        if (!a7_1.i()) goto _L5; else goto _L4
_L4:
        abyte0 = U.b(Integer.valueOf(a7_1.f()));
_L6:
        g = abyte0;
        if (!a7_1.j())
        {
            break MISSING_BLOCK_LABEL_333;
        }
        i = a7_1.c();
_L7:
        f = i;
        a = bs.a(a7_1.e().f(), 0);
        b = new ae(bs.a(a7_1.g().f(), 0));
        d = new bn(a7_1.d().f());
        try
        {
            if (R.A)
            {
                d.a = j + 1;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        abyte0;
        throw abyte0;
_L5:
        abyte0 = U.c();
          goto _L6
        abyte0;
        throw abyte0;
        i = -1;
          goto _L7
    }

    public int a()
    {
        return 3;
    }

    public int b()
    {
        return h;
    }

    public byte[] b()
    {
        return c;
    }

    public a0 c()
    {
        return a;
    }

    public int d()
    {
        return e;
    }

    public U e()
    {
        return g;
    }

    public bn f()
    {
        return d;
    }

    public int g()
    {
        return f;
    }

    public ae h()
    {
        return b;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "FM\tR\033dMBJ\021aP\013S\032)\003";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "ZM\001S\031cO\007H\0213N\007O\007rD\007\022";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 116;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 19;
          goto _L9
_L5:
        byte0 = 35;
          goto _L9
_L6:
        byte0 = 98;
          goto _L9
        byte0 = 60;
          goto _L9
    }
}
