// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzhy;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzk

public final class LargeParcelTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzzH;
    ParcelFileDescriptor zzzI;
    private Parcelable zzzJ;
    private boolean zzzK;

    LargeParcelTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor)
    {
        zzzH = i;
        zzzI = parcelfiledescriptor;
        zzzJ = null;
        zzzK = true;
    }

    public LargeParcelTeleporter(SafeParcelable safeparcelable)
    {
        zzzH = 1;
        zzzI = null;
        zzzJ = safeparcelable;
        zzzK = false;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Parcel parcel1;
        if (zzzI != null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        parcel1 = Parcel.obtain();
        byte abyte0[];
        zzzJ.writeToParcel(parcel1, 0);
        abyte0 = parcel1.marshall();
        parcel1.recycle();
        zzzI = zzd(abyte0);
        zzk.zza(this, parcel, i);
        return;
        parcel;
        parcel1.recycle();
        throw parcel;
    }

    public SafeParcelable zza(android.os.Parcelable.Creator creator)
    {
        Object obj;
        if (!zzzK)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        if (zzzI == null)
        {
            zzb.zzak("File descriptor is empty, returning null.");
            return null;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzzI));
        byte abyte0[];
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        ((DataInputStream) (obj)).readFully(abyte0, 0, abyte0.length);
        zzhy.zzb(((java.io.Closeable) (obj)));
        obj = Parcel.obtain();
        ((Parcel) (obj)).unmarshall(abyte0, 0, abyte0.length);
        ((Parcel) (obj)).setDataPosition(0);
        zzzJ = (SafeParcelable)creator.createFromParcel(((Parcel) (obj)));
        ((Parcel) (obj)).recycle();
        zzzK = false;
        return (SafeParcelable)zzzJ;
        creator;
        throw new IllegalStateException("Could not read from parcel file descriptor", creator);
        creator;
        zzhy.zzb(((java.io.Closeable) (obj)));
        throw creator;
        creator;
        ((Parcel) (obj)).recycle();
        throw creator;
    }

    protected ParcelFileDescriptor zzd(byte abyte0[])
    {
        ParcelFileDescriptor aparcelfiledescriptor[];
        try
        {
            aparcelfiledescriptor = ParcelFileDescriptor.createPipe();
            (new Thread(new Runnable(new android.os.ParcelFileDescriptor.AutoCloseOutputStream(aparcelfiledescriptor[1]), abyte0) {

                final OutputStream zzzL;
                final byte zzzM[];
                final LargeParcelTeleporter zzzN;

                public void run()
                {
                    DataOutputStream dataoutputstream = new DataOutputStream(zzzL);
                    dataoutputstream.writeInt(zzzM.length);
                    dataoutputstream.write(zzzM);
                    zzhy.zzb(dataoutputstream);
                    return;
                    Object obj;
                    obj;
                    zzb.zzb("Error transporting the ad response", ((Throwable) (obj)));
                    zzh.zzaT().zzc(((Throwable) (obj)), true);
                    zzhy.zzb(dataoutputstream);
                    return;
                    obj;
                    zzhy.zzb(dataoutputstream);
                    throw obj;
                }

            
            {
                zzzN = LargeParcelTeleporter.this;
                zzzL = outputstream;
                zzzM = abyte0;
                super();
            }
            })).start();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            zzb.zzb("Error transporting the ad response", abyte0);
            zzh.zzaT().zzc(abyte0, true);
            return null;
        }
        abyte0 = aparcelfiledescriptor[0];
        return abyte0;
    }

}
