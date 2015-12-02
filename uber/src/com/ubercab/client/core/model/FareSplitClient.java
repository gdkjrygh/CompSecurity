// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;

public class FareSplitClient
    implements com.ubercab.rider.realtime.model.FareSplitClient
{

    private static final String UGLY_DEFAULT_URL = "https://uber-userpictures.s3.amazonaws.com/default.jpeg";
    String feeString;
    String fullName;
    Boolean isInitiator;
    Boolean isSelf;
    String mobileCountryIso2;
    String mobileDigits;
    String name;
    String pictureUrl;
    String status;

    public FareSplitClient()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (FareSplitClient)obj;
            if (feeString == null ? ((FareSplitClient) (obj)).feeString != null : !feeString.equals(((FareSplitClient) (obj)).feeString))
            {
                return false;
            }
            if (fullName == null ? ((FareSplitClient) (obj)).fullName != null : !fullName.equals(((FareSplitClient) (obj)).fullName))
            {
                return false;
            }
            if (isInitiator == null ? ((FareSplitClient) (obj)).isInitiator != null : !isInitiator.equals(((FareSplitClient) (obj)).isInitiator))
            {
                return false;
            }
            if (isSelf == null ? ((FareSplitClient) (obj)).isSelf != null : !isSelf.equals(((FareSplitClient) (obj)).isSelf))
            {
                return false;
            }
            if (mobileCountryIso2 == null ? ((FareSplitClient) (obj)).mobileCountryIso2 != null : !mobileCountryIso2.equals(((FareSplitClient) (obj)).mobileCountryIso2))
            {
                return false;
            }
            if (mobileDigits == null ? ((FareSplitClient) (obj)).mobileDigits != null : !mobileDigits.equals(((FareSplitClient) (obj)).mobileDigits))
            {
                return false;
            }
            if (name == null ? ((FareSplitClient) (obj)).name != null : !name.equals(((FareSplitClient) (obj)).name))
            {
                return false;
            }
            if (pictureUrl == null ? ((FareSplitClient) (obj)).pictureUrl != null : !pictureUrl.equals(((FareSplitClient) (obj)).pictureUrl))
            {
                return false;
            }
            if (status == null ? ((FareSplitClient) (obj)).status != null : !status.equals(((FareSplitClient) (obj)).status))
            {
                return false;
            }
        }
        return true;
    }

    public String getDisplayName()
    {
        String s = getFullName();
        if (TextUtils.isEmpty(s))
        {
            String s1 = getName();
            s = s1;
            if (TextUtils.isEmpty(s1))
            {
                return "";
            }
        }
        return s;
    }

    public String getFeeString()
    {
        return feeString;
    }

    public String getFullName()
    {
        return fullName;
    }

    public boolean getIsInitiator()
    {
        if (isInitiator == null)
        {
            return false;
        } else
        {
            return isInitiator.booleanValue();
        }
    }

    public boolean getIsSelf()
    {
        if (isSelf == null)
        {
            return false;
        } else
        {
            return isSelf.booleanValue();
        }
    }

    public String getMobileCountryIso2()
    {
        return mobileCountryIso2;
    }

    public String getMobileDigits()
    {
        return mobileDigits;
    }

    public String getName()
    {
        return name;
    }

    public String getPictureUrl()
    {
        if (!"https://uber-userpictures.s3.amazonaws.com/default.jpeg".equals(pictureUrl))
        {
            return pictureUrl;
        } else
        {
            return null;
        }
    }

    public String getStatus()
    {
        return status;
    }

    public int hashCode()
    {
        int i2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (isInitiator != null)
        {
            i = isInitiator.hashCode();
        } else
        {
            i = 0;
        }
        if (isSelf != null)
        {
            j = isSelf.hashCode();
        } else
        {
            j = 0;
        }
        if (feeString != null)
        {
            k = feeString.hashCode();
        } else
        {
            k = 0;
        }
        if (fullName != null)
        {
            l = fullName.hashCode();
        } else
        {
            l = 0;
        }
        if (name != null)
        {
            i1 = name.hashCode();
        } else
        {
            i1 = 0;
        }
        if (mobileCountryIso2 != null)
        {
            j1 = mobileCountryIso2.hashCode();
        } else
        {
            j1 = 0;
        }
        if (mobileDigits != null)
        {
            k1 = mobileDigits.hashCode();
        } else
        {
            k1 = 0;
        }
        if (pictureUrl != null)
        {
            l1 = pictureUrl.hashCode();
        } else
        {
            l1 = 0;
        }
        if (status != null)
        {
            i2 = status.hashCode();
        }
        return (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
    }
}
