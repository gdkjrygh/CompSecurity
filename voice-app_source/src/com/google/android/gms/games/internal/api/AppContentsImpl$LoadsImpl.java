// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AppContentsImpl

private static abstract class _cls1.zzOl extends com.google.android.gms.games.pl
{

    public Result createFailedResult(Status status)
    {
        return zzV(status);
    }

    public com.google.android.gms.games.appcontent.Result zzV(Status status)
    {
        return new com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult(status) {

            final Status zzOl;
            final AppContentsImpl.LoadsImpl zzaqJ;

            public Status getStatus()
            {
                return zzOl;
            }

            public void release()
            {
            }

            
            {
                zzaqJ = AppContentsImpl.LoadsImpl.this;
                zzOl = status;
                super();
            }
        };
    }
}
