// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google:
//            fn, z, ge, cR, 
//            bp, dn, eL, a3, 
//            dx

public abstract class aB
    implements fn
{

    private static final z a;
    private static final String z[];

    public aB()
    {
    }

    private cR a(cR cr)
    {
        if (cr != null)
        {
            try
            {
                if (!cr.d())
                {
                    throw b(cr).a().a(cr);
                }
            }
            // Misplaced declaration of an exception variable
            catch (cR cr)
            {
                throw cr;
            }
        }
        return cr;
    }

    private ge b(cR cr)
    {
label0:
        {
            try
            {
                if (!(cr instanceof dn))
                {
                    break label0;
                }
                cr = ((dn)cr).a();
            }
            // Misplaced declaration of an exception variable
            catch (cR cr)
            {
                throw cr;
            }
            return cr;
        }
        return new ge(cr);
    }

    public cR a(a3 a3_1)
    {
        return a(a3_1, a);
    }

    public cR a(a3 a3_1, z z1)
    {
        return a(b(a3_1, z1));
    }

    public cR a(eL el)
    {
        return a(el, a);
    }

    public cR a(eL el, z z1)
    {
        return a((cR)a(el, z1));
    }

    public cR a(InputStream inputstream)
    {
        return a(inputstream, a);
    }

    public cR a(InputStream inputstream, z z1)
    {
        return a(c(inputstream, z1));
    }

    public cR a(byte abyte0[])
    {
        return a(abyte0, a);
    }

    public cR a(byte abyte0[], int i, int j, z z1)
    {
        try
        {
            abyte0 = eL.a(abyte0, i, j);
            z1 = (cR)a(((eL) (abyte0)), z1);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        abyte0.c(0);
        return z1;
        abyte0;
        throw abyte0.a(z1);
        abyte0;
        throw new RuntimeException(z[0], abyte0);
    }

    public cR a(byte abyte0[], z z1)
    {
        return b(abyte0, 0, abyte0.length, z1);
    }

    public Object a(a3 a3_1)
    {
        return a(a3_1);
    }

    public Object a(a3 a3_1, z z1)
    {
        return b(a3_1, z1);
    }

    public Object a(eL el)
    {
        return a(el);
    }

    public Object a(InputStream inputstream)
    {
        return a(inputstream);
    }

    public Object a(InputStream inputstream, z z1)
    {
        return d(inputstream, z1);
    }

    public Object a(byte abyte0[])
    {
        return a(abyte0);
    }

    public Object a(byte abyte0[], z z1)
    {
        return a(abyte0, z1);
    }

    public cR b(a3 a3_1, z z1)
    {
        try
        {
            a3_1 = a3_1.d();
            z1 = (cR)a(a3_1, z1);
        }
        // Misplaced declaration of an exception variable
        catch (a3 a3_1)
        {
            throw a3_1;
        }
        a3_1.c(0);
        return z1;
        a3_1;
        throw a3_1.a(z1);
        a3_1;
        throw new RuntimeException(z[1], a3_1);
    }

    public cR b(InputStream inputstream)
    {
        return d(inputstream, a);
    }

    public cR b(InputStream inputstream, z z1)
    {
        inputstream = eL.a(inputstream);
        z1 = (cR)a(inputstream, z1);
        try
        {
            inputstream.c(0);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw inputstream.a(z1);
        }
        return z1;
    }

    public cR b(byte abyte0[], int i, int j, z z1)
    {
        return a(a(abyte0, i, j, z1));
    }

    public Object b(a3 a3_1, z z1)
    {
        return a(a3_1, z1);
    }

    public Object b(eL el, z z1)
    {
        return a(el, z1);
    }

    public Object b(InputStream inputstream)
    {
        return b(inputstream);
    }

    public Object b(InputStream inputstream, z z1)
    {
        return a(inputstream, z1);
    }

    public cR c(InputStream inputstream, z z1)
    {
        int i;
        try
        {
            i = inputstream.read();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new bp(inputstream.getMessage());
        }
        if (i == -1)
        {
            return null;
        }
        i = eL.a(i, inputstream);
        return b(new dx(inputstream, i), z1);
    }

    public cR d(InputStream inputstream, z z1)
    {
        return a(b(inputstream, z1));
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "]5^^\001a7\037\\\032`=\037[Hm)K_Hn\"M[\021/$WH\rxp^THF\037zB\013j KS\007ap\027I\000`%S^Ha5I_\032/8^J\030j>\026\024".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "]5^^\001a7\037\\\032`=\037[HM)K_;{\"VT\017/$WH\rxp^THF\037zB\013j KS\007ap\027I\000`%S^Ha5I_\032/8^J\030j>\026\024".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 120
    //                   0 138
    //                   1 144
    //                   2 150
    //                   3 156;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_156;
_L1:
        byte0 = 104;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 15;
          goto _L7
_L3:
        byte0 = 80;
          goto _L7
_L4:
        byte0 = 63;
          goto _L7
        byte0 = 58;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            a = com.google.z.b();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 200
    //                   0 218
    //                   1 224
    //                   2 230
    //                   3 236;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_236;
_L8:
        byte byte1 = 104;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 15;
          goto _L15
_L10:
        byte1 = 80;
          goto _L15
_L11:
        byte1 = 63;
          goto _L15
        byte1 = 58;
          goto _L15
    }
}
