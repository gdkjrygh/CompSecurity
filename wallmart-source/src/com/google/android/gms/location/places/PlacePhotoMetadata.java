// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.Freezable;

public interface PlacePhotoMetadata
    extends Freezable
{

    public abstract CharSequence getAttributions();

    public abstract int getMaxHeight();

    public abstract int getMaxWidth();

    public abstract PendingResult getPhoto(GoogleApiClient googleapiclient);

    public abstract PendingResult getScaledPhoto(GoogleApiClient googleapiclient, int i, int j);
}
