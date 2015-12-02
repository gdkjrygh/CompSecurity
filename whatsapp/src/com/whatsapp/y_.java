// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            TouchImageView

class y_ extends Handler
{

    final TouchImageView a;

    y_(TouchImageView touchimageview)
    {
        a = touchimageview;
        super();
    }

    public void handleMessage(Message message)
    {
        if (System.currentTimeMillis() - 45L >= TouchImageView.a(a))
        {
            TouchImageView.o = 2;
            TouchImageView.r = -1F;
        }
    }
}
