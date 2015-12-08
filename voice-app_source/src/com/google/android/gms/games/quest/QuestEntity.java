// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.zzlc;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Quest, QuestEntityCreator, Milestone, MilestoneEntity

public final class QuestEntity
    implements SafeParcelable, Quest
{

    public static final android.os.Parcelable.Creator CREATOR = new QuestEntityCreator();
    private final String mName;
    private final int mState;
    private final int zzCY;
    private final int zzSq;
    private final String zzakM;
    private final long zzaoj;
    private final String zzauV;
    private final long zzauW;
    private final Uri zzauX;
    private final String zzauY;
    private final long zzauZ;
    private final GameEntity zzaud;
    private final Uri zzava;
    private final String zzavb;
    private final long zzavc;
    private final long zzavd;
    private final ArrayList zzave;

    QuestEntity(int i, GameEntity gameentity, String s, long l, Uri uri, String s1, 
            String s2, long l1, long l2, Uri uri1, String s3, 
            String s4, long l3, long l4, int j, int k, 
            ArrayList arraylist)
    {
        zzCY = i;
        zzaud = gameentity;
        zzauV = s;
        zzauW = l;
        zzauX = uri;
        zzauY = s1;
        zzakM = s2;
        zzauZ = l1;
        zzaoj = l2;
        zzava = uri1;
        zzavb = s3;
        mName = s4;
        zzavc = l3;
        zzavd = l4;
        mState = j;
        zzSq = k;
        zzave = arraylist;
    }

    public QuestEntity(Quest quest)
    {
        zzCY = 2;
        zzaud = new GameEntity(quest.getGame());
        zzauV = quest.getQuestId();
        zzauW = quest.getAcceptedTimestamp();
        zzakM = quest.getDescription();
        zzauX = quest.getBannerImageUri();
        zzauY = quest.getBannerImageUrl();
        zzauZ = quest.getEndTimestamp();
        zzava = quest.getIconImageUri();
        zzavb = quest.getIconImageUrl();
        zzaoj = quest.getLastUpdatedTimestamp();
        mName = quest.getName();
        zzavc = quest.zztO();
        zzavd = quest.getStartTimestamp();
        mState = quest.getState();
        zzSq = quest.getType();
        quest = quest.zztN();
        int j = quest.size();
        zzave = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            zzave.add((MilestoneEntity)(MilestoneEntity)((Milestone)quest.get(i)).freeze());
        }

    }

    static int zza(Quest quest)
    {
        return zzt.hashCode(new Object[] {
            quest.getGame(), quest.getQuestId(), Long.valueOf(quest.getAcceptedTimestamp()), quest.getBannerImageUri(), quest.getDescription(), Long.valueOf(quest.getEndTimestamp()), quest.getIconImageUri(), Long.valueOf(quest.getLastUpdatedTimestamp()), quest.zztN(), quest.getName(), 
            Long.valueOf(quest.zztO()), Long.valueOf(quest.getStartTimestamp()), Integer.valueOf(quest.getState())
        });
    }

    static boolean zza(Quest quest, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Quest) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (quest == obj) goto _L4; else goto _L3
_L3:
        obj = (Quest)obj;
        if (!zzt.equal(((Quest) (obj)).getGame(), quest.getGame()) || !zzt.equal(((Quest) (obj)).getQuestId(), quest.getQuestId()) || !zzt.equal(Long.valueOf(((Quest) (obj)).getAcceptedTimestamp()), Long.valueOf(quest.getAcceptedTimestamp())) || !zzt.equal(((Quest) (obj)).getBannerImageUri(), quest.getBannerImageUri()) || !zzt.equal(((Quest) (obj)).getDescription(), quest.getDescription()) || !zzt.equal(Long.valueOf(((Quest) (obj)).getEndTimestamp()), Long.valueOf(quest.getEndTimestamp())) || !zzt.equal(((Quest) (obj)).getIconImageUri(), quest.getIconImageUri()) || !zzt.equal(Long.valueOf(((Quest) (obj)).getLastUpdatedTimestamp()), Long.valueOf(quest.getLastUpdatedTimestamp())) || !zzt.equal(((Quest) (obj)).zztN(), quest.zztN()) || !zzt.equal(((Quest) (obj)).getName(), quest.getName()) || !zzt.equal(Long.valueOf(((Quest) (obj)).zztO()), Long.valueOf(quest.zztO())) || !zzt.equal(Long.valueOf(((Quest) (obj)).getStartTimestamp()), Long.valueOf(quest.getStartTimestamp())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(Integer.valueOf(((Quest) (obj)).getState()), Integer.valueOf(quest.getState()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Quest quest)
    {
        return zzt.zzt(quest).zzg("Game", quest.getGame()).zzg("QuestId", quest.getQuestId()).zzg("AcceptedTimestamp", Long.valueOf(quest.getAcceptedTimestamp())).zzg("BannerImageUri", quest.getBannerImageUri()).zzg("BannerImageUrl", quest.getBannerImageUrl()).zzg("Description", quest.getDescription()).zzg("EndTimestamp", Long.valueOf(quest.getEndTimestamp())).zzg("IconImageUri", quest.getIconImageUri()).zzg("IconImageUrl", quest.getIconImageUrl()).zzg("LastUpdatedTimestamp", Long.valueOf(quest.getLastUpdatedTimestamp())).zzg("Milestones", quest.zztN()).zzg("Name", quest.getName()).zzg("NotifyTimestamp", Long.valueOf(quest.zztO())).zzg("StartTimestamp", Long.valueOf(quest.getStartTimestamp())).zzg("State", Integer.valueOf(quest.getState())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Quest freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public long getAcceptedTimestamp()
    {
        return zzauW;
    }

    public Uri getBannerImageUri()
    {
        return zzauX;
    }

    public String getBannerImageUrl()
    {
        return zzauY;
    }

    public Milestone getCurrentMilestone()
    {
        return (Milestone)zztN().get(0);
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public long getEndTimestamp()
    {
        return zzauZ;
    }

    public Game getGame()
    {
        return zzaud;
    }

    public Uri getIconImageUri()
    {
        return zzava;
    }

    public String getIconImageUrl()
    {
        return zzavb;
    }

    public long getLastUpdatedTimestamp()
    {
        return zzaoj;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(mName, chararraybuffer);
    }

    public String getQuestId()
    {
        return zzauV;
    }

    public long getStartTimestamp()
    {
        return zzavd;
    }

    public int getState()
    {
        return mState;
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

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isEndingSoon()
    {
        return zzavc <= System.currentTimeMillis() + 0x1b7740L;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        QuestEntityCreator.zza(this, parcel, i);
    }

    public List zztN()
    {
        return new ArrayList(zzave);
    }

    public long zztO()
    {
        return zzavc;
    }

}
