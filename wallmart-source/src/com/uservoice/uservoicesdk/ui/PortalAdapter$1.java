// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.ui;


// Referenced classes of package com.uservoice.uservoicesdk.ui:
//            PortalAdapter

class this._cls0
    implements Runnable
{

    final PortalAdapter this$0;

    public void run()
    {
        PortalAdapter.access$002(PortalAdapter.this, true);
        notifyDataSetChanged();
        PortalAdapter.access$100(PortalAdapter.this);
        PortalAdapter.access$200(PortalAdapter.this);
    }

    ()
    {
        this$0 = PortalAdapter.this;
        super();
    }
}
