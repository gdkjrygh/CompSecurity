// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import android.net.Uri;
import com.google.android.apps.youtube.common.e.l;
import com.google.android.apps.youtube.core.converter.o;
import java.util.Set;
import org.xml.sax.Attributes;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            f

final class g extends o
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void a(l l1, Attributes attributes, String s)
    {
        l1 = (com.google.android.apps.youtube.datalib.legacy.model.Branding.Builder)l1.peek();
        attributes = attributes.getValue("name");
        if (f.b().contains(attributes))
        {
            if ("channel.global.title.string".equals(attributes))
            {
                l1.title(s);
            } else
            {
                if ("channel.global.description.string".equals(attributes))
                {
                    l1.description(s);
                    return;
                }
                if ("channel.global.keywords.string".equals(attributes))
                {
                    l1.keywords(s);
                    return;
                }
                if ("mobile_watchpage.banner.image.url".equals(attributes))
                {
                    l1.bannerUri(Uri.parse(s));
                    return;
                }
                if ("mobile_watchpage.banner.image_target.url".equals(attributes))
                {
                    l1.bannerTargetUri(Uri.parse(s));
                    return;
                }
                if ("device_watchpage.watermark.image.url".equals(attributes))
                {
                    l1.watermarkUri(Uri.parse(s));
                    return;
                }
                if ("device_watchpage.watermark.image_target.url".equals(attributes))
                {
                    l1.watermarkTargetUri(Uri.parse(s));
                    return;
                }
                if ("device_watchpage.interstitial.image.url".equals(attributes))
                {
                    l1.interstitialUri(Uri.parse(s));
                    return;
                }
                if ("device_watchpage.interstitial.image_target.url".equals(attributes))
                {
                    l1.interstitialTargetUri(Uri.parse(s));
                    return;
                }
                if ("watchpage.global.featured_playlist.id".equals(attributes))
                {
                    l1.featuredPlaylistId(s);
                    return;
                }
                if ("watchpage.large_branded_banner.image.url".equals(attributes))
                {
                    l1.largeBannerUri(Uri.parse(s));
                    return;
                }
                if ("generictv_watchpage.banner.image.url".equals(attributes))
                {
                    l1.tvBannerUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.mobile.low.image.url".equals(attributes))
                {
                    l1.channelBannerMobileLowUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.mobile.medium.image.url".equals(attributes))
                {
                    l1.channelBannerMobileMediumUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.mobile.medium_hd.image.url".equals(attributes))
                {
                    l1.channelBannerMobileMediumHdUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.mobile.hd.image.url".equals(attributes))
                {
                    l1.channelBannerMobileHdUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.mobile.extra_hd.image.url".equals(attributes))
                {
                    l1.channelBannerMobileExtraHdUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.tablet.low.image.url".equals(attributes))
                {
                    l1.channelBannerTabletLowUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.tablet.medium.image.url".equals(attributes))
                {
                    l1.channelBannerTabletMediumUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.tablet.hd.image.url".equals(attributes))
                {
                    l1.channelBannerTabletHdUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.tablet.extra_hd.image.url".equals(attributes))
                {
                    l1.channelBannerTabletExtraHdUri(Uri.parse(s));
                    return;
                }
                if ("channel.banner.tv.image.url".equals(attributes))
                {
                    l1.channelBannerTvUri(Uri.parse(s));
                    return;
                }
            }
        }
    }
}
