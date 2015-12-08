// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.L;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app:
//            YouTubeApplication, ax

final class av
    implements Runnable
{

    final YouTubeApplication a;

    av(YouTubeApplication youtubeapplication)
    {
        a = youtubeapplication;
        super();
    }

    public final void run()
    {
        L.e("Clearing cache on signout");
        File afile[] = YouTubeApplication.a(a).av().listFiles();
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

        L.e("Cleared cache.");
    }
}
