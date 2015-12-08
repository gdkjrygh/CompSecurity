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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl
    implements Quests
{
    private static abstract class AcceptImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzan(status);
        }

        public com.google.android.gms.games.quest.Quests.AcceptQuestResult zzan(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(this, status) {

                final Status zzOl;
                final AcceptImpl zzarL;

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarL = acceptimpl;
                zzOl = status;
                super();
            }
            };
        }

        private AcceptImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class ClaimImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzao(status);
        }

        public com.google.android.gms.games.quest.Quests.ClaimMilestoneResult zzao(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(this, status) {

                final Status zzOl;
                final ClaimImpl zzarM;

                public Milestone getMilestone()
                {
                    return null;
                }

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzarM = claimimpl;
                zzOl = status;
                super();
            }
            };
        }

        private ClaimImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzap(status);
        }

        public com.google.android.gms.games.quest.Quests.LoadQuestsResult zzap(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(this, status) {

                final Status zzOl;
                final LoadsImpl zzarN;

                public QuestBuffer getQuests()
                {
                    return new QuestBuffer(DataHolder.zzbi(zzOl.getStatusCode()));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzarN = loadsimpl;
                zzOl = status;
                super();
            }
            };
        }

        private LoadsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public QuestsImpl()
    {
    }

    public PendingResult accept(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.zzb(new AcceptImpl(googleapiclient, s) {

            final String zzarF;
            final QuestsImpl zzarG;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzh(this, zzarF);
            }

            
            {
                zzarG = QuestsImpl.this;
                zzarF = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult claim(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.zzb(new ClaimImpl(googleapiclient, s, s1) {

            final String zzarF;
            final QuestsImpl zzarG;
            final String zzarH;

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzarF, zzarH);
            }

            
            {
                zzarG = QuestsImpl.this;
                zzarF = s;
                zzarH = s1;
                super(googleapiclient);
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.zzd(googleapiclient).zzcO(s);
    }

    public Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[])
    {
        return Games.zzd(googleapiclient).zzb(ai);
    }

    public PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        return googleapiclient.zza(new LoadsImpl(googleapiclient, ai, i, flag) {

            final int zzaqV;
            final boolean zzaqy;
            final QuestsImpl zzarG;
            final int zzarI[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzarI, zzaqV, zzaqy);
            }

            
            {
                zzarG = QuestsImpl.this;
                zzarI = ai;
                zzaqV = i;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.zza(new LoadsImpl(googleapiclient, flag, as) {

            final boolean zzaqy;
            final QuestsImpl zzarG;
            final String zzarJ[];

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this, zzaqy, zzarJ);
            }

            
            {
                zzarG = QuestsImpl.this;
                zzaqy = flag;
                zzarJ = as;
                super(googleapiclient);
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        GamesClientImpl gamesclientimpl = Games.zzb(googleapiclient, false);
        if (gamesclientimpl != null)
        {
            gamesclientimpl.zzc(googleapiclient.zzo(questupdatelistener));
        }
    }

    public void showStateChangedPopup(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzcP(s);
        }
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzsF();
        }
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$5

/* anonymous class */
    class _cls5 extends LoadsImpl
    {

        final String zzaqA;
        final int zzaqV;
        final boolean zzaqy;
        final int zzarI[];
        final String zzarK;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqA, zzarK, zzarI, zzaqV, zzaqy);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$6

/* anonymous class */
    class _cls6 extends LoadsImpl
    {

        final String zzaqA;
        final boolean zzaqy;
        final String zzarJ[];
        final String zzarK;

        protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
            throws RemoteException
        {
            zza((GamesClientImpl)client);
        }

        protected void zza(GamesClientImpl gamesclientimpl)
            throws RemoteException
        {
            gamesclientimpl.zza(this, zzaqA, zzarK, zzaqy, zzarJ);
        }
    }

}
