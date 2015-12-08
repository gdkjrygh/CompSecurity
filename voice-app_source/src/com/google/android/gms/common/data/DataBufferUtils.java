// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, Freezable

public final class DataBufferUtils
{

    private DataBufferUtils()
    {
    }

    public static ArrayList freezeAndClose(DataBuffer databuffer)
    {
        Object obj = new ArrayList(databuffer.getCount());
        for (Iterator iterator = databuffer.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((Freezable)iterator.next()).freeze())) { }
        break MISSING_BLOCK_LABEL_61;
        obj;
        databuffer.close();
        throw obj;
        databuffer.close();
        return ((ArrayList) (obj));
    }

    public static boolean hasData(DataBuffer databuffer)
    {
        return databuffer != null && databuffer.getCount() > 0;
    }

    public static boolean hasNextPage(DataBuffer databuffer)
    {
        databuffer = databuffer.zznb();
        return databuffer != null && databuffer.getString("next_page_token") != null;
    }

    public static boolean hasPrevPage(DataBuffer databuffer)
    {
        databuffer = databuffer.zznb();
        return databuffer != null && databuffer.getString("prev_page_token") != null;
    }
}
