// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.support.v7.app.ActionBar;
import android.text.TextUtils;
import android.widget.Toast;
import com.ubercab.analytics.app.AnalyticsEventListActivity;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.android.location.UberLocation;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.FeedbackTag;
import com.ubercab.client.core.model.FeedbackType;
import com.ubercab.client.core.model.Item;
import com.ubercab.client.core.model.TripPendingRating;
import com.ubercab.client.core.model.TripPendingRatingDriver;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.client.core.vendor.google.now.NowAuthIntentService;
import com.ubercab.client.feature.employee.EmployeeSettingsActivity;
import com.ubercab.client.feature.employee.SimulateViewsActivity;
import com.ubercab.client.feature.notification.model.FareSplitAcceptedNotificationData;
import com.ubercab.client.feature.notification.model.FareSplitInviteNotificationData;
import com.ubercab.client.feature.notification.model.MessageNotificationData;
import com.ubercab.client.feature.notification.model.ReceiptNotificationData;
import com.ubercab.client.feature.notification.model.SurgeNotificationData;
import com.ubercab.client.feature.notification.model.TripNotificationData;
import com.ubercab.client.feature.verification.AutomaticMobileVerificationActivity;
import com.ubercab.experiment.ExperimentsActivity;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.TestAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class dzs extends cze
{

    private static final List Q = gke.a(hcl.values(), gsn.values());
    CheckBoxPreference A;
    CheckBoxPreference B;
    ListPreference C;
    CheckBoxPreference D;
    EditTextPreference E;
    ListPreference F;
    CheckBoxPreference G;
    CheckBoxPreference H;
    ListPreference I;
    PreferenceCategory J;
    CheckBoxPreference K;
    CheckBoxPreference L;
    EditTextPreference M;
    ListPreference N;
    PreferenceScreen O;
    PreferenceCategory P;
    private String R;
    private Map S;
    private icl T;
    private czh U;
    private final android.preference.Preference.OnPreferenceChangeListener V = new android.preference.Preference.OnPreferenceChangeListener() {

        final dzs a;

        public final boolean onPreferenceChange(Preference preference, Object obj)
        {
            preference = preference.getKey().substring(dzs.a(a).length());
            if (((Boolean)obj).booleanValue())
            {
                a.n.b(preference);
            } else
            {
                a.n.c(preference);
            }
            a.c();
            return true;
        }

            
            {
                a = dzs.this;
                super();
            }
    };
    RiderApplication a;
    hka b;
    chp c;
    dcv d;
    cev e;
    ExecutorService f;
    gmg g;
    efa h;
    dwx i;
    hkr j;
    hch k;
    dak l;
    eky m;
    czf n;
    dal o;
    dao p;
    cin q;
    CheckBoxPreference r;
    ListPreference s;
    CheckBoxPreference t;
    CheckBoxPreference u;
    ListPreference v;
    CheckBoxPreference w;
    CheckBoxPreference x;
    CheckBoxPreference y;
    ListPreference z;

    public dzs()
    {
    }

    static String a(dzs dzs1)
    {
        return dzs1.R;
    }

    static void a(dzs dzs1, List list)
    {
        dzs1.a(list);
    }

    private void a(String s1, boolean flag)
    {
        f.execute(new Runnable(flag, s1) {

            final boolean a;
            final String b;
            final dzs c;

            public final void run()
            {
                boolean flag1;
                boolean flag2;
                flag1 = false;
                flag2 = true;
                if (!a) goto _L2; else goto _L1
_L1:
                Object obj;
                byte byte0;
                obj = b;
                byte0 = -1;
                ((String) (obj)).hashCode();
                JVM INSTR lookupswitch 3: default 60
            //                           -2146525273: 125
            //                           -1325796731: 153
            //                           -734206867: 139;
                   goto _L3 _L4 _L5 _L6
_L3:
                int i1;
                int j1;
                i1 = ((flag1) ? 1 : 0);
                j1 = ((flag2) ? 1 : 0);
                byte0;
                JVM INSTR tableswitch 0 2: default 96
            //                           0 102
            //                           1 167
            //                           2 176;
                   goto _L2 _L7 _L8 _L9
_L9:
                break MISSING_BLOCK_LABEL_176;
_L7:
                break; /* Loop/switch isn't completed */
_L2:
                j1 = 0;
                i1 = ((flag1) ? 1 : 0);
_L10:
                obj = TripNotificationData.createFakeData(b, j1, i1);
                c.m.a(((com.ubercab.client.feature.notification.model.NotificationData) (obj)));
                return;
_L4:
                if (((String) (obj)).equals("accepted"))
                {
                    byte0 = 0;
                }
                  goto _L3
_L6:
                if (((String) (obj)).equals("arrived"))
                {
                    byte0 = 1;
                }
                  goto _L3
_L5:
                if (((String) (obj)).equals("on_trip"))
                {
                    byte0 = 2;
                }
                  goto _L3
_L8:
                i1 = 1;
                j1 = ((flag2) ? 1 : 0);
                  goto _L10
                j1 = 3;
                i1 = 2;
                  goto _L10
            }

            
            {
                c = dzs.this;
                a = flag;
                b = s1;
                super();
            }
        });
    }

    private void a(List list)
    {
        if (!y())
        {
            return;
        }
        if (list != null && !list.isEmpty())
        {
            S = new HashMap();
            String as[] = new String[list.size()];
            for (int i1 = 0; i1 < list.size(); i1++)
            {
                TestAccount testaccount = (TestAccount)list.get(i1);
                String s1 = testaccount.getEmail();
                as[i1] = s1;
                S.put(s1, testaccount);
            }

            int j1 = gki.e(list, new gka(j.c().getUuid()) {

                final String a;
                final dzs b;

                private boolean a(TestAccount testaccount1)
                {
                    return a.equals(testaccount1.getUuid());
                }

                public final boolean apply(Object obj)
                {
                    return a((TestAccount)obj);
                }

            
            {
                b = dzs.this;
                a = s1;
                super();
            }
            });
            if (j1 >= 0)
            {
                N.setEntries(as);
                N.setEntryValues(as);
                N.setValueIndex(j1);
                P.setEnabled(true);
                return;
            }
        }
        O.removePreference(P);
        o.X();
    }

    public static dzs b()
    {
        return new dzs();
    }

    private List d()
    {
        int i1 = 0;
        String s1 = getString(0x7f07006b);
        String s2 = getString(0x7f07049b);
        ArrayList arraylist = new ArrayList();
        for (; i1 < 6; i1++)
        {
            String s3 = (new String[] {
                s1, "Service", "Driving", s2, "Car Quality", "Other"
            })[i1];
            FeedbackType feedbacktype = new FeedbackType();
            feedbacktype.setDescription(s3);
            arraylist.add(feedbacktype);
        }

        return arraylist;
    }

    private void e()
    {
        f();
        g();
        h();
        i();
        j();
        k();
        l();
        m();
        n();
        o();
        p();
        q();
        r();
        x();
        s();
        t();
        u();
        v();
        w();
    }

    private void f()
    {
        r.setChecked(n.e());
    }

    private void g()
    {
        s.setValue(n.x());
        s.setSummary(s.getEntry());
    }

    private void h()
    {
        t.setChecked(n.h());
    }

    private void i()
    {
        A.setChecked(n.i());
    }

    private void j()
    {
        if (p.l())
        {
            Object obj = p.k();
            obj = String.format(Locale.US, "(%.4f, %.4f)", new Object[] {
                Double.valueOf(((UberLocation) (obj)).g().a()), Double.valueOf(((UberLocation) (obj)).g().b())
            });
            B.setChecked(true);
            B.setSummary(((CharSequence) (obj)));
            return;
        } else
        {
            B.setChecked(false);
            B.setSummary(null);
            return;
        }
    }

    private void k()
    {
        if (p.i())
        {
            C.setValue(p.h());
            C.setSummary(C.getEntry());
            return;
        } else
        {
            C.setValue(null);
            C.setSummary(null);
            return;
        }
    }

    private void l()
    {
        D.setChecked(n.a());
    }

    private void m()
    {
        Object obj = j.b();
        if (obj != null && ((City) (obj)).getVehicleViews() != null)
        {
            obj = ((City) (obj)).getVehicleViews().values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                VehicleView vehicleview = (VehicleView)((Iterator) (obj)).next();
                String s1 = (new StringBuilder()).append(R).append(String.valueOf(vehicleview.getId())).toString();
                boolean flag = n.d(vehicleview.getId());
                CheckBoxPreference checkboxpreference = (CheckBoxPreference)J.findPreference(s1);
                if (checkboxpreference == null)
                {
                    checkboxpreference = new CheckBoxPreference(getActivity());
                    checkboxpreference.setKey(s1);
                    checkboxpreference.setOnPreferenceChangeListener(V);
                    checkboxpreference.setTitle(vehicleview.getDescription());
                    checkboxpreference.setPersistent(false);
                    checkboxpreference.setChecked(flag);
                    J.addPreference(checkboxpreference);
                } else
                {
                    checkboxpreference.setChecked(flag);
                }
            }
        }
    }

    private void n()
    {
        if (n.m())
        {
            String s1 = n.l();
            int i1 = v.findIndexOfValue(s1);
            CharSequence charsequence = v.getEntries()[i1];
            v.setValue(s1);
            v.setSummary(charsequence);
            return;
        } else
        {
            v.setValue(null);
            v.setSummary(null);
            return;
        }
    }

    private void o()
    {
        w.setChecked(n.v());
        y.setChecked(n.p());
        x.setChecked(n.z());
        u.setChecked(n.j());
    }

    private void onExperimentsClicked()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(Arrays.asList(dbf.values()));
        for (Iterator iterator = Q.iterator(); iterator.hasNext(); arraylist.addAll(Arrays.asList((gmv[])iterator.next()))) { }
        gmv agmv[] = (gmv[])arraylist.toArray(new gmv[arraylist.size()]);
        ExperimentsActivity.a(getActivity(), g, agmv);
    }

    private void onNowForce()
    {
        Object obj = NowAuthIntentService.a(a);
        obj = a.startService(((Intent) (obj)));
        if (obj == null)
        {
            ijg.c("Failed to start service component", new Object[0]);
            return;
        } else
        {
            ijg.a((new StringBuilder("startService Component Name : ")).append(((ComponentName) (obj)).flattenToString()).toString(), new Object[0]);
            Toast.makeText(a, "Successfully started credential check service", 0).show();
            return;
        }
    }

    private void onNowSchedule()
    {
        i.a(a, true);
        Toast.makeText(a, "An alarm is set to check credentials on a daily basis", 0).show();
    }

    private void onNowUnschedule()
    {
        if (i.b(a))
        {
            Toast.makeText(a, "Alarm Removed", 0).show();
            return;
        } else
        {
            Toast.makeText(a, "No alarm to remove.", 0).show();
            return;
        }
    }

    private void onPreferenceChangeFakeMobileMessage(boolean flag)
    {
        n.a(flag);
        c();
    }

    private void onPreferenceChangeFlagFakeProductGroups(boolean flag)
    {
        n.f(flag);
        c();
    }

    private void onPreferenceChangeFlagMapAnimations(boolean flag)
    {
        n.j(flag);
        c();
    }

    private void onPreferenceChangeFlagNewShareUi(boolean flag)
    {
        n.k(flag);
        c();
    }

    private void onPreferenceChangeFlagNotificationsClients(boolean flag)
    {
        n.h(flag);
        c();
    }

    private void onPreferenceChangeRdsLocationOverride(boolean flag)
    {
        k.a(flag);
        c();
    }

    private void onPreferenceChangeSafetyNet(boolean flag)
    {
        n.l(flag);
        c();
    }

    private void onPreferenceChangeUnisonMusicControls(boolean flag)
    {
        n.b(flag);
        c();
    }

    private void onPreferenceChangedAnalyticsLogging(boolean flag)
    {
        p.a(flag);
        if (flag)
        {
            c.a(true);
            c.a(d);
            return;
        } else
        {
            c.a(false);
            c.b(d);
            return;
        }
    }

    private void onPreferenceChangedBraintreeDevKey(boolean flag)
    {
        if (flag)
        {
            n.c();
        } else
        {
            n.d();
        }
        c();
    }

    private void onPreferenceChangedDestinationEntry(String s1)
    {
        n.f(s1);
        c();
    }

    private void onPreferenceChangedFakeDynamicPickup(boolean flag)
    {
        n.c(flag);
        c();
    }

    private void onPreferenceChangedFakeExpenseService(boolean flag)
    {
        n.d(flag);
        c();
    }

    private void onPreferenceChangedFakeGeo(String s1)
    {
        p.c(s1);
        c();
    }

    private void onPreferenceChangedFakeLastExpenseInfo(boolean flag)
    {
        n.e(flag);
        c();
    }

    private void onPreferenceChangedFakeLocation(boolean flag)
    {
        if (flag)
        {
            e.c(new dzz());
            return;
        } else
        {
            p.j();
            c();
            return;
        }
    }

    private void onPreferenceChangedFakeSurgeScreenType(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            n.k();
        } else
        {
            n.e(s1);
        }
        c();
    }

    private void onPreferenceChangedGoogleWalletEnvironment(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            n.a(1);
        } else
        {
            n.a(Integer.valueOf(s1).intValue());
        }
        c();
    }

    private void onPreferenceChangedNetworkServer(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        p.f();
_L4:
        c();
        a.a(a());
        return;
_L2:
        if (s1.startsWith("https://"))
        {
            p.b(s1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void onPreferenceChangedNotificationTrip(String s1)
    {
        a(s1, false);
    }

    private void onPreferenceChangedNotificationTripSplit(String s1)
    {
        a(s1, true);
    }

    private void onPreferenceChangedPayPalEnv(String s1)
    {
        n.a(s1);
        c();
    }

    private void onPreferenceChangedSliderStyle(String s1)
    {
        n.h(s1);
        c();
    }

    private void onPreferenceChangedVehiclesShowAll(boolean flag)
    {
        n.g(flag);
        c();
    }

    private void onPreferenceChangedVersionFake(String s1)
    {
        if (TextUtils.isEmpty(s1))
        {
            p.p();
        } else
        {
            p.e(s1);
        }
        c();
    }

    private void onPreferenceClickAnalyticsLogs()
    {
        startActivity(new Intent(getActivity(), com/ubercab/analytics/app/AnalyticsEventListActivity));
    }

    private void onPreferenceClickClearMobileMessage()
    {
        h.e();
    }

    private void onPreferenceClickFakeArrears()
    {
        e.c(new dzy());
    }

    private void onPreferenceClickForceCrash()
    {
        throw new RuntimeException("Fake Employee Settings Crash");
    }

    private void onPreferenceClickNotificationFareSplitAccepted()
    {
        f.execute(new Runnable() {

            final dzs a;

            public final void run()
            {
                a.m.a(FareSplitAcceptedNotificationData.createFakeData());
            }

            
            {
                a = dzs.this;
                super();
            }
        });
    }

    private void onPreferenceClickNotificationFareSplitInvite()
    {
        f.execute(new Runnable() {

            final dzs a;

            public final void run()
            {
                a.m.a(FareSplitInviteNotificationData.createFakeData());
            }

            
            {
                a = dzs.this;
                super();
            }
        });
    }

    private void onPreferenceClickNotificationMessage()
    {
        f.execute(new Runnable() {

            final dzs a;

            public final void run()
            {
                a.m.a(MessageNotificationData.createFakeData());
            }

            
            {
                a = dzs.this;
                super();
            }
        });
    }

    private void onPreferenceClickNotificationReceipt()
    {
        f.execute(new Runnable() {

            final dzs a;

            public final void run()
            {
                a.m.a(ReceiptNotificationData.createFakeData());
            }

            
            {
                a = dzs.this;
                super();
            }
        });
    }

    private void onPreferenceClickNotificationSurge()
    {
        f.execute(new Runnable() {

            final dzs a;

            public final void run()
            {
                a.m.a(SurgeNotificationData.createFakeData());
            }

            
            {
                a = dzs.this;
                super();
            }
        });
    }

    private void onPreferenceClickResetAddMusicOverlay()
    {
        n.n(false);
    }

    private void onPreferenceClickResetDestinationTutorial()
    {
        o.c(false);
    }

    private void onPreferenceClickResetProfilesOnBoardingImpressionCount()
    {
        o.M();
    }

    private void onPreferenceClickSendFunnelAnalytics()
    {
        q.e();
    }

    private void onPreferenceClickShowFakeAutoVerification()
    {
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/verification/AutomaticMobileVerificationActivity));
    }

    private void onPreferenceClickShowFakeMealPendingRating()
    {
        Object obj = j.b();
        if (obj == null)
        {
            return;
        } else
        {
            Object obj1 = ((City) (obj)).findVehicleViewById(((City) (obj)).getDefaultVehicleViewId());
            obj = new TripPendingRating();
            ((TripPendingRating) (obj)).setVehicleView((Shape_VehicleView)obj1);
            ((TripPendingRating) (obj)).setId(getString(0x7f0706e9));
            ((TripPendingRating) (obj)).setFareString(getString(0x7f0706ea));
            ((TripPendingRating) (obj)).setDropoffTimestamp(getString(0x7f0706da));
            obj1 = FeedbackTag.create(getString(0x7f0706eb), getString(0x7f0706ee));
            FeedbackTag feedbacktag = FeedbackTag.create(getString(0x7f0706ed), getString(0x7f0706f0));
            FeedbackTag feedbacktag1 = FeedbackTag.create(getString(0x7f0706ec), getString(0x7f0706ef));
            Item item = Item.create(getString(0x7f0706e6), getString(0x7f0706db), getString(0x7f0706de), getString(0x7f0706e1), Arrays.asList(new String[] {
                getString(0x7f0706e4), getString(0x7f0706e5)
            }));
            Item item1 = Item.create(getString(0x7f0706e8), getString(0x7f0706dd), getString(0x7f0706e0), getString(0x7f0706e3), Arrays.asList(new String[] {
                getString(0x7f0706e4), getString(0x7f0706e5)
            }));
            Item item2 = Item.create(getString(0x7f0706e7), getString(0x7f0706dc), getString(0x7f0706df), getString(0x7f0706e2), Arrays.asList(new String[] {
                getString(0x7f0706e4), getString(0x7f0706e5)
            }));
            ((TripPendingRating) (obj)).setFeedbackTags(Arrays.asList(new FeedbackTag[] {
                obj1, feedbacktag, feedbacktag1
            }));
            ((TripPendingRating) (obj)).setItems(Arrays.asList(new com.ubercab.rider.realtime.model.Item[] {
                item, item1, item2
            }));
            e.c(new eaa(((com.ubercab.rider.realtime.model.TripPendingRating) (obj))));
            return;
        }
    }

    private void onPreferenceClickShowFakeSmsVerification()
    {
        e.c(new eab());
    }

    private void onPreferenceClickShowFakeTokenVerification()
    {
        e.c(new eac());
    }

    private void onPreferenceClickShowFakeTripPendingRating()
    {
        TripPendingRatingDriver trippendingratingdriver = new TripPendingRatingDriver();
        trippendingratingdriver.setName(getString(0x7f0706f2));
        trippendingratingdriver.setPictureUrl(getString(0x7f0706f1));
        TripPendingRating trippendingrating = new TripPendingRating();
        trippendingrating.setId("e2d91601-884b-4b0b-9065-b10de7cdbb54");
        trippendingrating.setFareString("$12.10");
        trippendingrating.setFareBilledToCardString("$12.10");
        trippendingrating.setDropoffEpoch(Long.valueOf((new Date()).getTime()));
        trippendingrating.setDriver(trippendingratingdriver);
        trippendingrating.setFeedbackTypes(d());
        e.c(new ead(trippendingrating));
    }

    private void onPreferenceTestAccountsChanged(String s1)
    {
        if (!y())
        {
            return;
        }
        TestAccount testaccount = (TestAccount)S.get(s1);
        if (testaccount == null)
        {
            Toast.makeText(a, (new StringBuilder("Cannot switch to test account: ")).append(s1).toString(), 0).show();
            return;
        } else
        {
            a.a(testaccount.getUuid(), testaccount.getToken(), testaccount.getEmail());
            a().v();
            return;
        }
    }

    private void onSimulateViewsClicked()
    {
        startActivity(new Intent(getActivity(), com/ubercab/client/feature/employee/SimulateViewsActivity));
    }

    private void p()
    {
        int i1 = n.n();
        if (i1 == 0)
        {
            z.setValue(Integer.toString(0));
            z.setSummary(getString(0x7f07079b));
            return;
        }
        if (i1 == 2)
        {
            z.setValue(Integer.toString(2));
            z.setSummary(getString(0x7f0707a1));
            return;
        } else
        {
            z.setValue(Integer.toString(1));
            z.setSummary(getString(0x7f070793));
            return;
        }
    }

    private void q()
    {
        F.setValue(n.f());
        F.setSummary(F.getEntry());
    }

    private void r()
    {
        G.setChecked(k.a());
    }

    private void s()
    {
        String s1 = n.A();
        int i1 = I.findIndexOfValue(s1);
        CharSequence charsequence = I.getEntries()[i1];
        I.setValue(s1);
        I.setSummary(charsequence);
    }

    private void t()
    {
        String s1 = p.g();
        if (TextUtils.isEmpty(s1))
        {
            s1 = getString(0x7f070737);
            E.setSummary(s1);
            return;
        } else
        {
            E.setSummary(s1);
            return;
        }
    }

    private void u()
    {
        K.setChecked(n.b());
    }

    private void v()
    {
        L.setChecked(n.o());
    }

    private void w()
    {
        if (p.q())
        {
            M.setSummary(p.r());
            return;
        } else
        {
            M.setSummary(null);
            return;
        }
    }

    private void x()
    {
        H.setChecked(n.C());
    }

    private boolean y()
    {
        return g.a(dbf.f);
    }

    public final void a(RiderLocation riderlocation)
    {
        p.a(riderlocation.getLocation());
        l.b(riderlocation);
        c();
    }

    public final void c()
    {
        e();
        e.c(new dzx());
    }

    public final void onCreate(Bundle bundle)
    {
        if (U == null)
        {
            ((dzo)((EmployeeSettingsActivity)getActivity()).d()).a(this);
        } else
        {
            U.a(U.c());
        }
        super.onCreate(bundle);
        R = getString(0x7f07072a);
        addPreferencesFromResource(0x7f050000);
        eah.a(this);
    }

    public final void onPause()
    {
        super.onPause();
        while (!y() || T == null || T.c()) 
        {
            return;
        }
        T.b();
        T = null;
    }

    protected final void onPreferenceChangedTripTrayReset()
    {
        n.B();
        o.d(false);
        c();
    }

    public final void onResume()
    {
        super.onResume();
        Object obj = ((RiderActivity)getActivity()).b();
        ((ActionBar) (obj)).d(false);
        ((ActionBar) (obj)).a(getString(0x7f070733));
        e();
        if (!y())
        {
            return;
        }
        P.setEnabled(false);
        obj = j.c();
        if (obj == null)
        {
            O.removePreference(P);
            return;
        }
        if (((Client) (obj)).getIsAdmin())
        {
            T = b.a("client").a(ico.a()).a(new dzt(this, ((Client) (obj)), (byte)0));
            return;
        } else
        {
            a(o.W());
            return;
        }
    }

}
