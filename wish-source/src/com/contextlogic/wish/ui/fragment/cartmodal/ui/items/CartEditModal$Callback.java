// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import com.contextlogic.wish.api.data.WishCartItem;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartEditModal

public static interface Q
{

    public abstract void onCancel();

    public abstract void onEdit(WishCartItem wishcartitem, int i);
}
