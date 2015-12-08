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
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.weather.commons.ui.DoubleClickPreventer;
import com.weather.util.intent.IntentUtils;
import com.weather.util.intent.MimeType;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.weather.commons.share:
//            ShareMediaSupport, ShareableMedia

public class SimpleMediaSharer
{

    private static final Set DEFAULT_BLACKLIST = ImmutableSet.of("com.incorporateapps.fakegps.fre", "com.google.zxing.client.android");
    private static final List DEFAULT_FEATURED = ImmutableList.of("com.facebook.orca", "com.facebook.katana", "com.twitter.android", "com.google.android.gm", "com.google.android.apps.plus");
    private Set blackList;
    private final Context context;
    private final DoubleClickPreventer doubleClickPreventer = new DoubleClickPreventer();
    private List featured;
    private final ShareMediaSupport support;

    public SimpleMediaSharer(Context context1, ShareMediaSupport sharemediasupport)
    {
        blackList = DEFAULT_BLACKLIST;
        featured = DEFAULT_FEATURED;
        support = (ShareMediaSupport)Preconditions.checkNotNull(sharemediasupport);
        context = (Context)Preconditions.checkNotNull(context1);
    }

    private Intent getBaselineIntent(ShareableMedia shareablemedia)
    {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareablemedia));
        intent.putExtra("android.intent.extra.TEXT", support.getMessage(shareablemedia));
        intent.setType(shareablemedia.getMimeType().getMimeString());
        intent.putExtra("android.intent.extra.STREAM", shareablemedia.getUri());
        return intent;
    }

    private Intent getGmailIntent(ShareableMedia shareablemedia)
    {
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gm");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", support.getSubject(shareablemedia));
        intent.setType(shareablemedia.getMimeType().getMimeString());
        intent.putExtra("android.intent.extra.STREAM", shareablemedia.getUri());
        return intent;
    }

    private Intent getTwitterIntent(ShareableMedia shareablemedia)
    {
        Intent intent = new Intent();
        intent.setPackage("com.twitter.android");
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", support.getTwitterBody(shareablemedia));
        intent.setType(shareablemedia.getMimeType().getMimeString());
        intent.putExtra("android.intent.extra.STREAM", shareablemedia.getUri());
        return intent;
    }

    public Set getBlackList()
    {
        return Sets.newHashSet(blackList);
    }

    public List getFeatured()
    {
        return Lists.newArrayList(featured);
    }

    public SimpleMediaSharer setBlackList(Set set)
    {
        blackList = ImmutableSet.copyOf(set);
        return this;
    }

    public SimpleMediaSharer setFeatured(List list)
    {
        featured = ImmutableList.copyOf(list);
        return this;
    }

    public void share(ShareableMedia shareablemedia)
    {
        if (!doubleClickPreventer.recordClick())
        {
            return;
        } else
        {
            Intent intent = getBaselineIntent(shareablemedia);
            HashBiMap hashbimap = HashBiMap.create();
            hashbimap.put("com.twitter.android", getTwitterIntent(shareablemedia));
            hashbimap.put("com.google.android.gm", getGmailIntent(shareablemedia));
            CharSequence charsequence = support.getChooserTitle();
            support.fireBeacon(shareablemedia);
            IntentUtils.showFilteredChooser(context, charsequence, intent, hashbimap, blackList, featured);
            return;
        }
    }

}
