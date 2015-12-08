// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import io.theholygrail.dingo.navigationbar.Button;
import java.util.Arrays;
import java.util.List;

public class Page
{

    private io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener buttonClickListener;
    private List buttonList;
    private int mHistoryIndex;
    private String mInterceptUrl;
    private boolean mIsExternalModal;
    private boolean mIsModal;
    private Page mModal;
    private Page mParent;
    private String mTitle;
    private io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener onAppearListener;
    private io.theholygrail.dingo.navigation.NavigationBridgeCallback.OnBackListener onBackListener;
    private io.theholygrail.dingo.view.ViewBridgeCallback.OnDisappearListener onDisappearListener;

    public Page()
    {
    }

    public Page(String s)
    {
        this();
        mTitle = s;
    }

    public io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener getButtonClickListener()
    {
        return buttonClickListener;
    }

    public List getButtons()
    {
        return buttonList;
    }

    public int getHistoryIndex()
    {
        return mHistoryIndex;
    }

    public String getInterceptUrl()
    {
        return mInterceptUrl;
    }

    public Page getModal()
    {
        if (mModal != null)
        {
            if (mModal.hasModals())
            {
                return mModal.getModal();
            } else
            {
                return mModal;
            }
        } else
        {
            return null;
        }
    }

    public io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener getOnAppearListener()
    {
        return onAppearListener;
    }

    public io.theholygrail.dingo.navigation.NavigationBridgeCallback.OnBackListener getOnBackListener()
    {
        return onBackListener;
    }

    public io.theholygrail.dingo.view.ViewBridgeCallback.OnDisappearListener getOnDisappearListener()
    {
        return onDisappearListener;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public boolean hasButtons()
    {
        return buttonList != null && !buttonList.isEmpty();
    }

    public boolean hasModals()
    {
        return mModal != null;
    }

    public boolean isExternalModal()
    {
        return mIsExternalModal;
    }

    public boolean isModal()
    {
        return mIsModal;
    }

    public boolean pop()
    {
        if (!mIsModal || mParent == null)
        {
            return false;
        } else
        {
            return mParent.popModal();
        }
    }

    public boolean popModal()
    {
        if (mModal != null)
        {
            if (mModal.hasModals())
            {
                mModal.popModal();
            }
            mModal = null;
            return true;
        } else
        {
            return false;
        }
    }

    public void pushModal(Page page)
    {
        page.mIsModal = true;
        page.mParent = this;
        mModal = page;
    }

    public void resetListeners()
    {
        buttonClickListener = null;
        onAppearListener = null;
        onDisappearListener = null;
        onBackListener = null;
        if (buttonList != null)
        {
            buttonList.clear();
        }
    }

    public void setButtons(Button abutton[], io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener onclicklistener)
    {
        if (abutton != null)
        {
            buttonList = Arrays.asList(abutton);
        } else
        {
            buttonList = null;
        }
        buttonClickListener = onclicklistener;
    }

    public void setHistoryIndex(int i)
    {
        mHistoryIndex = i;
    }

    public void setInterceptUrl(String s)
    {
        mInterceptUrl = s;
    }

    public void setIsExternalModal(boolean flag)
    {
        mIsExternalModal = flag;
    }

    public void setOnAppearListener(io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener onappearlistener)
    {
        onAppearListener = onappearlistener;
    }

    public void setOnBackListener(io.theholygrail.dingo.navigation.NavigationBridgeCallback.OnBackListener onbacklistener)
    {
        onBackListener = onbacklistener;
    }

    public void setOnDisappearListener(io.theholygrail.dingo.view.ViewBridgeCallback.OnDisappearListener ondisappearlistener)
    {
        onDisappearListener = ondisappearlistener;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }
}
