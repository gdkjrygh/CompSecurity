// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.android.location.UberLatLng;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.ValidatedAddress;
import java.util.List;

public class CnLocation
    implements Location
{

    private String address;
    private List address_components;
    private Long distance;
    private String formatted_address;
    private String id;
    private String language;
    Double latitude;
    Double longitude;
    private String nickname;
    private String reference;
    private String referenceType;
    private String relevance;
    private String subtitle;
    private String title;
    private String type;
    private String uuid;
    private ValidatedAddress validatedAddress;

    public CnLocation()
    {
    }

    public static CnLocation create(double d, double d1)
    {
        CnLocation cnlocation = new CnLocation();
        cnlocation.setLatitude(d);
        cnlocation.setLongitude(d1);
        return cnlocation;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (CnLocation)obj;
            if (latitude == null ? ((CnLocation) (obj)).latitude != null : !latitude.equals(((CnLocation) (obj)).latitude))
            {
                return false;
            }
            if (longitude == null ? ((CnLocation) (obj)).longitude != null : !longitude.equals(((CnLocation) (obj)).longitude))
            {
                return false;
            }
            if (distance == null ? ((CnLocation) (obj)).distance != null : !distance.equals(((CnLocation) (obj)).distance))
            {
                return false;
            }
            if (id == null ? ((CnLocation) (obj)).id != null : !id.equals(((CnLocation) (obj)).id))
            {
                return false;
            }
            if (uuid == null ? ((CnLocation) (obj)).uuid != null : !uuid.equals(((CnLocation) (obj)).uuid))
            {
                return false;
            }
            if (type == null ? ((CnLocation) (obj)).type != null : !type.equals(((CnLocation) (obj)).type))
            {
                return false;
            }
            if (nickname == null ? ((CnLocation) (obj)).nickname != null : !nickname.equals(((CnLocation) (obj)).nickname))
            {
                return false;
            }
            if (address == null ? ((CnLocation) (obj)).address != null : !address.equals(((CnLocation) (obj)).address))
            {
                return false;
            }
            if (reference == null ? ((CnLocation) (obj)).reference != null : !reference.equals(((CnLocation) (obj)).reference))
            {
                return false;
            }
            if (relevance == null ? ((CnLocation) (obj)).relevance != null : !relevance.equals(((CnLocation) (obj)).relevance))
            {
                return false;
            }
            if (referenceType == null ? ((CnLocation) (obj)).referenceType != null : !referenceType.equals(((CnLocation) (obj)).referenceType))
            {
                return false;
            }
            if (subtitle == null ? ((CnLocation) (obj)).subtitle != null : !subtitle.equals(((CnLocation) (obj)).subtitle))
            {
                return false;
            }
            if (title == null ? ((CnLocation) (obj)).title != null : !title.equals(((CnLocation) (obj)).title))
            {
                return false;
            }
            if (formatted_address == null ? ((CnLocation) (obj)).formatted_address != null : !formatted_address.equals(((CnLocation) (obj)).formatted_address))
            {
                return false;
            }
            if (language == null ? ((CnLocation) (obj)).language != null : !language.equals(((CnLocation) (obj)).language))
            {
                return false;
            }
            if (validatedAddress == null ? ((CnLocation) (obj)).validatedAddress != null : !validatedAddress.equals(((CnLocation) (obj)).validatedAddress))
            {
                return false;
            }
            if (address_components == null ? ((CnLocation) (obj)).address_components != null : !address_components.equals(((CnLocation) (obj)).address_components))
            {
                return false;
            }
        }
        return true;
    }

    public String getAddress()
    {
        return address;
    }

    public List getAddressComponents()
    {
        return address_components;
    }

    public long getDistance()
    {
        if (distance != null)
        {
            return distance.longValue();
        } else
        {
            return 0L;
        }
    }

    public String getFormattedAddress()
    {
        return formatted_address;
    }

    public String getId()
    {
        return id;
    }

    public String getLanguage()
    {
        return language;
    }

    public double getLatitude()
    {
        if (latitude != null)
        {
            return latitude.doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public double getLongitude()
    {
        if (longitude != null)
        {
            return longitude.doubleValue();
        } else
        {
            return 0.0D;
        }
    }

    public String getNickname()
    {
        return nickname;
    }

    public String getReference()
    {
        return reference;
    }

    public String getReferenceType()
    {
        return referenceType;
    }

    public String getSubtitle()
    {
        return subtitle;
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
        return new UberLatLng(getLatitude(), getLongitude());
    }

    public String getUuid()
    {
        return uuid;
    }

    public ValidatedAddress getValidatedAddress()
    {
        return validatedAddress;
    }

    public int hashCode()
    {
        int i4 = 0;
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
        if (distance != null)
        {
            k = distance.hashCode();
        } else
        {
            k = 0;
        }
        if (id != null)
        {
            l = id.hashCode();
        } else
        {
            l = 0;
        }
        if (uuid != null)
        {
            i1 = uuid.hashCode();
        } else
        {
            i1 = 0;
        }
        if (type != null)
        {
            j1 = type.hashCode();
        } else
        {
            j1 = 0;
        }
        if (nickname != null)
        {
            k1 = nickname.hashCode();
        } else
        {
            k1 = 0;
        }
        if (address != null)
        {
            l1 = address.hashCode();
        } else
        {
            l1 = 0;
        }
        if (reference != null)
        {
            i2 = reference.hashCode();
        } else
        {
            i2 = 0;
        }
        if (relevance != null)
        {
            j2 = relevance.hashCode();
        } else
        {
            j2 = 0;
        }
        if (referenceType != null)
        {
            k2 = referenceType.hashCode();
        } else
        {
            k2 = 0;
        }
        if (subtitle != null)
        {
            l2 = subtitle.hashCode();
        } else
        {
            l2 = 0;
        }
        if (title != null)
        {
            i3 = title.hashCode();
        } else
        {
            i3 = 0;
        }
        if (formatted_address != null)
        {
            j3 = formatted_address.hashCode();
        } else
        {
            j3 = 0;
        }
        if (language != null)
        {
            k3 = language.hashCode();
        } else
        {
            k3 = 0;
        }
        if (validatedAddress != null)
        {
            l3 = validatedAddress.hashCode();
        } else
        {
            l3 = 0;
        }
        if (address_components != null)
        {
            i4 = address_components.hashCode();
        }
        return (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i4;
    }

    public void setAddress(String s)
    {
        address = s;
    }

    public void setAddressComponents(List list)
    {
        address_components = list;
    }

    public void setFormattedAddress(String s)
    {
        formatted_address = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setLanguage(String s)
    {
        language = s;
    }

    public void setLatitude(double d)
    {
        latitude = Double.valueOf(d);
    }

    public void setLongitude(double d)
    {
        longitude = Double.valueOf(d);
    }

    public void setNickname(String s)
    {
        nickname = s;
    }

    public void setReference(String s)
    {
        reference = s;
    }

    public void setReferenceType(String s)
    {
        referenceType = s;
    }

    public void setRelevance(String s)
    {
        relevance = s;
    }

    public void setType(String s)
    {
        type = s;
    }
}
