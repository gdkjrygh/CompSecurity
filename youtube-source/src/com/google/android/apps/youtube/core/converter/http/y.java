// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.core.converter.f;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            dq, aa, z

public final class y
{

    public static void a(f f1, String s)
    {
        dq.a(f1, s);
        f1.a((new StringBuilder()).append(s).append("/entry/yt:channelStatistics").toString(), new aa()).a((new StringBuilder()).append(s).append("/entry/media:group/media:thumbnail").toString(), new z());
    }
}
