// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
    implements Achievements
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzQ(status);
        }

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult zzQ(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                final Status zzOl;
                final LoadImpl zzaqD;

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqD = loadimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String zzKI;

        static String zza(UpdateImpl updateimpl)
        {
            return updateimpl.zzKI;
        }

        public Result createFailedResult(Status status)
        {
            return zzR(status);
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult zzR(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                final Status zzOl;
                final UpdateImpl zzaqE;

                public String getAchievementId()
                {
                    return UpdateImpl.zza(zzaqE);
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzaqE = updateimpl;
                zzOl = status;
                super();
            }
            };
        }

        public UpdateImpl(String s, GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            zzKI = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.zzd(googleapiclient).zzsA();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            final String zzaqB;
            final int zzaqC;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(null, zzaqB, zzaqC);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                zzaqC = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            final String zzaqB;
            final int zzaqC;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzaqB, zzaqC);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                zzaqC = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag) {

            final boolean zzaqy;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzc(this, zzaqy);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            final String zzaqB;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(null, zzaqB);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            final String zzaqB;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzaqB);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                super(s, googleapiclient);
            }
        });
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            final String zzaqB;
            final int zzaqC;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(null, zzaqB, zzaqC);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                zzaqC = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s, i) {

            final String zzaqB;
            final int zzaqC;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzaqB, zzaqC);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                zzaqC = i;
                super(s, googleapiclient);
            }
        });
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            final String zzaqB;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(null, zzaqB);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new UpdateImpl(s, googleapiclient, s) {

            final String zzaqB;
            final AchievementsImpl zzaqz;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzaqB);
            }

            
            {
                zzaqz = AchievementsImpl.this;
                zzaqB = s1;
                super(s, googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        final String zzTE;
        final String zzaqA;
        final boolean zzaqy;

        public volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        public void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zzb(this, zzTE, zzaqA, zzaqy);
        }
    }

}
