// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appindexing;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.appindexing:
//            Action

public interface AppIndexApi
{
    public static final class AppIndexingLink
    {

        public final Uri appIndexingUrl;
        public final int viewId;
        public final Uri webUrl;
    }


    public abstract PendingResult end(GoogleApiClient googleapiclient, Action action);

    public abstract PendingResult start(GoogleApiClient googleapiclient, Action action);
}
