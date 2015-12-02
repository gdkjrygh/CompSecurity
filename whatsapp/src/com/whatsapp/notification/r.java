// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.notification;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.whatsapp.App;
import com.whatsapp.GalleryView;

// Referenced classes of package com.whatsapp.notification:
//            PopupNotification

class r
    implements Runnable
{

    final PopupNotification a;

    r(PopupNotification popupnotification)
    {
        a = popupnotification;
        super();
    }

    public void run()
    {
        View view = PopupNotification.j(a).getChildAt(PopupNotification.a(a, 0));
        TranslateAnimation translateanimation;
        int i;
        if (App.aR())
        {
            i = 1;
        } else
        {
            i = -1;
        }
        translateanimation = new TranslateAnimation((i * -view.getWidth()) / 2, 0.0F, 0.0F, 0.0F);
        translateanimation.setDuration(PopupNotification.h());
        translateanimation.setFillAfter(true);
        view.startAnimation(translateanimation);
    }
}
