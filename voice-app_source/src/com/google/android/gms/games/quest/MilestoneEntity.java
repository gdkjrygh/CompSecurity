// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone, MilestoneEntityCreator

public final class MilestoneEntity
    implements SafeParcelable, Milestone
{

    public static final android.os.Parcelable.Creator CREATOR = new MilestoneEntityCreator();
    private final int mState;
    private final int zzCY;
    private final String zzaoK;
    private final String zzapR;
    private final long zzauS;
    private final long zzauT;
    private final byte zzauU[];

    MilestoneEntity(int i, String s, long l, long l1, byte abyte0[], 
            int j, String s1)
    {
        zzCY = i;
        zzapR = s;
        zzauS = l;
        zzauT = l1;
        zzauU = abyte0;
        mState = j;
        zzaoK = s1;
    }

    public MilestoneEntity(Milestone milestone)
    {
        zzCY = 4;
        zzapR = milestone.getMilestoneId();
        zzauS = milestone.getCurrentProgress();
        zzauT = milestone.getTargetProgress();
        mState = milestone.getState();
        zzaoK = milestone.getEventId();
        milestone = milestone.getCompletionRewardData();
        if (milestone == null)
        {
            zzauU = null;
            return;
        } else
        {
            zzauU = new byte[milestone.length];
            System.arraycopy(milestone, 0, zzauU, 0, milestone.length);
            return;
        }
    }

    static int zza(Milestone milestone)
    {
        return zzt.hashCode(new Object[] {
            milestone.getMilestoneId(), Long.valueOf(milestone.getCurrentProgress()), Long.valueOf(milestone.getTargetProgress()), Integer.valueOf(milestone.getState()), milestone.getEventId()
        });
    }

    static boolean zza(Milestone milestone, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Milestone) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (milestone == obj) goto _L4; else goto _L3
_L3:
        obj = (Milestone)obj;
        if (!zzt.equal(((Milestone) (obj)).getMilestoneId(), milestone.getMilestoneId()) || !zzt.equal(Long.valueOf(((Milestone) (obj)).getCurrentProgress()), Long.valueOf(milestone.getCurrentProgress())) || !zzt.equal(Long.valueOf(((Milestone) (obj)).getTargetProgress()), Long.valueOf(milestone.getTargetProgress())) || !zzt.equal(Integer.valueOf(((Milestone) (obj)).getState()), Integer.valueOf(milestone.getState())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((Milestone) (obj)).getEventId(), milestone.getEventId())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(Milestone milestone)
    {
        return zzt.zzt(milestone).zzg("MilestoneId", milestone.getMilestoneId()).zzg("CurrentProgress", Long.valueOf(milestone.getCurrentProgress())).zzg("TargetProgress", Long.valueOf(milestone.getTargetProgress())).zzg("State", Integer.valueOf(milestone.getState())).zzg("CompletionRewardData", milestone.getCompletionRewardData()).zzg("EventId", milestone.getEventId()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Milestone freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public byte[] getCompletionRewardData()
    {
        return zzauU;
    }

    public long getCurrentProgress()
    {
        return zzauS;
    }

    public String getEventId()
    {
        return zzaoK;
    }

    public String getMilestoneId()
    {
        return zzapR;
    }

    public int getState()
    {
        return mState;
    }

    public long getTargetProgress()
    {
        return zzauT;
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

    public String toString()
    {
        return zzb(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MilestoneEntityCreator.zza(this, parcel, i);
    }

}
