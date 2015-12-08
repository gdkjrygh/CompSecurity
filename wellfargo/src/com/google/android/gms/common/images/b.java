// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.b.l;

// Referenced classes of package com.google.android.gms.common.images:
//            f

final class b extends l
{

    protected int a(f f1, Bitmap bitmap)
    {
        return bitmap.getHeight() * bitmap.getRowBytes();
    }

    protected int a(Object obj, Object obj1)
    {
        return a((f)obj, (Bitmap)obj1);
    }

    protected void a(boolean flag, f f1, Bitmap bitmap, Bitmap bitmap1)
    {
        super.a(flag, f1, bitmap, bitmap1);
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        a(flag, (f)obj, (Bitmap)obj1, (Bitmap)obj2);
    }
}
