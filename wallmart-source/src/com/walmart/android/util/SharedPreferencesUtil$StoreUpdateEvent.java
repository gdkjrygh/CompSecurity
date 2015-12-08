// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import com.walmart.android.data.WalmartStore;

// Referenced classes of package com.walmart.android.util:
//            SharedPreferencesUtil

public static class store
{

    public WalmartStore store;

    public boolean hasStoreSet()
    {
        return store != null;
    }

    public ()
    {
    }

    public (WalmartStore walmartstore)
    {
        store = walmartstore;
    }
}
