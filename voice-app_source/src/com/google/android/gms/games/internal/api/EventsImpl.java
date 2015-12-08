// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class EventsImpl
    implements Events
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzW(status);
        }

        public com.google.android.gms.games.event.Events.LoadEventsResult zzW(Status status)
        {
            return new com.google.android.gms.games.event.Events.LoadEventsResult(this, status) {

                final Status zzOl;
                final LoadImpl zzaqO;

                public EventBuffer getEvents()
                {
                    return new EventBuffer(DataHolder.zzbi(14));
                }

                public Status getStatus()
                {
                    return zzOl;
                }

                public void release()
                {
                }

            
            {
                zzaqO = loadimpl;
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

        public Result createFailedResult(Status status)
        {
            return new Result(this, status) {

                final Status zzOl;
                final UpdateImpl zzaqP;

                public Status getStatus()
                {
                    return zzOl;
                }

            
            {
                zzaqP = updateimpl;
                zzOl = status;
                super();
            }
            };
        }

        private UpdateImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public EventsImpl()
    {
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        GamesClientImpl gamesclientimpl = Games.zzc(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            return;
        }
        if (gamesclientimpl.isConnected())
        {
            gamesclientimpl.zzp(s, i);
            return;
        } else
        {
            googleapiclient.zzb(new UpdateImpl(googleapiclient, s, i) {

                final EventsImpl zzaqL;
                final String zzaqM;
                final int zzaqN;

                public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                    throws RemoteException
                {
                    zza((GamesClientImpl)client);
                }

                public void zza(GamesClientImpl gamesclientimpl1)
                {
                    gamesclientimpl1.zzp(zzaqM, zzaqN);
                }

            
            {
                zzaqL = EventsImpl.this;
                zzaqM = s;
                zzaqN = i;
                super(googleapiclient);
            }
            });
            return;
        }
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag) {

            final EventsImpl zzaqL;
            final boolean zzaqy;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzd(this, zzaqy);
            }

            
            {
                zzaqL = EventsImpl.this;
                zzaqy = flag;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.zza(new LoadImpl(googleapiclient, flag, as) {

            final String zzaqK[];
            final EventsImpl zzaqL;
            final boolean zzaqy;

            public volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            public void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zza(this, zzaqy, zzaqK);
            }

            
            {
                zzaqL = EventsImpl.this;
                zzaqy = flag;
                zzaqK = as;
                super(googleapiclient);
            }
        });
    }
}
