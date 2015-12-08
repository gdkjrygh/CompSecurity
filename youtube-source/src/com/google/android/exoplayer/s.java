// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer;

import android.media.AudioTrack;
import android.os.ConditionVariable;

// Referenced classes of package com.google.android.exoplayer:
//            r

final class s extends Thread
{

    final AudioTrack a;
    final r b;

    s(r r1, AudioTrack audiotrack)
    {
        b = r1;
        a = audiotrack;
        super();
    }

    public final void run()
    {
        a.release();
        r.a(b).open();
        return;
        Exception exception;
        exception;
        r.a(b).open();
        throw exception;
    }
}
