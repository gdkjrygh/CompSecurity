// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.facade.Temperature;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinIconProvider, CheckinIcon

public class CheckinHistoryAdapter extends CursorAdapter
{

    private static final String TAG = "CheckinHistoryAdaptor";
    private final DateFormat dayFormat = DateFormat.getDateInstance(2, Locale.getDefault());
    private final CheckinIconProvider iconProvider;
    private final int iconSize;
    private final LayoutInflater inflater;
    private final int inset;
    private final DateFormat timeFormat;

    public CheckinHistoryAdapter(Context context, Cursor cursor, int i, CheckinIconProvider checkiniconprovider)
    {
        super(context, cursor, i);
        iconProvider = (CheckinIconProvider)Preconditions.checkNotNull(checkiniconprovider);
        inflater = LayoutInflater.from(context);
        if (android.text.format.DateFormat.is24HourFormat(context))
        {
            cursor = "HH:mm";
        } else
        {
            cursor = "hh:mma";
        }
        timeFormat = new SimpleDateFormat(cursor, Locale.getDefault());
        iconSize = context.getResources().getDimensionPixelOffset(0x7f0a00ab);
        inset = context.getResources().getDimensionPixelOffset(0x7f0a00aa);
    }

    public void bindView(View view, Context context, Cursor cursor)
    {
        cursor = CheckinHistoryManager.extractRecord(cursor);
    /* block-local class not found */
    class ViewHolder {}

        ViewHolder viewholder = (ViewHolder)view.getTag();
        view = new CheckinIcon(cursor.getUserIconCode(), context);
        android.graphics.drawable.Drawable drawable = iconProvider.getDrawable(context, view.getIconResourceId());
        Picasso.with(context).cancelRequest(viewholder.checkinIcon);
    /* block-local class not found */
    class PhotoTransformation {}

        if (cursor.getImagePath() == null)
        {
            viewholder.checkinIcon.setImageDrawable(drawable);
        } else
        {
            Picasso.with(mContext).load((new StringBuilder()).append("file:").append(cursor.getImagePath()).toString()).error(drawable).transform(new PhotoTransformation(view, iconSize, inset, null)).noFade().into(viewholder.checkinIcon);
        }
        viewholder.weatherText.setText(view.getShortIconPhrase());
        context = DataUnits.getCurrentUnitType();
        if (UnitType.ENGLISH == context)
        {
            view = cursor.getTemperatureFahrenheit();
        } else
        {
            view = cursor.getTemperatureCelsius();
        }
        view = new Temperature(view, context);
        viewholder.temperatureView.setText(view.format());
        viewholder.locationNameView.setText(cursor.getLocationName());
        view = new Date(cursor.getTimestamp());
        viewholder.dayView.setText(dayFormat.format(view).toUpperCase(Locale.getDefault()));
        viewholder.timeView.setText(timeFormat.format(view));
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = (View)Preconditions.checkNotNull(inflater.inflate(0x7f030021, viewgroup, false));
        context.setTag(new ViewHolder(context));
        return context;
    }
}
