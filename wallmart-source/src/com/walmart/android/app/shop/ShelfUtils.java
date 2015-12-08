// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import com.walmart.android.utils.UrlUtils;
import com.walmart.android.utils.ViewUtil;

public class ShelfUtils
{

    private static final int MIN_GRID_COLUMN_COUNT = 2;

    public ShelfUtils()
    {
    }

    public static boolean canUseShelfGrid(Context context)
    {
        int i = context.getResources().getDimensionPixelSize(0x7f0a006f);
        return ViewUtil.getScreenMinDimension(context) > i * 2;
    }

    public static boolean canUseSplitScreen(Context context)
    {
        return isEnoughWidthForSplitScreen(ViewUtil.getScreenMaxDimension(context), context.getResources());
    }

    public static String fromHtml(String s)
    {
        if (s == null)
        {
            s = "";
        } else
        {
            android.text.Spanned spanned = Html.fromHtml(s, null, null);
            if (spanned != null)
            {
                return spanned.toString();
            }
        }
        return s;
    }

    public static String getImageUrlFromThumbnailUrl(String s)
    {
        String s1 = s;
        if (!TextUtils.isEmpty(s))
        {
            s1 = UrlUtils.getURLFromThumbnailURL(UrlUtils.IMAGE_SIZE_100, s);
        }
        return s1;
    }

    public static boolean isEnoughWidthForSplitScreen(int i, Resources resources)
    {
        return i > resources.getDimensionPixelSize(0x7f0a00ab) + resources.getDimensionPixelSize(0x7f0a006f) * 2;
    }
}
