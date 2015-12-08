// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.device;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.util.PhotoDigest;
import com.walmartlabs.android.photo.util.PhotoLogger;
import java.io.File;

// Referenced classes of package com.walmartlabs.android.photo.model.device:
//            Device

public class DevicePhoto
    implements Parcelable, Comparable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public DevicePhoto createFromParcel(Parcel parcel)
        {
            return new DevicePhoto(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public DevicePhoto[] newArray(int i)
        {
            return new DevicePhoto[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String TAG = com/walmartlabs/android/photo/model/device/DevicePhoto.getSimpleName();
    private final String mAlbumName;
    private final long mDateTaken;
    private int mHeight;
    private final long mId;
    private boolean mIsBroken;
    private final String mLocation;
    private final String mName;
    private String mUserAugmentedUniqueId;
    private int mWidth;

    public DevicePhoto(long l, String s, String s1, String s2, long l1)
    {
        mId = l;
        mLocation = s;
        mAlbumName = s1;
        mName = s2;
        mDateTaken = l1;
    }

    private DevicePhoto(Parcel parcel)
    {
        mId = parcel.readLong();
        mName = parcel.readString();
        mLocation = parcel.readString();
        mAlbumName = parcel.readString();
        mDateTaken = parcel.readLong();
        mUserAugmentedUniqueId = parcel.readString();
        mWidth = parcel.readInt();
        mHeight = parcel.readInt();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIsBroken = flag;
    }


    public int compareTo(DevicePhoto devicephoto)
    {
        byte byte0;
        byte0 = -1;
        if (devicephoto == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        if (devicephoto.getDateTaken() != getDateTaken()) goto _L2; else goto _L1
_L1:
        if (devicephoto.getId() != getId()) goto _L4; else goto _L3
_L3:
        byte0 = 0;
_L6:
        return byte0;
_L4:
        if (devicephoto.getId() < getId()) goto _L6; else goto _L5
_L5:
        return 1;
_L2:
        if (devicephoto.getDateTaken() < getDateTaken()) goto _L6; else goto _L7
_L7:
        return 1;
        return 0x80000000;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((DevicePhoto)obj);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof DevicePhoto) && ((DevicePhoto)obj).getId() == getId();
    }

    public String getAlbumName()
    {
        return mAlbumName;
    }

    public long getDateTaken()
    {
        return mDateTaken;
    }

    public int[] getDimensions(Context context)
    {
        if (mWidth == 0 || mHeight == 0)
        {
            context = new android.graphics.BitmapFactory.Options();
            context.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(getLocation(), context);
            mWidth = ((android.graphics.BitmapFactory.Options) (context)).outWidth;
            mHeight = ((android.graphics.BitmapFactory.Options) (context)).outHeight;
        }
        return (new int[] {
            mWidth, mHeight
        });
    }

    public int getHeight()
    {
        return mHeight;
    }

    public long getId()
    {
        return mId;
    }

    public String getLocation()
    {
        return mLocation;
    }

    public String getName()
    {
        return mName;
    }

    public long getSize()
    {
        return (new File(mLocation)).length();
    }

    public String getUserAugmentedUniqueId(Context context, Contact contact)
        throws com.walmartlabs.android.photo.util.PhotoDigest.DigestException
    {
        if (mUserAugmentedUniqueId == null)
        {
            context = Device.get(context).getInstallationID();
            String s = String.valueOf(mId);
            String s1 = mName;
            String s2 = String.valueOf(getSize());
            String s3 = String.valueOf(getDateTaken());
            contact = (new StringBuilder()).append(contact.getEmail()).append(context).append(s).append(s2).append(s1).append(s3).toString();
            mUserAugmentedUniqueId = PhotoDigest.sha256(contact);
            PhotoLogger.get().d(TAG, (new StringBuilder()).append("=== [ Generating photoId ]===\n   installation: ").append(context).append("\n           dbId: ").append(s).append("\n      photoName: ").append(s1).append("\n      photoSize: ").append(s2).append("\n photoTakenDate: ").append(s3).append("\n           user: ").append("[NOT SHOWN]").append("\n   Message: ").append(contact).append("\n   photoId: ").append(mUserAugmentedUniqueId).toString());
        }
        return mUserAugmentedUniqueId;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int hashCode()
    {
        return (int)mId;
    }

    public boolean isBroken()
    {
        return mIsBroken;
    }

    public boolean originalExists()
    {
        return (new File(mLocation)).exists();
    }

    public void setBroken(boolean flag)
    {
        mIsBroken = flag;
    }

    public String toString()
    {
        return (new StringBuilder("[")).append(mId).append("] ").append(mLocation).append(" (").append(mAlbumName).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(mId);
        parcel.writeString(mName);
        parcel.writeString(mLocation);
        parcel.writeString(mAlbumName);
        parcel.writeLong(mDateTaken);
        parcel.writeString(mUserAugmentedUniqueId);
        parcel.writeInt(mWidth);
        parcel.writeInt(mHeight);
        if (mIsBroken)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }

}
