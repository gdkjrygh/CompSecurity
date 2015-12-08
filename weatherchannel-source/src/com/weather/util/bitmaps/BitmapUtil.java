// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.bitmaps;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.io.IOException;

// Referenced classes of package com.weather.util.bitmaps:
//            BitmapWrapper

public final class BitmapUtil
{
    private static interface MutableDecodeContract
    {

        public abstract BitmapWrapper decodeFileMutable(String s);
    }

    private static final class MutableDecoderApi1
        implements MutableDecodeContract
    {

        private static final android.graphics.BitmapFactory.Options optionsApi1;

        public BitmapWrapper decodeFileMutable(String s)
        {
            Object obj;
            Object obj1;
            Object obj3;
            obj1 = null;
            obj3 = null;
            obj = obj1;
            android.graphics.BitmapFactory.Options options = optionsApi1;
            obj = obj1;
            options;
            JVM INSTR monitorenter ;
            Object obj2 = BitmapFactory.decodeFile(s, optionsApi1);
            options;
            JVM INSTR monitorexit ;
            if (obj2 != null) goto _L2; else goto _L1
_L1:
            obj = obj1;
            Log.w("BitmapUtil", "decodeFileMutable1 bm null");
            obj = obj3;
_L4:
            return new BitmapWrapper(s, ((Bitmap) (obj)));
            obj2;
            options;
            JVM INSTR monitorexit ;
            obj = obj1;
            try
            {
                throw obj2;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.w("BitmapUtil", (new StringBuilder()).append("decodeFileMutable1 problem: ex=").append(obj1).toString());
            }
            continue; /* Loop/switch isn't completed */
_L2:
            obj = obj1;
            if (((Bitmap) (obj2)).isMutable())
            {
                obj = obj2;
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
            obj1 = ((Bitmap) (obj2)).copy(android.graphics.Bitmap.Config.ARGB_4444, true);
            obj = obj1;
            if (obj2 == obj1)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
            ((Bitmap) (obj2)).recycle();
            obj = obj1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        static 
        {
            optionsApi1 = new android.graphics.BitmapFactory.Options();
            optionsApi1.inTempStorage = new byte[0x10000];
            optionsApi1.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_4444;
        }

        private MutableDecoderApi1()
        {
        }

    }

    private static final class MutableDecoderApi11
        implements MutableDecodeContract
    {

        private static final android.graphics.BitmapFactory.Options optionsMutableApi11;

        public BitmapWrapper decodeFileMutable(String s)
        {
            Bitmap bitmap;
            Bitmap bitmap1;
            Object obj;
            obj = null;
            bitmap1 = null;
            bitmap = obj;
            android.graphics.BitmapFactory.Options options = optionsMutableApi11;
            bitmap = obj;
            options;
            JVM INSTR monitorenter ;
            bitmap = bitmap1;
            bitmap1 = BitmapFactory.decodeFile(s, optionsMutableApi11);
            bitmap = bitmap1;
            options;
            JVM INSTR monitorexit ;
            bitmap = bitmap1;
_L2:
            return new BitmapWrapper(s, bitmap);
            Exception exception;
            exception;
            options;
            JVM INSTR monitorexit ;
            try
            {
                throw exception;
            }
            catch (Throwable throwable)
            {
                Log.w("BitmapUtil", (new StringBuilder()).append("decodeFileMutable11 problem: ex=").append(throwable).toString());
            }
            if (true) goto _L2; else goto _L1
_L1:
        }

        static 
        {
            optionsMutableApi11 = new android.graphics.BitmapFactory.Options();
            optionsMutableApi11.inTempStorage = new byte[0x10000];
            optionsMutableApi11.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
            optionsMutableApi11.inMutable = true;
        }

        private MutableDecoderApi11()
        {
        }

    }


    private static final String TAG = "BitmapUtil";
    private static final MutableDecodeContract mutableDecoder;

    private BitmapUtil()
    {
    }

    public static BitmapWrapper decodeFileMutable(String s)
    {
        return mutableDecoder.decodeFileMutable(s);
    }

    public static String getBitMapInfo(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return "null";
        }
        int i;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            i = bitmap.getAllocationByteCount();
        } else
        {
            i = bitmap.getByteCount();
        }
        return (new StringBuilder()).append("width=").append(bitmap.getWidth()).append(", height=").append(bitmap.getHeight()).append(", bytes=").append(i).toString();
    }

    public static int getImageRotationDegrees(String s)
        throws IOException
    {
        Preconditions.checkNotNull(s);
        switch ((new ExifInterface(s)).getAttributeInt("Orientation", 1))
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            mutableDecoder = new MutableDecoderApi11();
        } else
        {
            mutableDecoder = new MutableDecoderApi1();
        }
    }
}
