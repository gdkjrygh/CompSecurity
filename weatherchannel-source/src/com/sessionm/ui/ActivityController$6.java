// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController

class epareListener
    implements adWebViewListener
{

    final ActivityController this$0;
    final epareListener val$prepareListener;

    public void onFailure(Throwable throwable)
    {
        val$prepareListener.onFailure(throwable);
    }

    public void onWebViewLoaded()
    {
        val$prepareListener.onPrepared();
    }

    epareListener()
    {
        this$0 = final_activitycontroller;
        val$prepareListener = epareListener.this;
        super();
    }
}
