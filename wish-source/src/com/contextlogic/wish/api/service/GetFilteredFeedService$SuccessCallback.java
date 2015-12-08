// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.DealDashInfo;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.api.data.WishWishLookBannerSpec;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetFilteredFeedService

public static interface 
{

    public abstract void onServiceSucceeded(ArrayList arraylist, ArrayList arraylist1, int i, boolean flag, DealDashInfo dealdashinfo, WishWishLookBannerSpec wishwishlookbannerspec, WishPromoBannerSpec wishpromobannerspec, 
            ArrayList arraylist2);
}
