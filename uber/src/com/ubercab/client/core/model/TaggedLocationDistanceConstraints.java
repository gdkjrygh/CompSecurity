// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import android.os.Parcelable;

public final class TaggedLocationDistanceConstraints
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final TaggedLocationDistanceConstraints createFromParcel(Parcel parcel)
        {
            return new TaggedLocationDistanceConstraints(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TaggedLocationDistanceConstraints[] newArray(int i)
        {
            return new TaggedLocationDistanceConstraints[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    Integer maximumDropoffDistanceInMeters;
    Integer maximumPickupDistanceInMeters;
    Integer minimumDropoffDistanceInMeters;

    public TaggedLocationDistanceConstraints()
    {
    }

    protected TaggedLocationDistanceConstraints(Parcel parcel)
    {
        maximumPickupDistanceInMeters = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
        minimumDropoffDistanceInMeters = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
        maximumDropoffDistanceInMeters = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (TaggedLocationDistanceConstraints)obj;
            if (maximumDropoffDistanceInMeters == null ? ((TaggedLocationDistanceConstraints) (obj)).maximumDropoffDistanceInMeters != null : !maximumDropoffDistanceInMeters.equals(((TaggedLocationDistanceConstraints) (obj)).maximumDropoffDistanceInMeters))
            {
                return false;
            }
            if (maximumPickupDistanceInMeters == null ? ((TaggedLocationDistanceConstraints) (obj)).maximumPickupDistanceInMeters != null : !maximumPickupDistanceInMeters.equals(((TaggedLocationDistanceConstraints) (obj)).maximumPickupDistanceInMeters))
            {
                return false;
            }
            if (minimumDropoffDistanceInMeters == null ? ((TaggedLocationDistanceConstraints) (obj)).minimumDropoffDistanceInMeters != null : !minimumDropoffDistanceInMeters.equals(((TaggedLocationDistanceConstraints) (obj)).minimumDropoffDistanceInMeters))
            {
                return false;
            }
        }
        return true;
    }

    public final Integer getMaximumDropoffDistanceInMeters()
    {
        return maximumDropoffDistanceInMeters;
    }

    public final Integer getMaximumPickupDistanceInMeters()
    {
        return maximumPickupDistanceInMeters;
    }

    public final Integer getMinimumDropoffDistanceInMeters()
    {
        return minimumDropoffDistanceInMeters;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (maximumPickupDistanceInMeters != null)
        {
            i = maximumPickupDistanceInMeters.hashCode();
        } else
        {
            i = 0;
        }
        if (minimumDropoffDistanceInMeters != null)
        {
            j = minimumDropoffDistanceInMeters.hashCode();
        } else
        {
            j = 0;
        }
        if (maximumDropoffDistanceInMeters != null)
        {
            k = maximumDropoffDistanceInMeters.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public final void setMaximumDropoffDistanceInMeters(Integer integer)
    {
        maximumDropoffDistanceInMeters = integer;
    }

    public final void setMaximumPickupDistanceInMeters(Integer integer)
    {
        maximumPickupDistanceInMeters = integer;
    }

    public final void setMinimumDropoffDistanceInMeters(Integer integer)
    {
        minimumDropoffDistanceInMeters = integer;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(maximumPickupDistanceInMeters);
        parcel.writeValue(minimumDropoffDistanceInMeters);
        parcel.writeValue(maximumDropoffDistanceInMeters);
    }

}
