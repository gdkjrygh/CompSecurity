// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.flow:
//            InitManager

class <init> extends DefaultCallback
{

    final InitManager this$0;

    public void onModel(User user)
    {
        Session.getInstance().setUser(user);
        InitManager.access$300(InitManager.this);
    }

    public volatile void onModel(Object obj)
    {
        onModel((User)obj);
    }

    (Context context)
    {
        this$0 = InitManager.this;
        super(context);
    }
}
