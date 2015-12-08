// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.maps.model.LatLng;

public interface StoreSearchInterface
{

    public abstract void finishSearch();

    public abstract boolean onBackPressed();

    public abstract boolean onSearchRequested();

    public abstract void setLocation(LatLng latlng);

    public abstract void setOnSuggestionSelectedListener(com.walmart.android.search.SearchManager.OnSearchExecutedListener onsearchexecutedlistener);
}
