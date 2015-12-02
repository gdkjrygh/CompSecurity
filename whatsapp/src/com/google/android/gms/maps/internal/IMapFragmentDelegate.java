// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.GoogleMapOptions;

// Referenced classes of package com.google.android.gms.maps.internal:
//            m

public interface IMapFragmentDelegate
    extends IInterface
{

    public abstract void getMapAsync(m m);

    public abstract void onCreate(Bundle bundle);

    public abstract d onCreateView(d d, d d1, Bundle bundle);

    public abstract void onDestroy();

    public abstract void onDestroyView();

    public abstract void onInflate(d d, GoogleMapOptions googlemapoptions, Bundle bundle);

    public abstract void onLowMemory();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void onSaveInstanceState(Bundle bundle);
}
