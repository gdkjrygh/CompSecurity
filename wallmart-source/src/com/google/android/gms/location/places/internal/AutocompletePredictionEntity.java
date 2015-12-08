// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
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

        public static final android.os.Parcelable.Creator CREATOR = new zzu();
        final int mLength;
        final int mOffset;
        final int mVersionCode;

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
                if (!zzw.equal(Integer.valueOf(mOffset), Integer.valueOf(((SubstringEntity) (obj)).mOffset)) || !zzw.equal(Integer.valueOf(mLength), Integer.valueOf(((SubstringEntity) (obj)).mLength)))
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
            return zzw.hashCode(new Object[] {
                Integer.valueOf(mOffset), Integer.valueOf(mLength)
            });
        }

        public String toString()
        {
            return zzw.zzu(this).zzg("offset", Integer.valueOf(mOffset)).zzg("length", Integer.valueOf(mLength)).toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            zzu.zza(this, parcel, i);
        }


        public SubstringEntity(int i, int j, int k)
        {
            mVersionCode = i;
            mOffset = j;
            mLength = k;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int mVersionCode;
    final String zzaDH;
    final List zzaDi;
    final List zzaEb;
    final int zzaEc;
    final String zzaoB;

    AutocompletePredictionEntity(int i, String s, String s1, List list, List list1, int j)
    {
        mVersionCode = i;
        zzaoB = s;
        zzaDH = s1;
        zzaDi = list;
        zzaEb = list1;
        zzaEc = j;
    }

    public static AutocompletePredictionEntity zza(String s, String s1, List list, List list1, int i)
    {
        return new AutocompletePredictionEntity(0, (String)zzx.zzv(s), s1, list, list1, i);
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
            if (!zzw.equal(zzaoB, ((AutocompletePredictionEntity) (obj)).zzaoB) || !zzw.equal(zzaDH, ((AutocompletePredictionEntity) (obj)).zzaDH) || !zzw.equal(zzaDi, ((AutocompletePredictionEntity) (obj)).zzaDi) || !zzw.equal(zzaEb, ((AutocompletePredictionEntity) (obj)).zzaEb) || !zzw.equal(Integer.valueOf(zzaEc), Integer.valueOf(((AutocompletePredictionEntity) (obj)).zzaEc)))
            {
                return false;
            }
        }
        return true;
    }

    public Object freeze()
    {
        return zzwg();
    }

    public String getDescription()
    {
        return zzaoB;
    }

    public List getMatchedSubstrings()
    {
        return zzaEb;
    }

    public String getPlaceId()
    {
        return zzaDH;
    }

    public List getPlaceTypes()
    {
        return zzaDi;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzaoB, zzaDH, zzaDi, zzaEb, Integer.valueOf(zzaEc)
        });
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        return zzw.zzu(this).zzg("description", zzaoB).zzg("placeId", zzaDH).zzg("placeTypes", zzaDi).zzg("substrings", zzaEb).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.location.places.internal.zza.zza(this, parcel, i);
    }

    public AutocompletePrediction zzwg()
    {
        return this;
    }

}
