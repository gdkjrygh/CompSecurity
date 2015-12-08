// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.walmartlabs.utils.WLog;

// Referenced classes of package com.walmart.android.service:
//            HTTPService

class val.imageURL
    implements wnloadImage
{

    final HTTPService this$0;
    final String val$imageURL;

    public Bitmap convertToReturnType(Bitmap bitmap)
    {
        return bitmap;
    }

    public volatile Object convertToReturnType(Object obj)
    {
        return convertToReturnType((Bitmap)obj);
    }

    public Bitmap processData(byte abyte0[])
    {
        Bitmap bitmap;
        try
        {
            bitmap = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, HTTPService.access$600(HTTPService.this));
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            WLog.e(HTTPService.access$700(), (new StringBuilder()).append("Failed to decode (").append(abyte0.length).append(" bytes of) image data from ").append(val$imageURL).toString(), outofmemoryerror);
            return null;
        }
        return bitmap;
    }

    public volatile Object processData(byte abyte0[])
    {
        return processData(abyte0);
    }

    wnloadImage()
    {
        this$0 = final_httpservice;
        val$imageURL = String.this;
        super();
    }
}
