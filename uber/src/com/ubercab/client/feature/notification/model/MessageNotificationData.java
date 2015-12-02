// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.notification.model;

import android.os.Bundle;
import cxf;

// Referenced classes of package com.ubercab.client.feature.notification.model:
//            NotificationData

public final class MessageNotificationData extends NotificationData
{

    private static final String KEY_LARGE_IMAGE_URL = "large_image_url";
    private static final String KEY_TEXT = "text";
    private static final String KEY_TICKER = "ticker";
    private static final String KEY_TITLE = "title";
    private static final String KEY_URL = "url";
    public static final String TYPE = "message";
    private String mImageUrl;
    private String mText;
    private String mTicker;
    private String mTitle;
    private String mUrl;

    private MessageNotificationData(NotificationData.Source source)
    {
        super("message", source);
    }

    public static MessageNotificationData createFakeData()
    {
        MessageNotificationData messagenotificationdata = new MessageNotificationData(NotificationData.Source.FAKE);
        messagenotificationdata.mTitle = "Breaking News";
        messagenotificationdata.mText = "The quick brown fox jumps over the lazy dog!!";
        messagenotificationdata.mTicker = "Breaking News: The quick brown fox jumps over the lazy dog!!";
        messagenotificationdata.mImageUrl = null;
        messagenotificationdata.mUrl = "https://uber.com";
        return messagenotificationdata;
    }

    public static MessageNotificationData fromUberBundle(Bundle bundle)
    {
        MessageNotificationData messagenotificationdata = new MessageNotificationData(NotificationData.Source.PUSH);
        messagenotificationdata.mTitle = bundle.getString("title");
        messagenotificationdata.mText = bundle.getString("text");
        messagenotificationdata.mTicker = bundle.getString("ticker");
        messagenotificationdata.mImageUrl = bundle.getString("large_image_url");
        messagenotificationdata.mUrl = bundle.getString("url");
        return messagenotificationdata;
    }

    public final String getLargeImageUrl()
    {
        return mImageUrl;
    }

    public final String getTag()
    {
        return cxf.a(String.format("%s%s%s%s%s", new Object[] {
            mTitle, mText, mTicker, mImageUrl, mUrl
        }));
    }

    public final String getText()
    {
        return mText;
    }

    public final String getTicker()
    {
        return mTicker;
    }

    public final String getTitle()
    {
        return mTitle;
    }

    public final String getUrl()
    {
        return mUrl;
    }
}
