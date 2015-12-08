// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.chat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaScannerConnection;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.google.common.base.Preconditions;
import com.weather.util.bitmaps.BitmapUtil;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.weather.Weather.chat:
//            ChatOverlayViewer, ChatOverlayData

public class ChatImageCreator
{

    private static final String TAG = "ChatImageCreator";
    private final Context context;

    public ChatImageCreator(Context context1)
    {
        context = context1;
    }

    private Bitmap addOverlay(Bitmap bitmap, int i, ChatOverlayData chatoverlaydata)
    {
        int j = bitmap.getWidth();
        int k = bitmap.getHeight();
        Object obj = new FrameLayout(context);
        ((FrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(j, k, 0));
        obj = (View)Preconditions.checkNotNull(LayoutInflater.from(context).inflate(i, ((android.view.ViewGroup) (obj)), true));
        ((View) (obj)).setBackgroundDrawable(new BitmapDrawable(context.getResources(), bitmap));
        ((View) (obj)).setLayoutParams(new android.view.ViewGroup.LayoutParams(j, k));
        (new ChatOverlayViewer(context, ((View) (obj)))).update(chatoverlaydata);
        bitmap = (EditText)((View) (obj)).findViewById(0x7f0d008f);
        bitmap.setInputType(bitmap.getInputType() | 0x80000);
        ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000));
        ((View) (obj)).layout(0, 0, j, k);
        bitmap = Bitmap.createBitmap(j, k, android.graphics.Bitmap.Config.ARGB_8888);
        LogUtil.d("ChatImageCreator", LoggingMetaTags.TWC_WX_PICTURE, (new StringBuilder()).append("addOverlay: ").append(BitmapUtil.getBitMapInfo(bitmap)).toString(), new Object[0]);
        ((View) (obj)).draw(new Canvas(bitmap));
        return bitmap;
    }

    public void updateImage(Bitmap bitmap, int i, ChatOverlayData chatoverlaydata, File file)
        throws IOException
    {
        Preconditions.checkNotNull(bitmap);
        Preconditions.checkNotNull(chatoverlaydata);
        Preconditions.checkNotNull(file);
        chatoverlaydata = addOverlay(bitmap, i, chatoverlaydata);
        bitmap = new FileOutputStream(file);
        if (!chatoverlaydata.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, bitmap))
        {
            throw new IOException("Unable to save updated image");
        }
        break MISSING_BLOCK_LABEL_64;
        chatoverlaydata;
        bitmap.close();
        throw chatoverlaydata;
        bitmap.close();
        bitmap = context;
        chatoverlaydata = file.getPath();
        file = new _cls1();
        MediaScannerConnection.scanFile(bitmap, new String[] {
            chatoverlaydata
        }, null, file);
        return;
    }

    /* member class not found */
    class _cls1 {}

}
