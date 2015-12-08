// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.cache.a;
import com.google.android.apps.youtube.common.cache.m;
import com.google.android.apps.youtube.core.async.Timestamped;
import com.google.android.apps.youtube.datalib.legacy.model.Artist;
import com.google.android.apps.youtube.datalib.legacy.model.MusicVideo;
import java.util.Iterator;
import java.util.List;

final class ak
    implements m
{

    private ak()
    {
    }

    ak(byte byte0)
    {
        this();
    }

    public final void a(Object obj, Object obj1, a a1)
    {
        obj = (Timestamped)obj1;
        long l = ((Timestamped) (obj)).timestamp;
        for (obj = ((Artist)((Timestamped) (obj)).element).artistTape.iterator(); ((Iterator) (obj)).hasNext(); a1.a(((MusicVideo) (obj1)).videoId, new Timestamped(obj1, l)))
        {
            obj1 = (MusicVideo)((Iterator) (obj)).next();
        }

    }
}
