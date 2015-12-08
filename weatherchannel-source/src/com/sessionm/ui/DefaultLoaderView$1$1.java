// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            DefaultLoaderView

class this._cls1
    implements Runnable
{

    final ReloadStarted this$1;

    public void run()
    {
        if (loaderViewStatus == tatus.UNAVAILABLE)
        {
            containerLayout = null;
            loaderViewStatus = null;
            listener.Cancel();
            return;
        } else
        {
            setLoaderViewStatus(tatus.LOADING);
            listener.ReloadStarted();
            return;
        }
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/DefaultLoaderView$1

/* anonymous class */
    class DefaultLoaderView._cls1
        implements android.view.View.OnClickListener
    {

        final DefaultLoaderView this$0;

        public void onClick(View view)
        {
            activity.runOnUiThread(new DefaultLoaderView._cls1._cls1());
        }

            
            {
                this$0 = DefaultLoaderView.this;
                super();
            }
    }

}
