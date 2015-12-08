// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.themestore:
//            t, p

public class l extends a
{

    private int a;
    private int b;
    private t c;
    private p d;

    public l()
    {
    }

    public static l a(Activity activity, int i, int j)
    {
        l l1 = new l();
        l1.b(activity);
        activity = new Bundle();
        activity.putInt("theme_tab", i);
        activity.putInt("theme_type", j);
        l1.setArguments(activity);
        return l1;
    }

    private void b()
    {
        FragmentTransaction fragmenttransaction;
        fragmenttransaction = getChildFragmentManager().beginTransaction();
        fragmenttransaction.setCustomAnimations(0x7f04000c, 0x7f04000d, 0x7f04000c, 0x7f04000d);
        b;
        JVM INSTR tableswitch 1 2: default 48
    //                   1 54
    //                   2 75;
           goto _L1 _L2 _L3
_L1:
        fragmenttransaction.commit();
        return;
_L2:
        fragmenttransaction.show(c);
        fragmenttransaction.hide(d);
        continue; /* Loop/switch isn't completed */
_L3:
        fragmenttransaction.show(d);
        fragmenttransaction.hide(c);
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void b(Bundle bundle)
    {
        a = bundle.getInt("theme_type", 1);
        b = bundle.getInt("theme_tab", 1);
    }

    protected void b(int i, Object obj)
    {
        switch (i)
        {
        default:
            return;

        case 4: // '\004'
            b = ((Integer)obj).intValue();
            break;
        }
        b();
    }

    protected void f()
    {
        super.f();
        if (!isDetached());
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        b(getArguments());
        c = com.go.weatherex.themestore.t.a(getActivity(), a);
        d = com.go.weatherex.themestore.p.a(getActivity(), a);
        bundle = getChildFragmentManager().beginTransaction();
        bundle.add(0x7f0903a4, c);
        bundle.add(0x7f0903a4, d);
        bundle.commit();
        b();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new int[] {
            4
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030097, viewgroup, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
    }
}
