// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zza, zzu

public class AutocompletePredictionEntity
    implements SafeParcelable, AutocompletePrediction
{
    public static class SubstringEntity
        implements SafeParcelable, com.google.android.gms.location.places.AutocompletePrediction.Substring
    {

        public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.location.places.internal.zzu();
        final int mLength;
        final int mOffset;
        final int zzCY;

        public int describeContents()
        {
            return 0;
        }

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof SubstringEntity))
                {
                    return false;
                }
                obj = (SubstringEntity)obj;
                if (!zzt.equal(Integer.valueOf(mOffset), Integer.valueOf(((SubstringEntity) (obj)).mOffset)) || !zzt.equal(Integer.valueOf(mLength), Integer.valueOf(((SubstringEntity) (obj)).mLength)))
                {
                    return false;
                }
            }
            return true;
        }

        public int getLength()
        {
            return mLength;
        }

        public int getOffset()
        {
            return mOffset;
        }

        public int hashCode()
        {
            return zzt.hashCode(new Object[] {
                Integer.valueOf(mOffset), Integer.valueOf(mLength)
            });
        }

        public String toString()
        {
            return zzt.zzt(this).zzg("offset", Integer.valueOf(mOffset)).zzg("length", Integer.valueOf(mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzu.zza(this, parcel, i);
        }


        public SubstringEntity(int i, int j, int k)
        {
            zzCY = i;
            mOffset = j;
            mLength = k;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    final List zzaAe;
    final int zzaAf;
    final String zzakM;
    final String zzazK;
    final List zzazo;

    AutocompletePredictionEntity(int i, String s, String s1, List list, List list1, int j)
    {
        zzCY = i;
        zzakM = s;
        zzazK = s1;
        zzazo = list;
        zzaAe = list1;
        zzaAf = j;
    }

    public static AutocompletePredictionEntity zza(String s, String s1, List list, List list1, int i)
    {
        return new AutocompletePredictionEntity(0, (String)zzu.zzu(s), s1, list, list1, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof AutocompletePredictionEntity))
            {
                return false;
            }
            obj = (AutocompletePredictionEntity)obj;
            if (!zzt.equal(zzakM, ((AutocompletePredictionEntity) (obj)).zzakM) || !zzt.equal(zzazK, ((AutocompletePredictionEntity) (obj)).zzazK) || !zzt.equal(zzazo, ((AutocompletePredictionEntity) (obj)).zzazo) || !zzt.equal(zzaAe, ((AutocompletePredictionEntity) (obj)).zzaAe) || !zzt.equal(Integer.valueOf(zzaAf), Integer.valueOf(((AutocompletePredictionEntity) (obj)).zzaAf)))
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzuL();
    }

    public String getDescription()
    {
        return zzakM;
    }

    public List getMatchedSubstrings()
    {
        return zzaAe;
    }

    public String getPlaceId()
    {
        return zzazK;
    }

    public List getPlaceTypes()
    {
        return zzazo;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzakM, zzazK, zzazo, zzaAe, Integer.valueOf(zzaAf)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("description", zzakM).zzg("placeId", zzazK).zzg("placeTypes", zzazo).zzg("substrings", zzaAe).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.internal.zza.zza(this, parcel, i);
    }

    public AutocompletePrediction zzuL()
    {
        return this;
    }

}
