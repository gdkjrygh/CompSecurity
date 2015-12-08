// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCondition, AppContentConditionEntityCreator

public final class AppContentConditionEntity
    implements SafeParcelable, AppContentCondition
{

    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
    private final int zzCY;
    private final String zzaoA;
    private final String zzaoB;
    private final Bundle zzaoC;
    private final String zzaoz;

    AppContentConditionEntity(int i, String s, String s1, String s2, Bundle bundle)
    {
        zzCY = i;
        zzaoz = s;
        zzaoA = s1;
        zzaoB = s2;
        zzaoC = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appcontentcondition)
    {
        zzCY = 1;
        zzaoz = appcontentcondition.zzse();
        zzaoA = appcontentcondition.zzsf();
        zzaoB = appcontentcondition.zzsg();
        zzaoC = appcontentcondition.zzsh();
    }

    static int zza(AppContentCondition appcontentcondition)
    {
        return zzt.hashCode(new Object[] {
            appcontentcondition.zzse(), appcontentcondition.zzsf(), appcontentcondition.zzsg(), appcontentcondition.zzsh()
        });
    }

    static boolean zza(AppContentCondition appcontentcondition, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentCondition) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentcondition == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCondition)obj;
        if (!zzt.equal(((AppContentCondition) (obj)).zzse(), appcontentcondition.zzse()) || !zzt.equal(((AppContentCondition) (obj)).zzsf(), appcontentcondition.zzsf()) || !zzt.equal(((AppContentCondition) (obj)).zzsg(), appcontentcondition.zzsg()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppContentCondition) (obj)).zzsh(), appcontentcondition.zzsh())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentCondition appcontentcondition)
    {
        return zzt.zzt(appcontentcondition).zzg("DefaultValue", appcontentcondition.zzse()).zzg("ExpectedValue", appcontentcondition.zzsf()).zzg("Predicate", appcontentcondition.zzsg()).zzg("PredicateParameters", appcontentcondition.zzsh()).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return zza(this, obj);
    }

    public Object freeze()
    {
        return zzsi();
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
        AppContentConditionEntityCreator.zza(this, parcel, i);
    }

    public String zzse()
    {
        return zzaoz;
    }

    public String zzsf()
    {
        return zzaoA;
    }

    public String zzsg()
    {
        return zzaoB;
    }

    public Bundle zzsh()
    {
        return zzaoC;
    }

    public AppContentCondition zzsi()
    {
        return this;
    }

}
