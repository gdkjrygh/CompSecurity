// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.app.ActionBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinDisplayView

public class CheckinPhotoDisplayLayout extends FrameLayout
    implements CheckinDisplayView
{

    private static final String TAG = "CheckinPhotoDisplayLayout";
    ActionBar actionBar;
    private CheckinHistoryRecord pendingRecord;
    private int titleResourceId;

    public CheckinPhotoDisplayLayout(Context context)
    {
        super(context);
        titleResourceId = 0x7f0700bf;
    }

    public CheckinPhotoDisplayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        titleResourceId = 0x7f0700bf;
    }

    public CheckinPhotoDisplayLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        titleResourceId = 0x7f0700bf;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        super.dispatchTouchEvent(motionevent);
        return true;
    }

    public void displayReport(CheckinHistoryRecord checkinhistoryrecord)
    {
        LogUtil.d("CheckinPhotoDisplayLayout", LoggingMetaTags.TWC_SOCIAL, "Displaying: %s", new Object[] {
            checkinhistoryrecord
        });
        String s = (String)Preconditions.checkNotNull(checkinhistoryrecord.getImagePath());
        ImageView imageview = (ImageView)findViewById(0x7f0d00d0);
        int i = imageview.getMeasuredWidth();
        int j = imageview.getMeasuredHeight();
        if (i > 0 && j > 0)
        {
            checkinhistoryrecord = new File(s);
            Picasso.with(getContext()).load(checkinhistoryrecord).skipMemoryCache().resize(i, j).centerInside().into(imageview);
            return;
        } else
        {
            pendingRecord = checkinhistoryrecord;
            return;
        }
    }

    public void initialize()
    {
        actionBar.setNavigationMode(0);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(titleResourceId);
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        CheckinHistoryRecord checkinhistoryrecord = pendingRecord;
        if (checkinhistoryrecord != null)
        {
            pendingRecord = null;
            displayReport(checkinhistoryrecord);
        }
    }

    public void showToast(String s)
    {
        Toast.makeText(getContext(), s, 0).show();
    }

    public void switchToHistoryDisplay()
    {
        titleResourceId = 0x7f07009c;
    }
}
