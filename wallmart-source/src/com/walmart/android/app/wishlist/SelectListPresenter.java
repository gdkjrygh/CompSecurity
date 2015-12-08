// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.wishlist;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.walmart.android.service.wishlist.AddBundle;
import com.walmart.android.service.wishlist.AddItemBase;
import com.walmart.android.service.wishlist.CancelableCallback;
import com.walmart.android.service.wishlist.WishList;
import com.walmart.android.service.wishlist.WishListManager;
import com.walmart.android.ui.Presenter;
import com.walmart.android.wmservice.DialogFactory;
import com.walmartlabs.kangaroo.Result;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.wishlist:
//            BaseLandingPagePresenter, ListCreatorPresenter

public class SelectListPresenter extends BaseLandingPagePresenter
{

    private final AddBundle mAddBundle;
    private final AddItemBase mAddItem;
    private CancelableCallback mCallbackAddItem;
    private CancelableCallback mCallbackCreateList;

    public SelectListPresenter(AppCompatActivity appcompatactivity, AddBundle addbundle)
    {
        super(appcompatactivity);
        mAddBundle = addbundle;
        mAddItem = null;
    }

    public SelectListPresenter(AppCompatActivity appcompatactivity, AddItemBase additembase)
    {
        super(appcompatactivity);
        mAddItem = additembase;
        mAddBundle = null;
    }

    private void addItemToList(final String listId)
    {
        cancelAddItem();
        mCallbackAddItem = new CancelableCallback() {

            final SelectListPresenter this$0;
            final String val$listId;

            protected void onCancel()
            {
                mCallbackAddItem = null;
                mProgressView.setVisibility(8);
            }

            protected void onResult(Result result)
            {
                mCallbackAddItem = null;
                mProgressView.setVisibility(8);
                if (result.successful() && result.hasData())
                {
                    result = new ListCreatorPresenter(mActivity, listId, mWishLists);
                    popToRoot();
                    pushAndReplacePresenter(result, false);
                    Toast.makeText(mActivity, 0x7f090645, 0).show();
                    return;
                } else
                {
                    DialogFactory.showDialog(251, mActivity);
                    return;
                }
            }

            
            {
                this$0 = SelectListPresenter.this;
                listId = s;
                super();
            }
        };
        if (mAddItem != null)
        {
            WishListManager.get().addItem(listId, mAddItem, mCallbackAddItem);
        } else
        if (mAddBundle != null)
        {
            WishListManager.get().addItem(listId, mAddBundle, mCallbackAddItem);
            return;
        }
    }

    private void cancelAddItem()
    {
        if (mCallbackAddItem != null)
        {
            mCallbackAddItem.cancel();
            mCallbackAddItem = null;
        }
    }

    private void cancelCallbacks()
    {
        cancelCreateList();
        cancelAddItem();
    }

    private void cancelCreateList()
    {
        if (mCallbackCreateList != null)
        {
            mCallbackCreateList.cancel();
            mCallbackCreateList = null;
        }
    }

    protected String getPageName()
    {
        return "add to list";
    }

    protected void handleCreateListAction(String s)
    {
        cancelCreateList();
        mCallbackCreateList = new CancelableCallback() {

            final SelectListPresenter this$0;

            public void onCancel()
            {
                mCallbackCreateList = null;
                mProgressView.setVisibility(8);
            }

            public void onResult(Result result)
            {
                mCallbackCreateList = null;
                if (result.successful() && result.hasData())
                {
                    mWishLists.add(result.getData());
                    result = ((WishList)result.getData()).id;
                    addItemToList(result);
                    return;
                } else
                {
                    mProgressView.setVisibility(8);
                    DialogFactory.showDialog(250, mActivity);
                    return;
                }
            }

            
            {
                this$0 = SelectListPresenter.this;
                super();
            }
        };
        createList(s, mCallbackCreateList);
    }

    protected void handleListSelectedAction(String s)
    {
        mProgressView.setVisibility(0);
        addItemToList(s);
    }

    public void onAfterPop()
    {
        cancelCallbacks();
        super.onAfterPop();
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            super.onCreateView(viewgroup);
            mListTitle.setText(0x7f090614);
        }
    }


/*
    static CancelableCallback access$002(SelectListPresenter selectlistpresenter, CancelableCallback cancelablecallback)
    {
        selectlistpresenter.mCallbackCreateList = cancelablecallback;
        return cancelablecallback;
    }

*/



/*
    static CancelableCallback access$202(SelectListPresenter selectlistpresenter, CancelableCallback cancelablecallback)
    {
        selectlistpresenter.mCallbackAddItem = cancelablecallback;
        return cancelablecallback;
    }

*/


}
