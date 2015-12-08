// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.gms.dynamic:
//            zza, LifecycleDelegate

class zzajo
    implements a
{

    final zza zzajl;
    final Bundle zzajo;
    final FrameLayout zzajp;
    final LayoutInflater zzajq;
    final ViewGroup zzajr;

    public int getState()
    {
        return 2;
    }

    public void zzb(LifecycleDelegate lifecycledelegate)
    {
        zzajp.removeAllViews();
        zzajp.addView(zza.zzb(zzajl).onCreateView(zzajq, zzajr, zzajo));
    }

    cleDelegate(zza zza1, FrameLayout framelayout, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        zzajl = zza1;
        zzajp = framelayout;
        zzajq = layoutinflater;
        zzajr = viewgroup;
        zzajo = bundle;
        super();
    }
}
