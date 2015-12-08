// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAction, AppContentActionEntityCreator, AppContentAnnotation, AppContentAnnotationEntity, 
//            AppContentCondition, AppContentConditionEntity

public final class AppContentActionEntity
    implements SafeParcelable, AppContentAction
{

    public static final AppContentActionEntityCreator CREATOR = new AppContentActionEntityCreator();
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final ArrayList zzaol;
    private final String zzaom;
    private final AppContentAnnotationEntity zzaon;
    private final String zzaoo;

    AppContentActionEntity(int i, ArrayList arraylist, String s, Bundle bundle, String s1, String s2, AppContentAnnotationEntity appcontentannotationentity, 
            String s3)
    {
        zzCY = i;
        zzaon = appcontentannotationentity;
        zzaol = arraylist;
        zzaom = s;
        mExtras = bundle;
        zzKI = s2;
        zzaoo = s3;
        zzEl = s1;
    }

    public AppContentActionEntity(AppContentAction appcontentaction)
    {
        zzCY = 5;
        zzaon = (AppContentAnnotationEntity)appcontentaction.zzrN().freeze();
        zzaom = appcontentaction.zzrP();
        mExtras = appcontentaction.getExtras();
        zzKI = appcontentaction.getId();
        zzaoo = appcontentaction.zzrQ();
        zzEl = appcontentaction.getType();
        appcontentaction = appcontentaction.zzrO();
        int j = appcontentaction.size();
        zzaol = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            zzaol.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentaction.get(i)).freeze());
        }

    }

    static int zza(AppContentAction appcontentaction)
    {
        return zzt.hashCode(new Object[] {
            appcontentaction.zzrN(), appcontentaction.zzrO(), appcontentaction.zzrP(), appcontentaction.getExtras(), appcontentaction.getId(), appcontentaction.zzrQ(), appcontentaction.getType()
        });
    }

    static boolean zza(AppContentAction appcontentaction, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentAction) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentaction == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAction)obj;
        if (!zzt.equal(((AppContentAction) (obj)).zzrN(), appcontentaction.zzrN()) || !zzt.equal(((AppContentAction) (obj)).zzrO(), appcontentaction.zzrO()) || !zzt.equal(((AppContentAction) (obj)).zzrP(), appcontentaction.zzrP()) || !zzt.equal(((AppContentAction) (obj)).getExtras(), appcontentaction.getExtras()) || !zzt.equal(((AppContentAction) (obj)).getId(), appcontentaction.getId()) || !zzt.equal(((AppContentAction) (obj)).zzrQ(), appcontentaction.zzrQ()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppContentAction) (obj)).getType(), appcontentaction.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentAction appcontentaction)
    {
        return zzt.zzt(appcontentaction).zzg("Annotation", appcontentaction.zzrN()).zzg("Conditions", appcontentaction.zzrO()).zzg("ContentDescription", appcontentaction.zzrP()).zzg("Extras", appcontentaction.getExtras()).zzg("Id", appcontentaction.getId()).zzg("OverflowText", appcontentaction.zzrQ()).zzg("Type", appcontentaction.getType()).toString();
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
        return zzrR();
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getId()
    {
        return zzKI;
    }

    public String getType()
    {
        return zzEl;
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
        AppContentActionEntityCreator.zza(this, parcel, i);
    }

    public AppContentAnnotation zzrN()
    {
        return zzaon;
    }

    public List zzrO()
    {
        return new ArrayList(zzaol);
    }

    public String zzrP()
    {
        return zzaom;
    }

    public String zzrQ()
    {
        return zzaoo;
    }

    public AppContentAction zzrR()
    {
        return this;
    }

}
