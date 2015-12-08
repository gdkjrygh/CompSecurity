// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;

import android.app.IntentService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.net.PhotoClient;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.net.PhotoUpload;
import com.walmartlabs.android.photo.net.exception.OrderSerializationException;
import com.walmartlabs.android.photo.net.exception.PhotoIdException;
import com.walmartlabs.android.photo.net.exception.UploadCancelledException;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.analytics.AnalyticsHelper;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettingsUtils;
import com.walmartlabs.android.photo.util.integration.AppIntegration;
import com.walmartlabs.android.photo.util.integration.AppIntegrationFactory;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;

// Referenced classes of package com.walmartlabs.android.photo.service.order:
//            OrderProgress, PrintNotificationManager

public class OrderService extends IntentService
{
    public class ConnectivityReceiver extends BroadcastReceiver
    {

        final OrderService this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (PhotoUtils.hasDataConnectivity(OrderService.this))
            {
                PhotoLogger.get().d(OrderService.TAG, "onReceive(): Connectivity OK, will wake up if in backoff");
                synchronized (mBackoffLock)
                {
                    mBackoffLock.notifyAll();
                }
                return;
            } else
            {
                return;
            }
            intent;
            context;
            JVM INSTR monitorexit ;
            throw intent;
        }

        public ConnectivityReceiver()
        {
            this$0 = OrderService.this;
            super();
        }
    }

    public class LocalBinder extends Binder
    {

        final OrderService this$0;

        public OrderService getService()
        {
            return OrderService.this;
        }

        public LocalBinder()
        {
            this$0 = OrderService.this;
            super();
        }
    }

    public static interface OrderServiceListener
    {

        public abstract void onNewPhotoUploading(DevicePhoto devicephoto, int i);

        public abstract void onUploadStatus(OrderProgress orderprogress);

        public abstract boolean visible();
    }


    private static final int MAX_RETRIES_PER_PHOTO = 6;
    private static final int STATUS_UNDEFINED = -1776;
    private static final String TAG = com/walmartlabs/android/photo/service/order/OrderService.getSimpleName();
    private static final Object sClassLock = com/walmartlabs/android/photo/service/order/OrderService;
    private static volatile boolean sProcessingOrder;
    private static android.os.PowerManager.WakeLock sWakeLock;
    private Object mBackoffLock;
    private final IBinder mBinder = new LocalBinder();
    private volatile boolean mCancelRequested;
    private ConnectivityReceiver mConnectivityReceiver;
    private Intent mCurrentIntent;
    private boolean mExplicitlyStarted;
    private OrderServiceListener mListener;
    private Handler mMainThreadHandler;
    private OrderProgress mOrderProgress;
    private PhotoUpload mUpload;

    public OrderService()
    {
        super(TAG);
        mOrderProgress = new OrderProgress();
        mCancelRequested = false;
        mBackoffLock = new Object();
        mConnectivityReceiver = new ConnectivityReceiver();
    }

    private static void acquireWakeLock(Context context)
    {
        synchronized (sClassLock)
        {
            PhotoLogger.get().d(TAG, "acquireWakeLock()");
            if (sWakeLock == null)
            {
                sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, com/walmartlabs/android/photo/service/order/OrderService.getName());
                sWakeLock.acquire();
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void delay(long l)
    {
        try
        {
            Thread.sleep(l);
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
    }

    private void fireNewPhotoUploading(DevicePhoto devicephoto)
    {
        if (mListener != null)
        {
            mListener.onNewPhotoUploading(devicephoto, mOrderProgress.totalProgress());
        }
    }

    private void fireUploadStatus()
    {
        long l2 = mOrderProgress.currentProgress();
        long l3 = mOrderProgress.currentMax();
        long l = mOrderProgress.totalProgress();
        long l1 = mOrderProgress.totalMax();
        l2 = (int)(((double)l2 / (double)l3) * 100D);
        PrintNotificationManager.get(this).updateProcessingProgress((int)(100L * l + l2), (int)(l1 * 100L));
        if (mListener != null)
        {
            mListener.onUploadStatus(mOrderProgress);
        }
    }

    public static boolean isProcessingOrder()
    {
        return sProcessingOrder;
    }

    private void onOrderError(Exception exception, PhotoResponse photoresponse, String s)
    {
        if (photoresponse != null)
        {
            mOrderProgress.setOrderFailureTechnicalReason(photoresponse, this);
        } else
        if (exception != null)
        {
            mOrderProgress.setOrderFailureTechnicalReason(exception.toString());
        } else
        {
            mOrderProgress.setOrderFailureTechnicalReason(s);
        }
        PhotoLogger.get().w(TAG, (new StringBuilder()).append("Failed to place order: ").append(mOrderProgress.getOrderFailureTechnicalReason()).toString());
    }

    private void onUploadError(Exception exception, String s)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Upload failed: ").append(s).append("\n").append(exception).toString());
        if (!mOrderProgress.uploadsCancelled())
        {
            mOrderProgress.setUploadsFailureDisplayReason(s);
            return;
        } else
        {
            PhotoLogger.get().d(TAG, "Upload was manually cancelled, suppressing error messages");
            return;
        }
    }

    private void processOrder(PendingOrder pendingorder)
    {
        Object obj2;
        Iterator iterator;
        long l1;
        long l2;
        boolean flag1;
        obj2 = purgeSpecsWithZeroQuantity(pendingorder.getProductSelection());
        mCancelRequested = false;
        mOrderProgress = new OrderProgress();
        mOrderProgress.setPickupStore(pendingorder.getStore());
        mOrderProgress.setTotalMax(((List) (obj2)).size());
        flag1 = true;
        l1 = 0L;
        l2 = 0L;
        iterator = ((List) (obj2)).iterator();
_L18:
        boolean flag = flag1;
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj3;
        int i;
        int j;
        int k;
        obj3 = (PhotoSpecification)iterator.next();
        k = -1776;
        i = 0;
        mOrderProgress.setCurrentPhoto(((PhotoSpecification) (obj3)).getPhoto());
        mOrderProgress.setCurrentProgress(0L);
        mOrderProgress.setCurrentMax(((PhotoSpecification) (obj3)).getPhoto().getSize());
        fireNewPhotoUploading(((PhotoSpecification) (obj3)).getPhoto());
        j = 6;
_L23:
        mMainThreadHandler.post(new Runnable() {

            final OrderService this$0;

            public void run()
            {
                refreshSession();
            }

            
            {
                this$0 = OrderService.this;
                super();
            }
        });
        Object obj = mBackoffLock;
        obj;
        JVM INSTR monitorenter ;
        Object obj4;
        long l3;
        l3 = PhotoUtils.backoffTime(6 - j);
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Backing off: ").append(l3).toString());
        obj4 = mBackoffLock;
        int l;
        boolean flag2;
        boolean flag3;
        if (l3 <= 0L)
        {
            l3 = 1L;
        }
        obj4.wait(l3);
        PhotoLogger.get().d(TAG, "Backoff complete");
_L13:
        obj;
        JVM INSTR monitorexit ;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("processOrder(): Starting upload of photo ").append(((PhotoSpecification) (obj3)).getPhoto().getName()).append(", attempt #").append((6 - j) + 1).toString());
        mUpload = PhotoClient.get(this).createPhotoUpload(((PhotoSpecification) (obj3)).getPhoto(), pendingorder.getContact(), new com.walmartlabs.android.photo.net.PhotoUpload.PhotoUploadListener() {

            final OrderService this$0;

            public void onBytesWritten(long l6, long l7)
            {
                mOrderProgress.setCurrentProgress(l6);
                mOrderProgress.setCurrentMax(l7);
                fireUploadStatus();
            }

            
            {
                this$0 = OrderService.this;
                super();
            }
        });
        if (!PhotoClient.get(this).isMocked()) goto _L4; else goto _L3
_L3:
        obj = mUpload.startMocked();
_L14:
        l = ((PhotoResponse) (obj)).getHttpStatus();
        k = l;
_L15:
        if (!mCancelRequested) goto _L6; else goto _L5
_L5:
        PhotoLogger.get().d(TAG, "Cancel has been requested, setting new status: CANCELLED");
        mOrderProgress.setUploadsCancelled(true);
        AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareCancelledLeftCountEvent(mOrderProgress.totalMax() - mOrderProgress.totalProgress()), mMainThreadHandler);
        if (mOrderProgress.totalProgress() > 0)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareCancelledUploadedCountEvent(mOrderProgress.totalProgress()), mMainThreadHandler);
        }
_L16:
        if (k == 202 && !mOrderProgress.uploadsCancelled()) goto _L8; else goto _L7
_L7:
        if (!mOrderProgress.uploadsCancelled())
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareUploadSizeEvent(((PhotoSpecification) (obj3)).getPhoto().getSize(), false), mMainThreadHandler);
        }
        PhotoLogger photologger = PhotoLogger.get();
        String s = TAG;
        obj3 = (new StringBuilder()).append("processOrder(): Photo ").append(((PhotoSpecification) (obj3)).getPhoto().getName()).append(" failed to upload, abandoning order");
        InterruptedException interruptedexception;
        if (mOrderProgress.uploadsCancelled())
        {
            obj = " (CANCELLED)";
        } else
        {
            obj = "";
        }
        photologger.d(s, ((StringBuilder) (obj3)).append(((String) (obj))).toString());
        flag = false;
_L2:
        mOrderProgress.setUploadsDone(true);
        mOrderProgress.setUploadsSuccessful(flag);
        fireUploadStatus();
        flag3 = false;
        flag2 = false;
        flag1 = flag3;
        if (!flag) goto _L10; else goto _L9
_L9:
        AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareUploadsCompleteEvent(((List) (obj2)).size()), mMainThreadHandler);
        PhotoLogger.get().d(TAG, "placeOrder()");
        obj = PhotoClient.get(this).placeOrder(pendingorder);
        i = ((PhotoResponse) (obj)).getHttpStatus();
        if (i != 202) goto _L12; else goto _L11
_L11:
        flag = true;
_L19:
        Object obj1;
        if (flag)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
            flag1 = flag;
        } else
        {
            flag1 = flag;
            if (!mOrderProgress.uploadsCancelled())
            {
                AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
                flag1 = flag;
            }
        }
_L10:
        mOrderProgress.setOrderDone(true);
        mOrderProgress.setOrderSuccessful(flag1);
        fireUploadStatus();
        if (mListener == null || !mListener.visible())
        {
            PrintNotificationManager.get(this).showOrderDoneNotification(flag1);
        }
        obj = PhotoLogger.get();
        obj2 = TAG;
        obj3 = (new StringBuilder()).append("----- ORDER DONE (");
        if (flag1)
        {
            pendingorder = "SUCCESS";
        } else
        {
            pendingorder = "FAILED";
        }
        ((PhotoLogger) (obj)).d(((String) (obj2)), ((StringBuilder) (obj3)).append(pendingorder).append(") ----").toString());
        return;
        interruptedexception;
        PhotoLogger.get().d(TAG, "Backoff interrupted, will retry upload");
          goto _L13
        pendingorder;
        obj;
        JVM INSTR monitorexit ;
        throw pendingorder;
_L4:
        obj = mUpload.start();
          goto _L14
        obj;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_file_not_found));
          goto _L15
        obj;
        i = 1;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_ssl_exception));
          goto _L15
        obj;
        i = 1;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_socket_timeout_exception));
          goto _L15
        obj;
        i = 1;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_socket_exception));
          goto _L15
        obj;
        i = 1;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_unknown_host_exception));
          goto _L15
        obj;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_io_exception));
          goto _L15
        obj;
        delay(3000L);
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_unknown_error, new Object[] {
            "ID"
        }));
          goto _L15
        obj;
        i = 1;
        onUploadError(((Exception) (obj)), getString(com.walmartlabs.android.photo.R.string.photo_error_upload_io_exception));
          goto _L15
_L6:
        if (k == 408)
        {
            PhotoLogger.get().d(TAG, "Server signalled request timeout (408), aborting order since uploads are too slow");
            onUploadError(null, getString(com.walmartlabs.android.photo.R.string.photo_error_upload_too_slow));
            i = 0;
        } else
        if (k == 503)
        {
            PhotoLogger.get().d(TAG, "Server unavailable (503), will retry");
            i = 1;
        }
        if (k != 202 && (j > 0 && i != 0)) goto _L17; else goto _L16
_L8:
        long l4 = l2;
        long l5 = l1;
        if (mUpload.getUploadTime() > 0L)
        {
            l2 += ((PhotoSpecification) (obj3)).getPhoto().getSize();
            l1 += mUpload.getUploadTime();
            l4 = l2;
            l5 = l1;
            if (PhotoDebugSettingsUtils.isDebugMode(this))
            {
                double d = (double)((PhotoSpecification) (obj3)).getPhoto().getSize() / ((double)mUpload.getUploadTime() / 1000D) / 1024D;
                mOrderProgress.setUploadSpeed((long)d);
                l5 = l1;
                l4 = l2;
            }
        }
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("processOrder(): Photo ").append(((PhotoSpecification) (obj3)).getPhoto().getName()).append(" uploaded OK (").append(((PhotoSpecification) (obj3)).getPhoto().getSize()).append(" bytes)").toString());
        mOrderProgress.incrementTotalProgress();
        mOrderProgress.setCurrentProgress(0L);
        mOrderProgress.setCurrentMax(0L);
        fireUploadStatus();
        l2 = l4;
        l1 = l5;
          goto _L18
_L12:
        onOrderError(null, ((PhotoResponse) (obj)), null);
        flag = flag2;
          goto _L19
        obj1;
        onOrderError(((Exception) (obj1)), null, null);
        if (false)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
            flag1 = flag3;
        } else
        {
            flag1 = flag3;
            if (!mOrderProgress.uploadsCancelled())
            {
                AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
                flag1 = flag3;
            }
        }
          goto _L10
        obj1;
        onOrderError(((Exception) (obj1)), null, null);
        if (false)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
            flag1 = flag3;
        } else
        {
            flag1 = flag3;
            if (!mOrderProgress.uploadsCancelled())
            {
                AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
                flag1 = flag3;
            }
        }
          goto _L10
        obj1;
        PhotoLogger.get().e(TAG, "Fatal error(1) - Failed to create hash (DigestException)");
        onOrderError(((Exception) (obj1)), null, null);
        if (false)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
            flag1 = flag3;
        } else
        {
            flag1 = flag3;
            if (!mOrderProgress.uploadsCancelled())
            {
                AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
                flag1 = flag3;
            }
        }
          goto _L10
        obj1;
        onOrderError(((Exception) (obj1)), null, null);
        if (false)
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
            flag1 = flag3;
        } else
        {
            flag1 = flag3;
            if (!mOrderProgress.uploadsCancelled())
            {
                AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
                flag1 = flag3;
            }
        }
          goto _L10
        obj1;
        if (true) goto _L21; else goto _L20
_L20:
        AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderCompleteEvent(pendingorder, mOrderProgress.getOrderId(), l2, l1), mMainThreadHandler);
_L22:
        throw obj1;
_L21:
        if (!mOrderProgress.uploadsCancelled())
        {
            AnalyticsHelper.postOnHandler(AnalyticsHelper.prepareOrderFailedEvent(mOrderProgress.getOrderFailureTechnicalReason()), mMainThreadHandler);
        }
        if (true) goto _L22; else goto _L17
_L17:
        j--;
          goto _L23
    }

    private List purgeSpecsWithZeroQuantity(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            PhotoSpecification photospecification = (PhotoSpecification)list.next();
            if (photospecification.nonZeroQuantity())
            {
                arraylist.add(photospecification);
            }
        } while (true);
        return arraylist;
    }

    private void refreshSession()
    {
        PhotoLogger.get().d(TAG, "refreshSession(): Doing refresh");
        AppIntegrationFactory.create(this).refreshSession(new com.walmartlabs.android.photo.util.integration.AppIntegration.SessionRefreshCallback() {

            final OrderService this$0;

            public void onFailure(boolean flag)
            {
                PhotoLogger.get().d(OrderService.TAG, "refreshSession(): onFailure()");
            }

            public void onSuccess()
            {
                PhotoLogger.get().d(OrderService.TAG, "refreshSession(): onSuccess()");
            }

            
            {
                this$0 = OrderService.this;
                super();
            }
        });
    }

    private static void releaseWakeLock()
    {
        synchronized (sClassLock)
        {
            PhotoLogger.get().d(TAG, "releaseWakeLock()");
            if (sWakeLock != null)
            {
                sWakeLock.release();
                sWakeLock = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void start(Context context, Intent intent)
    {
        acquireWakeLock(context);
        context.startService(intent);
    }

    public void cancelCurrentOrder()
    {
        PhotoLogger.get().d(TAG, "cancelCurrentOrder()");
        mCancelRequested = true;
        if (mUpload != null)
        {
            mUpload.cancel();
        }
        synchronized (mBackoffLock)
        {
            mBackoffLock.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public OrderProgress getOrderProgress()
    {
        return mOrderProgress;
    }

    public Intent getStartingIntent()
    {
        return mCurrentIntent;
    }

    public IBinder onBind(Intent intent)
    {
        return mBinder;
    }

    public void onCreate()
    {
        super.onCreate();
        sProcessingOrder = false;
        mMainThreadHandler = new Handler();
    }

    public void onDestroy()
    {
        super.onDestroy();
        sProcessingOrder = false;
        mListener = null;
        releaseWakeLock();
    }

    protected void onHandleIntent(Intent intent)
    {
        mCurrentIntent = intent;
        sProcessingOrder = true;
        intent = (PendingOrder)intent.getParcelableExtra("order");
        PhotoLogger.get().d(TAG, "onHandleIntent(): Moving to foreground");
        startForeground(1001, PrintNotificationManager.get(this).getProcessingOrderNotification());
        registerReceiver(mConnectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        processOrder(intent);
        PhotoLogger.get().d(TAG, "onHandleIntent(): Withdrawing from foreground");
        unregisterReceiver(mConnectivityReceiver);
        stopForeground(true);
        sProcessingOrder = false;
        return;
        intent;
        PhotoLogger.get().d(TAG, "onHandleIntent(): Withdrawing from foreground");
        unregisterReceiver(mConnectivityReceiver);
        stopForeground(true);
        sProcessingOrder = false;
        throw intent;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        mExplicitlyStarted = true;
        intent.setExtrasClassLoader(com/walmartlabs/android/photo/model/order/PendingOrder.getClassLoader());
        return super.onStartCommand(intent, i, j);
    }

    public void setOrderServiceListener(OrderServiceListener orderservicelistener)
    {
        mListener = orderservicelistener;
    }

    public boolean wasExplicitlyStarted()
    {
        return mExplicitlyStarted;
    }






}
