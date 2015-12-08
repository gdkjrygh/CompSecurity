// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.os.SystemProperties;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v8.renderscript:
//            RenderScriptThunker, RSDriverException, RSRuntimeException, BaseObj, 
//            RSInvalidStateException, Element, Sampler

public class RenderScript
{
    public static final class ContextType extends Enum
    {

        private static final ContextType $VALUES[];
        public static final ContextType DEBUG;
        public static final ContextType NORMAL;
        public static final ContextType PROFILE;
        int mID;

        public static ContextType valueOf(String s)
        {
            return (ContextType)Enum.valueOf(android/support/v8/renderscript/RenderScript$ContextType, s);
        }

        public static ContextType[] values()
        {
            return (ContextType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new ContextType("NORMAL", 0, 0);
            DEBUG = new ContextType("DEBUG", 1, 1);
            PROFILE = new ContextType("PROFILE", 2, 2);
            $VALUES = (new ContextType[] {
                NORMAL, DEBUG, PROFILE
            });
        }

        private ContextType(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }

    static class MessageThread extends Thread
    {

        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        int mAuxData[];
        RenderScript mRS;
        boolean mRun;

        public void run()
        {
            int ai[] = new int[16];
            mRS.nContextInitToClient(mRS.mContext);
            while (mRun) 
            {
                ai[0] = 0;
                int i = mRS.nContextPeekMessage(mRS.mContext, mAuxData);
                int j = mAuxData[1];
                int k = mAuxData[0];
                if (i == 4)
                {
                    int ai1[] = ai;
                    if (j >> 2 >= ai.length)
                    {
                        ai1 = new int[j + 3 >> 2];
                    }
                    if (mRS.nContextGetUserMessage(mRS.mContext, ai1) != 4)
                    {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    }
                    if (mRS.mMessageCallback != null)
                    {
                        mRS.mMessageCallback.mData = ai1;
                        mRS.mMessageCallback.mID = k;
                        mRS.mMessageCallback.mLength = j;
                        mRS.mMessageCallback.run();
                        ai = ai1;
                    } else
                    {
                        throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                    }
                } else
                if (i == 3)
                {
                    String s = mRS.nContextGetErrorMessage(mRS.mContext);
                    if (k >= 4096)
                    {
                        throw new RSRuntimeException((new StringBuilder()).append("Fatal error ").append(k).append(", details: ").append(s).toString());
                    }
                    if (mRS.mErrorCallback != null)
                    {
                        mRS.mErrorCallback.mErrorMessage = s;
                        mRS.mErrorCallback.mErrorNum = k;
                        mRS.mErrorCallback.run();
                    } else
                    {
                        Log.e("RenderScript_jni", (new StringBuilder()).append("non fatal RS error, ").append(s).toString());
                    }
                } else
                {
                    try
                    {
                        sleep(1L, 0);
                    }
                    catch (InterruptedException interruptedexception) { }
                }
            }
        }

        MessageThread(RenderScript renderscript)
        {
            super("RSMessageThread");
            mRun = true;
            mAuxData = new int[2];
            mRS = renderscript;
        }
    }

    public static final class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority LOW;
        public static final Priority NORMAL;
        int mID;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(android/support/v8/renderscript/RenderScript$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0, 15);
            NORMAL = new Priority("NORMAL", 1, -4);
            $VALUES = (new Priority[] {
                LOW, NORMAL
            });
        }

        private Priority(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }

    public static class RSErrorHandler
        implements Runnable
    {

        protected String mErrorMessage;
        protected int mErrorNum;

        public void run()
        {
        }

        public RSErrorHandler()
        {
        }
    }

    public static class RSMessageHandler
        implements Runnable
    {

        protected int mData[];
        protected int mID;
        protected int mLength;

        public void run()
        {
        }

        public RSMessageHandler()
        {
        }
    }


    private static final String CACHE_PATH = "com.android.renderscript.cache";
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static boolean isNative = false;
    static Object lock = new Object();
    static String mCachePath;
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    static Object sRuntime;
    static boolean sUseGCHooks;
    private static int thunk = 0;
    private Context mApplicationContext;
    int mContext;
    int mDev;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    RSErrorHandler mErrorCallback;
    RSMessageHandler mMessageCallback;
    MessageThread mMessageThread;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;

    RenderScript(Context context)
    {
        mMessageCallback = null;
        mErrorCallback = null;
        if (context != null)
        {
            mApplicationContext = context.getApplicationContext();
        }
    }

    public static RenderScript create(Context context)
    {
        return create(context, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, int i)
    {
        return create(context, i, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, int i, ContextType contexttype)
    {
        RenderScript renderscript;
        renderscript = new RenderScript(context);
        if (shouldThunk())
        {
            Log.v("RenderScript_jni", "RS native mode");
            return RenderScriptThunker.create(context, i);
        }
        context = ((Context) (lock));
        context;
        JVM INSTR monitorenter ;
        boolean flag = sInitialized;
        if (flag) goto _L2; else goto _L1
_L1:
        Class class1 = Class.forName("dalvik.system.VMRuntime");
        sRuntime = class1.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
        registerNativeAllocation = class1.getDeclaredMethod("registerNativeAllocation", new Class[] {
            Integer.TYPE
        });
        registerNativeFree = class1.getDeclaredMethod("registerNativeFree", new Class[] {
            Integer.TYPE
        });
        sUseGCHooks = true;
_L3:
        System.loadLibrary("RSSupport");
        System.loadLibrary("rsjni");
        sInitialized = true;
_L2:
        context;
        JVM INSTR monitorexit ;
        Log.v("RenderScript_jni", "RS compat mode");
        renderscript.mDev = renderscript.nDeviceCreate();
        renderscript.mContext = renderscript.nContextCreate(renderscript.mDev, 0, i, contexttype.mID);
        Exception exception;
        if (renderscript.mContext == 0)
        {
            throw new RSDriverException("Failed to create RS context.");
        } else
        {
            renderscript.mMessageThread = new MessageThread(renderscript);
            renderscript.mMessageThread.start();
            return renderscript;
        }
        exception;
        Log.e("RenderScript_jni", "No GC methods");
        sUseGCHooks = false;
          goto _L3
        contexttype;
        context;
        JVM INSTR monitorexit ;
        throw contexttype;
        contexttype;
        Log.e("RenderScript_jni", (new StringBuilder()).append("Error loading RS jni library: ").append(contexttype).toString());
        throw new RSRuntimeException((new StringBuilder()).append("Error loading RS jni library: ").append(contexttype).toString());
    }

    public static RenderScript create(Context context, ContextType contexttype)
    {
        return create(context, context.getApplicationInfo().targetSdkVersion, contexttype);
    }

    public static void setupDiskCache(File file)
    {
        file = new File(file, "com.android.renderscript.cache");
        mCachePath = file.getAbsolutePath();
        file.mkdirs();
    }

    static boolean shouldThunk()
    {
        if (thunk == 0)
        {
            if (android.os.Build.VERSION.SDK_INT >= 18 && SystemProperties.getInt("debug.rs.forcecompat", 0) == 0)
            {
                thunk = 1;
            } else
            {
                thunk = -1;
            }
        }
        return thunk == 1;
    }

    public void contextDump()
    {
        validate();
        nContextDump(0);
    }

    public void destroy()
    {
        validate();
        nContextDeinitToClient(mContext);
        mMessageThread.mRun = false;
        try
        {
            mMessageThread.join();
        }
        catch (InterruptedException interruptedexception) { }
        nContextDestroy();
        mContext = 0;
        nDeviceDestroy(mDev);
        mDev = 0;
    }

    public void finish()
    {
        nContextFinish();
    }

    public final Context getApplicationContext()
    {
        return mApplicationContext;
    }

    public RSErrorHandler getErrorHandler()
    {
        return mErrorCallback;
    }

    public RSMessageHandler getMessageHandler()
    {
        return mMessageCallback;
    }

    boolean isAlive()
    {
        return mContext != 0;
    }

    void nAllocationCopyFromBitmap(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyFromBitmap(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    void nAllocationCopyToBitmap(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyToBitmap(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateBitmapBackedAllocation(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateBitmapBackedAllocation(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateBitmapRef(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateBitmapRef(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateFromAssetStream(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateFromAssetStream(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    int nAllocationCreateFromBitmap(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateFromBitmap(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateTyped(int i, int j, int k, int l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateTyped(mContext, i, j, k, l);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    int nAllocationCubeCreateFromBitmap(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCubeCreateFromBitmap(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    void nAllocationData1D(int i, int j, int k, int l, byte abyte0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, abyte0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData1D(int i, int j, int k, int l, float af[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, af, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData1D(int i, int j, int k, int l, int ai[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, ai, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData1D(int i, int j, int k, int l, short aword0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, aword0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2, k2, l2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            byte abyte0[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, abyte0, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            float af[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, af, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int ai[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, ai, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            short aword0[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, aword0, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2, k2, l2, i3);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, abyte0, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, float af[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, af, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int ai[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, ai, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, short aword0[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, aword0, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationElementData1D(int i, int j, int k, int l, byte abyte0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationElementData1D(mContext, i, j, k, l, abyte0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationGenerateMipmaps(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationGenerateMipmaps(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nAllocationGetType(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationGetType(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoReceive(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoReceive(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoSend(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoSend(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationRead(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationRead(int i, float af[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, af);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationRead(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationRead(int i, short aword0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, aword0);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationResize1D(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize1D(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationResize2D(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize2D(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationSyncAll(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationSyncAll(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nContextCreate(int i, int j, int k, int l)
    {
        this;
        JVM INSTR monitorenter ;
        i = rsnContextCreate(i, j, k, l);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    native void nContextDeinitToClient(int i);

    void nContextDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextDestroy(mContext);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nContextDump(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextDump(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nContextFinish()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextFinish(mContext);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    native String nContextGetErrorMessage(int i);

    native int nContextGetUserMessage(int i, int ai[]);

    native void nContextInitToClient(int i);

    native int nContextPeekMessage(int i, int ai[]);

    void nContextSendMessage(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextSendMessage(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nContextSetPriority(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextSetPriority(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    native int nDeviceCreate();

    native void nDeviceDestroy(int i);

    native void nDeviceSetConfig(int i, int j, int k);

    int nElementCreate(int i, int j, boolean flag, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnElementCreate(mContext, i, j, flag, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    int nElementCreate2(int ai[], String as[], int ai1[])
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        validate();
        i = rsnElementCreate2(mContext, ai, as, ai1);
        this;
        JVM INSTR monitorexit ;
        return i;
        ai;
        throw ai;
    }

    void nElementGetNativeData(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetNativeData(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nElementGetSubElements(int i, int ai[], String as[], int ai1[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetSubElements(mContext, i, ai, as, ai1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nObjDestroy(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (mContext != 0)
        {
            rsnObjDestroy(mContext, i);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nSamplerCreate(int i, int j, int k, int l, int i1, float f)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnSamplerCreate(mContext, i, j, k, l, i1, f);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptBindAllocation(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptBindAllocation(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nScriptCCreate(String s, String s1, byte abyte0[], int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptCCreate(mContext, s, s1, abyte0, i);
        this;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    int nScriptFieldIDCreate(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptFieldIDCreate(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptForEach(int i, int j, int k, int l, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEach(mContext, i, j, k, l);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEach(mContext, i, j, k, l, abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    void nScriptForEachClipped(int i, int j, int k, int l, byte abyte0[], int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEachClipped(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEachClipped(mContext, i, j, k, l, abyte0, i1, j1, k1, l1, i2, j2);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    int nScriptGroupCreate(int ai[], int ai1[], int ai2[], int ai3[], int ai4[])
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        validate();
        i = rsnScriptGroupCreate(mContext, ai, ai1, ai2, ai3, ai4);
        this;
        JVM INSTR monitorexit ;
        return i;
        ai;
        throw ai;
    }

    void nScriptGroupExecute(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupExecute(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetInput(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetInput(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetOutput(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetOutput(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nScriptIntrinsicCreate(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptIntrinsicCreate(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptInvoke(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptInvoke(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptInvokeV(int i, int j, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptInvokeV(mContext, i, j, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    int nScriptKernelIDCreate(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptKernelIDCreate(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetTimeZone(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetTimeZone(mContext, i, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarD(int i, int j, double d)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarD(mContext, i, j, d);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarF(int i, int j, float f)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarF(mContext, i, j, f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarI(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarI(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarJ(int i, int j, long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarJ(mContext, i, j, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarObj(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarObj(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarV(int i, int j, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarV(mContext, i, j, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarVE(int i, int j, byte abyte0[], int k, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarVE(mContext, i, j, abyte0, k, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    int nTypeCreate(int i, int j, int k, int l, boolean flag, boolean flag1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnTypeCreate(mContext, i, j, k, l, flag, flag1, i1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nTypeGetNativeData(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnTypeGetNativeData(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    native void rsnAllocationCopyFromBitmap(int i, int j, Bitmap bitmap);

    native void rsnAllocationCopyToBitmap(int i, int j, Bitmap bitmap);

    native int rsnAllocationCreateBitmapBackedAllocation(int i, int j, int k, Bitmap bitmap, int l);

    native int rsnAllocationCreateBitmapRef(int i, int j, Bitmap bitmap);

    native int rsnAllocationCreateFromAssetStream(int i, int j, int k, int l);

    native int rsnAllocationCreateFromBitmap(int i, int j, int k, Bitmap bitmap, int l);

    native int rsnAllocationCreateTyped(int i, int j, int k, int l, int i1);

    native int rsnAllocationCubeCreateFromBitmap(int i, int j, int k, Bitmap bitmap, int l);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, byte abyte0[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, float af[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, int ai[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, short aword0[], int j1);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, float af[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int ai[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, short aword0[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, Bitmap bitmap);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3, int j3);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, byte abyte0[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, float af[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int ai[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, short aword0[], int j2);

    native void rsnAllocationElementData1D(int i, int j, int k, int l, int i1, byte abyte0[], int j1);

    native void rsnAllocationGenerateMipmaps(int i, int j);

    native int rsnAllocationGetType(int i, int j);

    native void rsnAllocationIoReceive(int i, int j);

    native void rsnAllocationIoSend(int i, int j);

    native void rsnAllocationRead(int i, int j, byte abyte0[]);

    native void rsnAllocationRead(int i, int j, float af[]);

    native void rsnAllocationRead(int i, int j, int ai[]);

    native void rsnAllocationRead(int i, int j, short aword0[]);

    native void rsnAllocationResize1D(int i, int j, int k);

    native void rsnAllocationResize2D(int i, int j, int k, int l);

    native void rsnAllocationSyncAll(int i, int j, int k);

    native int rsnContextCreate(int i, int j, int k, int l);

    native void rsnContextDestroy(int i);

    native void rsnContextDump(int i, int j);

    native void rsnContextFinish(int i);

    native void rsnContextSendMessage(int i, int j, int ai[]);

    native void rsnContextSetPriority(int i, int j);

    native int rsnElementCreate(int i, int j, int k, boolean flag, int l);

    native int rsnElementCreate2(int i, int ai[], String as[], int ai1[]);

    native void rsnElementGetNativeData(int i, int j, int ai[]);

    native void rsnElementGetSubElements(int i, int j, int ai[], String as[], int ai1[]);

    native void rsnObjDestroy(int i, int j);

    native int rsnSamplerCreate(int i, int j, int k, int l, int i1, int j1, float f);

    native void rsnScriptBindAllocation(int i, int j, int k, int l);

    native int rsnScriptCCreate(int i, String s, String s1, byte abyte0[], int j);

    native int rsnScriptFieldIDCreate(int i, int j, int k);

    native void rsnScriptForEach(int i, int j, int k, int l, int i1);

    native void rsnScriptForEach(int i, int j, int k, int l, int i1, byte abyte0[]);

    native void rsnScriptForEachClipped(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2);

    native void rsnScriptForEachClipped(int i, int j, int k, int l, int i1, byte abyte0[], int j1, 
            int k1, int l1, int i2, int j2, int k2);

    native int rsnScriptGroupCreate(int i, int ai[], int ai1[], int ai2[], int ai3[], int ai4[]);

    native void rsnScriptGroupExecute(int i, int j);

    native void rsnScriptGroupSetInput(int i, int j, int k, int l);

    native void rsnScriptGroupSetOutput(int i, int j, int k, int l);

    native int rsnScriptIntrinsicCreate(int i, int j, int k);

    native void rsnScriptInvoke(int i, int j, int k);

    native void rsnScriptInvokeV(int i, int j, int k, byte abyte0[]);

    native int rsnScriptKernelIDCreate(int i, int j, int k, int l);

    native void rsnScriptSetTimeZone(int i, int j, byte abyte0[]);

    native void rsnScriptSetVarD(int i, int j, int k, double d);

    native void rsnScriptSetVarF(int i, int j, int k, float f);

    native void rsnScriptSetVarI(int i, int j, int k, int l);

    native void rsnScriptSetVarJ(int i, int j, int k, long l);

    native void rsnScriptSetVarObj(int i, int j, int k, int l);

    native void rsnScriptSetVarV(int i, int j, int k, byte abyte0[]);

    native void rsnScriptSetVarVE(int i, int j, int k, byte abyte0[], int l, int ai[]);

    native int rsnTypeCreate(int i, int j, int k, int l, int i1, boolean flag, boolean flag1, 
            int j1);

    native void rsnTypeGetNativeData(int i, int j, int ai[]);

    int safeID(BaseObj baseobj)
    {
        if (baseobj != null)
        {
            return baseobj.getID(this);
        } else
        {
            return 0;
        }
    }

    public void sendMessage(int i, int ai[])
    {
        nContextSendMessage(i, ai);
    }

    public void setErrorHandler(RSErrorHandler rserrorhandler)
    {
        mErrorCallback = rserrorhandler;
        if (isNative)
        {
            rserrorhandler = (RenderScriptThunker)this;
            android.renderscript.RSErrorHandler rserrorhandler1 = new android.renderscript.RSErrorHandler() {

                final RenderScript this$0;

                public void run()
                {
                    mErrorCallback.mErrorMessage = mErrorMessage;
                    mErrorCallback.mErrorNum = mErrorNum;
                    mErrorCallback.run();
                }

            
            {
                this$0 = RenderScript.this;
                super();
            }
            };
            ((RenderScriptThunker) (rserrorhandler)).mN.setErrorHandler(rserrorhandler1);
        }
    }

    public void setMessageHandler(RSMessageHandler rsmessagehandler)
    {
        mMessageCallback = rsmessagehandler;
        if (isNative)
        {
            rsmessagehandler = (RenderScriptThunker)this;
            android.renderscript.RSMessageHandler rsmessagehandler1 = new android.renderscript.RSMessageHandler() {

                final RenderScript this$0;

                public void run()
                {
                    mMessageCallback.mData = mData;
                    mMessageCallback.mID = mID;
                    mMessageCallback.mLength = mLength;
                    mMessageCallback.run();
                }

            
            {
                this$0 = RenderScript.this;
                super();
            }
            };
            ((RenderScriptThunker) (rsmessagehandler)).mN.setMessageHandler(rsmessagehandler1);
        }
    }

    public void setPriority(Priority priority)
    {
        validate();
        nContextSetPriority(priority.mID);
    }

    void validate()
    {
        if (mContext == 0)
        {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        } else
        {
            return;
        }
    }

}
