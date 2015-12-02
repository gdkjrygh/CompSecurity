// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google:
//            cR, av, fz, a3, 
//            gv, d9, dt, fa, 
//            y, bH, fn, ga

public final class bR
    implements cR
{

    private static final av a;
    private static final bR c;
    private static final String z[];
    private Map b;

    private bR()
    {
    }

    private bR(Map map)
    {
        b = map;
    }

    bR(Map map, bH bh)
    {
        this(map);
    }

    public static fz a()
    {
        return fz.a();
    }

    static Map a(bR br)
    {
        return br.b;
    }

    public static fz b(bR br)
    {
        return a().a(br);
    }

    public static bR d()
    {
        return c;
    }

    public a3 a()
    {
        Object obj;
        try
        {
            obj = a3.a(b());
            a(((gv) (obj)).b());
            obj = ((gv) (obj)).a();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(z[0], ioexception);
        }
        return ((a3) (obj));
    }

    public void a(fa fa1)
    {
        int i = d9.c;
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ((dt)entry.getValue()).b(((Integer)entry.getKey()).intValue(), fa1);
        } while (i == 0);
    }

    public int b()
    {
        int j = d9.c;
        Iterator iterator = b.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            i = ((dt)entry.getValue()).b(((Integer)entry.getKey()).intValue()) + i;
            if (j != 0)
            {
                return i;
            }
        }
        return i;
    }

    public bR b()
    {
        return c;
    }

    public fn b()
    {
        return h();
    }

    public void b(fa fa1)
    {
        int i = d9.c;
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ((dt)entry.getValue()).a(((Integer)entry.getKey()).intValue(), fa1);
        } while (i == 0);
    }

    public cR c()
    {
        return b();
    }

    public fz c()
    {
        return a().a(this);
    }

    public ga c()
    {
        return c();
    }

    public ga d()
    {
        return f();
    }

    public boolean d()
    {
        return true;
    }

    public Map e()
    {
        return b;
    }

    public byte[] e()
    {
        byte abyte0[];
        try
        {
            abyte0 = new byte[b()];
            fa fa1 = fa.a(abyte0);
            a(fa1);
            fa1.b();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(z[1], ioexception);
        }
        return abyte0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        boolean flag;
        try
        {
            flag = obj instanceof bR;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (b.equals(((bR)obj).b)) goto _L1; else goto _L3
_L3:
        return false;
    }

    public fz f()
    {
        return a();
    }

    public int g()
    {
        int j = d9.c;
        Iterator iterator = b.entrySet().iterator();
        int i = 0;
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            i = ((dt)entry.getValue()).a(((Integer)entry.getKey()).intValue()) + i;
            if (j != 0)
            {
                return i;
            }
        }
        return i;
    }

    public final av h()
    {
        return a;
    }

    public int hashCode()
    {
        return b.hashCode();
    }

    public String toString()
    {
        return y.a(this);
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "'L\026|\024\030@\036|\033\023\t\020zU\025\t&l\001\021z\020g\034\032NDa\035\006L\0235\024\032\t-Z0\fJ\001e\001\035F\n5]\007A\013`\031\020\t\np\003\021[D}\024\004Y\001{\\Z".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "'L\026|\024\030@\036|\033\023\t\020zU\025\t\006l\001\021\t\005g\007\025PDa\035\006L\0235\024\032\t-Z0\fJ\001e\001\035F\n5]\007A\013`\031\020\t\np\003\021[D}\024\004Y\001{\\Z".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 154
    //                   1 160
    //                   2 166
    //                   3 172;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_172;
_L1:
        byte0 = 117;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 116;
          goto _L7
_L3:
        byte0 = 41;
          goto _L7
_L4:
        byte0 = 100;
          goto _L7
        byte0 = 21;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            c = new bR(Collections.emptyMap());
            a = new av();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 234
    //                   1 240
    //                   2 246
    //                   3 252;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_252;
_L8:
        byte byte1 = 117;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 116;
          goto _L15
_L10:
        byte1 = 41;
          goto _L15
_L11:
        byte1 = 100;
          goto _L15
        byte1 = 21;
          goto _L15
    }
}
