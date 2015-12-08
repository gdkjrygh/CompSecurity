// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mapbar.android.location;

import android.net.wifi.ScanResult;
import java.util.Comparator;

// Referenced classes of package com.mapbar.android.location:
//            b

final class 
    implements Comparator
{

    public final int compare(Object obj, Object obj1)
    {
        obj = (ScanResult)obj;
        obj1 = (ScanResult)obj1;
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (obj != null)
        {
            i = ((flag) ? 1 : 0);
            if (obj1 != null)
            {
                i = -(new Integer(((ScanResult) (obj)).level)).compareTo(new Integer(((ScanResult) (obj1)).level));
            }
        }
        return i;
    }

    (b b1)
    {
    }
}
