// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.client.core.model.vehicleview.VehicleView;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.TripExtraPaymentData;
import com.ubercab.rider.realtime.model.TripPendingRatingDriver;
import com.ubercab.rider.realtime.model.TripVehicle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model:
//            TripPendingRatingDriver, CnLocation, ExtraPaymentData

public class TripPendingRating
    implements com.ubercab.rider.realtime.model.TripPendingRating
{

    com.ubercab.client.core.model.TripPendingRatingDriver driver;
    Long dropoffEpoch;
    CnLocation dropoffLocation;
    String dropoffTimestamp;
    ExtraPaymentData extraPaymentData;
    String fareBilledToCardString;
    String fareString;
    String fareSummaryPromoTagline;
    Float fareValue;
    List feedbackTags;
    List feedbackTypes;
    Integer feedbackUIVersion;
    String id;
    List items;
    String marketplace;
    String paymentProfileId;
    String paymentProfileUUID;
    Boolean showLostItemsDriverContact;
    TripVehicle vehicle;
    VehicleView vehicleView;

    public TripPendingRating()
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
            obj = (TripPendingRating)obj;
            if (dropoffEpoch == null ? ((TripPendingRating) (obj)).dropoffEpoch != null : !dropoffEpoch.equals(((TripPendingRating) (obj)).dropoffEpoch))
            {
                return false;
            }
            if (fareValue == null ? ((TripPendingRating) (obj)).fareValue != null : !fareValue.equals(((TripPendingRating) (obj)).fareValue))
            {
                return false;
            }
            if (feedbackUIVersion == null ? ((TripPendingRating) (obj)).feedbackUIVersion != null : !feedbackUIVersion.equals(((TripPendingRating) (obj)).feedbackUIVersion))
            {
                return false;
            }
            if (showLostItemsDriverContact == null ? ((TripPendingRating) (obj)).showLostItemsDriverContact != null : !showLostItemsDriverContact.equals(((TripPendingRating) (obj)).showLostItemsDriverContact))
            {
                return false;
            }
            if (dropoffTimestamp == null ? ((TripPendingRating) (obj)).dropoffTimestamp != null : !dropoffTimestamp.equals(((TripPendingRating) (obj)).dropoffTimestamp))
            {
                return false;
            }
            if (fareBilledToCardString == null ? ((TripPendingRating) (obj)).fareBilledToCardString != null : !fareBilledToCardString.equals(((TripPendingRating) (obj)).fareBilledToCardString))
            {
                return false;
            }
            if (fareString == null ? ((TripPendingRating) (obj)).fareString != null : !fareString.equals(((TripPendingRating) (obj)).fareString))
            {
                return false;
            }
            if (fareSummaryPromoTagline == null ? ((TripPendingRating) (obj)).fareSummaryPromoTagline != null : !fareSummaryPromoTagline.equals(((TripPendingRating) (obj)).fareSummaryPromoTagline))
            {
                return false;
            }
            if (id == null ? ((TripPendingRating) (obj)).id != null : !id.equals(((TripPendingRating) (obj)).id))
            {
                return false;
            }
            if (paymentProfileId == null ? ((TripPendingRating) (obj)).paymentProfileId != null : !paymentProfileId.equals(((TripPendingRating) (obj)).paymentProfileId))
            {
                return false;
            }
            if (paymentProfileUUID == null ? ((TripPendingRating) (obj)).paymentProfileUUID != null : !paymentProfileUUID.equals(((TripPendingRating) (obj)).paymentProfileUUID))
            {
                return false;
            }
            if (driver == null ? ((TripPendingRating) (obj)).driver != null : !driver.equals(((TripPendingRating) (obj)).driver))
            {
                return false;
            }
            if (dropoffLocation == null ? ((TripPendingRating) (obj)).dropoffLocation != null : !dropoffLocation.equals(((TripPendingRating) (obj)).dropoffLocation))
            {
                return false;
            }
            if (extraPaymentData == null ? ((TripPendingRating) (obj)).extraPaymentData != null : !extraPaymentData.equals(((TripPendingRating) (obj)).extraPaymentData))
            {
                return false;
            }
            if (vehicle == null ? ((TripPendingRating) (obj)).vehicle != null : !vehicle.equals(((TripPendingRating) (obj)).vehicle))
            {
                return false;
            }
            if (vehicleView == null ? ((TripPendingRating) (obj)).vehicleView != null : !vehicleView.equals(((TripPendingRating) (obj)).vehicleView))
            {
                return false;
            }
            if (feedbackTypes == null ? ((TripPendingRating) (obj)).feedbackTypes != null : !feedbackTypes.equals(((TripPendingRating) (obj)).feedbackTypes))
            {
                return false;
            }
        }
        return true;
    }

    public com.ubercab.client.core.model.TripPendingRatingDriver getDriver()
    {
        return driver;
    }

    public volatile TripPendingRatingDriver getDriver()
    {
        return getDriver();
    }

    public long getDropoffEpoch()
    {
        if (dropoffEpoch != null)
        {
            return dropoffEpoch.longValue();
        } else
        {
            return 0L;
        }
    }

    public Location getDropoffLocation()
    {
        return dropoffLocation;
    }

    public String getDropoffTimestamp()
    {
        return dropoffTimestamp;
    }

    public ExtraPaymentData getExtraPaymentData()
    {
        return extraPaymentData;
    }

    public volatile TripExtraPaymentData getExtraPaymentData()
    {
        return getExtraPaymentData();
    }

    public String getFareBilledToCardString()
    {
        return fareBilledToCardString;
    }

    public String getFareString()
    {
        return fareString;
    }

    public String getFareSummaryPromoTagline()
    {
        return fareSummaryPromoTagline;
    }

    public float getFareValue()
    {
        if (fareValue != null)
        {
            return fareValue.floatValue();
        } else
        {
            return 0.0F;
        }
    }

    public List getFeedbackTags()
    {
        if (feedbackTags != null)
        {
            return new ArrayList(feedbackTags);
        } else
        {
            return null;
        }
    }

    public List getFeedbackTypes()
    {
        if (feedbackTypes != null)
        {
            return new ArrayList(feedbackTypes);
        } else
        {
            return null;
        }
    }

    public int getFeedbackUIVersion()
    {
        if (feedbackUIVersion != null)
        {
            return feedbackUIVersion.intValue();
        } else
        {
            return 0;
        }
    }

    public String getId()
    {
        return id;
    }

    public List getItems()
    {
        if (items != null)
        {
            return new ArrayList(items);
        } else
        {
            return null;
        }
    }

    public String getMarketplace()
    {
        return marketplace;
    }

    public String getPaymentProfileId()
    {
        return paymentProfileId;
    }

    public String getPaymentProfileUUID()
    {
        return paymentProfileUUID;
    }

    public boolean getShowLostItemsDriverContact()
    {
        if (showLostItemsDriverContact != null)
        {
            return showLostItemsDriverContact.booleanValue();
        } else
        {
            return false;
        }
    }

    public TripVehicle getVehicle()
    {
        return vehicle;
    }

    public VehicleView getVehicleView()
    {
        return vehicleView;
    }

    public volatile com.ubercab.rider.realtime.model.VehicleView getVehicleView()
    {
        return getVehicleView();
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
        if (dropoffEpoch != null)
        {
            i = dropoffEpoch.hashCode();
        } else
        {
            i = 0;
        }
        if (fareValue != null)
        {
            j = fareValue.hashCode();
        } else
        {
            j = 0;
        }
        if (feedbackUIVersion != null)
        {
            k = feedbackUIVersion.hashCode();
        } else
        {
            k = 0;
        }
        if (showLostItemsDriverContact != null)
        {
            l = showLostItemsDriverContact.hashCode();
        } else
        {
            l = 0;
        }
        if (dropoffTimestamp != null)
        {
            i1 = dropoffTimestamp.hashCode();
        } else
        {
            i1 = 0;
        }
        if (fareBilledToCardString != null)
        {
            j1 = fareBilledToCardString.hashCode();
        } else
        {
            j1 = 0;
        }
        if (fareString != null)
        {
            k1 = fareString.hashCode();
        } else
        {
            k1 = 0;
        }
        if (fareSummaryPromoTagline != null)
        {
            l1 = fareSummaryPromoTagline.hashCode();
        } else
        {
            l1 = 0;
        }
        if (id != null)
        {
            i2 = id.hashCode();
        } else
        {
            i2 = 0;
        }
        if (paymentProfileId != null)
        {
            j2 = paymentProfileId.hashCode();
        } else
        {
            j2 = 0;
        }
        if (paymentProfileUUID != null)
        {
            k2 = paymentProfileUUID.hashCode();
        } else
        {
            k2 = 0;
        }
        if (driver != null)
        {
            l2 = driver.hashCode();
        } else
        {
            l2 = 0;
        }
        if (dropoffLocation != null)
        {
            i3 = dropoffLocation.hashCode();
        } else
        {
            i3 = 0;
        }
        if (extraPaymentData != null)
        {
            j3 = extraPaymentData.hashCode();
        } else
        {
            j3 = 0;
        }
        if (vehicle != null)
        {
            k3 = vehicle.hashCode();
        } else
        {
            k3 = 0;
        }
        if (vehicleView != null)
        {
            l3 = vehicleView.hashCode();
        } else
        {
            l3 = 0;
        }
        if (feedbackTypes != null)
        {
            i4 = feedbackTypes.hashCode();
        }
        return (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i4;
    }

    public void setDriver(com.ubercab.client.core.model.TripPendingRatingDriver trippendingratingdriver)
    {
        driver = trippendingratingdriver;
    }

    public void setDropoffEpoch(Long long1)
    {
        dropoffEpoch = long1;
    }

    public void setDropoffTimestamp(String s)
    {
        dropoffTimestamp = s;
    }

    public void setExtraPaymentData(ExtraPaymentData extrapaymentdata)
    {
        extraPaymentData = extrapaymentdata;
    }

    public void setFareBilledToCardString(String s)
    {
        fareBilledToCardString = s;
    }

    public void setFareString(String s)
    {
        fareString = s;
    }

    public void setFeedbackTags(List list)
    {
        feedbackTags = list;
    }

    public void setFeedbackTypes(List list)
    {
        feedbackTypes = list;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setItems(List list)
    {
        items = list;
    }

    public void setMarketplace(String s)
    {
        marketplace = s;
    }

    public void setVehicleView(VehicleView vehicleview)
    {
        vehicleView = vehicleview;
    }
}
