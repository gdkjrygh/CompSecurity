// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.common.data:
//            zza

public class BitmapTeleporter
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    ParcelFileDescriptor zzCZ;
    final int zzSq;
    private Bitmap zzYm;
    private boolean zzYn;
    private File zzYo;

    BitmapTeleporter(int i, ParcelFileDescriptor parcelfiledescriptor, int j)
    {
        zzCY = i;
        zzCZ = parcelfiledescriptor;
        zzSq = j;
        zzYm = null;
        zzYn = false;
    }

    public BitmapTeleporter(Bitmap bitmap)
    {
        zzCY = 1;
        zzCZ = null;
        zzSq = 0;
        zzYm = bitmap;
        zzYn = true;
    }

    private void zza(Closeable closeable)
    {
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            Log.w("BitmapTeleporter", "Could not close stream", closeable);
        }
    }

    private FileOutputStream zznd()
    {
        if (zzYo == null)
        {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        File file;
        FileOutputStream fileoutputstream;
        try
        {
            file = File.createTempFile("teleporter", ".tmp", zzYo);
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException("Could not create temporary file", ioexception);
        }
        try
        {
            fileoutputstream = new FileOutputStream(file);
            zzCZ = ParcelFileDescriptor.open(file, 0x10000000);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new IllegalStateException("Temporary file is somehow already deleted");
        }
        file.delete();
        return fileoutputstream;
    }

    public int describeContents()
    {
        return 0;
    }

    public void release()
    {
        if (zzYn)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        zzCZ.close();
        return;
        IOException ioexception;
        ioexception;
        Log.w("BitmapTeleporter", "Could not close PFD", ioexception);
        return;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Object obj;
        Bitmap bitmap;
        byte abyte0[];
        if (zzCZ != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        bitmap = zzYm;
        obj = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
        bitmap.copyPixelsToBuffer(((java.nio.Buffer) (obj)));
        abyte0 = ((ByteBuffer) (obj)).array();
        obj = new DataOutputStream(zznd());
        ((DataOutputStream) (obj)).writeInt(abyte0.length);
        ((DataOutputStream) (obj)).writeInt(bitmap.getWidth());
        ((DataOutputStream) (obj)).writeInt(bitmap.getHeight());
        ((DataOutputStream) (obj)).writeUTF(bitmap.getConfig().toString());
        ((DataOutputStream) (obj)).write(abyte0);
        zza(((Closeable) (obj)));
        com.google.android.gms.common.data.zza.zza(this, parcel, i | 1);
        zzCZ = null;
        return;
        parcel;
        throw new IllegalStateException("Could not write into unlinked file", parcel);
        parcel;
        zza(((Closeable) (obj)));
        throw parcel;
    }

    public void zzc(File file)
    {
        if (file == null)
        {
            throw new NullPointerException("Cannot set null temp directory");
        } else
        {
            zzYo = file;
            return;
        }
    }

    public Bitmap zznc()
    {
        Object obj;
        if (zzYn)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj = new DataInputStream(new android.os.ParcelFileDescriptor.AutoCloseInputStream(zzCZ));
        Object obj1;
        byte abyte0[];
        int i;
        int j;
        abyte0 = new byte[((DataInputStream) (obj)).readInt()];
        i = ((DataInputStream) (obj)).readInt();
        j = ((DataInputStream) (obj)).readInt();
        obj1 = android.graphics.Bitmap.Config.valueOf(((DataInputStream) (obj)).readUTF());
        ((DataInputStream) (obj)).read(abyte0);
        zza(((Closeable) (obj)));
        obj = ByteBuffer.wrap(abyte0);
        obj1 = Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj1)));
        ((Bitmap) (obj1)).copyPixelsFromBuffer(((java.nio.Buffer) (obj)));
        zzYm = ((Bitmap) (obj1));
        zzYn = true;
        return zzYm;
        Object obj2;
        obj2;
        throw new IllegalStateException("Could not read from parcel file descriptor", ((Throwable) (obj2)));
        obj2;
        zza(((Closeable) (obj)));
        throw obj2;
    }

}
