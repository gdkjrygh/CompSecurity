// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.database.Cursor;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import java.io.File;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinHistoryDetailPager, CheckinDisplayView, CheckinHistoryDetailController

private class <init> extends PagerAdapter
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

    private ()
    {
        this$0 = CheckinHistoryDetailPager.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
