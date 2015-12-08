// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import android.accounts.Account;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.common.L;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            b

public final class a extends AbstractThreadedSyncAdapter
{

    private b a;

    public a(Context context, boolean flag)
    {
        super(context, true);
        a = ((YouTubeApplication)context.getApplicationContext()).h();
    }

    public final void onPerformSync(Account account, Bundle bundle, String s, ContentProviderClient contentproviderclient, SyncResult syncresult)
    {
        L.e("OfflineSyncAdapter.onPerformSync() called!");
        a.a();
    }
}
