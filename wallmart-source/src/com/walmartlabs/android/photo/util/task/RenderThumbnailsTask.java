// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.task;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmartlabs.android.photo.util.task:
//            BitmapLoadTask

public class RenderThumbnailsTask extends BitmapLoadTask
{
    public static interface RenderThumbnailsCallback
    {

        public abstract void onRendered(Map map);
    }


    private Paint mBorderPaint;
    private RenderThumbnailsCallback mCallback;
    private Paint mOverlayPaint;
    private Map mProductToCropMap;
    private Map mProductToDrawableMap;

    public RenderThumbnailsTask(Context context, PhotoSpecification photospecification, List list, RenderThumbnailsCallback renderthumbnailscallback)
    {
        super(context, 0, null);
        mOverlayPaint = new Paint();
        mBorderPaint = new Paint();
        mProductToCropMap = new HashMap();
        mProductToDrawableMap = new HashMap();
        mCallback = renderthumbnailscallback;
        mOverlayPaint.setColor(0x99000000);
        mOverlayPaint.setStyle(android.graphics.Paint.Style.FILL);
        mBorderPaint.setColor(context.getResources().getColor(com.walmartlabs.android.photo.R.color.photo_orange));
        mBorderPaint.setStyle(android.graphics.Paint.Style.STROKE);
        mBorderPaint.setStrokeWidth(3F);
        for (context = list.iterator(); context.hasNext();)
        {
            list = (PhotoProduct)context.next();
            mProductToCropMap.put(list, null);
            renderthumbnailscallback = photospecification.getProductConfigurations().iterator();
            while (renderthumbnailscallback.hasNext()) 
            {
                ProductConfiguration productconfiguration = (ProductConfiguration)renderthumbnailscallback.next();
                if (list.equals(productconfiguration.getProduct()))
                {
                    mProductToCropMap.put(productconfiguration.getProduct(), productconfiguration.getCrop());
                }
            }
        }

    }

    private PhotoDrawable addShadowOverlay(PhotoDrawable photodrawable, PhotoProduct photoproduct, Crop crop)
    {
        Bitmap bitmap;
        int k1;
        int l1;
        if (photodrawable == null || photodrawable.getBitmap() == null)
        {
            return null;
        }
        bitmap = photodrawable.getBitmap();
        k1 = bitmap.getWidth();
        l1 = bitmap.getHeight();
        photodrawable = null;
        if (crop == null) goto _L2; else goto _L1
_L1:
        int i2 = (int)((float)k1 * crop.getLeft());
        int j2 = (int)((float)l1 * crop.getTop());
        int j1 = (int)((float)k1 * crop.getRight());
        int l = (int)((float)l1 * crop.getBottom());
        int i = l;
        if (l == l1)
        {
            i = l - 1;
        }
        l = j1;
        if (j1 == k1)
        {
            l = j1 - 1;
        }
        photodrawable = new Rect(i2, j2, l, i);
_L4:
        photoproduct = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        crop = new Canvas(photoproduct);
        crop.drawBitmap(bitmap, 0.0F, 0.0F, null);
        if (photodrawable != null)
        {
            crop.save();
            crop.clipRect(photodrawable, android.graphics.Region.Op.DIFFERENCE);
            crop.drawRect(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight(), mOverlayPaint);
            crop.restore();
            crop.drawRect(((Rect) (photodrawable)).left, ((Rect) (photodrawable)).top, ((Rect) (photodrawable)).right, ((Rect) (photodrawable)).bottom, mBorderPaint);
        }
        return asDrawable(photoproduct);
_L2:
        double d;
        double d1;
        int j;
        int i1;
        if (bitmap.getHeight() > bitmap.getWidth())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            i1 = Math.min(photoproduct.getWidth(), photoproduct.getHeight());
            j = Math.max(photoproduct.getWidth(), photoproduct.getHeight());
        } else
        {
            i1 = Math.max(photoproduct.getWidth(), photoproduct.getHeight());
            j = Math.min(photoproduct.getWidth(), photoproduct.getHeight());
        }
        d = (double)i1 / (double)j;
        d1 = (double)bitmap.getWidth() / (double)bitmap.getHeight();
        if (d != d1)
        {
            if (d < d1)
            {
                j = k1 - (int)((double)l1 * d);
                photodrawable = new Rect(j / 2, 0, k1 - j / 2, l1 - 1);
            } else
            {
                int k = l1 - (int)((double)k1 * (1.0D / d));
                photodrawable = new Rect(0, k / 2, k1 - 1, l1 - k / 2);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected transient PhotoDrawable doInBackground(DevicePhoto adevicephoto[])
    {
        adevicephoto = super.doInBackground(adevicephoto);
        Iterator iterator = mProductToCropMap.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            PhotoDrawable photodrawable = addShadowOverlay(adevicephoto, (PhotoProduct)entry.getKey(), (Crop)entry.getValue());
            if (photodrawable != null)
            {
                mProductToDrawableMap.put(entry.getKey(), photodrawable);
            }
        } while (true);
        return adevicephoto;
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((DevicePhoto[])aobj);
    }

    protected void onPostExecute(PhotoDrawable photodrawable)
    {
        if (mCallback != null)
        {
            mCallback.onRendered(mProductToDrawableMap);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((PhotoDrawable)obj);
    }
}
