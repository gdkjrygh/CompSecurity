// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            VoipActivity

class df
    implements Runnable
{

    final VoipActivity a;

    df(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void run()
    {
        TextView textview = (TextView)a.findViewById(0x7f0b02de);
        AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
        alphaanimation.setDuration(400L);
        textview.setAnimation(alphaanimation);
        textview.setVisibility(4);
    }
}
