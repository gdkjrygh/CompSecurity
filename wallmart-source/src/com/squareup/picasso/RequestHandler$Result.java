// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import java.io.InputStream;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, Utils

public static final class <init>
{

    private final Bitmap bitmap;
    private final int exifOrientation;
    private final stream loadedFrom;
    private final InputStream stream;

    public Bitmap getBitmap()
    {
        return bitmap;
    }

    int getExifOrientation()
    {
        return exifOrientation;
    }

    public exifOrientation getLoadedFrom()
    {
        return loadedFrom;
    }

    public InputStream getStream()
    {
        return stream;
    }

    public (Bitmap bitmap1,  )
    {
        this((Bitmap)Utils.checkNotNull(bitmap1, "bitmap == null"), null, , 0);
    }

    <init>(Bitmap bitmap1, InputStream inputstream, <init> <init>1, int i)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (bitmap1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (inputstream == null)
        {
            flag1 = false;
        }
        if (!(flag1 ^ flag))
        {
            throw new AssertionError();
        } else
        {
            bitmap = bitmap1;
            stream = inputstream;
            loadedFrom = (loadedFrom)Utils.checkNotNull(<init>1, "loadedFrom == null");
            exifOrientation = i;
            return;
        }
    }

    public exifOrientation(InputStream inputstream, exifOrientation exiforientation)
    {
        this(null, (InputStream)Utils.checkNotNull(inputstream, "stream == null"), exiforientation, 0);
    }
}
