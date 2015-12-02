// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.FareInfo;

// Referenced classes of package com.ubercab.client.core.model:
//            SuggestedVehicleView

public final class Shape_SuggestedVehicleView extends SuggestedVehicleView
{

    private String confirmationMessage;
    private String confirmationTitle;
    private FareInfo fareInfo;
    private String tagline;
    private Integer vehicleViewId;

    Shape_SuggestedVehicleView()
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
            obj = (SuggestedVehicleView)obj;
            if (((SuggestedVehicleView) (obj)).getVehicleViewId() == null ? getVehicleViewId() != null : !((SuggestedVehicleView) (obj)).getVehicleViewId().equals(getVehicleViewId()))
            {
                return false;
            }
            if (((SuggestedVehicleView) (obj)).getConfirmationMessage() == null ? getConfirmationMessage() != null : !((SuggestedVehicleView) (obj)).getConfirmationMessage().equals(getConfirmationMessage()))
            {
                return false;
            }
            if (((SuggestedVehicleView) (obj)).getConfirmationTitle() == null ? getConfirmationTitle() != null : !((SuggestedVehicleView) (obj)).getConfirmationTitle().equals(getConfirmationTitle()))
            {
                return false;
            }
            if (((SuggestedVehicleView) (obj)).getFareInfo() == null ? getFareInfo() != null : !((SuggestedVehicleView) (obj)).getFareInfo().equals(getFareInfo()))
            {
                return false;
            }
            if (((SuggestedVehicleView) (obj)).getTagline() == null ? getTagline() != null : !((SuggestedVehicleView) (obj)).getTagline().equals(getTagline()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getConfirmationMessage()
    {
        return confirmationMessage;
    }

    public final String getConfirmationTitle()
    {
        return confirmationTitle;
    }

    public final FareInfo getFareInfo()
    {
        return fareInfo;
    }

    public final String getTagline()
    {
        return tagline;
    }

    public final Integer getVehicleViewId()
    {
        return vehicleViewId;
    }

    public final int hashCode()
    {
        int i1 = 0;
        int i;
        int j;
        int k;
        int l;
        if (vehicleViewId == null)
        {
            i = 0;
        } else
        {
            i = vehicleViewId.hashCode();
        }
        if (confirmationMessage == null)
        {
            j = 0;
        } else
        {
            j = confirmationMessage.hashCode();
        }
        if (confirmationTitle == null)
        {
            k = 0;
        } else
        {
            k = confirmationTitle.hashCode();
        }
        if (fareInfo == null)
        {
            l = 0;
        } else
        {
            l = fareInfo.hashCode();
        }
        if (tagline != null)
        {
            i1 = tagline.hashCode();
        }
        return (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ i1;
    }

    final SuggestedVehicleView setConfirmationMessage(String s)
    {
        confirmationMessage = s;
        return this;
    }

    final SuggestedVehicleView setConfirmationTitle(String s)
    {
        confirmationTitle = s;
        return this;
    }

    final SuggestedVehicleView setFareInfo(FareInfo fareinfo)
    {
        fareInfo = fareinfo;
        return this;
    }

    final SuggestedVehicleView setTagline(String s)
    {
        tagline = s;
        return this;
    }

    final SuggestedVehicleView setVehicleViewId(Integer integer)
    {
        vehicleViewId = integer;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("SuggestedVehicleView{vehicleViewId=")).append(vehicleViewId).append(", confirmationMessage=").append(confirmationMessage).append(", confirmationTitle=").append(confirmationTitle).append(", fareInfo=").append(fareInfo).append(", tagline=").append(tagline).append("}").toString();
    }
}
