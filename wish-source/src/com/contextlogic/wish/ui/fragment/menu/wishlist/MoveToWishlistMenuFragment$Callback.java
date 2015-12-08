// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.menu.wishlist;

import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.menu.wishlist:
//            MoveToWishlistMenuFragment

public static interface Y
{

    public abstract void onBucketEditCancelled();

    public abstract void onBucketEdited(ArrayList arraylist, String s, String s1);

    public abstract void onProductsRemoved(ArrayList arraylist);
}
