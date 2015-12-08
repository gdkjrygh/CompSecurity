// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;

// Referenced classes of package com.weather.commons.share:
//            ShareMessageSupport, ShareableMessage

public abstract class ShareMessageSupportForMedia
    implements ShareMessageSupport
{

    private final int chooserTitleResourceId;
    private final Context context;
    protected final int subjectTemplateId;
    private final int twitterTemplateId;

    public ShareMessageSupportForMedia(Context context1, int i, int j, int k)
    {
        context = context1;
        subjectTemplateId = i;
        twitterTemplateId = j;
        chooserTitleResourceId = k;
    }

    public void fireBeacon(ShareableMessage shareablemessage)
    {
    }

    public CharSequence getChooserTitle()
    {
        return context.getResources().getString(chooserTitleResourceId);
    }

    public CharSequence getHtmlMessage(ShareableMessage shareablemessage)
    {
        return Html.fromHtml(shareablemessage.getHTMLMessageBody());
    }

    public CharSequence getMessage(ShareableMessage shareablemessage)
    {
        return shareablemessage.getMessageBody();
    }

    public CharSequence getTwitterBody(ShareableMessage shareablemessage)
    {
        return (new StringBuilder()).append(context.getResources().getString(twitterTemplateId)).append(' ').append(shareablemessage.getMessageBody()).toString();
    }
}
