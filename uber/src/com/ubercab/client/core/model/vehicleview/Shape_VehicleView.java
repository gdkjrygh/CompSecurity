// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;

import com.ubercab.rider.realtime.model.Fare;
import com.ubercab.rider.realtime.model.Tagline;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            VehicleView

public final class Shape_VehicleView extends VehicleView
{

    private static final Set SHAPE_PROPERTIES;
    private boolean allowCredits;
    private String allowCreditsError;
    private boolean allowFareEstimate;
    private boolean allowRidepool;
    private int capacity;
    private String capacityTagline;
    private String confirmPickupButtonString;
    private String confirmationType;
    private String description;
    private String destinationEntry;
    private String displayName;
    private boolean enableVehicleInventoryView;
    private Fare fare;
    private String fareDetailsUrl;
    private String fareMessage;
    private String groupDisplayName;
    private String groupId;
    private String hijackSavingTagline;
    private String hijackSharingTagline;
    private String hijackTipTagline;
    private String hijackVehicleViewId;
    private String id;
    private boolean isCashOnly;
    private boolean isDestinationRequired;
    private boolean isInspecting;
    private String linkedVehicleViewId;
    private List mapImages;
    private int maxFareSplits;
    private String minFareTitle;
    private List monoImages;
    private String noneAvailableString;
    private String parentId;
    private String permittedPaymentMethodsError;
    private String pickupButtonString;
    private String pickupEtaString;
    private String productGroupUuid;
    private String requestPickupButtonString;
    private String ridePoolOption;
    private String setPickupLocationString;
    private String sharingTagline;
    private boolean suppressSurgeUI;
    private String surgeTitle;
    private Tagline tagline;
    private String uuid;

    Shape_VehicleView()
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
            obj = (VehicleView)obj;
            if (((VehicleView) (obj)).getAllowCredits() != getAllowCredits())
            {
                return false;
            }
            if (((VehicleView) (obj)).getAllowFareEstimate() != getAllowFareEstimate())
            {
                return false;
            }
            if (((VehicleView) (obj)).getAllowRidepool() != getAllowRidepool())
            {
                return false;
            }
            if (((VehicleView) (obj)).getIsCashOnly() != getIsCashOnly())
            {
                return false;
            }
            if (((VehicleView) (obj)).getIsInspecting() != getIsInspecting())
            {
                return false;
            }
            if (((VehicleView) (obj)).getCapacity() != getCapacity())
            {
                return false;
            }
            if (((VehicleView) (obj)).getMaxFareSplits() != getMaxFareSplits())
            {
                return false;
            }
            if (((VehicleView) (obj)).getAllowCreditsError() == null ? getAllowCreditsError() != null : !((VehicleView) (obj)).getAllowCreditsError().equals(getAllowCreditsError()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getConfirmPickupButtonString() == null ? getConfirmPickupButtonString() != null : !((VehicleView) (obj)).getConfirmPickupButtonString().equals(getConfirmPickupButtonString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getDescription() == null ? getDescription() != null : !((VehicleView) (obj)).getDescription().equals(getDescription()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getDestinationEntry() == null ? getDestinationEntry() != null : !((VehicleView) (obj)).getDestinationEntry().equals(getDestinationEntry()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getDisplayName() == null ? getDisplayName() != null : !((VehicleView) (obj)).getDisplayName().equals(getDisplayName()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getFareDetailsUrl() == null ? getFareDetailsUrl() != null : !((VehicleView) (obj)).getFareDetailsUrl().equals(getFareDetailsUrl()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getFareMessage() == null ? getFareMessage() != null : !((VehicleView) (obj)).getFareMessage().equals(getFareMessage()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getGroupDisplayName() == null ? getGroupDisplayName() != null : !((VehicleView) (obj)).getGroupDisplayName().equals(getGroupDisplayName()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getGroupId() == null ? getGroupId() != null : !((VehicleView) (obj)).getGroupId().equals(getGroupId()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getId() == null ? getId() != null : !((VehicleView) (obj)).getId().equals(getId()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getMinFareTitle() == null ? getMinFareTitle() != null : !((VehicleView) (obj)).getMinFareTitle().equals(getMinFareTitle()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getNoneAvailableString() == null ? getNoneAvailableString() != null : !((VehicleView) (obj)).getNoneAvailableString().equals(getNoneAvailableString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getParentId() == null ? getParentId() != null : !((VehicleView) (obj)).getParentId().equals(getParentId()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getPermittedPaymentMethodsError() == null ? getPermittedPaymentMethodsError() != null : !((VehicleView) (obj)).getPermittedPaymentMethodsError().equals(getPermittedPaymentMethodsError()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getPickupButtonString() == null ? getPickupButtonString() != null : !((VehicleView) (obj)).getPickupButtonString().equals(getPickupButtonString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getPickupEtaString() == null ? getPickupEtaString() != null : !((VehicleView) (obj)).getPickupEtaString().equals(getPickupEtaString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getRequestPickupButtonString() == null ? getRequestPickupButtonString() != null : !((VehicleView) (obj)).getRequestPickupButtonString().equals(getRequestPickupButtonString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getRidePoolOption() == null ? getRidePoolOption() != null : !((VehicleView) (obj)).getRidePoolOption().equals(getRidePoolOption()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getSetPickupLocationString() == null ? getSetPickupLocationString() != null : !((VehicleView) (obj)).getSetPickupLocationString().equals(getSetPickupLocationString()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getSurgeTitle() == null ? getSurgeTitle() != null : !((VehicleView) (obj)).getSurgeTitle().equals(getSurgeTitle()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getUuid() == null ? getUuid() != null : !((VehicleView) (obj)).getUuid().equals(getUuid()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getMapImages() == null ? getMapImages() != null : !((VehicleView) (obj)).getMapImages().equals(getMapImages()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getMonoImages() == null ? getMonoImages() != null : !((VehicleView) (obj)).getMonoImages().equals(getMonoImages()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getFare() == null ? getFare() != null : !((VehicleView) (obj)).getFare().equals(getFare()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getTagline() == null ? getTagline() != null : !((VehicleView) (obj)).getTagline().equals(getTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getCapacityTagline() == null ? getCapacityTagline() != null : !((VehicleView) (obj)).getCapacityTagline().equals(getCapacityTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getConfirmationType() == null ? getConfirmationType() != null : !((VehicleView) (obj)).getConfirmationType().equals(getConfirmationType()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getLinkedVehicleViewId() == null ? getLinkedVehicleViewId() != null : !((VehicleView) (obj)).getLinkedVehicleViewId().equals(getLinkedVehicleViewId()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getHijackVehicleViewId() == null ? getHijackVehicleViewId() != null : !((VehicleView) (obj)).getHijackVehicleViewId().equals(getHijackVehicleViewId()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getProductGroupUuid() == null ? getProductGroupUuid() != null : !((VehicleView) (obj)).getProductGroupUuid().equals(getProductGroupUuid()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getSharingTagline() == null ? getSharingTagline() != null : !((VehicleView) (obj)).getSharingTagline().equals(getSharingTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getHijackSavingTagline() == null ? getHijackSavingTagline() != null : !((VehicleView) (obj)).getHijackSavingTagline().equals(getHijackSavingTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getHijackSharingTagline() == null ? getHijackSharingTagline() != null : !((VehicleView) (obj)).getHijackSharingTagline().equals(getHijackSharingTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getHijackTipTagline() == null ? getHijackTipTagline() != null : !((VehicleView) (obj)).getHijackTipTagline().equals(getHijackTipTagline()))
            {
                return false;
            }
            if (((VehicleView) (obj)).getEnableVehicleInventoryView() != getEnableVehicleInventoryView())
            {
                return false;
            }
            if (((VehicleView) (obj)).getIsDestinationRequired() != getIsDestinationRequired())
            {
                return false;
            }
            if (((VehicleView) (obj)).getSuppressSurgeUI() != getSuppressSurgeUI())
            {
                return false;
            }
        }
        return true;
    }

    public final boolean getAllowCredits()
    {
        return ((Boolean)onGet(Property.ALLOW_CREDITS, Boolean.valueOf(allowCredits))).booleanValue();
    }

    public final String getAllowCreditsError()
    {
        return (String)onGet(Property.ALLOW_CREDITS_ERROR, allowCreditsError);
    }

    public final boolean getAllowFareEstimate()
    {
        return ((Boolean)onGet(Property.ALLOW_FARE_ESTIMATE, Boolean.valueOf(allowFareEstimate))).booleanValue();
    }

    public final boolean getAllowRidepool()
    {
        return ((Boolean)onGet(Property.ALLOW_RIDEPOOL, Boolean.valueOf(allowRidepool))).booleanValue();
    }

    public final int getCapacity()
    {
        return ((Integer)onGet(Property.CAPACITY, Integer.valueOf(capacity))).intValue();
    }

    public final String getCapacityTagline()
    {
        return (String)onGet(Property.CAPACITY_TAGLINE, capacityTagline);
    }

    public final String getConfirmPickupButtonString()
    {
        return (String)onGet(Property.CONFIRM_PICKUP_BUTTON_STRING, confirmPickupButtonString);
    }

    public final String getConfirmationType()
    {
        return (String)onGet(Property.CONFIRMATION_TYPE, confirmationType);
    }

    public final String getDescription()
    {
        return (String)onGet(Property.DESCRIPTION, description);
    }

    public final String getDestinationEntry()
    {
        return (String)onGet(Property.DESTINATION_ENTRY, destinationEntry);
    }

    public final String getDisplayName()
    {
        return (String)onGet(Property.DISPLAY_NAME, displayName);
    }

    public final boolean getEnableVehicleInventoryView()
    {
        return ((Boolean)onGet(Property.ENABLE_VEHICLE_INVENTORY_VIEW, Boolean.valueOf(enableVehicleInventoryView))).booleanValue();
    }

    public final Fare getFare()
    {
        return (Fare)onGet(Property.FARE, fare);
    }

    public final String getFareDetailsUrl()
    {
        return (String)onGet(Property.FARE_DETAILS_URL, fareDetailsUrl);
    }

    public final String getFareMessage()
    {
        return (String)onGet(Property.FARE_MESSAGE, fareMessage);
    }

    public final String getGroupDisplayName()
    {
        return (String)onGet(Property.GROUP_DISPLAY_NAME, groupDisplayName);
    }

    public final String getGroupId()
    {
        return (String)onGet(Property.GROUP_ID, groupId);
    }

    public final String getHijackSavingTagline()
    {
        return (String)onGet(Property.HIJACK_SAVING_TAGLINE, hijackSavingTagline);
    }

    public final String getHijackSharingTagline()
    {
        return (String)onGet(Property.HIJACK_SHARING_TAGLINE, hijackSharingTagline);
    }

    public final String getHijackTipTagline()
    {
        return (String)onGet(Property.HIJACK_TIP_TAGLINE, hijackTipTagline);
    }

    public final String getHijackVehicleViewId()
    {
        return (String)onGet(Property.HIJACK_VEHICLE_VIEW_ID, hijackVehicleViewId);
    }

    public final String getId()
    {
        return (String)onGet(Property.ID, id);
    }

    public final boolean getIsCashOnly()
    {
        return ((Boolean)onGet(Property.IS_CASH_ONLY, Boolean.valueOf(isCashOnly))).booleanValue();
    }

    public final boolean getIsDestinationRequired()
    {
        return ((Boolean)onGet(Property.IS_DESTINATION_REQUIRED, Boolean.valueOf(isDestinationRequired))).booleanValue();
    }

    public final boolean getIsInspecting()
    {
        return ((Boolean)onGet(Property.IS_INSPECTING, Boolean.valueOf(isInspecting))).booleanValue();
    }

    public final String getLinkedVehicleViewId()
    {
        return (String)onGet(Property.LINKED_VEHICLE_VIEW_ID, linkedVehicleViewId);
    }

    public final List getMapImages()
    {
        return (List)onGet(Property.MAP_IMAGES, mapImages);
    }

    public final int getMaxFareSplits()
    {
        return ((Integer)onGet(Property.MAX_FARE_SPLITS, Integer.valueOf(maxFareSplits))).intValue();
    }

    public final String getMinFareTitle()
    {
        return (String)onGet(Property.MIN_FARE_TITLE, minFareTitle);
    }

    public final List getMonoImages()
    {
        return (List)onGet(Property.MONO_IMAGES, monoImages);
    }

    public final String getNoneAvailableString()
    {
        return (String)onGet(Property.NONE_AVAILABLE_STRING, noneAvailableString);
    }

    public final String getParentId()
    {
        return (String)onGet(Property.PARENT_ID, parentId);
    }

    public final String getPermittedPaymentMethodsError()
    {
        return (String)onGet(Property.PERMITTED_PAYMENT_METHODS_ERROR, permittedPaymentMethodsError);
    }

    public final String getPickupButtonString()
    {
        return (String)onGet(Property.PICKUP_BUTTON_STRING, pickupButtonString);
    }

    public final String getPickupEtaString()
    {
        return (String)onGet(Property.PICKUP_ETA_STRING, pickupEtaString);
    }

    public final String getProductGroupUuid()
    {
        return (String)onGet(Property.PRODUCT_GROUP_UUID, productGroupUuid);
    }

    public final String getRequestPickupButtonString()
    {
        return (String)onGet(Property.REQUEST_PICKUP_BUTTON_STRING, requestPickupButtonString);
    }

    public final String getRidePoolOption()
    {
        return (String)onGet(Property.RIDE_POOL_OPTION, ridePoolOption);
    }

    public final String getSetPickupLocationString()
    {
        return (String)onGet(Property.SET_PICKUP_LOCATION_STRING, setPickupLocationString);
    }

    public final String getSharingTagline()
    {
        return (String)onGet(Property.SHARING_TAGLINE, sharingTagline);
    }

    final boolean getSuppressSurgeUI()
    {
        return ((Boolean)onGet(Property.SUPPRESS_SURGE_U_I, Boolean.valueOf(suppressSurgeUI))).booleanValue();
    }

    public final String getSurgeTitle()
    {
        return (String)onGet(Property.SURGE_TITLE, surgeTitle);
    }

    public final Tagline getTagline()
    {
        return (Tagline)onGet(Property.TAGLINE, tagline);
    }

    public final String getUuid()
    {
        return (String)onGet(Property.UUID, uuid);
    }

    public final int hashCode()
    {
        char c7 = '\u04CF';
        int j8 = 0;
        char c;
        char c1;
        char c2;
        char c3;
        char c4;
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
        int i5;
        int j5;
        int k5;
        int l5;
        int i6;
        int j6;
        int k6;
        int l6;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        char c5;
        char c6;
        int k8;
        int l8;
        if (allowCredits)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (allowFareEstimate)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (allowRidepool)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (isCashOnly)
        {
            c3 = '\u04CF';
        } else
        {
            c3 = '\u04D5';
        }
        if (isInspecting)
        {
            c4 = '\u04CF';
        } else
        {
            c4 = '\u04D5';
        }
        k8 = capacity;
        l8 = maxFareSplits;
        if (allowCreditsError == null)
        {
            i = 0;
        } else
        {
            i = allowCreditsError.hashCode();
        }
        if (confirmPickupButtonString == null)
        {
            j = 0;
        } else
        {
            j = confirmPickupButtonString.hashCode();
        }
        if (description == null)
        {
            k = 0;
        } else
        {
            k = description.hashCode();
        }
        if (destinationEntry == null)
        {
            l = 0;
        } else
        {
            l = destinationEntry.hashCode();
        }
        if (displayName == null)
        {
            i1 = 0;
        } else
        {
            i1 = displayName.hashCode();
        }
        if (fareDetailsUrl == null)
        {
            j1 = 0;
        } else
        {
            j1 = fareDetailsUrl.hashCode();
        }
        if (fareMessage == null)
        {
            k1 = 0;
        } else
        {
            k1 = fareMessage.hashCode();
        }
        if (groupDisplayName == null)
        {
            l1 = 0;
        } else
        {
            l1 = groupDisplayName.hashCode();
        }
        if (groupId == null)
        {
            i2 = 0;
        } else
        {
            i2 = groupId.hashCode();
        }
        if (id == null)
        {
            j2 = 0;
        } else
        {
            j2 = id.hashCode();
        }
        if (minFareTitle == null)
        {
            k2 = 0;
        } else
        {
            k2 = minFareTitle.hashCode();
        }
        if (noneAvailableString == null)
        {
            l2 = 0;
        } else
        {
            l2 = noneAvailableString.hashCode();
        }
        if (parentId == null)
        {
            i3 = 0;
        } else
        {
            i3 = parentId.hashCode();
        }
        if (permittedPaymentMethodsError == null)
        {
            j3 = 0;
        } else
        {
            j3 = permittedPaymentMethodsError.hashCode();
        }
        if (pickupButtonString == null)
        {
            k3 = 0;
        } else
        {
            k3 = pickupButtonString.hashCode();
        }
        if (pickupEtaString == null)
        {
            l3 = 0;
        } else
        {
            l3 = pickupEtaString.hashCode();
        }
        if (requestPickupButtonString == null)
        {
            i4 = 0;
        } else
        {
            i4 = requestPickupButtonString.hashCode();
        }
        if (ridePoolOption == null)
        {
            j4 = 0;
        } else
        {
            j4 = ridePoolOption.hashCode();
        }
        if (setPickupLocationString == null)
        {
            k4 = 0;
        } else
        {
            k4 = setPickupLocationString.hashCode();
        }
        if (surgeTitle == null)
        {
            l4 = 0;
        } else
        {
            l4 = surgeTitle.hashCode();
        }
        if (uuid == null)
        {
            i5 = 0;
        } else
        {
            i5 = uuid.hashCode();
        }
        if (mapImages == null)
        {
            j5 = 0;
        } else
        {
            j5 = mapImages.hashCode();
        }
        if (monoImages == null)
        {
            k5 = 0;
        } else
        {
            k5 = monoImages.hashCode();
        }
        if (fare == null)
        {
            l5 = 0;
        } else
        {
            l5 = fare.hashCode();
        }
        if (tagline == null)
        {
            i6 = 0;
        } else
        {
            i6 = tagline.hashCode();
        }
        if (capacityTagline == null)
        {
            j6 = 0;
        } else
        {
            j6 = capacityTagline.hashCode();
        }
        if (confirmationType == null)
        {
            k6 = 0;
        } else
        {
            k6 = confirmationType.hashCode();
        }
        if (linkedVehicleViewId == null)
        {
            l6 = 0;
        } else
        {
            l6 = linkedVehicleViewId.hashCode();
        }
        if (hijackVehicleViewId == null)
        {
            i7 = 0;
        } else
        {
            i7 = hijackVehicleViewId.hashCode();
        }
        if (productGroupUuid == null)
        {
            j7 = 0;
        } else
        {
            j7 = productGroupUuid.hashCode();
        }
        if (sharingTagline == null)
        {
            k7 = 0;
        } else
        {
            k7 = sharingTagline.hashCode();
        }
        if (hijackSavingTagline == null)
        {
            l7 = 0;
        } else
        {
            l7 = hijackSavingTagline.hashCode();
        }
        if (hijackSharingTagline == null)
        {
            i8 = 0;
        } else
        {
            i8 = hijackSharingTagline.hashCode();
        }
        if (hijackTipTagline != null)
        {
            j8 = hijackTipTagline.hashCode();
        }
        if (enableVehicleInventoryView)
        {
            c5 = '\u04CF';
        } else
        {
            c5 = '\u04D5';
        }
        if (isDestinationRequired)
        {
            c6 = '\u04CF';
        } else
        {
            c6 = '\u04D5';
        }
        if (!suppressSurgeUI)
        {
            c7 = '\u04D5';
        }
        return (c6 ^ (c5 ^ ((i8 ^ (l7 ^ (k7 ^ (j7 ^ (i7 ^ (l6 ^ (k6 ^ (j6 ^ (i6 ^ (l5 ^ (k5 ^ (j5 ^ (i5 ^ (l4 ^ (k4 ^ (j4 ^ (i4 ^ (l3 ^ (k3 ^ (j3 ^ (i3 ^ (l2 ^ (k2 ^ (j2 ^ (i2 ^ (l1 ^ (k1 ^ (j1 ^ (i1 ^ (l ^ (k ^ (j ^ (i ^ (((c4 ^ (c3 ^ (c2 ^ (c1 ^ (c ^ 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ k8) * 0xf4243 ^ l8) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243) * 0xf4243 ^ j8) * 0xf4243) * 0xf4243) * 0xf4243 ^ c7;
    }

    final VehicleView setAllowCredits(boolean flag)
    {
        boolean flag1 = allowCredits;
        allowCredits = ((Boolean)beforeSet(Property.ALLOW_CREDITS, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.ALLOW_CREDITS, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    final VehicleView setAllowCreditsError(String s)
    {
        String s1 = allowCreditsError;
        allowCreditsError = (String)beforeSet(Property.ALLOW_CREDITS_ERROR, s1, s);
        afterSet(Property.ALLOW_CREDITS_ERROR, s1, s);
        return this;
    }

    public final VehicleView setAllowFareEstimate(boolean flag)
    {
        boolean flag1 = allowFareEstimate;
        allowFareEstimate = ((Boolean)beforeSet(Property.ALLOW_FARE_ESTIMATE, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.ALLOW_FARE_ESTIMATE, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setAllowRidepool(boolean flag)
    {
        boolean flag1 = allowRidepool;
        allowRidepool = ((Boolean)beforeSet(Property.ALLOW_RIDEPOOL, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.ALLOW_RIDEPOOL, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setCapacity(int i)
    {
        int j = capacity;
        capacity = ((Integer)beforeSet(Property.CAPACITY, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.CAPACITY, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    public final VehicleView setCapacityTagline(String s)
    {
        String s1 = capacityTagline;
        capacityTagline = (String)beforeSet(Property.CAPACITY_TAGLINE, s1, s);
        afterSet(Property.CAPACITY_TAGLINE, s1, s);
        return this;
    }

    public final VehicleView setConfirmPickupButtonString(String s)
    {
        String s1 = confirmPickupButtonString;
        confirmPickupButtonString = (String)beforeSet(Property.CONFIRM_PICKUP_BUTTON_STRING, s1, s);
        afterSet(Property.CONFIRM_PICKUP_BUTTON_STRING, s1, s);
        return this;
    }

    public final VehicleView setConfirmationType(String s)
    {
        String s1 = confirmationType;
        confirmationType = (String)beforeSet(Property.CONFIRMATION_TYPE, s1, s);
        afterSet(Property.CONFIRMATION_TYPE, s1, s);
        return this;
    }

    public final VehicleView setDescription(String s)
    {
        String s1 = description;
        description = (String)beforeSet(Property.DESCRIPTION, s1, s);
        afterSet(Property.DESCRIPTION, s1, s);
        return this;
    }

    public final VehicleView setDestinationEntry(String s)
    {
        String s1 = destinationEntry;
        destinationEntry = (String)beforeSet(Property.DESTINATION_ENTRY, s1, s);
        afterSet(Property.DESTINATION_ENTRY, s1, s);
        return this;
    }

    final VehicleView setDisplayName(String s)
    {
        String s1 = displayName;
        displayName = (String)beforeSet(Property.DISPLAY_NAME, s1, s);
        afterSet(Property.DISPLAY_NAME, s1, s);
        return this;
    }

    public final VehicleView setEnableVehicleInventoryView(boolean flag)
    {
        boolean flag1 = enableVehicleInventoryView;
        enableVehicleInventoryView = ((Boolean)beforeSet(Property.ENABLE_VEHICLE_INVENTORY_VIEW, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.ENABLE_VEHICLE_INVENTORY_VIEW, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setFare(Fare fare1)
    {
        Fare fare2 = fare;
        fare = (Fare)beforeSet(Property.FARE, fare2, fare1);
        afterSet(Property.FARE, fare2, fare1);
        return this;
    }

    public final VehicleView setFareDetailsUrl(String s)
    {
        String s1 = fareDetailsUrl;
        fareDetailsUrl = (String)beforeSet(Property.FARE_DETAILS_URL, s1, s);
        afterSet(Property.FARE_DETAILS_URL, s1, s);
        return this;
    }

    public final VehicleView setFareMessage(String s)
    {
        String s1 = fareMessage;
        fareMessage = (String)beforeSet(Property.FARE_MESSAGE, s1, s);
        afterSet(Property.FARE_MESSAGE, s1, s);
        return this;
    }

    public final VehicleView setGroupDisplayName(String s)
    {
        String s1 = groupDisplayName;
        groupDisplayName = (String)beforeSet(Property.GROUP_DISPLAY_NAME, s1, s);
        afterSet(Property.GROUP_DISPLAY_NAME, s1, s);
        return this;
    }

    public final VehicleView setGroupId(String s)
    {
        String s1 = groupId;
        groupId = (String)beforeSet(Property.GROUP_ID, s1, s);
        afterSet(Property.GROUP_ID, s1, s);
        return this;
    }

    public final VehicleView setHijackSavingTagline(String s)
    {
        String s1 = hijackSavingTagline;
        hijackSavingTagline = (String)beforeSet(Property.HIJACK_SAVING_TAGLINE, s1, s);
        afterSet(Property.HIJACK_SAVING_TAGLINE, s1, s);
        return this;
    }

    public final VehicleView setHijackSharingTagline(String s)
    {
        String s1 = hijackSharingTagline;
        hijackSharingTagline = (String)beforeSet(Property.HIJACK_SHARING_TAGLINE, s1, s);
        afterSet(Property.HIJACK_SHARING_TAGLINE, s1, s);
        return this;
    }

    public final VehicleView setHijackTipTagline(String s)
    {
        String s1 = hijackTipTagline;
        hijackTipTagline = (String)beforeSet(Property.HIJACK_TIP_TAGLINE, s1, s);
        afterSet(Property.HIJACK_TIP_TAGLINE, s1, s);
        return this;
    }

    public final VehicleView setHijackVehicleViewId(String s)
    {
        String s1 = hijackVehicleViewId;
        hijackVehicleViewId = (String)beforeSet(Property.HIJACK_VEHICLE_VIEW_ID, s1, s);
        afterSet(Property.HIJACK_VEHICLE_VIEW_ID, s1, s);
        return this;
    }

    public final VehicleView setId(String s)
    {
        String s1 = id;
        id = (String)beforeSet(Property.ID, s1, s);
        afterSet(Property.ID, s1, s);
        return this;
    }

    public final VehicleView setIsCashOnly(boolean flag)
    {
        boolean flag1 = isCashOnly;
        isCashOnly = ((Boolean)beforeSet(Property.IS_CASH_ONLY, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.IS_CASH_ONLY, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setIsDestinationRequired(boolean flag)
    {
        boolean flag1 = isDestinationRequired;
        isDestinationRequired = ((Boolean)beforeSet(Property.IS_DESTINATION_REQUIRED, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.IS_DESTINATION_REQUIRED, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    final VehicleView setIsInspecting(boolean flag)
    {
        boolean flag1 = isInspecting;
        isInspecting = ((Boolean)beforeSet(Property.IS_INSPECTING, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.IS_INSPECTING, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setLinkedVehicleViewId(String s)
    {
        String s1 = linkedVehicleViewId;
        linkedVehicleViewId = (String)beforeSet(Property.LINKED_VEHICLE_VIEW_ID, s1, s);
        afterSet(Property.LINKED_VEHICLE_VIEW_ID, s1, s);
        return this;
    }

    public final VehicleView setMapImages(List list)
    {
        List list1 = mapImages;
        mapImages = (List)beforeSet(Property.MAP_IMAGES, list1, list);
        afterSet(Property.MAP_IMAGES, list1, list);
        return this;
    }

    public final VehicleView setMaxFareSplits(int i)
    {
        int j = maxFareSplits;
        maxFareSplits = ((Integer)beforeSet(Property.MAX_FARE_SPLITS, Integer.valueOf(j), Integer.valueOf(i))).intValue();
        afterSet(Property.MAX_FARE_SPLITS, Integer.valueOf(j), Integer.valueOf(i));
        return this;
    }

    final VehicleView setMinFareTitle(String s)
    {
        String s1 = minFareTitle;
        minFareTitle = (String)beforeSet(Property.MIN_FARE_TITLE, s1, s);
        afterSet(Property.MIN_FARE_TITLE, s1, s);
        return this;
    }

    public final VehicleView setMonoImages(List list)
    {
        List list1 = monoImages;
        monoImages = (List)beforeSet(Property.MONO_IMAGES, list1, list);
        afterSet(Property.MONO_IMAGES, list1, list);
        return this;
    }

    public final VehicleView setNoneAvailableString(String s)
    {
        String s1 = noneAvailableString;
        noneAvailableString = (String)beforeSet(Property.NONE_AVAILABLE_STRING, s1, s);
        afterSet(Property.NONE_AVAILABLE_STRING, s1, s);
        return this;
    }

    public final VehicleView setParentId(String s)
    {
        String s1 = parentId;
        parentId = (String)beforeSet(Property.PARENT_ID, s1, s);
        afterSet(Property.PARENT_ID, s1, s);
        return this;
    }

    final VehicleView setPermittedPaymentMethodsError(String s)
    {
        String s1 = permittedPaymentMethodsError;
        permittedPaymentMethodsError = (String)beforeSet(Property.PERMITTED_PAYMENT_METHODS_ERROR, s1, s);
        afterSet(Property.PERMITTED_PAYMENT_METHODS_ERROR, s1, s);
        return this;
    }

    public final VehicleView setPickupButtonString(String s)
    {
        String s1 = pickupButtonString;
        pickupButtonString = (String)beforeSet(Property.PICKUP_BUTTON_STRING, s1, s);
        afterSet(Property.PICKUP_BUTTON_STRING, s1, s);
        return this;
    }

    public final VehicleView setPickupEtaString(String s)
    {
        String s1 = pickupEtaString;
        pickupEtaString = (String)beforeSet(Property.PICKUP_ETA_STRING, s1, s);
        afterSet(Property.PICKUP_ETA_STRING, s1, s);
        return this;
    }

    public final VehicleView setProductGroupUuid(String s)
    {
        String s1 = productGroupUuid;
        productGroupUuid = (String)beforeSet(Property.PRODUCT_GROUP_UUID, s1, s);
        afterSet(Property.PRODUCT_GROUP_UUID, s1, s);
        return this;
    }

    public final VehicleView setRequestPickupButtonString(String s)
    {
        String s1 = requestPickupButtonString;
        requestPickupButtonString = (String)beforeSet(Property.REQUEST_PICKUP_BUTTON_STRING, s1, s);
        afterSet(Property.REQUEST_PICKUP_BUTTON_STRING, s1, s);
        return this;
    }

    final VehicleView setRidePoolOption(String s)
    {
        String s1 = ridePoolOption;
        ridePoolOption = (String)beforeSet(Property.RIDE_POOL_OPTION, s1, s);
        afterSet(Property.RIDE_POOL_OPTION, s1, s);
        return this;
    }

    public final VehicleView setSetPickupLocationString(String s)
    {
        String s1 = setPickupLocationString;
        setPickupLocationString = (String)beforeSet(Property.SET_PICKUP_LOCATION_STRING, s1, s);
        afterSet(Property.SET_PICKUP_LOCATION_STRING, s1, s);
        return this;
    }

    public final VehicleView setSharingTagline(String s)
    {
        String s1 = sharingTagline;
        sharingTagline = (String)beforeSet(Property.SHARING_TAGLINE, s1, s);
        afterSet(Property.SHARING_TAGLINE, s1, s);
        return this;
    }

    public final VehicleView setSuppressSurgeUI(boolean flag)
    {
        boolean flag1 = suppressSurgeUI;
        suppressSurgeUI = ((Boolean)beforeSet(Property.SUPPRESS_SURGE_U_I, Boolean.valueOf(flag1), Boolean.valueOf(flag))).booleanValue();
        afterSet(Property.SUPPRESS_SURGE_U_I, Boolean.valueOf(flag1), Boolean.valueOf(flag));
        return this;
    }

    public final VehicleView setSurgeTitle(String s)
    {
        String s1 = surgeTitle;
        surgeTitle = (String)beforeSet(Property.SURGE_TITLE, s1, s);
        afterSet(Property.SURGE_TITLE, s1, s);
        return this;
    }

    public final VehicleView setTagline(Tagline tagline1)
    {
        Tagline tagline2 = tagline;
        tagline = (Tagline)beforeSet(Property.TAGLINE, tagline2, tagline1);
        afterSet(Property.TAGLINE, tagline2, tagline1);
        return this;
    }

    public final VehicleView setUuid(String s)
    {
        String s1 = uuid;
        uuid = (String)beforeSet(Property.UUID, s1, s);
        afterSet(Property.UUID, s1, s);
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("com.ubercab.client.core.model.vehicleview.VehicleView{allowCredits=")).append(allowCredits).append(", allowFareEstimate=").append(allowFareEstimate).append(", allowRidepool=").append(allowRidepool).append(", isCashOnly=").append(isCashOnly).append(", isInspecting=").append(isInspecting).append(", capacity=").append(capacity).append(", maxFareSplits=").append(maxFareSplits).append(", allowCreditsError=").append(allowCreditsError).append(", confirmPickupButtonString=").append(confirmPickupButtonString).append(", description=").append(description).append(", destinationEntry=").append(destinationEntry).append(", displayName=").append(displayName).append(", fareDetailsUrl=").append(fareDetailsUrl).append(", fareMessage=").append(fareMessage).append(", groupDisplayName=").append(groupDisplayName).append(", groupId=").append(groupId).append(", id=").append(id).append(", minFareTitle=").append(minFareTitle).append(", noneAvailableString=").append(noneAvailableString).append(", parentId=").append(parentId).append(", permittedPaymentMethodsError=").append(permittedPaymentMethodsError).append(", pickupButtonString=").append(pickupButtonString).append(", pickupEtaString=").append(pickupEtaString).append(", requestPickupButtonString=").append(requestPickupButtonString).append(", ridePoolOption=").append(ridePoolOption).append(", setPickupLocationString=").append(setPickupLocationString).append(", surgeTitle=").append(surgeTitle).append(", uuid=").append(uuid).append(", mapImages=").append(mapImages).append(", monoImages=").append(monoImages).append(", fare=").append(fare).append(", tagline=").append(tagline).append(", capacityTagline=").append(capacityTagline).append(", confirmationType=").append(confirmationType).append(", linkedVehicleViewId=").append(linkedVehicleViewId).append(", hijackVehicleViewId=").append(hijackVehicleViewId).append(", productGroupUuid=").append(productGroupUuid).append(", sharingTagline=").append(sharingTagline).append(", hijackSavingTagline=").append(hijackSavingTagline).append(", hijackSharingTagline=").append(hijackSharingTagline).append(", hijackTipTagline=").append(hijackTipTagline).append(", enableVehicleInventoryView=").append(enableVehicleInventoryView).append(", isDestinationRequired=").append(isDestinationRequired).append(", suppressSurgeUI=").append(suppressSurgeUI).append("}").toString();
    }

    static 
    {
        SHAPE_PROPERTIES = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Property[] {
            Property.ALLOW_CREDITS, Property.ALLOW_FARE_ESTIMATE, Property.ALLOW_RIDEPOOL, Property.IS_CASH_ONLY, Property.IS_INSPECTING, Property.CAPACITY, Property.MAX_FARE_SPLITS, Property.ALLOW_CREDITS_ERROR, Property.CONFIRM_PICKUP_BUTTON_STRING, Property.DESCRIPTION, 
            Property.DESTINATION_ENTRY, Property.DISPLAY_NAME, Property.FARE_DETAILS_URL, Property.FARE_MESSAGE, Property.GROUP_DISPLAY_NAME, Property.GROUP_ID, Property.ID, Property.MIN_FARE_TITLE, Property.NONE_AVAILABLE_STRING, Property.PARENT_ID, 
            Property.PERMITTED_PAYMENT_METHODS_ERROR, Property.PICKUP_BUTTON_STRING, Property.PICKUP_ETA_STRING, Property.REQUEST_PICKUP_BUTTON_STRING, Property.RIDE_POOL_OPTION, Property.SET_PICKUP_LOCATION_STRING, Property.SURGE_TITLE, Property.UUID, Property.MAP_IMAGES, Property.MONO_IMAGES, 
            Property.FARE, Property.TAGLINE, Property.CAPACITY_TAGLINE, Property.CONFIRMATION_TYPE, Property.LINKED_VEHICLE_VIEW_ID, Property.HIJACK_VEHICLE_VIEW_ID, Property.PRODUCT_GROUP_UUID, Property.SHARING_TAGLINE, Property.HIJACK_SAVING_TAGLINE, Property.HIJACK_SHARING_TAGLINE, 
            Property.HIJACK_TIP_TAGLINE, Property.ENABLE_VEHICLE_INVENTORY_VIEW, Property.IS_DESTINATION_REQUIRED, Property.SUPPRESS_SURGE_U_I
        })));
    }

    private class Property extends Enum
        implements hny
    {

        private static final Property $VALUES[];
        public static final Property ALLOW_CREDITS;
        public static final Property ALLOW_CREDITS_ERROR;
        public static final Property ALLOW_FARE_ESTIMATE;
        public static final Property ALLOW_RIDEPOOL;
        public static final Property CAPACITY;
        public static final Property CAPACITY_TAGLINE;
        public static final Property CONFIRMATION_TYPE;
        public static final Property CONFIRM_PICKUP_BUTTON_STRING;
        public static final Property DESCRIPTION;
        public static final Property DESTINATION_ENTRY;
        public static final Property DISPLAY_NAME;
        public static final Property ENABLE_VEHICLE_INVENTORY_VIEW;
        public static final Property FARE;
        public static final Property FARE_DETAILS_URL;
        public static final Property FARE_MESSAGE;
        public static final Property GROUP_DISPLAY_NAME;
        public static final Property GROUP_ID;
        public static final Property HIJACK_SAVING_TAGLINE;
        public static final Property HIJACK_SHARING_TAGLINE;
        public static final Property HIJACK_TIP_TAGLINE;
        public static final Property HIJACK_VEHICLE_VIEW_ID;
        public static final Property ID;
        public static final Property IS_CASH_ONLY;
        public static final Property IS_DESTINATION_REQUIRED;
        public static final Property IS_INSPECTING;
        public static final Property LINKED_VEHICLE_VIEW_ID;
        public static final Property MAP_IMAGES;
        public static final Property MAX_FARE_SPLITS;
        public static final Property MIN_FARE_TITLE;
        public static final Property MONO_IMAGES;
        public static final Property NONE_AVAILABLE_STRING;
        public static final Property PARENT_ID;
        public static final Property PERMITTED_PAYMENT_METHODS_ERROR;
        public static final Property PICKUP_BUTTON_STRING;
        public static final Property PICKUP_ETA_STRING;
        public static final Property PRODUCT_GROUP_UUID;
        public static final Property REQUEST_PICKUP_BUTTON_STRING;
        public static final Property RIDE_POOL_OPTION;
        public static final Property SET_PICKUP_LOCATION_STRING;
        public static final Property SHARING_TAGLINE;
        public static final Property SUPPRESS_SURGE_U_I;
        public static final Property SURGE_TITLE;
        public static final Property TAGLINE;
        public static final Property UUID;

        public static Property valueOf(String s)
        {
            return (Property)Enum.valueOf(com/ubercab/client/core/model/vehicleview/Shape_VehicleView$Property, s);
        }

        public static Property[] values()
        {
            return (Property[])$VALUES.clone();
        }

        static 
        {
            ALLOW_CREDITS = new Property("ALLOW_CREDITS", 0) {

                public final String toString()
                {
                    return "allowCredits";
                }

            };
            ALLOW_FARE_ESTIMATE = new Property("ALLOW_FARE_ESTIMATE", 1) {

                public final String toString()
                {
                    return "allowFareEstimate";
                }

            };
            ALLOW_RIDEPOOL = new Property("ALLOW_RIDEPOOL", 2) {

                public final String toString()
                {
                    return "allowRidepool";
                }

            };
            IS_CASH_ONLY = new Property("IS_CASH_ONLY", 3) {

                public final String toString()
                {
                    return "isCashOnly";
                }

            };
            IS_INSPECTING = new Property("IS_INSPECTING", 4) {

                public final String toString()
                {
                    return "isInspecting";
                }

            };
            CAPACITY = new Property("CAPACITY", 5) {

                public final String toString()
                {
                    return "capacity";
                }

            };
            MAX_FARE_SPLITS = new Property("MAX_FARE_SPLITS", 6) {

                public final String toString()
                {
                    return "maxFareSplits";
                }

            };
            ALLOW_CREDITS_ERROR = new Property("ALLOW_CREDITS_ERROR", 7) {

                public final String toString()
                {
                    return "allowCreditsError";
                }

            };
            CONFIRM_PICKUP_BUTTON_STRING = new Property("CONFIRM_PICKUP_BUTTON_STRING", 8) {

                public final String toString()
                {
                    return "confirmPickupButtonString";
                }

            };
            DESCRIPTION = new Property("DESCRIPTION", 9) {

                public final String toString()
                {
                    return "description";
                }

            };
            DESTINATION_ENTRY = new Property("DESTINATION_ENTRY", 10) {

                public final String toString()
                {
                    return "destinationEntry";
                }

            };
            DISPLAY_NAME = new Property("DISPLAY_NAME", 11) {

                public final String toString()
                {
                    return "displayName";
                }

            };
            FARE_DETAILS_URL = new Property("FARE_DETAILS_URL", 12) {

                public final String toString()
                {
                    return "fareDetailsUrl";
                }

            };
            FARE_MESSAGE = new Property("FARE_MESSAGE", 13) {

                public final String toString()
                {
                    return "fareMessage";
                }

            };
            GROUP_DISPLAY_NAME = new Property("GROUP_DISPLAY_NAME", 14) {

                public final String toString()
                {
                    return "groupDisplayName";
                }

            };
            GROUP_ID = new Property("GROUP_ID", 15) {

                public final String toString()
                {
                    return "groupId";
                }

            };
            ID = new Property("ID", 16) {

                public final String toString()
                {
                    return "id";
                }

            };
            MIN_FARE_TITLE = new Property("MIN_FARE_TITLE", 17) {

                public final String toString()
                {
                    return "minFareTitle";
                }

            };
            NONE_AVAILABLE_STRING = new Property("NONE_AVAILABLE_STRING", 18) {

                public final String toString()
                {
                    return "noneAvailableString";
                }

            };
            PARENT_ID = new Property("PARENT_ID", 19) {

                public final String toString()
                {
                    return "parentId";
                }

            };
            PERMITTED_PAYMENT_METHODS_ERROR = new Property("PERMITTED_PAYMENT_METHODS_ERROR", 20) {

                public final String toString()
                {
                    return "permittedPaymentMethodsError";
                }

            };
            PICKUP_BUTTON_STRING = new Property("PICKUP_BUTTON_STRING", 21) {

                public final String toString()
                {
                    return "pickupButtonString";
                }

            };
            PICKUP_ETA_STRING = new Property("PICKUP_ETA_STRING", 22) {

                public final String toString()
                {
                    return "pickupEtaString";
                }

            };
            REQUEST_PICKUP_BUTTON_STRING = new Property("REQUEST_PICKUP_BUTTON_STRING", 23) {

                public final String toString()
                {
                    return "requestPickupButtonString";
                }

            };
            RIDE_POOL_OPTION = new Property("RIDE_POOL_OPTION", 24) {

                public final String toString()
                {
                    return "ridePoolOption";
                }

            };
            SET_PICKUP_LOCATION_STRING = new Property("SET_PICKUP_LOCATION_STRING", 25) {

                public final String toString()
                {
                    return "setPickupLocationString";
                }

            };
            SURGE_TITLE = new Property("SURGE_TITLE", 26) {

                public final String toString()
                {
                    return "surgeTitle";
                }

            };
            UUID = new Property("UUID", 27) {

                public final String toString()
                {
                    return "uuid";
                }

            };
            MAP_IMAGES = new Property("MAP_IMAGES", 28) {

                public final String toString()
                {
                    return "mapImages";
                }

            };
            MONO_IMAGES = new Property("MONO_IMAGES", 29) {

                public final String toString()
                {
                    return "monoImages";
                }

            };
            FARE = new Property("FARE", 30) {

                public final String toString()
                {
                    return "fare";
                }

            };
            TAGLINE = new Property("TAGLINE", 31) {

                public final String toString()
                {
                    return "tagline";
                }

            };
            CAPACITY_TAGLINE = new Property("CAPACITY_TAGLINE", 32) {

                public final String toString()
                {
                    return "capacityTagline";
                }

            };
            CONFIRMATION_TYPE = new Property("CONFIRMATION_TYPE", 33) {

                public final String toString()
                {
                    return "confirmationType";
                }

            };
            LINKED_VEHICLE_VIEW_ID = new Property("LINKED_VEHICLE_VIEW_ID", 34) {

                public final String toString()
                {
                    return "linkedVehicleViewId";
                }

            };
            HIJACK_VEHICLE_VIEW_ID = new Property("HIJACK_VEHICLE_VIEW_ID", 35) {

                public final String toString()
                {
                    return "hijackVehicleViewId";
                }

            };
            PRODUCT_GROUP_UUID = new Property("PRODUCT_GROUP_UUID", 36) {

                public final String toString()
                {
                    return "productGroupUuid";
                }

            };
            SHARING_TAGLINE = new Property("SHARING_TAGLINE", 37) {

                public final String toString()
                {
                    return "sharingTagline";
                }

            };
            HIJACK_SAVING_TAGLINE = new Property("HIJACK_SAVING_TAGLINE", 38) {

                public final String toString()
                {
                    return "hijackSavingTagline";
                }

            };
            HIJACK_SHARING_TAGLINE = new Property("HIJACK_SHARING_TAGLINE", 39) {

                public final String toString()
                {
                    return "hijackSharingTagline";
                }

            };
            HIJACK_TIP_TAGLINE = new Property("HIJACK_TIP_TAGLINE", 40) {

                public final String toString()
                {
                    return "hijackTipTagline";
                }

            };
            ENABLE_VEHICLE_INVENTORY_VIEW = new Property("ENABLE_VEHICLE_INVENTORY_VIEW", 41) {

                public final String toString()
                {
                    return "enableVehicleInventoryView";
                }

            };
            IS_DESTINATION_REQUIRED = new Property("IS_DESTINATION_REQUIRED", 42) {

                public final String toString()
                {
                    return "isDestinationRequired";
                }

            };
            SUPPRESS_SURGE_U_I = new Property("SUPPRESS_SURGE_U_I", 43) {

                public final String toString()
                {
                    return "suppressSurgeUI";
                }

            };
            $VALUES = (new Property[] {
                ALLOW_CREDITS, ALLOW_FARE_ESTIMATE, ALLOW_RIDEPOOL, IS_CASH_ONLY, IS_INSPECTING, CAPACITY, MAX_FARE_SPLITS, ALLOW_CREDITS_ERROR, CONFIRM_PICKUP_BUTTON_STRING, DESCRIPTION, 
                DESTINATION_ENTRY, DISPLAY_NAME, FARE_DETAILS_URL, FARE_MESSAGE, GROUP_DISPLAY_NAME, GROUP_ID, ID, MIN_FARE_TITLE, NONE_AVAILABLE_STRING, PARENT_ID, 
                PERMITTED_PAYMENT_METHODS_ERROR, PICKUP_BUTTON_STRING, PICKUP_ETA_STRING, REQUEST_PICKUP_BUTTON_STRING, RIDE_POOL_OPTION, SET_PICKUP_LOCATION_STRING, SURGE_TITLE, UUID, MAP_IMAGES, MONO_IMAGES, 
                FARE, TAGLINE, CAPACITY_TAGLINE, CONFIRMATION_TYPE, LINKED_VEHICLE_VIEW_ID, HIJACK_VEHICLE_VIEW_ID, PRODUCT_GROUP_UUID, SHARING_TAGLINE, HIJACK_SAVING_TAGLINE, HIJACK_SHARING_TAGLINE, 
                HIJACK_TIP_TAGLINE, ENABLE_VEHICLE_INVENTORY_VIEW, IS_DESTINATION_REQUIRED, SUPPRESS_SURGE_U_I
            });
        }

        private Property(String s, int i)
        {
            super(s, i);
        }

    }

}
