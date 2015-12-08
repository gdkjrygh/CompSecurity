// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package com.sessionm.ui:
//            DefaultLoaderView

class this._cls0
    implements Runnable
{

    final DefaultLoaderView this$0;

    public void run()
    {
        loadingAnimation.start();
    }

    rawable()
    {
        this$0 = DefaultLoaderView.this;
        super();
    }
}
