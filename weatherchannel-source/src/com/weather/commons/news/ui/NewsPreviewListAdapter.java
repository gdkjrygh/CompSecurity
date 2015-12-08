// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.database.Cursor;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.util.TwcPreconditions;
import com.weather.util.date.TwcDateParser;
import java.text.DateFormat;
import java.util.Locale;

public class NewsPreviewListAdapter extends android.support.v7.widget.RecyclerView.Adapter
{
    public static interface ArticleSelectionListener
    {

        public abstract void onSelected(int i);
    }

    private final class ClickListener
        implements android.view.View.OnClickListener
    {

        private final int position;
        final NewsPreviewListAdapter this$0;

        public void onClick(View view)
        {
            if (listener != null)
            {
                listener.onSelected(position);
            }
        }

        private ClickListener(int i)
        {
            this$0 = NewsPreviewListAdapter.this;
            super();
            position = i;
        }

    }

    public static class NewsViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
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

        void populate(Cursor cursor1, android.view.View.OnClickListener onclicklistener, boolean flag, int i)
        {
            Object obj = null;
            Object obj2 = cursor1.getString(cursor1.getColumnIndexOrThrow("article_title"));
            Object obj1 = cursor1.getString(cursor1.getColumnIndexOrThrow("article_publishdate"));
            String s = cursor1.getString(cursor1.getColumnIndexOrThrow("article_image_small_url"));
            if (obj2 == null)
            {
                cursor1 = null;
            } else
            {
                cursor1 = Html.fromHtml(((String) (obj2)));
            }
            titleView.setText(cursor1);
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
            heroImage.setContentDescription(cursor1);
            if (URLUtil.isValidUrl(s))
            {
                Picasso.with(itemView.getContext()).load(s).config(android.graphics.Bitmap.Config.RGB_565).into(heroImage);
            }
            itemView.setOnClickListener(onclicklistener);
            itemView.setSelected(flag);
            itemView.setId(i);
        }

        private NewsViewHolder(View view, DateFormat dateformat)
        {
            super(view);
            dateFormat = dateformat;
            heroImage = (ImageView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.R.id.news_preview_image));
            titleView = (TextView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.R.id.news_preview_title));
            dateView = (TextView)Preconditions.checkNotNull(view.findViewById(com.weather.commons.R.id.news_preview_publish_date));
        }

    }


    private Cursor cursor;
    private final DateFormat dateFormat = DateFormat.getDateInstance(1, Locale.getDefault());
    private final Integer filterPosition;
    private ArticleSelectionListener listener;
    private final RecyclerView recyclerView;
    private Integer selectedIndex;

    public NewsPreviewListAdapter(Integer integer, Cursor cursor1, RecyclerView recyclerview)
    {
        filterPosition = integer;
        cursor = cursor1;
        recyclerView = (RecyclerView)Preconditions.checkNotNull(recyclerview);
        if (integer != null)
        {
            TwcPreconditions.checkNonNegative(integer.intValue());
        }
    }

    private void changeSelection(int i, boolean flag)
    {
        if (filterPosition != null && i >= filterPosition.intValue())
        {
            i++;
        }
        View view = recyclerView.findViewById(i);
        if (view != null)
        {
            view.setSelected(flag);
            view.invalidate();
        }
    }

    public int getItemCount()
    {
        int i;
        int j;
        if (cursor == null)
        {
            i = 0;
        } else
        {
            i = cursor.getCount();
        }
        j = i;
        if (filterPosition != null)
        {
            j = i;
            if (i > filterPosition.intValue())
            {
                j = i - 1;
            }
        }
        return j;
    }

    public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        onBindViewHolder((NewsViewHolder)viewholder, i);
    }

    public void onBindViewHolder(NewsViewHolder newsviewholder, int i)
    {
        if (cursor != null)
        {
            int j;
            if (filterPosition != null && i >= filterPosition.intValue())
            {
                j = i + 1;
            } else
            {
                j = i;
            }
            cursor.moveToPosition(j);
            newsviewholder.populate(cursor, new ClickListener(j), Objects.equal(Integer.valueOf(i), selectedIndex), j);
            return;
        } else
        {
            newsviewholder.clear();
            return;
        }
    }

    public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return onCreateViewHolder(viewgroup, i);
    }

    public NewsViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new NewsViewHolder(LayoutInflater.from(viewgroup.getContext()).inflate(com.weather.commons.R.layout.news_preview, viewgroup, false), dateFormat);
    }

    public void setListener(ArticleSelectionListener articleselectionlistener)
    {
        listener = articleselectionlistener;
    }

    public void setSelectedIndex(Integer integer)
    {
        if (!Objects.equal(selectedIndex, integer))
        {
            if (selectedIndex != null)
            {
                changeSelection(selectedIndex.intValue(), false);
            }
            if (integer != null)
            {
                changeSelection(integer.intValue(), true);
            }
            selectedIndex = integer;
        }
    }

    public void swapCursor(Cursor cursor1)
    {
        if (cursor == cursor1)
        {
            return;
        } else
        {
            cursor = cursor1;
            notifyDataSetChanged();
            return;
        }
    }

}
