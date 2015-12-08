// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.SubtitleTrack;
import java.util.ArrayList;
import java.util.List;

public final class dh
    implements b
{

    private final b a;

    public dh(b b1)
    {
        a = (b)c.a(b1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        obj = (String)obj;
        a.a(obj, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj;
        obj1 = (List)obj1;
        ArrayList arraylist = new ArrayList();
        int j = ((List) (obj1)).size();
        for (int i = 0; i < j; i++)
        {
            SubtitleTrack subtitletrack = (SubtitleTrack)((List) (obj1)).get(i);
            arraylist.add(SubtitleTrack.create(subtitletrack.languageCode, subtitletrack.languageName, subtitletrack.trackName, ((String) (obj)), subtitletrack.format, subtitletrack.vssId));
        }

        a.a(obj, arraylist);
    }
}
