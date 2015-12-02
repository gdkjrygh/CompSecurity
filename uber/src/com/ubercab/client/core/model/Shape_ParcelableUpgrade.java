// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            ParcelableUpgrade

public final class Shape_ParcelableUpgrade extends ParcelableUpgrade
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final ParcelableUpgrade createFromParcel(Parcel parcel)
        {
            return new Shape_ParcelableUpgrade(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ParcelableUpgrade[] newArray(int i)
        {
            return new ParcelableUpgrade[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_ParcelableUpgrade.getClassLoader();
    private String downloadURL;
    private String releaseNotesHTML;
    private String version;

    Shape_ParcelableUpgrade()
    {
    }

    private Shape_ParcelableUpgrade(Parcel parcel)
    {
        downloadURL = (String)parcel.readValue(PARCELABLE_CL);
        version = (String)parcel.readValue(PARCELABLE_CL);
        releaseNotesHTML = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (ParcelableUpgrade)obj;
            if (((ParcelableUpgrade) (obj)).getDownloadURL() == null ? getDownloadURL() != null : !((ParcelableUpgrade) (obj)).getDownloadURL().equals(getDownloadURL()))
            {
                return false;
            }
            if (((ParcelableUpgrade) (obj)).getVersion() == null ? getVersion() != null : !((ParcelableUpgrade) (obj)).getVersion().equals(getVersion()))
            {
                return false;
            }
            if (((ParcelableUpgrade) (obj)).getReleaseNotesHTML() == null ? getReleaseNotesHTML() != null : !((ParcelableUpgrade) (obj)).getReleaseNotesHTML().equals(getReleaseNotesHTML()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getDownloadURL()
    {
        return downloadURL;
    }

    public final String getReleaseNotesHTML()
    {
        return releaseNotesHTML;
    }

    public final String getVersion()
    {
        return version;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (downloadURL == null)
        {
            i = 0;
        } else
        {
            i = downloadURL.hashCode();
        }
        if (version == null)
        {
            j = 0;
        } else
        {
            j = version.hashCode();
        }
        if (releaseNotesHTML != null)
        {
            k = releaseNotesHTML.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    public final void setDownloadURL(String s)
    {
        downloadURL = s;
    }

    public final void setReleaseNotesHTML(String s)
    {
        releaseNotesHTML = s;
    }

    public final void setVersion(String s)
    {
        version = s;
    }

    public final String toString()
    {
        return (new StringBuilder("ParcelableUpgrade{downloadURL=")).append(downloadURL).append(", version=").append(version).append(", releaseNotesHTML=").append(releaseNotesHTML).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(downloadURL);
        parcel.writeValue(version);
        parcel.writeValue(releaseNotesHTML);
    }

}
