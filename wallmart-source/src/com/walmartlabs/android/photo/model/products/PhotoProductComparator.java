// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.products;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.model.products:
//            PhotoProduct

public class PhotoProductComparator
    implements Comparator
{

    private static List sSkuPriorityList;

    public PhotoProductComparator()
    {
    }

    public int compare(PhotoProduct photoproduct, PhotoProduct photoproduct1)
    {
        int j = -1;
        int i;
        if (photoproduct != null)
        {
            i = sSkuPriorityList.indexOf(photoproduct.getProductIdentifier());
        } else
        {
            i = -1;
        }
        if (photoproduct1 != null)
        {
            j = sSkuPriorityList.indexOf(photoproduct1.getProductIdentifier());
        }
        if (i >= 0 && j >= 0 || j == i)
        {
            return i - j;
        }
        return i >= 0 ? 0x80000000 : 0x7fffffff;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((PhotoProduct)obj, (PhotoProduct)obj1);
    }

    static 
    {
        sSkuPriorityList = new ArrayList();
        sSkuPriorityList.add("0113000213482");
        sSkuPriorityList.add("0113000213484");
        sSkuPriorityList.add("0113000213485");
        sSkuPriorityList.add("0113000213486");
        sSkuPriorityList.add("0113051119505");
        sSkuPriorityList.add("0113051119506");
        sSkuPriorityList.add("0113051119507");
    }
}
