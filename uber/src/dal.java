// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.rider.realtime.model.Profile;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class dal
    implements grv, hck
{

    private final bjw a;
    private final SharedPreferences b;
    private Set c;

    public dal(SharedPreferences sharedpreferences, bjw bjw1)
    {
        c = new CopyOnWriteArraySet();
        b = sharedpreferences;
        a = bjw1;
        ad();
    }

    private static String a(int i1, String s1)
    {
        gjz.a(s1);
        return String.format("%s_%s_%s", new Object[] {
            "show_survey_dialog_expiry", String.valueOf(i1), s1
        });
    }

    private void a(long l1, long l2)
    {
        if (l1 == 0L && l2 == 1L)
        {
            dan.a(b, "destination_coach_mark_dismissed");
        }
    }

    private void a(String s1, RiderLocation riderlocation)
    {
        riderlocation = a.a(riderlocation, com/ubercab/client/core/location/RiderLocation);
        b.edit().putString(s1, riderlocation).apply();
    }

    private long ac()
    {
        return b.getLong("preferences_version", 0L);
    }

    private void ad()
    {
        for (long l1 = ac(); l1 < 1L;)
        {
            a(l1, l1 + 1L);
            l1++;
            b.edit().putLong("preferences_version", l1).apply();
        }

    }

    private RiderLocation t(String s1)
    {
        Object obj = b.getString(s1, null);
        obj = (RiderLocation)a.a(((String) (obj)), com/ubercab/client/core/location/RiderLocation);
        return ((RiderLocation) (obj));
        Object obj1;
        obj1;
_L2:
        b.edit().remove(s1).apply();
        return null;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean A()
    {
        return !TextUtils.isEmpty(z());
    }

    public final void B()
    {
        b.edit().remove("selected_product_group_uuid").apply();
    }

    public final String C()
    {
        return b.getString("selected_product_group_uuid", "");
    }

    public final String D()
    {
        return b.getString("last_ride_vehicle_view_id", "");
    }

    public final String E()
    {
        return b.getString("selected_vehicle_view_id", "");
    }

    public final String F()
    {
        return b.getString("last_rated_trip_id", "");
    }

    public final RiderLocation G()
    {
        return t("last_user_pickup_location");
    }

    public final RiderLocation H()
    {
        return t("last_user_destination");
    }

    public final void I()
    {
        int i1 = K();
        b.edit().putInt("tagged_location_empty_impressions_count", i1 + 1).apply();
    }

    public final void J()
    {
        b.edit().remove("tagged_location_empty_impressions_count").apply();
    }

    public final int K()
    {
        return b.getInt("tagged_location_empty_impressions_count", 0);
    }

    public final void L()
    {
        int i1 = N();
        b.edit().putInt("profiles_menu_onboarding_impressions", i1 + 1).apply();
    }

    public final void M()
    {
        b.edit().remove("profiles_menu_onboarding_impressions").apply();
    }

    public final int N()
    {
        return b.getInt("profiles_menu_onboarding_impressions", 0);
    }

    public final String O()
    {
        return b.getString("session_hash", "");
    }

    public final void P()
    {
        b.edit().clear().apply();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((dam)iterator.next()).c()) { }
    }

    public final long Q()
    {
        return b.getLong("venue_dismissed_time", 0L);
    }

    public final String R()
    {
        return b.getString("last_emergency_enabled_trip_id", null);
    }

    public final String S()
    {
        return b.getString("last_deaf_driver_trip_id", "");
    }

    public final boolean T()
    {
        return b.getBoolean("ridepool_option", false);
    }

    public final boolean U()
    {
        return b.getBoolean("last_location_search_failed", false);
    }

    public final String V()
    {
        return b.getString("fare_change_trip_id", "");
    }

    public final List W()
    {
        String s1 = b.getString("test_account", null);
        if (TextUtils.isEmpty(s1))
        {
            return null;
        } else
        {
            return Arrays.asList((Object[])a.a(s1, [Lcom/ubercab/rider/realtime/response/TestAccount;));
        }
    }

    public final void X()
    {
        b.edit().remove("test_account").apply();
    }

    public final long Y()
    {
        return b.getLong("contacts_upload_ts", 0L);
    }

    public final String Z()
    {
        return b.getString("partner_uuid", null);
    }

    public final long a(int i1)
    {
        return b.getLong(a(i1, "SurveyDialogExpiryMs"), 0L);
    }

    public final Profile a(eyy eyy1)
    {
        return eyy1.a(b.getString("selected_profile_uuid", ""));
    }

    public final void a(int i1, int j1)
    {
        b.edit().putInt(a(i1, "SurveyVerdict"), j1).apply();
    }

    public final void a(int i1, long l1)
    {
        b.edit().putLong(a(i1, "SurveyDialogExpiryMs"), l1).apply();
    }

    public final void a(long l1)
    {
        b.edit().putLong("venue_dismissed_time", l1).apply();
    }

    public final void a(RiderLocation riderlocation)
    {
        a("last_user_pickup_location", riderlocation);
    }

    public final void a(Profile profile)
    {
        b.edit().putString("selected_profile_uuid", profile.getUuid()).apply();
    }

    public final void a(dam dam1)
    {
        c.add(dam1);
    }

    public final void a(String s1, long l1)
    {
        gjz.a(s1);
        b.edit().putLong(s1, l1).apply();
    }

    public final void a(String s1, LocationSearchResult locationsearchresult)
    {
        if (locationsearchresult == null)
        {
            return;
        } else
        {
            locationsearchresult = a.a(locationsearchresult, com/ubercab/client/core/model/LocationSearchResult);
            s1 = String.format("tagged_location_%s", new Object[] {
                s1
            });
            b.edit().putString(s1, locationsearchresult).apply();
            return;
        }
    }

    public final void a(String s1, String s2)
    {
        gjz.a(s1);
        b.edit().putString(s1, s2).apply();
    }

    public final void a(String s1, boolean flag)
    {
        gjz.a(s1);
        b.edit().putBoolean(s1, flag).apply();
    }

    public final void a(List list)
    {
        if (list == null || list.isEmpty())
        {
            X();
            return;
        } else
        {
            b.edit().putString("test_account", a.a(list)).apply();
            return;
        }
    }

    public final void a(boolean flag)
    {
        b.edit().putBoolean("google_wallet", flag).apply();
    }

    public final boolean a()
    {
        return b.getBoolean("google_wallet", true);
    }

    public final boolean a(String s1)
    {
        return b.getStringSet("destination_mobile_message_dismissed", Collections.emptySet()).contains(s1);
    }

    public final boolean aa()
    {
        return b.getBoolean("partner_office_hours", false);
    }

    public final void ab()
    {
        b.edit().putBoolean("partner_office_hours", true).apply();
    }

    public final void b(int i1)
    {
        a(i1, 0);
    }

    public final void b(long l1)
    {
        b.edit().putLong("contacts_upload_ts", l1).apply();
    }

    public final void b(RiderLocation riderlocation)
    {
        a("last_user_destination", riderlocation);
    }

    public final void b(String s1)
    {
        Set set;
        if (!TextUtils.isEmpty(s1))
        {
            if ((set = b.getStringSet("destination_mobile_message_dismissed", new HashSet())).add(s1))
            {
                b.edit().putStringSet("destination_mobile_message_dismissed", set).apply();
                return;
            }
        }
    }

    public final void b(boolean flag)
    {
        b.edit().putBoolean("one_tap_overlay", flag).apply();
    }

    public final boolean b()
    {
        return b.getBoolean("sharing_contacts_permission", false);
    }

    public final int c(int i1)
    {
        return b.getInt(a(i1, "SurveyVerdict"), 0);
    }

    public final void c()
    {
        b.edit().putBoolean("sharing_contacts_permission", true).apply();
    }

    public final void c(String s1)
    {
        b.edit().putString("token", s1).apply();
    }

    public final void c(boolean flag)
    {
        b.edit().putBoolean("destination_coach_mark_dismissed", flag).apply();
    }

    public final int d()
    {
        return b.getInt("suggestion_banner_impression_count", 0);
    }

    public final void d(String s1)
    {
        b.edit().putString("user_uuid", s1).apply();
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((dam)iterator.next()).a(s1)) { }
    }

    public final void d(boolean flag)
    {
        b.edit().putBoolean("tray_first_time_experience_completed", flag).apply();
    }

    public final void e()
    {
        int i1 = d();
        b.edit().putInt("suggestion_banner_impression_count", i1 + 1).apply();
    }

    public final void e(String s1)
    {
        b.edit().putString("selected_product_group_uuid", s1).apply();
    }

    public final void e(boolean flag)
    {
        b.edit().putBoolean("ridepool_option", flag).apply();
    }

    public final void f()
    {
        b.edit().putInt("suggestion_banner_impression_count", 0).apply();
    }

    public final void f(String s1)
    {
        b.edit().putString("last_ride_vehicle_view_id", s1).apply();
    }

    public final void f(boolean flag)
    {
        b.edit().putBoolean("last_location_search_failed", flag).apply();
    }

    public final void g()
    {
        b.edit().putBoolean("add_payment_overlay", true).apply();
    }

    public final void g(String s1)
    {
        b.edit().putString("selected_vehicle_view_id", s1).apply();
    }

    public final void g(boolean flag)
    {
        b.edit().putBoolean("partner_onboarding_status", flag).apply();
    }

    public final void h(String s1)
    {
        b.edit().putString("last_rated_trip_id", s1).apply();
    }

    public final boolean h()
    {
        return b.getBoolean("add_payment_overlay", false);
    }

    public final LocationSearchResult i(String s1)
    {
        s1 = String.format("tagged_location_%s", new Object[] {
            s1
        });
        s1 = b.getString(s1, null);
        if (s1 == null)
        {
            return null;
        } else
        {
            return (LocationSearchResult)a.a(s1, com/ubercab/client/core/model/LocationSearchResult);
        }
    }

    public final boolean i()
    {
        return b.getBoolean("one_tap_overlay", false);
    }

    public final void j()
    {
        b.edit().putBoolean("one_tap_new_user", true).apply();
    }

    public final void j(String s1)
    {
        s1 = String.format("tagged_location_%s", new Object[] {
            s1
        });
        b.edit().remove(s1).apply();
    }

    public final void k(String s1)
    {
        b.edit().putString("session_hash", s1).apply();
    }

    public final boolean k()
    {
        return b.getBoolean("one_tap_new_user", false);
    }

    public final void l()
    {
        b.edit().putBoolean("switch_profile_overlay", true).apply();
    }

    public final void l(String s1)
    {
        if (s1 == null)
        {
            b.edit().remove("last_emergency_enabled_trip_id").apply();
            return;
        } else
        {
            b.edit().putString("last_emergency_enabled_trip_id", s1).apply();
            return;
        }
    }

    public final void m(String s1)
    {
        b.edit().putString("last_deaf_driver_trip_id", s1).apply();
    }

    public final boolean m()
    {
        return b.getBoolean("switch_profile_overlay", false);
    }

    public final void n(String s1)
    {
        b.edit().putString("fare_change_trip_id", s1).apply();
    }

    public final boolean n()
    {
        return b.getBoolean("suggestion_banner_suppressed_flag", false);
    }

    public final long o(String s1)
    {
        gjz.a(s1);
        return b.getLong(s1, 0L);
    }

    public final void o()
    {
        b.edit().putBoolean("suggestion_banner_suppressed_flag", true).apply();
    }

    public final String p(String s1)
    {
        gjz.a(s1);
        return b.getString(s1, null);
    }

    public final boolean p()
    {
        return b.getBoolean("destination_coach_mark_dismissed", false);
    }

    public final void q()
    {
        b.edit().putBoolean("highlight_tutorial_dismissed", true).apply();
    }

    public final boolean q(String s1)
    {
        gjz.a(s1);
        return b.getBoolean(s1, false);
    }

    public final void r(String s1)
    {
        b.edit().putString("partner_uuid", s1).apply();
    }

    public final boolean r()
    {
        return b.getBoolean("highlight_tutorial_dismissed", false);
    }

    public final void s()
    {
        b.edit().putBoolean("toolbar_tutorial_dismissed", true).apply();
    }

    public final void s(String s1)
    {
        b.edit().putString("partner_token", s1).apply();
    }

    public final boolean t()
    {
        return b.getBoolean("toolbar_tutorial_dismissed", false);
    }

    public final String u()
    {
        return b.getString("token", "");
    }

    public final boolean v()
    {
        return !TextUtils.isEmpty(u());
    }

    public final boolean w()
    {
        return b.getBoolean("tray_first_time_experience_completed", false);
    }

    public final String x()
    {
        return u();
    }

    public final String y()
    {
        return "client";
    }

    public final String z()
    {
        return b.getString("user_uuid", "");
    }
}
