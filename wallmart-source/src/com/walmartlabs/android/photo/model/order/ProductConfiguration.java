// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.order;

import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.model.products.PhotoProductComparator;

// Referenced classes of package com.walmartlabs.android.photo.model.order:
//            Crop

public class ProductConfiguration
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public ProductConfiguration createFromParcel(Parcel parcel)
        {
            return new ProductConfiguration(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ProductConfiguration[] newArray(int i)
        {
            return new ProductConfiguration[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static PhotoProductComparator sComparator = new PhotoProductComparator();
    private Crop mCrop;
    private final PhotoProduct mProduct;
    private int mQuantity;

    public ProductConfiguration(Parcel parcel)
    {
        mProduct = (PhotoProduct)parcel.readParcelable(com/walmartlabs/android/photo/model/products/PhotoProduct.getClassLoader());
        mQuantity = parcel.readInt();
        mCrop = (Crop)parcel.readParcelable(com/walmartlabs/android/photo/model/order/Crop.getClassLoader());
    }

    public ProductConfiguration(PhotoProduct photoproduct)
    {
        mProduct = photoproduct;
        mQuantity = 0;
        mCrop = null;
    }

    public int compareTo(ProductConfiguration productconfiguration)
    {
        if (productconfiguration != null)
        {
            productconfiguration = productconfiguration.getProduct();
        } else
        {
            productconfiguration = null;
        }
        return sComparator.compare(mProduct, productconfiguration);
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((ProductConfiguration)obj);
    }

    public boolean decrementQuantity()
    {
        if (mQuantity > 0)
        {
            mQuantity = mQuantity - 1;
            return true;
        } else
        {
            return false;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Crop getCrop()
    {
        return mCrop;
    }

    public PhotoProduct getProduct()
    {
        return mProduct;
    }

    public int getQuantity()
    {
        return mQuantity;
    }

    public void incrementQuantity()
    {
        mQuantity = mQuantity + 1;
    }

    public void reset()
    {
        mQuantity = 0;
        mCrop = null;
    }

    public void setCrop(Crop crop)
    {
        mCrop = crop;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ProductConfiguration[").append(mProduct).append("/").append(mQuantity).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(mProduct, 0);
        parcel.writeInt(mQuantity);
        parcel.writeParcelable(mCrop, 0);
    }

}
