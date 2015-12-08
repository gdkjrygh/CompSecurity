// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.app;

import android.view.View;
import com.sessionm.api.SessionM;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;

// Referenced classes of package com.weather.commons.app:
//            TWCBaseActivity

class this._cls0
    implements android.view.er
{

    final TWCBaseActivity this$0;

    public void onClick(View view)
    {
        recordButtonPress(LocalyticsFeedButton.SESSION_M);
        SessionM.getInstance().presentActivity(com.sessionm.api.ype.PORTAL);
    }

    icsFeedButton()
    {
        this$0 = TWCBaseActivity.this;
        super();
    }
}
