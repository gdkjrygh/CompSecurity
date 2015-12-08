// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.weather.commons.ui.DoubleClickPreventer;
import com.weather.util.intent.IntentUtils;
import com.weather.util.intent.MimeType;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.commons.share:
//            ShareSimpleUrlSupport, FacebookUtils, MessengerUtils, ShareableUrl

public class SimpleUrlSharer
{

    private static final Set BLACKLIST = ImmutableSet.of("com.incorporateapps.fakegps.fre", "com.google.zxing.client.android");
    private static final List FEATURED = ImmutableList.of("com.facebook.orca", "com.facebook.katana", "com.twitter.android", "com.google.android.gm", "com.google.android.apps.plus");
    private final Context context;
    private final DoubleClickPreventer doubleClickPreventer = new DoubleClickPreventer();
    private final ShareSimpleUrlSupport support;

    public SimpleUrlSharer(Context context1, ShareSimpleUrlSupport sharesimpleurlsupport)
    {
        support = (ShareSimpleUrlSupport)Preconditions.checkNotNull(sharesimpleurlsupport);
        context = (Context)Preconditions.checkNotNull(context1);
    }

    private Intent getBaselineIntent(ShareableUrl shareableurl)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareableurl));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareableurl));
        intent.setType(MimeType.TEXT_PLAIN.getMimeString());
        return intent;
    }

    private Intent getFacebookIntent(ShareableUrl shareableurl)
    {
        Intent intent = FacebookUtils.getBaselineShareIntent(context);
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareableurl));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareableurl));
        return intent;
    }

    private Intent getGmailIntent(ShareableUrl shareableurl)
    {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gm");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareableurl));
        intent.putExtra("android.intent.extra.TEXT", support.getHtmlMessage(shareableurl));
        intent.setType(MimeType.TEXT_HTML.getMimeString());
        return intent;
    }

    private Intent getMessengerIntent(ShareableUrl shareableurl)
    {
        Intent intent = MessengerUtils.getBaselineShareIntent(context, null);
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareableurl));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareableurl));
        return intent;
    }

    private Intent getTwitterIntent(ShareableUrl shareableurl)
    {
        Intent intent = new Intent();
        intent.setPackage("com.twitter.android");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", support.getTwitterBody(shareableurl));
        intent.setType(MimeType.TEXT_PLAIN.getMimeString());
        return intent;
    }

    public void share(ShareableUrl shareableurl)
    {
        if (!doubleClickPreventer.recordClick())
        {
            return;
        } else
        {
            Intent intent = getBaselineIntent(shareableurl);
            HashBiMap hashbimap = HashBiMap.create();
            hashbimap.put("com.twitter.android", getTwitterIntent(shareableurl));
            hashbimap.put("com.google.android.gm", getGmailIntent(shareableurl));
            hashbimap.put("com.facebook.orca", getMessengerIntent(shareableurl));
            hashbimap.put("com.facebook.katana", getFacebookIntent(shareableurl));
            CharSequence charsequence = support.getChooserTitle();
            support.fireBeacon(shareableurl);
            IntentUtils.showFilteredChooser(context, charsequence, intent, hashbimap, BLACKLIST, FEATURED);
            return;
        }
    }

}
