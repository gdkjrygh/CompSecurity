// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.view.View;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

class this._cls0
    implements android.view.._cls6
{

    final SessionMViewContainer this$0;

    public void onClick(View view)
    {
        if (SessionMViewContainer.access$300(SessionMViewContainer.this) != null)
        {
            SessionMViewContainer.access$300(SessionMViewContainer.this).onClosePressed(SessionMViewContainer.this);
        }
    }

    ssionMViewContainerListener()
    {
        this$0 = SessionMViewContainer.this;
        super();
    }
}
