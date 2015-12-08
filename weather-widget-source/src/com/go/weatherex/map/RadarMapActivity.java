// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.map;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;

// Referenced classes of package com.go.weatherex.map:
//            b, a

public class RadarMapActivity extends BaseFragmentActivity
{

    public RadarMapActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        Object obj = bundle.getStringExtra("city_name");
        bundle = b.a(bundle.getStringExtra("radar_map_url"));
        obj = a.a(((String) (obj)));
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        fragmenttransaction.add(0x1020002, bundle, com/go/weatherex/map/b.getName());
        fragmenttransaction.add(0x1020002, ((android.support.v4.app.Fragment) (obj)), com/go/weatherex/map/b.getName());
        fragmenttransaction.commit();
    }
}
