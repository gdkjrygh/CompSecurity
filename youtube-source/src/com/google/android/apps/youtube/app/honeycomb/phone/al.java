// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.phone;


// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.phone:
//            YouTubeActivity

final class al
    implements Runnable
{

    final YouTubeActivity a;

    al(YouTubeActivity youtubeactivity)
    {
        a = youtubeactivity;
        super();
    }

    public final void run()
    {
        YouTubeActivity.a(a);
        YouTubeActivity.a(a, false);
    }
}
