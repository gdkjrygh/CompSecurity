// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmartlabs.android.photo.util:
//            PhotoUtils

public class OrderUtils
{

    public OrderUtils()
    {
    }

    public static Map cropInfoMap(PendingOrder pendingorder, DevicePhoto devicephoto)
    {
        HashMap hashmap = new HashMap();
        pendingorder = pendingorder.getProductSelection().iterator();
        do
        {
            if (!pendingorder.hasNext())
            {
                break;
            }
            Object obj = (PhotoSpecification)pendingorder.next();
            if (((PhotoSpecification) (obj)).getPhoto().equals(devicephoto) || devicephoto == null)
            {
                ProductConfiguration productconfiguration;
                for (obj = ((PhotoSpecification) (obj)).getProductConfigurations().iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(productconfiguration.getProduct(), productconfiguration.getCrop()))
                {
                    productconfiguration = (ProductConfiguration)((Iterator) (obj)).next();
                }

            }
        } while (devicephoto != null);
        return hashmap;
    }

    public static boolean hasLowResWarnings(PendingOrder pendingorder)
    {
        pendingorder = pendingorder.getProductSelection().iterator();
label0:
        do
        {
            if (pendingorder.hasNext())
            {
                PhotoSpecification photospecification = (PhotoSpecification)pendingorder.next();
                Iterator iterator = photospecification.getProductConfigurations().iterator();
                ProductConfiguration productconfiguration;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    productconfiguration = (ProductConfiguration)iterator.next();
                } while (PhotoUtils.resolutionOk(photospecification.getPhoto(), productconfiguration.getProduct(), productconfiguration.getCrop()));
                break;
            } else
            {
                return false;
            }
        } while (true);
        return true;
    }

    public static int photosCount(PendingOrder pendingorder)
    {
        return pendingorder.getProductSelection().size();
    }

    public static int printsCount(PendingOrder pendingorder)
    {
        int i;
        i = 0;
        pendingorder = pendingorder.getProductSelection().iterator();
        do
        {
label0:
            {
                if (!pendingorder.hasNext())
                {
                    break label0;
                }
                Iterator iterator = ((PhotoSpecification)pendingorder.next()).getProductConfigurations().iterator();
                int j = i;
                do
                {
                    i = j;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    j += ((ProductConfiguration)iterator.next()).getQuantity();
                } while (true);
            }
        } while (true);
        return i;
    }

    public static Map quantitiesMap(PendingOrder pendingorder, DevicePhoto devicephoto)
    {
        HashMap hashmap = new HashMap();
        pendingorder = pendingorder.getProductSelection().iterator();
        do
        {
            if (!pendingorder.hasNext())
            {
                break;
            }
            Object obj = (PhotoSpecification)pendingorder.next();
            if (((PhotoSpecification) (obj)).getPhoto().equals(devicephoto) || devicephoto == null)
            {
                ProductConfiguration productconfiguration;
                PhotoProduct photoproduct;
                for (obj = ((PhotoSpecification) (obj)).getProductConfigurations().iterator(); ((Iterator) (obj)).hasNext(); hashmap.put(photoproduct, Integer.valueOf(((Integer)hashmap.get(photoproduct)).intValue() + productconfiguration.getQuantity())))
                {
                    productconfiguration = (ProductConfiguration)((Iterator) (obj)).next();
                    photoproduct = productconfiguration.getProduct();
                    if (!hashmap.containsKey(photoproduct))
                    {
                        hashmap.put(photoproduct, Integer.valueOf(0));
                    }
                }

            }
        } while (devicephoto != null);
        return hashmap;
    }

    public static double totalDue(PendingOrder pendingorder)
    {
        double d;
        d = 0.0D;
        pendingorder = pendingorder.getProductSelection().iterator();
        do
        {
label0:
            {
                if (!pendingorder.hasNext())
                {
                    break label0;
                }
                Iterator iterator = ((PhotoSpecification)pendingorder.next()).getProductConfigurations().iterator();
                double d1 = d;
                do
                {
                    d = d1;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ProductConfiguration productconfiguration = (ProductConfiguration)iterator.next();
                    d1 += (double)productconfiguration.getQuantity() * productconfiguration.getProduct().getPrice();
                } while (true);
            }
        } while (true);
        return d;
    }

    public static int uploadsCount(PendingOrder pendingorder)
    {
        int i = 0;
        pendingorder = pendingorder.getProductSelection().iterator();
        do
        {
            if (!pendingorder.hasNext())
            {
                break;
            }
            if (((PhotoSpecification)pendingorder.next()).nonZeroQuantity())
            {
                i++;
            }
        } while (true);
        return i;
    }
}
