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
//            AppContentSection, AppContentSectionEntityCreator, AppContentAction, AppContentActionEntity, 
//            AppContentCard, AppContentCardEntity, AppContentAnnotation, AppContentAnnotationEntity

public final class AppContentSectionEntity
    implements SafeParcelable, AppContentSection
{

    public static final AppContentSectionEntityCreator CREATOR = new AppContentSectionEntityCreator();
    private final ArrayList mActions;
    private final Bundle mExtras;
    private final int zzCY;
    private final String zzEl;
    private final String zzKI;
    private final String zzadv;
    private final ArrayList zzaoE;
    private final String zzaoF;
    private final String zzaom;
    private final ArrayList zzaov;
    private final String zzaox;

    AppContentSectionEntity(int i, ArrayList arraylist, ArrayList arraylist1, String s, Bundle bundle, String s1, String s2, 
            String s3, String s4, String s5, ArrayList arraylist2)
    {
        zzCY = i;
        mActions = arraylist;
        zzaov = arraylist2;
        zzaoE = arraylist1;
        zzaoF = s5;
        zzaom = s;
        mExtras = bundle;
        zzKI = s4;
        zzaox = s1;
        zzadv = s2;
        zzEl = s3;
    }

    public AppContentSectionEntity(AppContentSection appcontentsection)
    {
        boolean flag = false;
        super();
        zzCY = 5;
        zzaoF = appcontentsection.zzsk();
        zzaom = appcontentsection.zzrP();
        mExtras = appcontentsection.getExtras();
        zzKI = appcontentsection.getId();
        zzaox = appcontentsection.zzsb();
        zzadv = appcontentsection.getTitle();
        zzEl = appcontentsection.getType();
        List list = appcontentsection.getActions();
        int l = list.size();
        mActions = new ArrayList(l);
        for (int i = 0; i < l; i++)
        {
            mActions.add((AppContentActionEntity)(AppContentActionEntity)((AppContentAction)list.get(i)).freeze());
        }

        list = appcontentsection.zzsj();
        l = list.size();
        zzaoE = new ArrayList(l);
        for (int j = 0; j < l; j++)
        {
            zzaoE.add((AppContentCardEntity)(AppContentCardEntity)((AppContentCard)list.get(j)).freeze());
        }

        appcontentsection = appcontentsection.zzrZ();
        l = appcontentsection.size();
        zzaov = new ArrayList(l);
        for (int k = ((flag) ? 1 : 0); k < l; k++)
        {
            zzaov.add((AppContentAnnotationEntity)(AppContentAnnotationEntity)((AppContentAnnotation)appcontentsection.get(k)).freeze());
        }

    }

    static int zza(AppContentSection appcontentsection)
    {
        return zzt.hashCode(new Object[] {
            appcontentsection.getActions(), appcontentsection.zzrZ(), appcontentsection.zzsj(), appcontentsection.zzsk(), appcontentsection.zzrP(), appcontentsection.getExtras(), appcontentsection.getId(), appcontentsection.zzsb(), appcontentsection.getTitle(), appcontentsection.getType()
        });
    }

    static boolean zza(AppContentSection appcontentsection, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentSection) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentsection == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentSection)obj;
        if (!zzt.equal(((AppContentSection) (obj)).getActions(), appcontentsection.getActions()) || !zzt.equal(((AppContentSection) (obj)).zzrZ(), appcontentsection.zzrZ()) || !zzt.equal(((AppContentSection) (obj)).zzsj(), appcontentsection.zzsj()) || !zzt.equal(((AppContentSection) (obj)).zzsk(), appcontentsection.zzsk()) || !zzt.equal(((AppContentSection) (obj)).zzrP(), appcontentsection.zzrP()) || !zzt.equal(((AppContentSection) (obj)).getExtras(), appcontentsection.getExtras()) || !zzt.equal(((AppContentSection) (obj)).getId(), appcontentsection.getId()) || !zzt.equal(((AppContentSection) (obj)).zzsb(), appcontentsection.zzsb()) || !zzt.equal(((AppContentSection) (obj)).getTitle(), appcontentsection.getTitle()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppContentSection) (obj)).getType(), appcontentsection.getType())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentSection appcontentsection)
    {
        return zzt.zzt(appcontentsection).zzg("Actions", appcontentsection.getActions()).zzg("Annotations", appcontentsection.zzrZ()).zzg("Cards", appcontentsection.zzsj()).zzg("CardType", appcontentsection.zzsk()).zzg("ContentDescription", appcontentsection.zzrP()).zzg("Extras", appcontentsection.getExtras()).zzg("Id", appcontentsection.getId()).zzg("Subtitle", appcontentsection.zzsb()).zzg("Title", appcontentsection.getTitle()).zzg("Type", appcontentsection.getType()).toString();
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
        return zzsl();
    }

    public List getActions()
    {
        return new ArrayList(mActions);
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
        AppContentSectionEntityCreator.zza(this, parcel, i);
    }

    public String zzrP()
    {
        return zzaom;
    }

    public List zzrZ()
    {
        return new ArrayList(zzaov);
    }

    public String zzsb()
    {
        return zzaox;
    }

    public List zzsj()
    {
        return new ArrayList(zzaoE);
    }

    public String zzsk()
    {
        return zzaoF;
    }

    public AppContentSection zzsl()
    {
        return this;
    }

}
