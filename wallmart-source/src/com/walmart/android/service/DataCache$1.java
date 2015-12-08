// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package com.walmart.android.service:
//            DataCache

class val.bmp
    implements reamWriter
{

    final DataCache this$0;
    final Bitmap val$bmp;

    public void onWriteToStream(FileOutputStream fileoutputstream)
        throws IOException
    {
        if (!val$bmp.compress(android.graphics.essFormat.JPEG, 100, fileoutputstream))
        {
            Log.e(DataCache.access$000(), "Failed to compress image.");
            throw new IOException("Failed to compress image.");
        } else
        {
            return;
        }
    }

    reamWriter()
    {
        this$0 = final_datacache;
        val$bmp = Bitmap.this;
        super();
    }
}
