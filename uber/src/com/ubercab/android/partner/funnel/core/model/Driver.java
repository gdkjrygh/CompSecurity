// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.core.model;

import android.os.Parcelable;
import hnx;
import hny;

// Referenced classes of package com.ubercab.android.partner.funnel.core.model:
//            Shape_Driver, Partner

public abstract class Driver extends hnx
    implements Parcelable
{

    public static final String FLOWTYPE_COMMUTE = "commute";
    public static final String STATUS_ACCEPTED = "accepted";
    public static final String STATUS_ARRIVED = "arrived";
    public static final String STATUS_DISPATCHED = "dispatched";
    public static final String STATUS_OFFLINE = "offDuty";
    public static final String STATUS_ON_TRIP = "onTrip";
    public static final String STATUS_OPEN = "open";

    public Driver()
    {
    }

    public static Driver create()
    {
        return new Shape_Driver();
    }

    protected Object beforeSet(hny hny, Object obj, Object obj1)
    {
        _cls1..SwitchMap.com.ubercab.android.partner.funnel.core.model.Shape_Driver.Property[((Shape_Driver.Property)hny).ordinal()];
        JVM INSTR tableswitch 1 1: default 28
    //                   1 30;
           goto _L1 _L2
_L1:
        return obj1;
_L2:
        if (!"accepted".equals(hny = (String)obj1) && !"arrived".equals(hny) && !"dispatched".equals(hny) && !"offDuty".equals(hny) && !"onTrip".equals(hny) && !"open".equals(hny))
        {
            throw new IllegalArgumentException((new StringBuilder("Invalid Status: ")).append(hny).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public String getDisplayName()
    {
        return getFirstName();
    }

    public abstract String getDriverStatus();

    public abstract String getFirstName();

    public abstract boolean getIsAdmin();

    public abstract boolean getIsByod();

    public abstract String getLastName();

    public abstract Partner getPartner();

    public abstract String getPartnerFlowType();

    public abstract String getPictureUrl();

    public abstract String getRating();

    public abstract String getReasonForStateChangeMessage();

    public abstract String getReferralCode();

    public abstract String getReferralUrl();

    public abstract String getStatus();

    public abstract String getToken();

    public abstract String getUuid();

    public boolean isActive()
    {
        return "accepted".equals(getStatus()) || "arrived".equals(getStatus()) || isOnTrip();
    }

    public boolean isAdmin()
    {
        return getIsAdmin();
    }

    public boolean isByod()
    {
        return getIsByod();
    }

    public boolean isCommuteDriver()
    {
        return "commute".equalsIgnoreCase(getPartnerFlowType()) || getPartner() != null && "commute".equalsIgnoreCase(getPartner().getFlowType());
    }

    public boolean isInactive()
    {
        return !isActive();
    }

    public boolean isOffDuty()
    {
        return !isOnDuty();
    }

    public boolean isOnDuty()
    {
        return !"offDuty".equals(getStatus());
    }

    public boolean isOnTrip()
    {
        return "onTrip".equals(getStatus());
    }

    abstract Driver setDriverStatus(String s);

    public abstract Driver setFirstName(String s);

    abstract Driver setIsAdmin(boolean flag);

    public abstract Driver setIsByod(boolean flag);

    public abstract Driver setLastName(String s);

    abstract Driver setPartner(Partner partner);

    abstract Driver setPartnerFlowType(String s);

    abstract Driver setPictureUrl(String s);

    abstract Driver setRating(String s);

    abstract Driver setReasonForStateChangeMessage(String s);

    abstract Driver setReferralCode(String s);

    abstract Driver setReferralUrl(String s);

    public abstract Driver setStatus(String s);

    abstract Driver setToken(String s);

    public abstract Driver setUuid(String s);

    /* member class not found */
    class _cls1 {}

}
