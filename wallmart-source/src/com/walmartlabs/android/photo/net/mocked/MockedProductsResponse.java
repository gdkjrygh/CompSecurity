// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net.mocked;

import android.content.Context;
import android.content.res.AssetManager;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.util.PhotoLogger;
import org.apache.commons.io.IOUtils;

public class MockedProductsResponse extends PhotoResponse
{

    private static final String TAG = com/walmartlabs/android/photo/net/mocked/MockedProductsResponse.getSimpleName();

    public MockedProductsResponse(Context context)
    {
        try
        {
            setEntity(IOUtils.toString(context.getAssets().open("mockdata/photo_products_ok.json")));
            setHttpStatus(200);
            setValid(true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            setHttpStatus(500);
            setValid(true);
        }
        if (getHttpStatus() == 200)
        {
            PhotoLogger.get().d(TAG, "Successfully loaded mocked products response");
            return;
        } else
        {
            PhotoLogger.get().d(TAG, "Failed to load mocked products response");
            return;
        }
    }

    public static MockedProductsResponse createWithDelay(Context context, long l)
    {
        try
        {
            Thread.sleep(l);
        }
        catch (InterruptedException interruptedexception) { }
        return new MockedProductsResponse(context);
    }

}
