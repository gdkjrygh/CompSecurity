// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            SharePhotoContent, SharePhoto, ShareContent, ShareModelBuilder

public static class  extends 
{

    private final List photos = new ArrayList();

    public  addPhoto(SharePhoto sharephoto)
    {
        if (sharephoto != null)
        {
            photos.add((new photos()).m(sharephoto).m());
        }
        return this;
    }

    public m addPhotos(List list)
    {
        if (list == null) goto _L2; else goto _L1
_L1:
        list = list.iterator();
_L5:
        if (list.hasNext()) goto _L3; else goto _L2
_L2:
        return this;
_L3:
        addPhoto((SharePhoto)list.next());
        if (true) goto _L5; else goto _L4
_L4:
    }

    public SharePhotoContent build()
    {
        return new SharePhotoContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((SharePhotoContent)sharecontent);
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public readFrom readFrom(Parcel parcel)
    {
        return readFrom((SharePhotoContent)parcel.readParcelable(com/facebook/share/model/SharePhotoContent.getClassLoader()));
    }

    public readFrom readFrom(SharePhotoContent sharephotocontent)
    {
        if (sharephotocontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.rom(sharephotocontent)).addPhotos(sharephotocontent.getPhotos());
        }
    }

    public s setPhotos(List list)
    {
        photos.clear();
        addPhotos(list);
        return this;
    }


    public ()
    {
    }
}
