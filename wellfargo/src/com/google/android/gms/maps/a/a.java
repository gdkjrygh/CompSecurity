// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.a.j;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface a
    extends IInterface
{

    public abstract j a();

    public abstract j a(float f);

    public abstract j a(float f, float f1);

    public abstract j a(float f, int i, int j);

    public abstract j a(CameraPosition cameraposition);

    public abstract j a(LatLng latlng);

    public abstract j a(LatLng latlng, float f);

    public abstract j a(LatLngBounds latlngbounds, int i);

    public abstract j a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract j b();

    public abstract j b(float f);
}
