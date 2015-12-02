// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            i, ImageGallery, at

class f
    implements Runnable
{

    private static final String z;
    final int a;
    final i b;

    f(i j, int k)
    {
        b = j;
        a = k;
        super();
    }

    public void run()
    {
        if (!b.a)
        {
            b.b.setSupportProgressBarIndeterminateVisibility(false);
        }
        if (!b.isCancelled())
        {
            Log.i((new StringBuilder()).append(z).append(a).toString());
            ImageGallery.a(b.b, a);
            ImageGallery.c(b.b).notifyDataSetChanged();
        }
    }

    static 
    {
        char ac[];
        int j;
        int k;
        ac = "dpV\004\tj|[\017\t\177d\030\021\to|\\\006LnrB\r\0307".toCharArray();
        k = ac.length;
        j = 0;
_L7:
        char c;
        if (k <= j)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[j];
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
        byte byte0 = 108;
_L8:
        ac[j] = (char)(byte0 ^ c);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 13;
          goto _L8
_L3:
        byte0 = 29;
          goto _L8
_L4:
        byte0 = 55;
          goto _L8
        byte0 = 99;
          goto _L8
    }
}
