// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentView

class this._cls0 extends AsyncTask
{

    final AttachmentView this$0;

    protected transient Bitmap doInBackground(Void avoid[])
    {
        return AttachmentView.access$000(AttachmentView.this);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            AttachmentView.access$100(AttachmentView.this, bitmap, false);
            return;
        } else
        {
            AttachmentView.access$200(AttachmentView.this, false);
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    ()
    {
        this$0 = AttachmentView.this;
        super();
    }
}
