// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import com.google.android.apps.youtube.common.L;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.app:
//            YouTubeApplication

final class au extends Thread
{

    final File a[];
    final YouTubeApplication b;

    au(YouTubeApplication youtubeapplication, File afile[])
    {
        b = youtubeapplication;
        a = afile;
        super();
    }

    public final void run()
    {
        L.e("cleaning cache directory");
        File afile[] = a;
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }
}
