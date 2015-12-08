// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.search;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.ResourceCursorAdapter;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;

public class ShopSearchCursorAdapter extends ResourceCursorAdapter
{
    public static interface OnRefinementListener
    {

        public abstract void refinement(String s);
    }


    private static final String TAG = com/walmart/android/app/shop/search/ShopSearchCursorAdapter.getSimpleName();
    private OnRefinementListener mListener;

    public ShopSearchCursorAdapter(Context context, OnRefinementListener onrefinementlistener)
    {
        super(context, 0x7f040180, null, 0);
        mListener = onrefinementlistener;
    }

    private int getResourceId(View view, Cursor cursor, String s)
    {
        boolean flag = false;
        int j = cursor.getColumnIndex(s);
        int i = ((flag) ? 1 : 0);
        if (j >= 0)
        {
            cursor = cursor.getString(j);
            i = ((flag) ? 1 : 0);
            if (!TextUtils.isEmpty(cursor))
            {
                try
                {
                    i = Integer.parseInt(cursor);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return view.getResources().getIdentifier(cursor, "drawable", mContext.getPackageName());
                }
            }
        }
        return i;
    }

    public void bindView(View view, final Context text, Cursor cursor)
    {
        text = cursor.getString(cursor.getColumnIndex("suggest_text_1"));
        ViewUtil.setText(0x7f100538, view, text);
        ImageView imageview = (ImageView)ViewUtil.findViewById(view, 0x7f100535);
        int i = getResourceId(view, cursor, "suggest_icon_1");
        if (i != 0)
        {
            imageview.setImageResource(i);
            imageview.setVisibility(0);
        } else
        {
            imageview.setVisibility(4);
        }
        imageview = (ImageView)ViewUtil.findViewById(view, 0x7f100537);
        i = getResourceId(view, cursor, "suggest_icon_2");
        if (i != 0)
        {
            imageview.setImageResource(i);
            imageview.setVisibility(0);
            imageview.setOnClickListener(new android.view.View.OnClickListener() {

                final ShopSearchCursorAdapter this$0;
                final String val$text;

                public void onClick(View view1)
                {
                    if (mListener != null)
                    {
                        mListener.refinement(text);
                    }
                }

            
            {
                this$0 = ShopSearchCursorAdapter.this;
                text = s;
                super();
            }
            });
            return;
        } else
        {
            imageview.setVisibility(8);
            return;
        }
    }

    public Cursor swapCursor(Cursor cursor)
    {
        if (cursor != null && cursor.isClosed())
        {
            WLog.w(TAG, "swapCursor: New cursor is already closed.");
            return null;
        } else
        {
            return super.swapCursor(cursor);
        }
    }


}
