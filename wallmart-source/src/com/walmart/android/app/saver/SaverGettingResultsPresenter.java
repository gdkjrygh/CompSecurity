// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.view.View;
import android.view.ViewGroup;
import com.walmart.android.ui.Presenter;
import com.walmart.android.utils.ViewUtil;

public class SaverGettingResultsPresenter extends Presenter
{

    private View mRoot;

    public SaverGettingResultsPresenter()
    {
    }

    public View getView()
    {
        return mRoot;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRoot == null)
        {
            mRoot = ViewUtil.inflate(viewgroup.getContext(), 0x7f040151, viewgroup, false);
        }
    }
}
