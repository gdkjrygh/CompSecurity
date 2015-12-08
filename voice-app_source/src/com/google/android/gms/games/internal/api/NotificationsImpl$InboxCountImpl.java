// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            NotificationsImpl

private static abstract class _cls1.zzOl extends com.google.android.gms.games.boxCountImpl
{

    public Result createFailedResult(Status status)
    {
        return zzai(status);
    }

    public com.google.android.gms.games.boxCountImpl zzai(Status status)
    {
        return new com.google.android.gms.games.Notifications.InboxCountResult(status) {

            final Status zzOl;
            final NotificationsImpl.InboxCountImpl zzart;

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzart = NotificationsImpl.InboxCountImpl.this;
                zzOl = status;
                super();
            }
        };
    }
}
