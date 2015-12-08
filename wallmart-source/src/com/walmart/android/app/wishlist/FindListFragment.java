// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.app.AppCompatActivity;
import com.walmart.android.fragments.WalmartPresenterFragment;
import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.wishlist:
//            FindListPresenter

public class FindListFragment extends WalmartPresenterFragment
{

    public FindListFragment()
    {
    }

    public Presenter onCreatePresenter()
    {
        return new FindListPresenter((AppCompatActivity)getActivity());
    }
}
