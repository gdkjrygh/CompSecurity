// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.zzlc;

// Referenced classes of package com.google.android.gms.games.achievement:
//            Achievement, AchievementEntityCreator

public final class AchievementEntity
    implements SafeParcelable, Achievement
{

    public static final android.os.Parcelable.Creator CREATOR = new AchievementEntityCreator();
    private final String mName;
    private final int mState;
    private final int zzCY;
    private final int zzSq;
    private final String zzakM;
    private final String zzanZ;
    private final Uri zzaoa;
    private final String zzaob;
    private final Uri zzaoc;
    private final String zzaod;
    private final int zzaoe;
    private final String zzaof;
    private final PlayerEntity zzaog;
    private final int zzaoh;
    private final String zzaoi;
    private final long zzaoj;
    private final long zzaok;

    AchievementEntity(int i, String s, int j, String s1, String s2, Uri uri, String s3, 
            Uri uri1, String s4, int k, String s5, PlayerEntity playerentity, int l, int i1, 
            String s6, long l1, long l2)
    {
        zzCY = i;
        zzanZ = s;
        zzSq = j;
        mName = s1;
        zzakM = s2;
        zzaoa = uri;
        zzaob = s3;
        zzaoc = uri1;
        zzaod = s4;
        zzaoe = k;
        zzaof = s5;
        zzaog = playerentity;
        mState = l;
        zzaoh = i1;
        zzaoi = s6;
        zzaoj = l1;
        zzaok = l2;
    }

    public AchievementEntity(Achievement achievement)
    {
        zzCY = 1;
        zzanZ = achievement.getAchievementId();
        zzSq = achievement.getType();
        mName = achievement.getName();
        zzakM = achievement.getDescription();
        zzaoa = achievement.getUnlockedImageUri();
        zzaob = achievement.getUnlockedImageUrl();
        zzaoc = achievement.getRevealedImageUri();
        zzaod = achievement.getRevealedImageUrl();
        zzaog = (PlayerEntity)achievement.getPlayer().freeze();
        mState = achievement.getState();
        zzaoj = achievement.getLastUpdatedTimestamp();
        zzaok = achievement.getXpValue();
        if (achievement.getType() == 1)
        {
            zzaoe = achievement.getTotalSteps();
            zzaof = achievement.getFormattedTotalSteps();
            zzaoh = achievement.getCurrentSteps();
            zzaoi = achievement.getFormattedCurrentSteps();
        } else
        {
            zzaoe = 0;
            zzaof = null;
            zzaoh = 0;
            zzaoi = null;
        }
        com.google.android.gms.common.internal.zzb.zzq(zzanZ);
        com.google.android.gms.common.internal.zzb.zzq(zzakM);
    }

    static int zza(Achievement achievement)
    {
        int i;
        int j;
        if (achievement.getType() == 1)
        {
            j = achievement.getCurrentSteps();
            i = achievement.getTotalSteps();
        } else
        {
            i = 0;
            j = 0;
        }
        return zzt.hashCode(new Object[] {
            achievement.getAchievementId(), achievement.getName(), Integer.valueOf(achievement.getType()), achievement.getDescription(), Long.valueOf(achievement.getXpValue()), Integer.valueOf(achievement.getState()), Long.valueOf(achievement.getLastUpdatedTimestamp()), achievement.getPlayer(), Integer.valueOf(j), Integer.valueOf(i)
        });
    }

    static boolean zza(Achievement achievement, Object obj)
    {
        boolean flag2 = true;
        if (obj instanceof Achievement) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (achievement == obj) goto _L4; else goto _L3
_L3:
        obj = (Achievement)obj;
        boolean flag;
        if (achievement.getType() == 1)
        {
            flag1 = zzt.equal(Integer.valueOf(((Achievement) (obj)).getCurrentSteps()), Integer.valueOf(achievement.getCurrentSteps()));
            flag = zzt.equal(Integer.valueOf(((Achievement) (obj)).getTotalSteps()), Integer.valueOf(achievement.getTotalSteps()));
        } else
        {
            flag = true;
            flag1 = true;
        }
        if (!zzt.equal(((Achievement) (obj)).getAchievementId(), achievement.getAchievementId()) || !zzt.equal(((Achievement) (obj)).getName(), achievement.getName()) || !zzt.equal(Integer.valueOf(((Achievement) (obj)).getType()), Integer.valueOf(achievement.getType())) || !zzt.equal(((Achievement) (obj)).getDescription(), achievement.getDescription()) || !zzt.equal(Long.valueOf(((Achievement) (obj)).getXpValue()), Long.valueOf(achievement.getXpValue())) || !zzt.equal(Integer.valueOf(((Achievement) (obj)).getState()), Integer.valueOf(achievement.getState())) || !zzt.equal(Long.valueOf(((Achievement) (obj)).getLastUpdatedTimestamp()), Long.valueOf(achievement.getLastUpdatedTimestamp())) || !zzt.equal(((Achievement) (obj)).getPlayer(), achievement.getPlayer()) || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (flag) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Achievement achievement)
    {
        com.google.android.gms.common.internal.zzt.zza zza1 = zzt.zzt(achievement).zzg("Id", achievement.getAchievementId()).zzg("Type", Integer.valueOf(achievement.getType())).zzg("Name", achievement.getName()).zzg("Description", achievement.getDescription()).zzg("Player", achievement.getPlayer()).zzg("State", Integer.valueOf(achievement.getState()));
        if (achievement.getType() == 1)
        {
            zza1.zzg("CurrentSteps", Integer.valueOf(achievement.getCurrentSteps()));
            zza1.zzg("TotalSteps", Integer.valueOf(achievement.getTotalSteps()));
        }
        return zza1.toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Achievement freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getAchievementId()
    {
        return zzanZ;
    }

    public int getCurrentSteps()
    {
        return zzaoh;
    }

    public String getDescription()
    {
        return zzakM;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzakM, chararraybuffer);
    }

    public String getFormattedCurrentSteps()
    {
        return zzaoi;
    }

    public void getFormattedCurrentSteps(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzaoi, chararraybuffer);
    }

    public String getFormattedTotalSteps()
    {
        return zzaof;
    }

    public void getFormattedTotalSteps(CharArrayBuffer chararraybuffer)
    {
        zzlc.zzb(zzaof, chararraybuffer);
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

    public Player getPlayer()
    {
        return zzaog;
    }

    public Uri getRevealedImageUri()
    {
        return zzaoc;
    }

    public String getRevealedImageUrl()
    {
        return zzaod;
    }

    public int getState()
    {
        return mState;
    }

    public int getTotalSteps()
    {
        return zzaoe;
    }

    public int getType()
    {
        return zzSq;
    }

    public Uri getUnlockedImageUri()
    {
        return zzaoa;
    }

    public String getUnlockedImageUrl()
    {
        return zzaob;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public long getXpValue()
    {
        return zzaok;
    }

    public int hashCode()
    {
        return zza(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AchievementEntityCreator.zza(this, parcel, i);
    }

}
