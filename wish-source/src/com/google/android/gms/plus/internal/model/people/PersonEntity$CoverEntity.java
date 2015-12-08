// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.internal.model.people:
//            PersonEntity, zzc, zzd, zze

public static final class zzaAY extends FastSafeParcelableJsonResponse
{
    public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse
    {

        public static final zzd CREATOR = new zzd();
        private static final HashMap zzazC;
        int zzaAZ;
        int zzaBa;
        final Set zzazD;
        final int zzzH;

        public int describeContents()
        {
            zzd zzd1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof CoverInfoEntity))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (CoverInfoEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for (Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if (!zza(field))
                        {
                            continue label1;
                        }
                        if (((CoverInfoEntity) (obj)).zza(field))
                        {
                            if (!zzb(field).equals(((CoverInfoEntity) (obj)).zzb(field)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((CoverInfoEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (zza(field))
                {
                    int j = field.zzmE();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzd zzd1 = CREATOR;
            zzd.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmE()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.zzmE())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmE()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzaAZ);

            case 3: // '\003'
                return Integer.valueOf(zzaBa);
            }
        }

        public Map zzmx()
        {
            return zzvJ();
        }

        public HashMap zzvJ()
        {
            return zzazC;
        }

        static 
        {
            zzazC = new HashMap();
            zzazC.put("leftImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("leftImageOffset", 2));
            zzazC.put("topImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("topImageOffset", 3));
        }

        public CoverInfoEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        CoverInfoEntity(Set set, int i, int j, int k)
        {
            zzazD = set;
            zzzH = i;
            zzaAZ = j;
            zzaBa = k;
        }
    }

    public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse
    {

        public static final zze CREATOR = new zze();
        private static final HashMap zzazC;
        String zzAX;
        final Set zzazD;
        int zzma;
        int zzmb;
        final int zzzH;

        public int describeContents()
        {
            zze zze1 = CREATOR;
            return 0;
        }

        public boolean equals(Object obj)
        {
label0:
            {
                if (!(obj instanceof CoverPhotoEntity))
                {
                    return false;
                }
                if (this == obj)
                {
                    return true;
                }
                obj = (CoverPhotoEntity)obj;
                com.google.android.gms.common.server.response.FastJsonResponse.Field field;
label1:
                do
                {
                    for (Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                    {
                        field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                        if (!zza(field))
                        {
                            continue label1;
                        }
                        if (((CoverPhotoEntity) (obj)).zza(field))
                        {
                            if (!zzb(field).equals(((CoverPhotoEntity) (obj)).zzb(field)))
                            {
                                return false;
                            }
                        } else
                        {
                            return false;
                        }
                    }

                    break label0;
                } while (!((CoverPhotoEntity) (obj)).zza(field));
                return false;
            }
            return true;
        }

        public int hashCode()
        {
            Iterator iterator = zzazC.values().iterator();
            int i = 0;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field)iterator.next();
                if (zza(field))
                {
                    int j = field.zzmE();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zze zze1 = CREATOR;
            zze.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzazD.contains(Integer.valueOf(field.zzmE()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.zzmE())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzmE()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzmb);

            case 3: // '\003'
                return zzAX;

            case 4: // '\004'
                return Integer.valueOf(zzma);
            }
        }

        public Map zzmx()
        {
            return zzvJ();
        }

        public HashMap zzvJ()
        {
            return zzazC;
        }

        static 
        {
            zzazC = new HashMap();
            zzazC.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("height", 2));
            zzazC.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzk("url", 3));
            zzazC.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzh("width", 4));
        }

        public CoverPhotoEntity()
        {
            zzzH = 1;
            zzazD = new HashSet();
        }

        CoverPhotoEntity(Set set, int i, int j, String s, int k)
        {
            zzazD = set;
            zzzH = i;
            zzmb = j;
            zzAX = s;
            zzma = k;
        }
    }


    public static final zzc CREATOR = new zzc();
    private static final HashMap zzazC;
    CoverInfoEntity zzaAW;
    CoverPhotoEntity zzaAX;
    int zzaAY;
    final Set zzazD;
    final int zzzH;

    public int describeContents()
    {
        zzc zzc1 = CREATOR;
        return 0;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof CREATOR))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (CREATOR)obj;
            com.google.android.gms.common.server.response.ity ity;
label1:
            do
            {
                for (Iterator iterator = zzazC.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.zzazC)iterator.next();
                    if (!zza(ity))
                    {
                        continue label1;
                    }
                    if (((zza) (obj)).zza(ity))
                    {
                        if (!zzb(ity).equals(((zzb) (obj)).zzb(ity)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!((zzb) (obj)).zza(ity));
            return false;
        }
        return true;
    }

    public int hashCode()
    {
        Iterator iterator = zzazC.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.zzazC)iterator.next();
            if (zza(ity))
            {
                int j = ity.mE();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzazD.contains(Integer.valueOf(ity.mE()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.mE())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.mE()).toString());

        case 2: // '\002'
            return zzaAW;

        case 3: // '\003'
            return zzaAX;

        case 4: // '\004'
            return Integer.valueOf(zzaAY);
        }
    }

    public Map zzmx()
    {
        return zzvJ();
    }

    public HashMap zzvJ()
    {
        return zzazC;
    }

    static 
    {
        zzazC = new HashMap();
        zzazC.put("coverInfo", com.google.android.gms.common.server.response.a("coverInfo", 2, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverInfoEntity));
        zzazC.put("coverPhoto", com.google.android.gms.common.server.response.a("coverPhoto", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity));
        zzazC.put("layout", com.google.android.gms.common.server.response.a("layout", 4, (new StringToIntConverter()).zzg("banner", 0), false));
    }

    public CoverPhotoEntity()
    {
        zzzH = 1;
        zzazD = new HashSet();
    }

    CoverPhotoEntity(Set set, int i, CoverInfoEntity coverinfoentity, CoverPhotoEntity coverphotoentity, int j)
    {
        zzazD = set;
        zzzH = i;
        zzaAW = coverinfoentity;
        zzaAX = coverphotoentity;
        zzaAY = j;
    }
}
