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
//            AppContentCard, AppContentCardEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentAnnotation, AppContentAnnotationEntity, AppContentCondition, AppContentConditionEntity

public final class AppContentCardEntity
    implements SafeParcelable, AppContentCard
{

    public static final AppContentCardEntityCreator CREATOR = new AppContentCardEntityCreator();
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final String zzadv;
    private final String zzakM;
    private final ArrayList zzaol;
    private final String zzaom;
    private final ArrayList zzaov;
    private final int zzaow;
    private final String zzaox;
    private final int zzaoy;

    AppContentCardEntity(int i, ArrayList arraylist, ArrayList arraylist1, ArrayList arraylist2, String s, int j, String s1, 
            Bundle bundle, String s2, String s3, int k, String s4, String s5)
    {
        zzCY = i;
        mActions = arraylist;
        zzaov = arraylist1;
        zzaol = arraylist2;
        zzaom = s;
        zzaow = j;
        zzakM = s1;
        mExtras = bundle;
        zzKI = s5;
        zzaox = s2;
        zzadv = s3;
        zzaoy = k;
        zzEl = s4;
    }

    public AppContentCardEntity(AppContentCard appcontentcard)
    {
        boolean flag = false;
        super();
        zzCY = 4;
        zzaom = appcontentcard.zzrP();
        zzaow = appcontentcard.zzsa();
        zzakM = appcontentcard.getDescription();
        mExtras = appcontentcard.getExtras();
        zzKI = appcontentcard.getId();
        zzadv = appcontentcard.getTitle();
        zzaox = appcontentcard.zzsb();
        zzaoy = appcontentcard.zzsc();
        zzEl = appcontentcard.getType();
        List list = appcontentcard.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        list = appcontentcard.zzrZ();
        l = list.size();
        zzaov = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            zzaov.add((AppContentAnnotationEntity)(AppContentAnnotationEntity)((AppContentAnnotation)list.get(j)).freeze());
        }

        appcontentcard = appcontentcard.zzrO();
        l = appcontentcard.size();
        zzaol = new ArrayList(l);
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            zzaol.add((AppContentConditionEntity)(AppContentConditionEntity)((AppContentCondition)appcontentcard.get(k)).freeze());
        }

    }

    static int zza(AppContentCard appcontentcard)
    {
        return zzt.hashCode(new Object[] {
            appcontentcard.getActions(), appcontentcard.zzrZ(), appcontentcard.zzrO(), appcontentcard.zzrP(), Integer.valueOf(appcontentcard.zzsa()), appcontentcard.getDescription(), appcontentcard.getExtras(), appcontentcard.getId(), appcontentcard.zzsb(), appcontentcard.getTitle(), 
            Integer.valueOf(appcontentcard.zzsc()), appcontentcard.getType()
        });
    }

    static boolean zza(AppContentCard appcontentcard, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentCard) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentcard == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentCard)obj;
        if (!zzt.equal(((AppContentCard) (obj)).getActions(), appcontentcard.getActions()) || !zzt.equal(((AppContentCard) (obj)).zzrZ(), appcontentcard.zzrZ()) || !zzt.equal(((AppContentCard) (obj)).zzrO(), appcontentcard.zzrO()) || !zzt.equal(((AppContentCard) (obj)).zzrP(), appcontentcard.zzrP()) || !zzt.equal(Integer.valueOf(((AppContentCard) (obj)).zzsa()), Integer.valueOf(appcontentcard.zzsa())) || !zzt.equal(((AppContentCard) (obj)).getDescription(), appcontentcard.getDescription()) || !zzt.equal(((AppContentCard) (obj)).getExtras(), appcontentcard.getExtras()) || !zzt.equal(((AppContentCard) (obj)).getId(), appcontentcard.getId()) || !zzt.equal(((AppContentCard) (obj)).zzsb(), appcontentcard.zzsb()) || !zzt.equal(((AppContentCard) (obj)).getTitle(), appcontentcard.getTitle()) || !zzt.equal(Integer.valueOf(((AppContentCard) (obj)).zzsc()), Integer.valueOf(appcontentcard.zzsc())))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppContentCard) (obj)).getType(), appcontentcard.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentCard appcontentcard)
    {
        return zzt.zzt(appcontentcard).zzg("Actions", appcontentcard.getActions()).zzg("Annotations", appcontentcard.zzrZ()).zzg("Conditions", appcontentcard.zzrO()).zzg("ContentDescription", appcontentcard.zzrP()).zzg("CurrentSteps", Integer.valueOf(appcontentcard.zzsa())).zzg("Description", appcontentcard.getDescription()).zzg("Extras", appcontentcard.getExtras()).zzg("Id", appcontentcard.getId()).zzg("Subtitle", appcontentcard.zzsb()).zzg("Title", appcontentcard.getTitle()).zzg("TotalSteps", Integer.valueOf(appcontentcard.zzsc())).zzg("Type", appcontentcard.getType()).toString();
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
        return zzsd();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
    }

    public String getDescription()
    {
        return zzakM;
    }

    public Bundle getExtras()
    {
        return mExtras;
    }

    public String getId()
    {
        return zzKI;
    }

    public String getTitle()
    {
        return zzadv;
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
        AppContentCardEntityCreator.zza(this, parcel, i);
    }

    public List zzrO()
    {
        return new ArrayList(zzaol);
    }

    public String zzrP()
    {
        return zzaom;
    }

    public List zzrZ()
    {
        return new ArrayList(zzaov);
    }

    public int zzsa()
    {
        return zzaow;
    }

    public String zzsb()
    {
        return zzaox;
    }

    public int zzsc()
    {
        return zzaoy;
    }

    public AppContentCard zzsd()
    {
        return this;
    }

}
