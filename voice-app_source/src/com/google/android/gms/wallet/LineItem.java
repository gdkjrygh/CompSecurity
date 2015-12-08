// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet:
//            zzi

public final class LineItem
    implements SafeParcelable
{
    public final class Builder
    {

        final LineItem zzaQL;

        public LineItem build()
        {
            return zzaQL;
        }

        public Builder setCurrencyCode(String s)
        {
            zzaQL.zzaQg = s;
            return this;
        }

        public Builder setDescription(String s)
        {
            zzaQL.description = s;
            return this;
        }

        public Builder setQuantity(String s)
        {
            zzaQL.zzaQI = s;
            return this;
        }

        public Builder setRole(int i)
        {
            zzaQL.zzaQK = i;
            return this;
        }

        public Builder setTotalPrice(String s)
        {
            zzaQL.zzaQf = s;
            return this;
        }

        public Builder setUnitPrice(String s)
        {
            zzaQL.zzaQJ = s;
            return this;
        }

        private Builder()
        {
            zzaQL = LineItem.this;
            super();
        }

    }

    public static interface Role
    {

        public static final int REGULAR = 0;
        public static final int SHIPPING = 2;
        public static final int TAX = 1;
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    String description;
    private final int zzCY;
    String zzaQI;
    String zzaQJ;
    int zzaQK;
    String zzaQf;
    String zzaQg;

    LineItem()
    {
        zzCY = 1;
        zzaQK = 0;
    }

    LineItem(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        zzCY = i;
        description = s;
        zzaQI = s1;
        zzaQJ = s2;
        zzaQf = s3;
        zzaQK = j;
        zzaQg = s4;
    }

    public static Builder newBuilder()
    {
        LineItem lineitem = new LineItem();
        lineitem.getClass();
        return lineitem. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCurrencyCode()
    {
        return zzaQg;
    }

    public String getDescription()
    {
        return description;
    }

    public String getQuantity()
    {
        return zzaQI;
    }

    public int getRole()
    {
        return zzaQK;
    }

    public String getTotalPrice()
    {
        return zzaQf;
    }

    public String getUnitPrice()
    {
        return zzaQJ;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
