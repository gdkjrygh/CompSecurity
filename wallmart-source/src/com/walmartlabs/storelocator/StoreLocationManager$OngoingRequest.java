// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.storelocator;

import com.google.android.gms.common.api.GoogleApiClient;
import java.util.ArrayList;

// Referenced classes of package com.walmartlabs.storelocator:
//            StoreLocationManager

private class <init>
{

    private final ArrayList callbacks;
    private GoogleApiClient googleApiClient;
    final StoreLocationManager this$0;



/*
    static GoogleApiClient access$702( , GoogleApiClient googleapiclient)
    {
        .googleApiClient = googleapiclient;
        return googleapiclient;
    }

*/


    private googleApiClient()
    {
        this$0 = StoreLocationManager.this;
        super();
        callbacks = new ArrayList();
    }

    callbacks(callbacks callbacks1)
    {
        this();
    }
}
