// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.aw;

// Referenced classes of package com.whatsapp:
//            App

final class dp
    implements aw
{

    final int a;

    dp(int i)
    {
        a = i;
        super();
    }

    public int a()
    {
        return a;
    }

    public void a(ImageView imageview, Bitmap bitmap, c4 c4_1)
    {
        Bitmap bitmap1;
        int j;
        j = App.am;
        bitmap1 = bitmap;
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        int i = 0;
        c4_1.w;
        JVM INSTR tableswitch 1 3: default 44
    //                   1 80
    //                   2 85
    //                   3 94;
           goto _L3 _L4 _L5 _L6
_L3:
        bitmap1 = BitmapFactory.decodeResource(App.au.getResources(), i);
_L2:
label0:
        {
            if (bitmap1 != null)
            {
                imageview.setImageBitmap(bitmap1);
                if (j == 0)
                {
                    break label0;
                }
            }
            imageview.setImageResource(0x7f0205a3);
        }
        return;
_L4:
        if (j == 0) goto _L7; else goto _L5
_L5:
        i = 0x7f0205a0;
        if (j == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        i = 0x7f0205aa;
        continue; /* Loop/switch isn't completed */
_L7:
        i = 0x7f0205a3;
        if (true) goto _L3; else goto _L8
_L8:
    }
}
