// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishFeedPromotionItem;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetFeedService

public static interface 
{

    public abstract void onServiceSucceeded(ArrayList arraylist, String s, boolean flag, WishFeedPromotionItem wishfeedpromotionitem, int i, int j, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
            String s1);
}
