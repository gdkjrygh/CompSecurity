// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import de.greenrobot.event.g;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;

// Referenced classes of package de.greenrobot.event.util:
//            j, i, f

public class d
{

    private static final String z;
    private final g a;
    private final Executor b;
    private final Object c;
    private final Constructor d;

    private d(Executor executor, g g, Class class1, Object obj)
    {
        b = executor;
        a = g;
        c = obj;
        try
        {
            d = class1.getConstructor(new Class[] {
                java/lang/Throwable
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Executor executor)
        {
            throw new RuntimeException(z, executor);
        }
    }

    d(Executor executor, g g, Class class1, Object obj, i k)
    {
        this(executor, g, class1, obj);
    }

    public static d a()
    {
        return (new j(null)).a();
    }

    static Object a(d d1)
    {
        return d1.c;
    }

    static g b(d d1)
    {
        return d1.a;
    }

    public static j b()
    {
        return new j(null);
    }

    static Constructor c(d d1)
    {
        return d1.d;
    }

    public void a(f f)
    {
        b.execute(new i(this, f));
    }

    static 
    {
        char ac[];
        int k;
        int l;
        ac = "r;>FBF?wOAQ4#\nTX;$Y\027Y/$^\027\\;!O\027Uz4EYG.%_T@5%\n@].?\nXZ?wZVF;:OCQ(wEQ\024..ZR\024\016?XXC;5FR".toCharArray();
        l = ac.length;
        k = 0;
_L7:
        char c1;
        if (l <= k)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 55;
_L8:
        ac[k] = (char)(byte0 ^ c1);
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 52;
          goto _L8
_L3:
        byte0 = 90;
          goto _L8
_L4:
        byte0 = 87;
          goto _L8
        byte0 = 42;
          goto _L8
    }
}
