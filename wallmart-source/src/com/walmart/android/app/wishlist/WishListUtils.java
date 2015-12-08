// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.app.Activity;
import android.content.Intent;
import android.text.InputFilter;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmart.android.app.wishlist:
//            ListNameInputFilter

final class WishListUtils
{

    public static final int WISHLIST_NAME_MAX_SIZE = 50;

    WishListUtils()
    {
    }

    public static InputFilter[] getWishListNameInputFilters()
    {
        return (new InputFilter[] {
            new android.text.InputFilter.LengthFilter(50), new ListNameInputFilter()
        });
    }

    public static void launchSignInActivity(Activity activity, int i)
    {
        Object obj = (new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", "SignIn").putString("section", "lists").putString("subCategory", "lists");
        MessageBus.getBus().post(obj);
        obj = new Intent(activity, com/walmart/android/app/account/AccountActivity);
        ((Intent) (obj)).putExtra("mode", 1);
        ((Intent) (obj)).putExtra("from", "Wishlist");
        activity.startActivityForResult(((Intent) (obj)), i);
    }
}
