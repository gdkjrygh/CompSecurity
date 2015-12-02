// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.b;

public interface ni
    extends IInterface
{

    public abstract void S(boolean flag);

    public abstract void a(LocationRequest locationrequest, b b);

    public abstract void a(b b);

    public abstract Location bZ(String s);
}
