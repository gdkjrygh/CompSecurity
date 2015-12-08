// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.model.user.Store;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.model.order:
//            PhotoSpecification, ProductConfiguration

public class PendingOrder
    implements Parcelable
{
    public static interface PendingOrderListener
    {

        public abstract void onOrderUpdated();
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PendingOrder createFromParcel(Parcel parcel)
        {
            return new PendingOrder(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PendingOrder[] newArray(int i)
        {
            return new PendingOrder[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    public static final String EXTRA_ORDER = "order";
    private String mCloudId;
    private Contact mContact;
    private PendingOrderListener mListener;
    private List mProducts;
    private Store mStore;

    public PendingOrder()
    {
        mProducts = new ArrayList();
    }

    public PendingOrder(Parcel parcel)
    {
        mProducts = new ArrayList();
        mContact = (Contact)parcel.readParcelable(com/walmartlabs/android/photo/model/user/Contact.getClassLoader());
        mStore = (Store)parcel.readParcelable(com/walmartlabs/android/photo/model/user/Store.getClassLoader());
        mCloudId = parcel.readString();
        mProducts = parcel.readArrayList(com/walmartlabs/android/photo/model/order/PhotoSpecification.getClassLoader());
    }

    private void fireOrderUpdated()
    {
        if (mListener != null)
        {
            mListener.onOrderUpdated();
        }
    }

    public void decrementProduct(DevicePhoto devicephoto, PhotoProduct photoproduct)
    {
        Iterator iterator = mProducts.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PhotoSpecification photospecification = (PhotoSpecification)iterator.next();
            if (devicephoto == null || photospecification.getPhoto().equals(devicephoto))
            {
                ProductConfiguration productconfiguration = photospecification.getConfigurationForProduct(photoproduct);
                if (productconfiguration != null && productconfiguration.decrementQuantity() && productconfiguration.getQuantity() == 0)
                {
                    photospecification.removeConfiguration(productconfiguration);
                }
            }
        } while (true);
        fireOrderUpdated();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCloudId()
    {
        return mCloudId;
    }

    public Contact getContact()
    {
        return mContact;
    }

    public List getProductSelection()
    {
        return mProducts;
    }

    public Store getStore()
    {
        return mStore;
    }

    public boolean hasContact()
    {
        return mContact != null && mContact.hasNameAddressEmail();
    }

    public boolean hasPhone()
    {
        return mContact != null && mContact.hasPhone();
    }

    public boolean hasQuantity()
    {
        boolean flag = false;
        for (Iterator iterator = mProducts.iterator(); iterator.hasNext();)
        {
            flag |= ((PhotoSpecification)iterator.next()).nonZeroQuantity();
        }

        return flag;
    }

    public boolean hasStore()
    {
        return mStore != null && mStore.isComplete();
    }

    public void incrementProduct(DevicePhoto devicephoto, PhotoProduct photoproduct)
    {
        if (devicephoto != null)
        {
            PhotoSpecification photospecification1 = null;
            Iterator iterator = mProducts.iterator();
            PhotoSpecification photospecification;
            do
            {
                photospecification = photospecification1;
                if (!iterator.hasNext())
                {
                    break;
                }
                photospecification = (PhotoSpecification)iterator.next();
            } while (!photospecification.getPhoto().equals(devicephoto));
            photospecification1 = photospecification;
            if (photospecification == null)
            {
                photospecification1 = new PhotoSpecification();
                photospecification1.setPhoto(devicephoto);
                mProducts.add(photospecification1);
            }
            devicephoto = photospecification1.getOrCreateConfigurationForProduct(photoproduct);
            if (devicephoto != null)
            {
                devicephoto.incrementQuantity();
                fireOrderUpdated();
            }
            return;
        }
        devicephoto = mProducts.iterator();
        do
        {
            if (!devicephoto.hasNext())
            {
                break;
            }
            ProductConfiguration productconfiguration = ((PhotoSpecification)devicephoto.next()).getOrCreateConfigurationForProduct(photoproduct);
            if (productconfiguration != null)
            {
                productconfiguration.incrementQuantity();
            }
        } while (true);
        fireOrderUpdated();
    }

    public PhotoSpecification initSpecification(DevicePhoto devicephoto)
    {
        if (devicephoto != null)
        {
            PhotoSpecification photospecification1 = null;
            Iterator iterator = mProducts.iterator();
            PhotoSpecification photospecification;
            do
            {
                photospecification = photospecification1;
                if (!iterator.hasNext())
                {
                    break;
                }
                photospecification = (PhotoSpecification)iterator.next();
            } while (!photospecification.getPhoto().equals(devicephoto));
            photospecification1 = photospecification;
            if (photospecification == null)
            {
                photospecification1 = new PhotoSpecification();
                photospecification1.setPhoto(devicephoto);
                mProducts.add(photospecification1);
            }
            return photospecification1;
        } else
        {
            return null;
        }
    }

    public boolean isComplete()
    {
        return mContact != null && mContact.isComplete() && mStore != null && mStore.isComplete() && hasQuantity();
    }

    public boolean isEmpty()
    {
        return mProducts.isEmpty();
    }

    public void removeSpecification(PhotoSpecification photospecification)
    {
        photospecification.reset();
        mProducts.remove(photospecification);
    }

    public void resetQuantitiesAndCrop()
    {
        for (Iterator iterator = mProducts.iterator(); iterator.hasNext(); ((PhotoSpecification)iterator.next()).reset()) { }
    }

    public void setCloudId(String s)
    {
        mCloudId = s;
    }

    public void setContact(Contact contact)
    {
        mContact = contact;
    }

    public void setListener(PendingOrderListener pendingorderlistener)
    {
        mListener = pendingorderlistener;
    }

    public void setStore(Store store)
    {
        mStore = store;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mContact, 0);
        parcel.writeParcelable(mStore, 0);
        parcel.writeString(mCloudId);
        parcel.writeList(mProducts);
    }

}
