// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            ActivityController

class epareListener
    implements adContentListener
{

    final ActivityController this$0;
    final adWebViewListener val$listener;
    final epareListener val$prepareListener;

    public void onContentLoaded(String s, String s1)
    {
        ActivityController.access$700(ActivityController.this, s, s1, val$listener);
    }

    public void onFailure(Throwable throwable)
    {
        val$prepareListener.onFailure(throwable);
    }

    epareListener()
    {
        this$0 = final_activitycontroller;
        val$listener = adwebviewlistener;
        val$prepareListener = epareListener.this;
        super();
    }
}
