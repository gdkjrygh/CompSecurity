// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.location.Location;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapController;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;

// Referenced classes of package com.whatsapp:
//            LocationPicker, App, t3, afc, 
//            h8, GoogleMapView, PlaceInfo

class bs extends AsyncTask
{

    private Location a;
    final LocationPicker b;
    private String c;
    private int d;
    private boolean e;

    protected bs(LocationPicker locationpicker, Location location, int i, String s, boolean flag)
    {
        b = locationpicker;
        super();
        a = location;
        c = s;
        d = i;
        e = flag;
    }

    protected t3 a(Void avoid[])
    {
        if (LocationPicker.a() >= System.currentTimeMillis()) goto _L2; else goto _L1
_L1:
        boolean flag = LocationPicker.b();
        if (flag) goto _L2; else goto _L3
_L3:
        flag = App.ar();
        if (!flag) goto _L2; else goto _L4
_L4:
        avoid = t3.a(a, d, null, c);
        Object obj = avoid;
        if (!avoid.isEmpty())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        flag = avoid.a();
        obj = avoid;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        LocationPicker.a(System.currentTimeMillis() + 0xdbba00L);
        obj = t3.c(a, d, null, c);
        return ((t3) (obj));
        avoid;
        throw avoid;
        avoid;
        throw avoid;
        Object obj1;
        obj1;
        avoid = null;
_L5:
        Log.a(((Throwable) (obj1)));
        return avoid;
        obj1;
        throw obj1;
        obj1;
        if (true) goto _L5; else goto _L2
_L2:
        avoid = t3.c(a, d, null, c);
        return avoid;
        obj1;
        avoid = null;
_L7:
        Log.a(((Throwable) (obj1)));
        return avoid;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected void a(t3 t3_1)
    {
label0:
        {
            int i;
label1:
            {
                i = App.am;
                if (isCancelled())
                {
                    break label0;
                }
                if (t3_1 != null)
                {
                    LocationPicker.a(b, t3_1);
                    LocationPicker.n(b).a(a);
                }
                LocationPicker.k(b).setVisibility(8);
                if (LocationPicker.n(b).isEmpty())
                {
                    Toast.makeText(b.getApplicationContext(), b.getString(0x7f0e02af), 1).show();
                    b.findViewById(0x7f0b0226).setVisibility(0);
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                b.findViewById(0x7f0b0226).setVisibility(8);
            }
label2:
            {
                LocationPicker.m(b);
                LocationPicker.g(b).notifyDataSetChanged();
                LocationPicker.j(b).a();
                LocationPicker.b(b).invalidate();
                if (LocationPicker.n(b).h != null && !"".equals(LocationPicker.n(b).h))
                {
                    LocationPicker.d(b).setText(b.getString(0x7f0e02ea, new Object[] {
                        LocationPicker.n(b).h
                    }));
                    if (i == 0)
                    {
                        break label2;
                    }
                }
                LocationPicker.d(b).setText(0x7f0e02e8);
            }
            if (!e || LocationPicker.n(b).isEmpty())
            {
                break label0;
            }
            t3_1 = LocationPicker.n(b).iterator();
            double d1 = 90D;
            double d2 = -90D;
            double d3 = 180D;
            double d4 = -180D;
            do
            {
                if (!t3_1.hasNext())
                {
                    break;
                }
                PlaceInfo placeinfo = (PlaceInfo)t3_1.next();
                d1 = Math.min(d1, placeinfo.lat);
                d2 = Math.max(d2, placeinfo.lat);
                d3 = Math.min(d3, placeinfo.lon);
                d4 = Math.max(d4, placeinfo.lon);
            } while (i == 0);
            t3_1 = new GeoPoint((int)(((d1 + d2) * 1000000D) / 2D), (int)(((d3 + d4) * 1000000D) / 2D));
            LocationPicker.b(b).getController().setCenter(t3_1);
            int j = (int)((d2 - d1) * 1.2D * 1000000D);
            int k = (int)((d4 - d3) * 1.2D * 1000000D);
            if (LocationPicker.n(b).size() <= 1)
            {
                LocationPicker.b(b).getController().setZoom(18);
                if (i == 0)
                {
                    break label0;
                }
            }
            LocationPicker.b(b).getController().zoomToSpan(j, k);
        }
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((t3)obj);
    }
}
