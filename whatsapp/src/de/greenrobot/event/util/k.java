// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.content.res.Resources;
import android.util.Log;
import de.greenrobot.event.g;

// Referenced classes of package de.greenrobot.event.util:
//            m

public class k
{

    private static final String z;
    final Resources a;
    int b;
    final int c;
    String d;
    final int e;
    final m f = new m();
    Class g;
    boolean h;
    g i;

    public k(Resources resources, int j, int l)
    {
        h = true;
        a = resources;
        c = j;
        e = l;
    }

    public int a(Throwable throwable)
    {
        Integer integer = f.b(throwable);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            Log.d(g.m, (new StringBuilder()).append(z).append(throwable).toString());
            return e;
        }
    }

    g a()
    {
        if (i != null)
        {
            return i;
        } else
        {
            return de.greenrobot.event.g.a();
        }
    }

    public k a(Class class1, int j)
    {
        f.a(class1, j);
        return this;
    }

    public void a(int j)
    {
        b = j;
    }

    public void a(g g1)
    {
        i = g1;
    }

    public void a(Class class1)
    {
        g = class1;
    }

    public void a(String s)
    {
        d = s;
    }

    public void b()
    {
        h = false;
    }

    static 
    {
        char ac[];
        int j;
        int l;
        ac = "t\034Jl\005_\020\003y\034YS\007z\006I\022\rzUH\026\031l\032O\001\tzUs7Jy\032O\035\016?\023U\001J".toCharArray();
        l = ac.length;
        j = 0;
_L7:
        char c1;
        if (l <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[j];
        j % 5;
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
        byte byte0 = 117;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 58;
          goto _L8
_L3:
        byte0 = 115;
          goto _L8
_L4:
        byte0 = 106;
          goto _L8
        byte0 = 31;
          goto _L8
    }
}
