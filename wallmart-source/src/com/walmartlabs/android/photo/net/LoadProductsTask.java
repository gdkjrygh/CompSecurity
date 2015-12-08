// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import android.os.AsyncTask;
import com.walmartlabs.android.photo.model.DomainMapper;
import com.walmartlabs.android.photo.model.wire.WireProduct;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import com.walmartlabs.android.photo.util.SimpleMemoryCache;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.type.TypeReference;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoClient, PhotoResponse

public class LoadProductsTask extends AsyncTask
{
    public static interface ProductsUpdateCallback
    {

        public abstract void onUpdated(List list);
    }


    private static final String TAG = com/walmartlabs/android/photo/net/LoadProductsTask.getSimpleName();
    private ProductsUpdateCallback mCallback;
    private Context mContext;

    public LoadProductsTask(Context context, ProductsUpdateCallback productsupdatecallback)
    {
        mContext = context;
        mCallback = productsupdatecallback;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient List doInBackground(Void avoid[])
    {
        avoid = SimpleMemoryCache.get().getProducts();
        if (avoid == null || avoid.size() <= 0) goto _L2; else goto _L1
_L1:
        PhotoLogger.get().d(TAG, "Products retrieved from cache");
_L4:
        return avoid;
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList();
        avoid = arraylist;
        if (!PhotoClient.get(mContext).checkConnectivity()) goto _L4; else goto _L3
_L3:
        avoid = arraylist;
        if (!PhotoClient.get(mContext).checkBlixtConnectivity()) goto _L4; else goto _L5
_L5:
        Object obj;
        try
        {
            avoid = PhotoClient.get(mContext).getProducts();
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("Request failed (will return 0 products): ").append(avoid).toString());
            return arraylist;
        }
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        if (!avoid.isValid() || avoid.getHttpStatus() != 200 || avoid.getEntity() == null)
        {
            break MISSING_BLOCK_LABEL_217;
        }
        avoid = PhotoObjectMapper.get().readFromString(avoid.getEntity(), new TypeReference() {

            final LoadProductsTask this$0;

            
            {
                this$0 = LoadProductsTask.this;
                super();
            }
        });
        if (avoid == null)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        avoid = avoid.iterator();
_L6:
        do
        {
            if (!avoid.hasNext())
            {
                break MISSING_BLOCK_LABEL_228;
            }
            obj = (WireProduct)avoid.next();
            obj = DomainMapper.get(mContext).mapPhotoProductFromWireProduct(((WireProduct) (obj)));
        } while (obj == null);
        arraylist.add(obj);
          goto _L6
        PhotoLogger.get().d(TAG, "Could not load products from response");
        avoid = arraylist;
        if (arraylist.size() <= 0) goto _L4; else goto _L7
_L7:
        SimpleMemoryCache.get().putProducts(arraylist);
        return arraylist;
    }

    protected volatile void onCancelled(Object obj)
    {
        onCancelled((List)obj);
    }

    protected void onCancelled(List list)
    {
        PhotoLogger.get().d(TAG, "Task was cancelled");
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
        mCallback.onUpdated(list);
    }

}
