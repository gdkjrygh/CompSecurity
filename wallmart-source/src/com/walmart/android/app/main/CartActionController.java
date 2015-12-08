// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ActionProvider;
import android.view.View;
import android.widget.ImageView;
import com.squareup.otto.Bus;
import com.walmart.android.events.CartActionClickedEvent;
import com.walmart.android.events.CartItemCountUpdatedEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.CartManager;
import com.walmart.android.wmservice.Services;

public class CartActionController extends ActionProvider
{

    private static final String TAG = com/walmart/android/app/main/CartActionController.getSimpleName();
    private ImageView mActionProviderView;
    private Activity mActivity;
    private int mCurrentCartCount;
    private Drawable mCurrentCartDrawable;
    private final Rect mTextBoundsRect = new Rect();
    private final int mTextOffset;
    private Paint mTextPaintDefault;

    public CartActionController(Activity activity)
    {
        super(activity);
        mActivity = activity;
        activity = activity.getResources();
        mTextPaintDefault = new Paint();
        mTextPaintDefault.setColor(activity.getColor(0x7f0f0020));
        mTextPaintDefault.setTextSize(activity.getDimensionPixelSize(0x7f0a005d));
        mTextPaintDefault.setTypeface(Typeface.DEFAULT_BOLD);
        mTextPaintDefault.setAntiAlias(true);
        mTextPaintDefault.setTextAlign(android.graphics.Paint.Align.CENTER);
        mTextOffset = activity.getDimensionPixelSize(0x7f0a005c);
    }

    private Drawable createCartDrawable(int i, Paint paint, String s)
    {
        BitmapDrawable bitmapdrawable = (BitmapDrawable)mActivity.getResources().getDrawable(i);
        paint.getTextBounds(s, 0, s.length(), mTextBoundsRect);
        i = bitmapdrawable.getIntrinsicHeight();
        int j = mTextBoundsRect.height();
        int k = bitmapdrawable.getIntrinsicWidth();
        Bitmap bitmap = Bitmap.createBitmap(k, i + j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawBitmap(bitmapdrawable.getBitmap(), 0.0F, mTextBoundsRect.height(), null);
        canvas.drawText(s, mTextOffset + (k - mTextOffset >> 1), mTextBoundsRect.height(), paint);
        return new BitmapDrawable(mActivity.getResources(), bitmap);
    }

    private Drawable getCartDrawable(int i)
    {
        if (i != mCurrentCartCount || mCurrentCartDrawable == null)
        {
            if (i == 0)
            {
                mCurrentCartDrawable = mActivity.getResources().getDrawable(0x7f02003e);
            } else
            {
                String s;
                if (i < 100)
                {
                    s = Integer.toString(i);
                } else
                {
                    s = "99+";
                }
                mCurrentCartDrawable = createCartDrawable(0x7f02003e, mTextPaintDefault, s);
            }
        }
        mCurrentCartCount = i;
        return mCurrentCartDrawable;
    }

    private void update()
    {
        if (mActionProviderView != null)
        {
            updateDrawable(Services.get().getCartManager().getItemCount());
        }
    }

    private void updateDrawable(int i)
    {
        if (mActionProviderView != null)
        {
            mActionProviderView.setImageDrawable(getCartDrawable(i));
        }
    }

    public void destroy()
    {
        MessageBus.getBus().unregister(this);
    }

    public void init()
    {
        MessageBus.getBus().register(this);
    }

    public void onCartItemCountUpdated(CartItemCountUpdatedEvent cartitemcountupdatedevent)
    {
        update();
    }

    public View onCreateActionView()
    {
        mActionProviderView = (ImageView)ViewUtil.inflate(getContext(), 0x7f040033, null);
        mActionProviderView.setOnClickListener(new android.view.View.OnClickListener() {

            final CartActionController this$0;

            public void onClick(View view)
            {
                switchToCart();
                MessageBus.getBus().post(new CartActionClickedEvent());
            }

            
            {
                this$0 = CartActionController.this;
                super();
            }
        });
        update();
        return mActionProviderView;
    }

    protected void switchToCart()
    {
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HYBRID_CART, null, true));
    }

}
