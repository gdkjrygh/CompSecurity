// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import com.weather.commons.analytics.LocalyticsHandler;
import com.weather.commons.analytics.chat.ChatSummaryRecorder;
import com.weather.commons.analytics.chat.LocalyticsChatAttributeValues;
import com.weather.commons.analytics.session.LocalyticsSessionAttribute;
import com.weather.commons.analytics.session.LocalyticsSessionSummaryRecorder;
import com.weather.commons.share.ShareMediaSupport;
import com.weather.commons.share.SimpleMediaSharer;
import com.weather.commons.share.SimpleShareableMedia;
import com.weather.util.intent.MimeType;
import java.util.Set;
import uk.co.senab.photoview.PhotoViewAttacher;

// Referenced classes of package com.weather.Weather.chat:
//            ChatActivity, ChatOverlayData

private class <init>
    implements android.view..ShareClick
{

    private final ShareMediaSupport shareSupport;
    private final SimpleMediaSharer sms;
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
        view = ChatActivity.access$1200(ChatActivity.this, ChatActivity.access$900(ChatActivity.this).getVisibleRectangleBitmap(), 0x7f03001a, new ChatOverlayData(view, i, ChatActivity.access$1000(ChatActivity.this), ChatActivity.access$1100(ChatActivity.this), 0));
        if (view != null)
        {
            LocalyticsHandler.getInstance().getSessionSummaryRecorder().putValue(LocalyticsSessionAttribute.SOCIAL_PHOTO_SUBMITTED, com.weather.commons.analytics.s.AttributeValue.BOOLEAN_YES.getAttributeValue());
            view = Uri.fromFile(view);
            Set set = sms.getBlackList();
            set.add("com.facebook.katana");
            set.add("com.facebook.orca");
            sms.setBlackList(set);
            sms.share(new SimpleShareableMedia("", view, MimeType.IMAGE));
            ChatActivity.access$1300(ChatActivity.this, LocalyticsChatAttributeValues.PLATFORM_GENERAL);
        }
    }

    private AttributeValues()
    {
        this$0 = ChatActivity.this;
        super();
        shareSupport = new diaSupport(ChatActivity.this, 0x7f0704f3, 0x7f0704f2, 0x7f0704f4, 0x7f0702b1);
        sms = new SimpleMediaSharer(ChatActivity.this, shareSupport);
    }

    shareSupport(shareSupport sharesupport)
    {
        this();
    }
}
