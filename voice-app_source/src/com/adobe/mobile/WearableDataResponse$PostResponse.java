// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import com.google.android.gms.wearable.DataMap;

// Referenced classes of package com.adobe.mobile:
//            WearableDataResponse

static class success extends WearableDataResponse
{

    protected (DataMap datamap)
    {
        success = datamap.getBoolean("Result");
    }
}
