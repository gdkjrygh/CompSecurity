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

public static final class zzaJl extends FastSafeParcelableJsonResponse
    implements com.google.android.gms.plus.model.people.onResponse
{
    public static final class CoverInfoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverInfo
    {

        public static final zzd CREATOR = new zzd();
        private static final HashMap zzaHP;
        final int zzCY;
        final Set zzaHQ;
        int zzaJm;
        int zzaJn;

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
                    for (Iterator iterator = zzaHP.values().iterator(); iterator.hasNext();)
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

        public Object freeze()
        {
            return zzxM();
        }

        public int getLeftImageOffset()
        {
            return zzaJm;
        }

        public int getTopImageOffset()
        {
            return zzaJn;
        }

        public boolean hasLeftImageOffset()
        {
            return zzaHQ.contains(Integer.valueOf(2));
        }

        public boolean hasTopImageOffset()
        {
            return zzaHQ.contains(Integer.valueOf(3));
        }

        public int hashCode()
        {
            Iterator iterator = zzaHP.values().iterator();
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
                    int j = field.zzot();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzd zzd1 = CREATOR;
            zzd.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzaHQ.contains(Integer.valueOf(field.zzot()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.zzot())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzot()).toString());

            case 2: // '\002'
                return Integer.valueOf(zzaJm);

            case 3: // '\003'
                return Integer.valueOf(zzaJn);
            }
        }

        public Map zzom()
        {
            return zzxF();
        }

        public HashMap zzxF()
        {
            return zzaHP;
        }

        public CoverInfoEntity zzxM()
        {
            return this;
        }

        static 
        {
            zzaHP = new HashMap();
            zzaHP.put("leftImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("leftImageOffset", 2));
            zzaHP.put("topImageOffset", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("topImageOffset", 3));
        }

        public CoverInfoEntity()
        {
            zzCY = 1;
            zzaHQ = new HashSet();
        }

        CoverInfoEntity(Set set, int i, int j, int k)
        {
            zzaHQ = set;
            zzCY = i;
            zzaJm = j;
            zzaJn = k;
        }
    }

    public static final class CoverPhotoEntity extends FastSafeParcelableJsonResponse
        implements com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto
    {

        public static final zze CREATOR = new zze();
        private static final HashMap zzaHP;
        final int zzCY;
        String zzF;
        final Set zzaHQ;
        int zznM;
        int zznN;

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
                    for (Iterator iterator = zzaHP.values().iterator(); iterator.hasNext();)
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

        public Object freeze()
        {
            return zzxN();
        }

        public int getHeight()
        {
            return zznN;
        }

        public String getUrl()
        {
            return zzF;
        }

        public int getWidth()
        {
            return zznM;
        }

        public boolean hasHeight()
        {
            return zzaHQ.contains(Integer.valueOf(2));
        }

        public boolean hasUrl()
        {
            return zzaHQ.contains(Integer.valueOf(3));
        }

        public boolean hasWidth()
        {
            return zzaHQ.contains(Integer.valueOf(4));
        }

        public int hashCode()
        {
            Iterator iterator = zzaHP.values().iterator();
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
                    int j = field.zzot();
                    i = zzb(field).hashCode() + (i + j);
                }
            } while (true);
            return i;
        }

        public boolean isDataValid()
        {
            return true;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zze zze1 = CREATOR;
            zze.zza(this, parcel, i);
        }

        protected boolean zza(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            return zzaHQ.contains(Integer.valueOf(field.zzot()));
        }

        protected Object zzb(com.google.android.gms.common.server.response.FastJsonResponse.Field field)
        {
            switch (field.zzot())
            {
            default:
                throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(field.zzot()).toString());

            case 2: // '\002'
                return Integer.valueOf(zznN);

            case 3: // '\003'
                return zzF;

            case 4: // '\004'
                return Integer.valueOf(zznM);
            }
        }

        public Map zzom()
        {
            return zzxF();
        }

        public HashMap zzxF()
        {
            return zzaHP;
        }

        public CoverPhotoEntity zzxN()
        {
            return this;
        }

        static 
        {
            zzaHP = new HashMap();
            zzaHP.put("height", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("height", 2));
            zzaHP.put("url", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzl("url", 3));
            zzaHP.put("width", com.google.android.gms.common.server.response.FastJsonResponse.Field.zzi("width", 4));
        }

        public CoverPhotoEntity()
        {
            zzCY = 1;
            zzaHQ = new HashSet();
        }

        CoverPhotoEntity(Set set, int i, int j, String s, int k)
        {
            zzaHQ = set;
            zzCY = i;
            zznN = j;
            zzF = s;
            zznM = k;
        }
    }


    public static final zzc CREATOR = new zzc();
    private static final HashMap zzaHP;
    final int zzCY;
    final Set zzaHQ;
    CoverInfoEntity zzaJj;
    CoverPhotoEntity zzaJk;
    int zzaJl;

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
                for (Iterator iterator = zzaHP.values().iterator(); iterator.hasNext();)
                {
                    ity = (com.google.android.gms.common.server.response.ity.zzaHP)iterator.next();
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

    public Object freeze()
    {
        return zzxL();
    }

    public com.google.android.gms.plus.model.people.erEntity getCoverInfo()
    {
        return zzaJj;
    }

    public com.google.android.gms.plus.model.people.erEntity getCoverPhoto()
    {
        return zzaJk;
    }

    public int getLayout()
    {
        return zzaJl;
    }

    public boolean hasCoverInfo()
    {
        return zzaHQ.contains(Integer.valueOf(2));
    }

    public boolean hasCoverPhoto()
    {
        return zzaHQ.contains(Integer.valueOf(3));
    }

    public boolean hasLayout()
    {
        return zzaHQ.contains(Integer.valueOf(4));
    }

    public int hashCode()
    {
        Iterator iterator = zzaHP.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.google.android.gms.common.server.response.ity ity = (com.google.android.gms.common.server.response.ity.zzaHP)iterator.next();
            if (zza(ity))
            {
                int j = ity.ot();
                i = zzb(ity).hashCode() + (i + j);
            }
        } while (true);
        return i;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc zzc1 = CREATOR;
        zzc.zza(this, parcel, i);
    }

    protected boolean zza(com.google.android.gms.common.server.response.ity ity)
    {
        return zzaHQ.contains(Integer.valueOf(ity.ot()));
    }

    protected Object zzb(com.google.android.gms.common.server.response.ity ity)
    {
        switch (ity.ot())
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(ity.ot()).toString());

        case 2: // '\002'
            return zzaJj;

        case 3: // '\003'
            return zzaJk;

        case 4: // '\004'
            return Integer.valueOf(zzaJl);
        }
    }

    public Map zzom()
    {
        return zzxF();
    }

    public HashMap zzxF()
    {
        return zzaHP;
    }

    public zzaHP zzxL()
    {
        return this;
    }

    static 
    {
        zzaHP = new HashMap();
        zzaHP.put("coverInfo", com.google.android.gms.common.server.response.a("coverInfo", 2, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverInfoEntity));
        zzaHP.put("coverPhoto", com.google.android.gms.common.server.response.a("coverPhoto", 3, com/google/android/gms/plus/internal/model/people/PersonEntity$CoverEntity$CoverPhotoEntity));
        zzaHP.put("layout", com.google.android.gms.common.server.response.a("layout", 4, (new StringToIntConverter()).zzh("banner", 0), false));
    }

    public CoverPhotoEntity()
    {
        zzCY = 1;
        zzaHQ = new HashSet();
    }

    CoverPhotoEntity(Set set, int i, CoverInfoEntity coverinfoentity, CoverPhotoEntity coverphotoentity, int j)
    {
        zzaHQ = set;
        zzCY = i;
        zzaJj = coverinfoentity;
        zzaJk = coverphotoentity;
        zzaJl = j;
    }
}
