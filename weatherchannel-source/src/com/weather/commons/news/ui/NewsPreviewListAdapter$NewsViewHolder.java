// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.database.Cursor;
import android.text.Html;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.util.date.TwcDateParser;
import java.text.DateFormat;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsPreviewListAdapter

public static class <init> extends android.support.v7.widget.r
{

    private final DateFormat dateFormat;
    private final TextView dateView;
    private final ImageView heroImage;
    private final TextView titleView;

    void clear()
    {
        titleView.setText(null);
        dateView.setText(null);
        heroImage.setImageBitmap(null);
        itemView.setSelected(false);
    }

    void populate(Cursor cursor, android.view.NewsViewHolder newsviewholder, boolean flag, int i)
    {
        Object obj = null;
        Object obj2 = cursor.getString(cursor.getColumnIndexOrThrow("article_title"));
        Object obj1 = cursor.getString(cursor.getColumnIndexOrThrow("article_publishdate"));
        String s = cursor.getString(cursor.getColumnIndexOrThrow("article_image_small_url"));
        if (obj2 == null)
        {
            cursor = null;
        } else
        {
            cursor = Html.fromHtml(((String) (obj2)));
        }
        titleView.setText(cursor);
        if (obj1 != null)
        {
            obj2 = TwcDateParser.parseISO(((String) (obj1)));
            obj1 = dateView;
            if (obj2 != null)
            {
                obj = dateFormat.format(((java.util.Date) (obj2)));
            }
            ((TextView) (obj1)).setText(((CharSequence) (obj)));
        }
        heroImage.setContentDescription(cursor);
        if (URLUtil.isValidUrl(s))
        {
            Picasso.with(itemView.getContext()).load(s).config(android.graphics.ViewHolder.itemView).into(heroImage);
        }
        itemView.setOnClickListener(newsviewholder);
        itemView.setSelected(flag);
        itemView.setId(i);
    }

    private (View view, DateFormat dateformat)
    {
        super(view);
        dateFormat = dateformat;
        heroImage = (ImageView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.wHolder.heroImage));
        titleView = (TextView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.wHolder.titleView));
        dateView = (TextView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.wHolder.dateView));
    }

    dateView(View view, DateFormat dateformat, dateView dateview)
    {
        this(view, dateformat);
    }
}
