// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.widget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.youtube.app.WatchWhileActivity;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.fragments.navigation.WatchDescriptor;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.WatchFeature;
import com.google.android.apps.youtube.core.player.model.PlaybackStartDescriptor;
import com.google.android.apps.youtube.core.utils.l;

public class WidgetActivity extends Activity
{

    public WidgetActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = ((YouTubeApplication)getApplication()).D();
        l.b(this);
        Intent intent = getIntent();
        if ("com.google.android.youtube.action.widget_play".equals(intent.getAction()))
        {
            bundle.a(com.google.android.apps.youtube.core.Analytics.VideoCategory.Widget, 0);
            bundle = intent.getStringExtra("video_id");
            intent = WatchWhileActivity.a(this);
            intent.putExtra("watch", new WatchDescriptor(new PlaybackStartDescriptor(bundle, "", -1, 0, WatchFeature.WIDGET)));
            startActivity(intent);
        } else
        {
            L.c("missing a widget launch action");
        }
        finish();
    }
}
