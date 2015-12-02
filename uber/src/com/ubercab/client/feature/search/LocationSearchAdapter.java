// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import cev;
import ffy;
import java.util.ArrayList;
import java.util.List;

public final class LocationSearchAdapter extends BaseAdapter
{

    private final cev a;
    private final Context b;
    private List c;
    private final boolean d;
    private final boolean e;
    private String f;

    public LocationSearchAdapter(Context context, cev cev, boolean flag, boolean flag1)
    {
        b = context;
        c = new ArrayList();
        a = cev;
        d = flag;
        e = flag1;
    }

    static cev a(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.a;
    }

    private ffy a(int i)
    {
        return (ffy)c.get(i);
    }

    static Context b(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.b;
    }

    static String c(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.f;
    }

    static boolean d(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.d;
    }

    static boolean e(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.e;
    }

    static List f(LocationSearchAdapter locationsearchadapter)
    {
        return locationsearchadapter.c;
    }

    public final List a()
    {
        return c;
    }

    public final void a(List list, String s)
    {
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
        }
        c = ((List) (obj));
        f = s;
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return c.size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(b).inflate(0x7f03016f, viewgroup, false);
            view1.setTag(new LocationViewHolder(view1));
        }
        view = a(i);
        ((LocationViewHolder)view1.getTag()).a(view, i);
        return view1;
    }

    private class LocationViewHolder
    {

        final LocationSearchAdapter a;
        private int b;
        private ffy c;
        ImageButton mEditLocationButton;
        ImageView mImageViewIcon;
        LinearLayout mItemView;
        LinearLayout mLayoutFare;
        TextView mTextViewFare;
        TextView mTextViewFareDescription;
        TextView mTextViewSubtitle;
        TextView mTextViewTagline;
        TextView mTextViewTitle;

        private int a(int i)
        {
            if (i == 0 && LocationSearchAdapter.f(a).size() == 1)
            {
                return 0x7f0200e8;
            }
            if (i == 0)
            {
                return 0x7f02010d;
            }
            return i != LocationSearchAdapter.f(a).size() - 1 ? 0x7f0200fb : 0x7f0200e9;
        }

        public final void a(ffy ffy1, int i)
        {
            boolean flag1 = true;
            c = ffy1;
            b = i;
            android.content.res.Resources resources = LocationSearchAdapter.b(a).getResources();
            String s = ffy1.a(resources);
            String s1 = ffy1.e();
            mImageViewIcon.setImageResource(ffy1.d());
            boolean flag;
            if (!TextUtils.isEmpty(LocationSearchAdapter.c(a)) && b == 0)
            {
                mTextViewTagline.setVisibility(0);
                mTextViewTagline.setText(LocationSearchAdapter.c(a));
            } else
            {
                mTextViewTagline.setVisibility(8);
            }
            if (ffy1.a() && ffy1.c() != null)
            {
                mEditLocationButton.setVisibility(0);
            } else
            {
                mEditLocationButton.setVisibility(8);
            }
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (TextUtils.isEmpty(s1))
            {
                flag1 = false;
            }
            if (flag && flag1)
            {
                mTextViewTitle.setText(s);
                mTextViewSubtitle.setText(s1);
                mTextViewSubtitle.setVisibility(0);
            } else
            if (!flag)
            {
                mTextViewTitle.setText(s1);
                mTextViewSubtitle.setVisibility(8);
            } else
            {
                mTextViewTitle.setText(s);
                mTextViewSubtitle.setVisibility(8);
            }
            mTextViewTitle.setTextColor(ffy1.b(resources));
            if (LocationSearchAdapter.d(a))
            {
                mItemView.setBackgroundResource(a(i));
            }
            if (!LocationSearchAdapter.e(a))
            {
                mEditLocationButton.setClickable(false);
            }
            if (ffy1.f())
            {
                ffy1 = ffy1.g().getMetadata();
                mLayoutFare.setVisibility(0);
                mTextViewFare.setText(ffy1.getFormattedFare());
                mTextViewFareDescription.setText(ffy1.getShortDescription());
                return;
            } else
            {
                mLayoutFare.setVisibility(8);
                return;
            }
        }

        public final void onClickEdit()
        {
            if (c == null)
            {
                return;
            } else
            {
                LocationSearchAdapter.a(a).c(new fgb(c.b(), c.c(), b));
                return;
            }
        }

        public final void onItemClick()
        {
            if (c != null)
            {
                Object obj = c.c();
                if (c.a() && obj == null)
                {
                    LocationSearchAdapter.a(a).c(new fga(c.b(), b));
                    return;
                }
                if (obj != null && ((LocationSearchResult) (obj)).getUberLatLng() != null)
                {
                    LocationSearchAdapter.a(a).c(new fgd(((LocationSearchResult) (obj)), c.g(), c.b()));
                    return;
                }
                if (obj != null)
                {
                    String s = ((LocationSearchResult) (obj)).getReference();
                    obj = ((LocationSearchResult) (obj)).getType();
                    LocationSearchAdapter.a(a).c(new fgc(s, ((String) (obj))));
                    return;
                }
            }
        }

        public LocationViewHolder(View view)
        {
            a = LocationSearchAdapter.this;
            super();
            ButterKnife.inject(this, view);
        }
    }

}
