// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentAnnotation, AppContentAnnotationEntityCreator

public final class AppContentAnnotationEntity
    implements SafeParcelable, AppContentAnnotation
{

    public static final AppContentAnnotationEntityCreator CREATOR = new AppContentAnnotationEntityCreator();
    private final int zzCY;
    private final String zzKI;
    private final String zzadv;
    private final String zzakM;
    private final Uri zzaop;
    private final String zzaoq;
    private final String zzaor;
    private final int zzaos;
    private final int zzaot;
    private final Bundle zzaou;

    AppContentAnnotationEntity(int i, String s, Uri uri, String s1, String s2, String s3, String s4, 
            int j, int k, Bundle bundle)
    {
        zzCY = i;
        zzakM = s;
        zzKI = s2;
        zzaor = s4;
        zzaos = j;
        zzaop = uri;
        zzaot = k;
        zzaoq = s3;
        zzaou = bundle;
        zzadv = s1;
    }

    public AppContentAnnotationEntity(AppContentAnnotation appcontentannotation)
    {
        zzCY = 4;
        zzakM = appcontentannotation.getDescription();
        zzKI = appcontentannotation.getId();
        zzaor = appcontentannotation.zzrS();
        zzaos = appcontentannotation.zzrT();
        zzaop = appcontentannotation.zzrU();
        zzaot = appcontentannotation.zzrW();
        zzaoq = appcontentannotation.zzrX();
        zzaou = appcontentannotation.zzrV();
        zzadv = appcontentannotation.getTitle();
    }

    static int zza(AppContentAnnotation appcontentannotation)
    {
        return zzt.hashCode(new Object[] {
            appcontentannotation.getDescription(), appcontentannotation.getId(), appcontentannotation.zzrS(), Integer.valueOf(appcontentannotation.zzrT()), appcontentannotation.zzrU(), Integer.valueOf(appcontentannotation.zzrW()), appcontentannotation.zzrX(), appcontentannotation.zzrV(), appcontentannotation.getTitle()
        });
    }

    static boolean zza(AppContentAnnotation appcontentannotation, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof AppContentAnnotation) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (appcontentannotation == obj) goto _L4; else goto _L3
_L3:
        obj = (AppContentAnnotation)obj;
        if (!zzt.equal(((AppContentAnnotation) (obj)).getDescription(), appcontentannotation.getDescription()) || !zzt.equal(((AppContentAnnotation) (obj)).getId(), appcontentannotation.getId()) || !zzt.equal(((AppContentAnnotation) (obj)).zzrS(), appcontentannotation.zzrS()) || !zzt.equal(Integer.valueOf(((AppContentAnnotation) (obj)).zzrT()), Integer.valueOf(appcontentannotation.zzrT())) || !zzt.equal(((AppContentAnnotation) (obj)).zzrU(), appcontentannotation.zzrU()) || !zzt.equal(Integer.valueOf(((AppContentAnnotation) (obj)).zzrW()), Integer.valueOf(appcontentannotation.zzrW())) || !zzt.equal(((AppContentAnnotation) (obj)).zzrX(), appcontentannotation.zzrX()) || !zzt.equal(((AppContentAnnotation) (obj)).zzrV(), appcontentannotation.zzrV()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (zzt.equal(((AppContentAnnotation) (obj)).getTitle(), appcontentannotation.getTitle())) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String zzb(AppContentAnnotation appcontentannotation)
    {
        return zzt.zzt(appcontentannotation).zzg("Description", appcontentannotation.getDescription()).zzg("Id", appcontentannotation.getId()).zzg("ImageDefaultId", appcontentannotation.zzrS()).zzg("ImageHeight", Integer.valueOf(appcontentannotation.zzrT())).zzg("ImageUri", appcontentannotation.zzrU()).zzg("ImageWidth", Integer.valueOf(appcontentannotation.zzrW())).zzg("LayoutSlot", appcontentannotation.zzrX()).zzg("Modifiers", appcontentannotation.zzrV()).zzg("Title", appcontentannotation.getTitle()).toString();
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
        return zzrY();
    }

    public String getDescription()
    {
        return zzakM;
    }

    public String getId()
    {
        return zzKI;
    }

    public String getTitle()
    {
        return zzadv;
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
        AppContentAnnotationEntityCreator.zza(this, parcel, i);
    }

    public String zzrS()
    {
        return zzaor;
    }

    public int zzrT()
    {
        return zzaos;
    }

    public Uri zzrU()
    {
        return zzaop;
    }

    public Bundle zzrV()
    {
        return zzaou;
    }

    public int zzrW()
    {
        return zzaot;
    }

    public String zzrX()
    {
        return zzaoq;
    }

    public AppContentAnnotation zzrY()
    {
        return this;
    }

}
