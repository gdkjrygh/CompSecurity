// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzlr;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzl

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzl();
    final int mVersionCode;
    ParcelFileDescriptor zzEo;
    private Parcelable zzEp;
    private boolean zzEq;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        mVersionCode = i;
        zzEo = parcelfiledescriptor;
        zzEp = null;
        zzEq = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeparcelable)
    {
        mVersionCode = 1;
        zzEo = null;
        zzEp = safeparcelable;
        zzEq = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Parcel parcel1;
        if (zzEo != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        parcel1 = Parcel.obtain();
        byte abyte0[];
        zzEp.writeToParcel(parcel1, 0);
        abyte0 = parcel1.marshall();
        parcel1.recycle();
        zzEo = zzf(abyte0);
        zzl.zza(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

    public SafeParcelable zza(android.os.Parcelable.Creator creator)
    {
        Object obj;
        if (!zzEq)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (zzEo == null)
        {
            zzb.e("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzEo));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        zzlr.zzb(((java.io.Closeable) (obj)));
        obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        zzEp = (SafeParcelable)creator.createFromParcel(((Parcel) (obj)));
        ((Parcel) (obj)).recycle();
        zzEq = false;
        return (SafeParcelable)zzEp;
        creator;
        throw new IllegalStateException("Could not read from parcel file descriptor", creator);
        creator;
        zzlr.zzb(((java.io.Closeable) (obj)));
        throw creator;
        creator;
        ((Parcel) (obj)).recycle();
        throw creator;
    }

    protected ParcelFileDescriptor zzf(byte abyte0[])
    {
        ParcelFileDescriptor aparcelfiledescriptor[];
        try
        {
            aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
            (new Thread(new Runnable(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]), abyte0) {

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

            
            {
                zzEt = LargeParcelTeleporter.this;
                zzEr = outputstream;
                zzEs = abyte0;
                super();
            }
            })).start();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb.zzb("Error transporting the ad response", abyte0);
            zzp.zzbA().zzc(abyte0, true);
            return null;
        }
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
    }

}
