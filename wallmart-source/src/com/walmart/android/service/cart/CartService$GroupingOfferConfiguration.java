// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.cart;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.walmart.android.service.cart:
//            CartService, ListInfo

private static class listInfo
{

    public List groupComponents;
    public String groupId;
    public final ListInfo listInfo;
    public int quantity;

    public (String s, List list, int i, ListInfo listinfo)
    {
        groupId = s;
        groupComponents = Collections.unmodifiableList(list);
        quantity = i;
        listInfo = listinfo;
    }
}
