// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class zzKI extends com.google.android.gms.games.
{

    private final String zzKI;

    static String zza(zzKI zzki)
    {
        return zzki.zzKI;
    }

    public Result createFailedResult(Status status)
    {
        return zzR(status);
    }

    public com.google.android.gms.games.achievement.ntResult zzR(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(status) {

            final Status zzOl;
            final AchievementsImpl.UpdateImpl zzaqE;

            public String getAchievementId()
            {
                return AchievementsImpl.UpdateImpl.zza(zzaqE);
            }

            public Status getStatus()
            {
                return zzOl;
            }

            
            {
                zzaqE = AchievementsImpl.UpdateImpl.this;
                zzOl = status;
                super();
            }
        };
    }

    public _cls1.zzOl(String s, GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
        zzKI = s;
    }
}
