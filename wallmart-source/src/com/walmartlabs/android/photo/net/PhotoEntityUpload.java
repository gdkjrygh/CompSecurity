// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import android.text.TextUtils;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.net.exception.PhotoIdException;
import com.walmartlabs.android.photo.util.PhotoDigest;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.debug.PhotoDebugSettings;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.InputStreamEntity;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoUpload, EndpointsProvider, PhotoNetworkServices, PhotoResponse

public class PhotoEntityUpload
    implements PhotoUpload
{
    public static class PhotoInputStreamEntity extends InputStreamEntity
    {

        private long mBytesToRead;
        private EntityListener mListener;

        public void writeTo(OutputStream outputstream)
            throws IOException
        {
            outputstream = new PhotoOutputStream(outputstream, mBytesToRead, new PhotoOutputStream.WriteListener() {

                final PhotoInputStreamEntity this$0;

                public void onBytesWritten(long l)
                {
                    if (mListener != null)
                    {
                        mListener.onBytesWritten(l);
                    }
                }

            
            {
                this$0 = PhotoInputStreamEntity.this;
                super();
            }
            });
            super.writeTo(outputstream);
            outputstream.flush();
        }


        public PhotoInputStreamEntity(InputStream inputstream, long l, EntityListener entitylistener)
        {
            super(inputstream, l);
            mBytesToRead = l;
            mListener = entitylistener;
        }
    }

    public static interface PhotoInputStreamEntity.EntityListener
    {

        public abstract void onBytesWritten(long l);
    }

    public static class PhotoOutputStream extends BufferedOutputStream
    {

        private static final long NOTIFICATION_INTERVAL_BYTES = 0x10000L;
        private long mBytesWritten;
        private long mLastNotificationBytes;
        private WriteListener mListener;
        private long mTotalToWrite;

        private void fireBytesWritten()
        {
            if (mBytesWritten == mTotalToWrite || mBytesWritten - mLastNotificationBytes > 0x10000L)
            {
                mLastNotificationBytes = mBytesWritten;
                if (mListener != null)
                {
                    mListener.onBytesWritten(mBytesWritten);
                }
            }
        }

        public void write(int i)
            throws IOException
        {
            super.write(i);
            mBytesWritten = mBytesWritten + 1L;
            fireBytesWritten();
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            super.write(abyte0, i, j);
            mBytesWritten = mBytesWritten + (long)j;
            fireBytesWritten();
        }

        public PhotoOutputStream(OutputStream outputstream, long l, WriteListener writelistener)
        {
            super(outputstream);
            mListener = writelistener;
            mTotalToWrite = l;
        }
    }

    public static interface PhotoOutputStream.WriteListener
    {

        public abstract void onBytesWritten(long l);
    }


    private static final String TAG = com/walmartlabs/android/photo/net/PhotoEntityUpload.getSimpleName();
    private volatile boolean mCancelRequested;
    private Context mContext;
    private PhotoUpload.PhotoUploadListener mListener;
    private PhotoNetworkServices mNetworkServices;
    private DevicePhoto mPhoto;
    private String mPhotoEndpoint;
    private String mPhotoId;
    private String mPhotosEndpoint;
    private HttpPut mRequest;
    private long mUploadTime;

    public PhotoEntityUpload(PhotoNetworkServices photonetworkservices, DevicePhoto devicephoto, Contact contact, EndpointsProvider endpointsprovider, Context context, PhotoUpload.PhotoUploadListener photouploadlistener)
    {
        mNetworkServices = photonetworkservices;
        mPhoto = devicephoto;
        try
        {
            mPhotoId = mPhoto.getUserAugmentedUniqueId(context, contact);
        }
        // Misplaced declaration of an exception variable
        catch (PhotoNetworkServices photonetworkservices)
        {
            PhotoLogger.get().e(TAG, "Fatal error(2) - Failed to create hash (DigestException)");
        }
        mPhotosEndpoint = endpointsprovider.photosEndpoint();
        mPhotoEndpoint = endpointsprovider.photoEndpoint(mPhotoId);
        mListener = photouploadlistener;
        mContext = context;
    }

    private boolean alreadyUploaded()
    {
        Object obj1 = mNetworkServices.head(mPhotoEndpoint);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (((PhotoResponse) (obj1)).getHttpStatus() != 200) goto _L2; else goto _L3
_L3:
        String s;
        s = ((PhotoResponse) (obj1)).getHttpHeader("Photo-Length");
        obj1 = ((PhotoResponse) (obj1)).getHttpHeader("Photo-MD5");
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = false;
        boolean flag2 = TextUtils.isEmpty(s);
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_127;
        }
        Object obj;
        NumberFormatException numberformatexception;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        if (Long.parseLong(s) == mPhoto.getSize())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("[Size] Comparing ").append(mPhoto.getSize()).append(" <-> ").append(s).append(" (Incoming)").toString());
_L7:
        flag4 = false;
        flag5 = false;
        flag3 = flag5;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag6 = TextUtils.isEmpty(((CharSequence) (obj1)));
        flag3 = flag5;
        if (flag6)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag3 = flag4;
        s = PhotoDigest.md5(new File(mPhoto.getLocation()));
        flag3 = flag4;
        flag4 = ((String) (obj1)).equals(s);
        flag3 = flag4;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("[MD5] Comparing ").append(s).append(" <-> ").append(((String) (obj1))).append(" (Incoming)").toString());
        flag3 = flag4;
_L5:
        if (flag && flag3)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3)
        {
            break; /* Loop/switch isn't completed */
        }
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Photo already uploaded: ").append(mPhoto.getName()).toString());
        return flag3;
        numberformatexception;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Invalid Content-Length value: ").append(s).toString());
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        obj;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Request failed (will trigger re-upload): ").append(obj).toString());
_L2:
        return false;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        return flag3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void cancel()
    {
        mCancelRequested = true;
        if (mRequest != null)
        {
            (new Thread() {

                final PhotoEntityUpload this$0;

                public void run()
                {
                    mRequest.abort();
                }

            
            {
                this$0 = PhotoEntityUpload.this;
                super();
            }
            }).start();
        }
    }

    public long getUploadTime()
    {
        return mUploadTime;
    }

    public PhotoResponse start()
        throws IOException, PhotoIdException
    {
        if (TextUtils.isEmpty(mPhotoId))
        {
            throw new PhotoIdException("photoId cannot be null, possible hashing error");
        }
        Object obj = new File(mPhoto.getLocation());
        final long photoSize = mPhoto.getSize();
        if (!((File) (obj)).exists() || photoSize == 0L)
        {
            throw new FileNotFoundException((new StringBuilder()).append("File not found: ").append(mPhoto.getLocation()).toString());
        }
        if (!PhotoDebugSettings.get(mContext).alwaysReupload() && alreadyUploaded())
        {
            obj = new PhotoResponse();
            ((PhotoResponse) (obj)).setHttpStatus(202);
            ((PhotoResponse) (obj)).setValid(true);
        } else
        {
            obj = new PhotoInputStreamEntity(new FileInputStream(new File(mPhoto.getLocation())), photoSize, new PhotoInputStreamEntity.EntityListener() {

                final PhotoEntityUpload this$0;
                final long val$photoSize;

                public void onBytesWritten(long l)
                {
                    PhotoLogger.get().d(PhotoEntityUpload.TAG, (new StringBuilder()).append("onBytesWritten(): ").append(l).append(" / ").append(photoSize).toString());
                    if (mListener != null)
                    {
                        mListener.onBytesWritten(l, photoSize);
                    }
                }

            
            {
                this$0 = PhotoEntityUpload.this;
                photoSize = l;
                super();
            }
            });
            mRequest = new HttpPut(mPhotosEndpoint);
            mRequest.setHeader("Content-Type", "image/jpeg");
            mRequest.setHeader("Photo-ID", mPhotoId);
            mRequest.setEntity(((org.apache.http.HttpEntity) (obj)));
            photoSize = System.currentTimeMillis();
            PhotoResponse photoresponse = mNetworkServices.putBytes(mRequest, mPhoto.getLocation());
            obj = photoresponse;
            if (photoresponse.getHttpStatus() == 202)
            {
                mUploadTime = System.currentTimeMillis() - photoSize;
                return photoresponse;
            }
        }
        return ((PhotoResponse) (obj));
    }

    public PhotoResponse startMocked()
    {
        long l1 = mPhoto.getSize();
        long l2 = System.currentTimeMillis();
        long l = 0L;
        while (l <= l1 && !mCancelRequested) 
        {
            if (l % 0x10000L != 0L)
            {
                continue;
            }
            PhotoResponse photoresponse;
            int i;
            try
            {
                Thread.sleep(100L);
            }
            catch (InterruptedException interruptedexception) { }
            if (mListener != null)
            {
                mListener.onBytesWritten(l, l1);
            }
            l++;
        }
        photoresponse = new PhotoResponse();
        if (mCancelRequested)
        {
            i = 0;
        } else
        {
            i = 202;
        }
        photoresponse.setHttpStatus(i);
        if (photoresponse.getHttpStatus() == 202)
        {
            mUploadTime = System.currentTimeMillis() - l2;
        }
        return photoresponse;
    }




}
