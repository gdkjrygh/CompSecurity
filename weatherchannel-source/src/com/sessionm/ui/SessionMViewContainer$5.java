// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.view.View;
import android.webkit.WebView;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

class this._cls0
    implements android.view.._cls5
{

    final SessionMViewContainer this$0;

    public void onClick(View view)
    {
        if (SessionMViewContainer.access$200(SessionMViewContainer.this) != null && SessionMViewContainer.access$200(SessionMViewContainer.this).canGoForward())
        {
            SessionMViewContainer.access$200(SessionMViewContainer.this).goForward();
        }
    }

    ()
    {
        this$0 = SessionMViewContainer.this;
        super();
    }
}
