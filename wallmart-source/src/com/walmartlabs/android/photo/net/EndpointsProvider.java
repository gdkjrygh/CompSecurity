// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;


public interface EndpointsProvider
{

    public abstract String authenticationEndpoint();

    public abstract String getBlixtServerBase();

    public abstract String ordersEndpoint();

    public abstract String photoEndpoint(String s);

    public abstract String photosEndpoint();

    public abstract String productsEndpoint();

    public abstract String storeAvailabilityEndpoint(String s);
}
