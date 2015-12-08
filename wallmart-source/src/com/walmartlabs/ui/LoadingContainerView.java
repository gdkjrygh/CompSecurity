// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class LoadingContainerView extends FrameLayout
{
    public static interface ErrorActionListener
    {

        public abstract void onClick();
    }

    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State CONTENT;
        public static final State EMPTY;
        public static final State ERROR;
        public static final State LOADING;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/walmartlabs/ui/LoadingContainerView$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            LOADING = new State("LOADING", 0);
            EMPTY = new State("EMPTY", 1);
            ERROR = new State("ERROR", 2);
            CONTENT = new State("CONTENT", 3);
            $VALUES = (new State[] {
                LOADING, EMPTY, ERROR, CONTENT
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }


    private View mContentView;
    private int mContentViewId;
    private int mEmptyIconId;
    private int mEmptyTextId;
    private View mEmptyView;
    private ErrorActionListener mErrorActionListener;
    private int mErrorButtonTextId;
    private int mErrorIconId;
    private int mErrorTextId;
    private View mErrorView;
    private View mLoadingView;
    private State mState;

    public LoadingContainerView(Context context)
    {
        this(context, null);
    }

    public LoadingContainerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingContainerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mState = State.LOADING;
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        context = context.obtainStyledAttributes(attributeset, com.walmart.lib.R.styleable.LoadingContainerView, i, 0);
        mContentViewId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerContentLayout, 0);
        mEmptyTextId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerEmptyText, com.walmart.lib.R.string.loading_container_default_empty);
        mEmptyIconId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerEmptyIcon, 0);
        mErrorTextId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerErrorText, com.walmart.lib.R.string.loading_container_default_error);
        mErrorIconId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerErrorIcon, 0);
        mErrorButtonTextId = context.getResourceId(com.walmart.lib.R.styleable.LoadingContainerView_loadingContainerErrorButtonText, com.walmart.lib.R.string.loading_container_default_error_button);
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
    }

    private void setImageViewDrawable(Drawable drawable, View view, int i)
    {
        view = (ImageView)view.findViewById(i);
        view.setImageDrawable(drawable);
        if (drawable != null)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void setState(State state)
    {
        if (state != mState)
        {
            mState = state;
            updateState();
        }
    }

    private void setTextViewText(String s, View view, int i)
    {
        view = (TextView)view.findViewById(i);
        view.setText(s);
        if (!TextUtils.isEmpty(s))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    private void updateState()
    {
        boolean flag = false;
        int i;
        if (mContentView != null)
        {
            View view = mContentView;
            if (mState == State.CONTENT)
            {
                i = 0;
            } else
            {
                i = 4;
            }
            view.setVisibility(i);
        } else
        if (mState == State.CONTENT)
        {
            mState = State.LOADING;
        }
        view = mEmptyView;
        if (mState == State.EMPTY)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        view = mErrorView;
        if (mState == State.ERROR)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        view = mLoadingView;
        if (mState == State.LOADING)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public View getContentView()
    {
        return mContentView;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        LayoutInflater layoutinflater = LayoutInflater.from(getContext());
        mLoadingView = layoutinflater.inflate(com.walmart.lib.R.layout.loading_container_progress, this, false);
        mEmptyView = layoutinflater.inflate(com.walmart.lib.R.layout.loading_container_empty, this, false);
        mErrorView = layoutinflater.inflate(com.walmart.lib.R.layout.loading_container_error, this, false);
        addView(mEmptyView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        addView(mLoadingView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        addView(mErrorView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        if (mEmptyTextId != 0)
        {
            setEmptyText(mEmptyTextId);
        }
        if (mEmptyIconId != 0)
        {
            setEmptyIcon(mEmptyIconId);
        }
        if (mErrorTextId != 0)
        {
            setErrorText(mErrorTextId);
        }
        if (mErrorButtonTextId != 0)
        {
            setErrorButtonText(mErrorButtonTextId);
        }
        if (mErrorIconId != 0)
        {
            setErrorIcon(mErrorIconId);
        }
        if (mContentViewId != 0)
        {
            setContentView(mContentViewId);
        }
        mErrorView.findViewById(com.walmart.lib.R.id.error_button).setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingContainerView this$0;

            public void onClick(View view)
            {
                if (mErrorActionListener != null)
                {
                    mErrorActionListener.onClick();
                }
            }

            
            {
                this$0 = LoadingContainerView.this;
                super();
            }
        });
        setErrorActionEnabled(false);
        updateState();
    }

    public void setContentState()
    {
        setState(State.CONTENT);
    }

    public void setContentView(int i)
    {
        setContentView(LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public void setContentView(View view)
    {
        if (mContentView != null)
        {
            removeView(mContentView);
        }
        mContentView = view;
        if (mContentView != null)
        {
            addView(mContentView, -1, -1);
        }
        updateState();
    }

    public void setEmptyIcon(int i)
    {
        setEmptyIcon(getResources().getDrawable(i));
    }

    public void setEmptyIcon(Drawable drawable)
    {
        setImageViewDrawable(drawable, mEmptyView, com.walmart.lib.R.id.empty_icon);
    }

    public void setEmptyState()
    {
        setState(State.EMPTY);
    }

    public void setEmptyText(int i)
    {
        setEmptyText(getResources().getString(i));
    }

    public void setEmptyText(String s)
    {
        setTextViewText(s, mEmptyView, com.walmart.lib.R.id.empty_text);
    }

    public void setErrorActionEnabled(boolean flag)
    {
        View view = mErrorView.findViewById(com.walmart.lib.R.id.error_button);
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public void setErrorActionListener(ErrorActionListener erroractionlistener)
    {
        mErrorActionListener = erroractionlistener;
        if (mErrorActionListener != null)
        {
            setErrorActionEnabled(true);
        }
    }

    public void setErrorButtonText(int i)
    {
        setErrorButtonText(getResources().getString(i));
    }

    public void setErrorButtonText(String s)
    {
        setTextViewText(s, mErrorView, com.walmart.lib.R.id.error_button);
    }

    public void setErrorIcon(int i)
    {
        setErrorIcon(getResources().getDrawable(i));
    }

    public void setErrorIcon(Drawable drawable)
    {
        setImageViewDrawable(drawable, mErrorView, com.walmart.lib.R.id.error_icon);
    }

    public void setErrorState()
    {
        setState(State.ERROR);
    }

    public void setErrorText(int i)
    {
        setErrorText(getResources().getString(i));
    }

    public void setErrorText(String s)
    {
        setTextViewText(s, mErrorView, com.walmart.lib.R.id.error_text);
    }

    public void setLoadingState()
    {
        setState(State.LOADING);
    }

}
