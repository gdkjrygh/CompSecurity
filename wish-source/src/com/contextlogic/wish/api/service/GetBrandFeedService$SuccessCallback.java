// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service;

import com.contextlogic.wish.api.data.WishCredit;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.api.service:
//            GetBrandFeedService

public static interface 
{

    public abstract void onServiceSucceeded(ArrayList arraylist, boolean flag, int i, WishCredit wishcredit, String s, String s1, WishFeedEndedButtonSpec wishfeedendedbuttonspec, 
            String s2);
}
