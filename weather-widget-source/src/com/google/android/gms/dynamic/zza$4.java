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

class zzamU
    implements a
{

    final zza zzamR;
    final Bundle zzamU;
    final FrameLayout zzamV;
    final LayoutInflater zzamW;
    final ViewGroup zzamX;

    public int getState()
    {
        return 2;
    }

    public void zzb(LifecycleDelegate lifecycledelegate)
    {
        zzamV.removeAllViews();
        zzamV.addView(zza.zzb(zzamR).onCreateView(zzamW, zzamX, zzamU));
    }

    cleDelegate(zza zza1, FrameLayout framelayout, LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        zzamR = zza1;
        zzamV = framelayout;
        zzamW = layoutinflater;
        zzamX = viewgroup;
        zzamU = bundle;
        super();
    }
}
