// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.saver;

import android.support.v4.content.FileProvider;
import com.walmart.android.service.AsyncCallback;
import java.io.FileOutputStream;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.service.saver:
//            EReceiptImageContentProvider

class val.fout
    implements AsyncCallback
{

    final this._cls0 this$0;
    final FileOutputStream val$fout;

    public int getID()
    {
        return 0;
    }

    public void onCancelled()
    {
        IOUtils.closeQuietly(val$fout);
        cess._mth400(this._cls0.this).onCancelled();
    }

    public void onFailure(Integer integer, Void void1)
    {
        IOUtils.closeQuietly(val$fout);
        cess._mth400(this._cls0.this).onFailure(integer, null);
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
        IOUtils.closeQuietly(val$fout);
        cess._mth400(this._cls0.this).onSuccess(FileProvider.getUriForFile(cess._mth500(this._cls0.this), "com.walmart.ereceipt", cess._mth600(this._cls0.this)));
    }

    public void setID(int i)
    {
    }

    ()
    {
        this$0 = final_;
        val$fout = FileOutputStream.this;
        super();
    }
}
