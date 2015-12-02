// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            TunesProvider

public final class Shape_TunesProvider extends TunesProvider
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final TunesProvider createFromParcel(Parcel parcel)
        {
            return new Shape_TunesProvider(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final TunesProvider[] newArray(int i)
        {
            return new TunesProvider[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_TunesProvider.getClassLoader();
    private String access_token;
    private Long access_token_expiry;
    private String eligible_trial;
    private List groups;
    private String id;
    private Boolean linked;
    private String name;

    Shape_TunesProvider()
    {
    }

    private Shape_TunesProvider(Parcel parcel)
    {
        access_token = (String)parcel.readValue(PARCELABLE_CL);
        access_token_expiry = (Long)parcel.readValue(PARCELABLE_CL);
        eligible_trial = (String)parcel.readValue(PARCELABLE_CL);
        groups = (List)parcel.readValue(PARCELABLE_CL);
        id = (String)parcel.readValue(PARCELABLE_CL);
        linked = (Boolean)parcel.readValue(PARCELABLE_CL);
        name = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (TunesProvider)obj;
            if (((TunesProvider) (obj)).getAccessToken() == null ? getAccessToken() != null : !((TunesProvider) (obj)).getAccessToken().equals(getAccessToken()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getAccessTokenExpiry() == null ? getAccessTokenExpiry() != null : !((TunesProvider) (obj)).getAccessTokenExpiry().equals(getAccessTokenExpiry()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getEligibleTrial() == null ? getEligibleTrial() != null : !((TunesProvider) (obj)).getEligibleTrial().equals(getEligibleTrial()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getGroups() == null ? getGroups() != null : !((TunesProvider) (obj)).getGroups().equals(getGroups()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getId() == null ? getId() != null : !((TunesProvider) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getLinked() == null ? getLinked() != null : !((TunesProvider) (obj)).getLinked().equals(getLinked()))
            {
                return false;
            }
            if (((TunesProvider) (obj)).getName() == null ? getName() != null : !((TunesProvider) (obj)).getName().equals(getName()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getAccessToken()
    {
        return access_token;
    }

    public final Long getAccessTokenExpiry()
    {
        return access_token_expiry;
    }

    public final String getEligibleTrial()
    {
        return eligible_trial;
    }

    public final List getGroups()
    {
        return groups;
    }

    public final String getId()
    {
        return id;
    }

    public final Boolean getLinked()
    {
        return linked;
    }

    public final String getName()
    {
        return name;
    }

    public final int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (access_token == null)
        {
            i = 0;
        } else
        {
            i = access_token.hashCode();
        }
        if (access_token_expiry == null)
        {
            j = 0;
        } else
        {
            j = access_token_expiry.hashCode();
        }
        if (eligible_trial == null)
        {
            k = 0;
        } else
        {
            k = eligible_trial.hashCode();
        }
        if (groups == null)
        {
            l = 0;
        } else
        {
            l = groups.hashCode();
        }
        if (id == null)
        {
            i1 = 0;
        } else
        {
            i1 = id.hashCode();
        }
        if (linked == null)
        {
            j1 = 0;
        } else
        {
            j1 = linked.hashCode();
        }
        if (name != null)
        {
            k1 = name.hashCode();
        }
        return (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k1;
    }

    final TunesProvider setAccessToken(String s)
    {
        access_token = s;
        return this;
    }

    final TunesProvider setAccessTokenExpiry(Long long1)
    {
        access_token_expiry = long1;
        return this;
    }

    final TunesProvider setEligibleTrial(String s)
    {
        eligible_trial = s;
        return this;
    }

    public final TunesProvider setGroups(List list)
    {
        groups = list;
        return this;
    }

    final TunesProvider setId(String s)
    {
        id = s;
        return this;
    }

    public final TunesProvider setLinked(Boolean boolean1)
    {
        linked = boolean1;
        return this;
    }

    final TunesProvider setName(String s)
    {
        name = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("TunesProvider{access_token=")).append(access_token).append(", access_token_expiry=").append(access_token_expiry).append(", eligible_trial=").append(eligible_trial).append(", groups=").append(groups).append(", id=").append(id).append(", linked=").append(linked).append(", name=").append(name).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(access_token);
        parcel.writeValue(access_token_expiry);
        parcel.writeValue(eligible_trial);
        parcel.writeValue(groups);
        parcel.writeValue(id);
        parcel.writeValue(linked);
        parcel.writeValue(name);
    }

}
