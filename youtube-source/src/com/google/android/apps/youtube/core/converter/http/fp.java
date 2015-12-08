// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.f;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            fq, gb, gm, gn, 
//            gl, gk, gj, gi, 
//            gh, gg, gf, ge, 
//            gd, gc, ga, fz, 
//            fy, fx, fw, fv, 
//            fu, ft, fs, fr, 
//            gr, gq, gp, go

public final class fp
{

    private static final Map a;
    private static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[] {
        "edit", "http://gdata.youtube.com/schemas/2007#video.captionTracks", "http://gdata.youtube.com/schemas/2007#live.event"
    })));

    static Map a()
    {
        return a;
    }

    public static void a(f f1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        s = (new StringBuilder()).append(s).append("/entry").toString();
        d(f1, s);
        f1.a(s, new fq());
    }

    static Set b()
    {
        return b;
    }

    public static void b(f f1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        s = (new StringBuilder()).append(s).append("/entry").toString();
        d(f1, s);
        f1.a(s, new gb());
    }

    public static void c(f f1, String s)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(f1);
        s = (new StringBuilder()).append(s).append("/entry").toString();
        d(f1, s);
        f1.a(s, new gm());
        f1.a((new StringBuilder()).append(s).append("/batch:status").toString(), new gn());
    }

    public static void d(f f1, String s)
    {
        f1.a((new StringBuilder()).append(s).append("/media:group/media:content").toString(), new gl()).a((new StringBuilder()).append(s).append("/media:group/media:thumbnail").toString(), new gk()).a((new StringBuilder()).append(s).append("/media:group/media:player").toString(), new gj()).a((new StringBuilder()).append(s).append("/media:group/yt:duration").toString(), new gi()).a((new StringBuilder()).append(s).append("/media:group/media:rating").toString(), new gh()).a((new StringBuilder()).append(s).append("/media:group/yt:videoid").toString(), new gg()).a((new StringBuilder()).append(s).append("/media:group/media:credit").toString(), new gf()).a((new StringBuilder()).append(s).append("/author/uri").toString(), new ge()).a((new StringBuilder()).append(s).append("/media:group/media:description").toString(), new gd()).a((new StringBuilder()).append(s).append("/media:group/media:keywords").toString(), new gc()).a((new StringBuilder()).append(s).append("/yt:statistics").toString(), new ga()).a((new StringBuilder()).append(s).append("/link").toString(), new fz()).a((new StringBuilder()).append(s).append("/category").toString(), new fy()).a((new StringBuilder()).append(s).append("/yt:rating").toString(), new fx()).a((new StringBuilder()).append(s).append("/yt:accessControl").toString(), new fw()).a((new StringBuilder()).append(s).append("/media:group/yt:private").toString(), new fv()).a((new StringBuilder()).append(s).append("/yt:location").toString(), new fu()).a((new StringBuilder()).append(s).append("/georss:where/gml:Point/gml:pos").toString(), new ft()).a((new StringBuilder()).append(s).append("/app:control/yt:state").toString(), new fs()).a((new StringBuilder()).append(s).append("/published").toString(), new fr()).a((new StringBuilder()).append(s).append("/media:group/yt:uploaded").toString(), new gr()).a((new StringBuilder()).append(s).append("/title").toString(), new gq()).a((new StringBuilder()).append(s).append("/yt:threed").toString(), new gp()).a((new StringBuilder()).append(s).append("/yt:paidContent").toString(), new go());
    }

    static 
    {
        HashMap hashmap = new HashMap(20);
        hashmap.put(null, com.google.android.apps.youtube.datalib.model.gdata.Video.State.PLAYABLE);
        hashmap.put("processing", com.google.android.apps.youtube.datalib.model.gdata.Video.State.PROCESSING);
        hashmap.put("deleted", com.google.android.apps.youtube.datalib.model.gdata.Video.State.DELETED);
        hashmap.put("requesterRegion", com.google.android.apps.youtube.datalib.model.gdata.Video.State.COUNTRY_RESTRICTED);
        hashmap.put("limitedSyndication", com.google.android.apps.youtube.datalib.model.gdata.Video.State.NOT_AVAILABLE_ON_MOBILE);
        hashmap.put("private", com.google.android.apps.youtube.datalib.model.gdata.Video.State.PRIVATE);
        hashmap.put("copyright", com.google.android.apps.youtube.datalib.model.gdata.Video.State.COPYRIGHT);
        hashmap.put("inappropriate", com.google.android.apps.youtube.datalib.model.gdata.Video.State.INAPPROPRIATE);
        hashmap.put("duplicate", com.google.android.apps.youtube.datalib.model.gdata.Video.State.DUPLICATE);
        hashmap.put("termsOfUse", com.google.android.apps.youtube.datalib.model.gdata.Video.State.TERMS_OF_USE);
        hashmap.put("suspended", com.google.android.apps.youtube.datalib.model.gdata.Video.State.ACCOUNT_SUSPENDED);
        hashmap.put("tooLong", com.google.android.apps.youtube.datalib.model.gdata.Video.State.VIDEO_TOO_LONG);
        hashmap.put("blocked", com.google.android.apps.youtube.datalib.model.gdata.Video.State.BLOCKED_BY_OWNER);
        hashmap.put("clientRestrict", com.google.android.apps.youtube.datalib.model.gdata.Video.State.BLOCKED_FOR_CLIENT_APP);
        hashmap.put("cantProcess", com.google.android.apps.youtube.datalib.model.gdata.Video.State.CANT_PROCESS);
        hashmap.put("invalidFormat", com.google.android.apps.youtube.datalib.model.gdata.Video.State.INVALID_FORMAT);
        hashmap.put("unsupportedCodec", com.google.android.apps.youtube.datalib.model.gdata.Video.State.UNSUPPORTED_CODEC);
        hashmap.put("empty", com.google.android.apps.youtube.datalib.model.gdata.Video.State.EMPTY);
        hashmap.put("tooSmall", com.google.android.apps.youtube.datalib.model.gdata.Video.State.TOO_SMALL);
        a = Collections.unmodifiableMap(hashmap);
    }
}
