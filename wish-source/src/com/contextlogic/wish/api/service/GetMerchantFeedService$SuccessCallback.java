// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishMerchant;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetMerchantFeedService

public static interface 
{

    public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s, WishMerchant wishmerchant);
}
