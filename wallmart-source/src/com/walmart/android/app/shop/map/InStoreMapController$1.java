// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import android.view.View;
import android.view.animation.Animation;

// Referenced classes of package com.walmart.android.app.shop.map:
//            InStoreMapController

class this._cls0
    implements android.view.animation.ener
{

    final InStoreMapController this$0;

    public void onAnimationEnd(Animation animation)
    {
        InStoreMapController.access$200(InStoreMapController.this).startAnimation(InStoreMapController.access$100(InStoreMapController.this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ()
    {
        this$0 = InStoreMapController.this;
        super();
    }
}
