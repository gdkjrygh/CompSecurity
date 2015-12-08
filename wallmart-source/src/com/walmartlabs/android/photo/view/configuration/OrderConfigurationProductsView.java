// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.view.configuration;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.walmartlabs.android.photo.view.configuration:
//            OrderConfigurationProductView

public class OrderConfigurationProductsView extends LinearLayout
{
    public static interface ProductClickListener
    {

        public abstract void onCropClick(PhotoProduct photoproduct);

        public abstract void onQuantityClick(PhotoProduct photoproduct, int i);
    }


    private static final String TAG = com/walmartlabs/android/photo/view/configuration/OrderConfigurationProductsView.getSimpleName();
    private ProductClickListener mListener;
    private List mModel;
    private Map mModelToViewMap;

    public OrderConfigurationProductsView(Context context)
    {
        super(context);
        mModelToViewMap = new HashMap();
        mModel = new ArrayList();
    }

    public OrderConfigurationProductsView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mModelToViewMap = new HashMap();
        mModel = new ArrayList();
    }

    public OrderConfigurationProductsView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mModelToViewMap = new HashMap();
        mModel = new ArrayList();
    }

    public List getModel()
    {
        return mModel;
    }

    public void setModel(List list, boolean flag)
    {
        removeAllViews();
        mModel = list;
        mModelToViewMap = new HashMap();
        if (list != null && list.size() > 0)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                final PhotoProduct product = (PhotoProduct)list.next();
                OrderConfigurationProductView orderconfigurationproductview = (OrderConfigurationProductView)LayoutInflater.from(getContext()).inflate(com.walmartlabs.android.photo.R.layout.photo_configuration_product_item, this, false);
                boolean flag1;
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                orderconfigurationproductview.setHideImageView(flag1);
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                orderconfigurationproductview.setHideCropIcon(flag1);
                orderconfigurationproductview.setModel(product);
                orderconfigurationproductview.setProductViewListener(new OrderConfigurationProductView.ProductViewListener() {

                    final OrderConfigurationProductsView this$0;
                    final PhotoProduct val$product;

                    public void onCrop()
                    {
                        if (mListener != null)
                        {
                            mListener.onCropClick(product);
                        }
                    }

                    public void onDecrementClick()
                    {
                        if (mListener != null)
                        {
                            mListener.onQuantityClick(product, -1);
                        }
                    }

                    public void onIncrementClick()
                    {
                        if (mListener != null)
                        {
                            mListener.onQuantityClick(product, 1);
                        }
                    }

            
            {
                this$0 = OrderConfigurationProductsView.this;
                product = photoproduct;
                super();
            }
                });
                mModelToViewMap.put(product, orderconfigurationproductview);
                addView(orderconfigurationproductview);
            }
        } else
        {
            View view = LayoutInflater.from(getContext()).inflate(com.walmartlabs.android.photo.R.layout.photo_configuration_empty, this, false);
            if (list != null)
            {
                list = (TextView)view.findViewById(com.walmartlabs.android.photo.R.id.empty_text);
                if (PhotoUtils.hasDataConnectivity(getContext()))
                {
                    list.setText(com.walmartlabs.android.photo.R.string.photo_failed_to_load_products_generic);
                } else
                {
                    list.setText(com.walmartlabs.android.photo.R.string.photo_failed_to_load_products_network);
                }
                view.findViewById(com.walmartlabs.android.photo.R.id.progress).setVisibility(8);
            }
            addView(view);
        }
    }

    public void setProductClickListener(ProductClickListener productclicklistener)
    {
        mListener = productclicklistener;
    }

    public void setQuantities(Map map)
    {
        if (map != null)
        {
            for (Iterator iterator = mModelToViewMap.entrySet().iterator(); iterator.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Integer integer = (Integer)map.get(entry.getKey());
                int i;
                if (integer != null)
                {
                    i = integer.intValue();
                } else
                {
                    i = 0;
                }
                if (entry.getValue() != null)
                {
                    ((OrderConfigurationProductView)entry.getValue()).setQuantity(i);
                } else
                {
                    PhotoLogger.get().d(TAG, (new StringBuilder()).append("Product not found, cannot update quantity: ").append(entry.getKey()).toString());
                }
            }

        }
    }

    public void setThumbnails(Map map)
    {
        if (map != null)
        {
            for (Iterator iterator = mModelToViewMap.entrySet().iterator(); iterator.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                PhotoDrawable photodrawable = (PhotoDrawable)map.get(entry.getKey());
                if (entry.getValue() != null)
                {
                    ((OrderConfigurationProductView)entry.getValue()).setImage(photodrawable);
                } else
                {
                    PhotoLogger.get().d(TAG, (new StringBuilder()).append("Product not found, cannot update bitmap: ").append(entry.getKey()).toString());
                }
            }

        }
    }

    public void setWarnings(Map map)
    {
        if (map != null)
        {
            for (Iterator iterator = mModelToViewMap.entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                Boolean boolean1 = (Boolean)map.get(((java.util.Map.Entry) (obj)).getKey());
                if (((java.util.Map.Entry) (obj)).getValue() != null)
                {
                    obj = (OrderConfigurationProductView)((java.util.Map.Entry) (obj)).getValue();
                    boolean flag;
                    if (boolean1 != null)
                    {
                        flag = boolean1.booleanValue();
                    } else
                    {
                        flag = false;
                    }
                    ((OrderConfigurationProductView) (obj)).setWarnLowRes(flag);
                } else
                {
                    PhotoLogger.get().d(TAG, (new StringBuilder()).append("Product not found, cannot update warning: ").append(((java.util.Map.Entry) (obj)).getKey()).toString());
                }
            }

        }
    }


}
