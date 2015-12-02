// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface ICameraUpdateFactoryDelegate
    extends IInterface
{

    public abstract d newCameraPosition(CameraPosition cameraposition);

    public abstract d newLatLng(LatLng latlng);

    public abstract d newLatLngBounds(LatLngBounds latlngbounds, int i);

    public abstract d zoomBy(float f);

    public abstract d zoomTo(float f);
}
