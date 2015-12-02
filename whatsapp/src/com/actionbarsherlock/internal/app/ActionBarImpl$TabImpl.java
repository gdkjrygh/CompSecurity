// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.internal.widget.ScrollingTabContainerView;

// Referenced classes of package com.actionbarsherlock.internal.app:
//            ActionBarImpl

public class mPosition extends com.actionbarsherlock.app..TabImpl
{

    private com.actionbarsherlock.app..TabImpl.mCallback mCallback;
    private CharSequence mContentDesc;
    private View mCustomView;
    private Drawable mIcon;
    private int mPosition;
    private CharSequence mText;
    final ActionBarImpl this$0;

    public com.actionbarsherlock.app..TabImpl getCallback()
    {
        return mCallback;
    }

    public CharSequence getContentDescription()
    {
        return mContentDesc;
    }

    public View getCustomView()
    {
        return mCustomView;
    }

    public Drawable getIcon()
    {
        return mIcon;
    }

    public int getPosition()
    {
        return mPosition;
    }

    public CharSequence getText()
    {
        return mText;
    }

    public void select()
    {
        selectTab(this);
    }

    public com.actionbarsherlock.app..TabImpl setIcon(int i)
    {
        return setIcon(ActionBarImpl.access$700(ActionBarImpl.this).getResources().getDrawable(i));
    }

    public com.actionbarsherlock.app..TabImpl setIcon(Drawable drawable)
    {
        mIcon = drawable;
        if (mPosition >= 0)
        {
            ActionBarImpl.access$800(ActionBarImpl.this).updateTab(mPosition);
        }
        return this;
    }

    public void setPosition(int i)
    {
        mPosition = i;
    }

    public com.actionbarsherlock.app..TabImpl setTabListener(com.actionbarsherlock.app..TabImpl tabimpl)
    {
        mCallback = tabimpl;
        return this;
    }

    public erView()
    {
        this$0 = ActionBarImpl.this;
        super();
        mPosition = -1;
    }
}
