// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.c;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.core.utils.aa;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.net.URLEncoder;
import org.apache.http.client.methods.HttpGet;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            gz

public final class di extends gz
    implements c
{

    private final e c = aa.a();

    public di(n n)
    {
        super(n);
    }

    private static StringBuilder a(String s, String s1, String s2, int i)
    {
        return (new StringBuilder("http://video.google.com/timedtext?hl=")).append(s1).append("&v=").append(s).append("&type=track&lang=").append(s1).append("&name=").append(URLEncoder.encode(s2)).append("&format=").append(i);
    }

    protected final e a()
    {
        return c;
    }

    public final Object a(Object obj)
    {
        SubtitleTrack subtitletrack = (SubtitleTrack)obj;
        obj = com.google.android.apps.youtube.common.fromguava.c.a(subtitletrack.videoId);
        if (subtitletrack.isAutoTranslated())
        {
            obj = a(((String) (obj)), subtitletrack.sourceLanguageCode, subtitletrack.trackName, subtitletrack.format);
            ((StringBuilder) (obj)).append("&tlang=").append(subtitletrack.languageCode);
        } else
        {
            obj = a(((String) (obj)), subtitletrack.languageCode, subtitletrack.trackName, subtitletrack.format);
        }
        return new HttpGet(((StringBuilder) (obj)).toString());
    }
}
