// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.maps.model.LatLng;

public interface l
    extends IInterface
{

    public abstract String getId();

    public abstract LatLng getPosition();

    public abstract boolean h(l l1);

    public abstract int hashCodeRemote();

    public abstract void hideInfoWindow();

    public abstract void n(d d);

    public abstract void setPosition(LatLng latlng);

    public abstract void setVisible(boolean flag);

    public abstract void showInfoWindow();
}
