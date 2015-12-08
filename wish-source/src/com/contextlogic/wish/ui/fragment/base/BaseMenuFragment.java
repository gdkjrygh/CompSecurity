// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;

// Referenced classes of package com.contextlogic.wish.ui.fragment.base:
//            BaseContentFragment

public abstract class BaseMenuFragment extends BaseContentFragment
{

    public BaseMenuFragment()
    {
    }

    protected void closeMenu()
    {
        ((RootActivity)getActivity()).closeMenus();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(getLayoutResourceId(), viewgroup, false);
        initializeUi(layoutinflater);
        return layoutinflater;
    }

    protected void showContentFragment(BaseContentFragment basecontentfragment, boolean flag)
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.setContentFragment(basecontentfragment, flag);
            rootactivity.closeMenus();
        }
    }

    protected void showModalContentFragment(BaseContentFragment basecontentfragment)
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            rootactivity.setModalContentFragment(basecontentfragment, true);
        }
    }

    protected void showUrl(String s)
    {
        showUrl(s, false);
    }

    protected void showUrl(String s, boolean flag)
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("ArgInitialUrl", s);
        if (flag)
        {
            ((Bundle) (obj)).putBoolean("ArgUseNativeStyle", true);
        }
        s = new EmbeddedBrowserFragment();
        s.setArguments(((Bundle) (obj)));
        obj = (RootActivity)getActivity();
        if (obj != null)
        {
            ((RootActivity) (obj)).setContentFragment(s, false);
            ((RootActivity) (obj)).closeMenus();
        }
    }
}
