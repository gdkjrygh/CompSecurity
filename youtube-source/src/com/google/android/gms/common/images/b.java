// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import com.google.android.gms.internal.gl;

final class b extends gl
{

    protected final int a(Object obj, Object obj1)
    {
        obj = (Bitmap)obj1;
        return ((Bitmap) (obj)).getHeight() * ((Bitmap) (obj)).getRowBytes();
    }
}
