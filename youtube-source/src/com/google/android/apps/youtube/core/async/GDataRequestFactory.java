// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.e.m;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.Util;
import com.google.android.apps.youtube.core.utils.v;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            GDataRequest, t

public final class GDataRequestFactory
{

    public static final Set a = new HashSet(Arrays.asList(new String[] {
        "AR", "AU", "BE", "BR", "CA", "CL", "CO", "CZ", "EG", "FR", 
        "DE", "GB", "HK", "HU", "IN", "IE", "IL", "IT", "JP", "JO", 
        "MY", "MX", "MA", "NL", "NZ", "PE", "PH", "PL", "RU", "SA", 
        "SG", "ZA", "KR", "ES", "SE", "TW", "AE", "US"
    }));
    private static final HashSet c = new HashSet(Arrays.asList(new String[] {
        "zh-TW", "cs-CZ", "nl-NL", "en-GB", "en-US", "fr-FR", "de-DE", "it-IT", "ja-JP", "ko-KR", 
        "pl-PL", "pt-BR", "ru-RU", "es-ES", "es-MX", "sv-SE"
    }));
    private final t b;
    private final int d;
    private final v e;
    private final String f;

    public GDataRequestFactory(t t1, int i1, v v1, String s1)
    {
label0:
        {
            boolean flag1 = false;
            super();
            boolean flag;
            if (t1 != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "gdataHostnameProvider must be provided");
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.google.android.apps.youtube.common.fromguava.c.a(flag, "resultsPerPage must be > 0");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
                if (s1.length() != 2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, (new StringBuilder("countryCodeRestrict must be empty or a two letter country code (given: ")).append(s1).append(")").toString());
        b = t1;
        d = i1;
        e = v1;
        if (TextUtils.isEmpty(s1))
        {
            f = null;
            return;
        } else
        {
            f = s1.toUpperCase(Locale.US);
            return;
        }
    }

    private Uri a(Uri uri, int i1)
    {
        Uri uri1;
label0:
        {
            if (uri.getQueryParameter("start-index") != null)
            {
                uri1 = uri;
                if (uri.getQueryParameter("max-results") != null)
                {
                    break label0;
                }
            }
            uri = uri.buildUpon();
            a(((android.net.Uri.Builder) (uri)), 1, i1);
            uri1 = uri.build();
        }
        return uri1;
    }

    public static GDataRequest a(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    private GDataRequest a(String s1, UpcomingTimeFilter upcomingtimefilter)
    {
        s1 = b.a().buildUpon().appendPath("charts").appendPath("live").appendPath("events").appendPath(s1).appendQueryParameter("inline", "true");
        b(s1);
        return GDataRequest.a(s1.build());
    }

    public static GDataRequest a(String s1, String s2, String s3, String s4, String s5, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, Map map, String s6, 
            String s7, Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        s2 = (new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:media='http://search.yahoo.com/mrss/' xmlns:yt='http://gdata.youtube.com/schemas/2007' xmlns:gd='http://schemas.google.com/g/2005' xmlns:gml='http://www.opengis.net/gml' xmlns:georss='http://www.georss.org/georss'><media:group><media:title type='plain'>")).append(Util.a(s1, 60, "")).append("</media:title><media:description type='plain'>").append(Util.a(s2, 5000, "")).append("</media:description><media:category label='").append(Util.a(s4, 100, "")).append("' scheme='http://gdata.youtube.com/schemas/2007/categories.cat").append("'>");
        s1 = s3;
        if (TextUtils.isEmpty(s3))
        {
            s1 = "";
        }
        s2 = s2.append(s1).append("</media:category><media:keywords>").append(Util.b(s5, 500, "")).append("</media:keywords>");
        if (privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE)
        {
            s1 = "<yt:private/>";
        } else
        {
            s1 = "";
        }
        s2 = s2.append(s1).append("</media:group>").toString();
        s1 = map;
        if (map == null)
        {
            s1 = new LinkedHashMap();
        }
        if (privacy != null)
        {
            if (privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC)
            {
                s1.put("list", "allowed");
            } else
            {
                s1.put("list", "denied");
            }
        }
        s3 = s1.entrySet().iterator();
        for (s1 = s2; s3.hasNext(); s1 = (new StringBuilder()).append(s1).append("<yt:accessControl action='").append((String)s2.getKey()).append("' permission='").append((String)s2.getValue()).append("'/>").toString())
        {
            s2 = (java.util.Map.Entry)s3.next();
        }

        if (s6 != null)
        {
            s1 = (new StringBuilder()).append(s1).append("<yt:location>").append(s6).append("</yt:location>").toString();
        }
        s2 = s1;
        if (s7 != null)
        {
            s2 = (new StringBuilder()).append(s1).append("<georss:where><gml:Point><gml:pos>").append(s7).append("</gml:pos></gml:Point></georss:where>").toString();
        }
        return GDataRequest.a(uri, com.google.android.apps.youtube.common.e.m.a((new StringBuilder()).append(s2).append("</entry>").toString()));
    }

    private void a(android.net.Uri.Builder builder)
    {
        a(builder, d);
    }

    private void a(android.net.Uri.Builder builder, int i1)
    {
        builder.appendQueryParameter("format", "2,3,8,9");
        a(builder, 1, i1);
        if (e != null)
        {
            builder.appendQueryParameter("safeSearch", e.b());
        }
        if (f != null)
        {
            builder.appendQueryParameter("restriction", f);
        }
    }

    private static void a(android.net.Uri.Builder builder, int i1, int j1)
    {
        builder.appendQueryParameter("start-index", Integer.toString(1));
        builder.appendQueryParameter("max-results", Integer.toString(j1));
    }

    private void b(android.net.Uri.Builder builder)
    {
        a(builder, 1, d);
    }

    public static GDataRequest c(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        Uri uri1 = uri;
        if (!"true".equals(uri.getQueryParameter("inline")))
        {
            uri1 = uri.buildUpon().appendQueryParameter("inline", "true").build();
        }
        return GDataRequest.a(uri1);
    }

    public static GDataRequest e(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri.buildUpon().appendQueryParameter("inline", "true").build());
    }

    public static GDataRequest i(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    public static GDataRequest j(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    public static GDataRequest k(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    public static GDataRequest l(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    public static GDataRequest m(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(uri);
    }

    private Uri p(String s1)
    {
        return b.a().buildUpon().appendPath("users").appendPath(s1).build();
    }

    private static String q(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if (a.contains(s1 = s1.toUpperCase(Locale.US)))
            {
                return s1;
            }
        }
        return null;
    }

    private Uri t()
    {
        return b.b().buildUpon().path("/feeds/api/users/default/uploads").build();
    }

    private Uri u()
    {
        return b.b().buildUpon().path("/feeds/api/users/default/subscriptions").build();
    }

    public final Uri a()
    {
        return b.b().buildUpon().path("/feeds/api/users/default/suggestion").appendQueryParameter("type", "channel").appendQueryParameter("inline", "true").build();
    }

    public final Uri a(ChannelFeed channelfeed)
    {
        return b.a().buildUpon().appendPath("channelstandardfeeds").appendPath(channelfeed.toString()).appendQueryParameter("type", "channel").appendQueryParameter("inline", "true").build();
    }

    public final GDataRequest a(int i1)
    {
        android.net.Uri.Builder builder = t().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest a(int i1, String s1)
    {
        s1 = i(s1).buildUpon();
        a(((android.net.Uri.Builder) (s1)), 1, i1);
        return GDataRequest.a(s1.build());
    }

    public final GDataRequest a(Pair pair)
    {
        Uri uri = b.a().buildUpon().appendPath("users").appendQueryParameter("managedByMe", "true").build();
        HashMap hashmap = new HashMap();
        hashmap.put(pair.first, pair.second);
        return GDataRequest.a(uri, hashmap);
    }

    public final GDataRequest a(Pair pair, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put(pair.first, pair.second);
        Uri uri = p("default");
        pair = uri;
        if (s1 != null)
        {
            pair = uri.buildUpon().appendQueryParameter("on-behalf-of", s1).build();
        }
        return GDataRequest.a(pair, hashmap);
    }

    public final GDataRequest a(ChannelFeed channelfeed, int i1)
    {
        channelfeed = a(channelfeed).buildUpon();
        a(((android.net.Uri.Builder) (channelfeed)), 1, i1);
        return GDataRequest.a(channelfeed.build());
    }

    public final GDataRequest a(StandardFeed standardfeed, String s1, String s2, TimeFilter timefilter)
    {
        int i1 = d;
        standardfeed = ((StandardFeed)com.google.android.apps.youtube.common.fromguava.c.a(standardfeed)).toString();
        android.net.Uri.Builder builder = b.a().buildUpon().appendPath("standardfeeds");
        s2 = q(s2);
        if (s2 != null)
        {
            builder.appendPath(s2);
        }
        if (TextUtils.isEmpty(s1))
        {
            builder.appendPath(standardfeed);
        } else
        {
            builder.appendPath((new StringBuilder()).append(standardfeed).append("_").append(s1).toString());
        }
        if (timefilter != null)
        {
            builder.appendQueryParameter("time", timefilter.toString());
        }
        a(builder, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest a(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return GDataRequest.a(b.b().buildUpon().path("feeds/api/videos").build().buildUpon().appendPath(s1).build());
    }

    public final GDataRequest a(String s1, ComplaintReason complaintreason, String s2)
    {
        s1 = b.a().buildUpon().appendPath("videos").appendPath(s1).appendPath("complaints").build();
        complaintreason = ((ComplaintReason)com.google.android.apps.youtube.common.fromguava.c.a(complaintreason)).toString();
        return GDataRequest.a(s1, com.google.android.apps.youtube.common.e.m.a((new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'><summary>")).append(Util.a(s2, 500, "")).append("</summary><category scheme='http://gdata.youtube.com/schemas/2007/complaint-reasons.cat' ").append("term='").append(complaintreason).append("'/></entry>").toString()));
    }

    public final GDataRequest a(String s1, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, String s2, String s3, String s4, String s5, Pair pair)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "filename may not be empty");
        com.google.android.apps.youtube.common.fromguava.c.a(privacy);
        HashMap hashmap = new HashMap();
        hashmap.put("Slug", s1);
        s2 = (new StringBuilder("<?xml version='1.0'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:media='http://search.yahoo.com/mrss/' xmlns:yt='http://gdata.youtube.com/schemas/2007' xmlns:gml='http://www.opengis.net/gml' xmlns:georss='http://www.georss.org/georss'><media:group><media:title type='plain'>")).append(Util.a(s2, 60, s1)).append("</media:title>");
        if (!TextUtils.isEmpty(s3))
        {
            s1 = (new StringBuilder("<media:description type='plain'>")).append(Util.a(s3, 5000, "")).append("</media:description>").toString();
        } else
        {
            s1 = "";
        }
        s2 = s2.append(s1).append("<media:category scheme='http://gdata.youtube.com/schemas/2007/categories.cat'>");
        s1 = s4;
        if (TextUtils.isEmpty(s4))
        {
            s1 = "People";
        }
        s2 = s2.append(s1).append("</media:category><media:keywords>").append(Util.b(s5, 500, "")).append("</media:keywords>");
        if (privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE)
        {
            s1 = "<yt:private/>";
        } else
        {
            s3 = new StringBuilder("<yt:accessControl action='list' permission='");
            if (privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC)
            {
                s1 = "allowed";
            } else
            {
                s1 = "denied";
            }
            s1 = s3.append(s1).append("'/>").toString();
        }
        privacy = s2.append(s1).append("</media:group>");
        if (pair != null)
        {
            s1 = (new StringBuilder("<georss:where><gml:Point><gml:pos>")).append(pair.first).append(" ").append(pair.second).append("</gml:pos></gml:Point></georss:where>").toString();
        } else
        {
            s1 = "";
        }
        s1 = privacy.append(s1).append("</entry>").toString();
        return GDataRequest.a(b.c().buildUpon().path("/resumable/feeds/api/users/default/uploads").build(), hashmap, com.google.android.apps.youtube.common.e.m.a(s1));
    }

    public final GDataRequest a(String s1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        Uri uri = b.a().buildUpon().appendPath("users").appendPath("default").appendPath("playlists").build();
        StringBuilder stringbuilder = (new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'><title type='text'>")).append(Util.a(s1, 60, "")).append("</title><summary></summary>");
        if (flag)
        {
            s1 = "<yt:private/>";
        } else
        {
            s1 = "";
        }
        return GDataRequest.a(uri, com.google.android.apps.youtube.common.e.m.a(stringbuilder.append(s1).append("</entry>").toString()));
    }

    public final Uri b()
    {
        return b.a().buildUpon().appendPath("videos").build();
    }

    public final GDataRequest b(int i1)
    {
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/favorites").build().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest b(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        uri = uri.buildUpon();
        a(uri, 1, d);
        return GDataRequest.a(uri.build());
    }

    public final GDataRequest b(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return GDataRequest.a(b.b().buildUpon().path("feeds/player/videos").appendQueryParameter("make", Build.MANUFACTURER).appendQueryParameter("model", Build.MODEL).build().buildUpon().appendPath(s1).build());
    }

    public final Uri c()
    {
        return b.a().buildUpon().appendPath("videos").appendPath("batch").build();
    }

    public final GDataRequest c(int i1)
    {
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/watch_later").build().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest c(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "channelId cannot be empty");
        return GDataRequest.a(b.a().buildUpon().appendPath("channels").appendPath(s1).build());
    }

    public final GDataRequest d()
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("thefeed").build());
    }

    public final GDataRequest d(int i1)
    {
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/watch_history").appendQueryParameter("inline", "true").build().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest d(Uri uri)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        uri = uri.buildUpon().appendQueryParameter("inline", "true");
        b(uri);
        return GDataRequest.a(uri.build());
    }

    public final GDataRequest d(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "username cannot be empty");
        return GDataRequest.a(p(s1));
    }

    public final GDataRequest e()
    {
        return o();
    }

    public final GDataRequest e(int i1)
    {
        android.net.Uri.Builder builder = a().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest e(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "videoId cannot be empty");
        return GDataRequest.a(t().buildUpon().appendPath(s1).build());
    }

    public final GDataRequest f()
    {
        return GDataRequest.a(p("default"));
    }

    public final GDataRequest f(Uri uri)
    {
        int i1 = d;
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        uri = uri.buildUpon();
        a(uri, 1, i1);
        return GDataRequest.a(uri.build());
    }

    public final GDataRequest f(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = b.a().buildUpon().appendPath("playlists").appendPath(s1);
        a(s1, 1, 0);
        return GDataRequest.a(s1.build());
    }

    public final GDataRequest g()
    {
        return a(d);
    }

    public final GDataRequest g(Uri uri)
    {
        uri = uri.buildUpon();
        a(uri, 1, 0);
        return GDataRequest.a(uri.build());
    }

    public final GDataRequest g(String s1)
    {
        int i1 = d;
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        s1 = b.a().buildUpon().appendPath("playlists").appendEncodedPath(s1);
        a(s1, 1, i1);
        return GDataRequest.a(s1.build());
    }

    public final GDataRequest h()
    {
        return a("live_now", ((UpcomingTimeFilter) (null)));
    }

    public final GDataRequest h(Uri uri)
    {
        int i1 = d;
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        return GDataRequest.a(a(uri, i1));
    }

    public final GDataRequest h(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "userId cannot be empty");
        s1 = u().buildUpon().appendQueryParameter("fields", (new StringBuilder("entry[yt:username='")).append(s1).append("']").toString());
        a(s1, 1, 50);
        return GDataRequest.a(s1.build());
    }

    public final Uri i(String s1)
    {
        s1 = q(s1);
        android.net.Uri.Builder builder = b.a().buildUpon();
        builder.appendPath("channelstandardfeeds");
        if (s1 != null)
        {
            builder.appendPath(s1);
        }
        builder.appendPath("most_viewed");
        return builder.build();
    }

    public final GDataRequest i()
    {
        return a("recently_broadcasted", ((UpcomingTimeFilter) (null)));
    }

    public final GDataRequest j()
    {
        return b(d);
    }

    public final GDataRequest j(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return GDataRequest.a(b.a().buildUpon().appendPath("partners").appendPath(s1).appendPath("branding").appendPath("default").build());
    }

    public final GDataRequest k()
    {
        return c(d);
    }

    public final GDataRequest k(String s1)
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("favorites").build(), com.google.android.apps.youtube.common.e.m.a((new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom'><id>")).append(s1).append("</id></entry>").toString()));
    }

    public final GDataRequest l()
    {
        return d(d);
    }

    public final GDataRequest l(String s1)
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("watch_later").build(), com.google.android.apps.youtube.common.e.m.a((new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'><id>")).append(s1).append("</id></entry>").toString()));
    }

    public final GDataRequest m()
    {
        int i1 = d;
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/playlists").build().buildUpon();
        a(builder, 1, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest m(String s1)
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("watch_history").build(), com.google.android.apps.youtube.common.e.m.a((new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'><id>")).append(s1).append("</id></entry>").toString()));
    }

    public final GDataRequest n()
    {
        return GDataRequest.a(a(u(), d));
    }

    public final GDataRequest n(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("playlists").appendPath(s1).build());
    }

    public final GDataRequest o()
    {
        int i1 = d;
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/newsubscriptionvideos").build().buildUpon();
        a(builder, i1);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest o(String s1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "username can't be empty");
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("subscriptions").build(), com.google.android.apps.youtube.common.e.m.a((new StringBuilder("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'><category scheme='http://gdata.youtube.com/schemas/2007/subscriptiontypes.cat' term='user'/><yt:username>")).append(s1).append("</yt:username></entry>").toString()));
    }

    public final GDataRequest p()
    {
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/subtivity").appendQueryParameter("inline", "true").build().buildUpon();
        a(builder);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest q()
    {
        android.net.Uri.Builder builder = b.b().buildUpon().path("/feeds/api/users/default/recommendations").build().buildUpon();
        a(builder);
        return GDataRequest.a(builder.build());
    }

    public final GDataRequest r()
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("users").appendPath("default").appendPath("watch_history").appendPath("actions").appendPath("clear").build(), com.google.android.apps.youtube.common.e.m.a("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom'></entry>"));
    }

    public final GDataRequest s()
    {
        return GDataRequest.a(b.a().buildUpon().appendPath("channels").build(), com.google.android.apps.youtube.common.e.m.a("<?xml version='1.0' encoding='UTF-8'?><entry xmlns='http://www.w3.org/2005/Atom' xmlns:yt='http://gdata.youtube.com/schemas/2007'></entry>"));
    }


    private class ChannelFeed extends Enum
    {

        private static final ChannelFeed $VALUES[];
        public static final ChannelFeed MOST_SUBSCRIBED;
        public static final ChannelFeed MOST_VIEWED;
        public static final ChannelFeed NOTEWORTHY;

        public static ChannelFeed valueOf(String s1)
        {
            return (ChannelFeed)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$ChannelFeed, s1);
        }

        public static ChannelFeed[] values()
        {
            return (ChannelFeed[])$VALUES.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase(Locale.US);
        }

        static 
        {
            MOST_SUBSCRIBED = new ChannelFeed("MOST_SUBSCRIBED", 0);
            MOST_VIEWED = new ChannelFeed("MOST_VIEWED", 1);
            NOTEWORTHY = new ChannelFeed("NOTEWORTHY", 2);
            $VALUES = (new ChannelFeed[] {
                MOST_SUBSCRIBED, MOST_VIEWED, NOTEWORTHY
            });
        }

        private ChannelFeed(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class StandardFeed extends Enum
    {

        private static final StandardFeed $VALUES[];
        public static final StandardFeed MOST_DISCUSSED;
        public static final StandardFeed MOST_LINKED;
        public static final StandardFeed MOST_POPULAR;
        public static final StandardFeed MOST_RESPONDED;
        public static final StandardFeed MOST_VIEWED;
        public static final StandardFeed ON_THE_WEB;
        public static final StandardFeed RECENTLY_FEATURED;
        public static final StandardFeed TOP_FAVORITES;
        public static final StandardFeed TOP_RATED;
        public static final StandardFeed WATCH_ON_MOBILE;

        public static StandardFeed valueOf(String s1)
        {
            return (StandardFeed)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$StandardFeed, s1);
        }

        public static StandardFeed[] values()
        {
            return (StandardFeed[])$VALUES.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase(Locale.US);
        }

        static 
        {
            MOST_VIEWED = new StandardFeed("MOST_VIEWED", 0);
            TOP_RATED = new StandardFeed("TOP_RATED", 1);
            MOST_DISCUSSED = new StandardFeed("MOST_DISCUSSED", 2);
            TOP_FAVORITES = new StandardFeed("TOP_FAVORITES", 3);
            MOST_RESPONDED = new StandardFeed("MOST_RESPONDED", 4);
            MOST_POPULAR = new StandardFeed("MOST_POPULAR", 5);
            MOST_LINKED = new StandardFeed("MOST_LINKED", 6);
            RECENTLY_FEATURED = new StandardFeed("RECENTLY_FEATURED", 7);
            WATCH_ON_MOBILE = new StandardFeed("WATCH_ON_MOBILE", 8);
            ON_THE_WEB = new StandardFeed("ON_THE_WEB", 9);
            $VALUES = (new StandardFeed[] {
                MOST_VIEWED, TOP_RATED, MOST_DISCUSSED, TOP_FAVORITES, MOST_RESPONDED, MOST_POPULAR, MOST_LINKED, RECENTLY_FEATURED, WATCH_ON_MOBILE, ON_THE_WEB
            });
        }

        private StandardFeed(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class TimeFilter extends Enum
    {

        private static final TimeFilter $VALUES[];
        public static final TimeFilter ALL_TIME;
        public static final String PARAM_NAME = "time";
        public static final TimeFilter THIS_MONTH;
        public static final TimeFilter THIS_WEEK;
        public static final TimeFilter TODAY;
        public final int stringId;

        public static TimeFilter valueOf(String s1)
        {
            return (TimeFilter)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$TimeFilter, s1);
        }

        public static TimeFilter[] values()
        {
            return (TimeFilter[])$VALUES.clone();
        }

        public final String toString()
        {
            return super.toString().toLowerCase(Locale.US);
        }

        static 
        {
            TODAY = new TimeFilter("TODAY", 0, p.gg);
            THIS_WEEK = new TimeFilter("THIS_WEEK", 1, p.gf);
            THIS_MONTH = new TimeFilter("THIS_MONTH", 2, p.ge);
            ALL_TIME = new TimeFilter("ALL_TIME", 3, p.gb);
            $VALUES = (new TimeFilter[] {
                TODAY, THIS_WEEK, THIS_MONTH, ALL_TIME
            });
        }

        private TimeFilter(String s1, int i1, int j1)
        {
            super(s1, i1);
            stringId = j1;
        }
    }


    private class ComplaintReason extends Enum
    {

        private static final ComplaintReason $VALUES[];
        public static final ComplaintReason DANGEROUS;
        public static final ComplaintReason HATE;
        public static final ComplaintReason PORN;
        public static final ComplaintReason RIGHTS;
        public static final ComplaintReason SPAM;
        public static final ComplaintReason VIOLENCE;
        public final int stringId;

        public static ComplaintReason valueOf(String s1)
        {
            return (ComplaintReason)Enum.valueOf(com/google/android/apps/youtube/core/async/GDataRequestFactory$ComplaintReason, s1);
        }

        public static ComplaintReason[] values()
        {
            return (ComplaintReason[])$VALUES.clone();
        }

        static 
        {
            PORN = new ComplaintReason("PORN", 0, p.bT);
            VIOLENCE = new ComplaintReason("VIOLENCE", 1, p.bW);
            HATE = new ComplaintReason("HATE", 2, p.bS);
            DANGEROUS = new ComplaintReason("DANGEROUS", 3, p.bR);
            RIGHTS = new ComplaintReason("RIGHTS", 4, p.bU);
            SPAM = new ComplaintReason("SPAM", 5, p.bV);
            $VALUES = (new ComplaintReason[] {
                PORN, VIOLENCE, HATE, DANGEROUS, RIGHTS, SPAM
            });
        }

        private ComplaintReason(String s1, int i1, int j1)
        {
            super(s1, i1);
            stringId = j1;
        }
    }

}
