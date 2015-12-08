// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface a
    extends IInterface
{

    public abstract k a();

    public abstract k a(float f);

    public abstract k a(float f, float f1);

    public abstract k a(float f, int i, int j);

    public abstract k a(CameraPosition cameraposition);

    public abstract k a(LatLng latlng);

    public abstract k a(LatLng latlng, float f);

    public abstract k a(LatLngBounds latlngbounds, int i);

    public abstract k a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract k b();

    public abstract k b(float f);
}
