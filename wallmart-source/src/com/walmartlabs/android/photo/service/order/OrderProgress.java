// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.service.order;

import android.content.Context;
import com.walmartlabs.android.photo.model.DomainMapper;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.ServerError;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.model.wire.WireServerError;
import com.walmartlabs.android.photo.net.PhotoResponse;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import java.util.Date;

public class OrderProgress
{

    private long mCurrentMax;
    private DevicePhoto mCurrentPhoto;
    private long mCurrentProgress;
    private boolean mOrderDone;
    private String mOrderId;
    private boolean mOrderSuccessful;
    private Date mPickupTime;
    private Store mStore;
    private int mTotalMax;
    private int mTotalProgress;
    private long mUploadSpeed;
    private boolean mUploadsCancelled;
    private boolean mUploadsDone;
    private boolean mUploadsSuccessful;
    private String orderFailureTechnicalReason;
    private String uploadsFailureDisplayReason;

    public OrderProgress()
    {
    }

    public long currentMax()
    {
        return mCurrentMax;
    }

    public long currentProgress()
    {
        return mCurrentProgress;
    }

    public DevicePhoto getCurrentPhoto()
    {
        return mCurrentPhoto;
    }

    public String getOrderFailureTechnicalReason()
    {
        return orderFailureTechnicalReason;
    }

    public String getOrderId()
    {
        return mOrderId;
    }

    public Store getPickupStore()
    {
        return mStore;
    }

    public Date getPickupTime()
    {
        return mPickupTime;
    }

    public long getUploadSpeed()
    {
        return mUploadSpeed;
    }

    public String getUploadsFailureDisplayReason()
    {
        return uploadsFailureDisplayReason;
    }

    public void incrementTotalProgress()
    {
        mTotalProgress = mTotalProgress + 1;
    }

    public boolean orderDone()
    {
        return mOrderDone;
    }

    public boolean orderSuccessful()
    {
        return mOrderSuccessful;
    }

    public void setCurrentMax(long l)
    {
        mCurrentMax = l;
    }

    public void setCurrentPhoto(DevicePhoto devicephoto)
    {
        mCurrentPhoto = devicephoto;
    }

    public void setCurrentProgress(long l)
    {
        mCurrentProgress = l;
    }

    public void setOrderDone(boolean flag)
    {
        mOrderDone = flag;
    }

    public void setOrderFailureTechnicalReason(PhotoResponse photoresponse, Context context)
    {
        if (photoresponse != null)
        {
            WireServerError wireservererror = (WireServerError)PhotoObjectMapper.get().readFromString(photoresponse.getEntity(), com/walmartlabs/android/photo/model/wire/WireServerError);
            context = DomainMapper.get(context).mapServerErrorFromWireError(wireservererror);
            if (context != null)
            {
                setOrderFailureTechnicalReason((new StringBuilder()).append("status: ").append(context.getStatusCode()).append(", error: ").append(context.getError()).append(", message: ").append(context.getMessage()).toString());
                return;
            } else
            {
                setOrderFailureTechnicalReason((new StringBuilder()).append(photoresponse.getHttpStatus()).append(" ").append(photoresponse.getHttpReason()).toString());
                return;
            }
        } else
        {
            setOrderFailureTechnicalReason("Undefined server error");
            return;
        }
    }

    public void setOrderFailureTechnicalReason(String s)
    {
        orderFailureTechnicalReason = s;
    }

    public void setOrderId(String s)
    {
        mOrderId = s;
    }

    public void setOrderSuccessful(boolean flag)
    {
        mOrderSuccessful = flag;
    }

    public void setPickupStore(Store store)
    {
        mStore = store;
    }

    public void setPickupTime(Date date)
    {
        mPickupTime = date;
    }

    public void setTotalMax(int i)
    {
        mTotalMax = i;
    }

    public void setTotalProgress(int i)
    {
        mTotalProgress = i;
    }

    public void setUploadSpeed(long l)
    {
        mUploadSpeed = l;
    }

    public void setUploadsCancelled(boolean flag)
    {
        mUploadsCancelled = flag;
    }

    public void setUploadsDone(boolean flag)
    {
        mUploadsDone = flag;
    }

    public void setUploadsFailureDisplayReason(String s)
    {
        uploadsFailureDisplayReason = s;
    }

    public void setUploadsSuccessful(boolean flag)
    {
        mUploadsSuccessful = flag;
    }

    public int totalMax()
    {
        return mTotalMax;
    }

    public int totalProgress()
    {
        return mTotalProgress;
    }

    public boolean uploadsCancelled()
    {
        return mUploadsCancelled;
    }

    public boolean uploadsDone()
    {
        return mUploadsDone;
    }

    public boolean uploadsSuccessful()
    {
        return mUploadsSuccessful;
    }
}
