// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.giq;

import android.os.AsyncTask;
import com.coupons.mobile.networking.NetworkHandler;
import com.coupons.mobile.networking.security.CipherKey;
import java.util.HashMap;

// Referenced classes of package com.walmart.android.app.shop.giq:
//            GiqProductItem

public class GiqUpcSearch
{
    private class GetUpcInfoTask extends AsyncTask
    {

        private final OnSearchCompletedAsyncCallback mCallback;
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
            UpcSearchMessage.Request request = new UpcSearchMessage.Request();
            request.setUPC(s);
            s = new UpcSearchMessage.Response();
            if (!NetworkHandler.SendRequest(request, s, null))
            {
                return null;
            } else
            {
                return createItem(s.getResponseValues());
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

        public GetUpcInfoTask(OnSearchCompletedAsyncCallback onsearchcompletedasynccallback)
        {
            this$0 = GiqUpcSearch.this;
            super();
            mCallback = onsearchcompletedasynccallback;
        }
    }

    public static interface OnSearchCompletedAsyncCallback
    {

        public abstract void onFailure();

        public abstract void onSuccess(GiqProductItem giqproductitem);
    }


    static final String TAG = com/walmart/android/app/shop/giq/GiqUpcSearch.getSimpleName();
    private static GiqUpcSearch sInstance;

    private GiqUpcSearch()
    {
        NetworkHandler.setPID("15788");
        CipherKey.setShortKey("zhtQMXK5fol");
        CipherKey.setLongKey("C17A.%el0UmER8YNSXP9cf5F6q_$!jx gnQvZHud3TkwzpDOoIG&K@hMLysbtWVrJBa24i");
    }

    public static GiqUpcSearch getInstance()
    {
        if (sInstance == null)
        {
            sInstance = new GiqUpcSearch();
        }
        return sInstance;
    }

    public void findProductWithUpc(String s, OnSearchCompletedAsyncCallback onsearchcompletedasynccallback)
    {
        (new GetUpcInfoTask(onsearchcompletedasynccallback)).execute(new String[] {
            s
        });
    }

}
