// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;


// Referenced classes of package com.whatsapp.util:
//            u, t

public abstract class s
{

    private static final String z;

    public s()
    {
    }

    public static s a(String s1)
    {
        if (s1.endsWith(z))
        {
            return new u(s1);
        } else
        {
            return new t(s1);
        }
    }

    public abstract int a();

    public abstract void a(int j);

    public abstract void a(android.media.MediaPlayer.OnErrorListener onerrorlistener);

    public abstract void a(android.media.MediaPlayer.OnPreparedListener onpreparedlistener);

    public abstract int b();

    public abstract void b(int j);

    public abstract void c();

    public abstract void d();

    public abstract int e();

    public abstract boolean f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "\035\002\\.Y".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c1;
        if (k <= j)
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
        byte byte0 = 42;
_L8:
        ac[j] = (char)(byte0 ^ c1);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 51;
          goto _L8
_L3:
        byte0 = 109;
          goto _L8
_L4:
        byte0 = 44;
          goto _L8
        byte0 = 91;
          goto _L8
    }
}
