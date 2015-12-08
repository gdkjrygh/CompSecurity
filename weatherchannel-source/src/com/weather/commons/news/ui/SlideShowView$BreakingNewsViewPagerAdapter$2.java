// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.widget.ProgressBar;
import com.squareup.picasso.Callback;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.commons.news.ui:
//            SlideShowView

class val.progressBar
    implements Callback
{

    final val.progressBar this$1;
    final ProgressBar val$progressBar;

    public void onError()
    {
        LogUtil.e("SlideShowView", LoggingMetaTags.TWC_BREAKING_NEWS, "Error with picasso callback listener", new Object[0]);
    }

    public void onSuccess()
    {
        val$progressBar.setVisibility(8);
    }

    ()
    {
        this$1 = final_;
        val$progressBar = ProgressBar.this;
        super();
    }
}
