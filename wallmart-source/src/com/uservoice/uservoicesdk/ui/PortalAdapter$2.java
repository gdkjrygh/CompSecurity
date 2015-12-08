// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.Forum;

// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            DefaultCallback, PortalAdapter

class <init> extends DefaultCallback
{

    final PortalAdapter this$0;

    public void onModel(Forum forum)
    {
        Session.getInstance().setForum(forum);
        notifyDataSetChanged();
    }

    public volatile void onModel(Object obj)
    {
        onModel((Forum)obj);
    }

    (Context context)
    {
        this$0 = PortalAdapter.this;
        super(context);
    }
}
