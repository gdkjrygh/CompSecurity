// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.g;
import com.go.weatherex.home.a.d;

// Referenced classes of package com.go.weatherex.setting:
//            PersonalizeSettingsActivity, o

class n extends g
{

    final PersonalizeSettingsActivity b;

    public n(PersonalizeSettingsActivity personalizesettingsactivity, FragmentActivity fragmentactivity)
    {
        b = personalizesettingsactivity;
        super(fragmentactivity);
    }

    protected void a(a a1, Class class1, Bundle bundle)
    {
        Object obj = a();
        bundle = (a)Fragment.instantiate(a, class1.getName(), bundle);
        bundle.b(a);
        obj = ((FragmentManager) (obj)).beginTransaction();
        ((FragmentTransaction) (obj)).setCustomAnimations(0x7f04000b, 0x7f04000d, 0x7f04000b, 0x7f04000d);
        ((FragmentTransaction) (obj)).hide(a1);
        ((FragmentTransaction) (obj)).add(0x7f090483, bundle, class1.getName());
        ((FragmentTransaction) (obj)).addToBackStack(class1.getName());
        ((FragmentTransaction) (obj)).commit();
    }

    public void e()
    {
        d d1 = new d();
        d1.b(a);
        d1.setArguments(d.a(com.go.weatherex.setting.PersonalizeSettingsActivity.a(b)));
        o o1 = new o();
        o1.b(a);
        FragmentTransaction fragmenttransaction = a().beginTransaction();
        fragmenttransaction.add(0x7f090483, d1, com/go/weatherex/home/a/d.getName());
        fragmenttransaction.add(0x7f090483, o1, com/go/weatherex/setting/o.getName());
        fragmenttransaction.commit();
    }
}
