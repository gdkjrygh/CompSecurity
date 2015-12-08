// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.weather.beacons.analytics.Analytics;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.chat.ChatSummaryRecorder;
import com.weather.commons.analytics.chat.LocalyticsChatAttributeValues;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.share.FacebookUtils;
import com.weather.util.intent.IntentUtils;
import com.weather.util.intent.MimeType;
import uk.co.senab.photoview.PhotoViewAttacher;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity, ChatOverlayData

private class <init>
    implements android.view.ity.FbClick
{

    final ChatActivity this$0;

    public void onClick(View view)
    {
        ChatActivity.access$700(ChatActivity.this).getChatSummaryRecorder().incrementShareAttempt();
        view = ChatActivity.access$300(ChatActivity.this).getText();
        int i;
        if (TextUtils.isEmpty(view))
        {
            i = 4;
        } else
        {
            i = ChatActivity.access$300(ChatActivity.this).getVisibility();
        }
        ChatActivity.access$800(ChatActivity.this, i);
        if (IntentUtils.isInstalled(ChatActivity.this, "com.facebook.katana"))
        {
            view = ChatActivity.access$1200(ChatActivity.this, ChatActivity.access$900(ChatActivity.this).getVisibleRectangleBitmap(), 0x7f03001a, new ChatOverlayData(view, i, ChatActivity.access$1000(ChatActivity.this), ChatActivity.access$1100(ChatActivity.this), 0));
            if (view != null)
            {
                LocalyticsHandler.getInstance().getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.lues.AttributeValue.BOOLEAN_YES.getAttributeValue());
                view = Uri.fromFile(view);
                view = FacebookUtils.getMediaShareIntent(ChatActivity.this, view, MimeType.IMAGE);
                Analytics.trackState(getString(0x7f0704c1), null);
                ChatActivity.access$1300(ChatActivity.this, LocalyticsChatAttributeValues.PLATFORM_FACEBOOK);
                FacebookUtils.share(ChatActivity.this, view);
            }
            return;
        } else
        {
            IntentUtils.launchOrInstall(ChatActivity.this, "com.facebook.katana", null);
            return;
        }
    }

    private hatAttributeValues()
    {
        this$0 = ChatActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
