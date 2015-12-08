// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.app.Activity;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivityUpdateAppPrompt

class val.activity
    implements com.contextlogic.wish.api.service.cessCallback
{

    final RootActivityUpdateAppPrompt this$0;
    final Activity val$activity;

    public void onServiceSucceeded(String s, boolean flag)
    {
        if (flag)
        {
            showPrompt(s, val$activity);
        }
    }

    allback()
    {
        this$0 = final_rootactivityupdateappprompt;
        val$activity = Activity.this;
        super();
    }
}
