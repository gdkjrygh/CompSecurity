// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoUtils

static final class  extends AnimatorListenerAdapter
{

    final View val$view;

    public void onAnimationEnd(Animator animator)
    {
        val$view.setVisibility(4);
    }

    (View view1)
    {
        val$view = view1;
        super();
    }
}
