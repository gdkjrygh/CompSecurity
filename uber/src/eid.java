// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.music.MusicActivity;
import com.ubercab.rider.realtime.model.Trip;

public final class eid
    implements ide
{

    final MusicActivity a;

    private eid(MusicActivity musicactivity)
    {
        a = musicactivity;
        super();
    }

    public eid(MusicActivity musicactivity, byte byte0)
    {
        this(musicactivity);
    }

    private void a(gjy gjy1)
    {
        if (!MusicActivity.a((Trip)gjy1.d()))
        {
            a.finish();
        }
    }

    public final void call(Object obj)
    {
        a((gjy)obj);
    }
}
