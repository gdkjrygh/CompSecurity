// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.g;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.e;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationListActivity, LocationTabListFragment, u

public class i
    implements g
{

    final LocationListActivity a;
    private final View b;

    i(LocationListActivity locationlistactivity)
    {
        a = locationlistactivity;
        super();
        b = locationlistactivity.getLayoutInflater().inflate(0x7f04003c, null);
    }

    public View a(e e1)
    {
        return null;
    }

    public View b(e e1)
    {
        TextView textview1;
        Object obj1;
        Object obj2;
        Object obj3;
        int j;
        obj3 = (TextView)b.findViewById(0x7f0f003e);
        obj2 = (TextView)b.findViewById(0x7f0f00cf);
        obj1 = (TextView)b.findViewById(0x7f0f00d0);
        TextView textview = (TextView)b.findViewById(0x7f0f00d1);
        textview1 = (TextView)b.findViewById(0x7f0f00d2);
        Button button = (Button)b.findViewById(0x7f0f00d3);
        ((TextView) (obj3)).setTypeface(LocationListActivity.a(a));
        ((TextView) (obj2)).setTypeface(com.wf.wellsfargomobile.locations.LocationListActivity.b(a));
        ((TextView) (obj1)).setTypeface(com.wf.wellsfargomobile.locations.LocationListActivity.b(a));
        textview.setTypeface(LocationListActivity.a(a));
        textview1.setTypeface(com.wf.wellsfargomobile.locations.LocationListActivity.b(a));
        button.setTypeface(LocationListActivity.a(a));
        j = 0;
_L3:
        e e2;
        if (j >= com.wf.wellsfargomobile.locations.LocationListActivity.c(a).size())
        {
            break MISSING_BLOCK_LABEL_652;
        }
        e2 = (e)com.wf.wellsfargomobile.locations.LocationListActivity.c(a).get(j);
        if (e2 == null || !e2.a().equals(e1.a())) goto _L2; else goto _L1
_L1:
        Object obj;
        StringBuilder stringbuilder;
        if ("ATM".equals(LocationListActivity.d(a).a()))
        {
            obj = com.wf.wellsfargomobile.locations.LocationListActivity.e(a).a();
        } else
        {
            obj = com.wf.wellsfargomobile.locations.LocationListActivity.e(a).b();
        }
        obj = (HashMap)((List) (obj)).get(j);
        stringbuilder = new StringBuilder();
        if (((HashMap) (obj)).containsKey("siteName"))
        {
            stringbuilder.append((String)((HashMap) (obj)).get("siteName"));
        }
        ((TextView) (obj3)).setText(stringbuilder);
        obj3 = new StringBuilder();
        if (((HashMap) (obj)).containsKey("addrLine1"))
        {
            ((StringBuilder) (obj3)).append((String)((HashMap) (obj)).get("addrLine1"));
        }
        if (((HashMap) (obj)).containsKey("city"))
        {
            ((StringBuilder) (obj3)).append("\n").append((String)((HashMap) (obj)).get("city"));
        }
        if (((HashMap) (obj)).containsKey("state"))
        {
            ((StringBuilder) (obj3)).append(", ").append((String)((HashMap) (obj)).get("state"));
        }
        if (((HashMap) (obj)).containsKey("postalcode"))
        {
            ((StringBuilder) (obj3)).append(" ").append((String)((HashMap) (obj)).get("postalcode"));
        }
        ((TextView) (obj2)).setText(((CharSequence) (obj3)));
        obj2 = new StringBuilder();
        if (((HashMap) (obj)).containsKey("phone"))
        {
            String s = (String)((HashMap) (obj)).get("phone");
            ((StringBuilder) (obj2)).append(s.substring(0, 3)).append("-").append(s.substring(3, 6)).append("-").append(s.substring(6, 10));
        }
        ((TextView) (obj1)).setText(((CharSequence) (obj2)));
        obj1 = new StringBuilder();
        if (((HashMap) (obj)).containsKey("serviceType"))
        {
            ((StringBuilder) (obj1)).append((String)((HashMap) (obj)).get("serviceType")).append(" ");
        }
        if (((HashMap) (obj)).containsKey("atmCount"))
        {
            ((StringBuilder) (obj1)).append((String)((HashMap) (obj)).get("atmCount")).append(" ATM(s)");
        }
        textview1.setText(((CharSequence) (obj1)));
        e1.b();
        e1 = (new c()).a(e1.b()).a(LocationListActivity.f(a).b().b).a();
        LocationListActivity.f(a).a(com.google.android.gms.maps.b.a(e1));
        return b;
_L2:
        j++;
          goto _L3
        j = 0;
          goto _L1
    }
}
