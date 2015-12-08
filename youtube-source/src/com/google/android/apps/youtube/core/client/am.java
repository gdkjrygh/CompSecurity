// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.c.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.datalib.legacy.model.AdPair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            ca, ao, ap, aq, 
//            an

public final class am
    implements ca
{

    private final Context a;
    private final Executor b;
    private final SharedPreferences c;
    private long d;
    private boolean e;
    private AdPair f;
    private final d g = new ao(this);
    private final d h = new ap(this);

    public am(Context context, Executor executor, SharedPreferences sharedpreferences)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = sharedpreferences.getLong("last_ad_expiration_timestamp", 0L);
        e = false;
    }

    static void a(am am1)
    {
        am1.c();
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.b(e);
        f = null;
        com.google.android.apps.youtube.common.fromguava.c.b(e);
        d = 0L;
        c.edit().putLong("last_ad_expiration_timestamp", 0L).apply();
        b.execute(new aq(this));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(am am1)
    {
        am1.b();
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        com.google.android.apps.youtube.common.fromguava.c.b();
        obj = Parcel.obtain();
        byte abyte0[] = d();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        L.c("Error loading data.");
        f = null;
        ((Parcel) (obj)).recycle();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        f = (AdPair)AdPair.CREATOR.createFromParcel(((Parcel) (obj)));
        ((Parcel) (obj)).recycle();
          goto _L3
        obj;
        throw obj;
        Object obj1;
        obj1;
        L.c("Error loading data.");
        f = null;
        ((Parcel) (obj)).recycle();
          goto _L3
        obj1;
        ((Parcel) (obj)).recycle();
        throw obj1;
    }

    static void c(am am1)
    {
        am1.b();
    }

    private byte[] d()
    {
        Object obj = null;
        Object obj1 = a.openFileInput("dtm_store");
        obj = obj1;
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        obj = obj1;
        byte abyte1[] = new byte[1024];
_L2:
        obj = obj1;
        int i = ((InputStream) (obj1)).read(abyte1);
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        bytearrayoutputstream.write(abyte1, 0, i);
        if (true) goto _L2; else goto _L1
        obj1;
        IOException ioexception;
        byte abyte0[];
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception1) { }
        }
        throw obj1;
_L1:
        obj = obj1;
        abyte0 = bytearrayoutputstream.toByteArray();
        if (obj1 != null)
        {
            try
            {
                ((InputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                return abyte0;
            }
        }
        return abyte0;
    }

    protected final void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.b();
        a.deleteFile("dtm_store");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(a a1)
    {
        e = true;
        a1.a(this, com/google/android/apps/youtube/core/identity/ai, g);
        a1.a(this, com/google/android/apps/youtube/core/identity/aj, h);
        b.execute(new an(this));
    }
}
