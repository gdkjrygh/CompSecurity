// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.location.places:
//            AddPlaceRequest, AutocompleteFilter

public interface GeoDataApi
{

    public abstract PendingResult addPlace(GoogleApiClient googleapiclient, AddPlaceRequest addplacerequest);

    public abstract PendingResult getAutocompletePredictions(GoogleApiClient googleapiclient, String s, LatLngBounds latlngbounds, AutocompleteFilter autocompletefilter);

    public transient abstract PendingResult getPlaceById(GoogleApiClient googleapiclient, String as[]);

    public abstract PendingResult getPlacePhotos(GoogleApiClient googleapiclient, String s);
}
