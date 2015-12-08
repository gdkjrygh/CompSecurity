// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import net.hockeyapp.android.Constants;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.utils.ImageUtils;

public class AttachmentView extends FrameLayout
{

    private static final int IMAGES_PER_ROW_LANDSCAPE = 2;
    private static final int IMAGES_PER_ROW_PORTRAIT = 3;
    private final FeedbackAttachment attachment;
    private final Uri attachmentUri;
    private final Context context;
    private final String filename;
    private int gap;
    private ImageView imageView;
    private int maxHeightLandscape;
    private int maxHeightPortrait;
    private int orientation;
    private final ViewGroup parent;
    private TextView textView;
    private int widthLandscape;
    private int widthPortrait;

    public AttachmentView(Context context1, ViewGroup viewgroup, Uri uri, boolean flag)
    {
        super(context1);
        context = context1;
        parent = viewgroup;
        attachment = null;
        attachmentUri = uri;
        filename = uri.getLastPathSegment();
        calculateDimensions(20);
        initializeView(context1, flag);
        textView.setText(filename);
        (new AsyncTask() {

            final AttachmentView this$0;

            protected transient Bitmap doInBackground(Void avoid[])
            {
                return loadImageThumbnail();
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected void onPostExecute(Bitmap bitmap)
            {
                if (bitmap != null)
                {
                    configureViewForThumbnail(bitmap, false);
                    return;
                } else
                {
                    configureViewForPlaceholder(false);
                    return;
                }
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Bitmap)obj);
            }

            
            {
                this$0 = AttachmentView.this;
                super();
            }
        }).execute(new Void[0]);
    }

    public AttachmentView(Context context1, ViewGroup viewgroup, FeedbackAttachment feedbackattachment, boolean flag)
    {
        super(context1);
        context = context1;
        parent = viewgroup;
        attachment = feedbackattachment;
        attachmentUri = Uri.fromFile(new File(Constants.getHockeyAppStorageDir(), feedbackattachment.getCacheId()));
        filename = feedbackattachment.getFilename();
        calculateDimensions(30);
        initializeView(context1, flag);
        orientation = 0;
        textView.setText("Loading...");
        configureViewForPlaceholder(false);
    }

    private void calculateDimensions(int i)
    {
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        gap = Math.round(TypedValue.applyDimension(1, 10F, displaymetrics));
        i = Math.round(TypedValue.applyDimension(1, i, displaymetrics));
        int j = displaymetrics.widthPixels;
        int k = gap;
        int l = gap;
        widthPortrait = (j - i * 2 - k * 2) / 3;
        widthLandscape = (j - i * 2 - l * 1) / 2;
        maxHeightPortrait = widthPortrait * 2;
        maxHeightLandscape = widthLandscape;
    }

    private void configureViewForPlaceholder(final boolean openOnClick)
    {
        textView.setMaxWidth(widthPortrait);
        textView.setMinWidth(widthPortrait);
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        imageView.setAdjustViewBounds(false);
        imageView.setBackgroundColor(Color.parseColor("#eeeeee"));
        imageView.setMinimumHeight((int)((float)widthPortrait * 1.2F));
        imageView.setMinimumWidth(widthPortrait);
        imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        imageView.setImageDrawable(getSystemIcon("ic_menu_attachment"));
        imageView.setOnClickListener(new android.view.View.OnClickListener() {

            final AttachmentView this$0;
            final boolean val$openOnClick;

            public void onClick(View view)
            {
                if (!openOnClick)
                {
                    return;
                } else
                {
                    view = new Intent();
                    view.setAction("android.intent.action.VIEW");
                    view.setDataAndType(attachmentUri, "*/*");
                    context.startActivity(view);
                    return;
                }
            }

            
            {
                this$0 = AttachmentView.this;
                openOnClick = flag;
                super();
            }
        });
    }

    private void configureViewForThumbnail(Bitmap bitmap, final boolean openOnClick)
    {
        int i;
        int j;
        if (orientation == 1)
        {
            i = widthLandscape;
        } else
        {
            i = widthPortrait;
        }
        if (orientation == 1)
        {
            j = maxHeightLandscape;
        } else
        {
            j = maxHeightPortrait;
        }
        textView.setMaxWidth(i);
        textView.setMinWidth(i);
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2));
        imageView.setAdjustViewBounds(true);
        imageView.setMinimumWidth(i);
        imageView.setMaxWidth(i);
        imageView.setMaxHeight(j);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageBitmap(bitmap);
        imageView.setOnClickListener(new android.view.View.OnClickListener() {

            final AttachmentView this$0;
            final boolean val$openOnClick;

            public void onClick(View view)
            {
                if (!openOnClick)
                {
                    return;
                } else
                {
                    view = new Intent();
                    view.setAction("android.intent.action.VIEW");
                    view.setDataAndType(attachmentUri, "image/*");
                    context.startActivity(view);
                    return;
                }
            }

            
            {
                this$0 = AttachmentView.this;
                openOnClick = flag;
                super();
            }
        });
    }

    private Drawable getSystemIcon(String s)
    {
        return getResources().getDrawable(getResources().getIdentifier(s, "drawable", "android"));
    }

    private void initializeView(Context context1, boolean flag)
    {
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-2, -2, 80));
        setPadding(0, gap, 0, 0);
        imageView = new ImageView(context1);
        LinearLayout linearlayout = new LinearLayout(context1);
        linearlayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
        linearlayout.setGravity(3);
        linearlayout.setOrientation(1);
        linearlayout.setBackgroundColor(Color.parseColor("#80262626"));
        textView = new TextView(context1);
        textView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 17));
        textView.setGravity(17);
        textView.setTextColor(Color.parseColor("#FFFFFF"));
        textView.setSingleLine();
        textView.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        if (flag)
        {
            context1 = new ImageButton(context1);
            context1.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2, 80));
            context1.setAdjustViewBounds(true);
            context1.setImageDrawable(getSystemIcon("ic_menu_delete"));
            context1.setBackgroundResource(0);
            context1.setOnClickListener(new android.view.View.OnClickListener() {

                final AttachmentView this$0;

                public void onClick(View view)
                {
                    remove();
                }

            
            {
                this$0 = AttachmentView.this;
                super();
            }
            });
            linearlayout.addView(context1);
        }
        linearlayout.addView(textView);
        addView(imageView);
        addView(linearlayout);
    }

    private Bitmap loadImageThumbnail()
    {
        int j;
        try
        {
            orientation = ImageUtils.determineOrientation(context, attachmentUri);
            int i;
            if (orientation == 1)
            {
                i = widthLandscape;
            } else
            {
                i = widthPortrait;
            }
        }
        catch (Throwable throwable)
        {
            return null;
        }
        if (orientation != 1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        j = maxHeightLandscape;
        return ImageUtils.decodeSampledBitmap(context, attachmentUri, i, j);
        j = maxHeightPortrait;
        break MISSING_BLOCK_LABEL_41;
    }

    public FeedbackAttachment getAttachment()
    {
        return attachment;
    }

    public Uri getAttachmentUri()
    {
        return attachmentUri;
    }

    public int getEffectiveMaxHeight()
    {
        if (orientation == 1)
        {
            return maxHeightLandscape;
        } else
        {
            return maxHeightPortrait;
        }
    }

    public int getGap()
    {
        return gap;
    }

    public int getMaxHeightLandscape()
    {
        return maxHeightLandscape;
    }

    public int getMaxHeightPortrait()
    {
        return maxHeightPortrait;
    }

    public int getWidthLandscape()
    {
        return widthLandscape;
    }

    public int getWidthPortrait()
    {
        return widthPortrait;
    }

    public void remove()
    {
        parent.removeView(this);
    }

    public void setImage(Bitmap bitmap, int i)
    {
        textView.setText(filename);
        orientation = i;
        if (bitmap == null)
        {
            configureViewForPlaceholder(true);
            return;
        } else
        {
            configureViewForThumbnail(bitmap, true);
            return;
        }
    }

    public void signalImageLoadingError()
    {
        textView.setText("Error");
    }





}
