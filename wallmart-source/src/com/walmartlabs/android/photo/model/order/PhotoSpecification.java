// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.model.order:
//            ProductConfiguration

public class PhotoSpecification
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PhotoSpecification createFromParcel(Parcel parcel)
        {
            return new PhotoSpecification(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public PhotoSpecification[] newArray(int i)
        {
            return new PhotoSpecification[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private DevicePhoto mPhoto;
    private ArrayList mProductConfigurations;

    public PhotoSpecification()
    {
        mProductConfigurations = new ArrayList();
    }

    public PhotoSpecification(Parcel parcel)
    {
        mProductConfigurations = new ArrayList();
        mPhoto = (DevicePhoto)parcel.readParcelable(com/walmartlabs/android/photo/model/device/DevicePhoto.getClassLoader());
        mProductConfigurations = parcel.readArrayList(com/walmartlabs/android/photo/model/order/ProductConfiguration.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PhotoSpecification)
        {
            return ((PhotoSpecification)obj).getPhoto().equals(mPhoto);
        } else
        {
            return false;
        }
    }

    public ProductConfiguration getConfigurationForProduct(PhotoProduct photoproduct)
    {
label0:
        {
            if (photoproduct == null)
            {
                break label0;
            }
            Iterator iterator = mProductConfigurations.iterator();
            ProductConfiguration productconfiguration;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                productconfiguration = (ProductConfiguration)iterator.next();
            } while (!productconfiguration.getProduct().equals(photoproduct));
            return productconfiguration;
        }
        return null;
    }

    public ProductConfiguration getOrCreateConfigurationForProduct(PhotoProduct photoproduct)
    {
        if (photoproduct != null)
        {
            ProductConfiguration productconfiguration = getConfigurationForProduct(photoproduct);
            if (productconfiguration != null)
            {
                return productconfiguration;
            } else
            {
                photoproduct = new ProductConfiguration(photoproduct);
                mProductConfigurations.add(photoproduct);
                return photoproduct;
            }
        } else
        {
            return null;
        }
    }

    public DevicePhoto getPhoto()
    {
        return mPhoto;
    }

    public List getProductConfigurations()
    {
        Collections.sort(mProductConfigurations);
        return mProductConfigurations;
    }

    public int getTotalQuantity()
    {
        int i = 0;
        for (Iterator iterator = mProductConfigurations.iterator(); iterator.hasNext();)
        {
            i += ((ProductConfiguration)iterator.next()).getQuantity();
        }

        return i;
    }

    public boolean nonZeroQuantity()
    {
        return getTotalQuantity() > 0;
    }

    public void removeConfiguration(ProductConfiguration productconfiguration)
    {
        mProductConfigurations.remove(productconfiguration);
    }

    public void reset()
    {
        for (Iterator iterator = mProductConfigurations.iterator(); iterator.hasNext(); ((ProductConfiguration)iterator.next()).reset()) { }
        mProductConfigurations = new ArrayList();
    }

    void setPhoto(DevicePhoto devicephoto)
    {
        mPhoto = devicephoto;
    }

    public String toString()
    {
        String s = (new StringBuilder()).append("PhotoSpecification[").append(mPhoto.getName()).append("]").toString();
        for (Iterator iterator = mProductConfigurations.iterator(); iterator.hasNext();)
        {
            ProductConfiguration productconfiguration = (ProductConfiguration)iterator.next();
            s = (new StringBuilder()).append(s).append("\n     ").append(productconfiguration.toString()).toString();
        }

        return s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mPhoto, 0);
        parcel.writeList(mProductConfigurations);
    }

}
