// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.pickup.model;


public final class Shape_GuidedPickupVenue_VenueProperties extends GuidedPickupVenue.VenueProperties
{

    private String id;
    private String locationSelectionDescription;
    private String locationSelectionTitle;
    private String name;
    private String shortName;
    private String subType;
    private String welcomeDescription;
    private String welcomeTitle;
    private GuidedPickupVenue.ZoneCollection zones;

    Shape_GuidedPickupVenue_VenueProperties()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (GuidedPickupVenue.VenueProperties)obj;
            if (((GuidedPickupVenue.VenueProperties) (obj)).getName() == null ? getName() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getName().equals(getName()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getShortName() == null ? getShortName() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getShortName().equals(getShortName()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getId() == null ? getId() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getLocationSelectionDescription() == null ? getLocationSelectionDescription() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getLocationSelectionDescription().equals(getLocationSelectionDescription()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getLocationSelectionTitle() == null ? getLocationSelectionTitle() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getLocationSelectionTitle().equals(getLocationSelectionTitle()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getSubType() == null ? getSubType() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getSubType().equals(getSubType()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getWelcomeDescription() == null ? getWelcomeDescription() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getWelcomeDescription().equals(getWelcomeDescription()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getWelcomeTitle() == null ? getWelcomeTitle() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getWelcomeTitle().equals(getWelcomeTitle()))
            {
                return false;
            }
            if (((GuidedPickupVenue.VenueProperties) (obj)).getZones() == null ? getZones() != null : !((GuidedPickupVenue.VenueProperties) (obj)).getZones().equals(getZones()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getId()
    {
        return id;
    }

    public final String getLocationSelectionDescription()
    {
        return locationSelectionDescription;
    }

    public final String getLocationSelectionTitle()
    {
        return locationSelectionTitle;
    }

    public final String getName()
    {
        return name;
    }

    public final String getShortName()
    {
        return shortName;
    }

    public final String getSubType()
    {
        return subType;
    }

    public final String getWelcomeDescription()
    {
        return welcomeDescription;
    }

    public final String getWelcomeTitle()
    {
        return welcomeTitle;
    }

    public final GuidedPickupVenue.ZoneCollection getZones()
    {
        return zones;
    }

    public final int hashCode()
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
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (shortName == null)
        {
            j = 0;
        } else
        {
            j = shortName.hashCode();
        }
        if (id == null)
        {
            k = 0;
        } else
        {
            k = id.hashCode();
        }
        if (locationSelectionDescription == null)
        {
            l = 0;
        } else
        {
            l = locationSelectionDescription.hashCode();
        }
        if (locationSelectionTitle == null)
        {
            i1 = 0;
        } else
        {
            i1 = locationSelectionTitle.hashCode();
        }
        if (subType == null)
        {
            j1 = 0;
        } else
        {
            j1 = subType.hashCode();
        }
        if (welcomeDescription == null)
        {
            k1 = 0;
        } else
        {
            k1 = welcomeDescription.hashCode();
        }
        if (welcomeTitle == null)
        {
            l1 = 0;
        } else
        {
            l1 = welcomeTitle.hashCode();
        }
        if (zones != null)
        {
            i2 = zones.hashCode();
        }
        return (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i2;
    }

    final GuidedPickupVenue.VenueProperties setId(String s)
    {
        id = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setLocationSelectionDescription(String s)
    {
        locationSelectionDescription = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setLocationSelectionTitle(String s)
    {
        locationSelectionTitle = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setName(String s)
    {
        name = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setShortName(String s)
    {
        shortName = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setSubType(String s)
    {
        subType = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setWelcomeDescription(String s)
    {
        welcomeDescription = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setWelcomeTitle(String s)
    {
        welcomeTitle = s;
        return this;
    }

    final GuidedPickupVenue.VenueProperties setZones(GuidedPickupVenue.ZoneCollection zonecollection)
    {
        zones = zonecollection;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("GuidedPickupVenue.VenueProperties{name=")).append(name).append(", shortName=").append(shortName).append(", id=").append(id).append(", locationSelectionDescription=").append(locationSelectionDescription).append(", locationSelectionTitle=").append(locationSelectionTitle).append(", subType=").append(subType).append(", welcomeDescription=").append(welcomeDescription).append(", welcomeTitle=").append(welcomeTitle).append(", zones=").append(zones).append("}").toString();
    }
}
