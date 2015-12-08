// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.content.Context;
import android.content.res.Resources;

// Referenced classes of package com.weather.commons.share:
//            ShareableMedia

public abstract class ShareMediaSupport
{

    private final int chooserTitleResourceId;
    protected final Context context;
    private final int messageTemplateId;
    private final int subjectTemplateId;
    private final int twitterTemplateId;

    public ShareMediaSupport(Context context1, int i, int j, int k, int l)
    {
        context = context1;
        subjectTemplateId = i;
        messageTemplateId = j;
        twitterTemplateId = k;
        chooserTitleResourceId = l;
    }

    public abstract void fireBeacon(ShareableMedia shareablemedia);

    public CharSequence getChooserTitle()
    {
        return context.getResources().getString(chooserTitleResourceId);
    }

    public CharSequence getMessage(ShareableMedia shareablemedia)
    {
        return context.getResources().getString(messageTemplateId);
    }

    public CharSequence getSubject(ShareableMedia shareablemedia)
    {
        return String.format(context.getResources().getString(subjectTemplateId), new Object[] {
            shareablemedia.getTitle()
        });
    }

    public CharSequence getTwitterBody(ShareableMedia shareablemedia)
    {
        return context.getResources().getString(twitterTemplateId);
    }
}
