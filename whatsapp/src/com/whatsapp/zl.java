// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            t2, VoipActivity

class zl
    implements t2
{

    final VoipActivity a;

    zl(VoipActivity voipactivity)
    {
        a = voipactivity;
        super();
    }

    public void a()
    {
        VoipActivity.c(a);
    }

    public void a(boolean flag)
    {
        TextView textview = (TextView)a.findViewById(0x7f0b02de);
        textview.clearAnimation();
        AlphaAnimation alphaanimation;
        int i;
        if (flag)
        {
            i = 0x7f0e03d9;
        } else
        {
            i = 0x7f0e03da;
        }
        textview.setText(i);
        textview.setVisibility(0);
        alphaanimation = new AlphaAnimation(0.0F, 1.0F);
        alphaanimation.setDuration(200L);
        textview.setAnimation(alphaanimation);
        textview.removeCallbacks(VoipActivity.b(a));
        textview.postDelayed(VoipActivity.b(a), 3000L);
    }

    public void b()
    {
        VoipActivity.f(a);
    }
}
