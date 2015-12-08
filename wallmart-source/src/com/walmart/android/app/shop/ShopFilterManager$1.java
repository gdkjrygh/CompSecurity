// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;


// Referenced classes of package com.walmart.android.app.shop:
//            ShopFilterManager

class val.group
    implements com.walmart.android.utils.yPredicate
{

    final ShopFilterManager this$0;
    final String val$group;

    public boolean isTrue(com.walmart.android.data.inement inement)
    {
        return val$group.equals(inement.getParent());
    }

    public volatile boolean isTrue(Object obj)
    {
        return isTrue((com.walmart.android.data.inement)obj);
    }

    ent()
    {
        this$0 = final_shopfiltermanager;
        val$group = String.this;
        super();
    }
}
