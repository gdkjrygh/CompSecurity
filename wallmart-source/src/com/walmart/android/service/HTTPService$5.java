// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.service:
//            HTTPService

class val.imageURL
    implements wnloadImage
{

    final HTTPService this$0;
    final String val$imageURL;
    final OutputStream val$out;

    public volatile Object convertToReturnType(Object obj)
    {
        return convertToReturnType((Boolean)obj);
    }

    public Void convertToReturnType(Boolean boolean1)
    {
        return null;
    }

    public Boolean processData(byte abyte0[])
    {
        try
        {
            IOUtils.write(abyte0, val$out);
        }
        catch (IOException ioexception)
        {
            WLog.e(HTTPService.access$700(), (new StringBuilder()).append("Failed to write (").append(abyte0.length).append(" bytes of) image data from ").append(val$imageURL).toString(), ioexception);
            return null;
        }
        return Boolean.valueOf(true);
    }

    public volatile Object processData(byte abyte0[])
    {
        return processData(abyte0);
    }

    wnloadImage()
    {
        this$0 = final_httpservice;
        val$out = outputstream;
        val$imageURL = String.this;
        super();
    }
}
