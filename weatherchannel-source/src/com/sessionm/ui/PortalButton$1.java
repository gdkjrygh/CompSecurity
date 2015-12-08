// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;


// Referenced classes of package com.sessionm.ui:
//            PortalButton

class abelState
    implements Runnable
{

    final PortalButton this$0;
    final abelState val$state;

    public void run()
    {
        PortalButton.access$000(PortalButton.this);
        PortalButton.access$100(PortalButton.this, val$state);
    }

    abelState()
    {
        this$0 = final_portalbutton;
        val$state = abelState.this;
        super();
    }
}
