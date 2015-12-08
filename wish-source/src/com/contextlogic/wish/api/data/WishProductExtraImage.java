// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.data;

import java.io.Serializable;

// Referenced classes of package com.contextlogic.wish.api.data:
//            WishImage, WishUser

public class WishProductExtraImage
    implements Serializable
{

    private static final long serialVersionUID = 0x76dbf2ab877dc53bL;
    private WishImage image;
    private int sequenceId;
    private String size;
    private WishUser uploader;

    public WishProductExtraImage(int i, String s)
    {
        sequenceId = i;
        image = new WishImage(s);
    }

    public WishImage getImage()
    {
        return image;
    }

    public int getSequenceId()
    {
        return sequenceId;
    }

    public String getSize()
    {
        return size;
    }

    public WishUser getUploader()
    {
        return uploader;
    }

    public void setSize(String s)
    {
        size = s;
    }

    public void setUploader(WishUser wishuser)
    {
        uploader = wishuser;
    }
}
