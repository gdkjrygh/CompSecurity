// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.whatsapp:
//            MediaView

class au6 extends AnimatorListenerAdapter
{

    final Runnable a;
    final MediaView b;

    au6(MediaView mediaview, Runnable runnable)
    {
        b = mediaview;
        a = runnable;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.run();
    }
}
