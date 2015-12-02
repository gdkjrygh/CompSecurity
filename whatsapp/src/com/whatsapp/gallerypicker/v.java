// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImageGallery, ai, at

class v extends ContentObserver
{

    private static final String z;
    final ImageGallery a;

    v(ImageGallery imagegallery, Handler handler)
    {
        a = imagegallery;
        super(handler);
    }

    public boolean deliverSelfNotifications()
    {
        return true;
    }

    public void onChange(boolean flag)
    {
        Log.i((new StringBuilder()).append(z).append(flag).toString());
        if (ImageGallery.a(a) != null)
        {
            ImageGallery.a(a).a();
            ImageGallery.a(a, ImageGallery.a(a).d());
        }
        ImageGallery.c(a).notifyDataSetChanged();
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\b|dt\000\006pi\177\000\023h*|\013\002yd}\002\0041".toCharArray();
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
    //                   3 103;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_103;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 101;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 97;
          goto _L8
_L3:
        byte0 = 17;
          goto _L8
_L4:
        byte0 = 5;
          goto _L8
        byte0 = 19;
          goto _L8
    }
}
