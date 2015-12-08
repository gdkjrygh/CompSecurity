// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.zzi;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzu

private static class zzafi
    implements com.google.android.gms.drive.e.DownloadProgressListener
{

    private final zzi zzafi;

    public void onProgress(long l, long l1)
    {
        zzafi.zza(new com.google.android.gms.common.api.zzi.zzb(l, l1) {

            final long zzafj;
            final long zzafk;
            final zzu.zza zzafl;

            public void zza(com.google.android.gms.drive.DriveFile.DownloadProgressListener downloadprogresslistener)
            {
                downloadprogresslistener.onProgress(zzafj, zzafk);
            }

            public void zzmw()
            {
            }

            public void zzn(Object obj)
            {
                zza((com.google.android.gms.drive.DriveFile.DownloadProgressListener)obj);
            }

            
            {
                zzafl = zzu.zza.this;
                zzafj = l;
                zzafk = l1;
                super();
            }
        });
    }

    public _cls1.zzafk(zzi zzi1)
    {
        zzafi = zzi1;
    }
}
