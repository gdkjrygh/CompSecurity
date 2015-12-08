// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.content.Context;
import android.database.Cursor;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import java.io.File;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinHistoryView, CheckinHistoryDetailController, CheckinDisplayView

public class CheckinHistoryDetailPager extends ViewPager
    implements CheckinHistoryView
{
    private class HistoryAdapter extends PagerAdapter
    {

        private Cursor cursor;
        final CheckinHistoryDetailPager this$0;

        public void destroyItem(ViewGroup viewgroup, int i, Object obj)
        {
            if (obj instanceof View)
            {
                viewgroup.removeView((View)obj);
            }
        }

        public int getCount()
        {
            if (cursor == null)
            {
                return 0;
            } else
            {
                return cursor.getCount();
            }
        }

        public Object instantiateItem(ViewGroup viewgroup, int i)
        {
            if (cursor == null)
            {
                return null;
            }
            cursor.moveToPosition(i);
            CheckinHistoryRecord checkinhistoryrecord = CheckinHistoryManager.extractRecord(cursor);
            Object obj = LayoutInflater.from(getContext());
            Object obj1 = checkinhistoryrecord.getImagePath();
            if (obj1 == null || !(new File(((String) (obj1)))).exists())
            {
                obj = (CheckinDisplayView)Preconditions.checkNotNull(((LayoutInflater) (obj)).inflate(0x7f03001e, CheckinHistoryDetailPager.this, false));
            } else
            {
                obj = (CheckinDisplayView)Preconditions.checkNotNull(((LayoutInflater) (obj)).inflate(0x7f030024, CheckinHistoryDetailPager.this, false));
            }
            obj1 = (View)obj;
            controller.setupView(((CheckinDisplayView) (obj)));
            ((View) (obj1)).setBackgroundDrawable(null);
            ((CheckinDisplayView) (obj)).displayReport(checkinhistoryrecord);
            viewgroup.addView(((View) (obj1)));
            return obj;
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return view.equals(obj);
        }

        public void swapCursor(Cursor cursor1)
        {
            if (Objects.equal(cursor, cursor1))
            {
                return;
            } else
            {
                cursor = cursor1;
                notifyDataSetChanged();
                return;
            }
        }

        private HistoryAdapter()
        {
            this$0 = CheckinHistoryDetailPager.this;
            super();
        }

        HistoryAdapter(_cls1 _pcls1)
        {
            this();
        }
    }


    ActionBar actionBar;
    private HistoryAdapter adapter;
    CheckinHistoryDetailController controller;
    private Cursor cursor;

    public CheckinHistoryDetailPager(Context context)
    {
        super(context);
    }

    public CheckinHistoryDetailPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    private void updatePageSelection(int i)
    {
        if (cursor != null && controller != null)
        {
            cursor.moveToPosition(i);
            CheckinHistoryRecord checkinhistoryrecord = CheckinHistoryManager.extractRecord(cursor);
            controller.onDetailViewVisible(checkinhistoryrecord);
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        adapter = new HistoryAdapter(null);
        setAdapter(adapter);
        setOnPageChangeListener(new _cls1());
    }

    public void updateCursor(Cursor cursor1)
    {
        cursor = cursor1;
        int i;
        if (cursor1 == null)
        {
            i = -1;
        } else
        {
            i = cursor1.getPosition();
        }
        adapter.swapCursor(cursor1);
        if (i >= 0)
        {
            setCurrentItem(i, false);
        }
        updatePageSelection(i);
    }

    public void updateTitle()
    {
        actionBar.setTitle(0x7f07009c);
    }


    /* member class not found */
    class _cls1 {}

}
