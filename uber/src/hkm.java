// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.client.RidersApi;
import com.ubercab.rider.realtime.model.FareInfo;
import com.ubercab.rider.realtime.model.Location;
import com.ubercab.rider.realtime.model.Profile;
import com.ubercab.rider.realtime.model.TripExpenseInfo;
import com.ubercab.rider.realtime.model.UpfrontFare;
import com.ubercab.rider.realtime.request.body.AcceptFareSplitBody;
import com.ubercab.rider.realtime.request.body.AddExpenseInfoBody;
import com.ubercab.rider.realtime.request.body.DisableEmergencyBody;
import com.ubercab.rider.realtime.request.body.DynamicPickup;
import com.ubercab.rider.realtime.request.body.EnableEmergencyBody;
import com.ubercab.rider.realtime.request.body.ExtraPaymentData;
import com.ubercab.rider.realtime.request.body.FareEstimateBody;
import com.ubercab.rider.realtime.request.body.FareSplitInvitationBody;
import com.ubercab.rider.realtime.request.body.FareSplitUninviteBody;
import com.ubercab.rider.realtime.request.body.PickupBody;
import com.ubercab.rider.realtime.request.body.ScheduleSurgeDropBody;
import com.ubercab.rider.realtime.request.body.SelectPaymentProfileBody;
import com.ubercab.rider.realtime.request.body.SelectProfileBody;
import com.ubercab.rider.realtime.request.body.ShoppingCart;
import com.ubercab.rider.realtime.request.body.UseCreditsBody;
import com.ubercab.rider.realtime.request.param.DeviceData;
import com.ubercab.rider.realtime.request.param.Note;
import java.util.List;

public final class hkm
{

    private final hjo a;

    private hkm(hjo hjo1)
    {
        a = hjo1;
    }

    public static hkm a(hjo hjo1)
    {
        return new hkm(hjo1);
    }

    public final ica a()
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls12()).b().a(new _cls1());
    }

    public final ica a(int i, Location location, Location location1, Long long1, UpfrontFare upfrontfare, String s, String s1, 
            Profile profile, Boolean boolean1, Boolean boolean2, Boolean boolean3, TripExpenseInfo tripexpenseinfo, Integer integer, Note note, 
            List list, Boolean boolean4, DeviceData devicedata)
    {
        location = PickupBody.create(i, location).setFareId(long1).setPaymentProfileUUID(s).setUpfrontFare(upfrontfare).setUseCredits(boolean1).setIsGoogleWalletRequest(boolean2).setCapacity(integer).setNote(note).setDeviceData(devicedata);
        if (boolean4 != null)
        {
            location.setDynamicPickup(DynamicPickup.create(boolean4.booleanValue()));
        }
        if (location1 != null)
        {
            location.setDestination(com.ubercab.rider.realtime.request.param.Location.create(location1.getLatitude(), location1.getLongitude()));
        }
        if (profile != null)
        {
            location.setProfileUUID(profile.getUuid());
            location.setProfileType(profile.getType());
        }
        location1 = ExtraPaymentData.create();
        if (s1 != null && !s1.isEmpty())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            location1.setPaymentProfileUuid(s);
            location1.setPayPalCorrelationId(s1);
            location.setExtraPaymentData(location1);
        }
        if (boolean3 != null)
        {
            location1.setUseAmexReward(boolean3);
            location.setExtraPaymentData(location1);
        }
        if (tripexpenseinfo != null)
        {
            location.setExpenseInfo(AddExpenseInfoBody.create().setCode(tripexpenseinfo.getCode()).setExpenseTrip(Boolean.valueOf(tripexpenseinfo.isExpenseTrip())).setMemo(tripexpenseinfo.getMemo()));
        }
        if (list != null && !list.isEmpty())
        {
            location.setShoppingCart(ShoppingCart.create(list));
        }
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls6(location)).b().a(new _cls5());
    }

    public final ica a(int i, com.ubercab.rider.realtime.request.param.Location location, com.ubercab.rider.realtime.request.param.Location location1, Integer integer, FareInfo fareinfo)
    {
        location = FareEstimateBody.create(i, location, location1).setCapacity(integer).setFareInfo(fareinfo);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls2(location)).a();
    }

    public final ica a(long l, int i, Location location)
    {
        location = ScheduleSurgeDropBody.create().setFareId(l).setVehicleViewId(i).setPickupLocation(com.ubercab.rider.realtime.request.param.Location.create(location.getLatitude(), location.getLongitude()));
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls7(location)).b().a();
    }

    public final ica a(com.ubercab.rider.realtime.request.param.Location location, hjm hjm)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls17(location, hjm)).c().a(new _cls16()).b(new _cls15(hjm, location));
    }

    public final ica a(String s)
    {
        s = FareSplitUninviteBody.create().setInvitee(s);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls19(s)).b().a(new _cls18());
    }

    public final ica a(String s, Long long1)
    {
        long1 = DisableEmergencyBody.create().setCreatedAt(long1);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls20(s, long1)).a();
    }

    public final ica a(String s, String s1)
    {
        AcceptFareSplitBody acceptfaresplitbody = AcceptFareSplitBody.create().setPaymentProfileId(s).setUseCredits(true);
        if (!s.isEmpty() && s1 != null && !s1.isEmpty())
        {
            acceptfaresplitbody.setExtraPaymentData(ExtraPaymentData.create().setPaymentProfileUuid(s).setPayPalCorrelationId(s1));
        }
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls24(acceptfaresplitbody)).b().a(new _cls23());
    }

    public final ica a(String s, String s1, String s2, String s3, String s4, Double double1, Double double2, 
            Long long1)
    {
        s1 = EnableEmergencyBody.create().setTripUuid(s1).setRiderName(s2).setDriverName(s3).setDriverId(s4).setLatitude(double1).setLongitude(double2).setCreatedAt(long1);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls21(s, s1)).a();
    }

    public final ica a(String s, boolean flag, String s1)
    {
        SelectPaymentProfileBody selectpaymentprofilebody = SelectPaymentProfileBody.create().setPaymentProfileUUID(s).setIsGoogleWalletRequest(flag);
        if (s1 != null && !s1.isEmpty())
        {
            selectpaymentprofilebody.setExtraPaymentData(ExtraPaymentData.create().setPaymentProfileUuid(s).setPayPalCorrelationId(s1));
        }
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls9(selectpaymentprofilebody)).b().a(new _cls8());
    }

    public final ica a(List list)
    {
        list = FareSplitInvitationBody.create().setInvitees(list);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls4(list)).b().a(new _cls3());
    }

    public final ica a(boolean flag)
    {
        UseCreditsBody usecreditsbody = UseCreditsBody.create().setUseCredits(flag);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls14(usecreditsbody)).b().a(new _cls13());
    }

    public final ica a(boolean flag, String s, String s1)
    {
        s = AddExpenseInfoBody.create().setExpenseTrip(Boolean.valueOf(flag)).setCode(s).setMemo(s1);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls26(s)).b().a(new _cls25());
    }

    public final ica b()
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls28()).b().a(new _cls27());
    }

    public final ica b(String s)
    {
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls22(s)).a();
    }

    public final ica b(String s, String s1)
    {
        s = SelectProfileBody.create(s, s1);
        return a.a().a().a(com/ubercab/rider/realtime/client/RidersApi).a(new _cls11(s)).b().a(new _cls10());
    }

    /* member class not found */
    class _cls12 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls17 {}


    /* member class not found */
    class _cls16 {}


    /* member class not found */
    class _cls15 {}


    /* member class not found */
    class _cls19 {}


    /* member class not found */
    class _cls18 {}


    /* member class not found */
    class _cls20 {}


    /* member class not found */
    class _cls24 {}


    /* member class not found */
    class _cls23 {}


    /* member class not found */
    class _cls21 {}


    /* member class not found */
    class _cls9 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls14 {}


    /* member class not found */
    class _cls13 {}


    /* member class not found */
    class _cls26 {}


    /* member class not found */
    class _cls25 {}


    /* member class not found */
    class _cls28 {}


    /* member class not found */
    class _cls27 {}


    /* member class not found */
    class _cls22 {}


    /* member class not found */
    class _cls11 {}


    /* member class not found */
    class _cls10 {}

}
