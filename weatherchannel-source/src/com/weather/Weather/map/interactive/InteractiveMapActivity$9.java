// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive;

import android.view.View;
import com.sessionm.api.SessionM;
import com.weather.commons.analytics.feed.LocalyticsFeedButton;

// Referenced classes of package com.weather.Weather.map.interactive:
//            InteractiveMapActivity

class this._cls0
    implements android.view.teractiveMapActivity._cls9
{

    final InteractiveMapActivity this$0;

    public void onClick(View view)
    {
        InteractiveMapActivity.access$600(InteractiveMapActivity.this, LocalyticsFeedButton.SESSION_M);
        SessionM.getInstance().presentActivity(com.sessionm.api.TAL);
    }

    ()
    {
        this$0 = InteractiveMapActivity.this;
        super();
    }
}
