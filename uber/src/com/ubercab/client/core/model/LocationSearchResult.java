// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import com.ubercab.android.location.UberLatLng;

public class LocationSearchResult
{

    public static final String HOME_WORK_TAGS[] = {
        "home", "work"
    };
    public static final String TAG_HOME = "home";
    public static final String TAG_WORK = "work";
    String formattedAddress;
    String formatted_address;
    String hash;
    String id;
    Double latitude;
    String longAddress;
    String long_address;
    Double longitude;
    String nickname;
    String reference;
    String relevance;
    String serviceType;
    String service_type;
    String shortAddress;
    String short_address;
    String sourceType;
    String source_type;
    String subtitle;
    String tag;
    String title;
    String type;

    public LocationSearchResult()
    {
    }

    public static boolean isTagHome(String s)
    {
        return "home".equals(s);
    }

    public static boolean isTagWork(String s)
    {
        return "work".equals(s);
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (LocationSearchResult)obj;
            if (formattedAddress == null ? ((LocationSearchResult) (obj)).formattedAddress != null : !formattedAddress.equals(((LocationSearchResult) (obj)).formattedAddress))
            {
                return false;
            }
            if (formatted_address == null ? ((LocationSearchResult) (obj)).formatted_address != null : !formatted_address.equals(((LocationSearchResult) (obj)).formatted_address))
            {
                return false;
            }
            if (hash == null ? ((LocationSearchResult) (obj)).hash != null : !hash.equals(((LocationSearchResult) (obj)).hash))
            {
                return false;
            }
            if (id == null ? ((LocationSearchResult) (obj)).id != null : !id.equals(((LocationSearchResult) (obj)).id))
            {
                return false;
            }
            if (latitude == null ? ((LocationSearchResult) (obj)).latitude != null : !latitude.equals(((LocationSearchResult) (obj)).latitude))
            {
                return false;
            }
            if (longAddress == null ? ((LocationSearchResult) (obj)).longAddress != null : !longAddress.equals(((LocationSearchResult) (obj)).longAddress))
            {
                return false;
            }
            if (long_address == null ? ((LocationSearchResult) (obj)).long_address != null : !long_address.equals(((LocationSearchResult) (obj)).long_address))
            {
                return false;
            }
            if (longitude == null ? ((LocationSearchResult) (obj)).longitude != null : !longitude.equals(((LocationSearchResult) (obj)).longitude))
            {
                return false;
            }
            if (nickname == null ? ((LocationSearchResult) (obj)).nickname != null : !nickname.equals(((LocationSearchResult) (obj)).nickname))
            {
                return false;
            }
            if (reference == null ? ((LocationSearchResult) (obj)).reference != null : !reference.equals(((LocationSearchResult) (obj)).reference))
            {
                return false;
            }
            if (relevance == null ? ((LocationSearchResult) (obj)).relevance != null : !relevance.equals(((LocationSearchResult) (obj)).relevance))
            {
                return false;
            }
            if (serviceType == null ? ((LocationSearchResult) (obj)).serviceType != null : !serviceType.equals(((LocationSearchResult) (obj)).serviceType))
            {
                return false;
            }
            if (service_type == null ? ((LocationSearchResult) (obj)).service_type != null : !service_type.equals(((LocationSearchResult) (obj)).service_type))
            {
                return false;
            }
            if (shortAddress == null ? ((LocationSearchResult) (obj)).shortAddress != null : !shortAddress.equals(((LocationSearchResult) (obj)).shortAddress))
            {
                return false;
            }
            if (short_address == null ? ((LocationSearchResult) (obj)).short_address != null : !short_address.equals(((LocationSearchResult) (obj)).short_address))
            {
                return false;
            }
            if (sourceType == null ? ((LocationSearchResult) (obj)).sourceType != null : !sourceType.equals(((LocationSearchResult) (obj)).sourceType))
            {
                return false;
            }
            if (source_type == null ? ((LocationSearchResult) (obj)).source_type != null : !source_type.equals(((LocationSearchResult) (obj)).source_type))
            {
                return false;
            }
            if (subtitle == null ? ((LocationSearchResult) (obj)).subtitle != null : !subtitle.equals(((LocationSearchResult) (obj)).subtitle))
            {
                return false;
            }
            if (tag == null ? ((LocationSearchResult) (obj)).tag != null : !tag.equals(((LocationSearchResult) (obj)).tag))
            {
                return false;
            }
            if (title == null ? ((LocationSearchResult) (obj)).title != null : !title.equals(((LocationSearchResult) (obj)).title))
            {
                return false;
            }
            if (type == null ? ((LocationSearchResult) (obj)).type != null : !type.equals(((LocationSearchResult) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    public String getFormattedAddress()
    {
        if (!TextUtils.isEmpty(formattedAddress))
        {
            return formattedAddress;
        } else
        {
            return formatted_address;
        }
    }

    public String getHash()
    {
        return hash;
    }

    public String getId()
    {
        return id;
    }

    public Double getLatitude()
    {
        return latitude;
    }

    public String getLongAddress()
    {
        if (!TextUtils.isEmpty(longAddress))
        {
            return longAddress;
        } else
        {
            return long_address;
        }
    }

    public Double getLongitude()
    {
        return longitude;
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getReference()
    {
        return reference;
    }

    public String getRelevance()
    {
        return relevance;
    }

    public String getServiceType()
    {
        if (!TextUtils.isEmpty(serviceType))
        {
            return serviceType;
        } else
        {
            return service_type;
        }
    }

    public String getShortAddress()
    {
        if (!TextUtils.isEmpty(shortAddress))
        {
            return shortAddress;
        } else
        {
            return short_address;
        }
    }

    public String getSourceType()
    {
        if (!TextUtils.isEmpty(sourceType))
        {
            return sourceType;
        } else
        {
            return source_type;
        }
    }

    public String getSubtitle()
    {
        return subtitle;
    }

    public String getTag()
    {
        return tag;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public UberLatLng getUberLatLng()
    {
        if (latitude == null || longitude == null)
        {
            return null;
        } else
        {
            return new UberLatLng(latitude.doubleValue(), longitude.doubleValue());
        }
    }

    public int hashCode()
    {
        int i5 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        int k4;
        int l4;
        if (latitude != null)
        {
            i = latitude.hashCode();
        } else
        {
            i = 0;
        }
        if (longitude != null)
        {
            j = longitude.hashCode();
        } else
        {
            j = 0;
        }
        if (formatted_address != null)
        {
            k = formatted_address.hashCode();
        } else
        {
            k = 0;
        }
        if (long_address != null)
        {
            l = long_address.hashCode();
        } else
        {
            l = 0;
        }
        if (service_type != null)
        {
            i1 = service_type.hashCode();
        } else
        {
            i1 = 0;
        }
        if (source_type != null)
        {
            j1 = source_type.hashCode();
        } else
        {
            j1 = 0;
        }
        if (short_address != null)
        {
            k1 = short_address.hashCode();
        } else
        {
            k1 = 0;
        }
        if (formattedAddress != null)
        {
            l1 = formattedAddress.hashCode();
        } else
        {
            l1 = 0;
        }
        if (hash != null)
        {
            i2 = hash.hashCode();
        } else
        {
            i2 = 0;
        }
        if (id != null)
        {
            j2 = id.hashCode();
        } else
        {
            j2 = 0;
        }
        if (longAddress != null)
        {
            k2 = longAddress.hashCode();
        } else
        {
            k2 = 0;
        }
        if (nickname != null)
        {
            l2 = nickname.hashCode();
        } else
        {
            l2 = 0;
        }
        if (reference != null)
        {
            i3 = reference.hashCode();
        } else
        {
            i3 = 0;
        }
        if (relevance != null)
        {
            j3 = relevance.hashCode();
        } else
        {
            j3 = 0;
        }
        if (serviceType != null)
        {
            k3 = serviceType.hashCode();
        } else
        {
            k3 = 0;
        }
        if (shortAddress != null)
        {
            l3 = shortAddress.hashCode();
        } else
        {
            l3 = 0;
        }
        if (sourceType != null)
        {
            i4 = sourceType.hashCode();
        } else
        {
            i4 = 0;
        }
        if (subtitle != null)
        {
            j4 = subtitle.hashCode();
        } else
        {
            j4 = 0;
        }
        if (tag != null)
        {
            k4 = tag.hashCode();
        } else
        {
            k4 = 0;
        }
        if (title != null)
        {
            l4 = title.hashCode();
        } else
        {
            l4 = 0;
        }
        if (type != null)
        {
            i5 = type.hashCode();
        }
        return (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i5;
    }

    public boolean isDuplicate(LocationSearchResult locationsearchresult)
    {
        while (!TextUtils.isEmpty(getHash()) && getHash().equals(locationsearchresult.getHash()) || !TextUtils.isEmpty(getReference()) && getReference().equals(locationsearchresult.getReference()) || !TextUtils.isEmpty(getId()) && getId().equals(locationsearchresult.getId())) 
        {
            return true;
        }
        return false;
    }

    void setId(String s)
    {
        id = s;
    }

    void setLongAddress(String s)
    {
        longAddress = s;
    }

    void setReference(String s)
    {
        reference = s;
    }

    void setServiceType(String s)
    {
        serviceType = s;
    }

    void setTag(String s)
    {
        tag = s;
    }

    void setTitle(String s)
    {
        title = s;
    }

    void setUberLatLng(UberLatLng uberlatlng)
    {
        latitude = Double.valueOf(uberlatlng.a());
        longitude = Double.valueOf(uberlatlng.b());
    }

}
