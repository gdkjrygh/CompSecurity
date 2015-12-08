// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.print;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Referenced classes of package android.support.v4.print:
//            PrintHelperKitkat

class mBitmap extends PrintDocumentAdapter
{

    AsyncTask loadBitmap;
    private PrintAttributes mAttributes;
    Bitmap mBitmap;
    final PrintHelperKitkat this$0;
    final PrintFinishCallback val$callback;
    final int val$fittingMode;
    final Uri val$imageFile;
    final String val$jobName;

    private void cancelLoad()
    {
        synchronized (PrintHelperKitkat.access$300(PrintHelperKitkat.this))
        {
            if (mDecodeOptions != null)
            {
                mDecodeOptions.requestCancelDecode();
                mDecodeOptions = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onFinish()
    {
        super.onFinish();
        cancelLoad();
        loadBitmap.cancel(true);
        if (val$callback != null)
        {
            val$callback.onFinish();
        }
    }

    public void onLayout(final PrintAttributes oldPrintAttributes, final PrintAttributes newPrintAttributes, final CancellationSignal cancellationSignal, final android.print..LayoutResultCallback layoutResultCallback, Bundle bundle)
    {
        boolean flag = true;
        if (cancellationSignal.isCanceled())
        {
            layoutResultCallback.onLayoutCancelled();
            mAttributes = newPrintAttributes;
            return;
        }
        if (mBitmap != null)
        {
            cancellationSignal = (new android.print.ilder(val$jobName)).setContentType(1).setPageCount(1).build();
            if (newPrintAttributes.equals(oldPrintAttributes))
            {
                flag = false;
            }
            layoutResultCallback.onLayoutFinished(cancellationSignal, flag);
            return;
        } else
        {
            loadBitmap = new AsyncTask() {

                final PrintHelperKitkat._cls2 this$1;
                final CancellationSignal val$cancellationSignal;
                final android.print.PrintDocumentAdapter.LayoutResultCallback val$layoutResultCallback;
                final PrintAttributes val$newPrintAttributes;
                final PrintAttributes val$oldPrintAttributes;

                protected transient Bitmap doInBackground(Uri auri[])
                {
                    try
                    {
                        auri = PrintHelperKitkat.access$200(this$0, imageFile, 3500);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri auri[])
                    {
                        return null;
                    }
                    return auri;
                }

                protected volatile Object doInBackground(Object aobj[])
                {
                    return doInBackground((Uri[])aobj);
                }

                protected void onCancelled(Bitmap bitmap)
                {
                    layoutResultCallback.onLayoutCancelled();
                }

                protected volatile void onCancelled(Object obj)
                {
                    onCancelled((Bitmap)obj);
                }

                protected void onPostExecute(Bitmap bitmap)
                {
                    boolean flag1 = true;
                    super.onPostExecute(bitmap);
                    mBitmap = bitmap;
                    if (bitmap != null)
                    {
                        bitmap = (new android.print.PrintDocumentInfo.Builder(jobName)).setContentType(1).setPageCount(1).build();
                        if (newPrintAttributes.equals(oldPrintAttributes))
                        {
                            flag1 = false;
                        }
                        layoutResultCallback.onLayoutFinished(bitmap, flag1);
                        return;
                    } else
                    {
                        layoutResultCallback.onLayoutFailed(null);
                        return;
                    }
                }

                protected volatile void onPostExecute(Object obj)
                {
                    onPostExecute((Bitmap)obj);
                }

                protected void onPreExecute()
                {
                    cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() {

                        final _cls1 this$2;

                        public void onCancel()
                        {
                            cancelLoad();
                            cancel(false);
                        }

            
            {
                this$2 = _cls1.this;
                super();
            }
                    });
                }

            
            {
                this$1 = PrintHelperKitkat._cls2.this;
                cancellationSignal = cancellationsignal;
                newPrintAttributes = printattributes;
                oldPrintAttributes = printattributes1;
                layoutResultCallback = layoutresultcallback;
                super();
            }
            };
            loadBitmap.execute(new Uri[0]);
            mAttributes = newPrintAttributes;
            return;
        }
    }

    public void onWrite(PageRange apagerange[], ParcelFileDescriptor parcelfiledescriptor, CancellationSignal cancellationsignal, android.print..WriteResultCallback writeresultcallback)
    {
        apagerange = new PrintedPdfDocument(mContext, mAttributes);
        cancellationsignal = apagerange.startPage(1);
        Object obj = new RectF(cancellationsignal.Info().getContentRect());
        obj = PrintHelperKitkat.access$000(PrintHelperKitkat.this, mBitmap.getWidth(), mBitmap.getHeight(), ((RectF) (obj)), val$fittingMode);
        cancellationsignal.Canvas().drawBitmap(mBitmap, ((android.graphics.Matrix) (obj)), null);
        apagerange.finishPage(cancellationsignal);
        apagerange.writeTo(new FileOutputStream(parcelfiledescriptor.getFileDescriptor()));
        writeresultcallback.onWriteFinished(new PageRange[] {
            PageRange.ALL_PAGES
        });
_L2:
        if (apagerange != null)
        {
            apagerange.close();
        }
        if (parcelfiledescriptor == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        parcelfiledescriptor.close();
        return;
        cancellationsignal;
        Log.e("PrintHelperKitkat", "Error writing printed content", cancellationsignal);
        writeresultcallback.onWriteFailed(null);
        if (true) goto _L2; else goto _L1
_L1:
        cancellationsignal;
        if (apagerange != null)
        {
            apagerange.close();
        }
        if (parcelfiledescriptor != null)
        {
            try
            {
                parcelfiledescriptor.close();
            }
            // Misplaced declaration of an exception variable
            catch (PageRange apagerange[]) { }
        }
        throw cancellationsignal;
        apagerange;
    }


    PrintFinishCallback()
    {
        this$0 = final_printhelperkitkat;
        val$jobName = s;
        val$imageFile = uri;
        val$callback = printfinishcallback;
        val$fittingMode = I.this;
        super();
        mBitmap = null;
    }
}
