// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.ui;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

public class Popup
{
    public static interface OnDismissListener
    {

        public abstract void onDismiss();
    }


    private static final String TAG = com/walmartlabs/ui/Popup.getSimpleName();
    private boolean mAlwaysDismiss;
    private View mAnchorView;
    private int mAnchorWidth;
    private View mContentView;
    private Context mContext;
    private boolean mIsDismissed;
    private OnDismissListener mListener;
    private boolean mOnTop;
    private PopupWindow mPopupWindow;
    private int mPosX;
    private int mPosY;

    public Popup(Context context)
    {
        init(context);
    }

    public Popup(Context context, int i)
    {
        init(context);
        setContentView(i);
    }

    public Popup(Context context, View view)
    {
        init(context);
        if (view != null)
        {
            setContentView(view);
        }
    }

    private void calculatePositions()
    {
        if (mAnchorView != null)
        {
            int ai[] = new int[2];
            mAnchorView.getLocationOnScreen(ai);
            mAnchorWidth = mAnchorView.getWidth();
            int j = mContentView.getWidth();
            int i = mContentView.getHeight();
            j = (int)((double)(mAnchorView.getWidth() - j) * 0.5D);
            if (mOnTop)
            {
                i = -i + 5;
            } else
            {
                i = mAnchorView.getHeight() - 5;
            }
            mPosX = ai[0] + j;
            mPosY = ai[1] + i;
        }
    }

    private void init(Context context)
    {
        mContext = context;
        mAlwaysDismiss = true;
        mPopupWindow = new PopupWindow(mContext);
        wireListeners();
    }

    private void initWindow()
    {
        mPopupWindow.setWidth(-2);
        mPopupWindow.setHeight(-2);
        mContentView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        alwaysDismiss(true);
    }

    private void wireListeners()
    {
        mPopupWindow.setOnDismissListener(new android.widget.PopupWindow.OnDismissListener() {

            final Popup this$0;

            public void onDismiss()
            {
                if (mListener != null)
                {
                    mListener.onDismiss();
                }
            }

            
            {
                this$0 = Popup.this;
                super();
            }
        });
    }

    public void alwaysDismiss(boolean flag)
    {
        BitmapDrawable bitmapdrawable = null;
        mAlwaysDismiss = flag;
        if (flag)
        {
            bitmapdrawable = new BitmapDrawable();
        }
        mPopupWindow.setOutsideTouchable(flag);
        mPopupWindow.setBackgroundDrawable(bitmapdrawable);
    }

    public void dismiss()
    {
        mIsDismissed = true;
        mPopupWindow.dismiss();
    }

    public void onConfigurationChanged()
    {
        if (!mIsDismissed && mAnchorView != null)
        {
            mAnchorView.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final Popup this$0;

                public void onGlobalLayout()
                {
                    if (mAnchorView.getWidth() != mAnchorWidth)
                    {
                        update();
                        mAnchorView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }

            
            {
                this$0 = Popup.this;
                super();
            }
            });
        }
    }

    public void setContentView(int i)
    {
        setContentView(((LayoutInflater)mContext.getSystemService("layout_inflater")).inflate(i, null));
    }

    public void setContentView(View view)
    {
        mContentView = view;
        mPopupWindow.setContentView(view);
        mContentView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final Popup this$0;

            public boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (mAlwaysDismiss)
                {
                    dismiss();
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = Popup.this;
                super();
            }
        });
    }

    public void setFocusable(boolean flag)
    {
        mPopupWindow.setFocusable(flag);
    }

    public void setOnDismissListener(OnDismissListener ondismisslistener)
    {
        mListener = ondismisslistener;
    }

    public void show(View view)
    {
        show(view, true);
    }

    public void show(View view, int i)
    {
        show(view, true, i);
    }

    public void show(View view, boolean flag)
    {
        show(view, flag, 0);
    }

    public void show(final View anchor, boolean flag, int i)
    {
        initWindow();
        mIsDismissed = false;
        mAnchorView = anchor;
        mOnTop = flag;
        if (mOnTop)
        {
            mPopupWindow.setAnimationStyle(com.walmart.lib.R.style.Animation_Popup_Top);
        } else
        {
            mPopupWindow.setAnimationStyle(com.walmart.lib.R.style.Animation_Popup_Bottom);
        }
        anchor.postDelayed(new Runnable() {

            final Popup this$0;
            final View val$anchor;

            public void run()
            {
                if (mAnchorView.getWindowToken() == null || mIsDismissed)
                {
                    break MISSING_BLOCK_LABEL_82;
                }
                mContentView.setVisibility(4);
                mPopupWindow.showAtLocation(mAnchorView, 0, mPosX, mPosY);
                anchor.post(new Runnable() {

                    final _cls3 this$1;

                    public void run()
                    {
                        mContentView.setVisibility(0);
                        update();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                });
                return;
                Exception exception;
                exception;
                Log.w(Popup.TAG, "Exception when trying to show popup. This should not happen. ", exception);
                return;
            }

            
            {
                this$0 = Popup.this;
                anchor = view;
                super();
            }
        }, i);
    }

    public void update()
    {
        calculatePositions();
        mPopupWindow.update(mPosX, mPosY, -1, -1);
    }











}
