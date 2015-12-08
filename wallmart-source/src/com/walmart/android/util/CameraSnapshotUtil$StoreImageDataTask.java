// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import android.content.Context;
import android.os.AsyncTask;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.io.IOUtils;

// Referenced classes of package com.walmart.android.util:
//            CameraSnapshotUtil

private static class mUpc extends AsyncTask
{

    private final Context mContext;
    private final String mUpc;

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((byte[][])aobj);
    }

    protected transient Void doInBackground(byte abyte0[][])
    {
        Object obj;
        Object obj1;
        Object obj2;
        byte abyte1[];
        abyte1 = abyte0[0];
        abyte0 = new File((new StringBuilder()).append(mContext.getCacheDir()).append("/snapshots/").toString());
        abyte0.mkdir();
        obj = new File(abyte0, (new StringBuilder()).append(mUpc).append(".jpg").toString());
        if (((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj2 = null;
        abyte0 = null;
        obj1 = null;
        obj = new FileOutputStream(((File) (obj)));
        ((FileOutputStream) (obj)).write(abyte1);
        IOUtils.closeQuietly(((java.io.OutputStream) (obj)));
_L1:
        return null;
        abyte0;
        obj = obj1;
        obj1 = abyte0;
_L5:
        abyte0 = ((byte [][]) (obj));
        ((FileNotFoundException) (obj1)).printStackTrace();
        IOUtils.closeQuietly(((java.io.OutputStream) (obj)));
          goto _L1
        IOException ioexception;
        ioexception;
        obj = obj2;
_L4:
        abyte0 = ((byte [][]) (obj));
        ioexception.printStackTrace();
        IOUtils.closeQuietly(((java.io.OutputStream) (obj)));
          goto _L1
        obj;
_L3:
        IOUtils.closeQuietly(abyte0);
        throw obj;
        ioexception;
        abyte0 = ((byte [][]) (obj));
        obj = ioexception;
        if (true) goto _L3; else goto _L2
_L2:
        ioexception;
          goto _L4
        ioexception;
          goto _L5
    }

    public (Context context, String s)
    {
        mContext = context;
        mUpc = s;
    }
}
