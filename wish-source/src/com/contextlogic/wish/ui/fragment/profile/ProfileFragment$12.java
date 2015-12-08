// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.profile:
//            ProfileFragment

class this._cls0
    implements android.view.animation.Listener
{

    final ProfileFragment this$0;

    public void onAnimationEnd(Animation animation)
    {
        animation = new TranslateAnimation(0.0F, 0.0F, 0.0F, 0.0F);
        animation.setDuration(1L);
        ProfileFragment.access$1400(ProfileFragment.this).startAnimation(animation);
        animation = new android.widget.arams((int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()), (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), 80);
        animation.setMargins((int)((double)(int)TypedValue.applyDimension(1, 70F, getResources().getDisplayMetrics()) + ProfileFragment.access$1500(ProfileFragment.this) * (1.5D + (double)ProfileFragment.access$1600(ProfileFragment.this))), 0, 0, 0);
        ProfileFragment.access$1400(ProfileFragment.this).setLayoutParams(animation);
        ProfileFragment.access$1100(ProfileFragment.this).setEnabled(true);
        ProfileFragment.access$1200(ProfileFragment.this).setEnabled(true);
        ProfileFragment.access$1300(ProfileFragment.this).setEnabled(true);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
        ProfileFragment.access$1100(ProfileFragment.this).setEnabled(false);
        ProfileFragment.access$1200(ProfileFragment.this).setEnabled(false);
        ProfileFragment.access$1300(ProfileFragment.this).setEnabled(false);
    }

    ()
    {
        this$0 = ProfileFragment.this;
        super();
    }
}
