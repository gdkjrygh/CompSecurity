// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.wire;


// Referenced classes of package com.walmartlabs.android.photo.model.wire:
//            WirePendingOrder

public static class Photo
{
    public static class Crop
    {

        private double bottom;
        private double left;
        private double right;
        private double top;

        public double getBottom()
        {
            return bottom;
        }

        public double getLeft()
        {
            return left;
        }

        public double getRight()
        {
            return right;
        }

        public double getTop()
        {
            return top;
        }

        public void setBottom(double d)
        {
            bottom = d;
        }

        public void setLeft(double d)
        {
            left = d;
        }

        public void setRight(double d)
        {
            right = d;
        }

        public void setTop(double d)
        {
            top = d;
        }

        public Crop()
        {
        }
    }

    public static class Photo
    {

        private String filename;
        private String id;
        private String md5Sum;
        private long size;
        private String url;

        public String getFilename()
        {
            return filename;
        }

        public String getId()
        {
            return id;
        }

        public String getMd5Sum()
        {
            return md5Sum;
        }

        public long getSize()
        {
            return size;
        }

        public String getUrl()
        {
            return url;
        }

        public void setFilename(String s)
        {
            filename = s;
        }

        public void setId(String s)
        {
            id = s;
        }

        public void setMd5Sum(String s)
        {
            md5Sum = s;
        }

        public void setSize(long l)
        {
            size = l;
        }

        public void setUrl(String s)
        {
            url = s;
        }

        public Photo()
        {
        }
    }


    private Crop crop;
    private String description;
    private int lineItemNumber;
    private Photo photo;
    private int projectedDpi;
    private int quantity;
    private String sku;

    public Crop getCrop()
    {
        return crop;
    }

    public String getDescription()
    {
        return description;
    }

    public int getLineItemNumber()
    {
        return lineItemNumber;
    }

    public Photo getPhoto()
    {
        return photo;
    }

    public int getProjectedDpi()
    {
        return projectedDpi;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public String getSku()
    {
        return sku;
    }

    public void setCrop(Crop crop1)
    {
        crop = crop1;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setLineItemNumber(int i)
    {
        lineItemNumber = i;
    }

    public void setPhoto(Photo photo1)
    {
        photo = photo1;
    }

    public void setProjectedDpi(int i)
    {
        projectedDpi = i;
    }

    public void setQuantity(int i)
    {
        quantity = i;
    }

    public void setSku(String s)
    {
        sku = s;
    }

    public Photo()
    {
    }
}
