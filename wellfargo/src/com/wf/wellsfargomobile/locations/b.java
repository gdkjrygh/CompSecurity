// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.location.d;
import com.google.android.gms.location.i;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.a.a;
import com.wf.wellsfargomobile.util.SendAndForgetRequestService;
import java.util.ArrayList;

public class b extends AsyncTask
    implements q, r
{

    private Context a;
    private n b;
    private String c;

    public b()
    {
    }

    private long a()
    {
        return a.getSharedPreferences("WF_PREFERENCES", 0).getLong("last_location_update_time_pref", 0L);
    }

    private void a(long l)
    {
        android.content.SharedPreferences.Editor editor = a.getSharedPreferences("WF_PREFERENCES", 0).edit();
        editor.putLong("last_location_update_time_pref", l);
        editor.apply();
    }

    protected transient Void a(Context acontext[])
    {
        if (acontext.length == 1)
        {
            a = acontext[0];
            if (System.currentTimeMillis() - a() >= 0x5265c00L && WFApp.q())
            {
                c = a.getSharedPreferences("WF_PREFERENCES", 0).getString("gcm_registration_id_pref", null);
                if (c != null)
                {
                    b = (new o(a)).a(this).a(this).a(i.a).b();
                    b.b();
                    return null;
                }
            }
        }
        return null;
    }

    public void a(int j)
    {
    }

    public void a(Bundle bundle)
    {
        Object obj = i.b.a(b);
        if (obj != null)
        {
            a(System.currentTimeMillis());
            bundle = new ArrayList();
            ArrayList arraylist = new ArrayList();
            bundle.add("pnDeviceLat");
            arraylist.add(String.valueOf(((Location) (obj)).getLatitude()));
            bundle.add("pnDeviceLong");
            arraylist.add(String.valueOf(((Location) (obj)).getLongitude()));
            bundle.add("pnDeviceToken");
            arraylist.add(c);
            obj = new Bundle();
            ((Bundle) (obj)).putStringArrayList("KEY_SEND_FORGET_PARAM_NAMES", bundle);
            ((Bundle) (obj)).putStringArrayList("KEY_SEND_FORGET_PARAM_VALUES", arraylist);
            bundle = new Intent(a, com/wf/wellsfargomobile/util/SendAndForgetRequestService);
            bundle.putExtra("KEY_SEND_FORGET_URL", (new StringBuilder()).append(com.wf.wellsfargomobile.a.a.a()).append("/signOn/locationUpdate.action").toString());
            bundle.putExtra("KEY_SEND_FORGET_MODE", "POST");
            bundle.putExtra("KEY_SEND_FORGET_PARAM_NAMES", "pnDeviceLat");
            bundle.putExtra("KEY_SEND_FORGET_PARAM_BUNDLE", ((Bundle) (obj)));
            a.startService(bundle);
        }
        b.c();
    }

    public void a(ConnectionResult connectionresult)
    {
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Context[])aobj);
    }
}
