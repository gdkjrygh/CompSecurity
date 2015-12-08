// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.zza.zza
    {

        public BaseGamesApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(Games.zzNX, googleapiclient);
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public final boolean zzanC;
        public final boolean zzanD;
        public final int zzanE;
        public final boolean zzanF;
        public final int zzanG;
        public final String zzanH;
        public final ArrayList zzanI;

        public static Builder builder()
        {
            return new Builder();
        }

        public Bundle zzrI()
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", zzanC);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", zzanD);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", zzanE);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", zzanF);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", zzanG);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", zzanH);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", zzanI);
            return bundle;
        }

        private GamesOptions()
        {
            zzanC = false;
            zzanD = true;
            zzanE = 17;
            zzanF = false;
            zzanG = 4368;
            zzanH = null;
            zzanI = new ArrayList();
        }


        private GamesOptions(Builder builder1)
        {
            zzanC = builder1.zzanC;
            zzanD = builder1.zzanD;
            zzanE = builder1.zzanE;
            zzanF = builder1.zzanF;
            zzanG = builder1.zzanG;
            zzanH = builder1.zzanH;
            zzanI = builder1.zzanI;
        }

    }

    public static final class GamesOptions.Builder
    {

        boolean zzanC;
        boolean zzanD;
        int zzanE;
        boolean zzanF;
        int zzanG;
        String zzanH;
        ArrayList zzanI;

        public GamesOptions build()
        {
            return new GamesOptions(this);
        }

        public GamesOptions.Builder setSdkVariant(int i)
        {
            zzanG = i;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag)
        {
            zzanD = flag;
            zzanE = 17;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag, int i)
        {
            zzanD = flag;
            zzanE = i;
            return this;
        }

        private GamesOptions.Builder()
        {
            zzanC = false;
            zzanD = true;
            zzanE = 17;
            zzanF = false;
            zzanG = 4368;
            zzanH = null;
            zzanI = new ArrayList();
        }

    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl
    {

        public Result createFailedResult(Status status)
        {
            return zzb(status);
        }

        public Status zzb(Status status)
        {
            return status;
        }

        private SignOutImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public static final Api API;
    public static final Achievements Achievements = new AchievementsImpl();
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final String EXTRA_STATUS = "status";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    static final com.google.android.gms.common.api.Api.ClientKey zzNX;
    private static final com.google.android.gms.common.api.Api.zza zzNY;
    public static final Multiplayer zzanA = new MultiplayerImpl();
    public static final Acls zzanB = new AclsImpl();
    public static final Scope zzanx;
    public static final Api zzany;
    public static final AppContents zzanz = new AppContentsImpl();

    private Games()
    {
    }

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzsK();
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzsv();
    }

    public static int getSdkVariant(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzsJ();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return zzd(googleapiclient).zzsI();
    }

    public static void setGravityForPopups(GoogleApiClient googleapiclient, int i)
    {
        googleapiclient = zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzfC(i);
        }
    }

    public static void setViewForPopups(GoogleApiClient googleapiclient, View view)
    {
        zzu.zzu(view);
        googleapiclient = zzb(googleapiclient, false);
        if (googleapiclient != null)
        {
            googleapiclient.zzn(view);
        }
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.zzb(new SignOutImpl(googleapiclient) {

            protected volatile void zza(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                zza((GamesClientImpl)client);
            }

            protected void zza(GamesClientImpl gamesclientimpl)
                throws RemoteException
            {
                gamesclientimpl.zzb(this);
            }

        });
    }

    public static GamesClientImpl zzb(GoogleApiClient googleapiclient, boolean flag)
    {
        boolean flag1;
        if (googleapiclient != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzu.zzb(flag1, "GoogleApiClient parameter is required.");
        zzu.zza(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return zzc(googleapiclient, flag);
    }

    public static GamesClientImpl zzc(GoogleApiClient googleapiclient, boolean flag)
    {
        zzu.zza(googleapiclient.zza(API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        boolean flag1 = googleapiclient.hasConnectedApi(API);
        if (flag && !flag1)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        if (flag1)
        {
            return (GamesClientImpl)googleapiclient.zza(zzNX);
        } else
        {
            return null;
        }
    }

    public static GamesClientImpl zzd(GoogleApiClient googleapiclient)
    {
        return zzb(googleapiclient, true);
    }

    static 
    {
        zzNX = new com.google.android.gms.common.api.Api.ClientKey();
        zzNY = new com.google.android.gms.common.api.Api.zza() {

            public int getPriority()
            {
                return 1;
            }

            public volatile com.google.android.gms.common.api.Api.Client zza(Context context, Looper looper, zze zze, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return zza(context, looper, zze, (GamesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public GamesClientImpl zza(Context context, Looper looper, zze zze, GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (gamesoptions == null)
                {
                    gamesoptions = new GamesOptions();
                }
                return new GamesClientImpl(context, looper, zze, gamesoptions, connectioncallbacks, onconnectionfailedlistener);
            }

        };
        SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        API = new Api("Games.API", zzNY, zzNX, new Scope[] {
            SCOPE_GAMES
        });
        zzanx = new Scope("https://www.googleapis.com/auth/games.firstparty");
        zzany = new Api("Games.API_1P", zzNY, zzNX, new Scope[] {
            zzanx
        });
    }
}
