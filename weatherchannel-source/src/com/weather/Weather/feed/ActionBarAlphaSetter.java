// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.widget.ListView;
import com.google.common.base.Preconditions;
import com.weather.commons.app.TWCBaseActivity;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.Weather.feed:
//            ViewWithAlpha

public class ActionBarAlphaSetter
    implements ViewWithAlpha
{

    private static final String TAG = "ActionBarAlphaSetter";
    private final TWCBaseActivity activity;
    private final ListView listView;

    public ActionBarAlphaSetter(TWCBaseActivity twcbaseactivity, ListView listview)
    {
        activity = (TWCBaseActivity)Preconditions.checkNotNull(twcbaseactivity);
        listView = (ListView)Preconditions.checkNotNull(listview);
    }

    public void setAlphaOfView(int i)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            i += 120;
            if (i >= 255 || listView.getFirstVisiblePosition() > 0)
            {
                i = 255;
            }
            activity.setActionBarBackgroundAlpha(i);
            LogUtil.v("ActionBarAlphaSetter", LoggingMetaTags.TWC_UI, "updateAlphas newActionBarBackgroundAlpha=%s", new Object[] {
                Integer.valueOf(i)
            });
        }
    }
}
