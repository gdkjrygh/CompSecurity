// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.KeyEvent;

class 
    implements 
{

    private static final String z;

    private static int metaStateFilterDirectionalModifiers(int i, int j, int k, int l, int i1)
    {
        boolean flag1 = true;
        boolean flag;
        if ((j & k) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l |= i1;
        if ((j & l) != 0)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 0;
        }
        if (flag)
        {
            if (j != 0)
            {
                try
                {
                    throw new IllegalArgumentException(z);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw illegalargumentexception;
                }
            }
            l = i & ~l;
        } else
        {
            l = i;
            if (j != 0)
            {
                return i & ~k;
            }
        }
        return l;
    }

    public boolean metaStateHasModifiers(int i, int j)
    {
        return metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(normalizeMetaState(i) & 0xf7, j, 1, 64, 128), j, 2, 16, 32) == j;
    }

    public boolean metaStateHasNoModifiers(int i)
    {
        try
        {
            i = normalizeMetaState(i);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return (i & 0xf7) == 0;
    }

    public int normalizeMetaState(int i)
    {
        if ((i & 0xc0) != 0)
        {
            i |= 1;
        }
        int j = i;
        if ((i & 0x30) != 0)
        {
            j = i | 2;
        }
        return j & 0xf7;
    }

    public void startTracking(KeyEvent keyevent)
    {
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "_2zy6O4k42S'm".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
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
        byte byte0 = 87;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 61;
          goto _L8
_L3:
        byte0 = 83;
          goto _L8
_L4:
        byte0 = 30;
          goto _L8
        byte0 = 89;
          goto _L8
    }

    ()
    {
    }
}
