// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model;

import android.content.Context;
import android.text.TextUtils;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.Crop;
import com.walmartlabs.android.photo.model.order.Order;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.order.ServerError;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.model.store.StoreStatus;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.model.wire.WireOrder;
import com.walmartlabs.android.photo.model.wire.WirePendingOrder;
import com.walmartlabs.android.photo.model.wire.WireProduct;
import com.walmartlabs.android.photo.model.wire.WireServerError;
import com.walmartlabs.android.photo.model.wire.WireStoreStatus;
import com.walmartlabs.android.photo.net.EndpointsFactory;
import com.walmartlabs.android.photo.net.EndpointsProvider;
import com.walmartlabs.android.photo.util.PhotoDigest;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class DomainMapper
{

    private static final String TAG = com/walmartlabs/android/photo/model/DomainMapper.getSimpleName();
    private static DomainMapper sInstance;
    private Context mContext;

    private DomainMapper(Context context)
    {
        mContext = context;
    }

    public static DomainMapper get(Context context)
    {
        com/walmartlabs/android/photo/model/DomainMapper;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            sInstance = new DomainMapper(context.getApplicationContext());
        }
        context = sInstance;
        com/walmartlabs/android/photo/model/DomainMapper;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public Order mapOrderFromWireOrder(WireOrder wireorder)
    {
        if (wireorder != null)
        {
            Order order = new Order();
            order.setOrderNumber(wireorder.getOrderNumber());
            order.setRawResultCode(wireorder.getResultCode());
            order.setSuccessful("SUCCESS".equalsIgnoreCase(wireorder.getResultCode()));
            if (wireorder.getPickupTime() != null)
            {
                Object obj = wireorder.getPickupTime().getLocalDate();
                String s = wireorder.getPickupTime().getLocalTime();
                String s1 = wireorder.getPickupTime().getLocalTimeZone();
                order.setRawLocalDateString(((String) (obj)));
                order.setRawLocalTimeString(s);
                order.setRawLocalTimeZoneString(s1);
                SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss'Z'");
                simpledateformat.setTimeZone(TimeZone.getTimeZone("GMT"));
                try
                {
                    order.setGMTPickupTime(simpledateformat.parse(wireorder.getPickupTime().getGmtTimeReturn()));
                }
                catch (ParseException parseexception)
                {
                    PhotoLogger.get().d(TAG, (new StringBuilder()).append("mapOrderFromWireOrder(): Failed to parse GMT date: ").append(wireorder.getPickupTime().getGmtTimeReturn()).toString());
                }
                if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
                {
                    wireorder = (new StringBuilder()).append(((String) (obj)).trim()).append(" ").append(s.trim()).append(" ").append(s1.trim()).toString();
                    obj = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss z");
                    try
                    {
                        order.setLocalPickupTime(((SimpleDateFormat) (obj)).parse(wireorder));
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        PhotoLogger.get().d(TAG, (new StringBuilder()).append("mapOrderFromWireOrder(): Failed to parse local date: ").append(wireorder).toString());
                        return order;
                    }
                    return order;
                } else
                {
                    PhotoLogger.get().d(TAG, (new StringBuilder()).append("Cannot parse local time (").append(((String) (obj))).append(" ").append(s).append(" ").append(s1).append(")").toString());
                    return order;
                }
            } else
            {
                PhotoLogger.get().d(TAG, "Cannot parse pickup time (null)");
                return order;
            }
        } else
        {
            return null;
        }
    }

    public PhotoProduct mapPhotoProductFromWireProduct(WireProduct wireproduct)
    {
        if (wireproduct != null)
        {
            double d = (double)wireproduct.getPrice() / 100D;
            return new PhotoProduct(wireproduct.getDescription(), wireproduct.getShortDescription(), wireproduct.getSku(), d, wireproduct.getWidth(), wireproduct.getHeight(), wireproduct.getDpi());
        } else
        {
            return null;
        }
    }

    public ServerError mapServerErrorFromWireError(WireServerError wireservererror)
    {
        if (wireservererror != null)
        {
            ServerError servererror = new ServerError();
            servererror.setMessage(wireservererror.getMessage());
            servererror.setStatusCode(wireservererror.getStatusCode());
            servererror.setError(wireservererror.getError());
            return servererror;
        } else
        {
            return null;
        }
    }

    public StoreStatus mapStoreStatusFromWireStoreStatus(WireStoreStatus wirestorestatus)
    {
        if (wirestorestatus != null)
        {
            StoreStatus storestatus = new StoreStatus();
            storestatus.setOnline("SERVICE_ONLINE".equals(wirestorestatus.getStatus()));
            storestatus.setStoreNumber(wirestorestatus.getStoreNumber());
            return storestatus;
        } else
        {
            return null;
        }
    }

    public WirePendingOrder mapWirePendingOrderFromPendingOrder(PendingOrder pendingorder)
        throws com.walmartlabs.android.photo.util.PhotoDigest.DigestException
    {
label0:
        {
            if (pendingorder == null)
            {
                break label0;
            }
            WirePendingOrder wirependingorder = new WirePendingOrder();
            com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order order = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order();
            Object obj = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store();
            Object obj1 = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address();
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address) (obj1)).setStreetAddress(pendingorder.getStore().getStreet());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address) (obj1)).setCity(pendingorder.getStore().getCity());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address) (obj1)).setState(pendingorder.getStore().getState());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address) (obj1)).setZipCode(pendingorder.getStore().getZip());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store) (obj)).setAddress(((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store.Address) (obj1)));
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store) (obj)).setPhone(pendingorder.getStore().getPhone());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store) (obj)).setNumber(Integer.parseInt(pendingorder.getStore().getId()));
            order.setStore(((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Store) (obj)));
            obj = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer();
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setEmail(pendingorder.getContact().getEmail());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setId(pendingorder.getContact().getId());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setFirstName(pendingorder.getContact().getFirstName());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setLastName(pendingorder.getContact().getLastName());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setPhone(pendingorder.getContact().getPhone());
            ((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)).setCloudId(pendingorder.getCloudId());
            order.setCustomer(((com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.Customer) (obj)));
            obj = new ArrayList();
            int i = 1;
            obj1 = pendingorder.getProductSelection().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                PhotoSpecification photospecification = (PhotoSpecification)((Iterator) (obj1)).next();
                Iterator iterator = photospecification.getProductConfigurations().iterator();
                int j = i;
                do
                {
                    i = j;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    ProductConfiguration productconfiguration = (ProductConfiguration)iterator.next();
                    if (productconfiguration.getQuantity() > 0)
                    {
                        com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem orderitem = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem();
                        orderitem.setQuantity(productconfiguration.getQuantity());
                        orderitem.setSku(productconfiguration.getProduct().getProductIdentifier());
                        orderitem.setLineItemNumber(j);
                        com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem.Photo photo = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem.Photo();
                        photo.setId(photospecification.getPhoto().getUserAugmentedUniqueId(mContext, pendingorder.getContact()));
                        photo.setMd5Sum(PhotoDigest.md5(new File(photospecification.getPhoto().getLocation())));
                        photo.setSize(photospecification.getPhoto().getSize());
                        photo.setFilename(photospecification.getPhoto().getName());
                        photo.setUrl(EndpointsFactory.getDefaultEndpoints(mContext).photoEndpoint(photospecification.getPhoto().getUserAugmentedUniqueId(mContext, pendingorder.getContact())));
                        orderitem.setPhoto(photo);
                        orderitem.setProjectedDpi(PhotoUtils.getProjectedDpi(photospecification.getPhoto(), productconfiguration.getProduct(), productconfiguration.getCrop()));
                        if (productconfiguration.getCrop() != null)
                        {
                            com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem.Crop crop = new com.walmartlabs.android.photo.model.wire.WirePendingOrder.Order.OrderItem.Crop();
                            crop.setLeft(productconfiguration.getCrop().getLeft());
                            crop.setTop(productconfiguration.getCrop().getTop());
                            crop.setRight(productconfiguration.getCrop().getRight());
                            crop.setBottom(productconfiguration.getCrop().getBottom());
                            orderitem.setCrop(crop);
                        }
                        ((ArrayList) (obj)).add(orderitem);
                        j++;
                    }
                } while (true);
            } while (true);
            order.setLineItems(((ArrayList) (obj)));
            wirependingorder.setOrder(order);
            return wirependingorder;
        }
        return null;
    }

}
