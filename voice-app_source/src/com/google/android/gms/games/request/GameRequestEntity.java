// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntityCreator

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final android.os.Parcelable.Creator CREATOR = new GameRequestEntityCreator();
    private final int zzCY;
    private final String zzDK;
    private final int zzSq;
    private final byte zzauL[];
    private final GameEntity zzaud;
    private final long zzaue;
    private final PlayerEntity zzavf;
    private final ArrayList zzavg;
    private final long zzavh;
    private final Bundle zzavi;
    private final int zzwS;

    GameRequestEntity(int i, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int j, 
            long l, long l1, Bundle bundle, int k)
    {
        zzCY = i;
        zzaud = gameentity;
        zzavf = playerentity;
        zzauL = abyte0;
        zzDK = s;
        zzavg = arraylist;
        zzSq = j;
        zzaue = l;
        zzavh = l1;
        zzavi = bundle;
        zzwS = k;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        zzCY = 2;
        zzaud = new GameEntity(gamerequest.getGame());
        zzavf = new PlayerEntity(gamerequest.getSender());
        zzDK = gamerequest.getRequestId();
        zzSq = gamerequest.getType();
        zzaue = gamerequest.getCreationTimestamp();
        zzavh = gamerequest.getExpirationTimestamp();
        zzwS = gamerequest.getStatus();
        Object obj = gamerequest.getData();
        int j;
        if (obj == null)
        {
            zzauL = null;
        } else
        {
            zzauL = new byte[obj.length];
            System.arraycopy(obj, 0, zzauL, 0, obj.length);
        }
        obj = gamerequest.getRecipients();
        j = ((List) (obj)).size();
        zzavg = new ArrayList(j);
        zzavi = new Bundle();
        for (int i = 0; i < j; i++)
        {
            Player player = (Player)((Player)((List) (obj)).get(i)).freeze();
            String s = player.getPlayerId();
            zzavg.add((PlayerEntity)player);
            zzavi.putInt(s, gamerequest.getRecipientStatus(s));
        }

    }

    static int zza(GameRequest gamerequest)
    {
        return zzt.hashCode(new Object[] {
            gamerequest.getGame(), gamerequest.getRecipients(), gamerequest.getRequestId(), gamerequest.getSender(), zzb(gamerequest), Integer.valueOf(gamerequest.getType()), Long.valueOf(gamerequest.getCreationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp())
        });
    }

    static boolean zza(GameRequest gamerequest, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof GameRequest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (gamerequest == obj) goto _L4; else goto _L3
_L3:
        obj = (GameRequest)obj;
        if (!zzt.equal(((GameRequest) (obj)).getGame(), gamerequest.getGame()) || !zzt.equal(((GameRequest) (obj)).getRecipients(), gamerequest.getRecipients()) || !zzt.equal(((GameRequest) (obj)).getRequestId(), gamerequest.getRequestId()) || !zzt.equal(((GameRequest) (obj)).getSender(), gamerequest.getSender()) || !Arrays.equals(zzb(((GameRequest) (obj))), zzb(gamerequest)) || !zzt.equal(Integer.valueOf(((GameRequest) (obj)).getType()), Integer.valueOf(gamerequest.getType())) || !zzt.equal(Long.valueOf(((GameRequest) (obj)).getCreationTimestamp()), Long.valueOf(gamerequest.getCreationTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Long.valueOf(((GameRequest) (obj)).getExpirationTimestamp()), Long.valueOf(gamerequest.getExpirationTimestamp()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    private static int[] zzb(GameRequest gamerequest)
    {
        List list = gamerequest.getRecipients();
        int j = list.size();
        int ai[] = new int[j];
        for (int i = 0; i < j; i++)
        {
            ai[i] = gamerequest.getRecipientStatus(((Player)list.get(i)).getPlayerId());
        }

        return ai;
    }

    static String zzc(GameRequest gamerequest)
    {
        return zzt.zzt(gamerequest).zzg("Game", gamerequest.getGame()).zzg("Sender", gamerequest.getSender()).zzg("Recipients", gamerequest.getRecipients()).zzg("Data", gamerequest.getData()).zzg("RequestId", gamerequest.getRequestId()).zzg("Type", Integer.valueOf(gamerequest.getType())).zzg("CreationTimestamp", Long.valueOf(gamerequest.getCreationTimestamp())).zzg("ExpirationTimestamp", Long.valueOf(gamerequest.getExpirationTimestamp())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public GameRequest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getCreationTimestamp()
    {
        return zzaue;
    }

    public byte[] getData()
    {
        return zzauL;
    }

    public long getExpirationTimestamp()
    {
        return zzavh;
    }

    public Game getGame()
    {
        return zzaud;
    }

    public int getRecipientStatus(String s)
    {
        return zzavi.getInt(s, 0);
    }

    public List getRecipients()
    {
        return new ArrayList(zzavg);
    }

    public String getRequestId()
    {
        return zzDK;
    }

    public Player getSender()
    {
        return zzavf;
    }

    public int getStatus()
    {
        return zzwS;
    }

    public int getType()
    {
        return zzSq;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isConsumed(String s)
    {
        return getRecipientStatus(s) == 1;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzc(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GameRequestEntityCreator.zza(this, parcel, i);
    }

    public Bundle zztP()
    {
        return zzavi;
    }

}
