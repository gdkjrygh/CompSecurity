// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.DynamicPickup;
import com.ubercab.rider.realtime.model.FareSplit;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.TripDriver;
import com.ubercab.rider.realtime.model.TripEntity;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.rider.realtime.model.TripExtraPaymentData;
import com.ubercab.rider.realtime.model.TripFareChange;
import com.ubercab.rider.realtime.model.TripLeg;
import com.ubercab.rider.realtime.model.TripLegAction;
import com.ubercab.rider.realtime.model.TripVehicle;
import gjx;
import gka;
import gke;
import gki;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            CnLocation, TripDriver, TripExpenseInfo, TripVehicle, 
//            TripFareChange

public class Trip
    implements com.ubercab.rider.realtime.model.Trip
{

    public static final String PROMO_STRING_KEY = "promoString";
    public static final String STATE_UBERPOOL_MATCHED = "UberPoolMatched";
    public static final String STATE_UBERPOOL_MATCHING = "UberPoolMatching";
    public static final String STATE_UBERPOOL_NOT_MATCHED = "UberPoolNotMatched";
    public static final String STATUS_STRING_KEY = "statusString";
    Boolean canShareETA;
    Boolean canSplitFare;
    String cancelDialog;
    Integer currentLegIndex;
    String currentLegStatus;
    String currentRoute;
    CnLocation destination;
    float dispatchPercent;
    com.ubercab.client.core.model.TripDriver driver;
    DynamicPickup dynamicPickup;
    Map entities;
    int eta;
    String etaString;
    String etaStringShort;
    Integer etaToDestination;
    TripExpenseInfo expenseInfo;
    Map extraStates;
    com.ubercab.client.core.model.TripFareChange fareChange;
    String fareSplitCode;
    boolean isZeroTolerance;
    List legs;
    Map locations;
    String paymentProfileUUID;
    CnLocation pickupLocation;
    String promoString;
    String routeToDestination;
    String shareUrl;
    boolean useCredits;
    String uuid;
    com.ubercab.client.core.model.TripVehicle vehicle;

    public Trip()
    {
        paymentProfileUUID = "";
        cancelDialog = "";
        etaString = "";
        etaStringShort = "";
        fareSplitCode = "";
        shareUrl = "";
        pickupLocation = new CnLocation();
        driver = new com.ubercab.client.core.model.TripDriver();
        expenseInfo = new com.ubercab.client.core.model.TripExpenseInfo();
        vehicle = new com.ubercab.client.core.model.TripVehicle();
    }

    private boolean hasActionTypeBeforeLegForUser(String s, TripLeg tripleg, String s1)
    {
        if (legs == null)
        {
            return false;
        }
        for (Iterator iterator = legs.iterator(); iterator.hasNext();)
        {
            TripLeg tripleg1 = (TripLeg)iterator.next();
            if (tripleg == tripleg1)
            {
                return false;
            }
            if (legHasActionAndUser(tripleg1, s, s1))
            {
                return true;
            }
        }

        return false;
    }

    private boolean legHasActionAndUser(TripLeg tripleg, final String actionType, final String entityUuid)
    {
        if (entities == null || tripleg.getActions() == null)
        {
            return false;
        } else
        {
            return gki.b(tripleg.getActions(), new gka() {

                final Trip this$0;
                final String val$actionType;
                final String val$entityUuid;

                public boolean apply(TripLegAction triplegaction)
                {
                    TripEntity tripentity = (TripEntity)entities.get(triplegaction.getEntityRef());
                    return actionType.equals(triplegaction.getType()) && tripentity != null && entityUuid.equals(tripentity.getUuid());
                }

                public volatile boolean apply(Object obj)
                {
                    return apply((TripLegAction)obj);
                }

            
            {
                this$0 = Trip.this;
                actionType = s;
                entityUuid = s1;
                super();
            }
            });
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Trip)obj;
            if (Float.compare(((Trip) (obj)).dispatchPercent, dispatchPercent) != 0)
            {
                return false;
            }
            if (eta != ((Trip) (obj)).eta)
            {
                return false;
            }
            if (isZeroTolerance != ((Trip) (obj)).isZeroTolerance)
            {
                return false;
            }
            if (useCredits != ((Trip) (obj)).useCredits)
            {
                return false;
            }
            if (canShareETA == null ? ((Trip) (obj)).canShareETA != null : !canShareETA.equals(((Trip) (obj)).canShareETA))
            {
                return false;
            }
            if (canSplitFare == null ? ((Trip) (obj)).canSplitFare != null : !canSplitFare.equals(((Trip) (obj)).canSplitFare))
            {
                return false;
            }
            if (cancelDialog == null ? ((Trip) (obj)).cancelDialog != null : !cancelDialog.equals(((Trip) (obj)).cancelDialog))
            {
                return false;
            }
            if (currentLegIndex == null ? ((Trip) (obj)).currentLegIndex != null : !currentLegIndex.equals(((Trip) (obj)).currentLegIndex))
            {
                return false;
            }
            if (currentLegStatus == null ? ((Trip) (obj)).currentLegStatus != null : !currentLegStatus.equals(((Trip) (obj)).currentLegStatus))
            {
                return false;
            }
            if (destination == null ? ((Trip) (obj)).destination != null : !destination.equals(((Trip) (obj)).destination))
            {
                return false;
            }
            if (driver == null ? ((Trip) (obj)).driver != null : !driver.equals(((Trip) (obj)).driver))
            {
                return false;
            }
            if (dynamicPickup == null ? ((Trip) (obj)).dynamicPickup != null : !dynamicPickup.equals(((Trip) (obj)).dynamicPickup))
            {
                return false;
            }
            if (entities == null ? ((Trip) (obj)).entities != null : !entities.equals(((Trip) (obj)).entities))
            {
                return false;
            }
            if (etaString == null ? ((Trip) (obj)).etaString != null : !etaString.equals(((Trip) (obj)).etaString))
            {
                return false;
            }
            if (etaStringShort == null ? ((Trip) (obj)).etaStringShort != null : !etaStringShort.equals(((Trip) (obj)).etaStringShort))
            {
                return false;
            }
            if (etaToDestination == null ? ((Trip) (obj)).etaToDestination != null : !etaToDestination.equals(((Trip) (obj)).etaToDestination))
            {
                return false;
            }
            if (expenseInfo == null ? ((Trip) (obj)).expenseInfo != null : !expenseInfo.equals(((Trip) (obj)).expenseInfo))
            {
                return false;
            }
            if (extraStates == null ? ((Trip) (obj)).extraStates != null : !extraStates.equals(((Trip) (obj)).extraStates))
            {
                return false;
            }
            if (fareSplitCode == null ? ((Trip) (obj)).fareSplitCode != null : !fareSplitCode.equals(((Trip) (obj)).fareSplitCode))
            {
                return false;
            }
            if (uuid == null ? ((Trip) (obj)).uuid != null : !uuid.equals(((Trip) (obj)).uuid))
            {
                return false;
            }
            if (legs == null ? ((Trip) (obj)).legs != null : !legs.equals(((Trip) (obj)).legs))
            {
                return false;
            }
            if (locations == null ? ((Trip) (obj)).locations != null : !locations.equals(((Trip) (obj)).locations))
            {
                return false;
            }
            if (paymentProfileUUID == null ? ((Trip) (obj)).paymentProfileUUID != null : !paymentProfileUUID.equals(((Trip) (obj)).paymentProfileUUID))
            {
                return false;
            }
            if (pickupLocation == null ? ((Trip) (obj)).pickupLocation != null : !pickupLocation.equals(((Trip) (obj)).pickupLocation))
            {
                return false;
            }
            if (promoString == null ? ((Trip) (obj)).promoString != null : !promoString.equals(((Trip) (obj)).promoString))
            {
                return false;
            }
            if (routeToDestination == null ? ((Trip) (obj)).routeToDestination != null : !routeToDestination.equals(((Trip) (obj)).routeToDestination))
            {
                return false;
            }
            if (currentRoute == null ? ((Trip) (obj)).currentRoute != null : !currentRoute.equals(((Trip) (obj)).currentRoute))
            {
                return false;
            }
            if (shareUrl == null ? ((Trip) (obj)).shareUrl != null : !shareUrl.equals(((Trip) (obj)).shareUrl))
            {
                return false;
            }
            if (vehicle == null ? ((Trip) (obj)).vehicle != null : !vehicle.equals(((Trip) (obj)).vehicle))
            {
                return false;
            }
            if (fareChange == null ? ((Trip) (obj)).fareChange != null : !fareChange.equals(((Trip) (obj)).fareChange))
            {
                return false;
            }
        }
        return true;
    }

    public boolean getCanShareETA()
    {
        if (canShareETA == null)
        {
            return true;
        } else
        {
            return canShareETA.booleanValue();
        }
    }

    public boolean getCanSplitFare()
    {
        if (canSplitFare == null)
        {
            return true;
        } else
        {
            return canSplitFare.booleanValue();
        }
    }

    public String getCancelDialog()
    {
        return cancelDialog;
    }

    public Integer getCurrentLeg()
    {
        return currentLegIndex;
    }

    public int getCurrentLegIndex()
    {
        return getCurrentLeg().intValue();
    }

    public String getCurrentLegStatus()
    {
        return currentLegStatus;
    }

    public String getCurrentRoute()
    {
        return currentRoute;
    }

    public Location getDestination()
    {
        return destination;
    }

    public String getDestinationSetBy()
    {
        return null;
    }

    public TripDriver getDriver()
    {
        return driver;
    }

    public DynamicPickup getDynamicPickup()
    {
        return dynamicPickup;
    }

    public Map getEntities()
    {
        if (entities == null)
        {
            return null;
        } else
        {
            return new HashMap(entities);
        }
    }

    public TripEntity getEntity(String s)
    {
        if (TextUtils.isEmpty(s) || entities == null)
        {
            return null;
        } else
        {
            return (TripEntity)entities.get(s);
        }
    }

    public int getEta()
    {
        return eta;
    }

    public String getEtaString()
    {
        return etaString;
    }

    public String getEtaStringShort()
    {
        return etaStringShort;
    }

    public int getEtaToDestination()
    {
        if (etaToDestination == null)
        {
            return 0;
        } else
        {
            return etaToDestination.intValue();
        }
    }

    public TripExpenseInfo getExpenseInfo()
    {
        return expenseInfo;
    }

    public TripExtraPaymentData getExtraPaymentData()
    {
        return null;
    }

    public Map getExtraStates()
    {
        return extraStates;
    }

    public com.ubercab.client.core.model.TripFareChange getFareChange()
    {
        return fareChange;
    }

    public volatile TripFareChange getFareChange()
    {
        return getFareChange();
    }

    public List getFareEstimateRange()
    {
        return null;
    }

    public String getFareEstimateString()
    {
        return null;
    }

    public FareSplit getFareSplit()
    {
        return null;
    }

    public List getFeedbackTypes()
    {
        return null;
    }

    public boolean getIsZeroTolerance()
    {
        return isZeroTolerance;
    }

    public List getLegs()
    {
        if (legs == null)
        {
            return null;
        } else
        {
            return new ArrayList(legs);
        }
    }

    public List getLegsBetweenCurrentLegAndPickup(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = getRemainingLegs().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            TripLeg tripleg = (TripLeg)iterator.next();
            if (isUserInVehicleForLeg(tripleg, s))
            {
                break;
            }
            arraylist.add(tripleg);
        } while (true);
        return arraylist;
    }

    public CnLocation getLocation(String s)
    {
        if (TextUtils.isEmpty(s) || locations == null)
        {
            return null;
        } else
        {
            return (CnLocation)locations.get(s);
        }
    }

    public volatile Location getLocation(String s)
    {
        return getLocation(s);
    }

    public Map getLocations()
    {
        if (locations == null)
        {
            return null;
        } else
        {
            return new HashMap(locations);
        }
    }

    public String getPaymentProfileUUID()
    {
        return getPaymentProfileUuid();
    }

    public String getPaymentProfileUuid()
    {
        return paymentProfileUUID;
    }

    public Location getPickupLocation()
    {
        return pickupLocation;
    }

    public List getRemainingLegs()
    {
        if (legs != null && currentLegIndex != null && currentLegIndex.intValue() < legs.size())
        {
            return new ArrayList(legs.subList(currentLegIndex.intValue(), legs.size()));
        } else
        {
            return gke.b();
        }
    }

    public String getRouteToDestination()
    {
        return routeToDestination;
    }

    public String getShareUrl()
    {
        return shareUrl;
    }

    public boolean getUseCredits()
    {
        return isUseCredits();
    }

    public String getUuid()
    {
        return uuid;
    }

    public TripVehicle getVehicle()
    {
        return vehicle;
    }

    public int getVehicleViewId()
    {
        return 0;
    }

    public int hashCode()
    {
        int j1 = 1;
        int i7 = 0;
        int j7 = eta;
        int i;
        int j;
        int k;
        int l;
        int i1;
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
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        if (etaToDestination != null)
        {
            i = etaToDestination.hashCode();
        } else
        {
            i = 0;
        }
        if (dispatchPercent != 0.0F)
        {
            j = Float.floatToIntBits(dispatchPercent);
        } else
        {
            j = 0;
        }
        if (canSplitFare != null)
        {
            k = canSplitFare.hashCode();
        } else
        {
            k = 0;
        }
        if (canShareETA != null)
        {
            l = canShareETA.hashCode();
        } else
        {
            l = 0;
        }
        if (useCredits)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!isZeroTolerance)
        {
            j1 = 0;
        }
        if (uuid != null)
        {
            k1 = uuid.hashCode();
        } else
        {
            k1 = 0;
        }
        if (paymentProfileUUID != null)
        {
            l1 = paymentProfileUUID.hashCode();
        } else
        {
            l1 = 0;
        }
        if (promoString != null)
        {
            i2 = promoString.hashCode();
        } else
        {
            i2 = 0;
        }
        if (cancelDialog != null)
        {
            j2 = cancelDialog.hashCode();
        } else
        {
            j2 = 0;
        }
        if (currentLegStatus != null)
        {
            k2 = currentLegStatus.hashCode();
        } else
        {
            k2 = 0;
        }
        if (etaString != null)
        {
            l2 = etaString.hashCode();
        } else
        {
            l2 = 0;
        }
        if (etaStringShort != null)
        {
            i3 = etaStringShort.hashCode();
        } else
        {
            i3 = 0;
        }
        if (fareSplitCode != null)
        {
            j3 = fareSplitCode.hashCode();
        } else
        {
            j3 = 0;
        }
        if (routeToDestination != null)
        {
            k3 = routeToDestination.hashCode();
        } else
        {
            k3 = 0;
        }
        if (currentRoute != null)
        {
            l3 = currentRoute.hashCode();
        } else
        {
            l3 = 0;
        }
        if (shareUrl != null)
        {
            i4 = shareUrl.hashCode();
        } else
        {
            i4 = 0;
        }
        if (destination != null)
        {
            j4 = destination.hashCode();
        } else
        {
            j4 = 0;
        }
        if (extraStates != null)
        {
            k4 = extraStates.hashCode();
        } else
        {
            k4 = 0;
        }
        if (dynamicPickup != null)
        {
            l4 = dynamicPickup.hashCode();
        } else
        {
            l4 = 0;
        }
        if (pickupLocation != null)
        {
            i5 = pickupLocation.hashCode();
        } else
        {
            i5 = 0;
        }
        if (currentLegIndex != null)
        {
            j5 = currentLegIndex.hashCode();
        } else
        {
            j5 = 0;
        }
        if (legs != null)
        {
            k5 = legs.hashCode();
        } else
        {
            k5 = 0;
        }
        if (locations != null)
        {
            l5 = locations.hashCode();
        } else
        {
            l5 = 0;
        }
        if (entities != null)
        {
            i6 = entities.hashCode();
        } else
        {
            i6 = 0;
        }
        if (driver != null)
        {
            j6 = driver.hashCode();
        } else
        {
            j6 = 0;
        }
        if (expenseInfo != null)
        {
            k6 = expenseInfo.hashCode();
        } else
        {
            k6 = 0;
        }
        if (vehicle != null)
        {
            l6 = vehicle.hashCode();
        } else
        {
            l6 = 0;
        }
        if (fareChange != null)
        {
            i7 = fareChange.hashCode();
        }
        return (l6 + (k6 + (j6 + (i6 + (l5 + (k5 + (j5 + (i5 + (l4 + (k4 + (j4 + (i4 + (l3 + (k3 + (j3 + (i3 + (l2 + (k2 + (j2 + (i2 + (l1 + (k1 + ((i1 + (l + (k + (j + (i + j7 * 31) * 31) * 31) * 31) * 31) * 31 + j1) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i7;
    }

    public boolean isClientPartOfTripDuringLeg(String s, TripLeg tripleg)
    {
        return isUserInVehicleForLeg(tripleg, s);
    }

    public boolean isLegForClient(TripLeg tripleg, String s)
    {
        return isLegForUser(tripleg, s);
    }

    public boolean isLegForUser(TripLeg tripleg, String s)
    {
        if (tripleg.getActions() == null || entities == null)
        {
            return false;
        }
        for (tripleg = tripleg.getActions().iterator(); tripleg.hasNext();)
        {
            Object obj = (TripLegAction)tripleg.next();
            obj = (TripEntity)entities.get(((TripLegAction) (obj)).getEntityRef());
            if (obj != null && gjx.a(((TripEntity) (obj)).getUuid(), s))
            {
                return true;
            }
        }

        return false;
    }

    public boolean isUseCredits()
    {
        return useCredits;
    }

    public boolean isUserInVehicleForLeg(TripLeg tripleg, String s)
    {
        boolean flag = hasActionTypeBeforeLegForUser("Pickup", tripleg, s);
        boolean flag1 = hasActionTypeBeforeLegForUser("Dropoff", tripleg, s);
        return flag && !flag1;
    }
}
