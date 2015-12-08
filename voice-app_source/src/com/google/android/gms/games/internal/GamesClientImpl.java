// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zzb;
import com.google.android.gms.common.api.zzc;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zze;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.OnNearbyPlayerDetectedListener;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.event.EventBuffer;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import com.google.android.gms.games.internal.game.GameInstanceBuffer;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.LeaderboardBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardEntity;
import com.google.android.gms.games.leaderboard.LeaderboardScore;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.leaderboard.LeaderboardScoreEntity;
import com.google.android.gms.games.leaderboard.ScoreSubmissionData;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessageReceivedListener;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.realtime.RoomStatusUpdateListener;
import com.google.android.gms.games.multiplayer.realtime.RoomUpdateListener;
import com.google.android.gms.games.multiplayer.turnbased.LoadMatchesResponse;
import com.google.android.gms.games.multiplayer.turnbased.OnTurnBasedMatchUpdateReceivedListener;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatch;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchBuffer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestEntity;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.OnRequestReceivedListener;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotContentsEntity;
import com.google.android.gms.games.snapshot.SnapshotEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataBuffer;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataEntity;
import com.google.android.gms.signin.internal.zzh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.games.internal:
//            PopupManager, GamesLog, IGamesService, AbstractGamesCallbacks, 
//            AbstractGamesClient, PopupLocationInfoParcelable

public final class GamesClientImpl extends zzi
{
    private static abstract class AbstractPeerStatusNotifier extends AbstractRoomStatusNotifier
    {

        private final ArrayList zzapa = new ArrayList();

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            zza(roomstatusupdatelistener, room, zzapa);
        }

        protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist);

        AbstractPeerStatusNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder);
            int i = 0;
            for (int j = as.length; i < j; i++)
            {
                zzapa.add(as[i]);
            }

        }
    }

    private static abstract class AbstractRoomNotifier extends zzb
    {

        protected void zza(RoomUpdateListener roomupdatelistener, DataHolder dataholder)
        {
            zza(roomupdatelistener, GamesClientImpl.zzV(dataholder), dataholder.getStatusCode());
        }

        protected abstract void zza(RoomUpdateListener roomupdatelistener, Room room, int i);

        protected volatile void zza(Object obj, DataHolder dataholder)
        {
            zza((RoomUpdateListener)obj, dataholder);
        }

        AbstractRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static abstract class AbstractRoomStatusNotifier extends zzb
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, DataHolder dataholder)
        {
            zza(roomstatusupdatelistener, GamesClientImpl.zzV(dataholder));
        }

        protected abstract void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room);

        protected volatile void zza(Object obj, DataHolder dataholder)
        {
            zza((RoomStatusUpdateListener)obj, dataholder);
        }

        AbstractRoomStatusNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class AcceptQuestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.AcceptQuestResult
    {

        private final Quest zzapb = null;

        public Quest getQuest()
        {
            return zzapb;
        }

        AcceptQuestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapb = new QuestEntity((Quest)dataholder.get(0));
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class AchievementUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzf(int i, String s)
        {
            zzOs.zzm(new UpdateAchievementResultImpl(i, s));
        }

        AchievementUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class AchievementsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzf(DataHolder dataholder)
        {
            zzOs.zzm(new LoadAchievementsResultImpl(dataholder));
        }

        AchievementsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class AppContentLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapc;

        public void zza(DataHolder adataholder[])
        {
            zzapc.zzm(new LoadAppContentsResultImpl(adataholder));
        }

        public AppContentLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapc = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class CancelMatchResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.CancelMatchResult
    {

        private final Status zzOt;
        private final String zzapd;

        public String getMatchId()
        {
            return zzapd;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        CancelMatchResultImpl(Status status, String s)
        {
            zzOt = status;
            zzapd = s;
        }
    }

    private static final class ClaimMilestoneResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.ClaimMilestoneResult
    {

        private final Quest zzapb;
        private final Milestone zzape = null;

        public Milestone getMilestone()
        {
            return zzape;
        }

        public Quest getQuest()
        {
            return zzapb;
        }

        ClaimMilestoneResultImpl(DataHolder dataholder, String s)
        {
            int i;
            i = 0;
            super(dataholder);
            dataholder = new QuestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            List list;
            int j;
            zzapb = new QuestEntity((Quest)dataholder.get(0));
            list = zzapb.zztN();
            j = list.size();
_L4:
            if (i >= j)
            {
                break; /* Loop/switch isn't completed */
            }
            if (!((Milestone)list.get(i)).getMilestoneId().equals(s))
            {
                break MISSING_BLOCK_LABEL_111;
            }
            zzape = (Milestone)list.get(i);
            dataholder.release();
            return;
            i++;
            if (true) goto _L4; else goto _L3
_L3:
_L6:
            dataholder.release();
            return;
_L2:
            zzape = null;
            zzapb = null;
            if (true) goto _L6; else goto _L5
_L5:
            s;
            dataholder.release();
            throw s;
        }
    }

    private static final class CommitSnapshotResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.CommitSnapshotResult
    {

        private final SnapshotMetadata zzapf = null;

        public SnapshotMetadata getSnapshotMetadata()
        {
            return zzapf;
        }

        CommitSnapshotResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new SnapshotMetadataBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapf = new SnapshotMetadataEntity(dataholder.get(0));
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class ConnectedToRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onConnectedToRoom(room);
        }

        ConnectedToRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingLoadResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Notifications.ContactSettingLoadResult
    {

        ContactSettingLoadResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class ContactSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzG(DataHolder dataholder)
        {
            zzOs.zzm(new ContactSettingLoadResultImpl(dataholder));
        }

        ContactSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class ContactSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzfz(int i)
        {
            zzOs.zzm(GamesStatusCodes.zzfn(i));
        }

        ContactSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class DeleteSnapshotResultImpl
        implements com.google.android.gms.games.snapshot.Snapshots.DeleteSnapshotResult
    {

        private final Status zzOt;
        private final String zzapg;

        public String getSnapshotId()
        {
            return zzapg;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        DeleteSnapshotResultImpl(int i, String s)
        {
            zzOt = GamesStatusCodes.zzfn(i);
            zzapg = s;
        }
    }

    private static final class DisconnectedFromRoomNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onDisconnectedFromRoom(room);
        }

        DisconnectedFromRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class EventsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzg(DataHolder dataholder)
        {
            zzOs.zzm(new LoadEventResultImpl(dataholder));
        }

        EventsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private class GameClientEventIncrementCache extends EventIncrementCache
    {

        final GamesClientImpl zzaoZ;

        protected void zzs(String s, int i)
        {
            if (zzaoZ.isConnected())
            {
                ((IGamesService)zzaoZ.zznM()).zzp(s, i);
                return;
            }
            try
            {
                GamesLog.zzv("GamesClientImpl", (new StringBuilder()).append("Unable to increment event ").append(s).append(" by ").append(i).append(" because the games client is no longer connected").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                GamesClientImpl.zza(zzaoZ, s);
            }
            return;
        }

        public GameClientEventIncrementCache()
        {
            zzaoZ = GamesClientImpl.this;
            super(getContext().getMainLooper(), 1000);
        }
    }

    private static final class GameInstancesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzn(DataHolder dataholder)
        {
            zzOs.zzm(new LoadGameInstancesResultImpl(dataholder));
        }

        GameInstancesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusChangeResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusChangeResult
    {

        private final Status zzOt;
        private final String zzaph;
        private final boolean zzapi;

        public Status getStatus()
        {
            return zzOt;
        }

        public GameMuteStatusChangeResultImpl(int i, String s, boolean flag)
        {
            zzOt = GamesStatusCodes.zzfn(i);
            zzaph = s;
            zzapi = flag;
        }
    }

    private static final class GameMuteStatusChangedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(int i, String s, boolean flag)
        {
            zzOs.zzm(new GameMuteStatusChangeResultImpl(i, s, flag));
        }

        GameMuteStatusChangedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameMuteStatusLoadResultImpl
        implements com.google.android.gms.games.Notifications.GameMuteStatusLoadResult
    {

        private final Status zzOt;
        private final String zzaph;
        private final boolean zzapi;

        public Status getStatus()
        {
            return zzOt;
        }

        public GameMuteStatusLoadResultImpl(DataHolder dataholder)
        {
            zzOt = GamesStatusCodes.zzfn(dataholder.getStatusCode());
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzaph = dataholder.zzd("external_game_id", 0, 0);
            zzapi = dataholder.zze("muted", 0, 0);
_L4:
            dataholder.close();
            return;
_L2:
            zzaph = null;
            zzapi = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class GameMuteStatusLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzE(DataHolder dataholder)
        {
            zzOs.zzm(new GameMuteStatusLoadResultImpl(dataholder));
        }

        GameMuteStatusLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class GameSearchSuggestionsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzo(DataHolder dataholder)
        {
            zzOs.zzm(new LoadGameSearchSuggestionsResultImpl(dataholder));
        }

        GameSearchSuggestionsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static abstract class GamesDataHolderResult extends zzc
    {

        protected GamesDataHolderResult(DataHolder dataholder)
        {
            super(dataholder, GamesStatusCodes.zzfn(dataholder.getStatusCode()));
        }
    }

    private static final class GamesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzl(DataHolder dataholder)
        {
            zzOs.zzm(new LoadGamesResultImpl(dataholder));
        }

        GamesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class InboxCountResultImpl
        implements com.google.android.gms.games.Notifications.InboxCountResult
    {

        private final Status zzOt;
        private final Bundle zzapj;

        public Status getStatus()
        {
            return zzOt;
        }

        InboxCountResultImpl(Status status, Bundle bundle)
        {
            zzOt = status;
            zzapj = bundle;
        }
    }

    private static final class InboxCountsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzg(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzfn(i);
            zzOs.zzm(new InboxCountResultImpl(status, bundle));
        }

        InboxCountsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class InitiateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.InitiateMatchResult
    {

        InitiateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class InvitationReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zzi zzafi;

        public void onInvitationRemoved(String s)
        {
            zzafi.zza(new InvitationRemovedNotifier(s));
        }

        public void zzq(DataHolder dataholder)
        {
            InvitationBuffer invitationbuffer;
            invitationbuffer = new InvitationBuffer(dataholder);
            dataholder = null;
            if (invitationbuffer.getCount() > 0)
            {
                dataholder = (Invitation)((Invitation)invitationbuffer.get(0)).freeze();
            }
            invitationbuffer.release();
            if (dataholder != null)
            {
                zzafi.zza(new InvitationReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            invitationbuffer.release();
            throw dataholder;
        }

        InvitationReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzafi = zzi1;
        }
    }

    private static final class InvitationReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final Invitation zzapk;

        public void zza(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationReceived(zzapk);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnInvitationReceivedListener)obj);
        }

        InvitationReceivedNotifier(Invitation invitation)
        {
            zzapk = invitation;
        }
    }

    private static final class InvitationRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final String zzapl;

        public void zza(OnInvitationReceivedListener oninvitationreceivedlistener)
        {
            oninvitationreceivedlistener.onInvitationRemoved(zzapl);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnInvitationReceivedListener)obj);
        }

        InvitationRemovedNotifier(String s)
        {
            zzapl = s;
        }
    }

    private static final class InvitationsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzp(DataHolder dataholder)
        {
            zzOs.zzm(new LoadInvitationsResultImpl(dataholder));
        }

        InvitationsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class JoinedRoomNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onJoinedRoom(i, room);
        }

        public JoinedRoomNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeaderboardMetadataResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LeaderboardMetadataResult
    {

        private final LeaderboardBuffer zzapm;

        public LeaderboardBuffer getLeaderboards()
        {
            return zzapm;
        }

        LeaderboardMetadataResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapm = new LeaderboardBuffer(dataholder);
        }
    }

    private static final class LeaderboardScoresLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zza(DataHolder dataholder, DataHolder dataholder1)
        {
            zzOs.zzm(new LoadScoresResultImpl(dataholder, dataholder1));
        }

        LeaderboardScoresLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class LeaderboardsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzh(DataHolder dataholder)
        {
            zzOs.zzm(new LeaderboardMetadataResultImpl(dataholder));
        }

        LeaderboardsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class LeaveMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LeaveMatchResult
    {

        LeaveMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LeftRoomNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final int zzTS;
        private final String zzapn;

        public void zza(RoomUpdateListener roomupdatelistener)
        {
            roomupdatelistener.onLeftRoom(zzTS, zzapn);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((RoomUpdateListener)obj);
        }

        LeftRoomNotifier(int i, String s)
        {
            zzTS = i;
            zzapn = s;
        }
    }

    private static final class LoadAchievementsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult
    {

        private final AchievementBuffer zzapo;

        public AchievementBuffer getAchievements()
        {
            return zzapo;
        }

        LoadAchievementsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapo = new AchievementBuffer(dataholder);
        }
    }

    private static final class LoadAclResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.internal.game.Acls.LoadAclResult
    {

        LoadAclResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadAppContentsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.appcontent.AppContents.LoadAppContentResult
    {

        private final ArrayList zzapp;

        LoadAppContentsResultImpl(DataHolder adataholder[])
        {
            super(adataholder[0]);
            zzapp = new ArrayList(Arrays.asList(adataholder));
        }
    }

    private static final class LoadEventResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.event.Events.LoadEventsResult
    {

        private final EventBuffer zzapq;

        public EventBuffer getEvents()
        {
            return zzapq;
        }

        LoadEventResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapq = new EventBuffer(dataholder);
        }
    }

    private static final class LoadGameInstancesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGameInstancesResult
    {

        private final GameInstanceBuffer zzapr;

        LoadGameInstancesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapr = new GameInstanceBuffer(dataholder);
        }
    }

    private static final class LoadGameSearchSuggestionsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGameSearchSuggestionsResult
    {

        private final GameSearchSuggestionBuffer zzaps;

        LoadGameSearchSuggestionsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaps = new GameSearchSuggestionBuffer(dataholder);
        }
    }

    private static final class LoadGamesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.GamesMetadata.LoadGamesResult
    {

        private final GameBuffer zzapt;

        public GameBuffer getGames()
        {
            return zzapt;
        }

        LoadGamesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapt = new GameBuffer(dataholder);
        }
    }

    private static final class LoadInvitationsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult
    {

        private final InvitationBuffer zzapu;

        public InvitationBuffer getInvitations()
        {
            return zzapu;
        }

        LoadInvitationsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapu = new InvitationBuffer(dataholder);
        }
    }

    private static final class LoadMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchResult
    {

        LoadMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadMatchesResultImpl
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.LoadMatchesResult
    {

        private final Status zzOt;
        private final LoadMatchesResponse zzapv;

        public LoadMatchesResponse getMatches()
        {
            return zzapv;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            zzapv.release();
        }

        LoadMatchesResultImpl(Status status, Bundle bundle)
        {
            zzOt = status;
            zzapv = new LoadMatchesResponse(bundle);
        }
    }

    private static final class LoadPlayerScoreResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadPlayerScoreResult
    {

        private final LeaderboardScoreEntity zzapw = null;

        public LeaderboardScore getScore()
        {
            return zzapw;
        }

        LoadPlayerScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new LeaderboardScoreBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapw = (LeaderboardScoreEntity)dataholder.get(0).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class LoadPlayersResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadPlayersResult
    {

        private final PlayerBuffer zzapx;

        public PlayerBuffer getPlayers()
        {
            return zzapx;
        }

        LoadPlayersResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapx = new PlayerBuffer(dataholder);
        }
    }

    private static final class LoadProfileSettingsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadProfileSettingsResult
    {

        private final boolean zzaoN;
        private final boolean zzapy;

        public Status getStatus()
        {
            return zzOt;
        }

        public boolean isProfileVisible()
        {
            return zzaoN;
        }

        public boolean isVisibilityExplicitlySet()
        {
            return zzapy;
        }

        LoadProfileSettingsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            int i = dataholder.zzbh(0);
            zzaoN = dataholder.zze("profile_visible", 0, i);
            zzapy = dataholder.zze("profile_visibility_explicitly_set", 0, i);
_L4:
            dataholder.close();
            return;
_L2:
            zzaoN = true;
            zzapy = false;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class LoadQuestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.quest.Quests.LoadQuestsResult
    {

        private final DataHolder zzWu;

        public QuestBuffer getQuests()
        {
            return new QuestBuffer(zzWu);
        }

        LoadQuestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzWu = dataholder;
        }
    }

    private static final class LoadRequestSummariesResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.LoadRequestSummariesResult
    {

        LoadRequestSummariesResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadRequestsResultImpl
        implements com.google.android.gms.games.request.Requests.LoadRequestsResult
    {

        private final Status zzOt;
        private final Bundle zzapz;

        public GameRequestBuffer getRequests(int i)
        {
            String s = RequestType.zzfG(i);
            if (!zzapz.containsKey(s))
            {
                return null;
            } else
            {
                return new GameRequestBuffer((DataHolder)zzapz.get(s));
            }
        }

        public Status getStatus()
        {
            return zzOt;
        }

        public void release()
        {
            Iterator iterator = zzapz.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Object obj = (String)iterator.next();
                obj = (DataHolder)zzapz.getParcelable(((String) (obj)));
                if (obj != null)
                {
                    ((DataHolder) (obj)).close();
                }
            } while (true);
        }

        LoadRequestsResultImpl(Status status, Bundle bundle)
        {
            zzOt = status;
            zzapz = bundle;
        }
    }

    private static final class LoadScoresResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.LoadScoresResult
    {

        private final LeaderboardEntity zzapA = null;
        private final LeaderboardScoreBuffer zzapB;

        public Leaderboard getLeaderboard()
        {
            return zzapA;
        }

        public LeaderboardScoreBuffer getScores()
        {
            return zzapB;
        }

        LoadScoresResultImpl(DataHolder dataholder, DataHolder dataholder1)
        {
            super(dataholder1);
            dataholder = new LeaderboardBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapA = (LeaderboardEntity)((Leaderboard)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            zzapB = new LeaderboardScoreBuffer(dataholder1);
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            dataholder1;
            dataholder.release();
            throw dataholder1;
        }
    }

    private static final class LoadSnapshotsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.LoadSnapshotsResult
    {

        public SnapshotMetadataBuffer getSnapshots()
        {
            return new SnapshotMetadataBuffer(zzWu);
        }

        LoadSnapshotsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class LoadXpForGameCategoriesResultImpl
        implements com.google.android.gms.games.Players.LoadXpForGameCategoriesResult
    {

        private final Status zzOt;
        private final List zzapC;
        private final Bundle zzapD;

        public Status getStatus()
        {
            return zzOt;
        }

        LoadXpForGameCategoriesResultImpl(Status status, Bundle bundle)
        {
            zzOt = status;
            zzapC = bundle.getStringArrayList("game_category_list");
            zzapD = bundle;
        }
    }

    private static final class LoadXpStreamResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.Players.LoadXpStreamResult
    {

        private final ExperienceEventBuffer zzapE;

        LoadXpStreamResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzapE = new ExperienceEventBuffer(dataholder);
        }
    }

    private static final class MatchRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final String zzapF;

        public void zza(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchRemoved(zzapF);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        MatchRemovedNotifier(String s)
        {
            zzapF = s;
        }
    }

    private static final class MatchUpdateReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zzi zzafi;

        public void onTurnBasedMatchRemoved(String s)
        {
            zzafi.zza(new MatchRemovedNotifier(s));
        }

        public void zzw(DataHolder dataholder)
        {
            TurnBasedMatchBuffer turnbasedmatchbuffer;
            turnbasedmatchbuffer = new TurnBasedMatchBuffer(dataholder);
            dataholder = null;
            if (turnbasedmatchbuffer.getCount() > 0)
            {
                dataholder = (TurnBasedMatch)((TurnBasedMatch)turnbasedmatchbuffer.get(0)).freeze();
            }
            turnbasedmatchbuffer.release();
            if (dataholder != null)
            {
                zzafi.zza(new MatchUpdateReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            turnbasedmatchbuffer.release();
            throw dataholder;
        }

        MatchUpdateReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzafi = zzi1;
        }
    }

    private static final class MatchUpdateReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final TurnBasedMatch zzapG;

        public void zza(OnTurnBasedMatchUpdateReceivedListener onturnbasedmatchupdatereceivedlistener)
        {
            onturnbasedmatchupdatereceivedlistener.onTurnBasedMatchReceived(zzapG);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnTurnBasedMatchUpdateReceivedListener)obj);
        }

        MatchUpdateReceivedNotifier(TurnBasedMatch turnbasedmatch)
        {
            zzapG = turnbasedmatch;
        }
    }

    private static final class MessageReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final RealTimeMessage zzapH;

        public void zza(RealTimeMessageReceivedListener realtimemessagereceivedlistener)
        {
            realtimemessagereceivedlistener.onRealTimeMessageReceived(zzapH);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((RealTimeMessageReceivedListener)obj);
        }

        MessageReceivedNotifier(RealTimeMessage realtimemessage)
        {
            zzapH = realtimemessage;
        }
    }

    private static final class NearbyPlayerDetectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final Player zzapI;

        public void zza(OnNearbyPlayerDetectedListener onnearbyplayerdetectedlistener)
        {
            onnearbyplayerdetectedlistener.zza(zzapI);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnNearbyPlayerDetectedListener)obj);
        }
    }

    private static final class NotifyAclLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzF(DataHolder dataholder)
        {
            zzOs.zzm(new LoadAclResultImpl(dataholder));
        }

        NotifyAclLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class NotifyAclUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzfy(int i)
        {
            zzOs.zzm(GamesStatusCodes.zzfn(i));
        }

        NotifyAclUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class OpenSnapshotResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.snapshot.Snapshots.OpenSnapshotResult
    {

        private final Snapshot zzapJ;
        private final String zzapK;
        private final Snapshot zzapL;
        private final Contents zzapM;
        private final SnapshotContents zzapN;

        public String getConflictId()
        {
            return zzapK;
        }

        public Snapshot getConflictingSnapshot()
        {
            return zzapL;
        }

        public SnapshotContents getResolutionSnapshotContents()
        {
            return zzapN;
        }

        public Snapshot getSnapshot()
        {
            return zzapJ;
        }

        OpenSnapshotResultImpl(DataHolder dataholder, Contents contents)
        {
            this(dataholder, null, contents, null, null);
        }

        OpenSnapshotResultImpl(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            SnapshotMetadataBuffer snapshotmetadatabuffer;
            boolean flag;
            flag = true;
            super(dataholder);
            snapshotmetadatabuffer = new SnapshotMetadataBuffer(dataholder);
            if (snapshotmetadatabuffer.getCount() != 0) goto _L2; else goto _L1
_L1:
            zzapJ = null;
            zzapL = null;
_L3:
            snapshotmetadatabuffer.release();
            zzapK = s;
            zzapM = contents2;
            zzapN = new SnapshotContentsEntity(contents2);
            return;
_L2:
            if (snapshotmetadatabuffer.getCount() != 1)
            {
                break MISSING_BLOCK_LABEL_144;
            }
            if (dataholder.getStatusCode() == 4004)
            {
                flag = false;
            }
            com.google.android.gms.common.internal.zzb.zzU(flag);
            zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            zzapL = null;
              goto _L3
            dataholder;
            snapshotmetadatabuffer.release();
            throw dataholder;
            zzapJ = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(0)), new SnapshotContentsEntity(contents));
            zzapL = new SnapshotEntity(new SnapshotMetadataEntity(snapshotmetadatabuffer.get(1)), new SnapshotContentsEntity(contents1));
              goto _L3
        }
    }

    private static final class P2PConnectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final String zzapO;

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PConnected(zzapO);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((RoomStatusUpdateListener)obj);
        }

        P2PConnectedNotifier(String s)
        {
            zzapO = s;
        }
    }

    private static final class P2PDisconnectedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final String zzapO;

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener)
        {
            roomstatusupdatelistener.onP2PDisconnected(zzapO);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((RoomStatusUpdateListener)obj);
        }

        P2PDisconnectedNotifier(String s)
        {
            zzapO = s;
        }
    }

    private static final class PeerConnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersConnected(room, arraylist);
        }

        PeerConnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDeclinedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerDeclined(room, arraylist);
        }

        PeerDeclinedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerDisconnectedNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeersDisconnected(room, arraylist);
        }

        PeerDisconnectedNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerInvitedToRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerInvitedToRoom(room, arraylist);
        }

        PeerInvitedToRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerJoinedRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerJoined(room, arraylist);
        }

        PeerJoinedRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PeerLeftRoomNotifier extends AbstractPeerStatusNotifier
    {

        protected void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room, ArrayList arraylist)
        {
            roomstatusupdatelistener.onPeerLeft(room, arraylist);
        }

        PeerLeftRoomNotifier(DataHolder dataholder, String as[])
        {
            super(dataholder, as);
        }
    }

    private static final class PlayerLeaderboardScoreLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzH(DataHolder dataholder)
        {
            zzOs.zzm(new LoadPlayerScoreResultImpl(dataholder));
        }

        PlayerLeaderboardScoreLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PlayerXpForGameCategoriesLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzf(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzfn(i);
            zzOs.zzm(new LoadXpForGameCategoriesResultImpl(status, bundle));
        }

        PlayerXpForGameCategoriesLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    static final class PlayerXpStreamLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzS(DataHolder dataholder)
        {
            zzOs.zzm(new LoadXpStreamResultImpl(dataholder));
        }

        PlayerXpStreamLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PlayersLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzj(DataHolder dataholder)
        {
            zzOs.zzm(new LoadPlayersResultImpl(dataholder));
        }

        public void zzk(DataHolder dataholder)
        {
            zzOs.zzm(new LoadPlayersResultImpl(dataholder));
        }

        PlayersLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class PopupLocationInfoBinderCallbacks extends AbstractGamesClient
    {

        private final PopupManager zzaoU;

        public PopupLocationInfoParcelable zzsq()
        {
            return new PopupLocationInfoParcelable(zzaoU.zztg());
        }

        public PopupLocationInfoBinderCallbacks(PopupManager popupmanager)
        {
            zzaoU = popupmanager;
        }
    }

    static final class ProfileSettingsLoadedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzT(DataHolder dataholder)
        {
            zzOs.zzm(new LoadProfileSettingsResultImpl(dataholder));
        }

        ProfileSettingsLoadedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class ProfileSettingsUpdatedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzfA(int i)
        {
            zzOs.zzm(GamesStatusCodes.zzfn(i));
        }

        ProfileSettingsUpdatedBinderCallback(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class QuestAcceptedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapP;

        public void zzO(DataHolder dataholder)
        {
            zzapP.zzm(new AcceptQuestResultImpl(dataholder));
        }

        public QuestAcceptedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapP = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class QuestCompletedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final Quest zzapb;

        public void zza(QuestUpdateListener questupdatelistener)
        {
            questupdatelistener.onQuestCompleted(zzapb);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((QuestUpdateListener)obj);
        }

        QuestCompletedNotifier(Quest quest)
        {
            zzapb = quest;
        }
    }

    private static final class QuestMilestoneClaimBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapQ;
        private final String zzapR;

        public void zzN(DataHolder dataholder)
        {
            zzapQ.zzm(new ClaimMilestoneResultImpl(dataholder, zzapR));
        }

        public QuestMilestoneClaimBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        {
            zzapQ = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
            zzapR = (String)zzu.zzb(s, "MilestoneId must not be null");
        }
    }

    private static final class QuestUpdateBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zzi zzafi;

        private Quest zzW(DataHolder dataholder)
        {
            QuestBuffer questbuffer;
            questbuffer = new QuestBuffer(dataholder);
            dataholder = null;
            if (questbuffer.getCount() > 0)
            {
                dataholder = (Quest)((Quest)questbuffer.get(0)).freeze();
            }
            questbuffer.release();
            return dataholder;
            dataholder;
            questbuffer.release();
            throw dataholder;
        }

        public void zzP(DataHolder dataholder)
        {
            dataholder = zzW(dataholder);
            if (dataholder != null)
            {
                zzafi.zza(new QuestCompletedNotifier(dataholder));
            }
        }

        QuestUpdateBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzafi = zzi1;
        }
    }

    private static final class QuestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapS;

        public void zzR(DataHolder dataholder)
        {
            zzapS.zzm(new LoadQuestsResultImpl(dataholder));
        }

        public QuestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapS = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RealTimeMessageSentNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final int zzTS;
        private final String zzapT;
        private final int zzapU;

        public void zza(com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback reliablemessagesentcallback)
        {
            if (reliablemessagesentcallback != null)
            {
                reliablemessagesentcallback.onRealTimeMessageSent(zzTS, zzapU, zzapT);
            }
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback)obj);
        }

        RealTimeMessageSentNotifier(int i, int j, String s)
        {
            zzTS = i;
            zzapU = j;
            zzapT = s;
        }
    }

    private static final class RealTimeReliableMessageBinderCallbacks extends AbstractGamesCallbacks
    {

        final com.google.android.gms.common.api.zzi zzapV;

        public void zzb(int i, int j, String s)
        {
            if (zzapV != null)
            {
                zzapV.zza(new RealTimeMessageSentNotifier(i, j, s));
            }
        }

        public RealTimeReliableMessageBinderCallbacks(com.google.android.gms.common.api.zzi zzi1)
        {
            zzapV = zzi1;
        }
    }

    private static final class RequestReceivedBinderCallback extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zzi zzafi;

        public void onRequestRemoved(String s)
        {
            zzafi.zza(new RequestRemovedNotifier(s));
        }

        public void zzr(DataHolder dataholder)
        {
            GameRequestBuffer gamerequestbuffer;
            gamerequestbuffer = new GameRequestBuffer(dataholder);
            dataholder = null;
            if (gamerequestbuffer.getCount() > 0)
            {
                dataholder = (GameRequest)((GameRequest)gamerequestbuffer.get(0)).freeze();
            }
            gamerequestbuffer.release();
            if (dataholder != null)
            {
                zzafi.zza(new RequestReceivedNotifier(dataholder));
            }
            return;
            dataholder;
            gamerequestbuffer.release();
            throw dataholder;
        }

        RequestReceivedBinderCallback(com.google.android.gms.common.api.zzi zzi1)
        {
            zzafi = zzi1;
        }
    }

    private static final class RequestReceivedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final GameRequest zzapW;

        public void zza(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestReceived(zzapW);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnRequestReceivedListener)obj);
        }

        RequestReceivedNotifier(GameRequest gamerequest)
        {
            zzapW = gamerequest;
        }
    }

    private static final class RequestRemovedNotifier
        implements com.google.android.gms.common.api.zzi.zzb
    {

        private final String zzDK;

        public void zza(OnRequestReceivedListener onrequestreceivedlistener)
        {
            onrequestreceivedlistener.onRequestRemoved(zzDK);
        }

        public void zzmw()
        {
        }

        public void zzn(Object obj)
        {
            zza((OnRequestReceivedListener)obj);
        }

        RequestRemovedNotifier(String s)
        {
            zzDK = s;
        }
    }

    private static final class RequestSentBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapX;

        public void zzJ(DataHolder dataholder)
        {
            zzapX.zzm(new SendRequestResultImpl(dataholder));
        }

        public RequestSentBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapX = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestSummariesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapY;

        public void zzK(DataHolder dataholder)
        {
            zzapY.zzm(new LoadRequestSummariesResultImpl(dataholder));
        }

        public RequestSummariesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapY = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzapZ;

        public void zzd(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzfn(i);
            zzapZ.zzm(new LoadRequestsResultImpl(status, bundle));
        }

        public RequestsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzapZ = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RequestsUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqa;

        public void zzI(DataHolder dataholder)
        {
            zzaqa.zzm(new UpdateRequestsResultImpl(dataholder));
        }

        public RequestsUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqa = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class RoomAutoMatchingNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomAutoMatching(room);
        }

        RoomAutoMatchingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zzi zzaqb;
        private final com.google.android.gms.common.api.zzi zzaqc;
        private final com.google.android.gms.common.api.zzi zzaqd;

        public void onLeftRoom(int i, String s)
        {
            zzaqb.zza(new LeftRoomNotifier(i, s));
        }

        public void onP2PConnected(String s)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new P2PConnectedNotifier(s));
            }
        }

        public void onP2PDisconnected(String s)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new P2PDisconnectedNotifier(s));
            }
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        {
            if (zzaqd != null)
            {
                zzaqd.zza(new MessageReceivedNotifier(realtimemessage));
            }
        }

        public void zzA(DataHolder dataholder)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new RoomAutoMatchingNotifier(dataholder));
            }
        }

        public void zzB(DataHolder dataholder)
        {
            zzaqb.zza(new RoomConnectedNotifier(dataholder));
        }

        public void zzC(DataHolder dataholder)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new ConnectedToRoomNotifier(dataholder));
            }
        }

        public void zzD(DataHolder dataholder)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new DisconnectedFromRoomNotifier(dataholder));
            }
        }

        public void zza(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerInvitedToRoomNotifier(dataholder, as));
            }
        }

        public void zzb(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerJoinedRoomNotifier(dataholder, as));
            }
        }

        public void zzc(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerLeftRoomNotifier(dataholder, as));
            }
        }

        public void zzd(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerDeclinedNotifier(dataholder, as));
            }
        }

        public void zze(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerConnectedNotifier(dataholder, as));
            }
        }

        public void zzf(DataHolder dataholder, String as[])
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new PeerDisconnectedNotifier(dataholder, as));
            }
        }

        public void zzx(DataHolder dataholder)
        {
            zzaqb.zza(new RoomCreatedNotifier(dataholder));
        }

        public void zzy(DataHolder dataholder)
        {
            zzaqb.zza(new JoinedRoomNotifier(dataholder));
        }

        public void zzz(DataHolder dataholder)
        {
            if (zzaqc != null)
            {
                zzaqc.zza(new RoomConnectingNotifier(dataholder));
            }
        }

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi1)
        {
            zzaqb = (com.google.android.gms.common.api.zzi)zzu.zzb(zzi1, "Callbacks must not be null");
            zzaqc = null;
            zzaqd = null;
        }

        public RoomBinderCallbacks(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3)
        {
            zzaqb = (com.google.android.gms.common.api.zzi)zzu.zzb(zzi1, "Callbacks must not be null");
            zzaqc = zzi2;
            zzaqd = zzi3;
        }
    }

    private static final class RoomConnectedNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomConnected(i, room);
        }

        RoomConnectedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomConnectingNotifier extends AbstractRoomStatusNotifier
    {

        public void zza(RoomStatusUpdateListener roomstatusupdatelistener, Room room)
        {
            roomstatusupdatelistener.onRoomConnecting(room);
        }

        RoomConnectingNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class RoomCreatedNotifier extends AbstractRoomNotifier
    {

        public void zza(RoomUpdateListener roomupdatelistener, Room room, int i)
        {
            roomupdatelistener.onRoomCreated(i, room);
        }

        public RoomCreatedNotifier(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class SendRequestResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.SendRequestResult
    {

        private final GameRequest zzapW = null;

        SendRequestResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new GameRequestBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapW = (GameRequest)((GameRequest)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class SignOutCompleteBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzkU()
        {
            Status status = GamesStatusCodes.zzfn(0);
            zzOs.zzm(status);
        }

        public SignOutCompleteBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotCommittedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqe;

        public void zzM(DataHolder dataholder)
        {
            zzaqe.zzm(new CommitSnapshotResultImpl(dataholder));
        }

        public SnapshotCommittedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqe = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    static final class SnapshotDeletedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzh(int i, String s)
        {
            zzOs.zzm(new DeleteSnapshotResultImpl(i, s));
        }

        public SnapshotDeletedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotOpenedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqf;

        public void zza(DataHolder dataholder, Contents contents)
        {
            zzaqf.zzm(new OpenSnapshotResultImpl(dataholder, contents));
        }

        public void zza(DataHolder dataholder, String s, Contents contents, Contents contents1, Contents contents2)
        {
            zzaqf.zzm(new OpenSnapshotResultImpl(dataholder, s, contents, contents1, contents2));
        }

        public SnapshotOpenedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqf = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SnapshotsLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqg;

        public void zzL(DataHolder dataholder)
        {
            zzaqg.zzm(new LoadSnapshotsResultImpl(dataholder));
        }

        public SnapshotsLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqg = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzOs;

        public void zzi(DataHolder dataholder)
        {
            zzOs.zzm(new SubmitScoreResultImpl(dataholder));
        }

        public SubmitScoreBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzOs = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class SubmitScoreResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.leaderboard.Leaderboards.SubmitScoreResult
    {

        private final ScoreSubmissionData zzaqh;

        public ScoreSubmissionData getScoreData()
        {
            return zzaqh;
        }

        public SubmitScoreResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaqh = new ScoreSubmissionData(dataholder);
            dataholder.close();
            return;
            Exception exception;
            exception;
            dataholder.close();
            throw exception;
        }
    }

    private static final class TurnBasedMatchCanceledBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqi;

        public void zzg(int i, String s)
        {
            Status status = GamesStatusCodes.zzfn(i);
            zzaqi.zzm(new CancelMatchResultImpl(status, s));
        }

        public TurnBasedMatchCanceledBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqi = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchInitiatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqj;

        public void zzt(DataHolder dataholder)
        {
            zzaqj.zzm(new InitiateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchInitiatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqj = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLeftBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqk;

        public void zzv(DataHolder dataholder)
        {
            zzaqk.zzm(new LeaveMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLeftBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqk = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaql;

        public void zzs(DataHolder dataholder)
        {
            zzaql.zzm(new LoadMatchResultImpl(dataholder));
        }

        public TurnBasedMatchLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaql = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static abstract class TurnBasedMatchResult extends GamesDataHolderResult
    {

        final TurnBasedMatch zzapG = null;

        public TurnBasedMatch getMatch()
        {
            return zzapG;
        }

        TurnBasedMatchResult(DataHolder dataholder)
        {
            super(dataholder);
            dataholder = new TurnBasedMatchBuffer(dataholder);
            if (dataholder.getCount() <= 0) goto _L2; else goto _L1
_L1:
            zzapG = (TurnBasedMatch)((TurnBasedMatch)dataholder.get(0)).freeze();
_L4:
            dataholder.release();
            return;
_L2:
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            dataholder.release();
            throw exception;
        }
    }

    private static final class TurnBasedMatchUpdatedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqm;

        public void zzu(DataHolder dataholder)
        {
            zzaqm.zzm(new UpdateMatchResultImpl(dataholder));
        }

        public TurnBasedMatchUpdatedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqm = (com.google.android.gms.common.api.zza.zzb)com.google.android.gms.common.internal.zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class TurnBasedMatchesLoadedBinderCallbacks extends AbstractGamesCallbacks
    {

        private final com.google.android.gms.common.api.zza.zzb zzaqn;

        public void zzc(int i, Bundle bundle)
        {
            bundle.setClassLoader(getClass().getClassLoader());
            Status status = GamesStatusCodes.zzfn(i);
            zzaqn.zzm(new LoadMatchesResultImpl(status, bundle));
        }

        public TurnBasedMatchesLoadedBinderCallbacks(com.google.android.gms.common.api.zza.zzb zzb1)
        {
            zzaqn = (com.google.android.gms.common.api.zza.zzb)zzu.zzb(zzb1, "Holder must not be null");
        }
    }

    private static final class UpdateAchievementResultImpl
        implements com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult
    {

        private final Status zzOt;
        private final String zzanZ;

        public String getAchievementId()
        {
            return zzanZ;
        }

        public Status getStatus()
        {
            return zzOt;
        }

        UpdateAchievementResultImpl(int i, String s)
        {
            zzOt = GamesStatusCodes.zzfn(i);
            zzanZ = s;
        }
    }

    private static final class UpdateMatchResultImpl extends TurnBasedMatchResult
        implements com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer.UpdateMatchResult
    {

        UpdateMatchResultImpl(DataHolder dataholder)
        {
            super(dataholder);
        }
    }

    private static final class UpdateRequestsResultImpl extends GamesDataHolderResult
        implements com.google.android.gms.games.request.Requests.UpdateRequestsResult
    {

        private final RequestUpdateOutcomes zzaqo;

        public Set getRequestIds()
        {
            return zzaqo.getRequestIds();
        }

        public int getRequestOutcome(String s)
        {
            return zzaqo.getRequestOutcome(s);
        }

        UpdateRequestsResultImpl(DataHolder dataholder)
        {
            super(dataholder);
            zzaqo = RequestUpdateOutcomes.zzX(dataholder);
        }
    }


    EventIncrementManager zzaoQ;
    private final String zzaoR;
    private PlayerEntity zzaoS;
    private GameEntity zzaoT;
    private final PopupManager zzaoU;
    private boolean zzaoV;
    private final Binder zzaoW = new Binder();
    private final long zzaoX = (long)hashCode();
    private final com.google.android.gms.games.Games.GamesOptions zzaoY;

    public GamesClientImpl(Context context, Looper looper, zze zze1, com.google.android.gms.games.Games.GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        super(context, looper, 1, connectioncallbacks, onconnectionfailedlistener, zze1);
        zzaoQ = new EventIncrementManager() {

            final GamesClientImpl zzaoZ;

            public EventIncrementCache zzsS()
            {
                return zzaoZ. new GameClientEventIncrementCache();
            }

            
            {
                zzaoZ = GamesClientImpl.this;
                super();
            }
        };
        zzaoV = false;
        zzaoR = zze1.zzny();
        zzaoU = PopupManager.zza(this, zze1.zznu());
        zzn(zze1.zznA());
        zzaoY = gamesoptions;
    }

    private static Room zzU(DataHolder dataholder)
    {
        RoomBuffer roombuffer;
        roombuffer = new RoomBuffer(dataholder);
        dataholder = null;
        if (roombuffer.getCount() > 0)
        {
            dataholder = (Room)((Room)roombuffer.get(0)).freeze();
        }
        roombuffer.release();
        return dataholder;
        dataholder;
        roombuffer.release();
        throw dataholder;
    }

    static Room zzV(DataHolder dataholder)
    {
        return zzU(dataholder);
    }

    static void zza(GamesClientImpl gamesclientimpl, RemoteException remoteexception)
    {
        gamesclientimpl.zzb(remoteexception);
    }

    private void zzb(RemoteException remoteexception)
    {
        com.google.android.gms.games.internal.GamesLog.zzb("GamesClientImpl", "service died", remoteexception);
    }

    private void zzst()
    {
        zzaoS = null;
        zzaoT = null;
    }

    public void connect(com.google.android.gms.common.api.GoogleApiClient.ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
    {
        zzst();
        super.connect(connectionprogressreportcallbacks);
    }

    public void disconnect()
    {
        zzaoV = false;
        if (isConnected())
        {
            try
            {
                IGamesService igamesservice = (IGamesService)zznM();
                igamesservice.zzsR();
                zzaoQ.flush();
                igamesservice.zzE(zzaoX);
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.games.internal.GamesLog.zzu("GamesClientImpl", "Failed to notify client disconnect.");
            }
        }
        super.disconnect();
    }

    protected String getServiceDescriptor()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    protected String getStartServiceAction()
    {
        return "com.google.android.gms.games.service.START";
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        super.onConnectionFailed(connectionresult);
        zzaoV = false;
    }

    public boolean requiresSignIn()
    {
        return true;
    }

    protected IInterface zzT(IBinder ibinder)
    {
        return zzbJ(ibinder);
    }

    public int zza(com.google.android.gms.common.api.zzi zzi1, byte abyte0[], String s, String s1)
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zza(new RealTimeReliableMessageBinderCallbacks(zzi1), abyte0, s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
            return -1;
        }
        return i;
    }

    public int zza(byte abyte0[], String s, String as[])
    {
        zzu.zzb(as, "Participant IDs must not be null");
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzb(abyte0, s, as);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb(abyte0);
            return -1;
        }
        return i;
    }

    public Intent zza(int i, byte abyte0[], int j, Bitmap bitmap, String s)
    {
        try
        {
            abyte0 = ((IGamesService)zznM()).zza(i, abyte0, j, s);
            zzu.zzb(bitmap, "Must provide a non null icon");
            abyte0.putExtra("com.google.android.gms.games.REQUEST_ITEM_ICON", bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb(abyte0);
            return null;
        }
        return abyte0;
    }

    public Intent zza(PlayerEntity playerentity)
    {
        try
        {
            playerentity = ((IGamesService)zznM()).zza(playerentity);
        }
        // Misplaced declaration of an exception variable
        catch (PlayerEntity playerentity)
        {
            zzb(playerentity);
            return null;
        }
        return playerentity;
    }

    public Intent zza(Room room, int i)
    {
        try
        {
            room = ((IGamesService)zznM()).zza((RoomEntity)room.freeze(), i);
        }
        // Misplaced declaration of an exception variable
        catch (Room room)
        {
            zzb(room);
            return null;
        }
        return room;
    }

    public Intent zza(String s, boolean flag, boolean flag1, int i)
    {
        try
        {
            s = ((IGamesService)zznM()).zza(s, flag, flag1, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    protected Set zza(Set set)
    {
        Scope scope = new Scope("https://www.googleapis.com/auth/games");
        Scope scope1 = new Scope("https://www.googleapis.com/auth/games.firstparty");
        Iterator iterator = set.iterator();
        boolean flag = false;
        boolean flag1 = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Scope scope2 = (Scope)iterator.next();
            if (scope2.equals(scope))
            {
                flag1 = true;
            } else
            if (scope2.equals(scope1))
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            if (!flag1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            zzu.zza(flag1, "Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            });
            return set;
        } else
        {
            zzu.zza(flag1, "Games APIs requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            });
            return set;
        }
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        if (i == 0 && bundle != null)
        {
            bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
            zzaoV = bundle.getBoolean("show_welcome_popup");
            zzaoS = (PlayerEntity)bundle.getParcelable("com.google.android.gms.games.current_player");
            zzaoT = (GameEntity)bundle.getParcelable("com.google.android.gms.games.current_game");
        }
        super.zza(i, ibinder, bundle, j);
    }

    public void zza(IBinder ibinder, Bundle bundle)
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((IGamesService)zznM()).zza(ibinder, bundle);
        return;
        ibinder;
        zzb(ibinder);
        return;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, int j, int k)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestsLoadedBinderCallbacks(zzb1), i, j, k);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, String s, String as[], boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new AppContentLoadedBinderCallbacks(zzb1), i, s, as, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int i, int ai[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zzb1), i, ai);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, LeaderboardScoreBuffer leaderboardscorebuffer, int i, int j)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), leaderboardscorebuffer.zztF().asBundle(), i, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, TurnBasedMatchConfig turnbasedmatchconfig)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), turnbasedmatchconfig.getVariant(), turnbasedmatchconfig.zztL(), turnbasedmatchconfig.getInvitedPlayerIds(), turnbasedmatchconfig.getAutoMatchCriteria());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, Snapshot snapshot, SnapshotMetadataChange snapshotmetadatachange)
        throws RemoteException
    {
        SnapshotContents snapshotcontents = snapshot.getSnapshotContents();
        Object obj;
        boolean flag;
        if (!snapshotcontents.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Snapshot already closed");
        obj = snapshotmetadatachange.zztQ();
        if (obj != null)
        {
            ((BitmapTeleporter) (obj)).zzc(getContext().getCacheDir());
        }
        obj = snapshotcontents.zzpe();
        snapshotcontents.close();
        ((IGamesService)zznM()).zza(new SnapshotCommittedBinderCallbacks(zzb1), snapshot.getMetadata().getSnapshotId(), (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        }
        ((IGamesService)zznM()).zza(zzb1, s, zzaoU.zztf(), zzaoU.zzte());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        }
        ((IGamesService)zznM()).zza(zzb1, s, i, zzaoU.zztf(), zzaoU.zzte());
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), s, i, j, k, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR tableswitch 156408498 156408498: default 24
    //                   156408498 72;
           goto _L1 _L2
_L2:
        if (s.equals("played_with"))
        {
            byte0 = 0;
        }
_L1:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
            ((IGamesService)zznM()).zzd(new PlayersLoadedBinderCallback(zzb1), s, i, flag, flag1);
            break;
        }
        return;
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int ai[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new TurnBasedMatchesLoadedBinderCallbacks(zzb1), s, i, ai);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, long l, String s1)
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new SubmitScoreBinderCallbacks(zzb1);
        }
        ((IGamesService)zznM()).zza(zzb1, s, l, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new TurnBasedMatchLeftBinderCallbacks(zzb1), s, s1);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new PlayerLeaderboardScoreLoadedBinderCallback(zzb1), s, s1, i, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestsLoadedBinderCallbacks(zzb1), s, s1, i, j, k);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new LeaderboardScoresLoadedBinderCallback(zzb1), s, s1, i, j, k, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 40
    //                   -1049482625: 128
    //                   156408498: 112
    //                   782949780: 96;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break MISSING_BLOCK_LABEL_128;
_L5:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid player collection: ").append(s).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            ((IGamesService)zznM()).zza(new PlayersLoadedBinderCallback(zzb1), s, s1, i, flag, flag1);
            break;
        }
        break MISSING_BLOCK_LABEL_172;
_L4:
        if (s.equals("circled"))
        {
            byte0 = 0;
        }
          goto _L5
_L3:
        if (s.equals("played_with"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("nearby"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, SnapshotMetadataChange snapshotmetadatachange, SnapshotContents snapshotcontents)
        throws RemoteException
    {
        Object obj;
        boolean flag;
        if (!snapshotcontents.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "SnapshotContents already closed");
        obj = snapshotmetadatachange.zztQ();
        if (obj != null)
        {
            ((BitmapTeleporter) (obj)).zzc(getContext().getCacheDir());
        }
        obj = snapshotcontents.zzpe();
        snapshotcontents.close();
        ((IGamesService)zznM()).zza(new SnapshotOpenedBinderCallbacks(zzb1), s, s1, (SnapshotMetadataChangeEntity)snapshotmetadatachange, ((Contents) (obj)));
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new LeaderboardsLoadedBinderCallback(zzb1), s, s1, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag, String as[])
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new QuestsLoadedBinderCallbacks(zzb1), s, s1, as, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int ai[], int i, boolean flag)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new QuestsLoadedBinderCallbacks(zzb1), s, s1, ai, i, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, String as[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestsUpdatedBinderCallbacks(zzb1), s, s1, as);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzf(new PlayersLoadedBinderCallback(zzb1), s, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new SnapshotOpenedBinderCallbacks(zzb1), s, flag, i);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zzb1), s, abyte0, s1, aparticipantresult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new TurnBasedMatchUpdatedBinderCallbacks(zzb1), s, abyte0, aparticipantresult);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String s, String as[], int i, byte abyte0[], int j)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestSentBinderCallbacks(zzb1), s, as, i, abyte0, j);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new PlayersLoadedBinderCallback(zzb1), flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, Bundle bundle)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new ContactSettingsUpdatedBinderCallback(zzb1), flag, bundle);
    }

    public transient void zza(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, String as[])
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new EventsLoadedBinderCallback(zzb1), flag, as);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, int ai[], int i, boolean flag)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new QuestsLoadedBinderCallbacks(zzb1), ai, i, flag);
    }

    public void zza(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new PlayersLoadedBinderCallback(zzb1), as);
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new InvitationReceivedBinderCallback(zzi1);
            ((IGamesService)zznM()).zza(zzi1, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3, RoomConfig roomconfig)
    {
        try
        {
            zzi1 = new RoomBinderCallbacks(zzi1, zzi2, zzi3);
            ((IGamesService)zznM()).zza(zzi1, zzaoW, roomconfig.getVariant(), roomconfig.getInvitedPlayerIds(), roomconfig.getAutoMatchCriteria(), false, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(com.google.android.gms.common.api.zzi zzi1, String s)
    {
        try
        {
            ((IGamesService)zznM()).zzc(new RoomBinderCallbacks(zzi1), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zza(Snapshot snapshot)
    {
        snapshot = snapshot.getSnapshotContents();
        Contents contents;
        boolean flag;
        if (!snapshot.isClosed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zza(flag, "Snapshot already closed");
        contents = snapshot.zzpe();
        snapshot.close();
        try
        {
            ((IGamesService)zznM()).zza(contents);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Snapshot snapshot)
        {
            zzb(snapshot);
        }
    }

    public Intent zzb(int i, int j, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzb(i, j, flag);
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzb(int ai[])
    {
        try
        {
            ai = ((IGamesService)zznM()).zzb(ai);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            zzb(((RemoteException) (ai)));
            return null;
        }
        return ai;
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new SignOutCompleteBinderCallbacks(zzb1));
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        }
        ((IGamesService)zznM()).zzb(zzb1, s, zzaoU.zztf(), zzaoU.zzte());
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        if (zzb1 == null)
        {
            zzb1 = null;
        } else
        {
            zzb1 = new AchievementUpdatedBinderCallback(zzb1);
        }
        ((IGamesService)zznM()).zzb(zzb1, s, i, zzaoU.zztf(), zzaoU.zzte());
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new LeaderboardScoresLoadedBinderCallback(zzb1), s, i, j, k, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new PlayersLoadedBinderCallback(zzb1), s, i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zzf(new QuestMilestoneClaimBinderCallbacks(zzb1, s1), s, s1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, int j, int k, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new LeaderboardScoresLoadedBinderCallback(zzb1), s, s1, i, j, k, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new PlayersLoadedBinderCallback(zzb1), s, s1, i, flag, flag1);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new AchievementsLoadedBinderCallback(zzb1), s, s1, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new LeaderboardsLoadedBinderCallback(zzb1), s, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new LeaderboardsLoadedBinderCallback(zzb1), flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag, String as[])
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zza(new QuestsLoadedBinderCallbacks(zzb1), as, flag);
    }

    public void zzb(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestsUpdatedBinderCallbacks(zzb1), as);
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new MatchUpdateReceivedBinderCallback(zzi1);
            ((IGamesService)zznM()).zzb(zzi1, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(((RemoteException) (zzi1)));
        }
    }

    public void zzb(com.google.android.gms.common.api.zzi zzi1, com.google.android.gms.common.api.zzi zzi2, com.google.android.gms.common.api.zzi zzi3, RoomConfig roomconfig)
    {
        try
        {
            zzi1 = new RoomBinderCallbacks(zzi1, zzi2, zzi3);
            ((IGamesService)zznM()).zza(zzi1, zzaoW, roomconfig.getInvitationId(), false, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(((RemoteException) (zzi1)));
        }
    }

    protected IGamesService zzbJ(IBinder ibinder)
    {
        return IGamesService.Stub.zzbM(ibinder);
    }

    public Intent zzc(int i, int j, boolean flag)
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzc(i, j, flag);
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new InvitationsLoadedBinderCallback(zzb1), i);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzl(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new PlayerXpStreamLoadedBinderCallback(zzb1), s, i);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzd(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s, s1);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new SnapshotsLoadedBinderCallbacks(zzb1), s, s1, flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzd(new LeaderboardsLoadedBinderCallback(zzb1), s, flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new AchievementsLoadedBinderCallback(zzb1), flag);
    }

    public void zzc(com.google.android.gms.common.api.zza.zzb zzb1, String as[])
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new RequestsUpdatedBinderCallbacks(zzb1), as);
    }

    public void zzc(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new QuestUpdateBinderCallback(zzi1);
            ((IGamesService)zznM()).zzd(zzi1, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zzcN(String s)
    {
        try
        {
            ((IGamesService)zznM()).zzcV(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
        }
    }

    public Intent zzcO(String s)
    {
        try
        {
            s = ((IGamesService)zznM()).zzcO(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    public void zzcP(String s)
    {
        try
        {
            ((IGamesService)zznM()).zza(s, zzaoU.zztf(), zzaoU.zzte());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
        }
    }

    public int zzd(byte abyte0[], String s)
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzb(abyte0, s, null);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb(abyte0);
            return -1;
        }
        return i;
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, int i, boolean flag, boolean flag1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zze(new PlayersLoadedBinderCallback(zzb1), i, flag, flag1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzm(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzc(new PlayerXpStreamLoadedBinderCallback(zzb1), s, i);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, String s1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zze(new TurnBasedMatchInitiatedBinderCallbacks(zzb1), s, s1);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, String s, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new GameMuteStatusChangedBinderCallback(zzb1), s, flag);
    }

    public void zzd(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zzf(new EventsLoadedBinderCallback(zzb1), flag);
    }

    public void zzd(com.google.android.gms.common.api.zzi zzi1)
    {
        try
        {
            zzi1 = new RequestReceivedBinderCallback(zzi1);
            ((IGamesService)zznM()).zzc(zzi1, zzaoX);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.android.gms.common.api.zzi zzi1)
        {
            zzb(zzi1);
        }
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzo(new TurnBasedMatchLeftBinderCallbacks(zzb1), s);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzb(new InvitationsLoadedBinderCallback(zzb1), s, i, false);
    }

    public void zze(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzd(new SnapshotsLoadedBinderCallbacks(zzb1), flag);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzd(new GamesLoadedBinderCallback(zzb1));
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzn(new TurnBasedMatchCanceledBinderCallbacks(zzb1), s);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, String s, int i)
        throws RemoteException
    {
        ((IGamesService)zznM()).zza(new RequestSummariesLoadedBinderCallbacks(zzb1), s, i);
    }

    public void zzf(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzg(new ProfileSettingsLoadedBinderCallback(zzb1), flag);
    }

    public void zzfC(int i)
    {
        zzaoU.setGravity(i);
    }

    public void zzfD(int i)
    {
        try
        {
            ((IGamesService)zznM()).zzfD(i);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzh(new NotifyAclLoadedBinderCallback(zzb1));
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzp(new TurnBasedMatchLoadedBinderCallbacks(zzb1), s);
    }

    public void zzg(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzh(new ProfileSettingsUpdatedBinderCallback(zzb1), flag);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzt(new InboxCountsLoadedBinderCallback(zzb1), null);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        zzaoQ.flush();
        ((IGamesService)zznM()).zzu(new QuestAcceptedBinderCallbacks(zzb1), s);
    }

    public void zzh(com.google.android.gms.common.api.zza.zzb zzb1, boolean flag)
        throws RemoteException
    {
        ((IGamesService)zznM()).zze(new ContactSettingsLoadedBinderCallback(zzb1), flag);
    }

    public void zzi(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzr(new SnapshotDeletedBinderCallbacks(zzb1), s);
    }

    public void zzj(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzf(new GameInstancesLoadedBinderCallback(zzb1), s);
    }

    public void zzk(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzq(new GameSearchSuggestionsLoadedBinderCallback(zzb1), s);
    }

    protected Bundle zzkR()
    {
        Object obj = getContext().getResources().getConfiguration().locale.toString();
        Bundle bundle = zzaoY.zzrI();
        bundle.putString("com.google.android.gms.games.key.gamePackageName", zzaoR);
        bundle.putString("com.google.android.gms.games.key.desiredLocale", ((String) (obj)));
        bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(zzaoU.zztf()));
        bundle.putInt("com.google.android.gms.games.key.API_VERSION", 0);
        obj = zznK();
        if (((zze) (obj)).zznB() != null)
        {
            bundle.putBundle("com.google.android.gms.games.key.signInOptions", com.google.android.gms.signin.internal.zzh.zza(((zze) (obj)).zznB(), ((zze) (obj)).zznC(), Executors.newSingleThreadExecutor()));
        }
        return bundle;
    }

    public void zzl(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzs(new PlayerXpForGameCategoriesLoadedBinderCallback(zzb1), s);
    }

    public Bundle zzlM()
    {
        Bundle bundle;
        try
        {
            bundle = ((IGamesService)zznM()).zzlM();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/games/internal/GamesClientImpl.getClassLoader());
        return bundle;
    }

    public void zzm(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzk(new InvitationsLoadedBinderCallback(zzb1), s);
    }

    public void zzn(View view)
    {
        zzaoU.zzo(view);
    }

    public void zzn(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzj(new NotifyAclUpdatedBinderCallback(zzb1), s);
    }

    public void zznG()
    {
        super.zznG();
        if (zzaoV)
        {
            zzaoU.zztd();
            zzaoV = false;
        }
        if (!zzaoY.zzanC)
        {
            zzsu();
        }
    }

    public Intent zzo(String s, int i)
    {
        try
        {
            s = ((IGamesService)zznM()).zzv(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
            return null;
        }
        return s;
    }

    public void zzo(com.google.android.gms.common.api.zza.zzb zzb1, String s)
        throws RemoteException
    {
        ((IGamesService)zznM()).zzi(new GameMuteStatusLoadedBinderCallback(zzb1), s);
    }

    public void zzp(String s, int i)
    {
        zzaoQ.zzp(s, i);
    }

    public void zzq(String s, int i)
    {
        try
        {
            ((IGamesService)zznM()).zzq(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
        }
    }

    public void zzr(String s, int i)
    {
        try
        {
            ((IGamesService)zznM()).zzr(s, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            zzb(s);
        }
    }

    public Intent zzsA()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsA();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzsB()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsB();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzsC()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsC();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public void zzsD()
    {
        try
        {
            ((IGamesService)zznM()).zzF(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzsE()
    {
        try
        {
            ((IGamesService)zznM()).zzG(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzsF()
    {
        try
        {
            ((IGamesService)zznM()).zzI(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public void zzsG()
    {
        try
        {
            ((IGamesService)zznM()).zzH(zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public Intent zzsH()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsH();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public Intent zzsI()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsI();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public int zzsJ()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsJ();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return 4368;
        }
        return i;
    }

    public String zzsK()
    {
        String s;
        try
        {
            s = ((IGamesService)zznM()).zzsK();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public int zzsL()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsL();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public Intent zzsM()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsM();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }

    public int zzsN()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsN();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzsO()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsO();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzsP()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsP();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public int zzsQ()
    {
        int i;
        try
        {
            i = ((IGamesService)zznM()).zzsQ();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return -1;
        }
        return i;
    }

    public void zzsR()
    {
        if (!isConnected())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((IGamesService)zznM()).zzsR();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb(remoteexception);
        return;
    }

    public void zzsu()
    {
        try
        {
            PopupLocationInfoBinderCallbacks popuplocationinfobindercallbacks = new PopupLocationInfoBinderCallbacks(zzaoU);
            ((IGamesService)zznM()).zza(popuplocationinfobindercallbacks, zzaoX);
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
        }
    }

    public String zzsv()
    {
        String s;
        try
        {
            s = ((IGamesService)zznM()).zzsv();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public String zzsw()
    {
        if (zzaoS != null)
        {
            return zzaoS.getPlayerId();
        }
        String s;
        try
        {
            s = ((IGamesService)zznM()).zzsw();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return s;
    }

    public Player zzsx()
    {
        zznL();
        this;
        JVM INSTR monitorenter ;
        Object obj = zzaoS;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new PlayerBuffer(((IGamesService)zznM()).zzsT());
        if (((PlayerBuffer) (obj)).getCount() > 0)
        {
            zzaoS = (PlayerEntity)((PlayerBuffer) (obj)).get(0).freeze();
        }
        ((PlayerBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return zzaoS;
        Exception exception;
        exception;
        ((PlayerBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        zzb(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Game zzsy()
    {
        zznL();
        this;
        JVM INSTR monitorenter ;
        Object obj = zzaoT;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = new GameBuffer(((IGamesService)zznM()).zzsV());
        if (((GameBuffer) (obj)).getCount() > 0)
        {
            zzaoT = (GameEntity)((GameBuffer) (obj)).get(0).freeze();
        }
        ((GameBuffer) (obj)).release();
_L1:
        this;
        JVM INSTR monitorexit ;
        return zzaoT;
        Exception exception;
        exception;
        ((GameBuffer) (obj)).release();
        throw exception;
        Object obj1;
        obj1;
        zzb(((RemoteException) (obj1)));
          goto _L1
        obj1;
        this;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    public Intent zzsz()
    {
        Intent intent;
        try
        {
            intent = ((IGamesService)zznM()).zzsz();
        }
        catch (RemoteException remoteexception)
        {
            zzb(remoteexception);
            return null;
        }
        return intent;
    }
}
