// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

class val.imageView extends AnimatorListenerAdapter
{

    final val.imageView this$1;
    final ImageView val$imageView;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        cess._mth802(this._cls1.this, true);
        cess._mth900(this._cls1.this);
        WebTransitionHandler.access$400(_fld0).setVisibility(4);
        WebTransitionHandler.access$400(_fld0).setTranslationX(0.0F);
        val$imageView.setImageBitmap(null);
    }

    ()
    {
        this$1 = final_;
        val$imageView = ImageView.this;
        super();
    }
}
