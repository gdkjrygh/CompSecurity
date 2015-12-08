// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

// Referenced classes of package com.samsung.android.sdk.richnotification:
//            Utilities

public final class SrnImageAsset
{
    static class ImageAssetSerializer
        implements JsonSerializer
    {

        public JsonElement serialize(SrnImageAsset srnimageasset, Type type, JsonSerializationContext jsonserializationcontext)
        {
            type = new JsonObject();
            if (srnimageasset.mImageConverter != null)
            {
                type.addProperty("uri", srnimageasset.mImageConverter.toUriString());
                int i;
                if (srnimageasset.mImageConverter.isUpdated())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                type.addProperty("update", Integer.valueOf(i));
            }
            type.addProperty("title", srnimageasset.mName);
            return type;
        }

        public volatile JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonserializationcontext)
        {
            return serialize((SrnImageAsset)obj, type, jsonserializationcontext);
        }

        ImageAssetSerializer()
        {
        }
    }

    private static class ImageConverter
    {

        private final boolean mCache;
        private android.graphics.Bitmap.CompressFormat mCompressFormat;
        private final Context mContext;
        private final Bitmap mImage;
        private boolean mIsUpdated;
        private final String mName;

        private boolean isUpdated()
        {
            return mIsUpdated;
        }

        private String toUriString()
        {
            if (mImage.isRecycled())
            {
                throw new IllegalStateException("Can't send recycled bitmap.");
            }
            Object obj = Utilities.toUri(mContext, mName, mImage, mCompressFormat, mCache);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            mIsUpdated = ((Uri) (obj)).getBooleanQueryParameter("updated", false);
            obj = ((Uri) (obj)).buildUpon().clearQuery().build().toString();
            return ((String) (obj));
            Exception exception;
            exception;
            Log.e(SrnImageAsset.TAG, exception.getMessage(), exception);
            return null;
        }




        private ImageConverter(Context context, String s, Bitmap bitmap, boolean flag)
        {
            mCompressFormat = android.graphics.Bitmap.CompressFormat.PNG;
            mContext = context;
            mName = s;
            mImage = bitmap;
            mCache = flag;
        }

        ImageConverter(Context context, String s, Bitmap bitmap, boolean flag, ImageConverter imageconverter)
        {
            this(context, s, bitmap, flag);
        }
    }


    private static final String SERIALIZED_NAME_TITLE = "title";
    private static final String SERIALIZED_NAME_UPDATE = "update";
    private static final String SERIALIZED_NAME_URI = "uri";
    private static final String TAG = com/samsung/android/sdk/richnotification/SrnImageAsset.getSimpleName();
    private ImageConverter mImageConverter;
    private final String mName;

    public SrnImageAsset(Context context, String s, Bitmap bitmap)
    {
        this(context, s, bitmap, false);
    }

    private SrnImageAsset(Context context, String s, Bitmap bitmap, boolean flag)
    {
        mName = s;
        if (bitmap != null)
        {
            mImageConverter = new ImageConverter(context, s, bitmap, flag, null);
            return;
        } else
        {
            mImageConverter = null;
            return;
        }
    }

    void setCompressFormat(android.graphics.Bitmap.CompressFormat compressformat)
    {
        if (mImageConverter != null)
        {
            mImageConverter.mCompressFormat = compressformat;
        }
    }




}
