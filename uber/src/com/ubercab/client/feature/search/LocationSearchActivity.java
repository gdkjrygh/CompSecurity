// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import chp;
import cic;
import com.ubercab.client.core.app.RiderActivity;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Trip;
import czj;
import czq;
import dfe;
import dfp;
import drc;
import dtj;
import ffo;
import ffp;
import ffs;
import fga;
import fgb;
import fge;
import fgf;
import fgg;
import fgh;
import fgi;
import hkr;
import ijg;
import java.util.Collection;
import java.util.Collections;
import n;

// Referenced classes of package com.ubercab.client.feature.search:
//            LocationSearchFragment

public class LocationSearchActivity extends RiderActivity
{

    public chp h;
    public drc i;
    public hkr j;
    public czq k;

    public LocationSearchActivity()
    {
    }

    public static Intent a(Context context, String s1, RiderLocation riderlocation, RiderLocation riderlocation1, String s2, boolean flag)
    {
        return b(context, s1, riderlocation, riderlocation1, s2, flag);
    }

    private void a(RiderLocation riderlocation)
    {
        String s1 = getString(0x7f07008c);
        String s2 = getString(0x7f07008b);
        String s3 = getString(0x7f0702f8);
        String s4 = getString(0x7f07007b);
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.ubercab.LOCATION", riderlocation);
        dtj.a(this, 6001, s1, s2, s3, s4, bundle);
    }

    private void a(ffs ffs1)
    {
        ffs1.a(this);
    }

    private void a(String s1, LocationSearchResult locationsearchresult)
    {
        RiderLocation riderlocation1 = (RiderLocation)getIntent().getParcelableExtra("com.ubercab.LOCATION_PICKUP");
        String s2 = "com.ubercab.ACTION_ADD_TAGGED_LOCATION";
        RiderLocation riderlocation = null;
        if (locationsearchresult != null)
        {
            riderlocation = RiderLocation.create(locationsearchresult);
            s2 = "com.ubercab.ACTION_EDIT_TAGGED_LOCATION";
        }
        a(0x7f0e018e, ((android.support.v4.app.Fragment) (LocationSearchFragment.a(s2, s1, riderlocation1, riderlocation, getIntent().getStringExtra("com.ubercab.ACTION_BAR_TITLE")))));
    }

    private static Intent b(Context context, String s1, RiderLocation riderlocation, RiderLocation riderlocation1, String s2, boolean flag)
    {
        context = new Intent(context, com/ubercab/client/feature/search/LocationSearchActivity);
        context.putExtra("com.ubercab.ACTION_BAR_TITLE", null);
        context.putExtra("com.ubercab.LOCATION_PICKUP", riderlocation);
        context.putExtra("com.ubercab.LOCATION_DESTINATION", riderlocation1);
        context.putExtra("com.ubercab.VEHICLE_VIEW_ID", s2);
        context.putExtra("com.ubercab.SHOW_UPFRONT_PRICING", flag);
        context.setAction(s1);
        return context;
    }

    private LocationSearchFragment b(String s1)
    {
        com.ubercab.client.core.model.TaggedLocationDistanceConstraints taggedlocationdistanceconstraints = i.d();
        Intent intent = getIntent();
        return LocationSearchFragment.a(s1, (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION_PICKUP"), (RiderLocation)intent.getParcelableExtra("com.ubercab.LOCATION_DESTINATION"), intent.getStringExtra("com.ubercab.VEHICLE_VIEW_ID"), intent.getStringExtra("com.ubercab.ACTION_BAR_TITLE"), taggedlocationdistanceconstraints, intent.getBooleanExtra("com.ubercab.SHOW_UPFRONT_PRICING", false));
    }

    private ffs b(dfp dfp)
    {
        return ffo.a().a(new dfe(this)).a(dfp).a();
    }

    private void f()
    {
        if (a(com/ubercab/client/feature/search/LocationSearchFragment) == null)
        {
            a(0x7f0e018e, b(getIntent().getAction()), true);
        }
    }

    private void g()
    {
        Object obj;
        Object obj1;
        byte byte0;
        obj1 = null;
        if (getIntent() == null)
        {
            obj = null;
        } else
        {
            obj = getIntent().getAction();
        }
        if (obj == null)
        {
            ijg.c("Null action", new Object[0]);
            return;
        }
        byte0 = -1;
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 3: default 76
    //                   -669628160: 128
    //                   458188937: 156
    //                   1712228054: 142;
           goto _L1 _L2 _L3 _L4
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 104
    //                   0 170
    //                   1 177
    //                   2 177;
           goto _L5 _L6 _L7 _L7
_L5:
        ijg.c("Not tracking action: %s", new Object[] {
            obj
        });
        obj = obj1;
_L8:
        h.a(((cif) (obj)));
        return;
_L2:
        if (((String) (obj)).equals("com.ubercab.ACTION_PICKUP_LOCATION"))
        {
            byte0 = 0;
        }
          goto _L1
_L4:
        if (((String) (obj)).equals("com.ubercab.ACTION_DESTINATION"))
        {
            byte0 = 1;
        }
          goto _L1
_L3:
        if (((String) (obj)).equals("com.ubercab.ACTION_DESTINATION_ETA"))
        {
            byte0 = 2;
        }
          goto _L1
_L6:
        obj = n.eU;
          goto _L8
_L7:
        obj = n.eE;
          goto _L8
    }

    private void h()
    {
        dtj.a(this, 0, null, getString(0x7f070299), getString(0x7f0702f8), null, null);
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int l, int i1, Bundle bundle)
    {
        super.a(l, i1, bundle);
        if (l == 6001 && i1 == -1)
        {
            Intent intent = new Intent();
            intent.putExtra("com.ubercab.LOCATION", bundle.getParcelable("com.ubercab.LOCATION"));
            setResult(-1, intent);
            finish();
        }
    }

    public final volatile void a(czj czj)
    {
        a((ffs)czj);
    }

    protected final void b(Bundle bundle)
    {
        super.b(bundle);
        setContentView(0x7f03009e);
        f();
    }

    protected final Collection e()
    {
        return Collections.singleton(k);
    }

    public void onAddTaggedLocationEvent(fga fga1)
    {
        a(fga1.a(), null);
    }

    public void onBackPressed()
    {
        g();
        super.onBackPressed();
    }

    public void onEditTaggedLocationEvent(fgb fgb1)
    {
        a(fgb1.a(), fgb1.c());
    }

    public void onLocationSearchFailedEvent(fge fge)
    {
        setResult(2);
        finish();
    }

    public void onLocationSelectedEvent(fgf fgf1)
    {
        Object obj = j.d();
        boolean flag;
        if (obj != null)
        {
            obj = ((ClientStatus) (obj)).getStatus();
        } else
        {
            obj = null;
        }
        if ("WaitingForPickup".equals(obj) || "OnTrip".equals(obj))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = j.f();
        if (flag && obj != null && ((Trip) (obj)).getDestination() != null)
        {
            a(fgf1.a());
            return;
        }
        if (fgf1.a().getUberLatLng() == null)
        {
            h();
            return;
        } else
        {
            Intent intent = new Intent();
            intent.putExtra("com.ubercab.LOCATION", fgf1.a());
            intent.putExtra("com.ubercab.FAREINFO", fgf1.b());
            setResult(-1, intent);
            finish();
            return;
        }
    }

    public void onLocationSkippedEvent(fgg fgg)
    {
        setResult(1);
        finish();
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            setResult(0);
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }

    public void onRemoveTaggedLocationEvent(fgh fgh)
    {
        A();
    }

    public void onSelectTaggedLocationEvent(fgi fgi)
    {
        A();
    }

    public final cic s()
    {
        return RiderActivity.a;
    }

    protected final boolean t()
    {
        return true;
    }
}
