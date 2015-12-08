// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.device;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.model.device:
//            DevicePhoto

public class DeviceAlbum
    implements Comparable
{

    private static final String UNKNOWN_ALBUM_NAME = "Unknown";
    private String mName;
    private List mPhotos;

    public DeviceAlbum(String s)
    {
        mPhotos = new ArrayList();
        setName(s);
    }

    public void addPhoto(DevicePhoto devicephoto)
    {
        mPhotos.add(devicephoto);
    }

    public void clear()
    {
        mPhotos.clear();
    }

    public int compareTo(DeviceAlbum devicealbum)
    {
        if (devicealbum != null && devicealbum.getName() != null)
        {
            return devicealbum.getName().compareToIgnoreCase(getName());
        } else
        {
            return 0x80000000;
        }
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((DeviceAlbum)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof DeviceAlbum) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (((DeviceAlbum) (obj = (DeviceAlbum)obj)).getSize() == getSize() && ((DeviceAlbum) (obj)).getName().equals(getName()))
        {
            int j = getSize();
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (!getPhoto(i).equals(((DeviceAlbum) (obj)).getPhoto(i)))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public String getName()
    {
        return mName;
    }

    public DevicePhoto getPhoto(int i)
    {
        return (DevicePhoto)mPhotos.get(i);
    }

    public List getPhotos()
    {
        return mPhotos;
    }

    public int getSize()
    {
        return mPhotos.size();
    }

    public void setName(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = "Unknown";
        }
        mName = s;
    }

    public void setPhotos(List list)
    {
        if (list != null)
        {
            mPhotos = list;
        }
    }
}
