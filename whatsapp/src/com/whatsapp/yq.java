// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import com.google.android.maps.MapView;

// Referenced classes of package com.whatsapp:
//            asq, App

class yq extends Handler
{

    final MapView a;
    final asq b;

    yq(asq asq1, MapView mapview)
    {
        b = asq1;
        a = mapview;
        super();
    }

    public void handleMessage(Message message)
    {
label0:
        {
            if (asq.a(b) == asq.b(b))
            {
                asq.a(b, asq.c(b));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            asq.a(b, asq.b(b));
        }
        a.invalidate(asq.a(b).getBounds());
        sendEmptyMessageDelayed(0, 500L);
    }
}
