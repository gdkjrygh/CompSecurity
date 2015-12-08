// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;

import android.os.AsyncTask;
import com.coupons.mobile.networking.NetworkHandler;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.shop.giq:
//            GiqUpcSearch, GiqProductItem

private class mCallback extends AsyncTask
{

    private final edAsyncCallback mCallback;
    final GiqUpcSearch this$0;

    private GiqProductItem createItem(HashMap hashmap)
    {
        GiqProductItem giqproductitem = new GiqProductItem();
        giqproductitem.upc = getMapValue(hashmap, "UPC");
        giqproductitem.brand = getMapValue(hashmap, "Brand");
        giqproductitem.description = getMapValue(hashmap, "Description");
        giqproductitem.itemDetail = getMapValue(hashmap, "ItemDetail");
        giqproductitem.size = getMapValue(hashmap, "Size");
        giqproductitem.manufacturer = getMapValue(hashmap, "ManufacturerName");
        return giqproductitem;
    }

    private String getMapValue(HashMap hashmap, String s)
    {
        s = (String)hashmap.get(s);
        hashmap = s;
        if (s == null)
        {
            hashmap = "";
        }
        return hashmap;
    }

    protected transient GiqProductItem doInBackground(String as[])
    {
        return networkQuery(as[0]);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected GiqProductItem networkQuery(String s)
    {
        se se = new it>();
        se.UPC(s);
        s = new nit>();
        if (!NetworkHandler.SendRequest(se, s, null))
        {
            return null;
        } else
        {
            return createItem(s.tResponseValues());
        }
    }

    protected void onPostExecute(GiqProductItem giqproductitem)
    {
        if (giqproductitem != null)
        {
            mCallback.onSuccess(giqproductitem);
            return;
        } else
        {
            mCallback.onFailure();
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((GiqProductItem)obj);
    }

    public edAsyncCallback(edAsyncCallback edasynccallback)
    {
        this$0 = GiqUpcSearch.this;
        super();
        mCallback = edasynccallback;
    }
}
