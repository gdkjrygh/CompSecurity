// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.net;

import android.content.Context;
import android.text.TextUtils;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.user.Contact;
import com.walmartlabs.android.photo.net.exception.PhotoIdException;
import com.walmartlabs.android.photo.net.exception.UploadCancelledException;
import com.walmartlabs.android.photo.util.PhotoDigest;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoObjectMapper;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.walmartlabs.android.photo.net:
//            PhotoUpload, EndpointsProvider, PhotoNetworkServices, PhotoResponse

public class PhotoMultipartUpload
    implements PhotoUpload
{
    public static class PhotoMetadata
    {

        private String photoId;
        private String userId;

        public String getPhotoId()
        {
            return photoId;
        }

        public String getUserId()
        {
            return userId;
        }

        public void setPhotoId(String s)
        {
            photoId = s;
        }

        public void setUserId(String s)
        {
            userId = s;
        }

        public PhotoMetadata(String s, String s1)
        {
            photoId = s;
            userId = s1;
        }
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

        public final void writeBytes(String s)
            throws IOException
        {
            int j = s.length();
            for (int i = 0; i < j; i++)
            {
                write((byte)s.charAt(i));
            }

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


    private static final String HTTP_BOUNDARY = "*****";
    private static final String HTTP_LINE_END = "\r\n";
    private static final String HTTP_TWO_HYPHENS = "--";
    private static final String TAG = com/walmartlabs/android/photo/net/PhotoMultipartUpload.getSimpleName();
    private volatile boolean mCancelRequested;
    private PhotoUpload.PhotoUploadListener mListener;
    private PhotoNetworkServices mNetworkServices;
    private DevicePhoto mPhoto;
    private String mPhotoEndpoint;
    private String mPhotoId;
    private long mUploadTime;
    private String mUserId;

    public PhotoMultipartUpload(PhotoNetworkServices photonetworkservices, DevicePhoto devicephoto, Contact contact, EndpointsProvider endpointsprovider, Context context, PhotoUpload.PhotoUploadListener photouploadlistener)
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
        mUserId = contact.getEmail();
        mPhotoEndpoint = endpointsprovider.photosEndpoint();
        mListener = photouploadlistener;
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
        boolean flag2;
        flag = false;
        flag2 = false;
        boolean flag3 = TextUtils.isEmpty(s);
        if (flag3)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        flag2 = flag;
        Object obj;
        NumberFormatException numberformatexception;
        boolean flag1;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        if (Long.parseLong(s) == mPhoto.getSize())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag1;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        flag2 = flag1;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Length mismatch: ").append(mPhoto.getSize()).append(" does not match received value ").append(s).toString());
        flag2 = flag1;
_L7:
        flag5 = false;
        flag6 = false;
        flag4 = flag6;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        flag7 = TextUtils.isEmpty(((CharSequence) (obj1)));
        flag4 = flag6;
        if (flag7)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        flag4 = flag5;
        s = PhotoDigest.md5(new File(mPhoto.getLocation()));
        flag4 = flag5;
        flag5 = ((String) (obj1)).equals(s);
        flag4 = flag5;
        if (flag5)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        flag4 = flag5;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("MD5 mismatch: ").append(s).append(" does not match received value ").append(((String) (obj1))).toString());
        flag4 = flag5;
_L5:
        if (flag2 && flag4)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (!flag4)
        {
            break; /* Loop/switch isn't completed */
        }
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Photo already uploaded: ").append(mPhoto.getName()).toString());
        return flag4;
        numberformatexception;
        try
        {
            PhotoLogger.get().w(TAG, (new StringBuilder()).append("Invalid Content-Length value: ").append(s).toString());
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            PhotoLogger.get().w(TAG, (new StringBuilder()).append("Request failed (will re-upload): ").append(obj).toString());
        }
_L2:
        return false;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        return flag4;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private PhotoResponse uploadPhoto(DevicePhoto devicephoto, PhotoOutputStream.WriteListener writelistener)
        throws IOException, UploadCancelledException
    {
        Object obj;
        Object obj3;
        PhotoResponse photoresponse;
        photoresponse = new PhotoResponse();
        Object obj4 = null;
        Object obj2 = null;
        obj3 = null;
        Object obj1 = null;
        Object obj5 = null;
        int i;
        int j;
        int k;
        try
        {
            obj = new FileInputStream(new File(devicephoto.getLocation()));
        }
        // Misplaced declaration of an exception variable
        catch (PhotoOutputStream.WriteListener writelistener)
        {
            devicephoto = obj5;
            obj = obj3;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (HttpsURLConnection)(new URL(mPhotoEndpoint)).openConnection();
        ((HttpsURLConnection) (obj1)).setDoInput(false);
        ((HttpsURLConnection) (obj1)).setDoOutput(true);
        ((HttpsURLConnection) (obj1)).setUseCaches(false);
        ((HttpsURLConnection) (obj1)).setChunkedStreamingMode(0);
        ((HttpsURLConnection) (obj1)).setRequestMethod("POST");
        ((HttpsURLConnection) (obj1)).setRequestProperty("Connection", "Keep-Alive");
        ((HttpsURLConnection) (obj1)).setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
        devicephoto = new PhotoOutputStream(((HttpsURLConnection) (obj1)).getOutputStream(), devicephoto.getSize(), writelistener);
        devicephoto.writeBytes("--");
        devicephoto.writeBytes("*****");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("Content-Disposition: form-data; name=\"metadata\"");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("Content-Type: application/json");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes(PhotoObjectMapper.get().writeAsString(new PhotoMetadata(mPhotoId, mUserId)));
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("--");
        devicephoto.writeBytes("*****");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("Content-Disposition: form-data; name=\"photo\";filename=\"uploaded.jpg\"");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("Content-Type: image/jpeg");
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("\r\n");
        i = Math.min(((FileInputStream) (obj)).available(), 0x10000);
        obj2 = new byte[i];
        j = ((FileInputStream) (obj)).read(((byte []) (obj2)), 0, i);
        k = 0;
_L2:
        if (j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mCancelRequested)
        {
            break; /* Loop/switch isn't completed */
        }
        devicephoto.write(((byte []) (obj2)), 0, i);
        k += i;
        i = Math.min(((FileInputStream) (obj)).available(), 0x10000);
        j = ((FileInputStream) (obj)).read(((byte []) (obj2)), 0, i);
        writelistener.onBytesWritten(k);
        if (true) goto _L2; else goto _L1
        obj1;
        writelistener = ((PhotoOutputStream.WriteListener) (obj));
        obj = devicephoto;
        devicephoto = writelistener;
        writelistener = ((PhotoOutputStream.WriteListener) (obj1));
_L7:
        obj1 = devicephoto;
        obj2 = obj;
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Invalid Upload URI:").append(writelistener).toString());
        if (obj != null)
        {
            try
            {
                ((PhotoOutputStream) (obj)).flush();
                ((PhotoOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (PhotoOutputStream.WriteListener writelistener) { }
        }
        if (devicephoto != null)
        {
            try
            {
                devicephoto.close();
            }
            // Misplaced declaration of an exception variable
            catch (DevicePhoto devicephoto)
            {
                return photoresponse;
            }
        }
        return photoresponse;
_L1:
        if (mCancelRequested)
        {
            throw new UploadCancelledException("Cancel requested");
        }
          goto _L3
        writelistener;
        obj2 = devicephoto;
        devicephoto = writelistener;
        obj1 = obj;
_L5:
        if (obj2 != null)
        {
            try
            {
                ((PhotoOutputStream) (obj2)).flush();
                ((PhotoOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (PhotoOutputStream.WriteListener writelistener) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((FileInputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (PhotoOutputStream.WriteListener writelistener) { }
        }
        throw devicephoto;
_L3:
        devicephoto.writeBytes("\r\n");
        devicephoto.writeBytes("--");
        devicephoto.writeBytes("*****");
        devicephoto.writeBytes("--");
        devicephoto.writeBytes("\r\n");
        devicephoto.flush();
        photoresponse.setHttpStatus(((HttpsURLConnection) (obj1)).getResponseCode());
        photoresponse.setHttpReason(((HttpsURLConnection) (obj1)).getResponseMessage());
        photoresponse.setValid(true);
        if (devicephoto != null)
        {
            try
            {
                devicephoto.flush();
                devicephoto.close();
            }
            // Misplaced declaration of an exception variable
            catch (DevicePhoto devicephoto) { }
        }
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (DevicePhoto devicephoto)
            {
                return photoresponse;
            }
            return photoresponse;
        } else
        {
            return photoresponse;
        }
        devicephoto;
        obj1 = obj;
        obj2 = obj4;
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_43;
        writelistener;
        devicephoto = ((DevicePhoto) (obj));
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void cancel()
    {
        mCancelRequested = true;
    }

    public long getUploadTime()
    {
        return mUploadTime;
    }

    public PhotoResponse start()
        throws IOException, PhotoIdException, UploadCancelledException
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
        if (alreadyUploaded())
        {
            obj = new PhotoResponse();
            ((PhotoResponse) (obj)).setHttpStatus(202);
            ((PhotoResponse) (obj)).setValid(true);
        } else
        {
            long l = System.currentTimeMillis();
            PhotoResponse photoresponse = uploadPhoto(mPhoto, new PhotoOutputStream.WriteListener() {

                final PhotoMultipartUpload this$0;
                final long val$photoSize;

                public void onBytesWritten(long l1)
                {
                    mListener.onBytesWritten(l1, photoSize);
                }

            
            {
                this$0 = PhotoMultipartUpload.this;
                photoSize = l;
                super();
            }
            });
            obj = photoresponse;
            if (photoresponse != null)
            {
                obj = photoresponse;
                if (photoresponse.getHttpStatus() == 202)
                {
                    mUploadTime = System.currentTimeMillis() - l;
                    return photoresponse;
                }
            }
        }
        return ((PhotoResponse) (obj));
    }

    public PhotoResponse startMocked()
    {
        long l1 = mPhoto.getSize();
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
        return photoresponse;
    }


}
