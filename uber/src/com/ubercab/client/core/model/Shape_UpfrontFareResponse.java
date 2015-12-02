// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            UpfrontFareResponse, UpfrontFareSearchResults

public final class Shape_UpfrontFareResponse extends UpfrontFareResponse
{

    private UpfrontFareSearchResults dropoffs;
    private List tagged;
    private String tagline;

    Shape_UpfrontFareResponse()
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
            obj = (UpfrontFareResponse)obj;
            if (((UpfrontFareResponse) (obj)).getDropoffs() == null ? getDropoffs() != null : !((UpfrontFareResponse) (obj)).getDropoffs().equals(getDropoffs()))
            {
                return false;
            }
            if (((UpfrontFareResponse) (obj)).getTagline() == null ? getTagline() != null : !((UpfrontFareResponse) (obj)).getTagline().equals(getTagline()))
            {
                return false;
            }
            if (((UpfrontFareResponse) (obj)).getTagged() == null ? getTagged() != null : !((UpfrontFareResponse) (obj)).getTagged().equals(getTagged()))
            {
                return false;
            }
        }
        return true;
    }

    public final UpfrontFareSearchResults getDropoffs()
    {
        return dropoffs;
    }

    public final List getTagged()
    {
        return tagged;
    }

    public final String getTagline()
    {
        return tagline;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (dropoffs == null)
        {
            i = 0;
        } else
        {
            i = dropoffs.hashCode();
        }
        if (tagline == null)
        {
            j = 0;
        } else
        {
            j = tagline.hashCode();
        }
        if (tagged != null)
        {
            k = tagged.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final UpfrontFareResponse setDropoffs(UpfrontFareSearchResults upfrontfaresearchresults)
    {
        dropoffs = upfrontfaresearchresults;
        return this;
    }

    final UpfrontFareResponse setTagged(List list)
    {
        tagged = list;
        return this;
    }

    final UpfrontFareResponse setTagline(String s)
    {
        tagline = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("UpfrontFareResponse{dropoffs=")).append(dropoffs).append(", tagline=").append(tagline).append(", tagged=").append(tagged).append("}").toString();
    }
}
