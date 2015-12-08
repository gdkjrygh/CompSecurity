// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

// Referenced classes of package com.google.android.exoplayer:
//            t

final class u
    implements t
{

    private final AudioTimestamp a = new AudioTimestamp();

    public u()
    {
    }

    public final long a()
    {
        return a.nanoTime;
    }

    public final boolean a(AudioTrack audiotrack)
    {
        return audiotrack.getTimestamp(a);
    }

    public final long b()
    {
        return a.framePosition;
    }
}
