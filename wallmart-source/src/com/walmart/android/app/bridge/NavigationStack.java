// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import com.walmartlabs.utils.WLog;
import java.util.Stack;

// Referenced classes of package com.walmart.android.app.bridge:
//            Page

public class NavigationStack
{

    private static final String TAG = com/walmart/android/app/bridge/NavigationStack.getSimpleName();
    private Stack mPageStack;
    private Page mRootPage;

    public NavigationStack()
    {
        mRootPage = new Page();
        mPageStack = new Stack();
    }

    public Page getCurrentModal()
    {
        if (getCurrentPage().hasModals())
        {
            return getCurrentPage().getModal();
        } else
        {
            return null;
        }
    }

    public Page getCurrentPage()
    {
        if (mPageStack.empty())
        {
            return mRootPage;
        } else
        {
            return (Page)mPageStack.peek();
        }
    }

    public Page getCurrentPageOrModal()
    {
        if (getCurrentPage().hasModals())
        {
            return getCurrentPage().getModal();
        } else
        {
            return getCurrentPage();
        }
    }

    public boolean isRootPage()
    {
        return mPageStack.empty();
    }

    public boolean pop()
    {
        if (mPageStack.empty())
        {
            WLog.w(TAG, "pop() called on empty stack");
            return false;
        } else
        {
            mPageStack.pop();
            return true;
        }
    }

    public void popToRoot()
    {
        mPageStack.clear();
        mRootPage = new Page(mRootPage.getTitle());
    }

    public void push(Page page)
    {
        WLog.d(TAG, (new StringBuilder()).append("push(): ").append(page.getTitle()).toString());
        mPageStack.push(page);
    }

}
