// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.internal.l;

// Referenced classes of package com.google.android.gms.maps.internal:
//            IProjectionDelegate, IUiSettingsDelegate, f, h, 
//            j, n

public interface IGoogleMapDelegate
    extends IInterface
{

    public abstract l addMarker(MarkerOptions markeroptions);

    public abstract void animateCamera(d d);

    public abstract void clear();

    public abstract CameraPosition getCameraPosition();

    public abstract Location getMyLocation();

    public abstract IProjectionDelegate getProjection();

    public abstract IUiSettingsDelegate getUiSettings();

    public abstract boolean isTrafficEnabled();

    public abstract void moveCamera(d d);

    public abstract boolean setIndoorEnabled(boolean flag);

    public abstract void setMapType(int i);

    public abstract void setMyLocationEnabled(boolean flag);

    public abstract void setOnCameraChangeListener(f f);

    public abstract void setOnInfoWindowClickListener(h h);

    public abstract void setOnMapClickListener(j j);

    public abstract void setOnMarkerClickListener(n n);

    public abstract void setTrafficEnabled(boolean flag);

    public abstract void stopAnimation();
}
