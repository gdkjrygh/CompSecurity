// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaScannerConnection;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Preconditions;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.facade.Temperature;
import com.weather.commons.ui.WxIconBitmapCache;
import com.weather.dal2.net.Receiver;
import com.weather.util.DataUnits;
import com.weather.util.UnitType;
import com.weather.util.bitmaps.BitmapUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinIcon

public class CheckinImageCreator
{

    private static final String TAG = "CheckinImageCreator";
    private final Context context;
    private final Executor executor;

    public CheckinImageCreator(Executor executor1, Context context1)
    {
        executor = executor1;
        context = context1;
    }

    private Bitmap addCheckin(Bitmap bitmap, CheckinHistoryRecord checkinhistoryrecord)
    {
        View view = (View)Preconditions.checkNotNull(LayoutInflater.from(context).inflate(0x7f030084, new LinearLayout(context), false));
        view.setBackgroundDrawable(new BitmapDrawable(context.getResources(), bitmap));
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(i, j));
        int k = (new CheckinIcon(checkinhistoryrecord.getUserIconCode(), context)).getIconResourceId();
        ((ImageView)view.findViewById(0x7f0d0206)).setImageBitmap(WxIconBitmapCache.getBitmap(k));
        TextView textview = (TextView)view.findViewById(0x7f0d00a3);
        UnitType unittype = DataUnits.getCurrentUnitType();
        if (UnitType.ENGLISH == unittype)
        {
            bitmap = checkinhistoryrecord.getTemperatureFahrenheit();
        } else
        {
            bitmap = checkinhistoryrecord.getTemperatureCelsius();
        }
        textview.setText((new Temperature(bitmap, unittype)).format());
        ((TextView)view.findViewById(0x7f0d0208)).setText(checkinhistoryrecord.getLocationName());
        ((TextView)view.findViewById(0x7f0d0209)).setText(DateFormat.getDateTimeInstance(1, 3, Locale.getDefault()).format(new Date(checkinhistoryrecord.getTimestamp())));
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000));
        view.layout(0, 0, i, j);
        bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        LogUtil.d("CheckinImageCreator", LoggingMetaTags.TWC_SOCIAL, "addCheckin: %s", new Object[] {
            BitmapUtil.getBitMapInfo(bitmap)
        });
        view.draw(new Canvas(bitmap));
        return bitmap;
    }

    private static int calculateSampleSize(int i, int j)
    {
        int l = 1;
        int k = 1;
        if (i > j)
        {
            do
            {
                l = k;
                if (i / k <= j)
                {
                    break;
                }
                k *= 2;
            } while (true);
        }
        return l;
    }

    private static Bitmap loadAndScaleImage(String s, int i)
        throws IOException
    {
label0:
        {
            if (!(new File(s)).exists())
            {
                Log.w("CheckinImageCreator", (new StringBuilder()).append("file ").append(s).append(" does not exist").toString());
            }
            Object obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
            int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
            int l = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
            LogUtil.d("CheckinImageCreator", LoggingMetaTags.TWC_SOCIAL, "sourceWidth=%s, sourceHeight=%s", new Object[] {
                Integer.valueOf(k), Integer.valueOf(l)
            });
            int i1 = BitmapUtil.getImageRotationDegrees(s);
            boolean flag;
            if (i1 == 90 || i1 == 180)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj.inJustDecodeBounds = false;
            if (flag)
            {
                k = l;
            }
            obj.inSampleSize = calculateSampleSize(k, i);
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
            if (obj == null)
            {
                throw new IOException((new StringBuilder()).append("Unable to load bitmap from ").append(s).toString());
            }
            LogUtil.d("CheckinImageCreator", LoggingMetaTags.TWC_SOCIAL, "Bitmap loaded: %s", new Object[] {
                BitmapUtil.getBitMapInfo(((Bitmap) (obj)))
            });
            int j;
            boolean flag1;
            boolean flag2;
            if (i1 != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag)
            {
                j = ((Bitmap) (obj)).getHeight();
            } else
            {
                j = ((Bitmap) (obj)).getWidth();
            }
            if (j != i)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (!flag1)
            {
                s = ((String) (obj));
                if (!flag2)
                {
                    break label0;
                }
            }
            s = new Matrix();
            if (flag2)
            {
                float f = (float)i / (float)j;
                s.preScale(f, f);
            }
            if (flag1)
            {
                s.postRotate(i1);
            }
            s = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), s, true);
        }
        return s;
    }

    private void updateImage(CheckinHistoryRecord checkinhistoryrecord, int i, File file)
        throws IOException
    {
        String s;
        s = (String)Preconditions.checkNotNull(checkinhistoryrecord.getImagePath());
        file = addCheckin(loadAndScaleImage(file.getAbsolutePath(), i), checkinhistoryrecord);
        checkinhistoryrecord = new FileOutputStream(s);
        if (!file.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, checkinhistoryrecord))
        {
            throw new IOException("Unable to save updated image");
        }
        break MISSING_BLOCK_LABEL_67;
        file;
        checkinhistoryrecord.close();
        throw file;
        checkinhistoryrecord.close();
        checkinhistoryrecord = context;
        file = new _cls2();
        MediaScannerConnection.scanFile(checkinhistoryrecord, new String[] {
            s
        }, null, file);
        return;
    }

    public void asyncUpdateImage(CheckinHistoryRecord checkinhistoryrecord, int i, File file, Receiver receiver)
    {
        Preconditions.checkNotNull(file);
        Preconditions.checkNotNull(checkinhistoryrecord);
        Preconditions.checkNotNull(receiver);
        Preconditions.checkNotNull(checkinhistoryrecord.getImagePath());
        try
        {
            executor.execute(new _cls1(checkinhistoryrecord, i, file, receiver));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CheckinHistoryRecord checkinhistoryrecord)
        {
            Log.w("CheckinImageCreator", (new StringBuilder()).append(checkinhistoryrecord.getClass().getSimpleName()).append(':').append(checkinhistoryrecord.getMessage()).toString());
        }
    }


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
