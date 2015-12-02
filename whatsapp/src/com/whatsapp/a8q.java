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
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.fieldstats.bo;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONException;

// Referenced classes of package com.whatsapp:
//            LocationPicker2, t3, App, a_2, 
//            PlaceInfo, a1g

class a8q extends AsyncTask
{

    final LocationPicker2 a;
    private String b;
    private Location c;
    private boolean d;
    private int e;

    protected a8q(LocationPicker2 locationpicker2, Location location, int i, String s, boolean flag)
    {
        a = locationpicker2;
        super();
        c = location;
        b = s;
        e = i;
        d = flag;
    }

    protected t3 a(Void avoid[])
    {
        if (LocationPicker2.c(a) != 3) goto _L2; else goto _L1
_L1:
        Object obj = t3.b(c, e, null, b);
_L7:
        return ((t3) (obj));
_L2:
        if (LocationPicker2.c() >= System.currentTimeMillis()) goto _L4; else goto _L3
_L3:
        int i = LocationPicker2.c(a);
        if (i != 1) goto _L4; else goto _L5
_L5:
        t3 t3_1 = t3.a(c, e, null, b);
        obj = t3_1;
        avoid = t3_1;
        if (!t3_1.isEmpty()) goto _L7; else goto _L6
_L6:
        avoid = t3_1;
        boolean flag = t3_1.a();
        obj = t3_1;
        if (!flag) goto _L7; else goto _L8
_L8:
        obj = t3_1;
        avoid = t3_1;
        LocationPicker2.b(a, true);
        obj = t3_1;
        avoid = t3_1;
        LocationPicker2.a(System.currentTimeMillis() + 0xdbba00L);
        obj = t3_1;
        avoid = t3_1;
        t3_1 = t3.c(c, e, null, b);
        obj = t3_1;
        avoid = t3_1;
        LocationPicker2.a(a, 2);
        return t3_1;
        avoid;
_L10:
        Log.a(avoid);
        return ((t3) (obj));
        avoid;
        throw avoid;
        avoid;
        obj = null;
        if (true) goto _L10; else goto _L9
_L9:
        IOException ioexception;
        ioexception;
        obj = t3_1;
        avoid = t3_1;
        throw ioexception;
        obj;
_L13:
        Log.a(((Throwable) (obj)));
        return avoid;
_L4:
        LocationPicker2.a(a, 2);
        t3_1 = t3.c(c, e, null, b);
        obj = t3_1;
        avoid = t3_1;
        if (!t3_1.isEmpty()) goto _L7; else goto _L11
_L11:
        avoid = t3_1;
        flag = t3_1.a();
        obj = t3_1;
        if (!flag) goto _L7; else goto _L12
_L12:
        obj = t3_1;
        avoid = t3_1;
        LocationPicker2.b(a, true);
        obj = t3_1;
        avoid = t3_1;
        t3_1 = t3.a(c, e, null, b);
        obj = t3_1;
        avoid = t3_1;
        LocationPicker2.a(a, 1);
        return t3_1;
        ioexception;
        obj = t3_1;
        avoid = t3_1;
        throw ioexception;
        obj;
        avoid = null;
          goto _L13
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
                    LocationPicker2.a(a, t3_1);
                    LocationPicker2.a(a).a(c);
                }
                if (t3_1 != null)
                {
                    LocationPicker2.a(a, bo.OK);
                    LocationPicker2.b(a, t3_1.size());
                    if (i == 0)
                    {
                        break label1;
                    }
                }
                LocationPicker2.a(a, bo.FAILED);
                LocationPicker2.b(a, 0);
            }
label2:
            {
                LocationPicker2.e(a).setVisibility(8);
                LocationPicker2.v(a).setVisibility(8);
                if (LocationPicker2.a(a).isEmpty())
                {
                    Toast.makeText(a.getApplicationContext(), a.getString(0x7f0e02af), 1).show();
                    a.findViewById(0x7f0b0226).setVisibility(0);
                    if (i == 0)
                    {
                        break label2;
                    }
                }
                a.findViewById(0x7f0b0226).setVisibility(8);
            }
label3:
            {
                LocationPicker2.s(a);
                LocationPicker2.g(a).notifyDataSetChanged();
                LocationPicker2.o(a);
                if (LocationPicker2.a(a).h != null && !"".equals(LocationPicker2.a(a).h))
                {
                    LocationPicker2.h(a).setText(a.getString(0x7f0e02ea, new Object[] {
                        LocationPicker2.a(a).h
                    }));
                    if (i == 0)
                    {
                        break label3;
                    }
                }
                LocationPicker2.h(a).setText(0x7f0e02e8);
            }
            if (!d || LocationPicker2.a(a).isEmpty())
            {
                break label0;
            }
            t3_1 = LocationPicker2.a(a).iterator();
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
            if (LocationPicker2.a(a).size() <= 1)
            {
                LocationPicker2.y(a).animateCamera(CameraUpdateFactory.newLatLng(new LatLng((d1 + d2) / 2D, (d3 + d4) / 2D)));
                LocationPicker2.y(a).animateCamera(CameraUpdateFactory.zoomTo(18F));
                if (i == 0)
                {
                    break label0;
                }
            }
            LocationPicker2.y(a).animateCamera(CameraUpdateFactory.newLatLngBounds(new LatLngBounds(new LatLng(d1, d3), new LatLng(d2, d4)), (int)(a1g.a().g * 16F)));
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
