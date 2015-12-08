// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            SessionMActivity, LoaderView, ActivityController

class this._cls1
    implements Runnable
{

    final Status.FAILED this$1;

    public void run()
    {
        getLoaderView().setLoaderViewStatus(Status.FAILED);
    }

    is._cls0()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class com/sessionm/ui/SessionMActivity$2

/* anonymous class */
    class SessionMActivity._cls2
        implements ActivityController.PrepareListener
    {

        final SessionMActivity this$0;

        public void onFailure(Throwable throwable)
        {
            runOnUiThread(new SessionMActivity._cls2._cls1());
        }

        public void onPrepared()
        {
            dismissLoadingIndicator();
            SessionMActivity.access$100(SessionMActivity.this).displayView();
        }

            
            {
                this$0 = SessionMActivity.this;
                super();
            }
    }

}
