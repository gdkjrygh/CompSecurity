// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.webkit.WebView;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler

class val.webViewContainer extends AnimatorListenerAdapter
{

    final is._cls0 this$1;
    final View val$webViewContainer;

    public void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        val$webViewContainer.setTranslationX(0.0F);
        WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url before goBack() animated: ").append(WebTransitionHandler.access$600(_fld0).getUrl()).toString());
        WebTransitionHandler.access$600(_fld0).goBack();
        WLog.i(WebTransitionHandler.TAG, (new StringBuilder()).append("Url after goBack() animated: ").append(WebTransitionHandler.access$600(_fld0).getUrl()).toString());
    }

    ()
    {
        this$1 = final_;
        val$webViewContainer = View.this;
        super();
    }
}
