// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzlr;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            LargeParcelTeleporter

class zzEs
    implements Runnable
{

    final OutputStream zzEr;
    final byte zzEs[];
    final LargeParcelTeleporter zzEt;

    public void run()
    {
        DataOutputStream dataoutputstream = new DataOutputStream(zzEr);
        dataoutputstream.writeInt(zzEs.length);
        dataoutputstream.write(zzEs);
        zzlr.zzb(dataoutputstream);
        return;
        Object obj;
        obj;
        zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
        zzp.zzbA().zzc(((Throwable) (obj)), true);
        zzlr.zzb(dataoutputstream);
        return;
        obj;
        zzlr.zzb(dataoutputstream);
        throw obj;
    }

    I(LargeParcelTeleporter largeparcelteleporter, OutputStream outputstream, byte abyte0[])
    {
        zzEt = largeparcelteleporter;
        zzEr = outputstream;
        zzEs = abyte0;
        super();
    }
}
