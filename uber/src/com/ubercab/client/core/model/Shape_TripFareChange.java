// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            TripFareChange

public final class Shape_TripFareChange extends TripFareChange
{

    private String changeType;
    private String changeTypeText;
    private String detailedMessage;
    private String oldFare;
    private String title;
    private String updatedFare;

    Shape_TripFareChange()
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
            obj = (TripFareChange)obj;
            if (((TripFareChange) (obj)).getChangeType() == null ? getChangeType() != null : !((TripFareChange) (obj)).getChangeType().equals(getChangeType()))
            {
                return false;
            }
            if (((TripFareChange) (obj)).getChangeTypeText() == null ? getChangeTypeText() != null : !((TripFareChange) (obj)).getChangeTypeText().equals(getChangeTypeText()))
            {
                return false;
            }
            if (((TripFareChange) (obj)).getOldFare() == null ? getOldFare() != null : !((TripFareChange) (obj)).getOldFare().equals(getOldFare()))
            {
                return false;
            }
            if (((TripFareChange) (obj)).getUpdatedFare() == null ? getUpdatedFare() != null : !((TripFareChange) (obj)).getUpdatedFare().equals(getUpdatedFare()))
            {
                return false;
            }
            if (((TripFareChange) (obj)).getTitle() == null ? getTitle() != null : !((TripFareChange) (obj)).getTitle().equals(getTitle()))
            {
                return false;
            }
            if (((TripFareChange) (obj)).getDetailedMessage() == null ? getDetailedMessage() != null : !((TripFareChange) (obj)).getDetailedMessage().equals(getDetailedMessage()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getChangeType()
    {
        return changeType;
    }

    public final String getChangeTypeText()
    {
        return changeTypeText;
    }

    public final String getDetailedMessage()
    {
        return detailedMessage;
    }

    public final String getOldFare()
    {
        return oldFare;
    }

    public final String getTitle()
    {
        return title;
    }

    public final String getUpdatedFare()
    {
        return updatedFare;
    }

    public final int hashCode()
    {
        int j1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        if (changeType == null)
        {
            i = 0;
        } else
        {
            i = changeType.hashCode();
        }
        if (changeTypeText == null)
        {
            j = 0;
        } else
        {
            j = changeTypeText.hashCode();
        }
        if (oldFare == null)
        {
            k = 0;
        } else
        {
            k = oldFare.hashCode();
        }
        if (updatedFare == null)
        {
            l = 0;
        } else
        {
            l = updatedFare.hashCode();
        }
        if (title == null)
        {
            i1 = 0;
        } else
        {
            i1 = title.hashCode();
        }
        if (detailedMessage != null)
        {
            j1 = detailedMessage.hashCode();
        }
        return (i1 ^ (l ^ (k ^ (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j1;
    }

    final void setChangeType(String s)
    {
        changeType = s;
    }

    final void setChangeTypeText(String s)
    {
        changeTypeText = s;
    }

    final void setDetailedMessage(String s)
    {
        detailedMessage = s;
    }

    final void setOldFare(String s)
    {
        oldFare = s;
    }

    final void setTitle(String s)
    {
        title = s;
    }

    final void setUpdatedFare(String s)
    {
        updatedFare = s;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.TripFareChange{changeType=")).append(changeType).append(", changeTypeText=").append(changeTypeText).append(", oldFare=").append(oldFare).append(", updatedFare=").append(updatedFare).append(", title=").append(title).append(", detailedMessage=").append(detailedMessage).append("}").toString();
    }
}
