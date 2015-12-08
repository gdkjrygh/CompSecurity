// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.weather.beacons.analytics.Analytics;
import uk.co.senab.photoview.PhotoView;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity, ChatOverlayViewer

class val.textIcon
    implements android.view.tener
{

    final ChatActivity this$0;
    final ImageView val$textIcon;

    public void onClick(View view)
    {
        if (ChatActivity.access$300(ChatActivity.this).getVisibility() == 0)
        {
            val$textIcon.setImageDrawable(getResources().getDrawable(0x7f02006f));
            ChatActivity.access$500(ChatActivity.this).updateUserMessageVisibility(4);
            ChatActivity.access$600(ChatActivity.this).invalidate();
            Analytics.trackState(getString(0x7f0704c5), null);
            return;
        } else
        {
            val$textIcon.setImageDrawable(getResources().getDrawable(0x7f020070));
            ChatActivity.access$500(ChatActivity.this).updateUserMessageVisibility(0);
            Analytics.trackState(getString(0x7f0704c6), null);
            return;
        }
    }

    er()
    {
        this$0 = final_chatactivity;
        val$textIcon = ImageView.this;
        super();
    }
}
