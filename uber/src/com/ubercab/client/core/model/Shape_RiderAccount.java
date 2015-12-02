// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcel;

// Referenced classes of package com.ubercab.client.core.model:
//            RiderAccount

public final class Shape_RiderAccount extends RiderAccount
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final RiderAccount createFromParcel(Parcel parcel)
        {
            return new Shape_RiderAccount(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final RiderAccount[] newArray(int i)
        {
            return new RiderAccount[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final ClassLoader PARCELABLE_CL = com/ubercab/client/core/model/Shape_RiderAccount.getClassLoader();
    private String claimedMobileLocal;
    private String email;
    private String firstName;
    private String lastName;
    private String mobile;
    private String mobileCountryIso2;
    private String mobileLocal;
    private String pictureUrl;
    private String profileType;
    private String role;

    Shape_RiderAccount()
    {
    }

    private Shape_RiderAccount(Parcel parcel)
    {
        claimedMobileLocal = (String)parcel.readValue(PARCELABLE_CL);
        email = (String)parcel.readValue(PARCELABLE_CL);
        firstName = (String)parcel.readValue(PARCELABLE_CL);
        lastName = (String)parcel.readValue(PARCELABLE_CL);
        mobile = (String)parcel.readValue(PARCELABLE_CL);
        mobileCountryIso2 = (String)parcel.readValue(PARCELABLE_CL);
        mobileLocal = (String)parcel.readValue(PARCELABLE_CL);
        pictureUrl = (String)parcel.readValue(PARCELABLE_CL);
        profileType = (String)parcel.readValue(PARCELABLE_CL);
        role = (String)parcel.readValue(PARCELABLE_CL);
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
            obj = (RiderAccount)obj;
            if (((RiderAccount) (obj)).getClaimedMobileLocal() == null ? getClaimedMobileLocal() != null : !((RiderAccount) (obj)).getClaimedMobileLocal().equals(getClaimedMobileLocal()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getEmail() == null ? getEmail() != null : !((RiderAccount) (obj)).getEmail().equals(getEmail()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getFirstName() == null ? getFirstName() != null : !((RiderAccount) (obj)).getFirstName().equals(getFirstName()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getLastName() == null ? getLastName() != null : !((RiderAccount) (obj)).getLastName().equals(getLastName()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getMobile() == null ? getMobile() != null : !((RiderAccount) (obj)).getMobile().equals(getMobile()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getMobileCountryIso2() == null ? getMobileCountryIso2() != null : !((RiderAccount) (obj)).getMobileCountryIso2().equals(getMobileCountryIso2()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getMobileLocal() == null ? getMobileLocal() != null : !((RiderAccount) (obj)).getMobileLocal().equals(getMobileLocal()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getPictureUrl() == null ? getPictureUrl() != null : !((RiderAccount) (obj)).getPictureUrl().equals(getPictureUrl()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getProfileType() == null ? getProfileType() != null : !((RiderAccount) (obj)).getProfileType().equals(getProfileType()))
            {
                return false;
            }
            if (((RiderAccount) (obj)).getRole() == null ? getRole() != null : !((RiderAccount) (obj)).getRole().equals(getRole()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getClaimedMobileLocal()
    {
        return claimedMobileLocal;
    }

    public final String getEmail()
    {
        return email;
    }

    public final String getFirstName()
    {
        return firstName;
    }

    public final String getLastName()
    {
        return lastName;
    }

    public final String getMobile()
    {
        return mobile;
    }

    public final String getMobileCountryIso2()
    {
        return mobileCountryIso2;
    }

    public final String getMobileLocal()
    {
        return mobileLocal;
    }

    public final String getPictureUrl()
    {
        return pictureUrl;
    }

    public final String getProfileType()
    {
        return profileType;
    }

    public final String getRole()
    {
        return role;
    }

    public final int hashCode()
    {
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (claimedMobileLocal == null)
        {
            i = 0;
        } else
        {
            i = claimedMobileLocal.hashCode();
        }
        if (email == null)
        {
            j = 0;
        } else
        {
            j = email.hashCode();
        }
        if (firstName == null)
        {
            k = 0;
        } else
        {
            k = firstName.hashCode();
        }
        if (lastName == null)
        {
            l = 0;
        } else
        {
            l = lastName.hashCode();
        }
        if (mobile == null)
        {
            i1 = 0;
        } else
        {
            i1 = mobile.hashCode();
        }
        if (mobileCountryIso2 == null)
        {
            j1 = 0;
        } else
        {
            j1 = mobileCountryIso2.hashCode();
        }
        if (mobileLocal == null)
        {
            k1 = 0;
        } else
        {
            k1 = mobileLocal.hashCode();
        }
        if (pictureUrl == null)
        {
            l1 = 0;
        } else
        {
            l1 = pictureUrl.hashCode();
        }
        if (profileType == null)
        {
            i2 = 0;
        } else
        {
            i2 = profileType.hashCode();
        }
        if (role != null)
        {
            j2 = role.hashCode();
        }
        return (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j2;
    }

    public final RiderAccount setClaimedMobileLocal(String s)
    {
        claimedMobileLocal = s;
        return this;
    }

    public final RiderAccount setEmail(String s)
    {
        email = s;
        return this;
    }

    public final RiderAccount setFirstName(String s)
    {
        firstName = s;
        return this;
    }

    public final RiderAccount setLastName(String s)
    {
        lastName = s;
        return this;
    }

    public final RiderAccount setMobile(String s)
    {
        mobile = s;
        return this;
    }

    public final RiderAccount setMobileCountryIso2(String s)
    {
        mobileCountryIso2 = s;
        return this;
    }

    public final RiderAccount setMobileLocal(String s)
    {
        mobileLocal = s;
        return this;
    }

    public final RiderAccount setPictureUrl(String s)
    {
        pictureUrl = s;
        return this;
    }

    public final RiderAccount setProfileType(String s)
    {
        profileType = s;
        return this;
    }

    public final RiderAccount setRole(String s)
    {
        role = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("RiderAccount{claimedMobileLocal=")).append(claimedMobileLocal).append(", email=").append(email).append(", firstName=").append(firstName).append(", lastName=").append(lastName).append(", mobile=").append(mobile).append(", mobileCountryIso2=").append(mobileCountryIso2).append(", mobileLocal=").append(mobileLocal).append(", pictureUrl=").append(pictureUrl).append(", profileType=").append(profileType).append(", role=").append(role).append("}").toString();
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeValue(claimedMobileLocal);
        parcel.writeValue(email);
        parcel.writeValue(firstName);
        parcel.writeValue(lastName);
        parcel.writeValue(mobile);
        parcel.writeValue(mobileCountryIso2);
        parcel.writeValue(mobileLocal);
        parcel.writeValue(pictureUrl);
        parcel.writeValue(profileType);
        parcel.writeValue(role);
    }

}
