// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.n;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ap, h, g

public final class f extends ap
{

    private static final Set c = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "channel.global.title.string", "channel.global.description.string", "channel.global.keywords.string", "mobile_watchpage.banner.image.url", "mobile_watchpage.banner.image_target.url", "watchpage.global.featured_playlist.id", "watchpage.large_branded_banner.image.url", "device_watchpage.watermark.image.url", "device_watchpage.watermark.image_target.url", "device_watchpage.interstitial.image.url", 
        "device_watchpage.interstitial.image_target.url", "generictv_watchpage.banner.image.url", "channel.banner.mobile.low.image.url", "channel.banner.mobile.medium.image.url", "channel.banner.mobile.medium_hd.image.url", "channel.banner.mobile.hd.image.url", "channel.banner.mobile.extra_hd.image.url", "channel.banner.tablet.low.image.url", "channel.banner.tablet.medium.image.url", "channel.banner.tablet.hd.image.url", 
        "channel.banner.tablet.extra_hd.image.url", "channel.banner.tv.image.url"
    })));
    private final e d = (new com.google.android.apps.youtube.core.converter.f()).a("/entry", new h(this)).a("/entry/yt:option", new g(this)).a();

    public f(n n)
    {
        super(n);
    }

    static Set b()
    {
        return c;
    }

    protected final e a()
    {
        return d;
    }

}
