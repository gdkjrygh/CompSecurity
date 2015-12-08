// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.util.StateSerializer;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class this._cls0
    implements Runnable
{

    final RootActivity this$0;

    public void run()
    {
        StateSerializer.getInstance().deleteSerializedSessionState();
        WishApplication.getAppInstance().logout(RootActivity.this, true, true, false);
    }

    ()
    {
        this$0 = RootActivity.this;
        super();
    }
}
