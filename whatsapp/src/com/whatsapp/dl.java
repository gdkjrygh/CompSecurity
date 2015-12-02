// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.whatsapp:
//            akv, aum, ak8

class dl
    implements android.view.animation.Animation.AnimationListener
{

    final akv a;

    dl(akv akv1)
    {
        a = akv1;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        animation = ak8.b(a.a.b).findViewById(0x7f0b0167);
        if (animation != null)
        {
            animation.setVisibility(0);
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
