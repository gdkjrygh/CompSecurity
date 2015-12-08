// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;

// Referenced classes of package com.weather.commons.share:
//            ShareableUrl

public abstract class ShareSimpleUrlSupport
{

    private final int chooserTitleResourceId;
    private final Context context;
    private final int messageTemplateId;
    private final int subjectTemplateId;
    private final int twitterTemplateId;
    private final String urlTemplate;

    public ShareSimpleUrlSupport(Context context1, int i, int j, int k, int l, String s)
    {
        context = context1;
        subjectTemplateId = i;
        messageTemplateId = j;
        twitterTemplateId = k;
        chooserTitleResourceId = l;
        urlTemplate = s;
    }

    public abstract void fireBeacon(ShareableUrl shareableurl);

    public CharSequence getChooserTitle()
    {
        return context.getResources().getString(chooserTitleResourceId);
    }

    public CharSequence getHtmlMessage(ShareableUrl shareableurl)
    {
        shareableurl = (new StringBuilder()).append("<a href=\"").append(shareableurl.getUrl(urlTemplate)).append("\">").append(shareableurl.getTitle()).append("</a>").toString();
        return Html.fromHtml(context.getResources().getString(messageTemplateId, new Object[] {
            shareableurl
        }));
    }

    public CharSequence getMessage(ShareableUrl shareableurl)
    {
        return context.getResources().getString(messageTemplateId, new Object[] {
            shareableurl.getUrl(urlTemplate)
        });
    }

    public CharSequence getSubject(ShareableUrl shareableurl)
    {
        return String.format(context.getResources().getString(subjectTemplateId), new Object[] {
            shareableurl.getTitle()
        });
    }

    public CharSequence getTwitterBody(ShareableUrl shareableurl)
    {
        return (new StringBuilder()).append(context.getResources().getString(twitterTemplateId)).append(' ').append(shareableurl.getUrl(urlTemplate)).toString();
    }
}
