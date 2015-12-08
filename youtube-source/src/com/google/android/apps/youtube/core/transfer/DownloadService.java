// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.core.BaseApplication;
import com.google.android.apps.youtube.core.utils.h;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.security.Key;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransferService, c, a, m, 
//            l

public class DownloadService extends TransferService
{

    private Key b;

    public DownloadService()
    {
    }

    public static Intent a(Context context)
    {
        return TransferService.a(context, com/google/android/apps/youtube/core/transfer/DownloadService);
    }

    public final l a(Transfer transfer, m m)
    {
        return new c(transfer.b, transfer.a, transfer.f, m, true, false, l(), b);
    }

    public final Runnable a(Transfer transfer)
    {
        return new a(this, transfer);
    }

    protected final String d()
    {
        return "downloads.db";
    }

    protected final String e()
    {
        return "download_policy";
    }

    protected final String f()
    {
        return "download_only_while_charging";
    }

    protected final String g()
    {
        return "transfer_max_connections";
    }

    protected final String i()
    {
        return "download_max_rate";
    }

    public void onCreate()
    {
        super.onCreate();
        b = h.a(((BaseApplication)getApplication()).B());
    }
}
