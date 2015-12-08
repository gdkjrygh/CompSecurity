// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.f.o;

public final class a
{

    private final Bundle a;

    private a(Bundle bundle)
    {
        a = bundle;
    }

    a(Bundle bundle, byte byte0)
    {
        this(bundle);
    }

    public final Bundle a()
    {
        return a;
    }

    public final String toString()
    {
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        int i;
        stringbuilder = new StringBuilder();
        stringbuilder.append("MediaItemStatus{ ");
        stringbuilder.append("timestamp=");
        o.a(SystemClock.elapsedRealtime() - a.getLong("timestamp"), stringbuilder);
        stringbuilder.append(" ms ago");
        stringbuilder1 = stringbuilder.append(", playbackState=");
        i = a.getInt("playbackState", 7);
        i;
        JVM INSTR tableswitch 0 7: default 116
    //                   0 203
    //                   1 215
    //                   2 221
    //                   3 209
    //                   4 227
    //                   5 233
    //                   6 239
    //                   7 245;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        String s = Integer.toString(i);
_L11:
        stringbuilder1.append(s);
        stringbuilder.append(", contentPosition=").append(a.getLong("contentPosition", -1L));
        stringbuilder.append(", contentDuration=").append(a.getLong("contentDuration", -1L));
        stringbuilder.append(", extras=").append(a.getBundle("extras"));
        stringbuilder.append(" }");
        return stringbuilder.toString();
_L2:
        s = "pending";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "buffering";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "playing";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "paused";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "finished";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "canceled";
        continue; /* Loop/switch isn't completed */
_L8:
        s = "invalidated";
        continue; /* Loop/switch isn't completed */
_L9:
        s = "error";
        if (true) goto _L11; else goto _L10
_L10:
    }
}
