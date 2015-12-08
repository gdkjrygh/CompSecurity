// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.io.File;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            DownloadService

final class a
    implements Runnable
{

    final Transfer a;
    final DownloadService b;

    a(DownloadService downloadservice, Transfer transfer)
    {
        b = downloadservice;
        a = transfer;
        super();
    }

    public final void run()
    {
        File file = new File(a.a);
        if (file.exists() && !file.delete())
        {
            L.c((new StringBuilder("Failed to delete download: ")).append(a.a).toString());
        }
    }
}
