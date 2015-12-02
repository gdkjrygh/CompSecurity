// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.camera;

import java.util.Comparator;

// Referenced classes of package com.whatsapp.camera:
//            CameraView

class i
    implements Comparator
{

    final CameraView a;

    i(CameraView cameraview)
    {
        a = cameraview;
        super();
    }

    public int a(android.hardware.Camera.Size size, android.hardware.Camera.Size size1)
    {
        int j = size.width * size.height;
        int k = size1.width * size1.height;
        if (j > k)
        {
            return -1;
        }
        return j != k ? 1 : 0;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((android.hardware.Camera.Size)obj, (android.hardware.Camera.Size)obj1);
    }
}
