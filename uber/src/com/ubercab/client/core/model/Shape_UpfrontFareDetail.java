// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareDetail

public final class Shape_UpfrontFareDetail extends UpfrontFareDetail
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final UpfrontFareDetail createFromParcel(Parcel parcel)
        {
            return new Shape_UpfrontFareDetail(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final UpfrontFareDetail[] newArray(int i)
        {
            return new UpfrontFareDetail[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_UpfrontFareDetail.getClassLoader();
    private List fares;
    private String footer;
    private String subtitle;
    private String title;

    Shape_UpfrontFareDetail()
    {
    }

    private Shape_UpfrontFareDetail(Parcel parcel)
    {
        footer = (String)parcel.readValue(PARCELABLE_CL);
        subtitle = (String)parcel.readValue(PARCELABLE_CL);
        title = (String)parcel.readValue(PARCELABLE_CL);
        fares = (List)parcel.readValue(PARCELABLE_CL);
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
            obj = (UpfrontFareDetail)obj;
            if (((UpfrontFareDetail) (obj)).getFooter() == null ? getFooter() != null : !((UpfrontFareDetail) (obj)).getFooter().equals(getFooter()))
            {
                return false;
            }
            if (((UpfrontFareDetail) (obj)).getSubtitle() == null ? getSubtitle() != null : !((UpfrontFareDetail) (obj)).getSubtitle().equals(getSubtitle()))
            {
                return false;
            }
            if (((UpfrontFareDetail) (obj)).getTitle() == null ? getTitle() != null : !((UpfrontFareDetail) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
            if (((UpfrontFareDetail) (obj)).getFares() == null ? getFares() != null : !((UpfrontFareDetail) (obj)).getFares().equals(getFares()))
            {
                return false;
            }
        }
        return true;
    }

    public final List getFares()
    {
        return fares;
    }

    public final String getFooter()
    {
        return footer;
    }

    public final String getSubtitle()
    {
        return subtitle;
    }

    public final String getTitle()
    {
        return title;
    }

    public final int hashCode()
    {
        int l = 0;
        int i;
        int j;
        int k;
        if (footer == null)
        {
            i = 0;
        } else
        {
            i = footer.hashCode();
        }
        if (subtitle == null)
        {
            j = 0;
        } else
        {
            j = subtitle.hashCode();
        }
        if (title == null)
        {
            k = 0;
        } else
        {
            k = title.hashCode();
        }
        if (fares != null)
        {
            l = fares.hashCode();
        }
        return (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ l;
    }

    final UpfrontFareDetail setFares(List list)
    {
        fares = list;
        return this;
    }

    final UpfrontFareDetail setFooter(String s)
    {
        footer = s;
        return this;
    }

    final UpfrontFareDetail setSubtitle(String s)
    {
        subtitle = s;
        return this;
    }

    final UpfrontFareDetail setTitle(String s)
    {
        title = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareDetail{footer=")).append(footer).append(", subtitle=").append(subtitle).append(", title=").append(title).append(", fares=").append(fares).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(footer);
        parcel.writeValue(subtitle);
        parcel.writeValue(title);
        parcel.writeValue(fares);
    }

}
