// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            SessionMActivity, ActivityController, LoaderView

class this._cls0
    implements PrepareListener
{

    final SessionMActivity this$0;

    public void onFailure(Throwable throwable)
    {
        runOnUiThread(new Runnable() {

            final SessionMActivity._cls2 this$1;

            public void run()
            {
                getLoaderView().setLoaderViewStatus(LoaderView.LoaderViewStatus.FAILED);
            }

            
            {
                this$1 = SessionMActivity._cls2.this;
                super();
            }
        });
    }

    public void onPrepared()
    {
        dismissLoadingIndicator();
        SessionMActivity.access$100(SessionMActivity.this).displayView();
    }

    _cls1.this._cls1()
    {
        this$0 = SessionMActivity.this;
        super();
    }
}
