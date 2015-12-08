// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.app;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.weather.Weather.lastupdate.LastUpdatedUtil;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.commons.ups.ui.WxIconItem;
import com.weather.util.app.AbstractTwcApplication;
import java.util.Random;

// Referenced classes of package com.weather.Weather.app:
//            WeatherController

private final class lastUpdatedText
    implements Runnable
{

    private final Random generator = new Random();
    private int lastIdIndex;
    private final TextView lastUpdatedText;
    private final View overlay;
    private final ImageView refreshIconView;
    private final TextView refreshText;
    final WeatherController this$0;

    public void run()
    {
        Resources resources = AbstractTwcApplication.getRootContext().getResources();
        lastUpdatedText.setText(LastUpdatedUtil.calculateLastUpdatedString(resources, WeatherController.access$400(WeatherController.this), System.currentTimeMillis()));
        refreshText.setText(resources.getString(0x7f070220));
        if (WeatherController.access$800())
        {
            int j = generator.nextInt(WxIconItem.SVG_IDS.size());
            int i = j;
            if (j == lastIdIndex)
            {
                i = (j + 1) % WxIconItem.SVG_IDS.size();
            }
            lastIdIndex = i;
            android.graphics.Bitmap bitmap = WxIconBitmapCache.getBitmap(((Integer)WxIconItem.SVG_IDS.get(i)).intValue());
            refreshIconView.setImageBitmap(bitmap);
            overlay.postDelayed(this, 600L);
        }
    }

    (View view)
    {
        this$0 = WeatherController.this;
        super();
        overlay = view;
        refreshIconView = (ImageView)view.findViewById(0x7f0d01eb);
        refreshText = (TextView)view.findViewById(0x7f0d01ec);
        lastUpdatedText = (TextView)view.findViewById(0x7f0d01ed);
    }
}
