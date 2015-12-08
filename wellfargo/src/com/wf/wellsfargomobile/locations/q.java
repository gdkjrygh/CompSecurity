// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.os.Bundle;
import android.support.v4.app.Fragment;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationTabListFragment

class q
{

    final LocationTabListFragment a;
    private String b;
    private Class c;
    private Bundle d;
    private Fragment e;

    q(LocationTabListFragment locationtablistfragment, String s, Class class1, Bundle bundle)
    {
        a = locationtablistfragment;
        super();
        b = s;
        c = class1;
        d = bundle;
    }

    static Fragment a(q q1, Fragment fragment)
    {
        q1.e = fragment;
        return fragment;
    }

    static String a(q q1)
    {
        return q1.b;
    }

    static Fragment b(q q1)
    {
        return q1.e;
    }

    static Class c(q q1)
    {
        return q1.c;
    }

    static Bundle d(q q1)
    {
        return q1.d;
    }
}
