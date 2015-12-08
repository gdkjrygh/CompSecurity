// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            DefaultLoaderView

class this._cls0
    implements android.view.
{

    final DefaultLoaderView this$0;

    public void onClick(View view)
    {
        activity.runOnUiThread(new Runnable() {

            final DefaultLoaderView._cls1 this$1;

            public void run()
            {
                if (loaderViewStatus == LoaderView.LoaderViewStatus.UNAVAILABLE)
                {
                    containerLayout = null;
                    loaderViewStatus = null;
                    listener.onCancel();
                    return;
                } else
                {
                    setLoaderViewStatus(LoaderView.LoaderViewStatus.LOADING);
                    listener.onReloadStarted();
                    return;
                }
            }

            
            {
                this$1 = DefaultLoaderView._cls1.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = DefaultLoaderView.this;
        super();
    }
}
