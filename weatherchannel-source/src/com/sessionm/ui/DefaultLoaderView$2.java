// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            DefaultLoaderView

class this._cls0
    implements android.view.
{

    final DefaultLoaderView this$0;

    public void onClick(View view)
    {
        if (listener != null)
        {
            containerLayout = null;
            loaderViewStatus = null;
            listener.onCancel();
        }
    }

    ()
    {
        this$0 = DefaultLoaderView.this;
        super();
    }
}
