// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.account;

import android.app.Activity;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.account:
//            AccountDelegate, AccountListener

public abstract class AccountPresenter extends Presenter
{

    protected AccountListener mAccountListener;
    protected Activity mActivity;
    protected final List mDelegates = new ArrayList();
    private String mMergeType;

    public AccountPresenter(Activity activity)
    {
        mActivity = activity;
    }

    public void addAccountDelegate(AccountDelegate accountdelegate)
    {
        mDelegates.add(accountdelegate);
    }

    void addAccountDelegates(Collection collection)
    {
        mDelegates.addAll(collection);
    }

    protected abstract com.walmartlabs.anivia.AniviaEventAsJson.Builder anyAniviaPageViewOverride();

    protected void delegateFinish(final boolean guest, final boolean accountCreated, final boolean emailSignup, final Iterator iterator)
    {
        if (iterator.hasNext())
        {
            ((AccountDelegate)iterator.next()).onLoginComplete(mActivity, this, new AccountDelegate.DelegateCallback() {

                final AccountPresenter this$0;
                final boolean val$accountCreated;
                final boolean val$emailSignup;
                final boolean val$guest;
                final Iterator val$iterator;

                public void onComplete()
                {
                    delegateFinish(guest, accountCreated, emailSignup, iterator);
                }

            
            {
                this$0 = AccountPresenter.this;
                guest = flag;
                accountCreated = flag1;
                emailSignup = flag2;
                iterator = iterator1;
                super();
            }
            });
        } else
        if (mAccountListener != null)
        {
            mAccountListener.onLoginCompleted(guest, accountCreated, emailSignup);
            return;
        }
    }

    protected String getMergeType()
    {
        return mMergeType;
    }

    protected void onPageView()
    {
        com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = anyAniviaPageViewOverride();
        if (builder != null)
        {
            MessageBus.getBus().post(builder);
        }
    }

    public boolean removeAccountDelegate(AccountDelegate accountdelegate)
    {
        return mDelegates.remove(accountdelegate);
    }

    public void setAccountListener(AccountListener accountlistener)
    {
        mAccountListener = accountlistener;
    }

    public void setMergeType(String s)
    {
        mMergeType = s;
    }
}
