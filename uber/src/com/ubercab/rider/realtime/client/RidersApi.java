// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.client;

import com.ubercab.rider.realtime.request.body.AcceptFareSplitBody;
import com.ubercab.rider.realtime.request.body.AddExpenseInfoBody;
import com.ubercab.rider.realtime.request.body.DisableEmergencyBody;
import com.ubercab.rider.realtime.request.body.EmptyBody;
import com.ubercab.rider.realtime.request.body.EnableEmergencyBody;
import com.ubercab.rider.realtime.request.body.FareEstimateBody;
import com.ubercab.rider.realtime.request.body.FareSplitInvitationBody;
import com.ubercab.rider.realtime.request.body.FareSplitUninviteBody;
import com.ubercab.rider.realtime.request.body.PickupBody;
import com.ubercab.rider.realtime.request.body.ScheduleSurgeDropBody;
import com.ubercab.rider.realtime.request.body.SelectPaymentProfileBody;
import com.ubercab.rider.realtime.request.body.SelectProfileBody;
import com.ubercab.rider.realtime.request.body.StatusBody;
import com.ubercab.rider.realtime.request.body.UseCreditsBody;
import ica;

public interface RidersApi
{

    public abstract ica getDispatchView();

    public abstract ica getSignature(String s);

    public abstract ica getUnexpiredAndValidPromotions(String s);

    public abstract ica postAcceptFareSplit(AcceptFareSplitBody acceptfaresplitbody);

    public abstract ica postAddExpenseInfo(AddExpenseInfoBody addexpenseinfobody);

    public abstract ica postDeclineFareSplit(EmptyBody emptybody);

    public abstract ica postEnableEmergency(String s, EnableEmergencyBody enableemergencybody);

    public abstract ica postFareEstimate(FareEstimateBody fareestimatebody);

    public abstract ica postInviteFareSplit(FareSplitInvitationBody faresplitinvitationbody);

    public abstract ica postPickup(PickupBody pickupbody);

    public abstract ica postScheduleSurgeDrop(ScheduleSurgeDropBody schedulesurgedropbody);

    public abstract ica postSelectPaymentProfile(SelectPaymentProfileBody selectpaymentprofilebody);

    public abstract ica postSelectProfile(SelectProfileBody selectprofilebody);

    public abstract ica postSetUseCredits(UseCreditsBody usecreditsbody);

    public abstract ica postStatus(StatusBody statusbody);

    public abstract ica postUninviteFareSplit(FareSplitUninviteBody faresplituninvitebody);

    public abstract ica putDisableEmergency(String s, DisableEmergencyBody disableemergencybody);
}
