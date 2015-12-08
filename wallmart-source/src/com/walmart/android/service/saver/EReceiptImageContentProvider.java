// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.content.FileProvider;
import android.text.TextUtils;
import com.walmart.android.service.AsyncCallback;
import com.walmart.android.utils.Base64;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.ereceipt.service.EReceiptService;
import com.walmartlabs.utils.WLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class EReceiptImageContentProvider extends FileProvider
{
    private static class DecodeTask extends AsyncTask
    {

        private final AsyncCallback mCallback;
        private final Context mContext;
        private final File mFile;

        protected transient Boolean doInBackground(String as[])
        {
            boolean flag;
            EReceiptImageContentProvider.clearAllImages(mContext, mFile);
            flag = mFile.exists();
            if (flag || TextUtils.isEmpty(as[0]))
            {
                break MISSING_BLOCK_LABEL_63;
            }
            as = Base64.decode(as[0], 0);
            FileUtils.writeByteArrayToFile(mFile, as);
            return Boolean.valueOf(true);
            as;
            WLog.e(EReceiptImageContentProvider.TAG, "Could not create image file", as);
            return Boolean.valueOf(flag);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        protected void onPostExecute(Boolean boolean1)
        {
            if (!boolean1.booleanValue())
            {
                mCallback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            } else
            {
                mCallback.onSuccess(FileProvider.getUriForFile(mContext, "com.walmart.ereceipt", mFile));
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Boolean)obj);
        }

        private DecodeTask(Context context, String s, String s1, AsyncCallback asynccallback)
        {
            mContext = context;
            mFile = EReceiptImageContentProvider.createImageFile(context, s, s1);
            mCallback = asynccallback;
        }

    }

    private static class DownloadTask extends AsyncTask
    {

        private final AsyncCallback mCallback;
        private final Context mContext;
        private final File mFile;
        private volatile boolean mFileExists;
        private final String mRuid;

        protected transient FileOutputStream doInBackground(Void avoid[])
        {
            EReceiptImageContentProvider.clearAllImages(mContext, mFile);
            mFileExists = mFile.exists();
            if (mFileExists)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            avoid = FileUtils.openOutputStream(mFile);
            return avoid;
            avoid;
            WLog.e(EReceiptImageContentProvider.TAG, "Could not create image file", avoid);
            return null;
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected void onPostExecute(FileOutputStream fileoutputstream)
        {
            if (!mFileExists && fileoutputstream != null)
            {
                Services.get().getEReceiptService().writeImageStream(mRuid, fileoutputstream, fileoutputstream. new AsyncCallback() {

                    final DownloadTask this$0;
                    final FileOutputStream val$fout;

                    public int getID()
                    {
                        return 0;
                    }

                    public void onCancelled()
                    {
                        IOUtils.closeQuietly(fout);
                        mCallback.onCancelled();
                    }

                    public void onFailure(Integer integer, Void void1)
                    {
                        IOUtils.closeQuietly(fout);
                        mCallback.onFailure(integer, null);
                    }

                    public volatile void onFailure(Object obj, Object obj1)
                    {
                        onFailure((Integer)obj, (Void)obj1);
                    }

                    public volatile void onSuccess(Object obj)
                    {
                        onSuccess((Void)obj);
                    }

                    public void onSuccess(Void void1)
                    {
                        IOUtils.closeQuietly(fout);
                        mCallback.onSuccess(FileProvider.getUriForFile(mContext, "com.walmart.ereceipt", mFile));
                    }

                    public void setID(int i)
                    {
                    }

            
            {
                this$0 = final_downloadtask;
                fout = FileOutputStream.this;
                super();
            }
                });
                return;
            }
            if (!mFileExists)
            {
                mCallback.onFailure(Integer.valueOf(0x15f91), null);
                return;
            } else
            {
                mCallback.onSuccess(FileProvider.getUriForFile(mContext, "com.walmart.ereceipt", mFile));
                return;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((FileOutputStream)obj);
        }




        DownloadTask(Context context, String s, String s1, AsyncCallback asynccallback)
        {
            mContext = context;
            mRuid = s;
            mFile = EReceiptImageContentProvider.createImageFile(context, s, s1);
            mCallback = asynccallback;
        }
    }


    private static final String AUTHORITY = "com.walmart.ereceipt";
    private static final String COLUMNS[] = {
        "_display_name", "_size", "_data", "mime_type", "orientation"
    };
    public static final String IMAGE_CONTENT_TYPE = "image/png";
    private static final String PATH = "eReceiptImages";
    private static final String TAG = com/walmart/android/service/saver/EReceiptImageContentProvider.getSimpleName();

    public EReceiptImageContentProvider()
    {
    }

    private static void clearAllImages(Context context, File file)
    {
        delete(new File(context.getFilesDir(), "eReceiptImages"), file);
    }

    private static Object[] copyOf(Object aobj[], int i)
    {
        Object aobj1[] = new Object[i];
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return aobj1;
    }

    private static String[] copyOf(String as[], int i)
    {
        String as1[] = new String[i];
        System.arraycopy(as, 0, as1, 0, i);
        return as1;
    }

    private static File createImageFile(Context context, String s, String s1)
    {
        return new File(context.getFilesDir(), (new StringBuilder()).append("eReceiptImages").append(File.separator).append(s).append(File.separator).append(s1).append(".png").toString());
    }

    public static Uri createUriForReceiptImage(Context context, String s, String s1)
    {
        return getUriForFile(context, "com.walmart.ereceipt", createImageFile(context, s, s1));
    }

    private static void delete(File file, File file1)
    {
        if (file.isDirectory())
        {
            File afile[] = file.listFiles();
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                delete(afile[i], file1);
            }

            file.delete();
        } else
        if (!file.equals(file1))
        {
            file.delete();
            return;
        }
    }

    public static void downloadReceiptImage(Context context, String s, String s1, AsyncCallback asynccallback)
    {
        (new DownloadTask(context, s, s1, asynccallback)).execute(new Void[0]);
    }

    public static void storeReceiptImage(Context context, String s, String s1, String s2, AsyncCallback asynccallback)
    {
        (new DecodeTask(context, s, s1, asynccallback)).execute(new String[] {
            s2
        });
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        if (uri == null || TextUtils.isEmpty(uri.toString()))
        {
            return null;
        }
        as1 = super.query(uri, as, s, as1, s1);
        if (as1 != null)
        {
            as1.moveToFirst();
        }
        s = as;
        if (as == null)
        {
            s = COLUMNS;
        }
        s1 = new String[s.length];
        as = ((String []) (new Object[s.length]));
        int l1 = s.length;
        int j = 0;
        int i = 0;
        while (j < l1) 
        {
            Object obj = s[j];
            if ("_display_name".equals(obj) && as1 != null)
            {
                s1[i] = "_display_name";
                int k = i + 1;
                as[i] = as1.getString(as1.getColumnIndexOrThrow("_display_name"));
                i = k;
            } else
            if ("_size".equals(obj) && as1 != null)
            {
                s1[i] = "_size";
                int l = i + 1;
                as[i] = Long.valueOf(as1.getLong(as1.getColumnIndexOrThrow("_size")));
                i = l;
            } else
            if ("_data".equals(obj))
            {
                s1[i] = "_data";
                int i1 = i + 1;
                as[i] = uri.toString();
                i = i1;
            } else
            if ("mime_type".equals(obj))
            {
                s1[i] = "mime_type";
                int j1 = i + 1;
                as[i] = "image/png";
                i = j1;
            } else
            if ("orientation".equals(obj))
            {
                s1[i] = "orientation";
                int k1 = i + 1;
                as[i] = Integer.valueOf(0);
                i = k1;
            }
            j++;
        }
        uri = copyOf(s1, i);
        as = ((String []) (copyOf(as, i)));
        uri = new MatrixCursor(uri, 1);
        uri.addRow(as);
        return uri;
    }




}
