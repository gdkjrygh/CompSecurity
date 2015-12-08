// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.common.base.Preconditions;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.weather.util.intent.IntentUtils;
import com.weather.util.intent.MimeType;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.commons.share:
//            ShareMessageSupport, MessengerUtils, ShareableMessage

public class AlertUrlSharer
{

    private static final Set BLACKLIST = ImmutableSet.of("com.incorporateapps.fakegps.fre", "com.google.zxing.client.android");
    private static final List FEATURED = ImmutableList.of("com.facebook.orca", "com.facebook.katana", "com.twitter.android", "com.google.android.gm", "com.google.android.apps.plus");
    private final Context context;
    private final ShareMessageSupport support;

    public AlertUrlSharer(Context context1, ShareMessageSupport sharemessagesupport)
    {
        support = (ShareMessageSupport)Preconditions.checkNotNull(sharemessagesupport);
        context = (Context)Preconditions.checkNotNull(context1);
    }

    private Intent getBaselineIntent(ShareableMessage shareablemessage)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareablemessage));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareablemessage));
        intent.setType(MimeType.TEXT_PLAIN.getMimeString());
        return intent;
    }

    private Intent getGmailIntent(ShareableMessage shareablemessage)
    {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gm");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareablemessage));
        intent.putExtra("android.intent.extra.TEXT", support.getHtmlMessage(shareablemessage));
        intent.setType(MimeType.TEXT_HTML.getMimeString());
        return intent;
    }

    private Intent getMessengerIntent(ShareableMessage shareablemessage)
    {
        Intent intent = MessengerUtils.getBaselineShareIntent(context, null);
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareablemessage));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareablemessage));
        return intent;
    }

    private Intent getTwitterIntent(ShareableMessage shareablemessage)
    {
        Intent intent = new Intent();
        intent.setPackage("com.twitter.android");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", support.getTwitterBody(shareablemessage));
        intent.setType(MimeType.TEXT_PLAIN.getMimeString());
        return intent;
    }

    public PendingIntent getPendingIntent(ShareableMessage shareablemessage, int i)
    {
        Intent intent = getBaselineIntent(shareablemessage);
        HashBiMap hashbimap = HashBiMap.create();
        hashbimap.put("com.twitter.android", getTwitterIntent(shareablemessage));
        hashbimap.put("com.google.android.gm", getGmailIntent(shareablemessage));
        hashbimap.put("com.facebook.orca", getMessengerIntent(shareablemessage));
        shareablemessage = support.getChooserTitle();
        shareablemessage = IntentUtils.getFilteredChooser(context, shareablemessage, intent, hashbimap, BLACKLIST, FEATURED);
        return PendingIntent.getActivity(context.getApplicationContext(), i, shareablemessage, 0x8000000);
    }

}
