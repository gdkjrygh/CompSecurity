// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.FileDescriptor;
import java.util.WeakHashMap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            as, z

public class ad
{

    private static ad b = null;
    private final WeakHashMap a = new WeakHashMap();

    private ad()
    {
    }

    public static ad a()
    {
        com/whatsapp/gallerypicker/ad;
        JVM INSTR monitorenter ;
        ad ad1;
        if (b == null)
        {
            b = new ad();
        }
        ad1 = b;
        com/whatsapp/gallerypicker/ad;
        JVM INSTR monitorexit ;
        return ad1;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(Thread thread, android.graphics.BitmapFactory.Options options)
    {
        this;
        JVM INSTR monitorenter ;
        c(thread).c = options;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    private as c(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        as as2 = (as)a.get(thread);
        as as1;
        as1 = as2;
        if (as2 != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        as1 = new as(null);
        a.put(thread, as1);
        this;
        JVM INSTR monitorexit ;
        return as1;
        thread;
        throw thread;
    }

    public Bitmap a(ContentResolver contentresolver, long l, int i, android.graphics.BitmapFactory.Options options, boolean flag)
    {
        as as1;
        Thread thread;
        thread = Thread.currentThread();
        as1 = c(thread);
        if (!b(thread))
        {
            return null;
        }
        as1;
        JVM INSTR monitorenter ;
        as1.b = true;
        as1;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        contentresolver = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l, thread.getId(), i, options);
        as1;
        JVM INSTR monitorenter ;
        as1.b = false;
        as1.notifyAll();
        as1;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorenter ;
        as1.b = false;
        as1.notifyAll();
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver = android.provider.MediaStore.Video.Thumbnails.getThumbnail(contentresolver, l, i, options);
        as1;
        JVM INSTR monitorenter ;
        as1.b = false;
        as1.notifyAll();
        as1;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            break MISSING_BLOCK_LABEL_198;
        }
        contentresolver = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l, thread.getId(), i, options);
        as1;
        JVM INSTR monitorenter ;
        as1.b = false;
        as1.notifyAll();
        as1;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver = android.provider.MediaStore.Images.Thumbnails.getThumbnail(contentresolver, l, i, options);
        as1;
        JVM INSTR monitorenter ;
        as1.b = false;
        as1.notifyAll();
        as1;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        as1;
        JVM INSTR monitorexit ;
        throw contentresolver;
    }

    public Bitmap a(FileDescriptor filedescriptor, android.graphics.BitmapFactory.Options options)
    {
        Thread thread;
        if (!options.mCancel)
        {
            if (b(thread = Thread.currentThread()))
            {
                a(thread, options);
                filedescriptor = BitmapFactory.decodeFileDescriptor(filedescriptor, null, options);
                d(thread);
                return filedescriptor;
            }
        }
        return null;
    }

    public void a(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        c(thread).a = z.ALLOW;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    public void a(Thread thread, ContentResolver contentresolver)
    {
        this;
        JVM INSTR monitorenter ;
        as as1;
        as1 = c(thread);
        as1.a = z.CANCEL;
        if (as1.c != null)
        {
            as1.c.requestCancelDecode();
        }
        notifyAll();
        as1;
        JVM INSTR monitorenter ;
        if (as1.b && android.os.Build.VERSION.SDK_INT >= 8)
        {
            android.provider.MediaStore.Images.Thumbnails.cancelThumbnailRequest(contentresolver, -1L, thread.getId());
            android.provider.MediaStore.Video.Thumbnails.cancelThumbnailRequest(contentresolver, -1L, thread.getId());
        }
        as1;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        as1;
        JVM INSTR monitorexit ;
        throw thread;
        thread;
        this;
        JVM INSTR monitorexit ;
        throw thread;
    }

    public boolean b(Thread thread)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        thread = (as)a.get(thread);
        if (thread != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        z z1;
        thread = ((as) (thread)).a;
        z1 = z.CANCEL;
        if (thread != z1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        thread;
        throw thread;
    }

    void d(Thread thread)
    {
        this;
        JVM INSTR monitorenter ;
        ((as)a.get(thread)).c = null;
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

}
