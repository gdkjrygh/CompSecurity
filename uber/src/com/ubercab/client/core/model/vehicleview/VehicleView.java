// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model.vehicleview;

import android.text.TextUtils;
import com.ubercab.client.core.model.surge.Surge;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Fare;
import com.ubercab.rider.realtime.model.Tagline;
import hnx;
import hny;
import java.util.List;

// Referenced classes of package com.ubercab.client.core.model.vehicleview:
//            Shape_VehicleView

public abstract class VehicleView extends hnx
    implements com.ubercab.rider.realtime.model.VehicleView
{

    public static final String CONFIRMATION_TYPE_FARE_ESTIMATE_TAGLINE = "FareEstimateTagline";
    public static final float DEFAULT_MULTIPLIER = 1F;
    Surge surge;

    public VehicleView()
    {
    }

    public static VehicleView create(String s)
    {
        return (new Shape_VehicleView()).setId(s);
    }

    public abstract boolean getAllowCredits();

    public abstract String getAllowCreditsError();

    public abstract boolean getAllowFareEstimate();

    public abstract boolean getAllowRidepool();

    public boolean getAllowedToSurge()
    {
        return !getSuppressSurgeUI();
    }

    public abstract int getCapacity();

    public abstract String getCapacityTagline();

    public abstract String getConfirmPickupButtonString();

    public abstract String getConfirmationType();

    public abstract String getDescription();

    public abstract String getDestinationEntry();

    public abstract String getDisplayName();

    public abstract boolean getEnableVehicleInventoryView();

    public abstract Fare getFare();

    public abstract String getFareDetailsUrl();

    public abstract String getFareMessage();

    public abstract String getGroupDisplayName();

    public abstract String getGroupId();

    public abstract String getHijackSavingTagline();

    public abstract String getHijackSharingTagline();

    public abstract String getHijackTipTagline();

    public abstract String getHijackVehicleViewId();

    public abstract String getId();

    public abstract boolean getIsCashOnly();

    public abstract boolean getIsDestinationRequired();

    public abstract boolean getIsInspecting();

    public abstract String getLinkedVehicleViewId();

    public abstract List getMapImages();

    public abstract int getMaxFareSplits();

    public abstract String getMinFareTitle();

    public abstract List getMonoImages();

    public abstract String getNoneAvailableString();

    public abstract String getParentId();

    public abstract String getPermittedPaymentMethodsError();

    public abstract String getPickupButtonString();

    public abstract String getPickupEtaString();

    public abstract String getProductGroupUuid();

    public abstract String getRequestPickupButtonString();

    public abstract String getRidePoolOption();

    public abstract String getSetPickupLocationString();

    public abstract String getSharingTagline();

    abstract boolean getSuppressSurgeUI();

    public DynamicFare getSurge()
    {
        if (surge == null)
        {
            surge = Surge.create();
        }
        return surge;
    }

    public abstract String getSurgeTitle();

    public abstract Tagline getTagline();

    public abstract String getUuid();

    public boolean isDestinationEnabled()
    {
        return !"hidden".equals(getDestinationEntry());
    }

    public boolean isDestinationPreferred()
    {
        return "preferred".equals(getDestinationEntry());
    }

    public boolean isDestinationRequired()
    {
        return "requiredNotEditable".equals(getDestinationEntry());
    }

    public boolean isEnableVehicleInventoryView()
    {
        return getEnableVehicleInventoryView();
    }

    boolean isSurging()
    {
        return getSurge() != null && getSurge().getMultiplier() > 1.0F;
    }

    protected Object onGet(hny hny, Object obj)
    {
        if (obj == null || (obj instanceof String)) goto _L2; else goto _L1
_L1:
        return obj;
_L2:
        class _cls1
        {

            static final int $SwitchMap$com$ubercab$client$core$model$vehicleview$Shape_VehicleView$Property[];

            static 
            {
                $SwitchMap$com$ubercab$client$core$model$vehicleview$Shape_VehicleView$Property = new int[Shape_VehicleView.Property.values().length];
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$vehicleview$Shape_VehicleView$Property[Shape_VehicleView.Property.DESTINATION_ENTRY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$ubercab$client$core$model$vehicleview$Shape_VehicleView$Property[Shape_VehicleView.Property.SUPPRESS_SURGE_U_I.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.ubercab.client.core.model.vehicleview.Shape_VehicleView.Property[((Shape_VehicleView.Property)hny).ordinal()])
        {
        default:
            return obj;

        case 1: // '\001'
            hny = (String)obj;
            obj = hny;
            if (TextUtils.isEmpty(hny))
            {
                if (getIsDestinationRequired())
                {
                    return "requiredNotEditable";
                } else
                {
                    return "optional";
                }
            }
            break;

        case 2: // '\002'
            return Boolean.valueOf(false);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    abstract VehicleView setAllowCredits(boolean flag);

    abstract VehicleView setAllowCreditsError(String s);

    public abstract VehicleView setAllowFareEstimate(boolean flag);

    public abstract VehicleView setAllowRidepool(boolean flag);

    VehicleView setAllowedToSurge(boolean flag)
    {
        setSuppressSurgeUI(flag);
        return this;
    }

    public abstract VehicleView setCapacity(int i);

    public abstract VehicleView setCapacityTagline(String s);

    public abstract VehicleView setConfirmPickupButtonString(String s);

    public abstract VehicleView setConfirmationType(String s);

    public abstract VehicleView setDescription(String s);

    public abstract VehicleView setDestinationEntry(String s);

    abstract VehicleView setDisplayName(String s);

    public abstract VehicleView setEnableVehicleInventoryView(boolean flag);

    public abstract VehicleView setFare(Fare fare);

    public abstract VehicleView setFareDetailsUrl(String s);

    public abstract VehicleView setFareMessage(String s);

    public abstract VehicleView setGroupDisplayName(String s);

    public abstract VehicleView setGroupId(String s);

    public abstract VehicleView setHijackSavingTagline(String s);

    public abstract VehicleView setHijackSharingTagline(String s);

    public abstract VehicleView setHijackTipTagline(String s);

    public abstract VehicleView setHijackVehicleViewId(String s);

    public abstract VehicleView setId(String s);

    public abstract VehicleView setIsCashOnly(boolean flag);

    public abstract VehicleView setIsDestinationRequired(boolean flag);

    abstract VehicleView setIsInspecting(boolean flag);

    public abstract VehicleView setLinkedVehicleViewId(String s);

    public abstract VehicleView setMapImages(List list);

    public abstract VehicleView setMaxFareSplits(int i);

    abstract VehicleView setMinFareTitle(String s);

    public abstract VehicleView setMonoImages(List list);

    public abstract VehicleView setNoneAvailableString(String s);

    public abstract VehicleView setParentId(String s);

    abstract VehicleView setPermittedPaymentMethodsError(String s);

    public abstract VehicleView setPickupButtonString(String s);

    public abstract VehicleView setPickupEtaString(String s);

    public abstract VehicleView setProductGroupUuid(String s);

    public abstract VehicleView setRequestPickupButtonString(String s);

    abstract VehicleView setRidePoolOption(String s);

    public abstract VehicleView setSetPickupLocationString(String s);

    public abstract VehicleView setSharingTagline(String s);

    public abstract VehicleView setSuppressSurgeUI(boolean flag);

    public VehicleView setSurge(Surge surge1)
    {
        surge = surge1;
        return this;
    }

    public abstract VehicleView setSurgeTitle(String s);

    public abstract VehicleView setTagline(Tagline tagline);

    public abstract VehicleView setUuid(String s);
}
