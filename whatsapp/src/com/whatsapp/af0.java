// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.whatsapp:
//            MediaView

class af0 extends AnimatorListenerAdapter
{

    final MediaView a;

    af0(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        MediaView.a(a, false);
        MediaView.b(a, true);
    }
}
