// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivitySearchSuggestionsAdapter

class val.doneSignal
    implements com.contextlogic.wish.api.service.er._cls2
{

    final RootActivitySearchSuggestionsAdapter this$0;
    final CountDownLatch val$doneSignal;

    public void onServiceFailed()
    {
        val$doneSignal.countDown();
    }

    ()
    {
        this$0 = final_rootactivitysearchsuggestionsadapter;
        val$doneSignal = CountDownLatch.this;
        super();
    }
}
