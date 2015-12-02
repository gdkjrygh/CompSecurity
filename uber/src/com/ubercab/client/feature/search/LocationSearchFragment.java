// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import cev;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.android.location.UberLatLng;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.CombinedLocationHistoryResponse;
import com.ubercab.client.core.model.FareInfo;
import com.ubercab.client.core.model.LocationAutocompleteResponse;
import com.ubercab.client.core.model.LocationHistoryResponse;
import com.ubercab.client.core.model.LocationSearchResponse;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.client.core.model.LocationSearchResults;
import com.ubercab.client.core.model.LocationTagAddResponse;
import com.ubercab.client.core.model.TaggedLocationDistanceConstraints;
import com.ubercab.client.core.model.UpfrontFareResponse;
import com.ubercab.client.core.model.UpfrontFareSearchResults;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.ui.TextView;
import cwz;
import czb;
import czj;
import dal;
import dbf;
import dce;
import dch;
import dcm;
import dfp;
import djb;
import dkd;
import dll;
import dmc;
import dmd;
import dme;
import dmf;
import dmg;
import dmh;
import dnt;
import drc;
import dtg;
import ffq;
import ffr;
import ffu;
import ffv;
import ffx;
import ffy;
import ffz;
import fga;
import fgb;
import fgc;
import fgd;
import fge;
import fgf;
import fgg;
import fgh;
import fgi;
import frj;
import fte;
import gka;
import gke;
import gki;
import gkk;
import gmg;
import hkr;
import hpb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchEditText, LocationSearchAdapter, LocationSearchFooterView, LocationSearchIconView

public class LocationSearchFragment extends czb
    implements dcm, ffu
{

    private RiderLocation A;
    private RiderLocation B;
    private Runnable C;
    private Handler D;
    private TextWatcher E;
    private LocationSearchFooterView F;
    private LocationSearchAdapter G;
    private LocationSearchAdapter H;
    private LocationSearchAdapter I;
    private ffz J;
    private List K;
    private List L;
    private AlertDialog M;
    private ProgressDialog N;
    public chp c;
    public drc d;
    public Application e;
    public cev f;
    public hkr g;
    public gmg h;
    public dkd i;
    public dch j;
    public dce k;
    public dal l;
    public fte m;
    LocationSearchEditText mEditTextSearch;
    ImageButton mImageButtonClear;
    ListView mListViewLocation;
    LocationSearchIconView mSearchIcon;
    TextView mTextViewEmpty;
    TextView mTextViewSkip;
    ViewGroup mViewGroupContent;
    LinearLayout mViewGroupEmpty;
    ViewGroup mViewGroupLoading;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private RiderLocation z;

    public LocationSearchFragment()
    {
        K = new ArrayList();
        L = new ArrayList();
    }

    private boolean A()
    {
        return TextUtils.isEmpty(z().trim()) || mEditTextSearch.getTag() != null;
    }

    private void B()
    {
        String s1 = null;
        Object obj1 = D();
        List list = E();
        ArrayList arraylist = new ArrayList(((java.util.Collection) (obj1)));
        arraylist.addAll(list);
        I.a(((List) (obj1)), x);
        H.a(list, null);
        Object obj = gkk.a(gki.a(K, 5));
        if (p)
        {
            obj = a(K, arraylist, 5);
        }
        int i1 = ((List) (obj1)).size();
        a(((List) (obj1)), 0);
        a(list, ((List) (obj)).size() + i1);
        obj1 = G;
        if (i1 <= 0)
        {
            s1 = x;
        }
        ((LocationSearchAdapter) (obj1)).a(((List) (obj)), s1);
    }

    private void C()
    {
        I.a(null, null);
        H.a(null, null);
    }

    private List D()
    {
        if (i()) goto _L2; else goto _L1
_L1:
        Object obj = new ArrayList();
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        boolean flag2 = "com.ubercab.ACTION_PICKUP_LOCATION".equals(v);
        boolean flag3 = "com.ubercab.ACTION_DESTINATION".equals(v);
        String as[] = LocationSearchResult.HOME_WORK_TAGS;
        int j1 = as.length;
        int i1 = 0;
        do
        {
            obj = arraylist;
            if (i1 >= j1)
            {
                continue;
            }
            obj = as[i1];
            if (J.a(((String) (obj))))
            {
                obj = J.b(((String) (obj)));
                LocationSearchResult locationsearchresult = ((ffy) (obj)).c();
                boolean flag;
                boolean flag1;
                if (flag2 && J.a(A, locationsearchresult))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag3 && J.b(A, locationsearchresult))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag || flag1)
                {
                    arraylist.add(obj);
                }
            } else
            {
                arraylist.add(new ffy(((String) (obj))));
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private List E()
    {
        ArrayList arraylist = new ArrayList();
        if (j())
        {
            String as[] = LocationSearchResult.HOME_WORK_TAGS;
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist.add(new ffy(as[i1]));
            }

        }
        return arraylist;
    }

    private void F()
    {
        x();
        G();
    }

    private void G()
    {
        if (N == null || !N.isShowing())
        {
            return;
        } else
        {
            N.hide();
            return;
        }
    }

    public static LocationSearchFragment a(String s1, RiderLocation riderlocation, RiderLocation riderlocation1, String s2, String s3, TaggedLocationDistanceConstraints taggedlocationdistanceconstraints, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.ARG_ACTION", s1);
        bundle.putParcelable("com.ubercab.ARG_LOCATION_PICKUP", riderlocation);
        bundle.putParcelable("com.ubercab.ARG_LOCATION_DESTINATION", riderlocation1);
        bundle.putString("com.ubercab.ARG_VEHICLE_VIEW_ID", s2);
        bundle.putString("com.ubercab.ARG_ACTION_BAR_TITLE", s3);
        bundle.putBoolean("com.ubercab.ARG_TAGGED_LOCATIONS_DISPLAYED", true);
        bundle.putParcelable("com.ubercab.ARG_TAGGED_LOCATION_DESTINATION_CONSTRAINTS", taggedlocationdistanceconstraints);
        bundle.putBoolean("com.ubercab.ARG_SHOW_UPFRONT_PRICING", flag);
        s1 = new LocationSearchFragment();
        s1.setArguments(bundle);
        return s1;
    }

    public static LocationSearchFragment a(String s1, String s2, RiderLocation riderlocation, RiderLocation riderlocation1, String s3)
    {
        Bundle bundle = new Bundle();
        bundle.putString("com.ubercab.ARG_ACTION", s1);
        bundle.putString("com.ubercab.ARG_TAG_OF_LOCATION", s2);
        bundle.putBoolean("com.ubercab.ARG_TAGGED_LOCATIONS_DISPLAYED", true);
        bundle.putParcelable("com.ubercab.ARG_LOCATION_PICKUP", riderlocation);
        bundle.putParcelable("com.ubercab.ARG_LOCATION_TAGGED", riderlocation1);
        bundle.putString("com.ubercab.ARG_ACTION_BAR_TITLE", s3);
        s1 = new LocationSearchFragment();
        s1.setArguments(bundle);
        return s1;
    }

    private static List a(List list, List list1, int i1)
    {
        if (list == null)
        {
            list1 = new ArrayList();
        } else
        {
            boolean flag;
            if (i1 != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (list1 == null || list1.isEmpty())
            {
                list1 = list;
                if (flag)
                {
                    return gkk.a(gki.a(list, i1));
                }
            } else
            {
                ArrayList arraylist = new ArrayList();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    ffy ffy1 = (ffy)list.next();
                    if (flag && arraylist.size() >= i1)
                    {
                        break;
                    }
                    if (!gki.b(list1, new gka(ffy1) {

        final ffy a;

        private boolean a(ffy ffy2)
        {
            return ffy2.a(a);
        }

        public final boolean apply(Object obj)
        {
            return a((ffy)obj);
        }

            
            {
                a = ffy1;
                super();
            }
    }))
                    {
                        arraylist.add(ffy1);
                    }
                } while (true);
                return arraylist;
            }
        }
        return list1;
    }

    private void a(int i1, boolean flag, String s1)
    {
        boolean flag1 = "com.ubercab.ACTION_PICKUP_LOCATION".equals(v);
        boolean flag2 = "com.ubercab.ACTION_DESTINATION".equals(v);
        if (!flag1 && !flag2)
        {
            return;
        } else
        {
            J.a(flag1, s1, flag, i1);
            return;
        }
    }

    private void a(RiderLocation riderlocation)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s1 = riderlocation.getNickname();
        riderlocation = riderlocation.getDisplayAddressDescription();
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
        }
        if (TextUtils.isEmpty(s1) || !riderlocation.startsWith(s1))
        {
            stringbuilder.append(riderlocation);
        }
        w = stringbuilder.toString();
        q = true;
        mEditTextSearch.setTag("autofill");
        mEditTextSearch.a(w);
        mImageButtonClear.setVisibility(0);
    }

    private void a(LocationSearchResult locationsearchresult)
    {
        Object obj = ffy.a(G.a());
        Object obj2 = ffy.a(I.a());
        String s1 = locationsearchresult.getTag();
        Object obj1;
        Double double1;
        int i1;
        if (!TextUtils.isEmpty(s1) && ((List) (obj2)).size() > 0)
        {
            obj1 = Integer.valueOf(((List) (obj2)).indexOf(locationsearchresult));
            obj = Integer.valueOf(((List) (obj2)).indexOf(locationsearchresult));
        } else
        {
            s1 = locationsearchresult.getServiceType();
            obj1 = Integer.valueOf(frj.b(((List) (obj)), locationsearchresult));
            i1 = I.getCount();
            obj = Integer.valueOf(frj.a(((List) (obj)), locationsearchresult) + i1);
        }
        obj2 = z();
        if (s)
        {
            if (obj2 == null)
            {
                i1 = 0;
            } else
            {
                i1 = ((String) (obj2)).length();
            }
        } else
        {
            i1 = 0;
        }
        obj2 = Integer.valueOf(i1);
        double1 = locationsearchresult.getLatitude();
        locationsearchresult = locationsearchresult.getLongitude();
        if (k())
        {
            obj1 = String.format("%s:%d:%d:%f:%f:%s", new Object[] {
                s1, obj2, obj1, double1, locationsearchresult, u
            });
            locationsearchresult = n.eP;
        } else
        {
            obj1 = String.format("%s:%d:%d:%f:%f", new Object[] {
                s1, obj2, obj1, double1, locationsearchresult
            });
            if ("com.ubercab.ACTION_PICKUP_LOCATION".equals(v))
            {
                locationsearchresult = n.fa;
            } else
            {
                locationsearchresult = n.eM;
            }
        }
        c.a(AnalyticsEvent.create("tap").setName(locationsearchresult).setValue(((String) (obj1))).setValuePosition(Long.valueOf(((Integer) (obj)).intValue())));
    }

    private void a(LocationSearchResult locationsearchresult, FareInfo fareinfo)
    {
        RiderLocation riderlocation;
        String s1;
        byte byte0;
        riderlocation = RiderLocation.create(locationsearchresult);
        s1 = v;
        byte0 = -1;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 52
    //                   -669628160: 86
    //                   458188937: 118
    //                   1712228054: 102;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 135
    //                   1 177
    //                   2 177;
           goto _L5 _L6 _L7 _L7
_L5:
        a(locationsearchresult);
        return;
_L2:
        if (s1.equals("com.ubercab.ACTION_PICKUP_LOCATION"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        if (s1.equals("com.ubercab.ACTION_DESTINATION"))
        {
            byte0 = 1;
        }
          goto _L1
_L3:
        if (s1.equals("com.ubercab.ACTION_DESTINATION_ETA"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        if (a(riderlocation, z))
        {
            c(getString(0x7f0701ea));
            return;
        }
        f.c(new fgf(riderlocation, null));
          goto _L5
_L7:
        if (a(riderlocation, A))
        {
            c(getString(0x7f0701e9));
            return;
        }
        f.c(new fgf(riderlocation, fareinfo));
          goto _L5
    }

    private void a(LocationSearchResult locationsearchresult, FareInfo fareinfo, Activity activity)
    {
        if (k())
        {
            i.a(u, locationsearchresult.getId(), locationsearchresult.getReference(), locationsearchresult.getType());
            a(getString(0x7f0703cb), activity);
            if (h.a(dbf.bM) && p)
            {
                j.b();
            }
            a(locationsearchresult);
            return;
        } else
        {
            a(locationsearchresult, fareinfo);
            return;
        }
    }

    static void a(LocationSearchFragment locationsearchfragment)
    {
        locationsearchfragment.r();
    }

    static void a(LocationSearchFragment locationsearchfragment, String s1)
    {
        locationsearchfragment.a(s1, true);
    }

    private void a(ffv ffv1)
    {
        ffv1.a(this);
    }

    private void a(String s1, Activity activity)
    {
        w();
        b(s1, activity);
    }

    private void a(String s1, boolean flag)
    {
        double d2 = 0.0D;
        if (A())
        {
            return;
        }
        w();
        double d1;
        if (A != null)
        {
            d1 = A.getUberLatLng().a();
            d2 = A.getUberLatLng().b();
        } else
        {
            d1 = 0.0D;
        }
        if (flag)
        {
            i.b(d1, d2, s1);
            return;
        } else
        {
            i.a(d1, d2, s1);
            return;
        }
    }

    private void a(List list)
    {
        List list1 = J.d(z());
        int i1 = list1.size();
        list = b(b(list, L, i1 + 5), list1, 5);
        G.a(list, null);
        if ((h.a(dbf.b) || h.a(dbf.c)) && list.isEmpty() && s())
        {
            c.a(l.eY);
            if (M == null)
            {
                M = (new android.app.AlertDialog.Builder(getActivity())).setTitle(0x7f0701d8).setMessage(0x7f0703a0).setPositiveButton(0x7f0702f8, new android.content.DialogInterface.OnClickListener() {

                    final LocationSearchFragment a;

                    public final void onClick(DialogInterface dialoginterface, int j1)
                    {
                        a.c.a(AnalyticsEvent.create("tap").setName(n.dj).setValue("ok"));
                        a.f.c(new fge());
                        LocationSearchFragment.j(a);
                    }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
                }).setNegativeButton(0x7f0704a2, new android.content.DialogInterface.OnClickListener() {

                    final LocationSearchFragment a;

                    public final void onClick(DialogInterface dialoginterface, int j1)
                    {
                        a.c.a(AnalyticsEvent.create("tap").setName(n.dj).setValue("try_again"));
                        LocationSearchFragment.j(a);
                    }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
                }).show();
            }
        }
    }

    private void a(List list, int i1)
    {
        int j1 = 0;
        while (j1 < list.size()) 
        {
            ffy ffy1 = (ffy)list.get(j1);
            boolean flag;
            if (ffy1.c() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            J.a(ffy1.b(), flag, j1 + i1);
            j1++;
        }
    }

    private static boolean a(RiderLocation riderlocation, RiderLocation riderlocation1)
    {
        boolean flag1 = true;
        if (riderlocation != null && riderlocation1 != null) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        if (TextUtils.isEmpty(riderlocation.getReference()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (riderlocation.getReference().equals(riderlocation1.getReference())) goto _L4; else goto _L3
_L3:
        if (riderlocation.getUberLatLng() != null && riderlocation1.getUberLatLng() != null)
        {
            flag = flag1;
            if (UberLatLng.a(riderlocation.getUberLatLng(), riderlocation1.getUberLatLng()) >= 20D)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private boolean a(String s1)
    {
        City city = g.b();
        if (city != null && !d.k())
        {
            if ((s1 = city.findVehicleViewById(s1)) != null && s1.getEnableVehicleInventoryView())
            {
                return true;
            }
        }
        return false;
    }

    private ffv b(dfp dfp)
    {
        return ffq.a().a(new djb(this)).a(dfp).a();
    }

    private static List b(List list, List list1, int i1)
    {
        boolean flag;
        if (i1 != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        if (list1 != null) goto _L4; else goto _L3
_L3:
        list1 = new ArrayList();
_L6:
        return list1;
_L4:
        if (flag)
        {
            return gkk.a(gki.a(list1, i1));
        } else
        {
            return list1;
        }
_L2:
        if (list1 == null || list1.isEmpty())
        {
            list1 = list;
            if (flag)
            {
                return gkk.a(gki.a(list, i1));
            }
        } else
        {
            ArrayList arraylist = gkk.a(list1);
            arraylist.addAll(a(list, list1, i1));
            return arraylist;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void b(LocationHistoryResponse locationhistoryresponse)
    {
        LocationSearchResults locationsearchresults;
        if (locationhistoryresponse == null)
        {
            return;
        }
        locationsearchresults = locationhistoryresponse.getDropoffs();
        if (!"com.ubercab.ACTION_PICKUP_LOCATION".equals(v)) goto _L2; else goto _L1
_L1:
        locationsearchresults = locationhistoryresponse.getPickups();
        if (locationsearchresults != null)
        {
            K = ffy.a(locationsearchresults.getAllResults(), false);
            c.a(AnalyticsEvent.create("impression").setName(l.gp).setValuePosition(Long.valueOf(K.size())));
        }
_L4:
        locationhistoryresponse = locationhistoryresponse.getTagged();
        if (locationhistoryresponse != null)
        {
            J.a(ffy.a(locationhistoryresponse, true));
        }
        r();
        return;
_L2:
        if (locationsearchresults != null)
        {
            K = ffy.a(locationsearchresults.getAllResults(), false);
            c.a(AnalyticsEvent.create("impression").setName(l.go).setValuePosition(Long.valueOf(K.size())));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void b(LocationSearchFragment locationsearchfragment)
    {
        locationsearchfragment.v();
    }

    private void b(String s1, Activity activity)
    {
        if (N != null && N.isShowing())
        {
            return;
        } else
        {
            N = dtg.b(activity, s1);
            N.show();
            return;
        }
    }

    static void c(LocationSearchFragment locationsearchfragment)
    {
        locationsearchfragment.y();
    }

    static String d(LocationSearchFragment locationsearchfragment)
    {
        return locationsearchfragment.z();
    }

    static String e(LocationSearchFragment locationsearchfragment)
    {
        return locationsearchfragment.w;
    }

    static boolean f(LocationSearchFragment locationsearchfragment)
    {
        return locationsearchfragment.q;
    }

    private boolean g()
    {
        return a(m.m()) || fte.b(m.f());
    }

    static boolean g(LocationSearchFragment locationsearchfragment)
    {
        locationsearchfragment.s = true;
        return true;
    }

    static Runnable h(LocationSearchFragment locationsearchfragment)
    {
        return locationsearchfragment.C;
    }

    private void h()
    {
        mEditTextSearch.setText("");
    }

    static Handler i(LocationSearchFragment locationsearchfragment)
    {
        return locationsearchfragment.D;
    }

    private boolean i()
    {
        return p && !k() && !J.b();
    }

    static AlertDialog j(LocationSearchFragment locationsearchfragment)
    {
        locationsearchfragment.M = null;
        return null;
    }

    private boolean j()
    {
        return p && !k() && J.b();
    }

    private boolean k()
    {
        return "com.ubercab.ACTION_ADD_TAGGED_LOCATION".equals(v) || "com.ubercab.ACTION_EDIT_TAGGED_LOCATION".equals(v);
    }

    private boolean l()
    {
        return "com.ubercab.ACTION_DESTINATION".equals(v) || "com.ubercab.ACTION_DESTINATION_ETA".equals(v);
    }

    private void m()
    {
        ActionBar actionbar = d().b();
        if (TextUtils.isEmpty(t))
        {
            actionbar.c();
            return;
        } else
        {
            actionbar.a(t);
            return;
        }
    }

    private void n()
    {
        if ("CHINA".equals(k.a()))
        {
            F.a();
        }
        String s1 = "";
        boolean flag = "com.ubercab.ACTION_EDIT_TAGGED_LOCATION".equals(v);
        if (LocationSearchResult.isTagHome(u))
        {
            s1 = getString(0x7f07026c);
        } else
        if (LocationSearchResult.isTagWork(u))
        {
            s1 = getString(0x7f070672);
        }
        if (flag)
        {
            F.a(s1);
            F.c();
            F.d();
            return;
        } else
        {
            F.b();
            return;
        }
    }

    private void o()
    {
        int i1;
        int j1;
        j1 = 0x7f020147;
        i1 = j1;
        if (!k()) goto _L2; else goto _L1
_L1:
        if (!LocationSearchResult.isTagHome(u)) goto _L4; else goto _L3
_L3:
        i1 = 0x7f02017e;
_L2:
        mSearchIcon.a(i1);
        return;
_L4:
        i1 = j1;
        if (LocationSearchResult.isTagWork(u))
        {
            i1 = 0x7f02019c;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void p()
    {
        byte byte0;
        byte0 = 0;
        if (k())
        {
            Resources resources = e.getResources();
            String s2 = J.c(u);
            mEditTextSearch.setHint(resources.getString(0x7f070244, new Object[] {
                s2.toLowerCase()
            }));
        }
        if (!q) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1 = v;
        s1.hashCode();
        JVM INSTR lookupswitch 3: default 104
    //                   -669628160: 149
    //                   935441163: 175
    //                   1712228054: 161;
           goto _L3 _L4 _L5 _L6
_L3:
        byte0 = -1;
_L12:
        byte0;
        JVM INSTR tableswitch 0 2: default 132
    //                   0 133
    //                   1 190
    //                   2 206;
           goto _L7 _L8 _L9 _L10
_L7:
        return;
_L8:
        if (A == null) goto _L1; else goto _L11
_L11:
        a(A);
        return;
_L4:
        if (!s1.equals("com.ubercab.ACTION_PICKUP_LOCATION")) goto _L3; else goto _L12
_L6:
        if (!s1.equals("com.ubercab.ACTION_DESTINATION")) goto _L3; else goto _L13
_L13:
        byte0 = 1;
          goto _L12
_L5:
        if (!s1.equals("com.ubercab.ACTION_EDIT_TAGGED_LOCATION")) goto _L3; else goto _L14
_L14:
        byte0 = 2;
          goto _L12
_L9:
        if (z != null)
        {
            a(z);
            return;
        }
          goto _L1
_L10:
        a(B);
        return;
    }

    private void q()
    {
        List list;
        if (h.a(dbf.bM))
        {
            if ((list = j.c()).size() != 0)
            {
                J.a(ffy.a(list, true));
                r();
                return;
            }
        }
    }

    private void r()
    {
        String s1 = z();
        if (A())
        {
            B();
        } else
        {
            C();
            String s2 = s1.toLowerCase();
            L = gkk.a(gki.a(gki.a(K, new gka(s2) {

                final String a;
                final LocationSearchFragment b;

                private boolean a(ffy ffy1)
                {
                    String s3 = ffy1.c().getNickname();
                    ffy1 = ffy1.c().getLongAddress();
                    return s3 != null && s3.toLowerCase().contains(a) || ffy1 != null && ffy1.toLowerCase().contains(a);
                }

                public final boolean apply(Object obj)
                {
                    return a((ffy)obj);
                }

            
            {
                b = LocationSearchFragment.this;
                a = s1;
                super();
            }
            }), 5));
            if (L.size() <= 5)
            {
                a(s1, false);
            }
            if (!L.isEmpty())
            {
                G.a(L, null);
                return;
            }
        }
    }

    private boolean s()
    {
        VehicleView vehicleview = t();
        return vehicleview != null && (vehicleview.getLinkedVehicleViewId() != null || vehicleview.getHijackVehicleViewId() != null);
    }

    private VehicleView t()
    {
        City city = g.b();
        if (city != null)
        {
            return city.findVehicleViewById(y);
        } else
        {
            return null;
        }
    }

    private void u()
    {
        double d2 = 0.0D;
        w();
        double d1;
        if (A != null)
        {
            d1 = A.getUberLatLng().a();
            d2 = A.getUberLatLng().b();
        } else
        {
            d1 = 0.0D;
        }
        if (p && k())
        {
            i.a();
            return;
        }
        if (r && l())
        {
            i.c(d1, d2, y);
            return;
        }
        if (h.a(dbf.bM))
        {
            j.b(this);
            return;
        } else
        {
            i.a(d1, d2);
            return;
        }
    }

    private void v()
    {
        byte byte1 = 8;
        int i1 = 1;
        Object obj;
        byte byte0;
        if (G.getCount() == 0)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (byte0 != 0 && !A() && o)
        {
            byte0 = i1;
        } else
        {
            byte0 = 0;
        }
        obj = mViewGroupEmpty;
        if (byte0 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((LinearLayout) (obj)).setVisibility(i1);
        obj = mViewGroupContent;
        if (byte0 != 0)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((ViewGroup) (obj)).setVisibility(byte0);
    }

    private void w()
    {
        mSearchIcon.b();
    }

    private void x()
    {
        mSearchIcon.a();
    }

    private void y()
    {
        boolean flag = true;
        if (A() || o)
        {
            F.d();
            return;
        }
        String s1 = getString(0x7f07029e, new Object[] {
            z()
        });
        if (G.getCount() <= 0)
        {
            flag = false;
        }
        F.a(flag, s1);
    }

    private String z()
    {
        return mEditTextSearch.getText().toString();
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a()
    {
        if (!h.a(dbf.bM))
        {
            return;
        } else
        {
            j.a(this);
            x();
            mViewGroupLoading.setVisibility(8);
            q();
            c(getString(0x7f07029b));
            return;
        }
    }

    public final void a(LocationHistoryResponse locationhistoryresponse)
    {
        if (!h.a(dbf.bM))
        {
            return;
        } else
        {
            j.a(this);
            x();
            mViewGroupLoading.setVisibility(8);
            b(locationhistoryresponse);
            return;
        }
    }

    public final volatile void a(czj czj)
    {
        a((ffv)czj);
    }

    public final void b()
    {
        a(z(), true);
        c.a(n.eR);
    }

    public final cic f()
    {
        return czb.a;
    }

    public final void f_()
    {
        if (!p)
        {
            return;
        }
        if (getActivity() != null)
        {
            a(getString(0x7f07039c), getActivity());
        }
        i.a(u);
        J.f(u);
    }

    public void onAddTaggedLocationEvent(fga fga1)
    {
        int j1 = fga1.b();
        int i1 = j1;
        if (J.b())
        {
            i1 = j1 + G.getCount();
        }
        a(i1, true, fga1.a());
    }

    public void onClickImageButtonClear()
    {
        h();
        r();
    }

    public void onClickLocationSearchIcon()
    {
        mEditTextSearch.requestFocus();
    }

    public void onClickTextViewSkip()
    {
        cwz.b(getActivity(), getActivity().getCurrentFocus());
        f.c(new fgg());
    }

    public void onCombinedLocationHistoryResponse(dll dll1)
    {
        x();
        mViewGroupLoading.setVisibility(8);
        if (!dll1.i())
        {
            c(getString(0x7f07029b));
        } else
        {
            dll1 = ffy.a(((CombinedLocationHistoryResponse)dll1.g()).getResults(), false);
            if (dll1 != null && !dll1.isEmpty())
            {
                K = gkk.a(gki.a(dll1, new gka() {

                    final LocationSearchFragment a;

                    private static boolean a(ffy ffy1)
                    {
                        return TextUtils.isEmpty(ffy1.b());
                    }

                    public final boolean apply(Object obj)
                    {
                        return a((ffy)obj);
                    }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
                }));
                r();
                return;
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        v = bundle.getString("com.ubercab.ARG_ACTION");
        t = bundle.getString("com.ubercab.ARG_ACTION_BAR_TITLE");
        z = (RiderLocation)bundle.getParcelable("com.ubercab.ARG_LOCATION_DESTINATION");
        p = bundle.getBoolean("com.ubercab.ARG_TAGGED_LOCATIONS_DISPLAYED", true);
        u = bundle.getString("com.ubercab.ARG_TAG_OF_LOCATION");
        A = (RiderLocation)bundle.getParcelable("com.ubercab.ARG_LOCATION_PICKUP");
        B = (RiderLocation)bundle.getParcelable("com.ubercab.ARG_LOCATION_TAGGED");
        r = bundle.getBoolean("com.ubercab.ARG_SHOW_UPFRONT_PRICING", false);
        y = bundle.getString("com.ubercab.ARG_VEHICLE_VIEW_ID");
        D = new Handler();
        C = new Runnable() {

            final LocationSearchFragment a;

            public final void run()
            {
                if (a.isResumed())
                {
                    LocationSearchFragment.a(a);
                }
            }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
        };
        bundle = (TaggedLocationDistanceConstraints)bundle.getParcelable("com.ubercab.ARG_TAGGED_LOCATION_DESTINATION_CONSTRAINTS");
        J = new ffz(c, getResources(), l, bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03009f, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        mEditTextSearch.removeTextChangedListener(E);
        j.a(this);
        F.b(this);
        ButterKnife.reset(this);
    }

    public void onEditTaggedLocationEvent(fgb fgb1)
    {
        a(fgb1.b(), false, fgb1.a());
    }

    public void onGetLocationDetailsEvent(fgc fgc1)
    {
        i.a(fgc1.a(), fgc1.b());
    }

    public void onLocationAutocompleteEvent(dmc dmc1)
    {
        x();
        mViewGroupLoading.setVisibility(8);
        String s1 = dmc1.a();
        if (!z().equals(s1))
        {
            return;
        }
        if (!dmc1.i())
        {
            c(getString(0x7f07029a));
            return;
        } else
        {
            o = false;
            a(ffy.a(((LocationAutocompleteResponse)dmc1.g()).getPredictions(), false));
            return;
        }
    }

    public void onLocationClickEvent(fgd fgd1)
    {
        if (getActivity() != null)
        {
            a(fgd1.a(), fgd1.c(), getActivity());
        }
    }

    public void onLocationDetailResponse(dmd dmd1)
    {
        if (!dmd1.i())
        {
            c(getString(0x7f07029c));
        } else
        {
            dmd1 = (LocationSearchResult)dmd1.g();
            o = false;
            if (getActivity() != null)
            {
                a(dmd1, ((FareInfo) (null)), getActivity());
                return;
            }
        }
    }

    public void onLocationHistoryResponse(dme dme1)
    {
        if (h.a(dbf.bM))
        {
            return;
        }
        x();
        mViewGroupLoading.setVisibility(8);
        if (!dme1.i())
        {
            c(getString(0x7f07029b));
            return;
        } else
        {
            b((LocationHistoryResponse)dme1.g());
            return;
        }
    }

    public void onLocationSearchEvent(dmf dmf1)
    {
        x();
        mViewGroupLoading.setVisibility(8);
        String s1 = dmf1.a();
        if (!z().equals(s1))
        {
            return;
        }
        if (!dmf1.i())
        {
            c(getString(0x7f07029a));
            return;
        } else
        {
            o = true;
            a(ffy.a(((LocationSearchResponse)dmf1.g()).getPredictions(), false));
            return;
        }
    }

    public void onLocationTagAddResponseEvent(dmg dmg1)
    {
        F();
        if (!dmg1.i())
        {
            c(getString(0x7f07029f));
            return;
        } else
        {
            J.a(((LocationTagAddResponse)dmg1.g()).getResult(), u);
            f.c(new fgi());
            return;
        }
    }

    public void onLocationTagDeleteResponseEvent(dmh dmh1)
    {
        F();
        if (!dmh1.i())
        {
            c(getString(0x7f0702a0));
            return;
        }
        if (h.a(dbf.bM))
        {
            j.b();
        }
        J.e(u);
        f.c(new fgh());
    }

    public void onPause()
    {
        super.onPause();
        if (N != null)
        {
            N.dismiss();
            N = null;
        }
        cwz.b(e, mEditTextSearch);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu = menu.findItem(0x7f0e06c2);
        if (menu != null)
        {
            menu.setVisible(false);
        }
    }

    public void onResume()
    {
        super.onResume();
        m();
        if (G.isEmpty())
        {
            mViewGroupLoading.setVisibility(0);
            u();
        }
        J.a(p);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.ubercab.BUNDLE_PREFILLED_TEXT_APPLIED", q);
        J.a(bundle);
    }

    public void onSelectTaggedLocation(fgi fgi1)
    {
        J.a();
        cwz.b(e, mEditTextSearch);
    }

    public boolean onTouchListViewLocations()
    {
        cwz.b(getActivity(), mEditTextSearch);
        return false;
    }

    public void onUpfrontFareResponse(dnt dnt1)
    {
        x();
        mViewGroupLoading.setVisibility(8);
        if (!dnt1.i())
        {
            c(getString(0x7f07029b));
            return;
        } else
        {
            dnt1 = (UpfrontFareResponse)dnt1.g();
            x = dnt1.getTagline();
            K = ffy.b(dnt1.getDropoffs().getResults(), false);
            J.a(ffy.b(dnt1.getTagged(), true));
            r();
            return;
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        int i1;
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        if (bundle != null)
        {
            J.b(bundle);
            q = bundle.getBoolean("com.ubercab.BUNDLE_PREFILLED_TEXT_APPLIED", false);
        }
        if (q && !k())
        {
            cwz.b(e, mEditTextSearch);
        } else
        {
            cwz.a(e, mEditTextSearch);
        }
        view = view.getContext();
        F = (LocationSearchFooterView)LayoutInflater.from(view).inflate(0x7f030170, mListViewLocation, false);
        F.a(this);
        G = new LocationSearchAdapter(view, f, true, true);
        I = new LocationSearchAdapter(view, f, true, true);
        H = new LocationSearchAdapter(view, f, true, true);
        view = new ffx(view, gke.a(I, G, H));
        view.registerDataSetObserver(new DataSetObserver() {

            final LocationSearchFragment a;

            public final void onChanged()
            {
                super.onChanged();
                LocationSearchFragment.b(a);
                LocationSearchFragment.c(a);
            }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
        });
        mTextViewEmpty.setText(getString(0x7f0702d3));
        mListViewLocation.addFooterView(F, null, false);
        mListViewLocation.setAdapter(view);
        view = v;
        i1 = -1;
        view.hashCode();
        JVM INSTR lookupswitch 3: default 264
    //                   -669628160: 376
    //                   458188937: 404
    //                   1712228054: 390;
           goto _L1 _L2 _L3 _L4
_L1:
        i1;
        JVM INSTR tableswitch 0 2: default 292
    //                   0 419
    //                   1 460
    //                   2 477;
           goto _L5 _L6 _L7 _L8
_L5:
        p();
        o();
        n();
        view = mTextViewSkip;
        if (n)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        mEditTextSearch.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final LocationSearchFragment a;

            public final boolean onEditorAction(android.widget.TextView textview, int j1, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (j1 == 3 || flag)
                {
                    cwz.b(a.mEditTextSearch.getContext(), textview);
                    LocationSearchFragment.a(a, LocationSearchFragment.d(a));
                    a.c.a(n.eQ);
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
        });
        E = new hpb() {

            final LocationSearchFragment a;

            public final void afterTextChanged(Editable editable)
            {
                LocationSearchFragment.i(a).removeCallbacks(LocationSearchFragment.h(a));
                LocationSearchFragment.i(a).postDelayed(LocationSearchFragment.h(a), 250L);
                editable = a.mImageButtonClear;
                int j1;
                if (!TextUtils.isEmpty(LocationSearchFragment.d(a).trim()))
                {
                    j1 = 0;
                } else
                {
                    j1 = 8;
                }
                editable.setVisibility(j1);
            }

            public final void onTextChanged(CharSequence charsequence, int j1, int k1, int l1)
            {
                if (j1 == 0 && k1 == 0 && charsequence.equals(LocationSearchFragment.e(a)) && !LocationSearchFragment.f(a))
                {
                    return;
                } else
                {
                    LocationSearchFragment.g(a);
                    a.mEditTextSearch.setTag(null);
                    return;
                }
            }

            
            {
                a = LocationSearchFragment.this;
                super();
            }
        };
        mEditTextSearch.addTextChangedListener(E);
        return;
_L2:
        if (view.equals("com.ubercab.ACTION_PICKUP_LOCATION"))
        {
            i1 = 0;
        }
          goto _L1
_L4:
        if (view.equals("com.ubercab.ACTION_DESTINATION"))
        {
            i1 = 1;
        }
          goto _L1
_L3:
        if (view.equals("com.ubercab.ACTION_DESTINATION_ETA"))
        {
            i1 = 2;
        }
          goto _L1
_L6:
        if (g())
        {
            mEditTextSearch.setHint(getString(0x7f0701d5));
        } else
        {
            mEditTextSearch.setHint(getString(0x7f070358));
        }
          goto _L5
_L7:
        mEditTextSearch.setHint(getString(0x7f0701d9));
          goto _L5
_L8:
        mEditTextSearch.setHint(getString(0x7f0701d9));
        n = true;
          goto _L5
    }
}
