// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

// Referenced classes of package com.whatsapp:
//            aum, dl

class akv
    implements Runnable
{

    final aum a;

    akv(aum aum1)
    {
        a = aum1;
        super();
    }

    public void run()
    {
        a.a.setVisibility(8);
        TranslateAnimation translateanimation = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 0.0F, 1, 1.0F);
        translateanimation.setAnimationListener(new dl(this));
        translateanimation.setDuration(200L);
        a.a.startAnimation(translateanimation);
    }
}
