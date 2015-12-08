// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.internal.zzi;

// Referenced classes of package com.google.android.gms.maps.model:
//            zzo, TileProvider, Tile

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final zzo CREATOR = new zzo();
    private final int mVersionCode;
    private float zzaGZ;
    private zzi zzaHH;
    private TileProvider zzaHI;
    private boolean zzaHJ;
    private boolean zzaHa;

    public TileOverlayOptions()
    {
        zzaHa = true;
        zzaHJ = true;
        mVersionCode = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f, boolean flag1)
    {
        zzaHa = true;
        zzaHJ = true;
        mVersionCode = i;
        zzaHH = com.google.android.gms.maps.model.internal.zzi.zza.zzcX(ibinder);
        if (zzaHH == null)
        {
            ibinder = null;
        } else
        {
            ibinder = new TileProvider() {

                private final zzi zzaHK;
                final TileOverlayOptions zzaHL;

                public Tile getTile(int j, int k, int l)
                {
                    Tile tile;
                    try
                    {
                        tile = zzaHK.getTile(j, k, l);
                    }
                    catch (RemoteException remoteexception)
                    {
                        return null;
                    }
                    return tile;
                }

            
            {
                zzaHL = TileOverlayOptions.this;
                super();
                zzaHK = TileOverlayOptions.zza(zzaHL);
            }
            };
        }
        zzaHI = ibinder;
        zzaHa = flag;
        zzaGZ = f;
        zzaHJ = flag1;
    }

    static zzi zza(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.zzaHH;
    }

    public int describeContents()
    {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean flag)
    {
        zzaHJ = flag;
        return this;
    }

    public boolean getFadeIn()
    {
        return zzaHJ;
    }

    public TileProvider getTileProvider()
    {
        return zzaHI;
    }

    int getVersionCode()
    {
        return mVersionCode;
    }

    public float getZIndex()
    {
        return zzaGZ;
    }

    public boolean isVisible()
    {
        return zzaHa;
    }

    public TileOverlayOptions tileProvider(TileProvider tileprovider)
    {
        zzaHI = tileprovider;
        if (zzaHI == null)
        {
            tileprovider = null;
        } else
        {
            tileprovider = new com.google.android.gms.maps.model.internal.zzi.zza(tileprovider) {

                final TileOverlayOptions zzaHL;
                final TileProvider zzaHM;

                public Tile getTile(int i, int j, int k)
                {
                    return zzaHM.getTile(i, j, k);
                }

            
            {
                zzaHL = TileOverlayOptions.this;
                zzaHM = tileprovider;
                super();
            }
            };
        }
        zzaHH = tileprovider;
        return this;
    }

    public TileOverlayOptions visible(boolean flag)
    {
        zzaHa = flag;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public TileOverlayOptions zIndex(float f)
    {
        zzaGZ = f;
        return this;
    }

    IBinder zzxf()
    {
        return zzaHH.asBinder();
    }

}
