// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Html;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewUtil
{

    private static final String TAG = com/walmart/android/utils/ViewUtil.getSimpleName();

    public ViewUtil()
    {
    }

    public static boolean canAnimate()
    {
        return android.os.Build.VERSION.SDK_INT >= 12;
    }

    public static int dpToPixels(int i, Context context)
    {
        return dpToPixels(i, getDisplayMetrics(context));
    }

    public static int dpToPixels(int i, DisplayMetrics displaymetrics)
    {
        return (int)TypedValue.applyDimension(1, i, displaymetrics);
    }

    public static void enableBackgroundRepeatX(View view, int i)
    {
        ((BitmapDrawable)view.findViewById(i).getBackground()).setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
    }

    public static void enableRepeatX(Context context, View view, int i)
    {
        ((BitmapDrawable)((ImageView)view.findViewById(i)).getDrawable()).setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.CLAMP);
    }

    public static View findViewById(View view, int i)
    {
        return view.findViewById(i);
    }

    public static DisplayMetrics getDisplayMetrics(Context context)
    {
        return context.getResources().getDisplayMetrics();
    }

    public static int getDpi(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return displaymetrics.densityDpi;
    }

    public static String getDpiString(DisplayMetrics displaymetrics)
    {
        switch (displaymetrics.densityDpi)
        {
        default:
            return null;

        case 120: // 'x'
            return "ldpi";

        case 160: 
            return "mdpi";

        case 240: 
            return "hdpi";

        case 320: 
            return "xhdpi";
        }
    }

    public static int getScreenHeight(Context context)
    {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getScreenHeightInDp(Context context)
    {
        return Math.round((float)getScreenHeight(context) / getDisplayMetrics(context).density);
    }

    public static int getScreenMaxDimension(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return Math.max(displaymetrics.heightPixels, displaymetrics.widthPixels);
    }

    public static int getScreenMinDimension(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        return Math.min(displaymetrics.heightPixels, displaymetrics.widthPixels);
    }

    public static int getScreenWidth(Context context)
    {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int getScreenWidthInDp(Context context)
    {
        return Math.round((float)getScreenWidth(context) / getDisplayMetrics(context).density);
    }

    public static String getText(int i, View view)
    {
        return ((TextView)view.findViewById(i)).getText().toString();
    }

    public static String getText(View view, int i)
    {
        return ((TextView)view.findViewById(i)).getText().toString();
    }

    public static void hideKeyboard(View view)
    {
        ((InputMethodManager)view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static View inflate(Context context, int i)
    {
        return LayoutInflater.from(context).inflate(i, null);
    }

    public static View inflate(Context context, int i, ViewGroup viewgroup)
    {
        return inflate(context, i, viewgroup, false);
    }

    public static View inflate(Context context, int i, ViewGroup viewgroup, boolean flag)
    {
        return LayoutInflater.from(context).inflate(i, viewgroup, flag);
    }

    public static boolean isXLargeScreen(Configuration configuration)
    {
        return (configuration.screenLayout & 0xf) == 4;
    }

    private static void recycleBitmapDrawable(BitmapDrawable bitmapdrawable)
    {
        bitmapdrawable = bitmapdrawable.getBitmap();
        if (bitmapdrawable != null && !bitmapdrawable.isRecycled())
        {
            bitmapdrawable.recycle();
        }
    }

    public static void recycleImageView(View view, int i)
    {
        view = view.findViewById(i);
        if (view instanceof ImageView)
        {
            recycleImageView((ImageView)view);
        }
    }

    public static void recycleImageView(ImageView imageview)
    {
        imageview = imageview.getDrawable();
        if (imageview == null) goto _L2; else goto _L1
_L1:
        if (!(imageview instanceof BitmapDrawable)) goto _L4; else goto _L3
_L3:
        recycleBitmapDrawable((BitmapDrawable)imageview);
_L2:
        return;
_L4:
        if (imageview instanceof LayerDrawable)
        {
            imageview = (LayerDrawable)imageview;
            int j = imageview.getNumberOfLayers();
            int i = 0;
            while (i < j) 
            {
                android.graphics.drawable.Drawable drawable = imageview.getDrawable(i);
                if (drawable != null && (drawable instanceof BitmapDrawable))
                {
                    recycleBitmapDrawable((BitmapDrawable)drawable);
                }
                i++;
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static void runAfterLayout(Runnable runnable, View view)
    {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener(runnable, view) {

            final Runnable val$r;
            final View val$view;

            public void onGlobalLayout()
            {
                r.run();
                view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            }

            
            {
                r = runnable;
                view = view1;
                super();
            }
        });
    }

    public static void setImageResource(View view, int i, int j)
    {
        ((ImageView)view.findViewById(j)).setImageResource(i);
    }

    public static void setText(int i, View view, int j)
    {
        ((TextView)view.findViewById(i)).setText(j);
    }

    public static transient void setText(int i, View view, int j, Object aobj[])
    {
        setText(i, view, ((CharSequence) (view.getContext().getResources().getString(j, aobj))));
    }

    public static void setText(int i, View view, CharSequence charsequence)
    {
        ((TextView)view.findViewById(i)).setText(charsequence);
    }

    public static void setText(int i, View view, String s, String s1, boolean flag)
    {
        if (flag)
        {
            setText(i, view, ((CharSequence) (s)));
            return;
        } else
        {
            setText(i, view, ((CharSequence) (s1)));
            return;
        }
    }

    public static void setTextHideIfEmpty(int i, View view, CharSequence charsequence)
    {
        view = (TextView)view.findViewById(i);
        if (TextUtils.isEmpty(charsequence))
        {
            view.setVisibility(8);
            return;
        } else
        {
            view.setVisibility(0);
            view.setText(charsequence);
            return;
        }
    }

    public static transient void setTextHtml(int i, View view, int j, Object aobj[])
    {
        setText(i, view, Html.fromHtml(String.format(view.getContext().getResources().getString(j), aobj)));
    }

    public static transient void setVisibility(View view, int i, int ai[])
    {
        int k = ai.length;
        for (int j = 0; j < k; j++)
        {
            view.findViewById(ai[j]).setVisibility(i);
        }

    }

    public static void showKeyboard(View view)
    {
        if (android.os.Build.VERSION.SDK_INT <= 10 && view.hasFocus())
        {
            view.clearFocus();
        }
        view.requestFocus();
        ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static boolean viewDrawnInView(View view, View view1, float f, Rect rect, Rect rect1)
    {
        float f1 = f;
        if (f < 0.0F)
        {
            f1 = 0.0F;
        }
        f = f1;
        if (f1 > 1.0F)
        {
            f = 1.0F;
        }
        rect.setEmpty();
        rect1.setEmpty();
        View view3 = view;
        View view2 = (View)view.getParent();
        view3.getHitRect(rect);
        view2.getDrawingRect(rect1);
        for (; rect.intersect(rect1) && view2 != view1 && (view3.getParent() instanceof View); view2.getDrawingRect(rect1))
        {
            view3 = view2;
            view2 = (View)view2.getParent();
            rect.offset(-rect1.left, -rect1.top);
            view3.getHitRect(rect1);
            rect.offset(rect1.left, rect1.top);
        }

        return view2 == view1 && (float)(rect.bottom - rect.top) >= (float)view.getHeight() * f && (float)(rect.right - rect.left) >= (float)view.getWidth() * f;
    }

}
