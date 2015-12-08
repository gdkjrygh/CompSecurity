// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import com.google.android.apps.youtube.core.client.p;
import com.google.android.apps.youtube.core.utils.PackageUtil;
import com.google.android.youtube.j;
import com.google.android.youtube.l;

// Referenced classes of package com.google.android.apps.youtube.app:
//            YouTubeApplication, ax, w, x, 
//            y

public class DebugOnlineAdActivity extends YouTubeActivity
{

    private p n;
    private CheckBox o;
    private CheckBox p;
    private Spinner q;
    private ArrayAdapter r;
    private boolean s;

    public DebugOnlineAdActivity()
    {
    }

    static CheckBox a(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.o;
    }

    static p b(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.n;
    }

    static void c(DebugOnlineAdActivity debugonlineadactivity)
    {
        debugonlineadactivity.e();
    }

    static boolean d(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.s;
    }

    static CheckBox e(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.p;
    }

    private void e()
    {
        p.setEnabled(o.isChecked());
        Spinner spinner = q;
        boolean flag;
        if (p.isChecked() && o.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        spinner.setEnabled(flag);
    }

    static Spinner f(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.q;
    }

    static ArrayAdapter g(DebugOnlineAdActivity debugonlineadactivity)
    {
        return debugonlineadactivity.r;
    }

    public final String d()
    {
        return null;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (!PackageUtil.b(this))
        {
            finish();
        }
        setContentView(l.J);
        n = new p(((YouTubeApplication)getApplication()).d().aP());
        o = (CheckBox)findViewById(j.aT);
        p = (CheckBox)findViewById(j.fT);
        q = (Spinner)findViewById(j.e);
        r = new ArrayAdapter(this, 0x1090008, com.google.android.apps.youtube.core.client.DebugOnlyVmapAdRequester.ForceAdType.values());
        r.setDropDownViewResource(0x1090009);
        q.setAdapter(r);
        s = n.a();
        o.setOnClickListener(new w(this));
        p.setOnClickListener(new x(this));
        q.setOnItemSelectedListener(new y(this));
    }

    protected void onResume()
    {
        super.onResume();
        o.setChecked(n.a());
        com.google.android.apps.youtube.core.client.DebugOnlyVmapAdRequester.ForceAdType forceadtype = n.b();
        CheckBox checkbox = p;
        boolean flag;
        if (forceadtype != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        if (forceadtype != null)
        {
            q.setSelection(forceadtype.ordinal());
        }
        e();
    }
}
